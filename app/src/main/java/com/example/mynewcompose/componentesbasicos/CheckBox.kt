package com.example.mynewcompose.componentesbasicos

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Text
import androidx.compose.material.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp

/*
    CheckBox: Elemento que nos permite marcar por ejemplo si una tarea esta complicada, el tristatuscheck, tiene tres estados on, que aparece
    marcado con un tick, indetirminate que aparece con una línea en medio y off que no sale nada, luego podemos hacer checkbox añadiendole
    un texto y en oncheckedchange le pasamos el contrario para cuando seleccionamos una opción se ponga justo el contrario del que tenemos
    seleccionado. Al final tengo un método que nos permite a partir de un listado de strings crear un listado de CheckInfo, para luego si
    queremos utilizar ese listado lo podemos recorrer con un foreach y llamar a la funcion mycheckboxwithtextcompleted
 */
@Composable
fun MyTriStatusCheckBox() {
    var status by rememberSaveable { mutableStateOf(ToggleableState.Off) }
    TriStateCheckbox(state = status, onClick = {
        status = when (status) {
            ToggleableState.On -> { ToggleableState.Off }
            ToggleableState.Off -> ToggleableState.Indeterminate
            ToggleableState.Indeterminate -> ToggleableState.On
        }
    })
}

@Composable
fun MyCheckBoxWithTextCompleted(checkInfo: CheckInfo) {
    Row(Modifier.padding(4.dp), verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = checkInfo.selected,
            onCheckedChange = { checkInfo.onCheckedChange(!checkInfo.selected) })
        Spacer(modifier = Modifier.width(2.dp))
        Text(text = checkInfo.title)
    }
}

@Composable
fun MyCheckBoxWithText() {
    var status by rememberSaveable { mutableStateOf(false) }
    Row(Modifier.padding(4.dp), verticalAlignment = Alignment.CenterVertically) {
        Checkbox(checked = status, onCheckedChange = { status = !status })
        Spacer(modifier = Modifier.width(2.dp))
        Text(text = "Ejemplo 1")
    }
}

@Composable
fun MyCheckBox() {
    var status by rememberSaveable { mutableStateOf(false) }
    Checkbox(
        checked = status,
        onCheckedChange = { status = !status },
        enabled = true,
        colors = CheckboxDefaults.colors(
            checkedColor = Color.Red,
            uncheckedColor = Color.Yellow,
            checkmarkColor = Color.Gray
        )
    )
}

@Composable
fun getOptions(titles: List<String>): List<CheckInfo> {
    return titles.map {
        var status by rememberSaveable { mutableStateOf(false) }
        CheckInfo(
            title = it,
            selected = status,
            onCheckedChange = { status = it }
        )
    }

}