package com.example

import kotlinx.serialization.Serializable
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

@Serializable
class TimeInfo {

    private var epoch: Long
    private var formatted: String

    constructor() {
        val dateTime: LocalDateTime = LocalDateTime.now()
        this.formatted = dateTime.format(DateTimeFormatter.ISO_DATE_TIME)
        this.epoch = dateTime.toEpochSecond(ZoneOffset.UTC)
    }
}
