package u1;

import a1.AbstractC0067d;
import b1.InterfaceC0095d;
import q1.AbstractC0335a;
import q1.AbstractC0352s;

/* loaded from: classes.dex */
public class q extends AbstractC0335a implements InterfaceC0095d {
    public final Z0.d d;

    public q(Z0.d dVar, Z0.i iVar) {
        super(iVar, true);
        this.d = dVar;
    }

    @Override // q1.U
    public void d(Object obj) {
        a.c(AbstractC0067d.m(this.d), AbstractC0352s.h(obj), null);
    }

    @Override // q1.U
    public void e(Object obj) {
        this.d.resumeWith(AbstractC0352s.h(obj));
    }

    @Override // b1.InterfaceC0095d
    public final InterfaceC0095d getCallerFrame() {
        Z0.d dVar = this.d;
        if (dVar instanceof InterfaceC0095d) {
            return (InterfaceC0095d) dVar;
        }
        return null;
    }

    @Override // q1.U
    public final boolean y() {
        return true;
    }
}
