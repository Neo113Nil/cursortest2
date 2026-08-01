package V;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final f f780e;

    public g(TextView textView) {
        this.f780e = new f(textView);
    }

    @Override // q1.d
    public final void N(boolean z2) {
        if (T.j.f723k != null) {
            this.f780e.N(z2);
        }
    }

    @Override // q1.d
    public final void R(boolean z2) {
        boolean z3 = T.j.f723k != null;
        f fVar = this.f780e;
        if (z3) {
            fVar.R(z2);
        } else {
            fVar.f779g = z2;
        }
    }

    @Override // q1.d
    public final InputFilter[] x(InputFilter[] inputFilterArr) {
        return !(T.j.f723k != null) ? inputFilterArr : this.f780e.x(inputFilterArr);
    }
}
