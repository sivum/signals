package org.mase.signals.application.model

data class ProcessSignal(
    val requestId: String,
    val level: String,
    val noiseRatio :Double
)
