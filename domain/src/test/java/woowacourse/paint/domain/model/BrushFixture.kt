package woowacourse.paint.domain.model

object BrushFixture {
    fun getBrush(
        brushColor: BrushColor = BrushColor.RED,
        brushWidth: BrushWidth = BrushWidth(30f),
        brushType: BrushType = BrushType.PEN,
    ) = Brush(color = brushColor, width = brushWidth, type = brushType)
}
