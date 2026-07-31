package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class tw2 implements rq2 {
    public final int a;
    public final String b;

    public tw2(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw2)) {
            return false;
        }
        tw2 tw2Var = (tw2) obj;
        return this.a == tw2Var.a && Intrinsics.areEqual(this.b, tw2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SdkReward(amount=" + this.a + ", type=" + this.b + ")";
    }
}
