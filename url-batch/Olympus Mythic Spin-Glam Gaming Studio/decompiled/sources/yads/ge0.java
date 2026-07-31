package yads;

/* loaded from: classes4.dex */
public final class ge0 implements vj1 {
    @Override // yads.vj1
    public final xj1 a(uj1 uj1Var) {
        int i = sb3.a;
        if (i < 23 || i < 31) {
            return new n53().a(uj1Var);
        }
        int d = vt1.d(uj1Var.c.m);
        gh1.c("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + sb3.c(d));
        return new qi(d).a(uj1Var);
    }
}
