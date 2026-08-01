package t;

import java.util.Iterator;

/* renamed from: t.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0308g extends C0307f {

    /* renamed from: m, reason: collision with root package name */
    public int f3763m;

    public C0308g(AbstractC0316o abstractC0316o) {
        super(abstractC0316o);
        if (abstractC0316o instanceof C0312k) {
            this.f3757e = 2;
        } else {
            this.f3757e = 3;
        }
    }

    @Override // t.C0307f
    public final void d(int i) {
        if (this.f3760j) {
            return;
        }
        this.f3760j = true;
        this.f3759g = i;
        Iterator it = this.f3761k.iterator();
        while (it.hasNext()) {
            InterfaceC0305d interfaceC0305d = (InterfaceC0305d) it.next();
            interfaceC0305d.a(interfaceC0305d);
        }
    }
}
