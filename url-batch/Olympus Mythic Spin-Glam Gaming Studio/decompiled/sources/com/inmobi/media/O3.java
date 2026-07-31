package com.inmobi.media;

import android.net.Uri;
import kotlin.text.StringsKt;

/* loaded from: classes11.dex */
public abstract class O3 {
    public static final boolean a(String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return false;
        }
        String scheme = Uri.parse(str).getScheme();
        return !(scheme == null || scheme.length() == 0);
    }
}
