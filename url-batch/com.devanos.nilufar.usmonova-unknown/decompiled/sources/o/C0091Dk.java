package o;

import java.util.Collection;
import java.util.List;

/* renamed from: o.Dk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0091Dk implements InterfaceC0761bD {
    public static final C0091Dk h = new C0091Dk();
    public static final C0827cE i = C0827cE.g("<Error module>");
    public static final C1318jk j = C1318jk.h;
    public static final C1776qg k;

    static {
        C1776qg c1776qg = C1776qg.f;
        k = C1776qg.f;
    }

    @Override // o.InterfaceC0761bD
    public final InterfaceC1289jH S(C2245xo c2245xo) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // o.InterfaceC0761bD
    public final List W() {
        return j;
    }

    @Override // o.InterfaceC0761bD
    public final boolean Z(InterfaceC0761bD interfaceC0761bD) {
        AbstractC0048Bt.n(interfaceC0761bD, "targetModule");
        return false;
    }

    @Override // o.InterfaceC0761bD
    public final Collection f(C2245xo c2245xo, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        return C1318jk.h;
    }

    @Override // o.W3
    public final InterfaceC1738q4 getAnnotations() {
        return C0460Rq.t;
    }

    @Override // o.InterfaceC1118gg
    public final C0827cE getName() {
        return i;
    }

    @Override // o.InterfaceC0761bD
    public final AbstractC0545Ux l() {
        return k;
    }

    @Override // o.InterfaceC1118gg
    public final InterfaceC1118gg n() {
        return null;
    }

    @Override // o.InterfaceC0761bD
    public final Object q(C0457Rn c0457Rn) {
        AbstractC0048Bt.n(c0457Rn, "capability");
        return null;
    }

    @Override // o.InterfaceC1118gg
    public final Object t(InterfaceC1380kg interfaceC1380kg, Object obj) {
        return null;
    }

    @Override // o.InterfaceC1118gg
    public final InterfaceC1118gg a() {
        return this;
    }
}
