package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes6.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {
    private float cornerRadius;
    private Path path;

    public ClippableRoundedCornerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.path == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }
}
