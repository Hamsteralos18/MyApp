package com.example.miprimeraaplicacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miprimeraaplicacion.ui.theme.MiPrimeraAplicacionTheme

//lo que haya aqui se muestra al ususario
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiPrimeraAplicacionTheme {
                    }


        }
    }
}
//Cambio hola

//Lo puedes obdervar desde Android Studio
//Modifier para propiedades de la pantalla (tamaño)
//@nombre varibe, weight: stilo, bold:propiedad

@Composable
fun CertificatingCourse(nombre: String, modifier: Modifier=Modifier){

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp), //para imagen, sangria

       verticalArrangement = Arrangement.Center,
        //horizontalAlignment = Alignment.CenterHorizontally, es una forma
    ) {
        Box(
            contentAlignment = Alignment.Center
        ) {


            Image(
                painter = painterResource(id = R.drawable.android_logo), contentDescription = "",
                modifier = modifier.fillMaxWidth(), alpha = 0.2F
            )
            Text(
                text = "$nombre",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier.fillMaxWidth()

            )
        }
        Spacer(modifier = modifier.height(10.dp)) //Se separa del box
        Text(text = "Has successfully completed a 2 hours course on")

    }
}




//sobrecargando no pasa nada
@Composable
@Preview(showBackground = true) //por default false, convertir true

fun CertificatingCourse(){

    CertificatingCourse(nombre = "Alejandro Eduardo Ocaranza Acosta")

}