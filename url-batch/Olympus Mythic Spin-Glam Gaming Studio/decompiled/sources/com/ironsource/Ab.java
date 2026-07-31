package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class Ab {

    @NotNull
    public static final a c = new a(null);

    @NotNull
    public static final String d = "revenue";

    @NotNull
    public static final String e = "precision";
    private final double a;

    @NotNull
    private final String b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Ab a(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                double d = json.getDouble("revenue");
                String precision = json.getString("precision");
                Intrinsics.checkNotNullExpressionValue(precision, "precision");
                return new Ab(d, precision);
            } catch (Exception e) {
                C4782n4.d().a(e);
                Jf.a(e);
                return null;
            }
        }

        private a() {
        }
    }

    public Ab(double d2, @NotNull String precision) {
        Intrinsics.checkNotNullParameter(precision, "precision");
        this.a = d2;
        this.b = precision;
    }

    public final double a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.b;
    }

    public final double d() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ab)) {
            return false;
        }
        Ab ab = (Ab) obj;
        return Double.compare(this.a, ab.a) == 0 && Intrinsics.areEqual(this.b, ab.b);
    }

    public int hashCode() {
        return (Double.hashCode(this.a) * 31) + this.b.hashCode();
    }

    @NotNull
    public String toString() {
        return "LoadArmData(revenue=" + this.a + ", precision=" + this.b + ")";
    }

    @NotNull
    public final Ab a(double d2, @NotNull String precision) {
        Intrinsics.checkNotNullParameter(precision, "precision");
        return new Ab(d2, precision);
    }

    public static /* synthetic */ Ab a(Ab ab, double d2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d2 = ab.a;
        }
        if ((i & 2) != 0) {
            str = ab.b;
        }
        return ab.a(d2, str);
    }

    @Nullable
    public static final Ab a(@NotNull JSONObject jSONObject) {
        return c.a(jSONObject);
    }
}
