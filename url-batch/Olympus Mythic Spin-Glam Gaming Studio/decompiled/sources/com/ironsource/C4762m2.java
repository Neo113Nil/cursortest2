package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.a;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.m2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4762m2 {

    @NotNull
    public static final b h = new b(null);

    @Nullable
    private final String a;

    @NotNull
    private final com.ironsource.mediationsdk.demandOnly.a b;

    @NotNull
    private final C4834q2 c;

    @Nullable
    private final JSONObject d;

    @Nullable
    private final JSONObject e;

    @Nullable
    private final C4655g2 f;

    @Nullable
    private final C4851r2 g;

    /* renamed from: com.ironsource.m2$a */
    public static final class a {

        @NotNull
        private final JSONObject a;

        @NotNull
        private final String b;

        @Nullable
        private final String c;

        @NotNull
        private final com.ironsource.mediationsdk.demandOnly.a d;

        @NotNull
        private final C4834q2 e;

        @Nullable
        private final JSONObject f;

        @Nullable
        private final JSONObject g;

        @Nullable
        private final C4655g2 h;

        @Nullable
        private final C4851r2 i;

        public a(@NotNull JSONObject auctionData, @NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            this.a = auctionData;
            this.b = instanceId;
            JSONObject a = a(auctionData);
            this.c = auctionData.optString("auctionId");
            com.ironsource.mediationsdk.demandOnly.a a2 = a(auctionData, a);
            this.d = a2;
            this.e = c(a);
            this.f = d(a);
            this.g = b(a);
            this.h = a(a2, instanceId);
            this.i = b(a2, instanceId);
        }

        private final JSONObject d(JSONObject jSONObject) {
            return jSONObject.optJSONObject("genericParams");
        }

        @NotNull
        public final C4762m2 a() {
            return new C4762m2(this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        @NotNull
        public final JSONObject b() {
            return this.a;
        }

        @NotNull
        public final String c() {
            return this.b;
        }

        private final JSONObject b(JSONObject jSONObject) {
            return jSONObject.optJSONObject("configurations");
        }

        private final C4834q2 c(JSONObject jSONObject) {
            return new C4834q2(jSONObject);
        }

        private final C4851r2 b(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C4834q2 a = aVar.a(str);
            if (a == null) {
                return null;
            }
            String k = a.k();
            Intrinsics.checkNotNullExpressionValue(k, "it.serverData");
            return new C4851r2(k);
        }

        private final JSONObject a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("settings");
            return optJSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject;
        }

        private final com.ironsource.mediationsdk.demandOnly.a a(JSONObject jSONObject, JSONObject jSONObject2) {
            ArrayList arrayList = new ArrayList();
            JSONObject optJSONObject = jSONObject2.optJSONObject(com.ironsource.mediationsdk.d.d);
            JSONArray optJSONArray = jSONObject.optJSONArray(com.ironsource.mediationsdk.d.h);
            if (optJSONArray != null) {
                IntRange until = RangesKt.until(0, optJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                Iterator it = until.iterator();
                while (it.hasNext()) {
                    int nextInt = ((IntIterator) it).nextInt();
                    C4834q2 c4834q2 = new C4834q2(optJSONArray.getJSONObject(nextInt), nextInt, optJSONObject);
                    if (!c4834q2.n()) {
                        c4834q2 = null;
                    }
                    if (c4834q2 != null) {
                        arrayList2.add(c4834q2);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new a.C1370a(arrayList);
        }

        private final C4655g2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C4834q2 a = aVar.a(str);
            if (a == null) {
                return null;
            }
            C4655g2 c4655g2 = new C4655g2();
            c4655g2.a(a.b());
            c4655g2.c(a.h());
            c4655g2.b(a.g());
            return c4655g2;
        }
    }

    /* renamed from: com.ironsource.m2$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Object a(@NotNull JSONObject auctionData, @NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            return a(new a(auctionData, instanceId).a(), instanceId);
        }

        private b() {
        }

        private final Object a(C4762m2 c4762m2, String str) {
            String b = c4762m2.b();
            if (b != null && b.length() != 0) {
                if (c4762m2.i()) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m8023constructorimpl(ResultKt.createFailure(new C4571b8(C4908u5.a.f())));
                }
                C4834q2 a = c4762m2.a(str);
                if (a == null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m8023constructorimpl(ResultKt.createFailure(new C4571b8(C4908u5.a.j())));
                }
                String k = a.k();
                if (k != null && k.length() != 0) {
                    return Result.m8023constructorimpl(c4762m2);
                }
                Result.Companion companion3 = Result.INSTANCE;
                return Result.m8023constructorimpl(ResultKt.createFailure(new C4571b8(C4908u5.a.e())));
            }
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(new C4571b8(C4908u5.a.i())));
        }
    }

    public C4762m2(@Nullable String str, @NotNull com.ironsource.mediationsdk.demandOnly.a waterfall, @NotNull C4834q2 genericNotifications, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable C4655g2 c4655g2, @Nullable C4851r2 c4851r2) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Intrinsics.checkNotNullParameter(genericNotifications, "genericNotifications");
        this.a = str;
        this.b = waterfall;
        this.c = genericNotifications;
        this.d = jSONObject;
        this.e = jSONObject2;
        this.f = c4655g2;
        this.g = c4851r2;
    }

    @Nullable
    public final String a() {
        C4851r2 c4851r2 = this.g;
        if (c4851r2 != null) {
            return c4851r2.d();
        }
        return null;
    }

    @Nullable
    public final String b() {
        return this.a;
    }

    @Nullable
    public final C4655g2 c() {
        return this.f;
    }

    @Nullable
    public final JSONObject d() {
        return this.e;
    }

    @NotNull
    public final C4834q2 e() {
        return this.c;
    }

    @Nullable
    public final JSONObject f() {
        return this.d;
    }

    @Nullable
    public final C4851r2 g() {
        return this.g;
    }

    @NotNull
    public final com.ironsource.mediationsdk.demandOnly.a h() {
        return this.b;
    }

    public final boolean i() {
        return this.b.isEmpty();
    }

    @Nullable
    public final C4834q2 a(@NotNull String providerName) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return a(this.b, providerName);
    }

    private final C4834q2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
        return aVar.a(str);
    }
}
