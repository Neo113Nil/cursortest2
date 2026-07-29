package o;

/* renamed from: o.uf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2038uf extends AbstractC2367ze {
    public C1334k h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C1334k j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2038uf(C1334k c1334k, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.j = c1334k;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(this);
    }
}
