package o;

import android.app.Activity;

/* loaded from: classes.dex */
public final class U00 extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C1818rJ j;
    public final /* synthetic */ Activity k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U00(C1818rJ c1818rJ, Activity activity, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = c1818rJ;
        this.k = activity;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        U00 u00 = new U00(this.j, this.k, interfaceC2235xe);
        u00.i = obj;
        return u00;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((U00) create((InterfaceC2214xJ) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            InterfaceC2214xJ interfaceC2214xJ = (InterfaceC2214xJ) this.i;
            C2376zn c2376zn = new C2376zn(1, interfaceC2214xJ);
            C1818rJ c1818rJ = this.j;
            ((J00) c1818rJ.i).b(this.k, new ExecutorC2280yJ(), c2376zn);
            K2 k2 = new K2(c1818rJ, 23, c2376zn);
            this.h = 1;
            Object g = AbstractC0022At.g(interfaceC2214xJ, k2, this);
            EnumC0448Re enumC0448Re = EnumC0448Re.h;
            if (g == enumC0448Re) {
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
