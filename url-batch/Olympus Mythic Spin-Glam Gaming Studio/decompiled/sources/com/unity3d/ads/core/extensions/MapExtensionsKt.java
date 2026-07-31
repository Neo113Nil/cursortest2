package com.unity3d.ads.core.extensions;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* compiled from: MapExtensions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"sizeInKb", "", "", "", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MapExtensionsKt {
    public static final int sizeInKb(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Iterator<T> it = map.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Charset charset = Charsets.UTF_8;
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            int length = bytes.length;
            byte[] bytes2 = str2.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            i += length + bytes2.length;
        }
        return i / 1024;
    }
}
