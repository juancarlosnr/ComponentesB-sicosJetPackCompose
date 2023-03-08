package com.example.mynewcompose.componentesbasicos
//Data class para utilizar los CheckBox
data class CheckInfo(
    val title: String,
    var selected: Boolean = false,
    var onCheckedChange: (Boolean) -> Unit
)