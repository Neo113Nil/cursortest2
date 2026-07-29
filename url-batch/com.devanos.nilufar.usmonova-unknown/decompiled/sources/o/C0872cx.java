package o;

/* renamed from: o.cx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0872cx extends AbstractC1397kx implements InterfaceC2312yp {
    public final Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0872cx(AbstractC1330jw abstractC1330jw, PJ pj) {
        super(abstractC1330jw, pj);
        AbstractC0048Bt.n(pj, "descriptor");
        C0807bx c0807bx = new C0807bx(this, 0);
        EnumC1992tz enumC1992tz = EnumC1992tz.h;
        this.t = EB.C(enumC1992tz, c0807bx);
        EB.C(enumC1992tz, new C0807bx(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC0937dx
    public final InterfaceC0414Pw getGetter() {
        return (C0741ax) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0741ax) this.t.getValue()).call(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.AbstractC1397kx
    public final AbstractC1135gx v() {
        return (C0741ax) this.t.getValue();
    }
}
