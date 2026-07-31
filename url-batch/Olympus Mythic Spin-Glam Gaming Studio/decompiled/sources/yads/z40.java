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
/* loaded from: classes5.dex */
public final class z40 {

    @NotNull
    public static final y40 Companion = new y40();
    public static final Lazy[] g;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final xa0 e;
    public final List f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, w40.b), null, null, LazyKt.lazy(lazyThreadSafetyMode, x40.b)};
    }

    public z40(int i, String str, String str2, List list, String str3, xa0 xa0Var, List list2) {
        if (54 != (i & 54)) {
            PluginExceptionsKt.throwMissingFieldException(i, 54, v40.b);
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
        this.e = xa0Var;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z40)) {
            return false;
        }
        z40 z40Var = (z40) obj;
        return Intrinsics.areEqual(this.a, z40Var.a) && Intrinsics.areEqual(this.b, z40Var.b) && Intrinsics.areEqual(this.c, z40Var.c) && Intrinsics.areEqual(this.d, z40Var.d) && Intrinsics.areEqual(this.e, z40Var.e) && Intrinsics.areEqual(this.f, z40Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.c.hashCode() + c4.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        xa0 xa0Var = this.e;
        return this.f.hashCode() + ((hashCode2 + (xa0Var != null ? xa0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitWaterfallMediation(adapter=" + this.a + ", networkName=" + this.b + ", waterfallParameters=" + this.c + ", networkAdUnitIdName=" + this.d + ", currency=" + this.e + ", cpmFloors=" + this.f + ")";
    }
}
