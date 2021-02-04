#!/usr/bin/bash

docker run --rm --name pg-filter-jm \
-e POSTGRES_PASSWORD=docker \
-d -p 5432:5432 \
postgres

sleep 2

docker cp postgres_setup.sql pg-filter-jm:/

sleep 2

docker exec -it pg-filter-jm psql -U postgres --file postgres_setup.sql