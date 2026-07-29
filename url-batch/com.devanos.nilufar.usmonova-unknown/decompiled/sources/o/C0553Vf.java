package o;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.Vf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0553Vf extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C0657Zf j;
    public final /* synthetic */ AbstractC2225xU k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0553Vf(C0657Zf c0657Zf, InterfaceC2312yp interfaceC2312yp, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = c0657Zf;
        this.k = (AbstractC2225xU) interfaceC2312yp;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [o.xU, o.yp] */
    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0553Vf c0553Vf = new C0553Vf(this.j, this.k, interfaceC2235xe);
        c0553Vf.i = obj;
        return c0553Vf;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0553Vf) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [o.xU, o.yp] */
    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
            return obj;
        }
        AbstractC1494mO.l(obj);
        InterfaceC0422Qe interfaceC0422Qe = (InterfaceC0422Qe) this.i;
        C2299yc c2299yc = new C2299yc(true);
        c2299yc.J(null);
        C0657Zf c0657Zf = this.j;
        BC bc = new BC(this.k, c2299yc, c0657Zf.n.Y(), interfaceC0422Qe.m());
        C1334k c1334k = c0657Zf.r;
        Object f = ((J8) c1334k.k).f(bc);
        if (f instanceof C0314Ma) {
            C0314Ma c0314Ma = (C0314Ma) f;
            if (c0314Ma == null) {
                c0314Ma = null;
            }
            Throwable th = c0314Ma != null ? c0314Ma.a : null;
            if (th == null) {
                throw new C0393Pb("Channel was closed normally");
            }
            throw th;
        }
        if (f instanceof C0340Na) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) ((Y1) c1334k.l).i).getAndIncrement() == 0) {
            AbstractC0868ct.H((InterfaceC0422Qe) c1334k.i, null, null, new ER(c1334k, null), 3);
        }
        this.h = 1;
        Object a0 = c2299yc.a0(this);
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        return a0 == enumC0448Re ? enumC0448Re : a0;
    }
}
