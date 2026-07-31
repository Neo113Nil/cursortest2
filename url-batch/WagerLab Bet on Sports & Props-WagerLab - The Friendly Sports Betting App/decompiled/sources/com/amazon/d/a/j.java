package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* compiled from: SuccessResult.java */
/* loaded from: classes3.dex */
public interface j extends IInterface {
    String a() throws RemoteException;

    Map b() throws RemoteException;

    /* compiled from: SuccessResult.java */
    public static abstract class a extends Binder implements j {

        /* renamed from: a, reason: collision with root package name */
        static final int f654a = 1;
        static final int b = 2;
        private static final String c = "com.amazon.venezia.command.SuccessResult";

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, c);
        }

        public static j a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(c);
            if (queryLocalInterface != null && (queryLocalInterface instanceof j)) {
                return (j) queryLocalInterface;
            }
            return new C0061a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(c);
                String a2 = a();
                parcel2.writeNoException();
                parcel2.writeString(a2);
                return true;
            }
            if (i != 2) {
                if (i == 1598968902) {
                    parcel2.writeString(c);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(c);
            Map b2 = b();
            parcel2.writeNoException();
            parcel2.writeMap(b2);
            return true;
        }

        /* compiled from: SuccessResult.java */
        /* renamed from: com.amazon.d.a.j$a$a, reason: collision with other inner class name */
        private static class C0061a implements j {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f655a;

            C0061a(IBinder iBinder) {
                this.f655a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f655a;
            }

            public String c() {
                return a.c;
            }

            @Override // com.amazon.d.a.j
            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.c);
                    this.f655a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.j
            public Map b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.c);
                    this.f655a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
