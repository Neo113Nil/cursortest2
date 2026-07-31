package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.ironsource.a9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4545a9 {

    @NotNull
    private final ArrayList<String> a = new ArrayList<>(new Z8().a());

    @NotNull
    private final Q6 b = new Q6();

    @NotNull
    public final JSONObject a() {
        JSONObject a = this.b.a(this.a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDat…mInitDeferredDataKeyList)");
        return a;
    }
}
