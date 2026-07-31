package com.inmobi.media;

import android.os.Build;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Ek {
    public TelemetryConfig a;

    public Ek(TelemetryConfig telemetryConfig) {
        Intrinsics.checkNotNullParameter(telemetryConfig, "telemetryConfig");
        this.a = telemetryConfig;
        ((Kc) AbstractC4002fj.e.getValue()).a(new int[]{150, 152}, new Function1() { // from class: com.inmobi.media.Ek$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ek.a(Ek.this, (N2) obj);
            }
        });
    }

    public static final Unit a(Ek ek, N2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        switch (it.a) {
            case 150:
                Map map = it.c;
                Object obj = map != null ? map.get("data") : null;
                ek.a("CrashEventOccurred", obj instanceof C3882b5 ? (C3882b5) obj : null);
                break;
            case 151:
                Map map2 = it.c;
                Object obj2 = map2 != null ? map2.get("data") : null;
                C4455wo c4455wo = obj2 instanceof C4455wo ? (C4455wo) obj2 : null;
                ek.getClass();
                if (c4455wo != null && Hl.a(c4455wo)) {
                    F5.a.getClass();
                    if (!F5.t()) {
                        ek.a("MainThreadBlockedEvent", c4455wo);
                        break;
                    }
                }
                break;
            case 152:
                Map map3 = it.c;
                Object obj3 = map3 != null ? map3.get("data") : null;
                ek.a(obj3 instanceof D1 ? (D1) obj3 : null);
                break;
        }
        return Unit.INSTANCE;
    }

    public final void a(D1 d1) {
        if (Build.VERSION.SDK_INT < 30 || d1 == null || d1.g != 6) {
            return;
        }
        a("ANREvent", d1);
    }

    public final void a(String str, C3887ba c3887ba) {
        if (this.a.getPriorityEventsList().contains(str) && c3887ba != null && Hl.a(c3887ba)) {
            C4425vk.b(str, new LinkedHashMap(), EnumC4530zk.a);
        }
    }
}
