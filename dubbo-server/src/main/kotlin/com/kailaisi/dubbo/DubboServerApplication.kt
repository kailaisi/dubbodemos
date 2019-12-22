package com.kailaisi.dubbo

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication
@EnableDubbo
class DubboServerApplication{
}

fun main(args: Array<String>) {
        SpringApplicationBuilder(DubboServerApplication::class.java)
                .web(WebApplicationType.NONE)
                .run(*args)
}
