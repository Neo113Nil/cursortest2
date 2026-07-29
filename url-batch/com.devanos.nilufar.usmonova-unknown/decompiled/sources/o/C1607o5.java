package o;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: o.o5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1607o5 {
    public final TextView a;
    public final Y1 b;

    public C1607o5(TextView textView) {
        this.a = textView;
        this.b = new Y1(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, AbstractC1886sL.i, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z) {
        ((AbstractC0048Bt) this.b.i).c0(z);
    }

    public final void c(boolean z) {
        ((AbstractC0048Bt) this.b.i).d0(z);
    }
}
