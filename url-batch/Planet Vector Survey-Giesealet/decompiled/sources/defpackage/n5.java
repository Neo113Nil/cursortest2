package defpackage;

import android.os.Looper;
import android.view.Choreographer;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class n5 extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ n5(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    p5 p5Var = new p5(choreographer, nk.l(myLooper));
                    return nz.Q(p5Var, p5Var.o);
                }
                g8.s("no Looper on this thread");
                return null;
            default:
                return new es();
        }
    }
}
