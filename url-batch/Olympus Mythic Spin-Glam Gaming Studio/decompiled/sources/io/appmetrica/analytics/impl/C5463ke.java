package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ke, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5463ke implements InterfaceC5708u {
    @Override // io.appmetrica.analytics.impl.InterfaceC5708u
    @NotNull
    public final Map<String, String> a(@NotNull Map<String, String> map) {
        map.put(AdRevenueConstants.LAYER_KEY, "native");
        return map;
    }
}
