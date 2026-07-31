package yads;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes12.dex */
public final class mn1 {
    public final bn1 a;
    public final bx1 b;
    public final nn1 c;

    public mn1() {
        bn1 bn1Var = new bn1();
        bx1 bx1Var = new bx1();
        nn1 nn1Var = new nn1();
        this.a = bn1Var;
        this.b = bx1Var;
        this.c = nn1Var;
    }

    public final vv2 a(CustomizableMediaView customizableMediaView, ij1 ij1Var, t41 t41Var, d82 d82Var, rn1 rn1Var) {
        Context context = customizableMediaView.getContext();
        this.b.getClass();
        xw1 xw1Var = (xw1) ix1.c.a(context).b.remove(ij1Var);
        if (xw1Var == null) {
            try {
                xw1Var = new xw1(context, new vn3(), null);
            } catch (Throwable unused) {
                xw1Var = null;
            }
            if (xw1Var == null) {
                throw new zn3();
            }
        }
        mw1 mw1Var = xw1Var.k;
        mw1Var.a.add(t41Var);
        mw1Var.b.add(d82Var);
        mw1Var.c.add(d82Var);
        this.a.getClass();
        if (!tq0.a(customizableMediaView.getContext(), sq0.e)) {
            customizableMediaView.removeAllViews();
        }
        customizableMediaView.addView(xw1Var, new FrameLayout.LayoutParams(-1, -1));
        this.c.getClass();
        zw1 zw1Var = new zw1(xw1Var);
        this.c.getClass();
        return new vv2(customizableMediaView, zw1Var, rn1Var);
    }
}
