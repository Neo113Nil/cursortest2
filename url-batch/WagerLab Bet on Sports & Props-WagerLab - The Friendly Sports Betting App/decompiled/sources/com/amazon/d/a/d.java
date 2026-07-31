package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.d.a.c;
import com.amazon.d.a.i;

/* compiled from: CommandService.java */
/* loaded from: classes3.dex */
public interface d extends IInterface {
    void a(c cVar, i iVar) throws RemoteException;

    /* compiled from: CommandService.java */
    public static abstract class a extends Binder implements d {

        /* renamed from: a, reason: collision with root package name */
        static final int f642a = 1;
        private static final String b = "com.amazon.venezia.command.CommandService";

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, b);
        }

        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(b);
            if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
                return (d) queryLocalInterface;
            }
            return new C0055a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i == 1598968902) {
                    parcel2.writeString(b);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(b);
            a(c.a.a(parcel.readStrongBinder()), i.a.a(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }

        /* compiled from: CommandService.java */
        /* renamed from: com.amazon.d.a.d$a$a, reason: collision with other inner class name */
        private static class C0055a implements d {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f643a;

            C0055a(IBinder iBinder) {
                this.f643a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f643a;
            }

            public String a() {
                return a.b;
            }

            @Override // com.amazon.d.a.d
            public void a(c cVar, i iVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.b);
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    this.f643a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
