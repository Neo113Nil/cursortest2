package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.z5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5844z5 implements PermissionStrategy {
    public final PermissionStrategy[] a;

    public C5844z5(@NotNull PermissionStrategy... permissionStrategyArr) {
        this.a = permissionStrategyArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(@NotNull String str) {
        for (PermissionStrategy permissionStrategy : this.a) {
            if (permissionStrategy.forbidUsePermission(str)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String toString() {
        return "CompositePermissionStrategy(strategies=" + Arrays.toString(this.a) + ')';
    }
}
