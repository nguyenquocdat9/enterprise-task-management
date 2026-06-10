# Database Design

## Tables

## users

| Column | Type | Note |
|---|---|---|
| id | BIGINT | Primary key |
| email | VARCHAR(255) | Unique |
| password | VARCHAR(255) | Hashed password |
| full_name | VARCHAR(255) | User full name |
| role | VARCHAR(50) | ADMIN, MANAGER, MEMBER |
| created_at | TIMESTAMP | Created time |
| updated_at | TIMESTAMP | Updated time |

## workspaces

| Column | Type | Note |
|---|---|---|
| id | BIGINT | Primary key |
| name | VARCHAR(255) | Workspace name |
| description | TEXT | Workspace description |
| owner_id | BIGINT | FK to users.id |
| created_at | TIMESTAMP | Created time |
| updated_at | TIMESTAMP | Updated time |

## projects

| Column | Type | Note |
|---|---|---|
| id | BIGINT | Primary key |
| name | VARCHAR(255) | Project name |
| description | TEXT | Project description |
| workspace_id | BIGINT | FK to workspaces.id |
| created_at | TIMESTAMP | Created time |
| updated_at | TIMESTAMP | Updated time |

## tasks

| Column | Type | Note |
|---|---|---|
| id | BIGINT | Primary key |
| title | VARCHAR(255) | Task title |
| description | TEXT | Task description |
| status | VARCHAR(50) | TODO, IN_PROGRESS, DONE |
| priority | VARCHAR(50) | LOW, MEDIUM, HIGH |
| project_id | BIGINT | FK to projects.id |
| assignee_id | BIGINT | FK to users.id |
| created_by | BIGINT | FK to users.id |
| created_at | TIMESTAMP | Created time |
| updated_at | TIMESTAMP | Updated time |

## comments

| Column | Type | Note |
|---|---|---|
| id | BIGINT | Primary key |
| content | TEXT | Comment content |
| task_id | BIGINT | FK to tasks.id |
| author_id | BIGINT | FK to users.id |
| created_at | TIMESTAMP | Created time |
| updated_at | TIMESTAMP | Updated time |

## Relationships

```text
users 1---N workspaces
users 1---N tasks
users 1---N comments

workspaces 1---N projects

projects 1---N tasks

tasks 1---N comments