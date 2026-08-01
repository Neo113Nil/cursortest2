package P0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public W0.a f620a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f621b = d.f623b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f622c = this;

    public c(W0.a aVar) {
        this.f620a = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f621b;
        d dVar = d.f623b;
        if (obj2 != dVar) {
            return obj2;
        }
        synchronized (this.f622c) {
            obj = this.f621b;
            if (obj == dVar) {
                W0.a aVar = this.f620a;
                X0.d.b(aVar);
                obj = aVar.a();
                this.f621b = obj;
                this.f620a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f621b != d.f623b ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
