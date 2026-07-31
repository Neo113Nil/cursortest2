package yads;

/* loaded from: classes3.dex */
public abstract class gw3 {
    public static void a(av3 av3Var) {
        if (!av3Var.f) {
            throw new IllegalStateException("AdSession is not started");
        }
        if (av3Var.g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }
}
