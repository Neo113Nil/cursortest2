package defpackage;

import com.vectorharbor.planetvectorsurvey.ui.screens.LoadingScreenKt;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class aw implements mu {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ aw(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        ky0 LoadingScreen$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1;
        switch (this.d) {
            case 0:
                ((cw) this.e).f.removeCallbacks((bw) this.f);
                return ky0.a;
            case 1:
                LoadingScreen$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1 = LoadingScreenKt.LoadingScreen$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1((bt0) this.e, (bt0) this.f, (oo) obj);
                return LoadingScreen$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1;
            case 2:
                a9 a9Var = (a9) this.e;
                ug ugVar = (ug) this.f;
                f90 f90Var = a9Var.a;
                if (f90Var != null) {
                    f90.a(f90Var, ugVar.b);
                } else {
                    eb0 eb0Var = a9Var.b;
                    if (eb0Var == null) {
                        g8.s("Unreachable");
                        return null;
                    }
                    z8 z8Var = ugVar.a;
                    z8Var.getClass();
                    ya0 ya0Var = new ya0(z8Var, new za0(z8Var, null));
                    z8Var.a.add(ya0Var);
                    f90.a(eb0Var.a(), ya0Var);
                }
                return new x3(5, a9Var, ugVar);
            case 3:
                bi biVar = (bi) this.e;
                b70 b70Var = (b70) this.f;
                biVar.v(obj);
                if (b70Var != null) {
                    b70Var.a(obj);
                }
                return ky0.a;
            default:
                wi0 wi0Var = (wi0) this.e;
                Throwable th = (Throwable) this.f;
                Throwable th2 = (Throwable) obj;
                synchronized (wi0Var.b) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                mz.r(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    wi0Var.d = th;
                    et0 et0Var = wi0Var.t;
                    si0 si0Var = si0.d;
                    et0Var.getClass();
                    et0Var.k(null, si0Var);
                }
                return ky0.a;
        }
    }
}
