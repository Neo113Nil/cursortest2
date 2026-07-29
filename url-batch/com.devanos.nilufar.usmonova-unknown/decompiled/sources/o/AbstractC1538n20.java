package o;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: o.n20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1538n20 {
    public final int a;

    public AbstractC1538n20(int i) {
        this.a = i;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(C1274j20 c1274j20);

    public abstract C0300Ll[] b(C1274j20 c1274j20);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(C1274j20 c1274j20);

    public abstract void f(KX kx, boolean z);
}
