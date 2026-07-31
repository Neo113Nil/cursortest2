package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public final class Q7 {
    @NotNull
    public final String a() {
        String OMID_LIB_VERSION = Hc.f;
        Intrinsics.checkNotNullExpressionValue(OMID_LIB_VERSION, "OMID_LIB_VERSION");
        return OMID_LIB_VERSION;
    }

    @NotNull
    public final String b() {
        return "7";
    }

    @NotNull
    public final String c() {
        String sDKVersion = SDKUtils.getSDKVersion();
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        return sDKVersion;
    }
}
