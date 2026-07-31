package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.u5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5714u5 extends Lambda implements Function1 {
    public static final C5714u5 a = new C5714u5();

    public C5714u5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((IExecutionPolicy) obj).description();
    }
}
