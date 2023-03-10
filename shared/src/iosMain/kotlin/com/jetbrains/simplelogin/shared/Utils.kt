package com.jetbrains.simplelogin.shared

import platform.Foundation.NSUUID


/**
 * Created by Jacee.
 * Date: 2023.03.10
 */

actual fun randomUUID(): String = NSUUID().UUIDString()

/**
 * 所以说，expect 相当于声明了期望，即接口定义；actual 就是实际的平台实现
 */