package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: l.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271y {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3092a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.d f3093b;

    public C0271y(TextView textView) {
        this.f3092a = textView;
        this.f3093b = new B0.d(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3092a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i, 0);
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
        ((q1.l) this.f3093b.f59b).U(z2);
    }

    public final void c(boolean z2) {
        ((q1.l) this.f3093b.f59b).V(z2);
    }
}
