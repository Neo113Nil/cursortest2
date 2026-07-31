package com.inmobi.media;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.t4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4356t4 extends H9 {
    public final String b;
    public final List c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4356t4(String url, String accountId, List configRequestContexts, boolean z) {
        super(url);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(configRequestContexts, "configRequestContexts");
        this.b = accountId;
        this.c = configRequestContexts;
        this.d = z;
    }

    public final Ze a() {
        List<C4382u4> list = this.c;
        JSONArray jSONArray = new JSONArray();
        for (C4382u4 c4382u4 : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("n", c4382u4.b.getType());
            jSONObject.put("t", c4382u4.b.getLastUpdateTimeStamp());
            jSONArray.put(jSONObject);
        }
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("im-accid", this.b);
        linkedHashMap.put("p", jSONArray2);
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        JSONObject b = AbstractC3962e7.b();
        if (b != null) {
            String jSONObject2 = b.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            linkedHashMap.put("consentObject", jSONObject2);
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(E1.e);
        linkedHashMap.putAll(F5.a.a(false));
        linkedHashMap.putAll(H8.a());
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.put("u-appsecure", String.valueOf((int) E1.f));
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (this.d) {
            linkedHashMap2.put("rip", "true");
        }
        return new Ze(this.a, linkedHashMap2, null, new C4018g7(linkedHashMap), null, 52);
    }
}
