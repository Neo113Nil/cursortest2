package com.ironsource;

import com.ironsource.O6;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.f2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4637f2 {

    @Nullable
    private final O6.a a;

    @NotNull
    private final ArrayList<String> b = new ArrayList<>(new C4601d2().a());

    @NotNull
    private final Q6 c = new Q6();

    public C4637f2(@Nullable O6.a aVar) {
        this.a = aVar;
    }

    @NotNull
    public final JSONObject a() {
        O6.a aVar = this.a;
        JSONObject a = aVar != null ? this.c.a(this.b, aVar) : null;
        if (a == null) {
            a = this.c.a(this.b);
            Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
        return a(a);
    }

    private final JSONObject a(JSONObject jSONObject) {
        JSONObject b = R6.b(jSONObject.optJSONObject(O6.u));
        if (b != null) {
            jSONObject.put(O6.u, b);
        }
        return jSONObject;
    }
}
