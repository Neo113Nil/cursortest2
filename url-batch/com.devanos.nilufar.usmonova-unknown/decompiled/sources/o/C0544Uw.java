package o;

/* renamed from: o.Uw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0544Uw extends AbstractC1397kx implements InterfaceC0466Rw {
    public final Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0544Uw(AbstractC1330jw abstractC1330jw, PJ pj) {
        super(abstractC1330jw, pj);
        AbstractC0048Bt.n(pj, "descriptor");
        C0518Tw c0518Tw = new C0518Tw(this, 0);
        EnumC1992tz enumC1992tz = EnumC1992tz.h;
        this.t = EB.C(enumC1992tz, c0518Tw);
        EB.C(enumC1992tz, new C0518Tw(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC0937dx
    public final InterfaceC0414Pw getGetter() {
        return (C0492Sw) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        return ((C0492Sw) this.t.getValue()).call(new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.AbstractC1397kx
    public final AbstractC1135gx v() {
        return (C0492Sw) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC0937dx
    public final InterfaceC0440Qw getGetter() {
        return (C0492Sw) this.t.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0544Uw(AbstractC1330jw abstractC1330jw, String str, String str2, Object obj) {
        super(abstractC1330jw, str, str2, obj);
        AbstractC0048Bt.n(abstractC1330jw, "container");
        AbstractC0048Bt.n(str, "name");
        AbstractC0048Bt.n(str2, "signature");
        C0518Tw c0518Tw = new C0518Tw(this, 0);
        EnumC1992tz enumC1992tz = EnumC1992tz.h;
        this.t = EB.C(enumC1992tz, c0518Tw);
        EB.C(enumC1992tz, new C0518Tw(this, 1));
    }
}
