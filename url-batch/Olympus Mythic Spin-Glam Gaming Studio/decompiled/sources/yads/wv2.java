package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* loaded from: classes15.dex */
public final class wv2 extends hn1 {
    public final fk3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv2(CustomizableMediaView customizableMediaView, zx1 zx1Var, rn1 rn1Var) {
        super(customizableMediaView, rn1Var);
        fk3 fk3Var = new fk3(zx1Var);
        this.d = fk3Var;
    }

    @Override // yads.hn1
    public final void a(dn1 dn1Var) {
        List list = dn1Var.c;
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        this.d.b(list);
    }

    @Override // yads.hn1
    public final gn1 d() {
        return gn1.e;
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

    @Override // yads.ek3
    public final void a(ph phVar, hk3 hk3Var, Object obj) {
        dn1 dn1Var = (dn1) obj;
        this.d.a(phVar, hk3Var, dn1Var != null ? dn1Var.c : null);
    }

    @Override // yads.ek3
    public final boolean a(View view, Object obj) {
        List list = ((dn1) obj).c;
        if (list == null || !(!list.isEmpty())) {
            return false;
        }
        return this.d.a(list);
    }

    @Override // yads.hn1
    /* renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, dn1 dn1Var) {
        super.b(customizableMediaView, dn1Var);
        List list = dn1Var.c;
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        this.d.b(list);
    }

    @Override // yads.hn1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.d.a();
    }
}
