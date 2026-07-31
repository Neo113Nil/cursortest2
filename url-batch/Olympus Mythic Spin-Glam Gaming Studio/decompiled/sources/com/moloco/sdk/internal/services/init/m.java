package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.Init;
import com.moloco.sdk.internal.services.init.j;
import com.moloco.sdk.internal.x;
import io.ktor.http.HttpStatusCode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class m {

    @NotNull
    public static final String a = "InitService";

    public static final boolean a(@NotNull x.a<Init.SDKInitResponse, j> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar.a() instanceof j.b) {
            return a(((j.b) aVar.a()).a());
        }
        return true;
    }

    public static final boolean a(int i) {
        HttpStatusCode.Companion companion = HttpStatusCode.Companion;
        return i == companion.getTooManyRequests().getValue() || i == companion.getRequestTimeout().getValue() || i < 400 || i >= 500;
    }
}
