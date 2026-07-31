package com.mbridge.msdk.foundation.tools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: AdvertisingIdClient.java */
/* loaded from: classes4.dex */
public class c {

    /* compiled from: AdvertisingIdClient.java */
    public final class b {
        private final String a;
        private final boolean b;

        b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public String a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }
    }

    /* compiled from: AdvertisingIdClient.java */
    /* renamed from: com.mbridge.msdk.foundation.tools.c$c, reason: collision with other inner class name */
    private final class ServiceConnectionC1422c implements ServiceConnection {
        private final LinkedBlockingQueue<IBinder> a;
        boolean b;

        private ServiceConnectionC1422c() {
            this.a = new LinkedBlockingQueue<>(1);
            this.b = false;
        }

        public IBinder a() throws InterruptedException {
            if (this.b) {
                throw new IllegalStateException();
            }
            this.b = true;
            return this.a.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.a.put(iBinder);
            } catch (InterruptedException e) {
                q0.b("AdvertisingIdClient", e.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* compiled from: AdvertisingIdClient.java */
    private final class d implements IInterface {
        private IBinder a;

        public d(IBinder iBinder) {
            this.a = iBinder;
        }

        public boolean a(boolean z) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z ? 1 : 0);
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                r2 = obtain2.readInt() != 0;
            } catch (Throwable th) {
                try {
                    q0.b("AdvertisingIdClient", th.getMessage());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            return r2;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        public String getId() throws RemoteException {
            String str;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                str = obtain2.readString();
            } catch (Throwable th) {
                try {
                    q0.b("AdvertisingIdClient", th.getMessage());
                    str = null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            return str;
        }
    }

    public b a(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        ServiceConnectionC1422c serviceConnectionC1422c = new ServiceConnectionC1422c();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, serviceConnectionC1422c, 1)) {
            throw new IOException("Google Play connection failed");
        }
        try {
            try {
                d dVar = new d(serviceConnectionC1422c.a());
                return new b(dVar.getId(), dVar.a(true));
            } catch (Exception e) {
                throw e;
            }
        } finally {
            context.unbindService(serviceConnectionC1422c);
        }
    }
}
