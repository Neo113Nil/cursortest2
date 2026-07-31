package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes4.dex */
public final class yd2 {

    @NotNull
    public static final xd2 Companion = new xd2();
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public yd2(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd2)) {
            return false;
        }
        yd2 yd2Var = (yd2) obj;
        return Intrinsics.areEqual(this.a, yd2Var.a) && Intrinsics.areEqual(this.b, yd2Var.b) && Intrinsics.areEqual(this.c, yd2Var.c) && Intrinsics.areEqual(this.d, yd2Var.d) && Intrinsics.areEqual(this.e, yd2Var.e);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.e;
        return hashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        return "PlayBackOptimizationConfig(minBufferMs=" + this.a + ", maxBufferMs=" + this.b + ", bufferForPlaybackMs=" + this.c + ", bufferForPlaybackAfterRebufferMs=" + this.d + ", targetBufferBytes=" + this.e + ")";
    }
}
