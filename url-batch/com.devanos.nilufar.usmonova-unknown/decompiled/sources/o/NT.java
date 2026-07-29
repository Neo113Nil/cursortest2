package o;

/* loaded from: classes.dex */
public final class NT extends AbstractC2225xU implements InterfaceC2378zp {
    public int h;
    public /* synthetic */ GF i;

    @Override // o.InterfaceC2378zp
    public final Object e(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).getClass();
        NT nt = new NT(3, (InterfaceC2235xe) obj3);
        nt.i = (GF) obj;
        return nt.invokeSuspend(C0782bY.a);
    }

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
        GF gf = this.i;
        this.h = 1;
        gf.getClass();
        Object a = GF.a(gf, this);
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        return a == enumC0448Re ? enumC0448Re : a;
    }
}
