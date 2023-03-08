package com.example.mynewcompose.componentesbasicos

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/*
    Botones: Necesitaremos crear un estado para así activarlo o desactivarlo cuando queramos, tenemos distintos tipos, primero el botón normal,
    luego OutlinedButton que se le añade un borde y podemos personalizar todos los colores de ese boton y por último tenemos el TextButton que
    funciona igual que todos los demás y dentro le hemos metido en un texto
    Si pulsamos los dos primeros botones se nos desactivarán, ya que ponemos el estado en false y luego la propiedad enabled coge ese estado
 */

@Composable
fun MyButtonExample() {
    var enabled by rememberSaveable { mutableStateOf(true) }
    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Button(
            onClick = { enabled = false },
            enabled = enabled,
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Magenta,
                contentColor = Color.Blue
            ), border = BorderStroke(5.dp, Color.Gray)
        ) {
            Text(text = "Pulsa")
        }
        OutlinedButton(
            onClick = { enabled = false },
            enabled = enabled,
            modifier = Modifier.padding(top = 8.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Magenta,
                contentColor = Color.Blue,
                disabledBackgroundColor = Color.Blue,
                disabledContentColor = Color.Gray
            )
        ) {
            Text(text = "Hola")
        }
        TextButton(onClick = {}) {
            Text(text = "Hola")
        }
    }
}