package o;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ER extends AbstractC2225xU implements InterfaceC2312yp {
    public C0579Wf h;
    public int i;
    public final /* synthetic */ C1334k j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ER(C1334k c1334k, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = c1334k;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new ER(this.j, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((ER) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r0.invoke(r7, r6) == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        if (r7 != r4) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0059 -> B:6:0x005c). Please report as a decompilation issue!!! */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0579Wf c0579Wf;
        int i = this.i;
        C1334k c1334k = this.j;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            if (((AtomicInteger) ((Y1) c1334k.l).i).get() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            PX.F(((InterfaceC0422Qe) c1334k.i).m());
            c0579Wf = (C0579Wf) c1334k.j;
            J8 j8 = (J8) c1334k.k;
            this.h = c0579Wf;
            this.i = 1;
            obj = j8.a(this);
        } else if (i == 1) {
            c0579Wf = this.h;
            AbstractC1494mO.l(obj);
            this.h = null;
            this.i = 2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
            if (((AtomicInteger) ((Y1) c1334k.l).i).decrementAndGet() == 0) {
                return C0782bY.a;
            }
            PX.F(((InterfaceC0422Qe) c1334k.i).m());
            c0579Wf = (C0579Wf) c1334k.j;
            J8 j82 = (J8) c1334k.k;
            this.h = c0579Wf;
            this.i = 1;
            obj = j82.a(this);
        }
    }
}
