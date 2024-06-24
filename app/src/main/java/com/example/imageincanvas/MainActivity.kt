package com.example.imageincanvas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import com.example.imageincanvas.ui.theme.ImageInCanvasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImageInCanvasTheme {
                val mine = ImageBitmap.imageResource(R.drawable.mine)
                Canvas(modifier = Modifier.fillMaxSize()) {

                    drawImage(
                        image = mine,
                        dstOffset = IntOffset(100,100),
                        dstSize = IntSize(
                            (400* (mine.width.toFloat() / mine.height)).toInt(),
                            400
                        ),

                    )
                    drawCircle(
                        color = Color.Red,
                        radius = 200f,
                        center = Offset(
                            x = 300f,
                            y=300f
                        ),
                        blendMode = BlendMode.Color
                    )
                }
            }
        }
    }
}
