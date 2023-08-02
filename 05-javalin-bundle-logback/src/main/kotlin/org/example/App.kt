package org.example

import io.javalin.Javalin
import org.slf4j.LoggerFactory

class App {

    private val logger by lazy { LoggerFactory.getLogger(App::class.java) }

    val server: Javalin = Javalin.create(/*config*/).get("/") { ctx ->
        logger.info("Hello {}!", "World!")
        ctx.result("Hello World")
    }
}

fun main() {
    val app = App()
    app.server.start(7070)
}
