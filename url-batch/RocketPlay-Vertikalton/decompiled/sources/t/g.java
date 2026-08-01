package t;

import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f4143m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof k) {
            this.f4137e = 2;
        } else {
            this.f4137e = 3;
        }
    }

    @Override // t.f
    public final void d(int i) {
        if (this.f4140j) {
            return;
        }
        this.f4140j = true;
        this.f4139g = i;
        Iterator it = this.f4141k.iterator();
        while (it.hasNext()) {
            InterfaceC0367d interfaceC0367d = (InterfaceC0367d) it.next();
            interfaceC0367d.a(interfaceC0367d);
        }
    }
}
