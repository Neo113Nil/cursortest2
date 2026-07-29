package o;

import android.view.autofill.AutofillManager;

/* renamed from: o.w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2130w2 implements G7 {
    public final S2 a;
    public final M7 b;
    public final AutofillManager c;

    public C2130w2(S2 s2, M7 m7) {
        this.a = s2;
        this.b = m7;
        AutofillManager f = AbstractC1665p0.f(s2.getContext().getSystemService(AbstractC1665p0.j()));
        if (f == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.c = f;
        s2.setImportantForAutofill(1);
    }
}
