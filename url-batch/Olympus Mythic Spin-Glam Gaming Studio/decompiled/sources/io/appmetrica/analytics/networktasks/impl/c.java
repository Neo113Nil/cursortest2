package io.appmetrica.analytics.networktasks.impl;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {
    public final String a;

    public c(String str) {
        this.a = a(str);
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Uri parse = Uri.parse(str);
        return Intrinsics.areEqual("http", parse.getScheme()) ? parse.buildUpon().scheme("https").build().toString() : str;
    }
}
