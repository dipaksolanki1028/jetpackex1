package com.demo

import android.content.Context
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.bumptech.glide.Glide
import com.demo.ui.theme.Demo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}


@Composable()
fun listItem(imgId:Int, name: String , occupation:String)
{
    val customColor = Color(0xFFfccc7d)
    Card (
        Modifier.padding(5.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row (
            Modifier
                .background(customColor)
                .padding(10.dp)
        ) {

            Image(painterResource(id = imgId), contentDescription = "contact",
                Modifier
                    .size(40.dp)
                    .weight(0.2f)
            )
            Column (Modifier.weight(0.7f)){
                Text(text = name,
                    fontWeight = FontWeight.Bold,
                )
                Text(text = occupation,
                    fontWeight = FontWeight.Thin
                )
                TextField(value = "", onValueChange = {})

            }
        }
    }

}

@Composable
fun textInput()
{

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun previewFunction()
{

     LazyColumn(content = {
         items(getUserList()){
             val imgId = R.drawable.abc
             listItem(imgId, name = it.name, occupation = it.occupation)
         }
     })



}

data class UserDetail(val name:String,val occupation: String)

fun getUserList():MutableList<UserDetail>
{
    val list  = mutableListOf<UserDetail>()
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    list.add(UserDetail("deepak solanki","software developer"))
    list.add(UserDetail("nirav solanki","marketing engineer"))
    list.add(UserDetail("hardik solanki","hair styler"))
    return list

}





