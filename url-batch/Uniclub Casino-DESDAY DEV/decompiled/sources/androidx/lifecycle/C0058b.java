package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1352a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1353b;

    public C0058b(int i, Method method) {
        this.f1352a = i;
        this.f1353b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0058b)) {
            return false;
        }
        C0058b c0058b = (C0058b) obj;
        return this.f1352a == c0058b.f1352a && this.f1353b.getName().equals(c0058b.f1353b.getName());
    }

    public final int hashCode() {
        return this.f1353b.getName().hashCode() + (this.f1352a * 31);
    }
}
