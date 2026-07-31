package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes6.dex */
public final class e40 {

    @NotNull
    public static final d40 Companion = new d40();
    public final String a;
    public final String b;
    public final String c;
    public final p40 d;

    public e40(int i, String str, String str2, String str3, p40 p40Var) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, c40.b);
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = p40Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e40)) {
            return false;
        }
        e40 e40Var = (e40) obj;
        return Intrinsics.areEqual(this.a, e40Var.a) && Intrinsics.areEqual(this.b, e40Var.b) && Intrinsics.areEqual(this.c, e40Var.c) && Intrinsics.areEqual(this.d, e40Var.d);
    }

    public final int hashCode() {
        int a = c4.a(c4.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        p40 p40Var = this.d;
        return a + (p40Var == null ? 0 : p40Var.hashCode());
    }

    public final String toString() {
        return "DebugPanelAdUnit(name=" + this.a + ", format=" + this.b + ", adUnitId=" + this.c + ", mediation=" + this.d + ")";
    }
}
