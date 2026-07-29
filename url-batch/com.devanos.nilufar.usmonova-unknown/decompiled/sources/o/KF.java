package o;

/* loaded from: classes.dex */
public final class KF extends AbstractC2367ze {
    public LF h;
    public Object i;
    public CH j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ LF m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KF(LF lf, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.m = lf;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, this);
    }
}
