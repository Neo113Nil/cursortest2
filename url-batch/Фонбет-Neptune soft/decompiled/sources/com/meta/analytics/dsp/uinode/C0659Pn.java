package com.meta.analytics.dsp.uinode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Pn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0659Pn extends RelativeLayout {
    public final Paint A00;
    public final RectF A01;

    public C0659Pn(C0889Yn c0889Yn, String str) {
        super(c0889Yn);
        float f = c0889Yn.getResources().getDisplayMetrics().density;
        TextView textView = new TextView(c0889Yn);
        textView.setTextColor(-16777216);
        textView.setTextSize(16.0f);
        textView.setText(str);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        setGravity(17);
        float density = 6.0f * f;
        int i = (int) density;
        textView.setPadding(i, i, i, i);
        addView(textView);
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.A01 = new RectF();
        AbstractC0556Lo.A0M(this, 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.A01.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(this.A01, f * 10.0f, 10.0f * f, this.A00);
        super.onDraw(canvas);
    }
}
