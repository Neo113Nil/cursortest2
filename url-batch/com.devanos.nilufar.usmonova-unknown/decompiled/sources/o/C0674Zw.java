package o;

import java.lang.reflect.Member;

/* renamed from: o.Zw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0674Zw extends AbstractC1397kx implements InterfaceC0596Ww {
    public final Object t;
    public final Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0674Zw(AbstractC1330jw abstractC1330jw, String str, String str2, Object obj) {
        super(abstractC1330jw, str, str2, obj);
        AbstractC0048Bt.n(abstractC1330jw, "container");
        AbstractC0048Bt.n(str, "name");
        AbstractC0048Bt.n(str2, "signature");
        C0648Yw c0648Yw = new C0648Yw(this, 0);
        EnumC1992tz enumC1992tz = EnumC1992tz.h;
        this.t = EB.C(enumC1992tz, c0648Yw);
        this.u = EB.C(enumC1992tz, new C0648Yw(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC0596Ww
    public final Object get(Object obj) {
        return ((C0622Xw) this.t.getValue()).call(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC0596Ww
    public final Object getDelegate(Object obj) {
        return t((Member) this.u.getValue(), obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC0937dx
    public final InterfaceC0414Pw getGetter() {
        return (C0622Xw) this.t.getValue();
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        return get(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.AbstractC1397kx
    public final AbstractC1135gx v() {
        return (C0622Xw) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC0937dx
    public final InterfaceC0570Vw getGetter() {
        return (C0622Xw) this.t.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0674Zw(AbstractC1330jw abstractC1330jw, PJ pj) {
        super(abstractC1330jw, pj);
        AbstractC0048Bt.n(pj, "descriptor");
        C0648Yw c0648Yw = new C0648Yw(this, 0);
        EnumC1992tz enumC1992tz = EnumC1992tz.h;
        this.t = EB.C(enumC1992tz, c0648Yw);
        this.u = EB.C(enumC1992tz, new C0648Yw(this, 1));
    }
}
