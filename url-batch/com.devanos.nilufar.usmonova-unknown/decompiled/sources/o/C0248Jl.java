package o;

/* renamed from: o.Jl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248Jl extends AbstractC2367ze {
    public /* synthetic */ Object h;
    public final /* synthetic */ C0274Kl i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0248Jl(C0274Kl c0274Kl, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.i = c0274Kl;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.c(this);
    }
}
