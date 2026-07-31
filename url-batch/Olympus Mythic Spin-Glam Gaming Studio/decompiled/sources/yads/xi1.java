package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes13.dex */
public final class xi1 implements cj1 {
    public final ViewGroup a;
    public final float b;
    public final Context c;
    public final bj1 d;

    public xi1(ViewGroup viewGroup, float f) {
        Context applicationContext = viewGroup.getContext().getApplicationContext();
        bj1 bj1Var = new bj1();
        this.a = viewGroup;
        this.b = f;
        this.c = applicationContext;
        this.d = bj1Var;
    }

    @Override // yads.cj1
    public final bj1 a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int round = Math.round(hl3.c(this.c) * this.b);
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            round = (round - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        }
        int max = (int) Math.max(Math.min(size, round), 0.0d);
        bj1 bj1Var = this.d;
        bj1Var.a = i;
        bj1Var.b = View.MeasureSpec.makeMeasureSpec(max, mode);
        return this.d;
    }
}
