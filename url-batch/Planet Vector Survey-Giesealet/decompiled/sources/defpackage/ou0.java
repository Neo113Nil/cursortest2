package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ou0 {
    public final mu0 a;
    public final ArrayList b = new ArrayList();
    public oy c;
    public oy d;
    public int e;

    public ou0(ViewGroup viewGroup) {
        oy oyVar = oy.e;
        this.c = oyVar;
        this.d = oyVar;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        mu0 mu0Var = new mu0(this, viewGroup.getContext(), viewGroup);
        this.a = mu0Var;
        mu0Var.setWillNotDraw(true);
        bb0 bb0Var = new bb0(this);
        int i = c01.a;
        xz0.b(mu0Var, bb0Var);
        c01.a(mu0Var, new nu0(this));
        viewGroup.addView(mu0Var, 0);
    }
}
