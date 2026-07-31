package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public final class Ne implements K8 {
    @Override // com.ironsource.K8
    public void a(@NotNull Context context, @NotNull String key, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        IronSourceUtils.b(context, key, i);
    }

    @Override // com.ironsource.K8
    public int b(@NotNull Context context, @NotNull String key, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        return IronSourceUtils.a(context, key, i);
    }

    @Override // com.ironsource.K8
    public void a(@NotNull Context context, @NotNull String key, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        IronSourceUtils.b(context, key, j);
    }

    @Override // com.ironsource.K8
    public long b(@NotNull Context context, @NotNull String key, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        return IronSourceUtils.a(context, key, j);
    }
}
