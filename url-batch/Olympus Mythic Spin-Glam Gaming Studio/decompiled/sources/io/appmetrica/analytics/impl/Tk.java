package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class Tk implements ServiceWakeLock {
    public final Context a;
    public final Sk b;
    public final HashMap c = new HashMap();

    public Tk(@NotNull Context context, @NotNull Sk sk) {
        this.a = context;
        this.b = sk;
    }

    @NotNull
    public final String a(@NotNull String str) {
        return "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK." + str;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(@NotNull String str) {
        try {
            if (this.c.get(str) == null) {
                HashMap hashMap = this.c;
                Sk sk = this.b;
                Context context = this.a;
                String a = a(str);
                sk.a.getClass();
                Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
                intent.setAction(a);
                Rk rk = new Rk();
                try {
                    context.bindService(intent, rk, 1);
                } catch (Throwable unused) {
                    rk = null;
                }
                hashMap.put(str, rk);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(@NotNull String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.c.get(str);
        if (serviceConnection != null) {
            Sk sk = this.b;
            a(str);
            Context context = this.a;
            sk.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
