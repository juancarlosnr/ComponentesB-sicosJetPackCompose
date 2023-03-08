package com.example.mynewcompose.componentesbasicos

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ImageSearch
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mynewcompose.R

/*
    Imagenes: Para crear una imagen simple le ponemos el atributo painterResource y le pasamos la id, además le pasaremos una descripción que va
    a ser útil en un futuro por si queremos acceder a esa foto, si la queremos circular le ponemos el modifier.clip y luego circleshape que ya
    viene por defecto y nos genera una imagen redondeada, además le podemos poner un borde y en el borde le pasaremos el shape para que así el
    borde se dibuje bien en la pantalla

    Iconos: Para crear un icono utilizamos la propiedad icon y tenemos una biblioteca que nos añadirá muchos mas iconos de los que vienen por defecto,
    le añadiremos también una descripcion y con tint podemos pintarlos de un color
 */
@Composable
fun MyIcon() {
    Icon(
        imageVector = Icons.Outlined.ImageSearch, contentDescription = "icono", tint = Color.Red
    )
}

@Composable
fun MyImageAdvance() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "ejemplo",
        modifier = Modifier
            .clip(CircleShape)
            .border(5.dp, Color.Red, CircleShape)
    )
}

@Composable
fun MyImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "ejemplo",
        alpha = 0.5f
    )
}