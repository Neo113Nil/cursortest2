package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* compiled from: ExceptionResult.java */
/* loaded from: classes3.dex */
public interface g extends IInterface {
    String a() throws RemoteException;

    Map b() throws RemoteException;

    /* compiled from: ExceptionResult.java */
    public static abstract class a extends Binder implements g {

        /* renamed from: a, reason: collision with root package name */
        static final int f648a = 1;
        static final int b = 2;
        private static final String c = "com.amazon.venezia.command.ExceptionResult";

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, c);
        }

        public static g a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(c);
            if (queryLocalInterface != null && (queryLocalInterface instanceof g)) {
                return (g) queryLocalInterface;
            }
            return new C0058a(iBinder);
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

        /* compiled from: ExceptionResult.java */
        /* renamed from: com.amazon.d.a.g$a$a, reason: collision with other inner class name */
        private static class C0058a implements g {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f649a;

            C0058a(IBinder iBinder) {
                this.f649a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f649a;
            }

            public String c() {
                return a.c;
            }

            @Override // com.amazon.d.a.g
            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.c);
                    this.f649a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.g
            public Map b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.c);
                    this.f649a.transact(2, obtain, obtain2, 0);
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
