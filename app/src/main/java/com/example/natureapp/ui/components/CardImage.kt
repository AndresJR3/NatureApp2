package com.example.natureapp.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.natureapp.R

@Composable
fun CardImage(image : String, tittle: String, description: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .placeholder(R.drawable.img)
                    .data(image)
                    .build(),
                contentDescription = "CardImage",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = tittle,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
            )
            Text(
                text = description,
                fontSize = 16.sp,
            )

    }
}

@Preview
@Composable
fun CardImagePreview(){
    CardImage(
        image = "https://idegrafico.com/wp-content/uploads/2017/03/Las-imagenes-raw-son-los-negativos-digitales.jpg",
        tittle = "Montañas Rocosas",
        description = "Una cordillera impresionante que se extiende a lo largo de América del norte"

    )
}