package com.fyber.inneractive.sdk.flow.endcard;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.y0;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class d extends b {
    public d(int i, y0 y0Var) {
        super(i, y0Var);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(ViewGroup viewGroup, com.fyber.inneractive.sdk.player.ui.b bVar) {
        f fVar = (f) f();
        fVar.a(bVar, null);
        ViewGroup viewGroup2 = fVar.c;
        com.fyber.inneractive.sdk.util.v.a(viewGroup2);
        viewGroup.addView(viewGroup2);
        a(this.e, this.c);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final n c() {
        return new f(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.player.ui.c d() {
        com.fyber.inneractive.sdk.config.global.features.v vVar = this.c.g;
        View b = f().b();
        com.fyber.inneractive.sdk.player.ui.c d = super.d();
        d.e = b;
        boolean z = false;
        if (vVar != null) {
            Boolean c = vVar.c("cta_text_all_caps");
            if (c != null ? c.booleanValue() : false) {
                z = true;
            }
        }
        d.b = z;
        boolean b2 = b.b(vVar);
        Integer valueOf = Integer.valueOf(b.a(vVar));
        if (b2) {
            d.d = valueOf;
        }
        return d;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.util.g g() {
        return com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final l h() {
        return l.Default;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.model.vast.i i() {
        return com.fyber.inneractive.sdk.model.vast.i.Default_End_Card;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean l() {
        return true;
    }

    public final void a(int i, y0 y0Var) {
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.VAST_DEFAULT_COMPANION_DISPLAYED;
        InneractiveAdRequest inneractiveAdRequest = y0Var.c;
        com.fyber.inneractive.sdk.response.g gVar = y0Var.d;
        JSONArray jSONArray = y0Var.f;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar);
        wVar.c = uVar;
        wVar.a = inneractiveAdRequest;
        wVar.d = jSONArray;
        wVar.a((String) null);
    }
}
