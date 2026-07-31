package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5060i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import java.util.List;
import kotlin.UInt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class j {
    @NotNull
    public static final List<k> a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, @NotNull r externalLinkHandler, @NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, boolean z, @Nullable Boolean bool, int i, int i2, int i3, boolean z2, boolean z3, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k linkHandler) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        k.c cVar = new k.c(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e(aVar.j(), 0, z, bool, i, z2, z3, context, customUserEventBuilderService, externalLinkHandler, linkHandler));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c f = aVar.f();
        k.a aVar2 = f != null ? new k.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c(f, UInt.m8055constructorimpl(RangesKt.coerceAtLeast(i2, 0)), context, customUserEventBuilderService, externalLinkHandler, z, linkHandler, null)) : null;
        C5060i g = aVar.g();
        return CollectionsKt.listOfNotNull((Object[]) new k[]{cVar, aVar2, g != null ? new k.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c(g, aVar.j().i(), UInt.m8055constructorimpl(RangesKt.coerceAtLeast(i3, 0)), context, customUserEventBuilderService, externalLinkHandler, linkHandler, null)) : null});
    }
}
