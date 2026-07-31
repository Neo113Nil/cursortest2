package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class Y1 {
    public static C1 d;
    public final Context a;
    public final B1 b;
    public A1 c;

    public Y1(@NotNull Context context, @NotNull B1 b1) {
        this.a = context;
        this.b = b1;
    }

    public final void b() {
        Ka.a(this.a);
        PublicLogger.INSTANCE.init(this.a);
        Context context = this.a;
        B1 b1 = this.b;
        if (d == null) {
            O1 o1 = new O1(context, b1, new C5688t5(context));
            C5755vk c5755vk = Ka.I.v;
            R1 r1 = new R1(o1);
            LinkedHashMap linkedHashMap = c5755vk.a;
            Object obj = linkedHashMap.get(1);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(1, obj);
            }
            ((List) obj).add(r1);
            d = new N1(Ka.I.d.b(), o1);
        }
        C1 c1 = d;
        if (c1 != null) {
            this.c = new A1(c1);
            Ka ka = Ka.I;
            ka.f = new Bj(ka.a, new Cj(c1));
            c1.onCreate();
        }
    }

    public final boolean c(@NotNull Intent intent) {
        C1 c1 = d;
        if (c1 != null) {
            c1.b(intent);
        }
        String action = intent.getAction();
        return (action == null || !StringsKt.startsWith$default(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false, 2, (Object) null)) && intent.getData() == null;
    }

    @VisibleForTesting
    public final void d() {
        d = null;
    }

    public final void a(@NotNull Intent intent, int i) {
        C1 c1 = d;
        if (c1 != null) {
            c1.a(intent, i);
        }
    }

    public final int a(@NotNull Intent intent, int i, int i2) {
        C1 c1 = d;
        if (c1 == null) {
            return 2;
        }
        c1.a(intent, i, i2);
        return 2;
    }

    public final void c() {
        C1 c1 = d;
        if (c1 != null) {
            c1.onDestroy();
        }
    }

    @NotNull
    public final IBinder a(@NotNull Intent intent) {
        C1 c1 = d;
        if (c1 != null) {
            c1.a(intent);
        }
        String action = intent.getAction();
        if (action != null && StringsKt.startsWith$default(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false, 2, (Object) null)) {
            return new Vo();
        }
        A1 a1 = this.c;
        if (a1 != null) {
            return a1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coreBinder");
        return null;
    }

    public final void a(@NotNull Configuration configuration) {
        C1 c1 = d;
        if (c1 != null) {
            c1.onConfigurationChanged(configuration);
        }
    }

    public final void b(@NotNull Intent intent) {
        C1 c1 = d;
        if (c1 != null) {
            c1.c(intent);
        }
    }
}
