package org.mase.signals.incoming.api.rest.dto

data class SignalRequest(
    val requestId: String,
    val level: String,
    val noiseRatio :Double
)
