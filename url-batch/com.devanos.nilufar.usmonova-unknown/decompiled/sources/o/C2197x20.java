package o;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: o.x20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2197x20 extends AbstractC1538n20 {
    public final NU b;

    public C2197x20(NU nu) {
        super(4);
        this.b = nu;
    }

    @Override // o.AbstractC1538n20
    public final boolean a(C1274j20 c1274j20) {
        if (c1274j20.f.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // o.AbstractC1538n20
    public final C0300Ll[] b(C1274j20 c1274j20) {
        if (c1274j20.f.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // o.AbstractC1538n20
    public final void c(Status status) {
        this.b.c(new F4(status));
    }

    @Override // o.AbstractC1538n20
    public final void d(Exception exc) {
        this.b.c(exc);
    }

    @Override // o.AbstractC1538n20
    public final void e(C1274j20 c1274j20) {
        try {
            h(c1274j20);
        } catch (DeadObjectException e) {
            c(AbstractC1538n20.g(e));
            throw e;
        } catch (RemoteException e2) {
            c(AbstractC1538n20.g(e2));
        } catch (RuntimeException e3) {
            this.b.c(e3);
        }
    }

    public final void h(C1274j20 c1274j20) {
        if (c1274j20.f.remove(null) != null) {
            throw new ClassCastException();
        }
        this.b.d(Boolean.FALSE);
    }

    @Override // o.AbstractC1538n20
    public final /* bridge */ /* synthetic */ void f(KX kx, boolean z) {
    }
}
