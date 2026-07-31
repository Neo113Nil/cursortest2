package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import android.content.Context;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class f {
    @NotNull
    public static final d a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        i b = k.b();
        a.g gVar = a.g.a;
        return new e(b, gVar.b(), gVar.a(), n.b(), a.e.a.k(), a.i.a.a(), r.a(context));
    }
}
