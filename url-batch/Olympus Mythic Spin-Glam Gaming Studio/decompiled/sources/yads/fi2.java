package yads;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes14.dex */
public final class fi2 {

    @NotNull
    public static final ei2 Companion = new ei2();
    public static final Lazy[] c = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, di2.b)};
    public final String a;
    public final ii2 b;

    public fi2(int i, String str, ii2 ii2Var) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ci2.b);
        }
        this.a = str;
        this.b = ii2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi2)) {
            return false;
        }
        fi2 fi2Var = (fi2) obj;
        return Intrinsics.areEqual(this.a, fi2Var.a) && this.b == fi2Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PreloadBlock(adUnitId=" + this.a + ", format=" + this.b + ")";
    }

    public fi2(String str, ii2 ii2Var) {
        this.a = str;
        this.b = ii2Var;
    }
}
