package o;

/* renamed from: o.Fs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0151Fs extends AbstractC2225xU implements InterfaceC2312yp {
    public C1164hM h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ TD k;
    public final /* synthetic */ C0177Gs l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0151Fs(TD td, C0177Gs c0177Gs, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.k = td;
        this.l = c0177Gs;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0151Fs c0151Fs = new C0151Fs(this.k, this.l, interfaceC2235xe);
        c0151Fs.j = obj;
        return c0151Fs;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        ((C0151Fs) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
        return EnumC0448Re.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
    
        if (o.AbstractC0022At.p(r12, r0, r11) == r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0066, code lost:
    
        if (o.AbstractC1473m3.H(getContext()).v(r5, r11) == r3) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x006e -> B:6:0x003e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0091 -> B:6:0x003e). Please report as a decompilation issue!!! */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC0422Qe interfaceC0422Qe;
        C1164hM c1164hM;
        int i = this.i;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            InterfaceC0422Qe interfaceC0422Qe2 = (InterfaceC0422Qe) this.j;
            C1164hM c1164hM2 = new C1164hM();
            c1164hM2.h = 1.0f;
            interfaceC0422Qe = interfaceC0422Qe2;
            c1164hM = c1164hM2;
        } else if (i == 1) {
            C1164hM c1164hM3 = this.h;
            InterfaceC0422Qe interfaceC0422Qe3 = (InterfaceC0422Qe) this.j;
            AbstractC1494mO.l(obj);
            c1164hM = c1164hM3;
            interfaceC0422Qe = interfaceC0422Qe3;
            if (c1164hM.h == 0.0f) {
                C1818rJ c1818rJ = new C1818rJ(new BS(new C1139h0(12, interfaceC0422Qe), null));
                C0125Es c0125Es = new C0125Es(2, null);
                this.j = interfaceC0422Qe;
                this.h = c1164hM;
                this.i = 2;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1164hM c1164hM4 = this.h;
            InterfaceC0422Qe interfaceC0422Qe4 = (InterfaceC0422Qe) this.j;
            AbstractC1494mO.l(obj);
            c1164hM = c1164hM4;
            interfaceC0422Qe = interfaceC0422Qe4;
        }
        C1007f0 c1007f0 = new C1007f0(this.k, this.l, c1164hM, interfaceC0422Qe, 1);
        this.j = interfaceC0422Qe;
        this.h = c1164hM;
        this.i = 1;
        if (getContext().k(C0460Rq.F) != null) {
            throw new ClassCastException();
        }
    }
}
