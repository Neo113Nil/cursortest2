package o;

/* renamed from: o.Uf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527Uf extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public final /* synthetic */ C0657Zf i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0527Uf(C0657Zf c0657Zf, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.i = c0657Zf;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C0527Uf(this.i, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0527Uf) create((InterfaceC2309ym) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r7 == r5) goto L19;
     */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        C0782bY c0782bY = C0782bY.a;
        C0657Zf c0657Zf = this.i;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            C1334k c1334k = c0657Zf.f136o;
            this.h = 1;
            Object a0 = ((C2299yc) c1334k.j).a0(this);
            if (a0 != enumC0448Re) {
                a0 = c0782bY;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1494mO.l(obj);
                return c0782bY;
            }
            AbstractC1494mO.l(obj);
        }
        InterfaceC2243xm h = AbstractC0022At.h(c0657Zf.f().c, -1);
        D9 d9 = new D9(2, c0657Zf);
        this.h = 2;
        return h.collect(d9, this) == enumC0448Re ? enumC0448Re : c0782bY;
    }
}
