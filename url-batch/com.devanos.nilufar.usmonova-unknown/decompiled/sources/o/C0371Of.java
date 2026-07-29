package o;

import java.io.Serializable;

/* renamed from: o.Of, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371Of extends AbstractC2367ze {
    public Object h;
    public Object i;
    public Serializable j;
    public C1360kM k;
    public boolean l;
    public int m;
    public /* synthetic */ Object n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0657Zf f78o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0371Of(C0657Zf c0657Zf, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.f78o = c0657Zf;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return C0657Zf.e(this.f78o, false, this);
    }
}
