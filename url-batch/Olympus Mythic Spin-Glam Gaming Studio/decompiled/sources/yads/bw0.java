package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes4.dex */
public final class bw0 {

    @NotNull
    public static final aw0 Companion = new aw0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public bw0(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, zv0.b);
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
        if (!(obj instanceof bw0)) {
            return false;
        }
        bw0 bw0Var = (bw0) obj;
        return Intrinsics.areEqual(this.a, bw0Var.a) && Intrinsics.areEqual(this.b, bw0Var.b) && Intrinsics.areEqual(this.c, bw0Var.c) && Intrinsics.areEqual(this.d, bw0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + c4.a(c4.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "FontUrls(regular=" + this.a + ", bold=" + this.b + ", light=" + this.c + ", medium=" + this.d + ")";
    }
}
