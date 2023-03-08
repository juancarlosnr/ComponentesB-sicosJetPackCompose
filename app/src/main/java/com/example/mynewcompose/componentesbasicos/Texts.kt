package com.example.mynewcompose.componentesbasicos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/*
    Textos: Es uno de los elementos más usados y podemos usar diferentes, el primero es Text es un texto normal, luego tenemos TextField que
    nos permite introducir texto por teclado, luego he hecho un ejemplo con un TextField más avanzado, que si introduces la letra a no la
    introduce ya que la reemplaza por la a, la etiqueta label nos sirve para ponerle una información del usuario de lo que tiene que ahcer
    en ese TextField. Por último tenemos el OutlinedTextField que es parecido al TexctField, pero por ejemplo el label se va a subir arriba
    cuando escribamos algo y va a pertenecer al marco del textField
 */
@Composable
fun MyTextFieldOutlined() {
    var myText by remember { mutableStateOf("Juan") }
    OutlinedTextField(
        value = myText,
        onValueChange = { myText = it },
        modifier = Modifier.padding(24.dp),
        label = { Text(text = "Holita") },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Magenta, unfocusedBorderColor = Color.Blue
        )
    )
}

@Composable
fun MyTextFieldAdvance(name: String, onValueChanged: (String) -> Unit) {

    TextField(value = name, onValueChange = {
        onValueChanged(
            if (it.contains("a")) {
                it.replace("a", "")
            } else {
                it
            }
        )
    }, label = { Text(text = "Introduce tu nombre") })
}

@Composable
fun MyTextField(name: String, onValueChanged: (String) -> Unit) {

    TextField(value = name, onValueChange = { onValueChanged(it) })
}

@Composable
fun MyText() {
    Column(Modifier.fillMaxSize()) {
        Text(text = "Esto es un ejemplo")
        Text(text = "Esto es un ejemplo", color = Color.Blue)
        Text(text = "Esto es un ejemplo", fontWeight = FontWeight.ExtraBold)
        Text(text = "Esto es un ejemplo", fontWeight = FontWeight.Light)
        Text(text = "Esto es un ejemplo", fontFamily = FontFamily.Cursive)
        Text(
            text = "Esto es un ejemplo", textDecoration = TextDecoration.LineThrough
        )
        Text(
            text = "Esto es un ejemplo", textDecoration = TextDecoration.Underline
        )
        Text(
            text = "Esto es un ejemplo", textDecoration = TextDecoration.combine(
                listOf(TextDecoration.LineThrough, TextDecoration.Underline)
            )
        )
        Text(text = "Esto es un ejemplo", fontSize = 30.sp)
    }

}