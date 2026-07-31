package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5060i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import java.util.List;
import kotlin.UInt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class d {
    @NotNull
    public static final List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k> a(@NotNull c cVar, @NotNull j mraidFullscreenContentController, int i, @NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k linkHandler) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(mraidFullscreenContentController, "mraidFullscreenContentController");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        k.d dVar = new k.d(mraidFullscreenContentController);
        C5060i b = cVar.b();
        return CollectionsKt.listOfNotNull((Object[]) new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k[]{dVar, b != null ? new k.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c(b, null, UInt.m8055constructorimpl(RangesKt.coerceAtLeast(i, 0)), context, customUserEventBuilderService, externalLinkHandler, linkHandler, null)) : null});
    }
}
