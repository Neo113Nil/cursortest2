package defpackage;

/* loaded from: classes.dex */
public final class sr extends lj {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ tr f;
    public Object g;
    public pr h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr(tr trVar, kj kjVar) {
        super(kjVar);
        this.f = trVar;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
