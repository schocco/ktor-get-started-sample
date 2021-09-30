package com.example.plugins

import com.example.TimeInfo
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/timeinfo") {
            call.respond(TimeInfo())
        }
    }
}
