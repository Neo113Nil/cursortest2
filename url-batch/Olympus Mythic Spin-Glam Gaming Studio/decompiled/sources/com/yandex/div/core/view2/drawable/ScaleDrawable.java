package com.yandex.div.core.view2.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ScaleDrawable.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0012\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\b\u0010\u001a\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/core/view2/drawable/ScaleDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "child", "scale", "", "(Landroid/graphics/drawable/Drawable;F)V", "scaleX", "scaleY", "(Landroid/graphics/drawable/Drawable;FF)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getIntrinsicHeight", "", "getIntrinsicWidth", "getOpacity", "isRunning", "", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "start", "stop", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScaleDrawable extends Drawable implements Animatable {

    @NotNull
    private final Drawable child;
    private final float scaleX;
    private final float scaleY;

    public ScaleDrawable(@NotNull Drawable drawable, float f, float f2) {
        this.child = drawable;
        this.scaleX = f;
        this.scaleY = f2;
    }

    public ScaleDrawable(@NotNull Drawable drawable, float f) {
        this(drawable, f, f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.child.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.child.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        int save = canvas.save();
        try {
            canvas.scale(this.scaleX, this.scaleY);
            this.child.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.child.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.child.getIntrinsicWidth() == -1) {
            return -1;
        }
        return MathKt.roundToInt(this.child.getIntrinsicWidth() * this.scaleX);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.child.getIntrinsicHeight() == -1) {
            return -1;
        }
        return MathKt.roundToInt(this.child.getIntrinsicHeight() * this.scaleY);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.child;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object obj = this.child;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Object obj = this.child;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }
}
