package o;

/* renamed from: o.c3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0816c3 extends AbstractC2367ze {
    public C1013f3 h;
    public AD i;
    public I8 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ C1013f3 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0816c3(C1013f3 c1013f3, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.l = c1013f3;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.f(this);
    }
}
