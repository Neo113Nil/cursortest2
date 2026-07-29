package o;

import java.util.List;

/* renamed from: o.gA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1086gA extends AbstractC1152hA {
    @Override // o.AbstractC1152hA
    public final void a(long j, Object obj) {
        ((K) ((InterfaceC1920st) AbstractC1768qY.c.i(j, obj))).h = false;
    }

    @Override // o.AbstractC1152hA
    public final void b(long j, Object obj, Object obj2) {
        AbstractC1702pY abstractC1702pY = AbstractC1768qY.c;
        InterfaceC1920st interfaceC1920st = (InterfaceC1920st) abstractC1702pY.i(j, obj);
        InterfaceC1920st interfaceC1920st2 = (InterfaceC1920st) abstractC1702pY.i(j, obj2);
        int size = interfaceC1920st.size();
        int size2 = interfaceC1920st2.size();
        if (size > 0 && size2 > 0) {
            if (!((K) interfaceC1920st).h) {
                interfaceC1920st = interfaceC1920st.d(size2 + size);
            }
            interfaceC1920st.addAll(interfaceC1920st2);
        }
        if (size > 0) {
            interfaceC1920st2 = interfaceC1920st;
        }
        AbstractC1768qY.p(j, obj, interfaceC1920st2);
    }

    @Override // o.AbstractC1152hA
    public final List c(long j, Object obj) {
        InterfaceC1920st interfaceC1920st = (InterfaceC1920st) AbstractC1768qY.c.i(j, obj);
        if (((K) interfaceC1920st).h) {
            return interfaceC1920st;
        }
        int size = interfaceC1920st.size();
        InterfaceC1920st d = interfaceC1920st.d(size == 0 ? 10 : size * 2);
        AbstractC1768qY.p(j, obj, d);
        return d;
    }
}
