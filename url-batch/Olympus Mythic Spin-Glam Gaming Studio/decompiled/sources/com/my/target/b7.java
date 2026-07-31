package com.my.target;

import android.content.Context;
import android.util.SizeF;
import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class b7 {
    private final Context a;
    private final SizeF b;
    private final SizeF c;

    public b7(Context context, SizeF sizeF, SizeF sizeF2) {
        this.a = context;
        this.b = sizeF;
        this.c = sizeF2;
    }

    public Context a() {
        return this.a;
    }

    public SizeF b() {
        return this.b;
    }

    public SizeF c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b7 b7Var = (b7) obj;
            if (this.a.equals(b7Var.a) && this.b.equals(b7Var.b) && this.c.equals(b7Var.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public String toString() {
        return "InternalAdVisibilityData{context=" + this.a + ", fullSize=" + this.b + ", visibleSize=" + this.c + '}';
    }
}
