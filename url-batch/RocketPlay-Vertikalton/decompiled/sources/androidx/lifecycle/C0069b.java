package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0069b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1886a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1887b;

    public C0069b(int i, Method method) {
        this.f1886a = i;
        this.f1887b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0069b)) {
            return false;
        }
        C0069b c0069b = (C0069b) obj;
        return this.f1886a == c0069b.f1886a && this.f1887b.getName().equals(c0069b.f1887b.getName());
    }

    public final int hashCode() {
        return this.f1887b.getName().hashCode() + (this.f1886a * 31);
    }
}
