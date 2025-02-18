package org.mase.signals

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SignalsApplication

fun main(args: Array<String>) {
	runApplication<SignalsApplication>(*args)
}
