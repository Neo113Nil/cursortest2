package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ji extends ii0 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public ji(mu muVar) {
        super(new zh(1));
        this.c = new ki(muVar);
    }

    @Override // defpackage.ii0
    public final ki0 a(Object obj) {
        switch (this.b) {
            case 0:
                return new ki0(this, obj, obj == null, null, true);
            default:
                return new ki0(this, obj, obj == null, (b2) this.c, true);
        }
    }

    @Override // defpackage.ii0
    public xy0 b() {
        switch (this.b) {
            case 0:
                return (ki) this.c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(bu buVar) {
        super(buVar);
        b2 b2Var = b2.M;
        this.c = b2Var;
    }
}
