package com.example.mynewcompose.componentesbasicos

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Badge
import androidx.compose.material.BadgedBox
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/*
    BadgeBox: Es como una especie de Icono con encima un texto o lo que le queramos poner, en este caso es el icono de una estrella y arriba
    a la izquierda he puesto el texto 10, si pones 100 en la preview no saldrá bien, pero en el emulador si, además que hay que tener cuidado
    con el padding por que si no pones lo suficiente es posible que no se vea bien
 */
@Composable
fun MyBadgeBox() {
    BadgedBox(
        modifier = Modifier.padding(28.dp),
        badge = {
            Badge(
                content = {
                    Text(modifier = Modifier.padding(2.dp), text = "10")
                },
                backgroundColor = Color.Black,
                contentColor = Color.White,
                modifier = Modifier.padding(2.dp)
            )
        },
    ) {
        Icon(
            modifier = Modifier.size(50.dp),
            imageVector = Icons.Default.Star,
            contentDescription = "l",
            tint = Color.Blue
        )
    }

}