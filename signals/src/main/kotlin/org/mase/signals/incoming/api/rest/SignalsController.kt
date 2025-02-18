package org.mase.signals.incoming.api.rest

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.mase.signals.incoming.api.rest.dto.SignalRequest
import org.mase.signals.incoming.api.rest.dto.SignalResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class SignalsController {

    companion object {
        private val Logger = LoggerFactory.getLogger(this::class.java)
    }

    @PostMapping(path = ["/api/signals"])
     suspend fun create(@RequestBody requestDto: SignalRequest): ResponseEntity<SignalResponse> {
        Logger.info("Signal in {}",requestDto)
        return  ResponseEntity.status(HttpStatus.OK.value()).body(
            SignalResponse(correlationId = UUID.randomUUID().toString())
        )
    }
}