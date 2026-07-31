package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public final class Oe implements Pe {
    @Override // com.ironsource.Pe
    public void a(@NotNull Context context, @NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        IronSourceUtils.b(context, key, z);
    }
}
