package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* loaded from: classes5.dex */
public final class uv2 extends hn1 {
    public final fk3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv2(CustomizableMediaView customizableMediaView, y31 y31Var, rn1 rn1Var) {
        super(customizableMediaView, rn1Var);
        fk3 fk3Var = new fk3(y31Var);
        this.d = fk3Var;
    }

    @Override // yads.hn1
    public final void a(dn1 dn1Var) {
        q31 a = a(dn1Var.c);
        if (a == null) {
            return;
        }
        this.d.b(a);
    }

    @Override // yads.hn1
    public final gn1 d() {
        return gn1.f;
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
        this.d.a(phVar, hk3Var, a(dn1Var != null ? dn1Var.c : null));
    }

    @Override // yads.ek3
    public final boolean a(View view, Object obj) {
        q31 a = a(((dn1) obj).c);
        if (a != null) {
            return this.d.a(a);
        }
        return false;
    }

    @Override // yads.hn1
    /* renamed from: a */
    public final void b(CustomizableMediaView customizableMediaView, dn1 dn1Var) {
        super.b(customizableMediaView, dn1Var);
        q31 a = a(dn1Var.c);
        if (a == null) {
            return;
        }
        this.d.b(a);
    }

    @Override // yads.hn1
    public final void a(CustomizableMediaView customizableMediaView) {
        this.d.a();
    }

    public static q31 a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (q31) list.get(0);
    }
}
