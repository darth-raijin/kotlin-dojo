package macowlab.sensei.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController
class Stock {

    @GetMapping("/name/{name}")
    fun name(@PathVariable name: String, model: Model): String {
        // Receives name as method param and validates input
        var parsed_name = ""
        val first_character = name.first()

        // Validates if name starts with uppercase
        if (first_character.isUpperCase()) {
            return "Hello $parsed_name!"
        }

        // Handling for non-uppercase first char
        parsed_name = name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        print("yessorr $parsed_name")
        return "HeLLO $parsed_name, your name wasn't uppercase!"
    }

    }
