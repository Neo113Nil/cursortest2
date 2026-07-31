package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class G implements InterfaceC5872i {
    public final ClientContext a;
    public final Q b;

    public G(@NotNull ClientContext clientContext, @NotNull Q q) {
        this.a = clientContext;
        this.b = q;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC5872i
    @NotNull
    public final List<P> a() {
        return CollectionsKt.listOf((Object[]) new P[]{new C5884v(this.a, this.b), new d0(this.a, this.b)});
    }
}
