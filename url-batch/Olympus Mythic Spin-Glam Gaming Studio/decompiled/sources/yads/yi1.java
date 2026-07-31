package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;

/* loaded from: classes3.dex */
public final class yi1 implements cj1 {
    public final ExtendedViewContainer a;
    public final float b;
    public final Context c;
    public final bj1 d;

    public yi1(ExtendedViewContainer extendedViewContainer, float f) {
        Context applicationContext = extendedViewContainer.getContext().getApplicationContext();
        bj1 bj1Var = new bj1();
        this.a = extendedViewContainer;
        this.b = f;
        this.c = applicationContext;
        this.d = bj1Var;
    }

    @Override // yads.cj1
    public final bj1 a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int round = Math.round(hl3.e(this.c) * this.b);
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            round = (round - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        }
        this.d.a = View.MeasureSpec.makeMeasureSpec((int) Math.max(Math.min(size, round), 0.0d), mode);
        bj1 bj1Var = this.d;
        bj1Var.b = i2;
        return bj1Var;
    }
}
