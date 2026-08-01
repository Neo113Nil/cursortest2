package U0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class g implements b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public g1.g f866a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f867b = h.f869a;

    /* renamed from: c, reason: collision with root package name */
    public final Object f868c = this;

    /* JADX WARN: Multi-variable type inference failed */
    public g(f1.a aVar) {
        this.f866a = (g1.g) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [f1.a, g1.g, java.lang.Object] */
    public final Object a() {
        Object obj;
        Object obj2 = this.f867b;
        h hVar = h.f869a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f868c) {
            obj = this.f867b;
            if (obj == hVar) {
                ?? r12 = this.f866a;
                g1.f.b(r12);
                obj = r12.c();
                this.f867b = obj;
                this.f866a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f867b != h.f869a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
