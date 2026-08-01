package com.luckycounter.drinkwater.ui;

import U0.a;
import U0.d;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import h1.InterfaceC0173a;
import i1.f;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class TargetCrashView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2510a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f2511b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f2512c;
    public final Paint d;

    /* renamed from: e, reason: collision with root package name */
    public float f2513e;

    /* renamed from: f, reason: collision with root package name */
    public int f2514f;

    /* renamed from: g, reason: collision with root package name */
    public float f2515g;
    public boolean h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0173a f2516j;

    /* renamed from: k, reason: collision with root package name */
    public final a f2517k;

    /* renamed from: l, reason: collision with root package name */
    public String f2518l;

    /* renamed from: m, reason: collision with root package name */
    public String f2519m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetCrashView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        f.e(context, "context");
        this.f2510a = new ArrayList();
        this.f2511b = new Paint(1);
        Paint paint = new Paint(1);
        paint.setColor(-60269);
        paint.setTextSize(72.0f);
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint.setFakeBoldText(true);
        this.f2512c = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(-16711681);
        paint2.setTextSize(28.0f);
        paint2.setTextAlign(align);
        this.d = paint2;
        this.f2513e = 1.0f;
        this.f2514f = 1;
        this.f2517k = new a(this, 3);
        this.f2518l = "";
        this.f2519m = "";
    }

    public final InterfaceC0173a getOnAnimationEnd() {
        return this.f2516j;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.h = false;
        Choreographer.getInstance().removeFrameCallback(this.f2517k);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        f.e(canvas, "canvas");
        canvas.drawColor(-16777216);
        canvas.save();
        canvas.translate(this.f2515g, RecyclerView.f1949A0);
        Iterator it = this.f2510a.iterator();
        f.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            f.d(next, "next(...)");
            d dVar = (d) next;
            Paint paint = this.f2511b;
            paint.setColor(dVar.f1234e);
            canvas.drawCircle(dVar.f1231a, dVar.f1232b, dVar.f1235f, paint);
        }
        canvas.save();
        float f2 = this.f2513e;
        canvas.scale(f2, f2, getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.drawText(this.f2518l, getWidth() / 2.0f, (getHeight() / 2.0f) - 40.0f, this.f2512c);
        canvas.drawText(this.f2519m, getWidth() / 2.0f, (getHeight() / 2.0f) + 20.0f, this.d);
        canvas.restore();
        canvas.restore();
    }

    public final void setOnAnimationEnd(InterfaceC0173a interfaceC0173a) {
        this.f2516j = interfaceC0173a;
    }
}
