package com.luckycounter.drinkwater.ui;

import U0.a;
import U0.c;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c1.AbstractC0104b;
import i1.f;
import java.util.ArrayList;
import java.util.Iterator;
import k1.AbstractC0220d;
import k1.C0219c;

/* loaded from: classes.dex */
public final class StarrySkyView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2506a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f2507b;

    /* renamed from: c, reason: collision with root package name */
    public long f2508c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final a f2509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarrySkyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        f.e(context, "context");
        this.f2506a = new ArrayList();
        this.f2507b = new Paint(1);
        this.f2509e = new a(this, 2);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        Choreographer.getInstance().postFrameCallback(this.f2509e);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.d = false;
        Choreographer.getInstance().removeFrameCallback(this.f2509e);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        f.e(canvas, "canvas");
        canvas.drawColor(-16777216);
        float f2 = this.f2508c / 1.0E9f;
        Iterator it = this.f2506a.iterator();
        f.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            f.d(next, "next(...)");
            c cVar = (c) next;
            float f3 = cVar.d * f2;
            float f4 = cVar.f1229e;
            int sin = (int) ((((((float) Math.sin(f3 + f4)) + 1.0f) / 2.0f) * 180.0f) + 75.0f);
            Paint paint = this.f2507b;
            paint.setColor(cVar.f1230f);
            paint.setAlpha(AbstractC0104b.h(sin, 40, 255));
            float sin2 = (((float) Math.sin((0.1f * f2) + f4)) * 4.0f) + cVar.f1226a;
            float cos = (((float) Math.cos((0.08f * f2) + f4)) * 3.0f) + cVar.f1227b;
            if (sin2 < RecyclerView.f1949A0) {
                sin2 += getWidth();
            }
            if (sin2 > getWidth()) {
                sin2 -= getWidth();
            }
            if (cos < RecyclerView.f1949A0) {
                cos += getHeight();
            }
            if (cos > getHeight()) {
                cos -= getHeight();
            }
            canvas.drawCircle(sin2, cos, cVar.f1228c, paint);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        ArrayList arrayList = this.f2506a;
        if (arrayList.isEmpty()) {
            int[] iArr = {-983041, -16711681, -60269, -4259585};
            for (int i5 = 0; i5 < 80; i5++) {
                C0219c c0219c = AbstractC0220d.f3279a;
                arrayList.add(new c(c0219c.a() * i, c0219c.a() * i2, (c0219c.a() * 2.5f) + 0.5f, (c0219c.a() * 0.3f) + 0.05f, 6.28f * c0219c.a(), iArr[AbstractC0220d.f3280b.a().nextInt(4)]));
            }
        }
    }
}
