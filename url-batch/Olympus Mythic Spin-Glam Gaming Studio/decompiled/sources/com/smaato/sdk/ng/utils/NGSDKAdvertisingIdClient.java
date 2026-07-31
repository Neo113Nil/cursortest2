package com.smaato.sdk.ng.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.smaato.sdk.ng.NextGen;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes13.dex */
public class NGSDKAdvertisingIdClient {
    private static final String c = "NGSDKAdvertisingIdClient";
    protected Listener a;
    protected Handler b;

    public static class AdInfo {
        private final String a;
        private final boolean b;

        AdInfo(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public String getId() {
            return this.a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.b;
        }
    }

    protected static class AdvertisingConnection implements ServiceConnection {
        boolean a = false;
        private final LinkedBlockingQueue<IBinder> b = new LinkedBlockingQueue<>(1);

        protected AdvertisingConnection() {
        }

        public IBinder getBinder() throws InterruptedException {
            if (this.a) {
                throw new IllegalStateException();
            }
            this.a = true;
            return this.b.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.b.put(iBinder);
            } catch (InterruptedException e) {
                NextGen.reportException((Exception) e);
                Log.e(NGSDKAdvertisingIdClient.c, "Error: can't connect to AdvertisingId service", e);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    protected static class AdvertisingInterface implements IInterface {
        private final IBinder a;

        public AdvertisingInterface(IBinder iBinder) {
            this.a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        public String getId() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } catch (Exception e) {
                    NextGen.reportException(e);
                    Log.e(NGSDKAdvertisingIdClient.c, "Error: Can't read AdvertisingId from the service", e);
                    obtain2.recycle();
                    obtain.recycle();
                    return null;
                }
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public boolean isLimitAdTrackingEnabled(boolean z) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z ? 1 : 0);
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } catch (Exception e) {
                NextGen.reportException(e);
                Log.e(NGSDKAdvertisingIdClient.c, "Error: Can't get is limit Ad tracking enabled", e);
                return false;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public interface Listener {
        void onAdvertisingIdFinish(String str, Boolean bool);
    }

    class a implements Runnable {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            AdInfo adInfo;
            boolean z;
            Context context;
            String str = null;
            try {
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                AdvertisingConnection advertisingConnection = new AdvertisingConnection();
                try {
                    try {
                        if (this.a.bindService(intent, advertisingConnection, 1)) {
                            AdvertisingInterface advertisingInterface = new AdvertisingInterface(advertisingConnection.getBinder());
                            adInfo = new AdInfo(advertisingInterface.getId(), advertisingInterface.isLimitAdTrackingEnabled(true));
                        } else {
                            adInfo = null;
                        }
                        try {
                            context = this.a;
                        } catch (Exception e) {
                            e = e;
                            NextGen.reportException(e);
                            Log.e(NGSDKAdvertisingIdClient.c, "getAdvertisingIdInfo - Error: " + e);
                            if (adInfo == null) {
                            }
                            NGSDKAdvertisingIdClient.this.a(str, z);
                        }
                    } catch (Throwable th) {
                        this.a.unbindService(advertisingConnection);
                        throw th;
                    }
                } catch (Exception e2) {
                    NextGen.reportException(e2);
                    Log.e(NGSDKAdvertisingIdClient.c, "getAdvertisingIdInfo - Error: " + e2);
                    context = this.a;
                    adInfo = null;
                }
                context.unbindService(advertisingConnection);
            } catch (Exception e3) {
                e = e3;
                adInfo = null;
            }
            if (adInfo == null) {
                z = adInfo.isLimitAdTrackingEnabled();
                if (z) {
                    Log.i(NGSDKAdvertisingIdClient.c, "Error: cannot get advertising id, limit ad tracking is enabled");
                } else {
                    str = adInfo.getId();
                }
            } else {
                z = false;
            }
            NGSDKAdvertisingIdClient.this.a(str, z);
        }
    }

    class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            Listener listener = NGSDKAdvertisingIdClient.this.a;
            if (listener != null) {
                listener.onAdvertisingIdFinish(this.a, Boolean.valueOf(this.b));
            }
        }
    }

    protected void a(Context context) {
        new Thread(new a(context)).start();
    }

    public void request(Context context, Listener listener) {
        this.a = listener;
        this.b = new Handler(Looper.getMainLooper());
        a(context);
    }

    protected void a(String str, boolean z) {
        this.b.post(new b(str, z));
    }
}
