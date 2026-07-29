package o;

/* renamed from: o.p6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1674p6 extends AbstractC2367ze {
    public /* synthetic */ Object h;
    public int i;
    public final /* synthetic */ C1344k6 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674p6(C1344k6 c1344k6, InterfaceC2235xe interfaceC2235xe) {
        super(interfaceC2235xe);
        this.j = c1344k6;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
