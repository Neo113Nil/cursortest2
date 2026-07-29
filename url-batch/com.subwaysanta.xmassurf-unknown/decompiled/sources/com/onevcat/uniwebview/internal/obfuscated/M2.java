package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes.dex */
public final class M2 extends View {
    public static final /* synthetic */ int m = 0;
    public L2 a;
    public float[] b;
    public float c;
    public float d;
    public int e;
    public int f;
    public float g;
    public float h;
    public float i;
    public final Paint j;
    public final Path k;
    public final RectF l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M2(Activity context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = L2.g;
        this.b = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.h = 1.0f;
        this.i = 1.0f;
        this.j = new Paint(1);
        this.k = new Path();
        this.l = new RectF();
        setLayerType(1, null);
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
    }

    public final void a(View targetView, int i, int i2) {
        M2 m2;
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        this.c = targetView.getX();
        this.d = targetView.getY();
        this.e = targetView.getWidth() > 0 ? targetView.getWidth() : i;
        this.f = targetView.getHeight() > 0 ? targetView.getHeight() : i2;
        this.g = targetView.getRotation();
        this.h = targetView.getScaleX();
        this.i = targetView.getScaleY();
        C0058o c0058o = C0058o.b;
        StringBuilder sb = new StringBuilder("ShadowDrawable.syncWithTarget: target=[x=");
        sb.append(this.c).append(", y=").append(this.d).append(", w=").append(this.e).append(", h=").append(this.f).append(", rotation=").append(this.g).append(", scale=(").append(this.h).append(", ").append(this.i).append(")], actual view size=[").append(targetView.getWidth()).append(", ").append(targetView.getHeight()).append("], fallback=[w=").append(i).append(", h=").append(i2).append(']');
        String message = sb.toString();
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        EnumC0054n enumC0054n = EnumC0054n.INFO;
        c0058o.a(enumC0054n, message);
        setRotation(this.g);
        setScaleX(this.h);
        setScaleY(this.i);
        if (this.e <= 0 || this.f <= 0) {
            m2 = this;
            Intrinsics.checkNotNullParameter("ShadowDrawable.updateLayoutForShadow: target size is zero, skipping", "message");
            c0058o.a(enumC0054n, "ShadowDrawable.updateLayoutForShadow: target size is zero, skipping");
        } else {
            L2 l2 = this.a;
            if (l2.a()) {
                float coerceAtLeast = RangesKt.coerceAtLeast(l2.e, 0.0f);
                float coerceAtLeast2 = RangesKt.coerceAtLeast(l2.a, 0.0f);
                float f = l2.c;
                float f2 = l2.d;
                float f3 = coerceAtLeast + coerceAtLeast2;
                float max = Math.max(0.0f, -f) + f3;
                float max2 = Math.max(0.0f, f) + f3;
                float max3 = Math.max(0.0f, -f2) + f3;
                float max4 = Math.max(0.0f, f2) + f3;
                setX(this.c - max);
                setY(this.d - max3);
                int i3 = (int) (this.e + max + max2);
                int i4 = (int) (this.f + max3 + max4);
                StringBuilder sb2 = new StringBuilder("ShadowDrawable.updateLayoutForShadow: shadow style=[radius=");
                sb2.append(coerceAtLeast2).append(", opacity=").append(l2.b).append(", offset=(").append(f).append(", ").append(f2).append("), spread=").append(coerceAtLeast).append("], extra=[L=").append(max).append(", R=").append(max2).append(", T=").append(max3).append(", B=").append(max4).append("], final=[x=").append(getX()).append(", y=").append(getY()).append(", w=");
                sb2.append(i3).append(", h=").append(i4).append(']');
                String message2 = sb2.toString();
                Intrinsics.checkNotNullParameter(message2, "message");
                c0058o.a(enumC0054n, message2);
                m2 = this;
                m2.setLayoutParams(new FrameLayout.LayoutParams(i3, i4));
                m2.requestLayout();
            } else {
                setX(this.c);
                setY(this.d);
                setLayoutParams(new FrameLayout.LayoutParams(this.e, this.f));
                String message3 = "ShadowDrawable.updateLayoutForShadow: shadow not visible, matching target position=[x=" + getX() + ", y=" + getY() + ", w=" + this.e + ", h=" + this.f + ']';
                Intrinsics.checkNotNullParameter(message3, "message");
                c0058o.a(enumC0054n, message3);
                m2 = this;
            }
        }
        m2.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        C0058o c0058o = C0058o.b;
        String message = "ShadowDrawable.onDraw: view=[x=" + getX() + ", y=" + getY() + ", w=" + getWidth() + ", h=" + getHeight() + "], target=[x=" + this.c + ", y=" + this.d + ", w=" + this.e + ", h=" + this.f + ']';
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        EnumC0054n enumC0054n = EnumC0054n.INFO;
        c0058o.a(enumC0054n, message);
        if (this.e <= 0 || this.f <= 0) {
            Intrinsics.checkNotNullParameter("ShadowDrawable.onDraw: target size is zero, skipping draw", "message");
            c0058o.a(enumC0054n, "ShadowDrawable.onDraw: target size is zero, skipping draw");
            return;
        }
        L2 l2 = this.a;
        if (!l2.a()) {
            Intrinsics.checkNotNullParameter("ShadowDrawable.onDraw: shadow not visible, skipping draw", "message");
            c0058o.a(enumC0054n, "ShadowDrawable.onDraw: shadow not visible, skipping draw");
            return;
        }
        String message2 = "ShadowDrawable.onDraw: drawing shadow with style=[radius=" + l2.a + ", opacity=" + l2.b + ", offset=(" + l2.c + ", " + l2.d + "), spread=" + l2.e + ']';
        Intrinsics.checkNotNullParameter(message2, "message");
        c0058o.a(enumC0054n, message2);
        int argb = Color.argb((int) (RangesKt.coerceIn((Color.alpha(l2.f) / 255.0f) * l2.b, 0.0f, 1.0f) * 255.0f), Color.red(l2.f), Color.green(l2.f), Color.blue(l2.f));
        this.j.setColor(argb);
        this.j.setStyle(Paint.Style.FILL);
        this.j.setShadowLayer(RangesKt.coerceAtLeast(l2.a, 0.0f), l2.c, l2.d, argb);
        float coerceAtLeast = RangesKt.coerceAtLeast(l2.e, 0.0f);
        float coerceAtLeast2 = RangesKt.coerceAtLeast(l2.a, 0.0f);
        float f = l2.c;
        float f2 = l2.d;
        float f3 = coerceAtLeast2 + coerceAtLeast;
        float max = (Math.max(0.0f, -f) + f3) - coerceAtLeast;
        float max2 = (Math.max(0.0f, -f2) + f3) - coerceAtLeast;
        float f4 = 2 * coerceAtLeast;
        this.l.set(max, max2, this.e + max + f4, this.f + max2 + f4);
        this.k.reset();
        float[] fArr = this.b;
        int length = fArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                this.k.addRect(this.l, Path.Direction.CW);
                break;
            }
            if (fArr[i] > 0.0f) {
                float[] fArr2 = this.b;
                float f5 = fArr2[0] + coerceAtLeast;
                float f6 = fArr2[1] + coerceAtLeast;
                float f7 = fArr2[3] + coerceAtLeast;
                float f8 = fArr2[2] + coerceAtLeast;
                this.k.addRoundRect(this.l, new float[]{f5, f5, f6, f6, f7, f7, f8, f8}, Path.Direction.CW);
                break;
            }
            i++;
        }
        canvas.drawPath(this.k, this.j);
    }

    public final void setShadowStyle(L2 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        if (Intrinsics.areEqual(this.a, style)) {
            return;
        }
        this.a = style;
        setVisibility(style.a() ? 0 : 8);
        invalidate();
    }
}
