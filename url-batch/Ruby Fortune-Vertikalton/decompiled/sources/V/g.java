package V;

import android.text.InputFilter;
import android.widget.TextView;
import q1.l;

/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: a, reason: collision with root package name */
    public final f f773a;

    public g(TextView textView) {
        this.f773a = new f(textView);
    }

    @Override // q1.l
    public final void U(boolean z2) {
        if (T.j.f717k != null) {
            this.f773a.U(z2);
        }
    }

    @Override // q1.l
    public final void V(boolean z2) {
        boolean z3 = T.j.f717k != null;
        f fVar = this.f773a;
        if (z3) {
            fVar.V(z2);
        } else {
            fVar.f772c = z2;
        }
    }

    @Override // q1.l
    public final InputFilter[] x(InputFilter[] inputFilterArr) {
        return !(T.j.f717k != null) ? inputFilterArr : this.f773a.x(inputFilterArr);
    }
}
