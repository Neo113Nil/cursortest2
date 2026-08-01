package t;

import java.util.Iterator;

/* renamed from: t.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0307g extends C0306f {

    /* renamed from: m, reason: collision with root package name */
    public int f3779m;

    public C0307g(AbstractC0315o abstractC0315o) {
        super(abstractC0315o);
        if (abstractC0315o instanceof C0311k) {
            this.f3773e = 2;
        } else {
            this.f3773e = 3;
        }
    }

    @Override // t.C0306f
    public final void d(int i) {
        if (this.f3776j) {
            return;
        }
        this.f3776j = true;
        this.f3775g = i;
        Iterator it = this.f3777k.iterator();
        while (it.hasNext()) {
            InterfaceC0304d interfaceC0304d = (InterfaceC0304d) it.next();
            interfaceC0304d.a(interfaceC0304d);
        }
    }
}
