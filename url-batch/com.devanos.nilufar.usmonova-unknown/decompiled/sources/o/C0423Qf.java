package o;

import java.io.Serializable;

/* renamed from: o.Qf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423Qf extends AbstractC2225xU implements InterfaceC2114vp {
    public Serializable h;
    public int i;
    public final /* synthetic */ C1360kM j;
    public final /* synthetic */ C0657Zf k;
    public final /* synthetic */ C1230iM l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0423Qf(C1360kM c1360kM, C0657Zf c0657Zf, C1230iM c1230iM, InterfaceC2235xe interfaceC2235xe) {
        super(1, interfaceC2235xe);
        this.j = c1360kM;
        this.k = c0657Zf;
        this.l = c1230iM;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(InterfaceC2235xe interfaceC2235xe) {
        return new C0423Qf(this.j, this.k, this.l, interfaceC2235xe);
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        return ((C0423Qf) create((InterfaceC2235xe) obj)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r9 != r7) goto L30;
     */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C1360kM c1360kM;
        C1230iM c1230iM;
        int i = this.i;
        C1230iM c1230iM2 = this.l;
        C1360kM c1360kM2 = this.j;
        C0657Zf c0657Zf = this.k;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        try {
        } catch (C0552Ve unused) {
            Object obj2 = c1360kM2.h;
            this.h = c1230iM2;
            this.i = 3;
            obj = c0657Zf.i(obj2, true, this);
        }
        if (i == 0) {
            AbstractC1494mO.l(obj);
            this.h = c1360kM2;
            this.i = 1;
            obj = c0657Zf.h(this);
            if (obj == enumC0448Re) {
                return enumC0448Re;
            }
            c1360kM = c1360kM2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    c1230iM = (C1230iM) this.h;
                    AbstractC1494mO.l(obj);
                    c1230iM.h = ((Number) obj).intValue();
                    return C0782bY.a;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1230iM2 = (C1230iM) this.h;
                AbstractC1494mO.l(obj);
                c1230iM2.h = ((Number) obj).intValue();
                return C0782bY.a;
            }
            c1360kM = (C1360kM) this.h;
            AbstractC1494mO.l(obj);
        }
        c1360kM.h = obj;
        SR f = c0657Zf.f();
        this.h = c1230iM2;
        this.i = 2;
        obj = f.a();
        if (obj == enumC0448Re) {
            return enumC0448Re;
        }
        c1230iM = c1230iM2;
        c1230iM.h = ((Number) obj).intValue();
        return C0782bY.a;
    }
}
