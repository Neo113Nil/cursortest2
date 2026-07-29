package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.LinearLayout;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes.dex */
public final class E2 extends LinearLayout {
    public final RectF a;
    public final Path b;
    public final float[] c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2(Activity context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = new RectF();
        this.b = new Path();
        this.c = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        setWillNotDraw(false);
        if (a()) {
            setLayerType(2, null);
        } else {
            setLayerType(0, null);
        }
    }

    public final void a(float f, float f2, float f3, float f4) {
        float[] fArr = {RangesKt.coerceAtLeast(f, 0.0f), RangesKt.coerceAtLeast(f2, 0.0f), RangesKt.coerceAtLeast(f3, 0.0f), RangesKt.coerceAtLeast(f4, 0.0f)};
        if (Arrays.equals(this.c, fArr)) {
            return;
        }
        float[] fArr2 = this.c;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = fArr[3];
        if (a()) {
            setLayerType(2, null);
        } else {
            setLayerType(0, null);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!a()) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        a(canvas);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!a()) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        a(canvas);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public final boolean a() {
        for (float f : this.c) {
            if (f > 0.0f) {
                return true;
            }
        }
        return false;
    }

    public final void a(Canvas canvas) {
        char c;
        char c2;
        float[] fArr;
        float f;
        float f2;
        if (a()) {
            float width = getWidth();
            float height = getHeight();
            if (width > 0.0f && height > 0.0f) {
                float[] fArr2 = this.c;
                float f3 = fArr2[0];
                float f4 = fArr2[1];
                float f5 = fArr2[2];
                float f6 = fArr2[3];
                float f7 = f3 + f4;
                float f8 = (f7 <= width || f7 <= 0.0f) ? 1.0f : width / f7;
                float f9 = f5 + f6;
                float f10 = (f9 <= width || f9 <= 0.0f) ? 1.0f : width / f9;
                float f11 = f3 + f5;
                if (f11 <= height || f11 <= 0.0f) {
                    c = 3;
                    f = 1.0f;
                } else {
                    float f12 = height / f11;
                    c = 3;
                    f = f12;
                }
                float f13 = f4 + f6;
                if (f13 <= height || f13 <= 0.0f) {
                    c2 = 2;
                    f2 = 1.0f;
                } else {
                    float f14 = height / f13;
                    c2 = 2;
                    f2 = f14;
                }
                float min = Math.min(Math.min(f8, f10), Math.min(f, f2));
                if (min < 1.0f) {
                    f3 *= min;
                    f4 *= min;
                    f5 *= min;
                    f6 *= min;
                }
                fArr = new float[4];
                fArr[0] = f3;
                fArr[1] = f4;
                fArr[c2] = f5;
                fArr[c] = f6;
            } else {
                c = 3;
                c2 = 2;
                fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
            }
            this.a.set(0.0f, 0.0f, width, height);
            this.b.reset();
            Path path = this.b;
            RectF rectF = this.a;
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr[c];
            float f18 = fArr[c2];
            float[] fArr3 = new float[8];
            fArr3[0] = f15;
            fArr3[1] = f15;
            fArr3[c2] = f16;
            fArr3[c] = f16;
            fArr3[4] = f17;
            fArr3[5] = f17;
            fArr3[6] = f18;
            fArr3[7] = f18;
            path.addRoundRect(rectF, fArr3, Path.Direction.CW);
            canvas.clipPath(this.b);
        }
    }
}
