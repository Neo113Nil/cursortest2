package yads;

import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes13.dex */
public final class bi2 {

    @NotNull
    public static final ai2 Companion = new ai2();
    public final double a;

    public bi2(double d) {
        this.a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bi2) && Double.compare(this.a, ((bi2) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final String toString() {
        return "PrefetchedMediationRevenue(value=" + this.a + ")";
    }

    public bi2(int i, double d) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, zh2.b);
        }
        this.a = d;
    }
}
