package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes10.dex */
public final class N1 implements C1 {
    public final ICommonExecutor a;
    public final C1 b;
    public boolean c;

    public N1(@NonNull C1 c1) {
        this(Ka.k().w().b(), c1);
    }

    @Override // io.appmetrica.analytics.impl.C1
    public final void a(Intent intent, int i) {
        this.a.execute(new F1(this, intent, i));
    }

    @Override // io.appmetrica.analytics.impl.C1
    public final void b(Intent intent) {
        this.a.execute(new J1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.C1
    public final void c(Intent intent) {
        this.a.execute(new I1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.C1
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        this.a.execute(new D1(this, configuration));
    }

    @Override // io.appmetrica.analytics.impl.C1
    public final synchronized void onCreate() {
        this.c = true;
        this.a.execute(new E1(this));
    }

    @Override // io.appmetrica.analytics.impl.C1
    public final void onDestroy() {
        this.a.removeAll();
        synchronized (this) {
            this.c = false;
        }
        this.b.onDestroy();
    }

    @Override // io.appmetrica.analytics.impl.C1
    public final void pauseUserSession(@NonNull Bundle bundle) {
        this.a.execute(new M1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.C1
    public final void reportData(int i, Bundle bundle) {
        this.a.execute(new K1(this, i, bundle));
    }

    @Override // io.appmetrica.analytics.impl.C1
    public final void resumeUserSession(@NonNull Bundle bundle) {
        this.a.execute(new L1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.C1
    public final void a(Intent intent, int i, int i2) {
        this.a.execute(new G1(this, intent, i, i2));
    }

    public N1(IHandlerExecutor iHandlerExecutor, C1 c1) {
        this.c = false;
        this.a = iHandlerExecutor;
        this.b = c1;
    }

    @Override // io.appmetrica.analytics.impl.C1
    public final void a(Intent intent) {
        this.a.execute(new H1(this, intent));
    }
}
