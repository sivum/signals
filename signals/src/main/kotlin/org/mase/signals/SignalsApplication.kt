package org.mase.signals

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration
import org.springframework.boot.runApplication


//@SpringBootApplication(exclude=[R2dbcAutoConfiguration::class])
@SpringBootApplication
class SignalsApplication

fun main(args: Array<String>) {
	runApplication<SignalsApplication>(*args)
}
