package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class I20 implements IInterface {
    public final IBinder a;

    public I20(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(R20 r20, C0019Aq c0019Aq) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(r20);
            obtain.writeInt(1);
            J1.a(c0019Aq, obtain, 0);
            this.a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
