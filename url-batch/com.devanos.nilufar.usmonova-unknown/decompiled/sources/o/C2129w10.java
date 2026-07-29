package o;

import android.view.View;

/* renamed from: o.w10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2129w10 extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C1360kM j;
    public final /* synthetic */ C0901dM k;
    public final /* synthetic */ InterfaceC0365Nz l;
    public final /* synthetic */ C2195x10 m;
    public final /* synthetic */ View n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2129w10(C1360kM c1360kM, C0901dM c0901dM, InterfaceC0365Nz interfaceC0365Nz, C2195x10 c2195x10, View view, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = c1360kM;
        this.k = c0901dM;
        this.l = interfaceC0365Nz;
        this.m = c2195x10;
        this.n = view;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C2129w10 c2129w10 = new C2129w10(this.j, this.k, this.l, this.m, this.n, interfaceC2235xe);
        c2129w10.i = obj;
        return c2129w10;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C2129w10) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [o.Cu] */
    /* JADX WARN: Type inference failed for: r0v15, types: [o.Cu] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.Cu] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        ?? r0 = this.h;
        C2195x10 c2195x10 = this.m;
        InterfaceC0365Nz interfaceC0365Nz = this.l;
        C0782bY c0782bY = C0782bY.a;
        try {
            if (r0 == 0) {
                AbstractC1494mO.l(obj);
                InterfaceC0422Qe interfaceC0422Qe = (InterfaceC0422Qe) this.i;
                try {
                    C1023fD c1023fD = (C1023fD) this.j.h;
                    if (c1023fD != null) {
                        CT a = AbstractC2327z10.a(this.n.getContext().getApplicationContext());
                        c1023fD.h.g(((Number) a.getValue()).floatValue());
                        r0 = AbstractC0868ct.H(interfaceC0422Qe, null, null, new C2063v10(a, c1023fD, null), 3);
                    } else {
                        r0 = 0;
                    }
                    C0901dM c0901dM = this.k;
                    this.i = r0;
                    this.h = 1;
                    Object b0 = AbstractC0868ct.b0(c0901dM.a, new C0704aM(c0901dM, new C0835cM(c0901dM, null), AbstractC1473m3.H(getContext()), null), this);
                    EnumC0448Re enumC0448Re = EnumC0448Re.h;
                    if (b0 != enumC0448Re) {
                        b0 = c0782bY;
                    }
                    if (b0 != enumC0448Re) {
                        b0 = c0782bY;
                    }
                    if (b0 == enumC0448Re) {
                        return enumC0448Re;
                    }
                } catch (Throwable th) {
                    th = th;
                    r0 = 0;
                    if (r0 != 0) {
                        r0.c(null);
                    }
                    interfaceC0365Nz.getLifecycle().b(c2195x10);
                    throw th;
                }
            } else {
                if (r0 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r0 = (InterfaceC0075Cu) this.i;
                AbstractC1494mO.l(obj);
            }
            if (r0 != 0) {
                r0.c(null);
            }
            interfaceC0365Nz.getLifecycle().b(c2195x10);
            return c0782bY;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
