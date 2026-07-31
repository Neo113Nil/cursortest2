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
/* loaded from: classes14.dex */
public final class fv1 {

    @NotNull
    public static final ev1 Companion = new ev1();
    public static final Lazy[] e = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, dv1.b), null};
    public final long a;
    public final Integer b;
    public final Map c;
    public final String d;

    public fv1(int i, long j, Integer num, Map map, String str) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, cv1.b);
        }
        this.a = j;
        this.b = num;
        this.c = map;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv1)) {
            return false;
        }
        fv1 fv1Var = (fv1) obj;
        return this.a == fv1Var.a && Intrinsics.areEqual(this.b, fv1Var.b) && Intrinsics.areEqual(this.c, fv1Var.c) && Intrinsics.areEqual(this.d, fv1Var.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Map map = this.c;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.d;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MobileAdsNetworkResponseLog(timestamp=" + this.a + ", statusCode=" + this.b + ", headers=" + this.c + ", body=" + this.d + ")";
    }

    public fv1(long j, Integer num, Map map, String str) {
        this.a = j;
        this.b = num;
        this.c = map;
        this.d = str;
    }
}
