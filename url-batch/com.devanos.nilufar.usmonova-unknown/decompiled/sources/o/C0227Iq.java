package o;

import java.util.concurrent.CancellationException;

/* renamed from: o.Iq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227Iq extends AbstractC2225xU implements InterfaceC2312yp {
    public TL h;
    public I8 i;
    public int j;
    public final /* synthetic */ J8 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0227Iq(J8 j8, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.k = j8;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C0227Iq(this.k, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0227Iq) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[Catch: all -> 0x0012, TryCatch #1 {all -> 0x0012, blocks: (B:6:0x000e, B:7:0x0034, B:9:0x003c, B:10:0x004a, B:17:0x0061, B:19:0x0027, B:23:0x0064, B:26:0x0068, B:27:0x0069, B:34:0x0021, B:12:0x004b, B:14:0x0057), top: B:2:0x0006, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r4v4, types: [o.TL] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0031 -> B:7:0x0034). Please report as a decompilation issue!!! */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        J8 j8;
        I8 i8;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        int i = this.j;
        try {
            if (i == 0) {
                AbstractC1494mO.l(obj);
                j8 = this.k;
                i8 = new I8(j8);
                this.h = j8;
                this.i = i8;
                this.j = 1;
                obj = i8.b(this);
                j8 = j8;
                if (obj == enumC0448Re) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i8 = this.i;
                ?? r4 = this.h;
                AbstractC1494mO.l(obj);
                j8 = r4;
                if (((Boolean) obj).booleanValue()) {
                    boolean z = false;
                    AbstractC0253Jq.b.set(false);
                    synchronized (AbstractC2025uS.b) {
                        QD qd = ((C0201Hq) AbstractC2025uS.i.get()).h;
                        if (qd != null && qd.h()) {
                            z = true;
                        }
                    }
                    if (z) {
                        AbstractC2025uS.a();
                    }
                    this.h = j8;
                    this.i = i8;
                    this.j = 1;
                    obj = i8.b(this);
                    j8 = j8;
                    if (obj == enumC0448Re) {
                        return enumC0448Re;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        j8.c(null);
                        return C0782bY.a;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CancellationException cancellationException = th instanceof CancellationException ? th : null;
                if (cancellationException == null) {
                    cancellationException = PX.a("Channel was consumed, consumer had failed", th);
                }
                j8.c(cancellationException);
                throw th2;
            }
        }
    }
}
