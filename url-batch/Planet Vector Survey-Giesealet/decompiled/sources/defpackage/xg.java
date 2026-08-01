package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class xg extends lj {
    public Object d;
    public fz e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ zg i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg(zg zgVar, lj ljVar) {
        super(ljVar);
        this.i = zgVar;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return zg.a(this.i, null, null, this);
    }
}
