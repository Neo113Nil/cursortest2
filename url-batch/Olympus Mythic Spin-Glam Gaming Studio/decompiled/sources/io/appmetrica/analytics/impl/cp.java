package io.appmetrica.analytics.impl;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class cp implements InterfaceC5708u {
    @Override // io.appmetrica.analytics.impl.InterfaceC5708u
    @NotNull
    public final Map<String, String> a(@NotNull Map<String, String> map) {
        map.put("source", "yandex");
        return map;
    }
}
