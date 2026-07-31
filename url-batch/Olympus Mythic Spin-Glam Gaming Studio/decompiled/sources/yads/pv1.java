package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes3.dex */
public final class pv1 {

    @NotNull
    public static final ov1 Companion = new ov1();
    public final long a;
    public final String b;
    public final String c;
    public final String d;

    public pv1(int i, long j, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, nv1.b);
        }
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv1)) {
            return false;
        }
        pv1 pv1Var = (pv1) obj;
        return this.a == pv1Var.a && Intrinsics.areEqual(this.b, pv1Var.b) && Intrinsics.areEqual(this.c, pv1Var.c) && Intrinsics.areEqual(this.d, pv1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + c4.a(c4.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "MobileAdsSdkLog(timestamp=" + this.a + ", type=" + this.b + ", tag=" + this.c + ", text=" + this.d + ")";
    }

    public pv1(long j, String str, String str2, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
