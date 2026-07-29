package o;

/* loaded from: classes.dex */
public final class QR extends AbstractC2367ze {
    public C0762bE h;
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ SR k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QR(SR sr, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.k = sr;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
