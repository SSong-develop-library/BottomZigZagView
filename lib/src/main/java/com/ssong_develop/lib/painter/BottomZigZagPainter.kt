package com.ssong_develop.lib.painter

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path
import com.ssong_develop.lib.type.PathType
import com.ssong_develop.lib.extension.drawCircularBottomZigZag
import com.ssong_develop.lib.extension.drawLinearBottomZigZag
import com.ssong_develop.lib.extension.drawSquareBottomZigZag

class BottomZigZagPainter(
    private val pathType: PathType,
    private val size: Size,
    private val waveCount: Int
) : BottomZigZagPathPainter {
    override fun drawZigZagBottomPath(): Path {
        val path = Path()
        when (pathType) {
            PathType.CIRCULAR -> path.drawCircularBottomZigZag(waveCount, size)
            PathType.LINEAR -> path.drawLinearBottomZigZag(waveCount, size)
            PathType.SQUARE -> path.drawSquareBottomZigZag(waveCount, size)
        }
        return path
    }
}