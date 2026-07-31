package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class af0 implements pc2 {
    public final p03 a;
    public final WeakReference b;

    public af0(View view, p03 p03Var) {
        this.a = p03Var;
        this.b = new WeakReference(view);
    }

    @Override // yads.pc2
    public final void a() {
        View view = (View) this.b.get();
        if (view != null) {
            this.a.b(view);
        }
    }
}
