package com.luckycounter.drinkwater.ui;

import U0.a;
import U0.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import i1.f;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class PercentRingView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2500a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f2501b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f2502c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public long f2503e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2504f;

    /* renamed from: g, reason: collision with root package name */
    public final a f2505g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PercentRingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        f.e(context, "context");
        this.f2500a = new ArrayList();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        paint.setColor(-60269);
        this.f2501b = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(-16711681);
        paint2.setTextSize(48.0f);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setFakeBoldText(true);
        this.f2502c = paint2;
        this.d = "";
        this.f2505g = new a(this, 1);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.f2504f = false;
        Choreographer.getInstance().removeFrameCallback(this.f2505g);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        f.e(canvas, "canvas");
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        Iterator it = this.f2500a.iterator();
        f.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            f.d(next, "next(...)");
            b bVar = (b) next;
            Paint paint = this.f2501b;
            paint.setAlpha(bVar.f1225c);
            canvas.drawCircle(width, height, bVar.f1223a, paint);
        }
        if (System.currentTimeMillis() >= this.f2503e || this.d.length() <= 0) {
            return;
        }
        canvas.drawText(this.d, width, height - (getHeight() * 0.35f), this.f2502c);
    }
}
