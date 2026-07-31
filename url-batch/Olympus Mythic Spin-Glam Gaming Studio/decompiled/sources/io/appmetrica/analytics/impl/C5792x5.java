package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.x5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5792x5 extends Lambda implements Function1 {
    public static final C5792x5 a = new C5792x5();

    public C5792x5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ModuleAdRevenueProcessor) obj).getDescription();
    }
}
