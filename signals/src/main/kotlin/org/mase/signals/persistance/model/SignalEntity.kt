package org.mase.signals.persistance.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table


@Table("Signals")
data class SignalEntity (
    @Id
    val id: Long? = null,
    val level: String,
    @Column("noise")
    val noiseRatio: Double
)