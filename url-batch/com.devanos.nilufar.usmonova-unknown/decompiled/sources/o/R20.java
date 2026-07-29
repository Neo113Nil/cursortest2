package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* loaded from: classes.dex */
public final class R20 extends AbstractBinderC1144h20 {
    public com.google.android.gms.common.internal.a b;
    public final int c;

    public R20(com.google.android.gms.common.internal.a aVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.b = aVar;
        this.c = i;
    }

    @Override // o.AbstractBinderC1144h20
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) O20.a(parcel, Bundle.CREATOR);
            O20.b(parcel);
            AbstractC1473m3.o(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar = this.b;
            int i2 = this.c;
            aVar.getClass();
            W20 w20 = new W20(aVar, readInt, readStrongBinder, bundle);
            M20 m20 = aVar.e;
            m20.sendMessage(m20.obtainMessage(1, i2, -1, w20));
            this.b = null;
        } else if (i == 2) {
            parcel.readInt();
            O20.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            d30 d30Var = (d30) O20.a(parcel, d30.CREATOR);
            O20.b(parcel);
            com.google.android.gms.common.internal.a aVar2 = this.b;
            AbstractC1473m3.o(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            AbstractC1473m3.n(d30Var);
            aVar2.u = d30Var;
            Bundle bundle2 = d30Var.h;
            AbstractC1473m3.o(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar3 = this.b;
            int i3 = this.c;
            aVar3.getClass();
            W20 w202 = new W20(aVar3, readInt2, readStrongBinder2, bundle2);
            M20 m202 = aVar3.e;
            m202.sendMessage(m202.obtainMessage(1, i3, -1, w202));
            this.b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
