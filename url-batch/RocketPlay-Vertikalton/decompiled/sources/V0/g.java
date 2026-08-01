package V0;

import h1.InterfaceC0173a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class g implements b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0173a f1246a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f1247b = h.f1249a;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1248c = this;

    public g(InterfaceC0173a interfaceC0173a) {
        this.f1246a = interfaceC0173a;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f1247b;
        h hVar = h.f1249a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f1248c) {
            obj = this.f1247b;
            if (obj == hVar) {
                InterfaceC0173a interfaceC0173a = this.f1246a;
                i1.f.b(interfaceC0173a);
                obj = interfaceC0173a.c();
                this.f1247b = obj;
                this.f1246a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f1247b != h.f1249a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
