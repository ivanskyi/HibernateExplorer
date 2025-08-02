# Hibernate Explorer

## PostgreSQL Setup with Docker

To install a Docker container running PostgreSQL, execute the following command:

```bash
docker run --name postgresql \
  -e POSTGRES_USER=admin \
  -e POSTGRES_PASSWORD=admin \
  -p 54322:5432 \
  -d postgres:latest
```
