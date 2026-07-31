package com.moloco.sdk.internal;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@VisibleForTesting
/* loaded from: classes5.dex */
public final class z implements y {
    public static final int b = 8;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i a;

    public z(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest) {
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        this.a = persistentHttpRequest;
    }

    @Override // com.moloco.sdk.internal.y
    public boolean a(@NotNull String url, long j, @Nullable t tVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f;
        Intrinsics.checkNotNullParameter(url, "url");
        if (tVar != null) {
            try {
                f = tVar.f();
            } catch (Exception e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "SdkEventUrlTrackerImpl", e.toString(), null, false, 12, null);
                return false;
            }
        } else {
            f = null;
        }
        Uri build = Uri.parse(a(url, j, f)).buildUpon().build();
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar = this.a;
        String uri = build.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        iVar.a(uri);
        return true;
    }

    public final String a(String str, long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        String a;
        if (cVar != null && (a = com.moloco.sdk.internal.utils.b.a(str, cVar.a())) != null) {
            str = a;
        }
        return com.moloco.sdk.internal.utils.b.a(str, j);
    }
}
