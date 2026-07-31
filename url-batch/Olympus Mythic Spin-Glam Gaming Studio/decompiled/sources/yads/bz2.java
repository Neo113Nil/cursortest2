package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bz2 {
    public final String a;
    public final Long b;
    public final boolean c;
    public final boolean d;
    public final j03 e;

    public bz2(String str, Long l, boolean z, boolean z2, j03 j03Var) {
        this.a = str;
        this.b = l;
        this.c = z;
        this.d = z2;
        this.e = j03Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz2)) {
            return false;
        }
        bz2 bz2Var = (bz2) obj;
        return Intrinsics.areEqual(this.a, bz2Var.a) && Intrinsics.areEqual(this.b, bz2Var.b) && this.c == bz2Var.c && this.d == bz2Var.d && Intrinsics.areEqual(this.e, bz2Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int hashCode2 = (Boolean.hashCode(this.d) + ((Boolean.hashCode(this.c) + ((hashCode + (l == null ? 0 : l.hashCode())) * 31)) * 31)) * 31;
        j03 j03Var = this.e;
        return hashCode2 + (j03Var != null ? j03Var.hashCode() : 0);
    }

    public final String toString() {
        return "Settings(templateType=" + this.a + ", multiBannerAutoScrollInterval=" + this.b + ", isHighlightingEnabled=" + this.c + ", isLoopingVideo=" + this.d + ", mediaAssetImageFallbackSize=" + this.e + ")";
    }
}
