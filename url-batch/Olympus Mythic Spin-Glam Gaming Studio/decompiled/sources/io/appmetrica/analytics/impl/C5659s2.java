package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.s2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5659s2 {
    public static final boolean a(Throwable th) {
        return true;
    }

    @NotNull
    public final InterfaceC5305eb a(@NotNull Context context, @NotNull AppMetricaConfig appMetricaConfig, @NotNull InterfaceC5564ob interfaceC5564ob) {
        return new Oh(new Bc(interfaceC5564ob, appMetricaConfig), new InterfaceC5819y6() { // from class: io.appmetrica.analytics.impl.s2$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.InterfaceC5819y6
            public final boolean a(Throwable th) {
                return C5659s2.a(th);
            }
        }, appMetricaConfig.crashTransformer, new C5382ha(context));
    }
}
