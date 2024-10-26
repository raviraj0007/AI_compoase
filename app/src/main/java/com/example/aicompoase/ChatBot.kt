package com.example.aicompoase

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aicompoase.componentes.ChatHeader

@Composable
fun ChatBot() {
    Column {
        ChatHeader()
    }
    
}

@Preview(showBackground = true)
@Composable
fun ChatBotPreview() {
    ChatBot()
}