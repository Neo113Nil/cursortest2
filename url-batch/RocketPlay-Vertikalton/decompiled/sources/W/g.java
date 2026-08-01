package W;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends F1.d {

    /* renamed from: a, reason: collision with root package name */
    public final f f1265a;

    public g(TextView textView) {
        this.f1265a = new f(textView);
    }

    @Override // F1.d
    public final InputFilter[] G(InputFilter[] inputFilterArr) {
        return !(U.j.f1178k != null) ? inputFilterArr : this.f1265a.G(inputFilterArr);
    }

    @Override // F1.d
    public final void g0(boolean z2) {
        if (U.j.f1178k != null) {
            this.f1265a.g0(z2);
        }
    }

    @Override // F1.d
    public final void h0(boolean z2) {
        boolean z3 = U.j.f1178k != null;
        f fVar = this.f1265a;
        if (z3) {
            fVar.h0(z2);
        } else {
            fVar.f1264c = z2;
        }
    }
}
