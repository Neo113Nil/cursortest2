package com.meta.analytics.dsp.uinode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.facebook.ads.redexgen.X.a8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0933a8 implements InterfaceC00982i {
    public final /* synthetic */ C0932a7 A00;

    public C0933a8(C0932a7 c0932a7) {
        this.A00 = c0932a7;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00982i
    public final void A5E(Canvas canvas, RectF rectF, float f, Paint paint) {
        float f2 = f * 2.0f;
        float width = (rectF.width() - f2) - 1.0f;
        float height = (rectF.height() - f2) - 1.0f;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        if (f >= 1.0f) {
            float f3 = f + 0.5f;
            this.A00.A00.set(-f3, -f3, f3, f3);
            int save = canvas2.save();
            canvas2.translate(rectF.left + f3, rectF.top + f3);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(width, 0.0f);
            canvas2.rotate(90.0f);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(height, 0.0f);
            canvas2.rotate(90.0f);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(width, 0.0f);
            canvas2.rotate(90.0f);
            canvas2 = canvas2;
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.restoreToCount(save);
            float f4 = (rectF.left + f3) - 1.0f;
            float innerWidth = rectF.top;
            float innerHeight = (rectF.right - f3) + 1.0f;
            float roundedCornerRadius = rectF.top + f3;
            canvas2.drawRect(f4, innerWidth, innerHeight, roundedCornerRadius, paint2);
            float f5 = (rectF.left + f3) - 1.0f;
            float innerWidth2 = rectF.bottom - f3;
            float innerHeight2 = (rectF.right - f3) + 1.0f;
            float roundedCornerRadius2 = rectF.bottom;
            paint2 = paint2;
            canvas2.drawRect(f5, innerWidth2, innerHeight2, roundedCornerRadius2, paint2);
        }
        float f6 = rectF.left;
        float innerWidth3 = rectF.top + f;
        float innerHeight3 = rectF.right;
        canvas2.drawRect(f6, innerWidth3, innerHeight3, rectF.bottom - f, paint2);
    }
}
