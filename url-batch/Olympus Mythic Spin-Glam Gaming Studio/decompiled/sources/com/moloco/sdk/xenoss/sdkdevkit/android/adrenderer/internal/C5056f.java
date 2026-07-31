package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5056f {

    @NotNull
    public static final char[] a;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        a = charArray;
    }

    @NotNull
    public static final String a(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            int i2 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i3 = i * 2;
            char[] cArr2 = a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
