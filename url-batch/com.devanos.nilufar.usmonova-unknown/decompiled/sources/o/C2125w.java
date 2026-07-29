package o;

/* renamed from: o.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2125w extends AbstractC2367ze {
    public C1561nP h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C1818rJ j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2125w(C1818rJ c1818rJ, InterfaceC2235xe interfaceC2235xe) {
        super(interfaceC2235xe);
        this.j = c1818rJ;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.collect(null, this);
    }
}
