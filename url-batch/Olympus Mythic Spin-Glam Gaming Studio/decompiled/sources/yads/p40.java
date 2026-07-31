package yads;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes3.dex */
public final class p40 {

    @NotNull
    public static final o40 Companion = new o40();
    public static final Lazy[] c;
    public final List a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, m40.b), LazyKt.lazy(lazyThreadSafetyMode, n40.b)};
    }

    public p40(int i, List list, List list2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, l40.b);
        }
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p40)) {
            return false;
        }
        p40 p40Var = (p40) obj;
        return Intrinsics.areEqual(this.a, p40Var.a) && Intrinsics.areEqual(this.b, p40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitMediation(waterfall=" + this.a + ", bidding=" + this.b + ")";
    }
}
