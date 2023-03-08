package com.example.mynewcompose.componentesbasicos

import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

/*
    Switch: Elemento que puede tener dos valores encendido o apagado, en el onCheckedChange le indicamos que cuando se cambie que cambie el estado,
    para que si estaba encendido ahora se ponga en false, y lo inicializamos como activado, además tenemos muchos atributos para cambiar colores
    cuando por ejemplo esta desabilitado, o cuando esta habilitado pero no esta seleccionado, ahí muchas opciones así...
 */
@Composable
fun MySwitch() {
    var status by rememberSaveable { mutableStateOf(true) }

    Switch(
        checked = status,
        onCheckedChange = { status = !status },
        enabled = false,
        colors = SwitchDefaults.colors(
            uncheckedThumbColor = Color.Red,
            uncheckedTrackColor = Color.Magenta,
            checkedThumbColor = Color.Green,
            checkedTrackColor = Color.Cyan,
            checkedTrackAlpha = 0.1f,
            uncheckedTrackAlpha = 0.1f,
            disabledCheckedTrackColor = Color.Yellow,
            disabledCheckedThumbColor = Color.Yellow,
            disabledUncheckedThumbColor = Color.Yellow,
            disabledUncheckedTrackColor = Color.Yellow
        )
    )
}