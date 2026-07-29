package o;

/* renamed from: o.Fm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145Fm extends AbstractC2367ze {
    public /* synthetic */ Object h;
    public int i;
    public final /* synthetic */ C0171Gm j;
    public Object k;
    public InterfaceC2309ym l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0145Fm(C0171Gm c0171Gm, InterfaceC2235xe interfaceC2235xe) {
        super(interfaceC2235xe);
        this.j = c0171Gm;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.i |= Integer.MIN_VALUE;
        return this.j.collect(null, this);
    }
}
