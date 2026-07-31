package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;

/* loaded from: classes11.dex */
public abstract class Ag {
    public static final boolean a(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        C4017g6 c4017g6 = EnumC4069i6.b;
        int code = response.code();
        c4017g6.getClass();
        return C4017g6.a(code) != EnumC4069i6.d;
    }
}
