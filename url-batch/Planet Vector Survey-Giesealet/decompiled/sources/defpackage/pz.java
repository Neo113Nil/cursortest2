package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class pz extends lj {
    public int d;
    public final /* synthetic */ qu e;
    public final /* synthetic */ kj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz(kj kjVar, rj rjVar, qu quVar, kj kjVar2) {
        super(kjVar, rjVar);
        this.e = quVar;
        this.f = kjVar2;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                g8.s("This coroutine had already completed");
                return null;
            }
            this.d = 2;
            rg0.u(obj);
            return obj;
        }
        this.d = 1;
        rg0.u(obj);
        qu quVar = this.e;
        quVar.getClass();
        px0.k(2, quVar);
        return quVar.invoke(this.f, this);
    }
}
