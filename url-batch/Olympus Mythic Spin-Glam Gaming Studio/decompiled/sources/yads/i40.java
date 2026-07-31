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
/* loaded from: classes4.dex */
public final class i40 {

    @NotNull
    public static final h40 Companion = new h40();
    public static final Lazy[] f = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, g40.b), null, null};
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;

    public i40(int i, String str, String str2, List list, String str3, String str4) {
        if (6 != (i & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i, 6, f40.b);
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        this.c = list;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i40)) {
            return false;
        }
        i40 i40Var = (i40) obj;
        return Intrinsics.areEqual(this.a, i40Var.a) && Intrinsics.areEqual(this.b, i40Var.b) && Intrinsics.areEqual(this.c, i40Var.c) && Intrinsics.areEqual(this.d, i40Var.d) && Intrinsics.areEqual(this.e, i40Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.c.hashCode() + c4.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAdUnitBiddingMediation(adapter=" + this.a + ", networkName=" + this.b + ", biddingParameters=" + this.c + ", adUnitId=" + this.d + ", networkAdUnitIdName=" + this.e + ")";
    }
}
