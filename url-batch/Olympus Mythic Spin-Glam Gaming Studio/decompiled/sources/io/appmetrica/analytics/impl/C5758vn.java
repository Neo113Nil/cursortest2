package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.vn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5758vn implements InterfaceC5708u {
    public final C5760w b;
    public final C5734v a = new C5734v();
    public final Lazy c = LazyKt.lazy(new C5732un(this));

    public C5758vn(@NotNull Context context) {
        this.b = new C5760w(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5708u
    @NotNull
    public final Map<String, String> a(@NotNull Map<String, String> map) {
        map.putAll((Map) this.c.getValue());
        return map;
    }
}
