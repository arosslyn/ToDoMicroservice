package com.spring.microservice.ToDoMicroservice.Utilities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class JsonResponseBody {
    @Getter @Setter
    private int server; // makers the server http response code

    @Getter @Setter
    private Object response; // most general object that exists in java, it can map to anything
}

//http response is going to be a java object with this json response object ResponseEntity<JsonResponseBody>
//our response object will have a header(the JWT) and JSON message body (the JSON responseBody).  The jackson library
// will create the json body.

//body -> html page or a JsonMessage(JsonResponseBody(int server, Object response)