package com.mahi.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahi.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
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
fun Display(){
    Column(
        modifier = Modifier
            .padding(16.dp)
            .background(color = Color(R.color.white))
            .fillMaxSize()
            .border(16.dp,Color.White)
    ) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            PhotoDisplay(
                img = R.drawable.headphone,
                name = stringResource(id = R.string.headphone),
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .weight(1f)
                    .padding(8.dp)
                    .border(8.dp,Color.White),
                background =  colorResource(id = R.color.light_green)
            )
            PhotoDisplay(
                img = R.drawable.airpods,
                name = stringResource(id = R.string.air_pods),
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp)
                    .border(8.dp,Color.White),
                background =  colorResource(id = R.color.dark_green)
            )
        }
        Row(
            modifier = Modifier.weight(1f)
        ){
            PhotoDisplay(
                img = R.drawable.power_bank,
                name = stringResource(id = R.string.power_bank),
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp)
                    .border(8.dp,Color.White),
                background =  colorResource(id = R.color.dark_green)
            )
            PhotoDisplay(
                img = R.drawable.mouse,
                name = stringResource(id = R.string.mouse),
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp)
                    .border(8.dp,Color.White),
                background =  colorResource(id = R.color.light_green)
            )
        }
    }
}

@Composable
fun PhotoDisplay(img : Int , name: String,modifier: Modifier,background : Color){
   val image= painterResource(id = img)
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(color = background)
                .clip(CircleShape),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = name,
                fontWeight = Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(4.dp)
            )
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp),
                contentScale = ContentScale.Fit
            )
        }
    }



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Display()
    }
}