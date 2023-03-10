package com.jetbrains.simplelogin.shared

import java.util.UUID

/**
 * Created by Jacee.
 * Date: 2023.03.10
 */

actual fun randomUUID(): String = UUID.randomUUID().toString()