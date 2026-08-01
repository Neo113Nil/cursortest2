package androidx.room;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class j implements k {

    /* renamed from: c, reason: collision with root package name */
    public IBinder f1685c;

    @Override // androidx.room.k
    public final void a(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(k.f1686a);
            obtain.writeStringArray(strArr);
            this.f1685c.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1685c;
    }
}
