package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.screenshot.impl.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5886x implements Q {
    public final ClientContext a;

    public C5886x(@NotNull ClientContext clientContext) {
        this.a = clientContext;
    }

    public final void a(@NotNull String str) {
        this.a.getInternalClientModuleFacade().reportEvent(InternalModuleEvent.INSTANCE.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(MapsKt.mapOf(TuplesKt.to("type", str))).withCategory(InternalModuleEvent.Category.SYSTEM).build());
    }
}
