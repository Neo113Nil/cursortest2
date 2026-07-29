package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class W20 extends F20 {
    public final IBinder g;
    public final /* synthetic */ com.google.android.gms.common.internal.a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W20(com.google.android.gms.common.internal.a aVar, int i, IBinder iBinder, Bundle bundle) {
        super(aVar, i, bundle);
        this.h = aVar;
        this.g = iBinder;
    }

    @Override // o.F20
    public final void a(C0162Gd c0162Gd) {
        C2329z20 c2329z20 = this.h.f8o;
        if (c2329z20 != null) {
            ((InterfaceC0382Oq) c2329z20.a).a(c0162Gd);
        }
        System.currentTimeMillis();
    }

    @Override // o.F20
    public final boolean b() {
        IBinder iBinder = this.g;
        try {
            AbstractC1473m3.n(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.h;
            if (!aVar.r().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + aVar.r() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface o2 = aVar.o(iBinder);
            if (o2 == null || !(com.google.android.gms.common.internal.a.u(aVar, 2, 4, o2) || com.google.android.gms.common.internal.a.u(aVar, 3, 4, o2))) {
                return false;
            }
            aVar.s = null;
            C1818rJ c1818rJ = aVar.n;
            if (c1818rJ == null) {
                return true;
            }
            ((InterfaceC0356Nq) c1818rJ.i).c();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
