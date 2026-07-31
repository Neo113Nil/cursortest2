package com.unity3d.services.core.network.core;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetEngine;
import org.jetbrains.annotations.NotNull;

/* compiled from: CronetEngineBuilderFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;", "", "<init>", "()V", "createCronetEngineBuilder", "Lorg/chromium/net/CronetEngine$Builder;", "context", "Landroid/content/Context;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CronetEngineBuilderFactory {
    @NotNull
    public final CronetEngine.Builder createCronetEngineBuilder(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new CronetEngine.Builder(context);
    }
}
