package com.ironsource;

import com.ironsource.C4805o9;
import com.ironsource.P3;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.ironsource.cb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4592cb {

    @NotNull
    private final Te a;

    public C4592cb(@NotNull Te response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.a = response;
    }

    private final C4805o9 b(C4805o9 c4805o9, Map<String, C4805o9> map) {
        String m;
        if (!Intrinsics.areEqual(c4805o9.l(), Boolean.TRUE) || (m = c4805o9.m()) == null || m.length() == 0 || Intrinsics.areEqual(c4805o9.m(), c4805o9.j())) {
            return null;
        }
        return map.get(c4805o9.m());
    }

    @NotNull
    public final C4574bb a() {
        P3.a.c f;
        P3.a.g h;
        P3.a e = this.a.d().e();
        return new C4574bb((e == null || (h = e.h()) == null) ? null : a(h, this.a.e().h()), (e == null || (f = e.f()) == null) ? null : a(f, this.a.e().f()), null, a(this.a.f()));
    }

    private final C4695i6 a(P3.a.g gVar, Map<String, ? extends List<String>> map) {
        P3.c g = this.a.d().g();
        P3.c.a k = g != null ? g.k() : null;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        Map<String, ? extends List<String>> map2 = map;
        Integer A = gVar.A();
        int intValue = A != null ? A.intValue() : 2;
        Integer s = gVar.s();
        boolean z = s == null || s.intValue() == 1;
        Long v = gVar.v();
        long longValue = v != null ? v.longValue() : 3000L;
        List emptyList = CollectionsKt.emptyList();
        C4813p a = a(k, k != null ? k.A() : null);
        Integer r = gVar.r();
        int intValue2 = r != null ? r.intValue() : 60;
        Integer x = gVar.x();
        return new C4695i6(map2, intValue, z, longValue, emptyList, a, intValue2, Integer.valueOf(x != null ? x.intValue() : -1));
    }

    private final C4695i6 a(P3.a.c cVar, Map<String, ? extends List<String>> map) {
        P3.c g = this.a.d().g();
        P3.c.a k = g != null ? g.k() : null;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        Map<String, ? extends List<String>> map2 = map;
        Integer A = cVar.A();
        int intValue = A != null ? A.intValue() : 2;
        Integer s = cVar.s();
        boolean z = s != null && s.intValue() == 1;
        Long v = cVar.v();
        long longValue = v != null ? v.longValue() : 3000L;
        List emptyList = CollectionsKt.emptyList();
        C4813p a = a(k, k != null ? k.y() : null);
        Integer r = cVar.r();
        int intValue2 = r != null ? r.intValue() : 60;
        Integer y = cVar.y();
        return new C4695i6(map2, intValue, z, longValue, emptyList, a, intValue2, Integer.valueOf(y != null ? y.intValue() : -1));
    }

    private final C4813p a(P3.c.a aVar, P3.c.a.C0351a c0351a) {
        String str;
        String str2;
        String str3;
        Boolean l;
        Boolean B;
        Integer w;
        Boolean v;
        Boolean u;
        Integer p;
        Long q;
        Integer r;
        if (aVar == null || (str = aVar.o()) == null) {
            str = "";
        }
        if (aVar == null || (str2 = aVar.s()) == null) {
            str2 = "";
        }
        if (aVar == null || (str3 = aVar.x()) == null) {
            str3 = "";
        }
        int i = 2;
        int intValue = (aVar == null || (r = aVar.r()) == null) ? 2 : r.intValue();
        long longValue = (aVar == null || (q = aVar.q()) == null) ? 10000L : q.longValue();
        int intValue2 = (aVar == null || (p = aVar.p()) == null) ? 15 : p.intValue();
        boolean z = false;
        boolean booleanValue = (aVar == null || (u = aVar.u()) == null) ? false : u.booleanValue();
        if (aVar != null && (v = aVar.v()) != null) {
            z = v.booleanValue();
        }
        boolean z2 = z;
        if (aVar != null && (w = aVar.w()) != null) {
            i = w.intValue();
        }
        int i2 = i;
        boolean z3 = true;
        boolean booleanValue2 = (aVar == null || (B = aVar.B()) == null) ? true : B.booleanValue();
        if (c0351a != null && (l = c0351a.l()) != null) {
            z3 = l.booleanValue();
        }
        return new C4813p(str, str2, str3, intValue, longValue, intValue2, booleanValue, z2, i2, booleanValue2, z3);
    }

    private final Map<String, Cd> a(Map<String, C4805o9> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C4805o9> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), a(entry.getValue(), map));
        }
        return linkedHashMap;
    }

    private final Cd a(C4805o9 c4805o9, Map<String, C4805o9> map) {
        C4805o9.a i;
        C4805o9.a i2;
        C4805o9.a i3;
        C4805o9.a i4;
        C4805o9 b = b(c4805o9, map);
        JSONObject jSONObject = null;
        JSONObject a = a(c4805o9.k(), b != null ? b.k() : null);
        C4805o9.a i5 = c4805o9.i();
        JSONObject a2 = a(i5 != null ? i5.h() : null, (b == null || (i4 = b.i()) == null) ? null : i4.h(), a);
        C4805o9.a i6 = c4805o9.i();
        JSONObject a3 = a(i6 != null ? i6.f() : null, (b == null || (i3 = b.i()) == null) ? null : i3.f(), a);
        C4805o9.a i7 = c4805o9.i();
        JSONObject a4 = a(i7 != null ? i7.e() : null, (b == null || (i2 = b.i()) == null) ? null : i2.e(), a);
        C4805o9.a i8 = c4805o9.i();
        JSONObject g = i8 != null ? i8.g() : null;
        if (b != null && (i = b.i()) != null) {
            jSONObject = i.g();
        }
        return new Cd(a2, a3, a4, a(g, jSONObject, a));
    }

    private final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        IronSourceUtils.b(jsonObjectInit, jSONObject);
        IronSourceUtils.b(jsonObjectInit, jSONObject2);
        return jsonObjectInit;
    }

    private final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        IronSourceUtils.b(jsonObjectInit, jSONObject);
        IronSourceUtils.b(jsonObjectInit, jSONObject2);
        IronSourceUtils.b(jsonObjectInit, jSONObject3);
        return jsonObjectInit;
    }
}
