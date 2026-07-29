package o;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* renamed from: o.kY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1372kY implements Spannable {
    public boolean h = false;
    public Spannable i;

    public C1372kY(Spannable spannable) {
        this.i = spannable;
    }

    public final void a() {
        Spannable spannable = this.i;
        if (!this.h) {
            if ((Build.VERSION.SDK_INT < 28 ? new CU() : new C1306jY()).e(spannable)) {
                this.i = new SpannableString(spannable);
            }
        }
        this.h = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.i.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.i.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.i.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.i.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.i.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.i.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.i.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.i.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.i.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.i.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.i.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.i.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.i.toString();
    }
}
