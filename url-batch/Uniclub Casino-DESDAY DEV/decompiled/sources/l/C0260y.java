package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: l.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260y {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3095a;

    /* renamed from: b, reason: collision with root package name */
    public final C.g f3096b;

    public C0260y(TextView textView) {
        this.f3095a = textView;
        this.f3096b = new C.g(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3095a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i, 0);
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
        ((q1.d) this.f3096b.f62b).N(z2);
    }

    public final void c(boolean z2) {
        ((q1.d) this.f3096b.f62b).R(z2);
    }
}
