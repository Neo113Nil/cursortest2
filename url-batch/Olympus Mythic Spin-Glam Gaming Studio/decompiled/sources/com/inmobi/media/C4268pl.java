package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import com.inmobi.unifiedId.InMobiUserDataTypes;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.pl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4268pl extends H9 {
    public final Zk b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4268pl(String url, Zk uidMap, String str, int i, int i2, int i3) {
        super(url);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uidMap, "uidMap");
        this.b = uidMap;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final Ze a() {
        String str;
        InMobiUserDataTypes obj;
        InMobiUserDataTypes obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Objects.toString(C4070i7.a);
        String str2 = (String) AbstractC4132kh.a().get("u-age");
        if (str2 != null) {
        }
        String jSONArray = AbstractC4216nl.b().toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
        linkedHashMap.put("ufids", jSONArray);
        C4458x1 c4458x1 = Yk.a;
        Boolean bool = c4458x1 != null ? c4458x1.c : null;
        if (bool == null || (str = bool.toString()) == null) {
            str = "true";
        }
        linkedHashMap.put("lat", str);
        linkedHashMap.put("mk-version", AbstractC4030gj.a());
        String str3 = E1.a;
        if (str3 != null) {
        }
        linkedHashMap.put("ua", AbstractC4002fj.c());
        linkedHashMap.put("ts", String.valueOf(System.currentTimeMillis()));
        String str4 = this.c;
        if (str4 != null) {
        }
        InMobiUserDataModel inMobiUserDataModel = C4070i7.b;
        if (inMobiUserDataModel == null || (obj = inMobiUserDataModel.getEmailId()) == null || (obj.getMd5() == null && obj.getSha1() == null && obj.getSha256() == null)) {
            obj = null;
        }
        if (obj != null) {
            Intrinsics.checkNotNullParameter(obj, "obj");
        }
        InMobiUserDataModel inMobiUserDataModel2 = C4070i7.b;
        if (inMobiUserDataModel2 == null || (obj2 = inMobiUserDataModel2.getPhoneNumber()) == null || (obj2.getMd5() == null && obj2.getSha1() == null && obj2.getSha256() == null)) {
            obj2 = null;
        }
        if (obj2 != null) {
            Intrinsics.checkNotNullParameter(obj2, "obj");
        }
        InMobiUserDataModel inMobiUserDataModel3 = C4070i7.b;
        HashMap<String, String> extras = inMobiUserDataModel3 != null ? inMobiUserDataModel3.getExtras() : null;
        if (extras != null) {
            linkedHashMap.putAll(extras);
        }
        linkedHashMap.putAll(this.b.a());
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(E1.e);
        linkedHashMap.putAll(F5.a.a(false));
        linkedHashMap.putAll(H8.a());
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        JSONObject b = AbstractC3962e7.b();
        if (b != null) {
            String jSONObject = b.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            linkedHashMap.put("consentObject", jSONObject);
        }
        String str5 = this.a;
        C4018g7 c4018g7 = new C4018g7(linkedHashMap);
        int i = this.d;
        int i2 = this.e;
        IntRange intRange = AbstractC4026gf.a;
        Vi vi = new Vi(i, i2 * 1000, 0);
        long j = this.f * 1000;
        return new Ze(str5, null, new Ok(j, j, j), c4018g7, vi, 32);
    }
}
