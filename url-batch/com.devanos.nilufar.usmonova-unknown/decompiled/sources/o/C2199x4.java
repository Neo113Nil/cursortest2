package o;

/* renamed from: o.x4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2199x4 extends AbstractC2367ze {
    public String h;
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ C4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2199x4(C4 c4, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.k = c4;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(null, this);
    }
}
