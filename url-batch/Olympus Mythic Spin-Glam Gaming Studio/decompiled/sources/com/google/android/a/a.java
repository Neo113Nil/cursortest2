package com.google.android.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: BaseProxy.java */
/* loaded from: classes5.dex */
public abstract class a implements IInterface {
    private final IBinder a;
    private final String b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected a(IBinder iBinder) {
        this.a = iBinder;
    }

    protected final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    protected final Parcel b(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.a.transact(1, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
