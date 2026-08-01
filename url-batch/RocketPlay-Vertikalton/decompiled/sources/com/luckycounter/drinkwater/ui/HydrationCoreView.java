package com.luckycounter.drinkwater.ui;

import S0.g;
import S0.n;
import U0.a;
import W0.k;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c1.AbstractC0104b;
import i1.f;
import java.util.List;

/* loaded from: classes.dex */
public final class HydrationCoreView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f2491a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f2492b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f2493c;
    public final Path d;

    /* renamed from: e, reason: collision with root package name */
    public final Path f2494e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f2495f;

    /* renamed from: g, reason: collision with root package name */
    public float f2496g;
    public float h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public float f2497j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2498k;

    /* renamed from: l, reason: collision with root package name */
    public final a f2499l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HydrationCoreView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        f.e(context, "context");
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(6.0f);
        paint.setColor(-38476);
        this.f2491a = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(14.0f);
        paint2.setColor(1727992979);
        this.f2492b = paint2;
        this.f2493c = new Paint(1);
        this.d = new Path();
        this.f2494e = new Path();
        this.f2495f = new RectF();
        this.f2499l = new a(this, 0);
    }

    public final void a(int i, int i2, int i3) {
        this.i = AbstractC0104b.h(i3, 0, k.r0(g.f1080a));
        float f2 = RecyclerView.f1949A0;
        if (i2 > 0) {
            float f3 = i / i2;
            if (f3 >= RecyclerView.f1949A0) {
                f2 = 1.0f;
                if (f3 <= 1.0f) {
                    f2 = f3;
                }
            }
        }
        this.h = f2;
        if (this.f2498k) {
            return;
        }
        this.f2496g = f2;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2498k = true;
        Choreographer.getInstance().postFrameCallback(this.f2499l);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.f2498k = false;
        Choreographer.getInstance().removeFrameCallback(this.f2499l);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        f.e(canvas, "canvas");
        float width = getWidth();
        float height = getHeight();
        if (width <= RecyclerView.f1949A0 || height <= RecyclerView.f1949A0) {
            return;
        }
        float f2 = 0.45f * width;
        float f3 = 0.75f * height;
        float f4 = (width - f2) / 2.0f;
        float f5 = (height - f3) / 2.0f;
        float f6 = f2 / 2.0f;
        Path path = this.d;
        path.reset();
        Path path2 = this.f2494e;
        path2.reset();
        float f7 = f2 + f4;
        float f8 = f5 + f3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(f4, f5, f7, f8, f6, f6, direction);
        canvas.drawPath(path, this.f2492b);
        canvas.drawPath(path, this.f2491a);
        float f9 = this.f2496g;
        if (f9 > 0.01f) {
            float f10 = ((1.0f - f9) * f3) + f5;
            RectF rectF = this.f2495f;
            rectF.set(f4 + 4.0f, f10, f7 - 4.0f, f8 - 4.0f);
            float f11 = f6 - 4.0f;
            path2.addRoundRect(rectF, f11, f11, direction);
            List list = g.f1080a;
            n nVar = (n) g.f1080a.get(this.i);
            float sin = ((float) Math.sin(this.f2497j)) * 8.0f;
            Paint paint = this.f2493c;
            paint.setShader(new LinearGradient(f4, f10 + sin, f7, f8, nVar.f1096f, (float[]) null, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.clipPath(path);
            canvas.drawPath(path2, paint);
            canvas.restore();
            paint.setShader(null);
        }
    }
}
