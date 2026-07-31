package yads;

/* loaded from: classes4.dex */
public final class tv3 implements Runnable {
    public final /* synthetic */ xv3 b;

    public tv3(xv3 xv3Var) {
        this.b = xv3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        xv3 xv3Var = this.b;
        int streamVolume = xv3Var.c.getStreamVolume(3);
        int streamMaxVolume = xv3Var.c.getStreamMaxVolume(3);
        xv3Var.d.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            f = 0.0f;
        } else {
            f = streamVolume / streamMaxVolume;
            if (f > 1.0f) {
                f = 1.0f;
            }
        }
        this.b.g.set(false);
        if (((Float) this.b.f.getAndSet(Float.valueOf(f))).floatValue() != f) {
            this.b.a.post(new rv3(this, f));
        }
    }
}
