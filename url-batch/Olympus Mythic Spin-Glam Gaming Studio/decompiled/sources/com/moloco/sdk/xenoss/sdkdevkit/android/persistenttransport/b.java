package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d;
import io.ktor.http.ContentType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes13.dex */
public final class b implements a {
    public static final int c = 8;

    @NotNull
    public final d b;

    public b(@NotNull d delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.b = delegate;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d
    public void a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.b.a(url);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d
    public void a(@NotNull String url, @NotNull byte[] body, @NotNull ContentType contentType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        d.a.a(this.b, url, body, contentType, null, 8, null);
    }
}
