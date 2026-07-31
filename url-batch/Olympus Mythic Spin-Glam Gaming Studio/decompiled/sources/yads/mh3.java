package yads;

import android.widget.ImageView;

/* loaded from: classes5.dex */
public final class mh3 implements bv {
    public final q72 a;
    public final d20 b;

    public mh3(q72 q72Var, d20 d20Var) {
        this.a = q72Var;
        this.b = d20Var;
    }

    @Override // yads.bv
    public final void a(kf1 kf1Var, dv dvVar) {
        ju juVar = new ju(this.a.getContext(), new lh3(kf1Var, dvVar, this.b));
        q72 q72Var = this.a;
        q72Var.setOnTouchListener(juVar);
        q72Var.setOnClickListener(juVar);
        ImageView imageView = this.a.a.b;
        if (imageView != null) {
            imageView.setOnTouchListener(juVar);
            imageView.setOnClickListener(juVar);
        }
    }
}
