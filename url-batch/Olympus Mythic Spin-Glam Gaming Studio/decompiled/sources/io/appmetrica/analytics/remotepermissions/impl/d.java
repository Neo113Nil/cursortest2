package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Set;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class d implements PermissionStrategy {
    public Set a = SetsKt.emptySet();

    public final synchronized void a(@NotNull Set<String> set) {
        this.a = set;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final synchronized boolean forbidUsePermission(@NotNull String str) {
        return !this.a.contains(str);
    }
}
