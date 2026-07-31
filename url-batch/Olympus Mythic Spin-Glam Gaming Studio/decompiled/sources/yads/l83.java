package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class l83 {
    public final m83 a;
    public final String b;
    public final String c;
    public final Integer d;

    public l83(m83 m83Var, String str, String str2, Integer num) {
        this.a = m83Var;
        this.b = str;
        this.c = str2;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l83)) {
            return false;
        }
        l83 l83Var = (l83) obj;
        return this.a == l83Var.a && Intrinsics.areEqual(this.b, l83Var.b) && Intrinsics.areEqual(this.c, l83Var.c) && Intrinsics.areEqual(this.d, l83Var.d);
    }

    public final int hashCode() {
        int a = c4.a(c4.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "CategorizedError(category=" + this.a + ", errorCode=" + this.b + ", errorMessage=" + this.c + ", httpCode=" + this.d + ")";
    }
}
