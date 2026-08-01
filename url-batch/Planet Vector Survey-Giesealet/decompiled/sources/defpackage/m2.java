package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class m2 extends v8 {
    public final p01 a;
    public final up0 b;
    public final f3 c;
    public final bj0 d;
    public final String e;
    public final AutofillId f;
    public final q60 g;
    public boolean h;

    public m2(p01 p01Var, up0 up0Var, f3 f3Var, bj0 bj0Var, String str) {
        this.a = p01Var;
        this.b = up0Var;
        this.c = f3Var;
        this.d = bj0Var;
        this.e = str;
        new Rect();
        f3Var.setImportantForAutofill(1);
        u8 e = yc0.e(f3Var);
        AutofillId e2 = e != null ? t0.e(e.a) : null;
        if (e2 == null) {
            throw y6.u("Required value was null.");
        }
        this.f = e2;
        this.g = new q60();
    }
}
