package io.github.igordonxiao

import io.github.igordonxiao.dao.UserRepository
import io.github.igordonxiao.model.User
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.orm.jpa.EntityScan
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class IgordonxiaoApplication {
    val log = LoggerFactory.getLogger(IgordonxiaoApplication::class.java)

    @Bean
    open fun test (userRepository: UserRepository) : CommandLineRunner {
        return CommandLineRunner {
            log.info("start to find: ")
            val user = userRepository.findOne(1);
            println(user.id)
            println(user.name)
            log.info("start to save: ")
            userRepository.save(User(name = "gordonxiao"))
        }
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(IgordonxiaoApplication::class.java, *args)
}
