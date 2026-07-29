package o;

/* renamed from: o.at, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0737at extends AbstractC2367ze {
    public String h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C0803bt j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0737at(C0803bt c0803bt, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.j = c0803bt;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
