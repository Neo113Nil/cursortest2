package yads;

import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes4.dex */
public final class rh {
    public final t8 a;
    public final ri2 b;
    public final in1 c;
    public final p42 d;
    public final x32 e;

    public rh(t8 t8Var, ri2 ri2Var, in1 in1Var, p42 p42Var, x32 x32Var, mt1 mt1Var, x20 x20Var) {
        this.a = t8Var;
        this.b = ri2Var;
        this.c = in1Var;
        this.d = p42Var;
        this.e = x32Var;
    }

    public final lj1 a(ImageView imageView, CustomizableMediaView customizableMediaView) {
        hn1 hn1Var;
        y31 y31Var = imageView != null ? new y31(imageView, this.b, this.a) : null;
        if (customizableMediaView != null) {
            in1 in1Var = this.c;
            ri2 ri2Var = this.b;
            p42 p42Var = this.d;
            x32 x32Var = this.e;
            Object obj = in1Var.a.a.get("media");
            hn1Var = in1Var.d.a(customizableMediaView, in1Var.b, ri2Var, in1Var.g, in1Var.c, p42Var, x32Var, in1Var.e, in1Var.f, in1Var.h, obj instanceof dn1 ? (dn1) obj : null);
        } else {
            hn1Var = null;
        }
        if (y31Var == null && hn1Var == null) {
            return null;
        }
        return new lj1(y31Var, hn1Var);
    }
}
