package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* compiled from: Command.java */
/* loaded from: classes3.dex */
public interface c extends IInterface {
    String a() throws RemoteException;

    String b() throws RemoteException;

    Map c() throws RemoteException;

    String d() throws RemoteException;

    /* compiled from: Command.java */
    public static abstract class a extends Binder implements c {

        /* renamed from: a, reason: collision with root package name */
        private static final String f640a = "com.amazon.venezia.command.Command";
        static final int b = 1;
        static final int c = 2;
        static final int d = 3;
        static final int e = 4;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, f640a);
        }

        public static c a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f640a);
            if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
                return (c) queryLocalInterface;
            }
            return new C0054a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(f640a);
                String b2 = b();
                parcel2.writeNoException();
                parcel2.writeString(b2);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(f640a);
                String a2 = a();
                parcel2.writeNoException();
                parcel2.writeString(a2);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(f640a);
                String d2 = d();
                parcel2.writeNoException();
                parcel2.writeString(d2);
                return true;
            }
            if (i != 4) {
                if (i == 1598968902) {
                    parcel2.writeString(f640a);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(f640a);
            Map c2 = c();
            parcel2.writeNoException();
            parcel2.writeMap(c2);
            return true;
        }

        /* compiled from: Command.java */
        /* renamed from: com.amazon.d.a.c$a$a, reason: collision with other inner class name */
        private static class C0054a implements c {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f641a;

            C0054a(IBinder iBinder) {
                this.f641a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f641a;
            }

            public String e() {
                return a.f640a;
            }

            @Override // com.amazon.d.a.c
            public String b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f640a);
                    this.f641a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.c
            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f640a);
                    this.f641a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.c
            public String d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f640a);
                    this.f641a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.c
            public Map c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f640a);
                    this.f641a.transact(4, obtain, obtain2, 0);
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
