package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class bg0 extends ReplacementSpan {
    public Paint.FontMetricsInt d;
    public int e;
    public int f;
    public boolean g;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.d;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        nz.f0("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.g) {
            dy.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.g = true;
        paint.getTextSize();
        this.d = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            dy.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.e = (int) Math.ceil(0.0d);
        this.f = (int) Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.g) {
            dy.b("PlaceholderSpan is not laid out yet.");
        }
        return this.e;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
