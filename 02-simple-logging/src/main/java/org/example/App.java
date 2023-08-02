package org.example;

import io.javalin.Javalin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        var app = Javalin.create(/*config*/)
                .get("/", ctx -> {
                    ctx.result("Hello World");
                    LOG.info("Hello, {}!", "world!");
                })
                .start(7070);
    }
}
