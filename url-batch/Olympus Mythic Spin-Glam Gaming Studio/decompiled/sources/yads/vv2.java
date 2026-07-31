package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes12.dex */
public final class vv2 extends hn1 {
    public final fk3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv2(CustomizableMediaView customizableMediaView, zw1 zw1Var, rn1 rn1Var) {
        super(customizableMediaView, rn1Var);
        fk3 fk3Var = new fk3(zw1Var);
        this.d = fk3Var;
    }

    @Override // yads.ek3
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.d.a();
        customizableMediaView.setVisibility(8);
        customizableMediaView.setOnClickListener(null);
        customizableMediaView.setOnTouchListener(null);
        customizableMediaView.setSelected(false);
    }

    @Override // yads.hn1
    public final void a(dn1 dn1Var) {
    }

    @Override // yads.hn1
    public final gn1 d() {
        return gn1.c;
    }

    @Override // yads.ek3
    public final void a(ph phVar, hk3 hk3Var, Object obj) {
        dn1 dn1Var = (dn1) obj;
        this.d.a(phVar, hk3Var, dn1Var != null ? dn1Var.a : null);
    }

    @Override // yads.ek3
    public final boolean a(View view, Object obj) {
        ij1 ij1Var = ((dn1) obj).a;
        if (ij1Var != null) {
            return this.d.a(ij1Var);
        }
        return false;
    }

    @Override // yads.hn1
    /* renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, dn1 dn1Var) {
        super.b(customizableMediaView, dn1Var);
        ij1 ij1Var = dn1Var.a;
        if (ij1Var == null) {
            return;
        }
        this.d.b(ij1Var);
    }

    @Override // yads.hn1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.d.a();
    }
}
