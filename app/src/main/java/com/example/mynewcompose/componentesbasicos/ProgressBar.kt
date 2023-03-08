package com.example.mynewcompose.componentesbasicos

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/*
    Progress Bar: Elemento que nos permite por ejemplo mostrar un circulo esperando a que nos llegue la información de una petición a Internet,
    tenemos distintos tipos, como CircularProgressIndicator que es la más común y le tendremos que pasar un progeress que será un estado y también
    tenemos la LinearProgressIndicator que es una línea recta que cumple la más función que la circular, en el ejemplo avanzado he creado
    dos botones que uno hace que vaya avanzando el progress bar y otro va retrocediendo
 */
@Composable
fun MyProgressAdvance() {
    var progressStatus by rememberSaveable { mutableStateOf(0f) }
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(progress = progressStatus)

        Row(
            Modifier
                .fillMaxWidth()
                .padding(end = 8.dp), horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = {
                if (progressStatus >= 1f) {

                } else {
                    progressStatus += 0.1f
                }
            }) {
                Text(text = "Incrementar")
            }

            Button(onClick = {
                if (progressStatus <= 0.1f) {

                } else {
                    progressStatus -= 0.1f
                }
            }) {
                Text(text = "Reducir")
            }
        }
    }
}

@Composable
fun MyProgressBar() {
    var showLoading by rememberSaveable { mutableStateOf(false) }
    Column(
        Modifier
            .padding(24.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (showLoading) {
            CircularProgressIndicator(color = Color.Red, strokeWidth = 10.dp)
            LinearProgressIndicator(
                modifier = Modifier.padding(top = 32.dp),
                color = Color.Red,
                backgroundColor = Color.Gray
            )
        }
        Button(onClick = { showLoading = !showLoading }) {
            Text(text = "Cargar perfil")
        }

    }
}