package o;

import java.util.Objects;

/* loaded from: classes.dex */
public final class JD extends KD implements InterfaceC2253xw {
    public JD(InterfaceC0517Tv interfaceC0517Tv, String str, String str2) {
        super(AbstractC2336z9.NO_RECEIVER, ((InterfaceC0916db) interfaceC0517Tv).e(), str, str2, !Objects.nonNull(interfaceC0517Tv) ? 1 : 0);
    }

    @Override // o.InterfaceC2253xw
    public final void c(Object obj, Object obj2) {
        ((AbstractC0491Sv) b()).call(obj, obj2);
    }

    @Override // o.AbstractC2336z9
    public final InterfaceC0387Ov computeReflected() {
        return UM.a.e(this);
    }

    @Override // o.InterfaceC0596Ww
    public final Object get(Object obj) {
        return ((AbstractC0491Sv) getGetter()).call(obj);
    }

    @Override // o.InterfaceC0596Ww
    public final Object getDelegate(Object obj) {
        return ((InterfaceC2253xw) getReflected()).getDelegate(obj);
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // o.InterfaceC0077Cw
    public final InterfaceC2187ww b() {
        return ((InterfaceC2253xw) getReflected()).b();
    }

    @Override // o.InterfaceC0937dx
    public final InterfaceC0570Vw getGetter() {
        return ((InterfaceC2253xw) getReflected()).getGetter();
    }

    public JD(String str, String str2) {
        super(AbstractC2336z9.NO_RECEIVER, EQ.class, str, str2, 1);
    }
}
