package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class w60 implements Spannable {
    public boolean f = false;
    public Spannable g;

    public w60(Spannable spannable) {
        this.g = spannable;
    }

    public final void a() {
        Spannable spannable = this.g;
        if (!this.f) {
            if ((Build.VERSION.SDK_INT < 28 ? new iw(17) : new v60(17)).h(spannable)) {
                this.g = new SpannableString(spannable);
            }
        }
        this.f = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.g.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.g.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.g.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.g.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.g.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.g.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.g.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.g.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.g.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.g.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.g.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.g.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.g.toString();
    }
}
