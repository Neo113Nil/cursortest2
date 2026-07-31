package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class l extends Lambda implements Function0 {
    public final /* synthetic */ UtilityServiceProvider a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(UtilityServiceProvider utilityServiceProvider) {
        super(0);
        this.a = utilityServiceProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new FirstExecutionConditionServiceImpl(this.a);
    }
}
