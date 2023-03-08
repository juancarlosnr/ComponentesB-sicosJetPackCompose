package com.example.mynewcompose.componentesbasicos

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/*
    Card: Elemento que es como una carta que podemos utilizar en los recycler view para cada uno de los elementos, y las propiedades más comunes
    son border para ponerles un borde y shape para que la forma por ejemplo de la carta sea más ciruclar
 */
@Composable
fun MyCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = 12.dp,
        shape = MaterialTheme.shapes.small,
        backgroundColor = Color.Red,
        contentColor = Color.LightGray,
        border = BorderStroke(5.dp, Color.Green)
    ) {
        Column(Modifier.padding(16.dp)) {
            Text(text = "Ejemplo 1")
            Text(text = "Ejemplo 2")
            Text(text = "Ejemplo 3")
        }
    }
}