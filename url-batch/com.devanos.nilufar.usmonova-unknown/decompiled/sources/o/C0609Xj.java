package o;

import android.text.InputFilter;
import android.widget.TextView;

/* renamed from: o.Xj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0609Xj extends AbstractC0048Bt {
    public final C0583Wj h;

    public C0609Xj(TextView textView) {
        this.h = new C0583Wj(textView);
    }

    @Override // o.AbstractC0048Bt
    public final InputFilter[] H(InputFilter[] inputFilterArr) {
        return !(C0272Kj.k != null) ? inputFilterArr : this.h.H(inputFilterArr);
    }

    @Override // o.AbstractC0048Bt
    public final void c0(boolean z) {
        if (C0272Kj.k != null) {
            this.h.c0(z);
        }
    }

    @Override // o.AbstractC0048Bt
    public final void d0(boolean z) {
        C0583Wj c0583Wj = this.h;
        if (C0272Kj.k != null) {
            c0583Wj.d0(z);
        } else {
            c0583Wj.j = z;
        }
    }
}
