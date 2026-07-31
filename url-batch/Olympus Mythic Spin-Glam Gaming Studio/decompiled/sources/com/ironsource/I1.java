package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class I1 {

    @Nullable
    private final String a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final int e;

    @NotNull
    private final String f;

    @NotNull
    private final String g;
    private final int h;
    private final int i;
    private final int j;

    @NotNull
    private final List<Integer> k;

    @NotNull
    private final List<Integer> l;

    @NotNull
    private final List<Integer> m;

    @NotNull
    private final List<Integer> n;

    public I1(@NotNull JSONObject applicationEvents) {
        Intrinsics.checkNotNullParameter(applicationEvents, "applicationEvents");
        String it = applicationEvents.optString("abt");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this.a = it.length() <= 0 ? null : it;
        this.b = applicationEvents.optBoolean(K1.a, false);
        this.c = applicationEvents.optBoolean(K1.b, false);
        this.d = applicationEvents.optBoolean(K1.c, false);
        this.e = applicationEvents.optInt(K1.d, -1);
        String optString = applicationEvents.optString(K1.e);
        Intrinsics.checkNotNullExpressionValue(optString, "applicationEvents.optStr…(SERVER_EVENTS_URL_FIELD)");
        this.f = optString;
        String optString2 = applicationEvents.optString(K1.f);
        Intrinsics.checkNotNullExpressionValue(optString2, "applicationEvents.optString(SERVER_EVENTS_TYPE)");
        this.g = optString2;
        this.h = applicationEvents.optInt(K1.g, -1);
        this.i = applicationEvents.optInt(K1.h, -1);
        this.j = applicationEvents.optInt(K1.i, 5000);
        this.k = a(applicationEvents, K1.j);
        this.l = a(applicationEvents, K1.k);
        this.m = a(applicationEvents, K1.l);
        this.n = a(applicationEvents, K1.m);
    }

    @Nullable
    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.h;
    }

    public final boolean c() {
        return this.d;
    }

    public final int d() {
        return this.e;
    }

    @NotNull
    public final String e() {
        return this.g;
    }

    public final int f() {
        return this.j;
    }

    public final int g() {
        return this.i;
    }

    @NotNull
    public final List<Integer> h() {
        return this.n;
    }

    @NotNull
    public final List<Integer> i() {
        return this.l;
    }

    @NotNull
    public final List<Integer> j() {
        return this.k;
    }

    public final boolean k() {
        return this.c;
    }

    public final boolean l() {
        return this.b;
    }

    @NotNull
    public final String m() {
        return this.f;
    }

    @NotNull
    public final List<Integer> n() {
        return this.m;
    }

    private final List<Integer> a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return CollectionsKt.emptyList();
        }
        IntRange until = RangesKt.until(0, optJSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(optJSONArray.getInt(((IntIterator) it).nextInt())));
        }
        return arrayList;
    }
}
