package com.example;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

import javax.validation.constraints.NotBlank;

@Controller("/api/tests")
    public class TestController {

    @Get
    public HttpResponse<String> getAll() {
        return HttpResponse.ok("getAll");
    }

    @Get("/{id}")
    public HttpResponse<String> getUserProfile(@NotBlank @PathVariable("id") long id) {
        return HttpResponse.ok("getUserProfile");
    }
}
