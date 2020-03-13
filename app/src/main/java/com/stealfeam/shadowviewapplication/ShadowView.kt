package com.stealfeam.shadowviewapplication

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.RoundRectShape
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView

class ShadowView : AppCompatImageView {

    val shapeDrawable = ShapeDrawable().apply {
        paint.color = Color.BLACK
        paint.style = Paint.Style.FILL
        paint.isAntiAlias = true
        // shadow colorR
        paint.setShadowLayer(80f, 0f, 0f, Color.GRAY)
        shape = RoundRectShape(null, RectF(0f, 0f, width * 1.0f, height * 1.0f), null)
    }

    constructor(context: Context?) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, -1)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        setImageDrawable(ColorDrawable(Color.WHITE))
    }

    override fun onDraw(canvas: Canvas?) {
        background = shapeDrawable
        super.onDraw(canvas)
    }
}
