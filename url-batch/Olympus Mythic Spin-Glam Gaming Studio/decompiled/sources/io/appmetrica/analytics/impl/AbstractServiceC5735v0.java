package io.appmetrica.analytics.impl;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractServiceC5735v0 extends Service {
    public Y1 a;

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        Y1 y1 = this.a;
        if (y1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceDelegate");
            y1 = null;
        }
        return y1.a(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Y1 y1 = this.a;
        if (y1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceDelegate");
            y1 = null;
        }
        y1.a(configuration);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (this.a == null) {
            this.a = new Y1(this, new C5761w0(this));
        }
        Y1 y1 = this.a;
        if (y1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceDelegate");
            y1 = null;
        }
        y1.b();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Y1 y1 = this.a;
        if (y1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceDelegate");
            y1 = null;
        }
        y1.c();
    }

    @Override // android.app.Service
    public void onRebind(@NotNull Intent intent) {
        super.onRebind(intent);
        Y1 y1 = this.a;
        if (y1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceDelegate");
            y1 = null;
        }
        y1.b(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(@NotNull Intent intent, int i, int i2) {
        Y1 y1 = this.a;
        if (y1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceDelegate");
            y1 = null;
        }
        return y1.a(intent, i, i2);
    }

    @Override // android.app.Service
    public boolean onUnbind(@NotNull Intent intent) {
        Y1 y1 = this.a;
        if (y1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceDelegate");
            y1 = null;
        }
        return y1.c(intent);
    }
}
