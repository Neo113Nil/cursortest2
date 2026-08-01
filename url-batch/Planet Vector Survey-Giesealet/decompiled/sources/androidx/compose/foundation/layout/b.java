package androidx.compose.foundation.layout;

import defpackage.id0;
import defpackage.u50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class b {
    public static final u50 a(u50 u50Var, id0 id0Var) {
        return u50Var.c(new PaddingValuesElement(id0Var));
    }

    public static final u50 b(u50 u50Var) {
        return u50Var.c(new PaddingElement(18.0f, 18.0f, 18.0f, 18.0f));
    }

    public static final u50 c(u50 u50Var, float f, float f2) {
        return u50Var.c(new PaddingElement(f, f2, f, f2));
    }

    public static u50 d() {
        return new PaddingElement(0.0f, 2.0f, 0.0f, 2.0f);
    }

    public static u50 e(u50 u50Var, int i) {
        return u50Var.c(new PaddingElement(0.0f, (i & 2) != 0 ? 0.0f : 170.0f, 0.0f, (i & 8) != 0 ? 0.0f : 42.0f));
    }
}
