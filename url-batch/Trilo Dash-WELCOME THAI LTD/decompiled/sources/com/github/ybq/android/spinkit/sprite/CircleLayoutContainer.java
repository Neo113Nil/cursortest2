package com.github.ybq.android.spinkit.sprite;

import android.graphics.Canvas;
import android.graphics.Rect;

/* loaded from: classes.dex */
public abstract class CircleLayoutContainer extends SpriteContainer {
    @Override // com.github.ybq.android.spinkit.sprite.SpriteContainer
    public void drawChild(Canvas canvas) {
        for (int i = 0; i < getChildCount(); i++) {
            Sprite childAt = getChildAt(i);
            int save = canvas.save();
            canvas.rotate((i * 360) / getChildCount(), getBounds().centerX(), getBounds().centerY());
            childAt.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // com.github.ybq.android.spinkit.sprite.SpriteContainer, com.github.ybq.android.spinkit.sprite.Sprite, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect clipSquare = clipSquare(rect);
        double width = clipSquare.width();
        Double.isNaN(width);
        double childCount = getChildCount();
        Double.isNaN(childCount);
        int i = (int) (((width * 3.141592653589793d) / 3.5999999046325684d) / childCount);
        int centerX = clipSquare.centerX() - i;
        int centerX2 = clipSquare.centerX() + i;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).setDrawBounds(centerX, clipSquare.top, centerX2, clipSquare.top + (i * 2));
        }
    }
}
