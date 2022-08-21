package com.ssong_develop.lib.painter

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path
import com.ssong_develop.lib.type.ZigZagType
import com.ssong_develop.lib.extension.drawCircularBottomZigZag
import com.ssong_develop.lib.extension.drawLinearBottomZigZag
import com.ssong_develop.lib.extension.drawSquareBottomZigZag

class BottomZigZagPainter(
    private val zigZagType: ZigZagType,
    private val size: Size,
    private val waveCount: Int
) : BottomZigZagPathPainter {
    override fun drawBottomZigZagPath(): Path {
        val path = Path()
        when (zigZagType) {
            ZigZagType.CIRCULAR -> path.drawCircularBottomZigZag(waveCount, size)
            ZigZagType.LINEAR -> path.drawLinearBottomZigZag(waveCount, size)
            ZigZagType.SQUARE -> path.drawSquareBottomZigZag(waveCount, size)
        }
        return path
    }
}