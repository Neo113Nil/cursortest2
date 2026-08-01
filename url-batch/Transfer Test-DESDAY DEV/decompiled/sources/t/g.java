package t;

import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends C0335f {

    /* renamed from: m, reason: collision with root package name */
    public int f3748m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f3742e = 2;
        } else {
            this.f3742e = 3;
        }
    }

    @Override // t.C0335f
    public final void d(int i) {
        if (this.f3745j) {
            return;
        }
        this.f3745j = true;
        this.f3744g = i;
        Iterator it = this.f3746k.iterator();
        while (it.hasNext()) {
            InterfaceC0333d interfaceC0333d = (InterfaceC0333d) it.next();
            interfaceC0333d.a(interfaceC0333d);
        }
    }
}
