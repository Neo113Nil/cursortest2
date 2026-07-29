package o;

/* loaded from: classes.dex */
public final class YO extends AbstractC2367ze {
    public C1334k h;
    public ZD i;
    public /* synthetic */ Object j;
    public final /* synthetic */ C1334k k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YO(C1334k c1334k, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.k = c1334k;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.G(this);
    }
}
