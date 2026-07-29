package o;

/* renamed from: o.yT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2290yT extends AbstractC2367ze {
    public /* synthetic */ Object h;
    public final /* synthetic */ C2356zT i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2290yT(C2356zT c2356zT, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.i = c2356zT;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(this);
    }
}
