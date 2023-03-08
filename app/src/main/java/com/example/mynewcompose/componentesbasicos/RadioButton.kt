package com.example.mynewcompose.componentesbasicos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

/*
    RadioButton: Elemento que nos permite seleccionar un solo item en un listado, el primer ejemplo solo teneemos un elementos, pero en el segundo
    ya tenemos más y para saber el elemento seleccionado utilizamos una función lambda que habrá que pasarte un string, cuando tengamos que llamarlo
    crearemos un estado y en ese estado almacenaremos el mensaje que nos da esta función lambda
 */
@Composable
fun MyRadioButton() {
    Row(Modifier.fillMaxWidth()) {
        RadioButton(
            selected = false, onClick = {

            }, colors = RadioButtonDefaults.colors(
                selectedColor = Color.Red,
                unselectedColor = Color.Yellow,
                disabledColor = Color.Green
            ), enabled = false
        )
        Text(text = "Ejemplo 1")
    }

}

@Composable
fun MyRadioButtonList(name: String, onItemSelected: (String) -> Unit) {

    Column(Modifier.fillMaxWidth()) {
        Row( verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name == "Juan", onClick = { onItemSelected("Juan") })
            Text(text = "Juan")
        }
        Row( verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name == "David", onClick = { onItemSelected("David") })
            Text(text = "David")
        }
        Row( verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name == "Fulanito", onClick = { onItemSelected("Fulanito") })
            Text(text = "Fulanito")
        }
        Row( verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name == "Pepe", onClick = { onItemSelected("Pepe") })
            Text(text = "Pepe")
        }
    }

}