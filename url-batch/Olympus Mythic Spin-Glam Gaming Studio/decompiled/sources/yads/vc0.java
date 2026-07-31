package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class vc0 implements pc2 {
    public final pl3 a;
    public final z30 b;
    public final WeakReference c;

    public vc0(View view, pl3 pl3Var, z30 z30Var) {
        this.a = pl3Var;
        this.b = z30Var;
        this.c = new WeakReference(view);
    }

    @Override // yads.pc2
    public final void a() {
        View view = (View) this.c.get();
        if (view != null) {
            this.a.getClass();
            view.setVisibility(0);
            this.b.a(y30.g);
        }
    }
}
