package com.inmobi.media;

import android.os.Build;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class Gl {
    public static final H5 a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() != 2 ? new H5(0, 0) : new H5(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    public static final String a(String url) {
        String encode;
        Intrinsics.checkNotNullParameter(url, "url");
        if (Build.VERSION.SDK_INT >= 33) {
            encode = URLEncoder.encode(url, Charset.defaultCharset());
            return encode;
        }
        return URLEncoder.encode(url);
    }
}
