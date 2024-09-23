package com.example.kotlinfundementals

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlinfundementals.ui.theme.KotlinFundementalsTheme

/*fun main() {
    val brunoSong = Song("We Don't Talk About Bruno", "Encanto Cast", 2022, 1_000_000)
    brunoSong.printDescription()

    println(brunoSong.isPopular)
}


class Song(
    val title: String,
    val artist: String,
    val yPub: Int,
    val playCount: Int
){
    val isPopular: Boolean
        get() = playCount >= 1000



    fun printDescription() {
        println("$title, performed by $artist, was released in $yPub.")
    }
}
*/

