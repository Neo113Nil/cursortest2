package yads;

import android.content.Context;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes15.dex */
public final class ju0 implements l03 {
    public final k03 a;
    public final xl b;
    public final int c;
    public final int d;
    public final String e;

    public ju0(int i, int i2, k03 k03Var, xl xlVar, int i3) {
        xlVar = (i3 & 8) != 0 ? null : xlVar;
        this.a = k03Var;
        this.b = xlVar;
        this.c = (i >= 0 || -1 == i) ? i : 0;
        this.d = (i2 >= 0 || -2 == i2) ? i2 : 0;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        this.e = format;
    }

    @Override // yads.l03
    public final xl a() {
        return this.b;
    }

    @Override // yads.l03
    public final k03 b() {
        return this.a;
    }

    @Override // yads.l03
    public final int c(Context context) {
        int i = this.c;
        return -1 == i ? hl3.d(context) : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(ju0.class, obj.getClass())) {
            return false;
        }
        ju0 ju0Var = (ju0) obj;
        if (this.c != ju0Var.c) {
            return false;
        }
        return this.d == ju0Var.d && this.a == ju0Var.a;
    }

    @Override // yads.l03
    public final int getHeight() {
        return this.d;
    }

    @Override // yads.l03
    public final int getWidth() {
        return this.c;
    }

    public final int hashCode() {
        return this.a.hashCode() + c4.a(((this.c * 31) + this.d) * 31, 31, this.e);
    }

    public final String toString() {
        return this.e;
    }

    @Override // yads.l03
    public final int a(Context context) {
        int i = this.d;
        return -2 == i ? hl3.b(context) : i;
    }
}
