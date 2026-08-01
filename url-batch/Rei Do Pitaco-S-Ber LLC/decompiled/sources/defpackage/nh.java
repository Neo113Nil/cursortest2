package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class nh extends g8 {
    public final mh k;

    public nh(TextView textView) {
        this.k = new mh(textView);
    }

    @Override // defpackage.g8
    public final InputFilter[] C(InputFilter[] inputFilterArr) {
        return !(ah.k != null) ? inputFilterArr : this.k.C(inputFilterArr);
    }

    @Override // defpackage.g8
    public final void d0(boolean z) {
        if (ah.k != null) {
            this.k.d0(z);
        }
    }

    @Override // defpackage.g8
    public final void e0(boolean z) {
        boolean z2 = ah.k != null;
        mh mhVar = this.k;
        if (z2) {
            mhVar.e0(z);
        } else {
            mhVar.m = z;
        }
    }
}
