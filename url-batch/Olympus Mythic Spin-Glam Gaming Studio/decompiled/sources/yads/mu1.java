package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class mu1 implements nu1 {
    public final List a;

    public mu1(List list) {
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mu1) && Intrinsics.areEqual(this.a, ((mu1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "IncorrectIntegration(causes=" + this.a + ")";
    }
}
