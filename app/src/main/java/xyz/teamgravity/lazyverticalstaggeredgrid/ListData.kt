package xyz.teamgravity.lazyverticalstaggeredgrid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.random.Random

object ListData {
    val value = (1..100).map {
        ListModel(
            height = Random.nextInt(100, 300).dp,
            color = Color(Random.nextLong(0xFFFFFFFF)).copy(alpha = 1F)
        )
    }
}