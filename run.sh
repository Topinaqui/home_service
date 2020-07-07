#!/bin/bash
docker image build -t home-service .
docker container run -p 9000:9000 home-service
