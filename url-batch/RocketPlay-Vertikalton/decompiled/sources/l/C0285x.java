package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: l.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285x {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3525a;

    /* renamed from: b, reason: collision with root package name */
    public final A1.d f3526b;

    public C0285x(TextView textView) {
        this.f3525a = textView;
        this.f3526b = new A1.d(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3525a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i, 0);
        try {
            boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z2) {
        ((F1.d) this.f3526b.f38b).g0(z2);
    }

    public final void c(boolean z2) {
        ((F1.d) this.f3526b.f38b).h0(z2);
    }
}
