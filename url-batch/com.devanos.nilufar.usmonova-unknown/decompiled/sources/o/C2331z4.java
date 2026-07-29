package o;

/* renamed from: o.z4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2331z4 extends AbstractC2367ze {
    public String h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C4 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2331z4(C4 c4, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.j = c4;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object e = this.j.e(this);
        return e == EnumC0448Re.h ? e : new C1428lO(e);
    }
}
