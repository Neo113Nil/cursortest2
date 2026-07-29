package o;

/* loaded from: classes.dex */
public final class UO extends AbstractC2367ze {
    public /* synthetic */ Object h;
    public final /* synthetic */ WO i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UO(WO wo, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.i = wo;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(this);
    }
}
