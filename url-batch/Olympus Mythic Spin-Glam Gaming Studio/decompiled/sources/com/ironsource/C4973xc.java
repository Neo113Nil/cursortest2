package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.xc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4973xc {

    @Nullable
    private final C4762m2 a;
    private final boolean b;

    /* renamed from: com.ironsource.xc$a */
    public static final class a {

        @NotNull
        public static final a a = new a();

        @NotNull
        public static final String b = "adm";

        @NotNull
        public static final String c = "isOneFlow";

        @NotNull
        public static final String d = "isMultipleAdObjects";

        @NotNull
        public static final String e = "adsInternalInfo";

        @NotNull
        public static final String f = "success";

        @NotNull
        public static final String g = "error";

        @NotNull
        public static final String h = "data";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4973xc() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final HashMap<String, String> a() {
        C4851r2 g;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("isOneFlow", String.valueOf(this.b));
        hashMap.put("isMultipleAdObjects", "true");
        List<P> a2 = Kb.u.d().I().a();
        String jSONObject = a2 != null ? IronSourceNetworkBridge.jsonObjectInit().put("success", true).put("data", a2).toString() : IronSourceNetworkBridge.jsonObjectInit().put("success", false).put("error", "Failed to get ad internal info").toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "if (jsonAdInternalInfo !…    .toString()\n        }");
        hashMap.put(a.e, jSONObject);
        C4762m2 c4762m2 = this.a;
        if (c4762m2 != null && (g = c4762m2.g()) != null) {
            hashMap.put("adm", g.a());
            hashMap.putAll(g.b());
        }
        return hashMap;
    }

    public C4973xc(@Nullable C4762m2 c4762m2, boolean z) {
        this.a = c4762m2;
        this.b = z;
    }

    public /* synthetic */ C4973xc(C4762m2 c4762m2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c4762m2, (i & 2) != 0 ? false : z);
    }
}
