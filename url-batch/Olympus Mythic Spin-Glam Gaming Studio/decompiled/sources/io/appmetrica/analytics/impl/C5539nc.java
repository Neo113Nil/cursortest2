package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.nc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5539nc extends Lambda implements Function1 {
    public static final C5539nc a = new C5539nc();

    public C5539nc() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).stopLocationTracking();
        return Unit.INSTANCE;
    }
}
