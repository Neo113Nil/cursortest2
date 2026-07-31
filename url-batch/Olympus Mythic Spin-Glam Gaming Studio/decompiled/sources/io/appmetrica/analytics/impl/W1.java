package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class W1 {
    public final Pa a = new Pa();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();

    public final void a() {
    }

    public final void a(@NotNull Intent intent, int i) {
    }

    public final void a(@NotNull Intent intent, int i, int i2) {
    }

    public final void a(@NotNull Configuration configuration) {
    }

    public final void b() {
    }

    public final void c(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.b.entrySet()) {
                V1 v1 = (V1) entry.getKey();
                if (((U1) entry.getValue()).a(intent)) {
                    v1.a(intent);
                }
            }
        }
    }

    public final void d(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                Pa pa = this.a;
                Integer valueOf = Integer.valueOf(a(intent));
                Collection collection = (Collection) pa.a.get(action);
                if (collection != null && collection.remove(valueOf)) {
                    if (collection.isEmpty() && pa.b) {
                        pa.a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.c.entrySet()) {
                V1 v1 = (V1) entry.getKey();
                if (((U1) entry.getValue()).a(intent)) {
                    v1.a(intent);
                }
            }
        }
    }

    public final void b(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.b.entrySet()) {
                V1 v1 = (V1) entry.getKey();
                if (((U1) entry.getValue()).a(intent)) {
                    v1.a(intent);
                }
            }
        }
    }

    public final void a(@NotNull V1 v1) {
        this.c.put(v1, new U1() { // from class: io.appmetrica.analytics.impl.W1$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.U1
            public final boolean a(Intent intent) {
                return W1.a(W1.this, intent);
            }
        });
    }

    public static final boolean a(W1 w1, Intent intent) {
        Collection collection;
        w1.getClass();
        return Intrinsics.areEqual("io.appmetrica.analytics.IAppMetricaService", intent.getAction()) && ((collection = (Collection) w1.a.a.get("io.appmetrica.analytics.IAppMetricaService")) == null || collection.size() == 0);
    }

    public static int a(Intent intent) {
        Uri data = intent.getData();
        if (data != null && Intrinsics.areEqual(data.getPath(), "/client")) {
            try {
                String queryParameter = data.getQueryParameter("pid");
                Intrinsics.checkNotNull(queryParameter);
                return Integer.parseInt(queryParameter);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public final void c(@NotNull V1 v1) {
        this.b.put(v1, new U1() { // from class: io.appmetrica.analytics.impl.W1$$ExternalSyntheticLambda1
            @Override // io.appmetrica.analytics.impl.U1
            public final boolean a(Intent intent) {
                return W1.c(W1.this, intent);
            }
        });
    }

    public static final boolean c(W1 w1, Intent intent) {
        w1.getClass();
        return Intrinsics.areEqual("io.appmetrica.analytics.IAppMetricaService", intent.getAction());
    }

    public final void b(@NotNull V1 v1) {
        this.b.put(v1, new U1() { // from class: io.appmetrica.analytics.impl.W1$$ExternalSyntheticLambda2
            @Override // io.appmetrica.analytics.impl.U1
            public final boolean a(Intent intent) {
                return W1.b(W1.this, intent);
            }
        });
    }

    public static final boolean b(W1 w1, Intent intent) {
        Collection collection;
        w1.getClass();
        return Intrinsics.areEqual("io.appmetrica.analytics.IAppMetricaService", intent.getAction()) && (collection = (Collection) w1.a.a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }
}
