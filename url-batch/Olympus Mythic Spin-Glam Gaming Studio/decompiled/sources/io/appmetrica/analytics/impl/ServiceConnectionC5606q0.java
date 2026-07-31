package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.q0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ServiceConnectionC5606q0 implements ServiceConnection {
    public final /* synthetic */ C5631r0 a;

    public ServiceConnectionC5606q0(C5631r0 c5631r0) {
        this.a = c5631r0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.a) {
            this.a.d = IAppMetricaService.Stub.asInterface(iBinder);
            this.a.e.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a) {
            this.a.d = null;
        }
    }
}
