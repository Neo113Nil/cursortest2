package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1350a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1351b;

    public C0059b(int i, Method method) {
        this.f1350a = i;
        this.f1351b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0059b)) {
            return false;
        }
        C0059b c0059b = (C0059b) obj;
        return this.f1350a == c0059b.f1350a && this.f1351b.getName().equals(c0059b.f1351b.getName());
    }

    public final int hashCode() {
        return this.f1351b.getName().hashCode() + (this.f1350a * 31);
    }
}
