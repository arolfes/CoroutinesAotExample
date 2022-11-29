package info.novatec.coroutines

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CoroutinesAotExampleApplication

fun main(args: Array<String>) {
	runApplication<CoroutinesAotExampleApplication>(*args)
}
