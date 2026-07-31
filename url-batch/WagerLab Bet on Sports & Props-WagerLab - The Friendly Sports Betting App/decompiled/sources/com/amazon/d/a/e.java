package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* compiled from: DecisionExpirationContext.java */
/* loaded from: classes3.dex */
public interface e extends IInterface {
    String a() throws RemoteException;

    Map b() throws RemoteException;

    /* compiled from: DecisionExpirationContext.java */
    public static abstract class a extends Binder implements e {

        /* renamed from: a, reason: collision with root package name */
        private static final String f644a = "com.amazon.venezia.command.DecisionExpirationContext";
        static final int c = 1;
        static final int d = 2;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, f644a);
        }

        public static e a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f644a);
            if (queryLocalInterface != null && (queryLocalInterface instanceof e)) {
                return (e) queryLocalInterface;
            }
            return new C0056a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(f644a);
                String a2 = a();
                parcel2.writeNoException();
                parcel2.writeString(a2);
                return true;
            }
            if (i != 2) {
                if (i == 1598968902) {
                    parcel2.writeString(f644a);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(f644a);
            Map b = b();
            parcel2.writeNoException();
            parcel2.writeMap(b);
            return true;
        }

        /* compiled from: DecisionExpirationContext.java */
        /* renamed from: com.amazon.d.a.e$a$a, reason: collision with other inner class name */
        private static class C0056a implements e {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f645a;

            C0056a(IBinder iBinder) {
                this.f645a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f645a;
            }

            public String c() {
                return a.f644a;
            }

            @Override // com.amazon.d.a.e
            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f644a);
                    this.f645a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.amazon.d.a.e
            public Map b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f644a);
                    this.f645a.transact(2, obtain, obtain2, 0);
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
