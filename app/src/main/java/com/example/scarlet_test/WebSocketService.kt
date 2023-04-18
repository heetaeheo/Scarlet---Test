package com.example.scarlet_test

import kotlinx.coroutines.flow.Flow

interface WebSocketService {

    fun send(message: String)

    fun observeMessages(): Flow<String>
}