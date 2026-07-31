package com.pubmatic.sdk.monitor;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes13.dex */
public interface IPOBMonitorService extends IInterface {
    public static final String DESCRIPTOR = "com.pubmatic.sdk.monitor.IPOBMonitorService";

    public static class Default implements IPOBMonitorService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.pubmatic.sdk.monitor.IPOBMonitorService
        public String getMonitorData() throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IPOBMonitorService {

        private static class a implements IPOBMonitorService {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.pubmatic.sdk.monitor.IPOBMonitorService
            public String getMonitorData() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IPOBMonitorService.DESCRIPTOR);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IPOBMonitorService.DESCRIPTOR);
        }

        public static IPOBMonitorService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IPOBMonitorService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPOBMonitorService)) ? new a(iBinder) : (IPOBMonitorService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IPOBMonitorService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IPOBMonitorService.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            String monitorData = getMonitorData();
            parcel2.writeNoException();
            parcel2.writeString(monitorData);
            return true;
        }
    }

    String getMonitorData() throws RemoteException;
}
