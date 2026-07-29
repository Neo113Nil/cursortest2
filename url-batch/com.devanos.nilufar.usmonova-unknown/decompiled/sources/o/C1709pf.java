package o;

import java.util.List;

/* renamed from: o.pf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1709pf extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ List j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1709pf(List list, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = list;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C1709pf c1709pf = new C1709pf(this.j, interfaceC2235xe);
        c1709pf.i = obj;
        return c1709pf;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C1709pf) create((C2170wf) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            C2170wf c2170wf = (C2170wf) this.i;
            this.h = 1;
            Object d = AbstractC0048Bt.d(this.j, c2170wf, this);
            EnumC0448Re enumC0448Re = EnumC0448Re.h;
            if (d == enumC0448Re) {
                return enumC0448Re;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
        }
        return C0782bY.a;
    }
}
