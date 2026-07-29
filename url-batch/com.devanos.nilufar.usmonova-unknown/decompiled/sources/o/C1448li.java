package o;

/* renamed from: o.li, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1448li extends AbstractC2367ze {
    public String h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C1514mi j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1448li(C1514mi c1514mi, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.j = c1514mi;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
