package androidx.compose.ui.draw;

import defpackage.b2;
import defpackage.md0;
import defpackage.mu;
import defpackage.o9;
import defpackage.q9;
import defpackage.u50;
import defpackage.y7;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class a {
    public static final u50 a(u50 u50Var, mu muVar) {
        return u50Var.c(new DrawBehindElement(muVar));
    }

    public static u50 b(u50 u50Var, md0 md0Var, y7 y7Var, float f, q9 q9Var, int i) {
        o9 o9Var = b2.i;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return u50Var.c(new PainterElement(md0Var, o9Var, y7Var, f, q9Var));
    }
}
