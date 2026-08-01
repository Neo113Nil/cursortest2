package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.e;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ur implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final Object g;
    public final /* synthetic */ Object h;

    public ur(r50 r50Var) {
        this.f = 2;
        this.h = r50Var;
        Context context = r50Var.a.getContext();
        CharSequence charSequence = r50Var.h;
        b1 b1Var = new b1();
        b1Var.e = 4096;
        b1Var.g = 4096;
        b1Var.l = null;
        b1Var.m = null;
        b1Var.n = false;
        b1Var.o = false;
        b1Var.p = 16;
        b1Var.i = context;
        b1Var.a = charSequence;
        this.g = b1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                as asVar = (as) obj2;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) asVar.f0.getLayoutManager();
                View P0 = linearLayoutManager.P0(0, linearLayoutManager.v(), false);
                int G = P0 == null ? -1 : ny.G(P0);
                e eVar = (e) obj;
                eVar.i = 2;
                asVar.I(eVar.e(G + 1));
                break;
            case 1:
                as asVar2 = (as) obj2;
                int N0 = ((LinearLayoutManager) asVar2.f0.getLayoutManager()).N0();
                e eVar2 = (e) obj;
                eVar2.i = 1;
                asVar2.I(eVar2.e(N0 - 1));
                break;
            default:
                r50 r50Var = (r50) obj2;
                Window.Callback callback = r50Var.k;
                if (callback != null && r50Var.l) {
                    callback.onMenuItemSelected(0, (b1) obj);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ur(as asVar, e eVar, int i) {
        this.f = i;
        this.h = asVar;
        this.g = eVar;
    }
}
