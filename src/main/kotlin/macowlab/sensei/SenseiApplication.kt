package macowlab.sensei

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SenseiApplication

fun main(args: Array<String>) {
	// KOTLIN REST-API to practice :)
	runApplication<SenseiApplication>(*args)
}
