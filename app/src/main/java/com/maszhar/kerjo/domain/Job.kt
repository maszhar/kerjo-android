package com.maszhar.kerjo.domain

import java.util.Date

data class Job(
    val jobId: String,
    val name: String,
    val deadline: Date? = null,
    val status: WorkingStatus = WorkingStatus.UNDONE
)