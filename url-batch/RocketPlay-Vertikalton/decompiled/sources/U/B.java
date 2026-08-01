package U;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class B implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1165a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f1166b;

    public B(Spannable spannable) {
        this.f1166b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f1166b;
        if (!this.f1165a) {
            if ((Build.VERSION.SDK_INT < 28 ? new M0.e(11) : new A(11)).n(spannable)) {
                this.f1166b = new SpannableString(spannable);
            }
        }
        this.f1165a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f1166b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f1166b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f1166b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1166b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1166b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1166b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f1166b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1166b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f1166b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f1166b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.f1166b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f1166b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1166b.toString();
    }
}
