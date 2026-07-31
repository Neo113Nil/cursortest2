package yads;

/* loaded from: classes5.dex */
public final class kk2 implements om1 {
    public final p30 a;
    public final dk2 b;
    public ld0 c;
    public final ee0 d;
    public final int e;

    public kk2(p30 p30Var, final sd0 sd0Var) {
        dk2 dk2Var = new dk2() { // from class: yads.kk2$$ExternalSyntheticLambda0
            @Override // yads.dk2
            public final rq a(ff2 ff2Var) {
                return kk2.a(yp0.this, ff2Var);
            }
        };
        ld0 ld0Var = new ld0();
        ee0 ee0Var = new ee0();
        this.a = p30Var;
        this.b = dk2Var;
        this.c = ld0Var;
        this.d = ee0Var;
        this.e = 1048576;
    }

    public static /* synthetic */ rq a(yp0 yp0Var, ff2 ff2Var) {
        return new rq(yp0Var);
    }

    @Override // yads.om1
    public final om1 a(ld0 ld0Var) {
        if (ld0Var != null) {
            this.c = ld0Var;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // yads.om1
    public final ao a(wl1 wl1Var) {
        wl1Var.c.getClass();
        wl1Var.c.getClass();
        return new lk2(wl1Var, this.a, this.b, this.c.a(wl1Var), this.d, this.e);
    }
}
