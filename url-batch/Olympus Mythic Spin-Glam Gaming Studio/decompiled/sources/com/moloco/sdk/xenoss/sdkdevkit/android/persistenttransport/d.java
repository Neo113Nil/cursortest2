package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import io.ktor.http.ContentType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public interface d {

    public static final class a {
        public static /* synthetic */ void a(d dVar, String str, byte[] bArr, ContentType contentType, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendPost");
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            dVar.a(str, bArr, contentType, str2);
        }
    }

    void a(@NotNull String str);

    void a(@NotNull String str, @NotNull byte[] bArr, @NotNull ContentType contentType, @Nullable String str2);
}
