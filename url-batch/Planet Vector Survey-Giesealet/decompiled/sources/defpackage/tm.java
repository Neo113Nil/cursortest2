package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class tm extends av0 {
    public int f;

    public tm(int i) {
        super(0L, false);
        this.f = i;
    }

    public abstract kj c();

    public Throwable e(Object obj) {
        jf jfVar = obj instanceof jf ? (jf) obj : null;
        if (jfVar != null) {
            return jfVar.a;
        }
        return null;
    }

    public final void g(Throwable th) {
        d31.A(c().getContext(), new fk("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (defpackage.zz) r5.k(defpackage.b2.C);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            kj c = c();
            c.getClass();
            rm rmVar = (rm) c;
            lj ljVar = rmVar.h;
            Object obj = rmVar.j;
            rj context = ljVar.getContext();
            Object Y = mz.Y(context, obj);
            zz zzVar = null;
            iy0 P = Y != mz.p ? a50.P(ljVar, context, Y) : null;
            try {
                rj context2 = ljVar.getContext();
                Object h = h();
                Throwable e = e(h);
                if (e == null) {
                    int i = this.f;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                }
                if (zzVar != null && !zzVar.b()) {
                    CancellationException n = zzVar.n();
                    b(n);
                    ljVar.resumeWith(rg0.i(n));
                } else if (e != null) {
                    ljVar.resumeWith(new uk0(e));
                } else {
                    ljVar.resumeWith(f(h));
                }
                if (P != null && !P.e0()) {
                    return;
                }
                mz.S(context, Y);
            } catch (Throwable th) {
                if (P == null || P.e0()) {
                    mz.S(context, Y);
                }
                throw th;
            }
        } catch (Throwable th2) {
            g(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
