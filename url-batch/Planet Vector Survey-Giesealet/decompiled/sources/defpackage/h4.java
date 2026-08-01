package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class h4 extends v00 implements mu {
    public final /* synthetic */ int e;
    public final /* synthetic */ om f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(om omVar, int i) {
        super(1);
        this.e = i;
        this.f = omVar;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i = this.e;
        om omVar = this.f;
        switch (i) {
            case 0:
                return new u3(1, omVar);
            default:
                if (omVar.i.a) {
                    omVar.h.a();
                }
                return ky0.a;
        }
    }
}
