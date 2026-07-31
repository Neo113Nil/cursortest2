package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public final class p {
    @NotNull
    public static final n a(@Nullable y yVar, @Nullable Integer num, @Nullable Integer num2, @Nullable String str, @NotNull CoroutineScope scope, @NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @Nullable Function0 function0, @Nullable Function0 function02) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        return new o(yVar, num, num2, str, scope, context, customUserEventBuilderService, externalLinkHandler, function0, function02);
    }
}
