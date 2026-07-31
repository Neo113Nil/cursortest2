package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.mc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5513mc extends Lambda implements Function1 {
    public static final C5513mc a = new C5513mc();

    public C5513mc() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).startLocationTracking();
        return Unit.INSTANCE;
    }
}
