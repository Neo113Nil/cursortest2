package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;

/* renamed from: io.appmetrica.analytics.impl.re, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5645re implements PermissionStrategy {
    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(@NonNull String str) {
        return false;
    }

    public final String toString() {
        return "AlwaysAskForPermissionStrategy{always allow permission}";
    }
}
