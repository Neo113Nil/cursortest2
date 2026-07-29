package o;

/* loaded from: classes.dex */
public final class B9 extends AbstractC2367ze {
    public InterfaceC2214xJ h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C9 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B9(C9 c9, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.j = c9;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
