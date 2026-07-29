package o;

/* renamed from: o.Km, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275Km extends AbstractC2367ze {
    public /* synthetic */ Object h;
    public int i;
    public final /* synthetic */ C2002u5 j;
    public C0426Qi k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0275Km(C2002u5 c2002u5, InterfaceC2235xe interfaceC2235xe) {
        super(interfaceC2235xe);
        this.j = c2002u5;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.i |= Integer.MIN_VALUE;
        return this.j.collect(null, this);
    }
}
