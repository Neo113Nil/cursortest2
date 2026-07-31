package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Gd {

    @NotNull
    private final Map<LevelPlay.AdFormat, a> a;

    public static final class a {

        @NotNull
        public static final C0344a c = new C0344a(null);

        @NotNull
        private static final String d = "adUnitId";

        @NotNull
        private static final String e = "instances";

        @NotNull
        private final Map<String, b> a;

        @NotNull
        private final List<c> b;

        /* renamed from: com.ironsource.Gd$a$a, reason: collision with other inner class name */
        public static final class C0344a {
            public /* synthetic */ C0344a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0344a() {
            }
        }

        public a(@NotNull JSONObject adFormatProviderOrder) {
            Intrinsics.checkNotNullParameter(adFormatProviderOrder, "adFormatProviderOrder");
            List<String> b = C4699ia.b(adFormatProviderOrder.names());
            b = b == null ? CollectionsKt.emptyList() : b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : b) {
                if (!Intrinsics.areEqual((String) obj, "preload")) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
            for (Object obj2 : arrayList) {
                JSONArray optJSONArray = adFormatProviderOrder.optJSONArray((String) obj2);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                } else {
                    Intrinsics.checkNotNullExpressionValue(optJSONArray, "adFormatProviderOrder.op…(adUnitId) ?: JSONArray()");
                }
                linkedHashMap.put(obj2, new b(optJSONArray));
            }
            this.a = linkedHashMap;
            this.b = b(adFormatProviderOrder);
        }

        @NotNull
        public final Map<String, b> a() {
            return this.a;
        }

        @NotNull
        public final List<c> b() {
            return this.b;
        }

        private final c a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            String optString = jSONObject.has("adUnitId") ? jSONObject.optString("adUnitId") : null;
            JSONArray optJSONArray = jSONObject.optJSONArray("instances");
            return new c(optString, optJSONArray != null ? C4699ia.b(optJSONArray) : null);
        }

        private final List<c> b(JSONObject jSONObject) {
            JSONArray optJSONArray = jSONObject.optJSONArray("preload");
            if (optJSONArray == null) {
                return CollectionsKt.emptyList();
            }
            IntRange until = RangesKt.until(0, optJSONArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator it = until.iterator();
            while (it.hasNext()) {
                c a = a(optJSONArray.optJSONObject(((IntIterator) it).nextInt()));
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        }
    }

    public static final class b {

        @NotNull
        private final List<String> a;

        public b(@NotNull JSONArray providerOrder) {
            Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
            List<String> b = C4699ia.b(providerOrder);
            Intrinsics.checkNotNullExpressionValue(b, "jsonArrayToStringList(providerOrder)");
            this.a = b;
        }

        @NotNull
        public final List<String> a() {
            return this.a;
        }
    }

    public static final class c {

        @Nullable
        private final String a;

        @Nullable
        private final List<String> b;

        public c(@Nullable String str, @Nullable List<String> list) {
            this.a = str;
            this.b = list;
        }

        @Nullable
        public final String a() {
            return this.a;
        }

        @Nullable
        public final List<String> b() {
            return this.b;
        }

        @Nullable
        public final String c() {
            return this.a;
        }

        @Nullable
        public final List<String> d() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.a, cVar.a) && Intrinsics.areEqual(this.b, cVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.b;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AdUnitPreloadConfig(adUnitId=" + this.a + ", instanceIds=" + this.b + ")";
        }

        @NotNull
        public final c a(@Nullable String str, @Nullable List<String> list) {
            return new c(str, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.a;
            }
            if ((i & 2) != 0) {
                list = cVar.b;
            }
            return cVar.a(str, list);
        }
    }

    public Gd(@NotNull JSONObject providerOrder) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
        for (LevelPlay.AdFormat adFormat : values) {
            JSONObject optJSONObject = providerOrder.optJSONObject(Jf.a(adFormat));
            if (optJSONObject == null) {
                optJSONObject = IronSourceNetworkBridge.jsonObjectInit();
            } else {
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "providerOrder.optJSONObj…dFormat)) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new a(optJSONObject));
        }
        this.a = linkedHashMap;
    }

    @NotNull
    public final Map<LevelPlay.AdFormat, a> a() {
        return this.a;
    }

    @NotNull
    public final List<c> a(@NotNull LevelPlay.AdFormat adFormat) {
        List<c> b2;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        a aVar = this.a.get(adFormat);
        return (aVar == null || (b2 = aVar.b()) == null) ? CollectionsKt.emptyList() : b2;
    }
}
