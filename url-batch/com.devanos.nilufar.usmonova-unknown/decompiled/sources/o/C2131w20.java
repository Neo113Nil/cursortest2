package o;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* renamed from: o.w20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2131w20 extends AbstractC1538n20 {
    public final C1711ph b;
    public final NU c;
    public final MT d;

    public C2131w20(C1711ph c1711ph, NU nu, C1097gL c1097gL) {
        super(2);
        this.c = nu;
        this.b = c1711ph;
        this.d = c1097gL;
        if (c1711ph.h) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // o.AbstractC1538n20
    public final boolean a(C1274j20 c1274j20) {
        return this.b.h;
    }

    @Override // o.AbstractC1538n20
    public final C0300Ll[] b(C1274j20 c1274j20) {
        return (C0300Ll[]) this.b.i;
    }

    @Override // o.AbstractC1538n20
    public final void c(Status status) {
        this.c.c(this.d.getException(status));
    }

    @Override // o.AbstractC1538n20
    public final void d(Exception exc) {
        this.c.c(exc);
    }

    @Override // o.AbstractC1538n20
    public final void e(C1274j20 c1274j20) {
        NU nu = this.c;
        try {
            this.b.c(c1274j20.b, nu);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            c(AbstractC1538n20.g(e2));
        } catch (RuntimeException e3) {
            nu.c(e3);
        }
    }

    @Override // o.AbstractC1538n20
    public final void f(KX kx, boolean z) {
        Map map = (Map) kx.i;
        Boolean valueOf = Boolean.valueOf(z);
        NU nu = this.c;
        map.put(nu, valueOf);
        p30 p30Var = nu.a;
        KX kx2 = new KX(kx, nu);
        p30Var.getClass();
        p30Var.b.e(new Y20(OU.a, kx2));
        p30Var.n();
    }
}
