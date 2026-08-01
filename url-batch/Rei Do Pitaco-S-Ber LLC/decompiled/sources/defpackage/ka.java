package defpackage;

import android.view.View;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ka implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci b;

    public /* synthetic */ ka(ci ciVar, int i) {
        this.a = i;
        this.b = ciVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        ci ciVar = this.b;
        switch (i) {
            case 0:
                na naVar = (na) ciVar;
                naVar.s(naVar.t());
                break;
            default:
                hg hgVar = (hg) ciVar;
                hgVar.l = z;
                hgVar.p();
                if (!z) {
                    hgVar.s(false);
                    hgVar.m = false;
                    break;
                }
                break;
        }
    }
}
