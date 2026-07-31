package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class H5 {

    @NotNull
    private final ArrayList<String> a = new ArrayList<>(new G5().a());

    @NotNull
    private final Q6 b = new Q6();

    @NotNull
    public final JSONObject a() {
        JSONObject a = this.b.a(this.a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
        return a;
    }
}
