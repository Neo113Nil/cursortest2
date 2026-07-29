package o;

/* renamed from: o.Il, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222Il extends AbstractC2367ze {
    public String h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C0274Kl j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0222Il(C0274Kl c0274Kl, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.j = c0274Kl;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(null, this);
    }
}
