package o;

/* renamed from: o.Da, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0081Da extends AbstractC0055Ca {
    public final AbstractC2225xU k;

    /* JADX WARN: Multi-variable type inference failed */
    public C0081Da(InterfaceC2312yp interfaceC2312yp, InterfaceC0189He interfaceC0189He, int i, H8 h8) {
        super(interfaceC0189He, i, h8);
        this.k = (AbstractC2225xU) interfaceC2312yp;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.xU, o.yp] */
    @Override // o.AbstractC0055Ca
    public Object a(InterfaceC2214xJ interfaceC2214xJ, InterfaceC2235xe interfaceC2235xe) {
        Object invoke = this.k.invoke(interfaceC2214xJ, interfaceC2235xe);
        return invoke == EnumC0448Re.h ? invoke : C0782bY.a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [o.xU, o.yp] */
    @Override // o.AbstractC0055Ca
    public AbstractC0055Ca b(InterfaceC0189He interfaceC0189He, int i, H8 h8) {
        return new C0081Da(this.k, interfaceC0189He, i, h8);
    }

    @Override // o.AbstractC0055Ca
    public final String toString() {
        return "block[" + this.k + "] -> " + super.toString();
    }
}
