package com.example.primerparcial_19523

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.primerparcial_19523.ui.theme.PrimerParcial_19523Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimerParcial_19523Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun tablero(){
    Row(
        modifier= Modifier
            .height(300.dp)
            .width(250.dp)
    ){
        Column(modifier = Modifier.weight(1f)) {
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
                .padding(0.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            ){
                Image(painter = painterResource(id = R.drawable.black_rook),
                    contentDescription = "black rook",
                modifier = Modifier.size(50.dp))
            }
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            )
        }
        Column(modifier = Modifier.weight(1f)) {
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
                .padding(0.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
            ){
                Image(painter = painterResource(id = R.drawable.white_queen),
                    contentDescription = "white king",
                    modifier = Modifier.size(50.dp))
            }
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
            )
        }
        Column(modifier = Modifier.weight(1f)) {
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
                .padding(0.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            ){
                Image(painter = painterResource(id = R.drawable.black_pawn),
                    contentDescription = "black pawn",
                    modifier = Modifier.size(50.dp))
            }
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
            ){
                Image(painter = painterResource(id = R.drawable.white_pawn),
                    contentDescription = "white pawn",
                    modifier = Modifier.size(50.dp))
            }
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            )
        }
        Column(modifier = Modifier.weight(1f)) {
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
                .padding(0.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
            ){
                Image(painter = painterResource(id = R.drawable.black_pawn),
                    contentDescription = "black pawn",
                    modifier = Modifier.size(50.dp))
            }
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            ){
                Image(painter = painterResource(id = R.drawable.white_pawn),
                    contentDescription = "white pawn",
                    modifier = Modifier.size(50.dp))
            }
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
            )
        }
        Column(modifier = Modifier.weight(1f)) {
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
                .padding(0.dp)
            ){
                Image(painter = painterResource(id = R.drawable.black_king),
                    contentDescription = "black king",
                    modifier = Modifier.size(50.dp))
            }
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            ){
                Image(painter = painterResource(id = R.drawable.black_pawn),
                    contentDescription = "black pawn",
                    modifier = Modifier.size(50.dp))
            }
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            )
            Box(modifier = Modifier
                .background(Color(0xFF69B00B))
                .size(50.dp)
            ){
                Image(painter = painterResource(id = R.drawable.white_pawn),
                    contentDescription = "white pawn",
                    modifier = Modifier.size(50.dp))
            }
            Box(modifier = Modifier
                .background(Color(0xFFFFE4C4))
                .size(50.dp)
            ){
                Image(painter = painterResource(id = R.drawable.whie_king),
                    contentDescription = "white king",
                    modifier = Modifier.size(50.dp))
            }
        }
    }


}


@Preview(showBackground = true)
@Composable
fun app(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF4A4E48))){

        Box(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.TopCenter)
            .padding(8.dp)){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                tablero()
            }
        }


        Box(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.Center)
            .padding(8.dp)){

            Text(modifier = Modifier.align(Alignment.Center), color =Color.White, text = "Anatholy Karpov vs Gary Kasparov")
            Text(modifier= Modifier.align(Alignment.Center), color =Color.White, text = "Rudis 1993")

            Row(
                modifier= Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){

                Button(modifier = Modifier
                    .height(50.dp)
                    .padding(5.dp),
                    onClick = {
                },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF89EBC3),
                        contentColor = Color(0xFF2F4637)
                    )
                ) {
                    Text(text = "Juegan Blancas")
                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(modifier = Modifier
                    .height(50.dp)
                    .padding(5.dp),
                    onClick = {
                },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF89EBC3),
                        contentColor = Color(0xFF2F4637)
                    )
                ) {
                    Text(text = "Juegan Negras")
                }
            }}

        Box(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.BottomCenter)
            .padding(8.dp)){
            Row(
                modifier= Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){

                Button(modifier = Modifier.fillMaxWidth(), onClick = {
                },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF89EBC3),
                        contentColor = Color(0xFF2F4637)
                    )
                ) {
                    Text(text = "Reiniciar")
                }
            }


    }


}}