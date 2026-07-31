package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ci0 implements ym {
    public final String a;
    public final ri0 b;
    public final ArrayList c;

    public ci0(String str, ri0 ri0Var, ArrayList arrayList) {
        this.a = str;
        this.b = ri0Var;
        this.c = arrayList;
    }

    @Override // yads.j0
    public final String a() {
        return this.a;
    }

    @Override // yads.ym
    public final List b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci0)) {
            return false;
        }
        ci0 ci0Var = (ci0) obj;
        return Intrinsics.areEqual(this.a, ci0Var.a) && Intrinsics.areEqual(this.b, ci0Var.b) && Intrinsics.areEqual(this.c, ci0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DivKitAdtuneAction(actionType=" + this.a + ", design=" + this.b + ", trackingUrls=" + this.c + ")";
    }
}
