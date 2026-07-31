package com.unity3d.ads.core.extensions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* compiled from: JSONArrayExtensions.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\u001a\u001d\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0004¢\u0006\u0002\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u0007*\u00020\u0004¨\u0006\n"}, d2 = {"toTypedArray", "", "", "kotlin.jvm.PlatformType", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Ljava/lang/Object;", "getHeadersMap", "", "", "", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class JSONArrayExtensionsKt {
    @NotNull
    public static final Object[] toTypedArray(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        IntRange until = RangesKt.until(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((IntIterator) it).nextInt()));
        }
        return arrayList.toArray(new Object[0]);
    }

    @NotNull
    public static final Map<String, List<String>> getHeadersMap(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            List list = (List) linkedHashMap.get(jSONArray2.getString(0));
            if (list == null) {
                list = new ArrayList();
            }
            String string = jSONArray2.getString(1);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            list.add(string);
            linkedHashMap.put(jSONArray2.getString(0), list);
        }
        return linkedHashMap;
    }
}
