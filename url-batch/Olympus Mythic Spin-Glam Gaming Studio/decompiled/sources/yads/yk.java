package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yk {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public yk(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk)) {
            return false;
        }
        yk ykVar = (yk) obj;
        return Intrinsics.areEqual(this.a, ykVar.a) && Intrinsics.areEqual(this.b, ykVar.b) && Intrinsics.areEqual(this.c, ykVar.c) && Intrinsics.areEqual(this.d, ykVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundColors(top=" + this.a + ", right=" + this.b + ", left=" + this.c + ", bottom=" + this.d + ")";
    }
}
