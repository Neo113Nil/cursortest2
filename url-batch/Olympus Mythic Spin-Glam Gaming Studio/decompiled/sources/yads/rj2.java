package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public final class rj2 implements pc2 {
    public final fm0 a;
    public final z30 b;
    public final WeakReference c;

    public rj2(View view, fm0 fm0Var, z30 z30Var) {
        this.a = fm0Var;
        this.b = z30Var;
        this.c = new WeakReference(view);
    }

    @Override // yads.pc2
    public final void a() {
        View view = (View) this.c.get();
        if (view != null) {
            this.a.b(view);
            this.b.a(y30.g);
        }
    }
}
