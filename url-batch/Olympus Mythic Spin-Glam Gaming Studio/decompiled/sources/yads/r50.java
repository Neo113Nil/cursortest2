package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes3.dex */
public final class r50 {

    @NotNull
    public static final q50 Companion = new q50();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public r50(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, p50.b);
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r50)) {
            return false;
        }
        r50 r50Var = (r50) obj;
        return Intrinsics.areEqual(this.a, r50Var.a) && Intrinsics.areEqual(this.b, r50Var.b) && Intrinsics.areEqual(this.c, r50Var.c) && Intrinsics.areEqual(this.d, r50Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + c4.a(c4.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "DebugPanelAppData(appId=" + this.a + ", appVersion=" + this.b + ", system=" + this.c + ", androidApiLevel=" + this.d + ")";
    }

    public r50(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
