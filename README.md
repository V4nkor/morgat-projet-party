# morgat-projet-party

## Description

A vueJS frontend and Java Spring boot backend for a solo Evaluation project in the "Backend Optimisation" Course at Sup de Vinci.
You can find the instructions for the project at `docs/projet-party-instructions.pdf`.
The very badly made and approximative MCD for the database can be found at `docs/mcd2.png`.
The frontend is a WIP and was a secondary concern in this project, since the backend was the more important part (and the frontend is optional).

## Project setup

### Simple setup

You can run the following command to start the project in one single command inside of the root folder:

```bash
docker-compose up
```

If you wish to manually start the project, you can follow the instructions below.

You can either send the commands manually or use the pnpm scripts provided in the `package.json` file in the root folder.

### Backend

Make sure to have a docker container running with a PostgreSQL database and maybe a pgAdmin container for easier database management.
You can run the following command to start a PostgreSQL container:

```bash
docker pull postgres
docker run --name apirestprojetparty -e POSTGRES_PASSWORD=password -e POSTGRES_USER=username -p 5432:5432 -d postgres
```

For the pgAdmin container, you can run the following command:

```bash
docker pull dpage/pgadmin4
docker run --name pgadmin-container -p 5050:80 -e PGADMIN_DEFAULT_EMAIL=person@example.com -e PGADMIN_DEFAULT_PASSWORD=password -d dpage/pgadmin4
```

In order to get the IP adress of the PostgreSQL container, you can run the following command:

```bash
docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' apirestprojetparty
```

After that, you can access the pgAdmin container by going to `http://localhost:5050` and login with the credentials you set up earlier.
You can then add a new server by right-clicking on the "Servers" tab and selecting "Create" -> "Server".
Then, create a new database by right-clicking on the server you just created and selecting "Create" -> "Database".

Make sure to get the login credentials for the database and update accordingly the `application.properties` file in the `backend/src/main/resources` folder. You must also set the name of the database you created on pgAdmin in the `application.properties` file as well.

After that, make sure the `mvnw` or `mvnw.cmd` file is set as an executable and then run the backend by running the following command:

If on Linux or MacOS:

```bash
chmod u+x mvnw
./backend/mvnw spring-boot:run
```

If on Windows:

```bash
./backend/mvnw.cmd spring-boot:run
```

Another option is to run the backend by using the pnpm script provided in the `package.json` file in the root folder:

```bash
pnpm backend launch
```

You can then access the API by going to `http://localhost:8080`.

You will also have access to the Swagger documentation by going to `http://localhost:8080/swagger-ui.html`.

### Frontend

Make sure you have pnpm installed on your machine for the frontend. If not, you can install it by running `npm install -g pnpm`.

After that, you can run the frontend by running the following command:

```bash
pnpm frontend launch
```