package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes5.dex */
public final class kh2 {

    @NotNull
    public static final jh2 Companion = new jh2();
    public final String a;
    public final String b;

    public kh2(int i, String str, String str2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ih2.b);
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh2)) {
            return false;
        }
        kh2 kh2Var = (kh2) obj;
        return Intrinsics.areEqual(this.a, kh2Var.a) && Intrinsics.areEqual(this.b, kh2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PrefetchedMediationNetworkWinner(networkName=" + this.a + ", networkAdUnit=" + this.b + ")";
    }

    public kh2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
