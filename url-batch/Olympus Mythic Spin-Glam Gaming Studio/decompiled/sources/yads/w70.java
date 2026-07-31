package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class w70 extends x70 {
    public final String b;

    public w70(String str) {
        super(str);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w70) && Intrinsics.areEqual(this.b, ((w70) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "MediationNetwork(network=" + this.b + ")";
    }
}
