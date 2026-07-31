package yads;

import android.widget.ImageView;

/* loaded from: classes6.dex */
public final class ui3 {
    public final s72 a;

    public ui3(s72 s72Var, nj2 nj2Var) {
        this.a = s72Var;
    }

    public final void a(q72 q72Var) {
        q72Var.b.setVisibility(0);
        mi3 mi3Var = q72Var.a;
        mi3Var.a.setVisibility(8);
        ImageView imageView = mi3Var.b;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        this.a.a(q72Var.c.b);
    }
}
