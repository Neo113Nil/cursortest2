package o;

import android.view.Choreographer;

/* renamed from: o.rg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1841rg extends AbstractC2225xU implements InterfaceC2312yp {
    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C1841rg(2, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C1841rg) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        AbstractC1494mO.l(obj);
        return Choreographer.getInstance();
    }
}
