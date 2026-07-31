package com.ogury.ad.internal;

import java.net.URLDecoder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class gi {
    public static final String a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            String decode = URLDecoder.decode(str, "UTF-8");
            Intrinsics.checkNotNull(decode);
            return decode;
        } catch (Exception unused) {
            return "";
        }
    }
}
