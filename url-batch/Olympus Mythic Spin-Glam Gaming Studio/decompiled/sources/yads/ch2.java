package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes3.dex */
public final class ch2 {

    @NotNull
    public static final bh2 Companion = new bh2();
    public final String a;
    public final kh2 b;
    public final bi2 c;
    public final vh2 d;
    public final String e;

    public ch2(int i, String str, kh2 kh2Var, bi2 bi2Var, vh2 vh2Var, String str2) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, ah2.b);
        }
        this.a = str;
        this.b = kh2Var;
        this.c = bi2Var;
        this.d = vh2Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch2)) {
            return false;
        }
        ch2 ch2Var = (ch2) obj;
        return Intrinsics.areEqual(this.a, ch2Var.a) && Intrinsics.areEqual(this.b, ch2Var.b) && Intrinsics.areEqual(this.c, ch2Var.c) && Intrinsics.areEqual(this.d, ch2Var.d) && Intrinsics.areEqual(this.e, ch2Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kh2 kh2Var = this.b;
        int hashCode2 = (hashCode + (kh2Var == null ? 0 : kh2Var.hashCode())) * 31;
        bi2 bi2Var = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (bi2Var == null ? 0 : bi2Var.hashCode())) * 31)) * 31;
        String str = this.e;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PrefetchedMediationInfo(adapter=" + this.a + ", networkWinner=" + this.b + ", revenue=" + this.c + ", result=" + this.d + ", networkAdInfo=" + this.e + ")";
    }

    public ch2(String str, kh2 kh2Var, bi2 bi2Var, vh2 vh2Var, String str2) {
        this.a = str;
        this.b = kh2Var;
        this.c = bi2Var;
        this.d = vh2Var;
        this.e = str2;
    }
}
