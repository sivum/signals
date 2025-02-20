package org.mase.signals.application.handlers

import kotlinx.coroutines.delay
import org.slf4j.LoggerFactory
import org.mase.signals.application.model.ProcessResponse
import org.mase.signals.application.model.ProcessSignal
import org.mase.signals.persistance.model.SignalEntity
import org.mase.signals.persistance.repoistories.SignalsRepository
import org.springframework.stereotype.Service

@Service
class SignalHandler(
    private val signalsRepository: SignalsRepository
) {

    companion object {
        private val LOG = LoggerFactory.getLogger(this::class.java)
    }

    suspend fun handle(request: ProcessSignal):ProcessResponse {
        LOG.info("handling signal {}", request)
        signalsRepository.save(SignalEntity(
            level = request.level,
            noiseRatio =request.noiseRatio
        ))
        LOG.info("finished handling signal {}", request)
        return ProcessResponse()
    }
}