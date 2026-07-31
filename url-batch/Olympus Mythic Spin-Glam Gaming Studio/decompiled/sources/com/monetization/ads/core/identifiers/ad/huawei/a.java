package com.monetization.ads.core.identifiers.ad.huawei;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService;
import java.util.concurrent.LinkedBlockingQueue;
import yads.ob1;

/* loaded from: classes9.dex */
public final class a implements ServiceConnection {
    public final LinkedBlockingQueue a = new LinkedBlockingQueue();

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IInterface proxy;
        try {
            int i = OpenDeviceIdentifierService.Stub.a;
            if (iBinder == null) {
                proxy = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                proxy = (queryLocalInterface == null || !(queryLocalInterface instanceof OpenDeviceIdentifierService)) ? new OpenDeviceIdentifierService.Stub.Proxy(iBinder) : (OpenDeviceIdentifierService) queryLocalInterface;
            }
            this.a.put(proxy);
        } catch (Exception unused) {
            boolean z = ob1.a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        try {
            this.a.clear();
        } catch (UnsupportedOperationException unused) {
            boolean z = ob1.a;
        }
    }
}
