package yads;

import android.view.View;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* loaded from: classes3.dex */
public final class lj1 implements qh, xf0 {
    public final y31 a;
    public final hn1 b;

    public lj1(y31 y31Var, hn1 hn1Var) {
        this.a = y31Var;
        this.b = hn1Var;
    }

    @Override // yads.qh
    public final void a(ph phVar, hk3 hk3Var) {
        dn1 dn1Var = (dn1) phVar.c;
        y31 y31Var = this.a;
        if (y31Var != null) {
            y31Var.a(phVar, hk3Var, a(dn1Var.c));
        }
        hn1 hn1Var = this.b;
        if (hn1Var != null) {
            hn1Var.a(phVar, hk3Var, dn1Var);
        }
    }

    @Override // yads.xf0
    public final void b(Object obj) {
        dn1 dn1Var = (dn1) obj;
        q31 a = a(dn1Var.c);
        ImageView imageView = (ImageView) a((ek3) this.a);
        if (imageView != null && a != null) {
            y31 y31Var = this.a;
            if (y31Var != null) {
                y31Var.a(a);
            }
            imageView.setVisibility(0);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((ek3) this.b);
        if (customizableMediaView == null) {
            return;
        }
        hn1 hn1Var = this.b;
        if (hn1Var != null) {
            hn1Var.a(dn1Var);
        }
        customizableMediaView.setVisibility(0);
    }

    @Override // yads.qh
    public final void c(Object obj) {
        dn1 dn1Var = (dn1) obj;
        q31 a = a(dn1Var.c);
        ImageView imageView = (ImageView) a((ek3) this.a);
        if (imageView != null && a != null) {
            y31 y31Var = this.a;
            if (y31Var != null) {
                y31Var.a(a);
            }
            imageView.setVisibility(0);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((ek3) this.b);
        if (customizableMediaView != null) {
            hn1 hn1Var = this.b;
            if (hn1Var != null) {
                hn1Var.b(customizableMediaView, dn1Var);
            }
            customizableMediaView.setVisibility(0);
        }
    }

    @Override // yads.qh
    public final boolean d() {
        hn1 hn1Var = this.b;
        boolean z = hn1Var != null && hl3.a(hn1Var.b()) >= 100;
        y31 y31Var = this.a;
        return z || (y31Var != null && hl3.a(y31Var.b()) >= 100);
    }

    @Override // yads.qh
    public final void destroy() {
        hn1 hn1Var = this.b;
        if (hn1Var != null) {
            hn1Var.a();
        }
    }

    @Override // yads.qh
    public final boolean e() {
        hn1 hn1Var = this.b;
        if (hn1Var != null && hn1Var.c()) {
            return true;
        }
        y31 y31Var = this.a;
        return y31Var != null && y31Var.c();
    }

    @Override // yads.qh
    public final boolean a(Object obj) {
        dn1 dn1Var = (dn1) obj;
        y31 y31Var = this.a;
        q31 a = a(dn1Var.c);
        View a2 = a((ek3) y31Var);
        boolean z = (a2 == null || a == null || y31Var == null || !y31Var.a(a2, a)) ? false : true;
        hn1 hn1Var = this.b;
        View a3 = a((ek3) hn1Var);
        return z || (a3 != null && hn1Var != null && hn1Var.a(a3, dn1Var));
    }

    @Override // yads.qh
    public final boolean b() {
        y31 y31Var;
        hn1 hn1Var = this.b;
        return ((hn1Var == null || hn1Var.b() == null) && ((y31Var = this.a) == null || y31Var.b() == null)) ? false : true;
    }

    @Override // yads.qh
    public final wk3 c() {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((ek3) this.b);
        ImageView imageView = (ImageView) a((ek3) this.a);
        if (customizableMediaView != null) {
            return new wk3(customizableMediaView);
        }
        if (imageView != null) {
            return new wk3(imageView);
        }
        return null;
    }

    @Override // yads.qh
    public final void a() {
        hn1 hn1Var;
        y31 y31Var;
        ImageView imageView = (ImageView) a((ek3) this.a);
        if (imageView != null && (y31Var = this.a) != null) {
            imageView.setImageDrawable(null);
            y31Var.e.a(imageView);
            imageView.setVisibility(8);
            imageView.setOnClickListener(null);
            imageView.setOnTouchListener(null);
            imageView.setSelected(false);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((ek3) this.b);
        if (customizableMediaView == null || (hn1Var = this.b) == null) {
            return;
        }
        hn1Var.a((View) customizableMediaView);
    }

    public static q31 a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (q31) list.get(0);
    }

    public static View a(ek3 ek3Var) {
        if (ek3Var != null) {
            return ek3Var.b();
        }
        return null;
    }
}
