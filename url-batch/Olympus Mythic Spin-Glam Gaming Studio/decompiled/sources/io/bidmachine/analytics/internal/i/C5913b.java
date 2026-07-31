package io.bidmachine.analytics.internal.i;

import io.bidmachine.analytics.internal.a.f;
import io.bidmachine.analytics.internal.i.AbstractC5912a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.bidmachine.analytics.internal.i.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5913b implements AbstractC5912a.InterfaceC1735a {
    public static final a f = new a(null);
    private final f a;
    private final f b;
    private final f c;
    private final f d;
    private final Map e;

    /* renamed from: io.bidmachine.analytics.internal.i.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5913b a(String str) {
            Iterator<String> keys;
            if (StringsKt.isBlank(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject optJSONObject = jSONObject.optJSONObject("afpath");
            if (optJSONObject != null && (keys = optJSONObject.keys()) != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    f a = f.d.a(next);
                    if (a != null) {
                        JSONArray optJSONArray = optJSONObject.optJSONArray(next);
                        if (optJSONArray == null) {
                            optJSONArray = new JSONArray();
                        }
                        ArrayList arrayList = new ArrayList();
                        int length = optJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            arrayList.add(optJSONArray.optString(i));
                        }
                        linkedHashMap.put(a, arrayList);
                    }
                }
            }
            f.a aVar = f.d;
            return new C5913b(aVar.a(jSONObject.optString("afmin")), aVar.a(jSONObject.optString("afmax")), aVar.a(jSONObject.optString("adjmin")), aVar.a(jSONObject.optString("adjmax")), linkedHashMap);
        }

        private a() {
        }
    }

    public C5913b(f fVar, f fVar2, f fVar3, f fVar4, Map map) {
        this.a = fVar;
        this.b = fVar2;
        this.c = fVar3;
        this.d = fVar4;
        this.e = map;
    }

    public final Map a() {
        return this.e;
    }

    public final boolean b(f fVar) {
        return a(fVar, this.a, this.b);
    }

    public final boolean a(f fVar) {
        return a(fVar, this.c, this.d);
    }

    private final boolean a(f fVar, f fVar2, f fVar3) {
        if (fVar == null || fVar2 == null || fVar3 == null) {
            return false;
        }
        return RangesKt.rangeTo(fVar2, fVar3).contains(fVar);
    }
}
