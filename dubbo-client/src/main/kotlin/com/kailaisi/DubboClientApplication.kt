package com.kailaisi

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
@EnableDubboConfig
class DubboClientApplication{
}

fun main(args: Array<String>) {
    runApplication<DubboClientApplication>(*args)
}
