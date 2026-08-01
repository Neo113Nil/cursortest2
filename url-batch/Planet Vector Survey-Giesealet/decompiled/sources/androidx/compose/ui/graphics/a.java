package androidx.compose.ui.graphics;

import defpackage.mu;
import defpackage.px0;
import defpackage.qv;
import defpackage.rq0;
import defpackage.u50;
import defpackage.uw0;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class a {
    public static final u50 a(mu muVar) {
        return new BlockGraphicsLayerElement(muVar);
    }

    public static u50 b(u50 u50Var, float f, rq0 rq0Var, int i) {
        if ((i & 32) != 0) {
            f = 0.0f;
        }
        float f2 = f;
        long j = uw0.b;
        if ((i & 2048) != 0) {
            rq0Var = px0.f;
        }
        long j2 = qv.a;
        return u50Var.c(new GraphicsLayerElement(f2, j, rq0Var, false, j2, j2));
    }

    public static u50 c(u50 u50Var, rq0 rq0Var, int i) {
        long j = uw0.b;
        if ((i & 2048) != 0) {
            rq0Var = px0.f;
        }
        long j2 = qv.a;
        return u50Var.c(new GraphicsLayerElement(0.0f, j, rq0Var, true, j2, j2));
    }
}
