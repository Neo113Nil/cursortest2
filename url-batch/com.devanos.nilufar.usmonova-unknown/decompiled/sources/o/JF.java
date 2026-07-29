package o;

/* loaded from: classes.dex */
public final class JF extends AbstractC2367ze {
    public LF h;
    public GF i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ LF l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JF(LF lf, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.l = lf;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
