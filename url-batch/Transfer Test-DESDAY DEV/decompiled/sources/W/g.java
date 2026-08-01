package W;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends T.e {

    /* renamed from: a, reason: collision with root package name */
    public final f f892a;

    public g(TextView textView) {
        this.f892a = new f(textView);
    }

    @Override // T.e
    public final void U(boolean z2) {
        if (U.j.f820k != null) {
            this.f892a.U(z2);
        }
    }

    @Override // T.e
    public final void V(boolean z2) {
        boolean z3 = U.j.f820k != null;
        f fVar = this.f892a;
        if (z3) {
            fVar.V(z2);
        } else {
            fVar.f891c = z2;
        }
    }

    @Override // T.e
    public final InputFilter[] y(InputFilter[] inputFilterArr) {
        return !(U.j.f820k != null) ? inputFilterArr : this.f892a.y(inputFilterArr);
    }
}
