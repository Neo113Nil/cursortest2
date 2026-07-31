package com.amazon.d.c.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IApplicationVerificationService.java */
/* loaded from: classes3.dex */
public interface a extends IInterface {
    String a() throws RemoteException;

    String a(String str) throws RemoteException;

    void a(String str, boolean z, String str2) throws RemoteException;

    String b() throws RemoteException;

    /* compiled from: IApplicationVerificationService.java */
    /* renamed from: com.amazon.d.c.a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0062a extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        static final int f657a = 1;
        static final int b = 2;
        static final int c = 3;
        static final int d = 4;
        private static final String e = "com.amazon.venezia.service.verify.IApplicationVerificationService";

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public AbstractBinderC0062a() {
            attachInterface(this, e);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(e);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0063a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(e);
                a(parcel.readString(), parcel.readInt() != 0, parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(e);
                String a2 = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a2);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(e);
                String a3 = a();
                parcel2.writeNoException();
                parcel2.writeString(a3);
                return true;
            }
            if (i != 4) {
                if (i == 1598968902) {
                    parcel2.writeString(e);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(e);
            String b2 = b();
            parcel2.writeNoException();
            parcel2.writeString(b2);
            return true;
        }

        /* compiled from: IApplicationVerificationService.java */
        /* renamed from: com.amazon.d.c.a.a$a$a, reason: collision with other inner class name */
        private static class C0063a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f658a;

            C0063a(IBinder iBinder) {
                this.f658a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f658a;
            }

            public String c() {
                return AbstractBinderC0062a.e;
            }

            @Override // com.amazon.d.c.a.a
            public void a(String str, boolean z, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0062a.e);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeString(str2);
                    this.f658a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.c.a.a
            public String a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0062a.e);
                    obtain.writeString(str);
                    this.f658a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.c.a.a
            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0062a.e);
                    this.f658a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.c.a.a
            public String b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0062a.e);
                    this.f658a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
