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
/* loaded from: classes14.dex */
public final class xg2 {

    @NotNull
    public static final wg2 Companion = new wg2();
    public static final Lazy[] b = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, vg2.b)};
    public final List a;

    public xg2(int i, List list) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ug2.b);
        }
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xg2) && Intrinsics.areEqual(this.a, ((xg2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PrefetchedMediationData(mediationPrefetchAdapters=" + this.a + ")";
    }

    public xg2(List list) {
        this.a = list;
    }
}
