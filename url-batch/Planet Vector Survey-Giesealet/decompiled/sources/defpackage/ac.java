package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class ac implements i00, Serializable {
    public transient i00 d;
    public final Object e;
    public final Class f;
    public final String g;
    public final String h;
    public final boolean i;

    public ac(Object obj, Class cls, String str, String str2, boolean z) {
        this.e = obj;
        this.f = cls;
        this.g = str;
        this.h = str2;
        this.i = z;
    }

    public abstract i00 d();

    public final kd e() {
        boolean z = this.i;
        Class cls = this.f;
        if (!z) {
            return hj0.a(cls);
        }
        hj0.a.getClass();
        return new gd0(cls);
    }
}
