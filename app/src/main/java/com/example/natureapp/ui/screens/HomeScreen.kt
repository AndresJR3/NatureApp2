package com.example.natureapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.natureapp.ui.theme.NatureAppTheme
import java.security.KeyStore.TrustedCertificateEntry
import com.example.natureapp.R
import com.example.natureapp.ui.components.CardImage

data class Nature (val image : String, val title: String, val description : String)

@Composable
fun HomeScreen(innerPadding:PaddingValues){
    val nature = listOf(
        Nature("https://idegrafico.com/wp-content/uploads/2017/03/Las-imagenes-raw-son-los-negativos-digitales.jpg",
            "Monñas Rocosas",
            "Una cordillera impresionante que se extiende a lo largo de Suiza."),
        Nature("https://upload.wikimedia.org/wikipedia/commons/3/3e/Miamimetroarea.jpg",
            "Mexican Beach",
            "Una enorme playa repleta de arena blanca, lo ideal para gozar con tu familia"),
        Nature("https://cdn1.matadornetwork.com/blogs/2/2019/02/The-Taj-Mahal.jpg",
            "Taj Mahal",
            "Una de las siete maravillas del mundo, ideal para ir a tomarte fotos"),
        Nature("https://go.universitariosmag.com/upload/media/posts/2023-10/25/las-7-maravillas-del-mundo-un-viaje-por-la-historia-antigua_1698278901-b.jpg",
            "Pirámides de Guiza",
            "Más de otra maravilla del mundo, las pirámides de guiza en egipto."),
        Nature("https://www.clubceaviajes.com/images/blog/23/muralla-china.jpg",
            "Muralla China",
            "Una gran muralla que recorre gran parte de china, algunos mitos dicen que es posible verla desde el espacio, ¿tu que crees?"
        )

    )
    Box(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
    ){
        Column(
            modifier = Modifier.padding(20.dp)
        ){
            Text(
                text = stringResource(id = R.string.titulo),
                fontWeight = FontWeight.Bold,
                fontSize =26.sp
            )
            LazyColumn {
                items(nature) { item ->
                    CardImage(
                        image = item.image,
                        tittle = item.title,
                        description = item.description
                    )
                }
            }
        }

    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun HomeScreenPreview(){
    NatureAppTheme  {
        HomeScreen(innerPadding = PaddingValues(0.dp))
    }
}
