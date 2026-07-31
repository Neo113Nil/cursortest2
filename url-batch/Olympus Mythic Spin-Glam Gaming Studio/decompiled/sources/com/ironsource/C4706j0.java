package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.ironsource.j0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4706j0 {

    @NotNull
    private final ArrayList<String> a = new ArrayList<>(new C4689i0().a());

    @NotNull
    private final Q6 b = new Q6();

    @NotNull
    public final JSONObject a() {
        JSONObject a = this.b.a(this.a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(mAdQualityKeyList)");
        return a;
    }
}
