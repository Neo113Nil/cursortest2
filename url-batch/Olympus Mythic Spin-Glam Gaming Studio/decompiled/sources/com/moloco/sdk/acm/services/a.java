package com.moloco.sdk.acm.services;

import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a {

    @NotNull
    public static final a a = new a();

    public final boolean a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Boolean.parseBoolean(b(key));
    }

    public final String b(String str) {
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) invoke;
            try {
                if (TextUtils.isEmpty(str2)) {
                    return null;
                }
            } catch (Exception unused) {
            }
            return str2;
        } catch (Exception unused2) {
            return null;
        }
    }
}
