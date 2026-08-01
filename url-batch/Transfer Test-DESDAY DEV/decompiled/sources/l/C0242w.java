package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: l.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242w {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3094a;

    /* renamed from: b, reason: collision with root package name */
    public final A0.h f3095b;

    public C0242w(TextView textView) {
        this.f3094a = textView;
        this.f3095b = new A0.h(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3094a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i, 0);
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
        ((T.e) this.f3095b.f30b).U(z2);
    }

    public final void c(boolean z2) {
        ((T.e) this.f3095b.f30b).V(z2);
    }
}
