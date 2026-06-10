# API Design

Base URL:

```text
/api/v1
```

# Auth API

Register
```text
POST /api/v1/auth/register
```

Request:

```text
{
  "email": "user@example.com",
  "password": "123456",
  "fullName": "Nguyen Van A"
}
```

Response:

```text
{
  "id": 1,
  "email": "user@example.com",
  "fullName": "Nguyen Van A"
}
```

Login
```text
POST /api/v1/auth/login
```

Request:

```text
{
  "email": "user@example.com",
  "password": "123456"
}
```

Response:

```text
{
  "accessToken": "jwt-token",
  "tokenType": "Bearer"
}
```

# Workspace API

```text
GET /api/v1/projects
POST /api/v1/projects
GET /api/v1/projects/{id}
PUT /api/v1/projects/{id}
DELETE /api/v1/projects/{id}
```

# Project API

```text
GET /api/v1/projects
POST /api/v1/projects
GET /api/v1/projects/{id}
PUT /api/v1/projects/{id}
DELETE /api/v1/projects/{id}
```

# Task API

```text
GET /api/v1/tasks
POST /api/v1/tasks
GET /api/v1/tasks/{id}
PUT /api/v1/tasks/{id}
DELETE /api/v1/tasks/{id}
PATCH /api/v1/tasks/{id}/status
```

Example create task request:

```text
{
  "title": "Design database",
  "description": "Create ERD for task management system",
  "priority": "HIGH",
  "projectId": 1,
  "assigneeId": 2
}
```

# Comment API

```text
GET /api/v1/tasks/{taskId}/comments
POST /api/v1/tasks/{taskId}/comments
DELETE /api/v1/comments/{id}
```