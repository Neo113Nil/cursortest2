package com.moloco.sdk.internal;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class k {

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
