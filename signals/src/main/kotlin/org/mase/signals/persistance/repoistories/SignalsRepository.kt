package org.mase.signals.persistance.repoistories

import org.mase.signals.persistance.model.SignalEntity
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface SignalsRepository: CoroutineCrudRepository<SignalEntity,Long> {

}