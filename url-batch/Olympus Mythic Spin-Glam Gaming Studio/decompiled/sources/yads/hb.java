package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hb implements ym {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final ArrayList e;

    public hb(String str, String str2, String str3, boolean z, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = arrayList;
    }

    @Override // yads.j0
    public final String a() {
        return this.a;
    }

    @Override // yads.ym
    public final List b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb)) {
            return false;
        }
        hb hbVar = (hb) obj;
        return Intrinsics.areEqual(this.a, hbVar.a) && Intrinsics.areEqual(this.b, hbVar.b) && Intrinsics.areEqual(this.c, hbVar.c) && this.d == hbVar.d && Intrinsics.areEqual(this.e, hbVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((Boolean.hashCode(this.d) + c4.a(c4.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        return "AdtuneAction(actionType=" + this.a + ", adtuneUrl=" + this.b + ", optOutUrl=" + this.c + ", darkTheme=" + this.d + ", trackingUrls=" + this.e + ")";
    }
}
