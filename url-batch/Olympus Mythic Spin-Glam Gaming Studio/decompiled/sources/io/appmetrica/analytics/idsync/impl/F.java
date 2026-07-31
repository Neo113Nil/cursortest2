package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class F implements Converter {
    public final String a = "request_state";
    public final String b = "type";
    public final String c = "last_attempt";
    public final String d = "prev_attempt_result";

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String fromModel(@Nullable List<E> list) {
        Collection emptyList;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        String str = this.a;
        if (list != null) {
            emptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (E e : list) {
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put(this.b, e.a);
                    jSONObject.put(this.c, e.b);
                    jSONObject.put(this.d, e.c.a);
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                emptyList.add(jSONObject);
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        jSONObject2.put(str, new JSONArray(emptyList));
        return jSONObject2.toString();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<E> toModel(@Nullable String str) {
        JSONArray optJSONArray;
        E a;
        try {
            ArrayList arrayList = new ArrayList();
            if (str == null || (optJSONArray = new JSONObject(str).optJSONArray(this.a)) == null) {
                return arrayList;
            }
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && (a = a(optJSONObject)) != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return CollectionsKt.emptyList();
        }
    }

    public final E a(JSONObject jSONObject) {
        A a;
        try {
            String string = jSONObject.getString(this.b);
            long j = jSONObject.getLong(this.c);
            z zVar = A.b;
            String string2 = jSONObject.getString(this.d);
            zVar.getClass();
            A[] values = A.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    a = null;
                    break;
                }
                a = values[i];
                if (Intrinsics.areEqual(a.a, string2)) {
                    break;
                }
                i++;
            }
            if (a == null) {
                a = A.c;
            }
            return new E(string, j, a);
        } catch (Throwable unused) {
            return null;
        }
    }
}
