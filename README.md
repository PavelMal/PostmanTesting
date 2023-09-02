# PostmanTesting
It's an app for QA to practise AI postman testing. [Post on hackernoon](https://hackernoon.com/supercharge-your-api-testing-with-postmans-ai-powered-assistant)

First of all you need to pull a repository and run a command docker-compose up to run an application. \
**Be aware that an application is running on 8080 port, so that port should be available to use**

To check if everything is ok with a server you need to make a request and get 200 OK response status code:
http://localhost:8080/api/check

The swagger is available by `swagger-ui.html` endpoint
http://localhost:8080/swagger-ui.html

an example of POST `/api/order/create` method: 
***
    curl --location 'http://localhost:8080/api/order/create' \
    --header 'Content-Type: application/json' \
    --data '{
        "name": "test",
        "price": 1
    }'
***

an example of response:
***
    {
        "id": 1
    }
***
