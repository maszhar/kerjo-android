package com.maszhar.kerjo.domain

import java.util.Date

class Task(
    val taskId: String,
    val name: String,
    val deadline: Date? = null,
    val status: WorkingStatus = WorkingStatus.UNDONE
)