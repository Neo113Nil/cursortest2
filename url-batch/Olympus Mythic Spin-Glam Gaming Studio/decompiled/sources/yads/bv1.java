package yads;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes4.dex */
public final class bv1 {

    @NotNull
    public static final av1 Companion = new av1();
    public static final Lazy[] f = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, zu1.b), null};
    public final long a;
    public final String b;
    public final String c;
    public final Map d;
    public final String e;

    public bv1(int i, long j, String str, String str2, Map map, String str3) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, yu1.b);
        }
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = map;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv1)) {
            return false;
        }
        bv1 bv1Var = (bv1) obj;
        return this.a == bv1Var.a && Intrinsics.areEqual(this.b, bv1Var.b) && Intrinsics.areEqual(this.c, bv1Var.c) && Intrinsics.areEqual(this.d, bv1Var.d) && Intrinsics.areEqual(this.e, bv1Var.e);
    }

    public final int hashCode() {
        int a = c4.a(c4.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Map map = this.d;
        int hashCode = (a + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MobileAdsNetworkRequestLog(timestamp=" + this.a + ", method=" + this.b + ", url=" + this.c + ", headers=" + this.d + ", body=" + this.e + ")";
    }

    public bv1(long j, String str, String str2, Map map, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = map;
        this.e = str3;
    }
}
