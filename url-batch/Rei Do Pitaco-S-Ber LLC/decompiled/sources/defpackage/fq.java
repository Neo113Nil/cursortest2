package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class fq implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ jq g;

    public /* synthetic */ fq(jq jqVar, int i) {
        this.f = i;
        this.g = jqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        jq jqVar = this.g;
        switch (i) {
            case 0:
                bg bgVar = jqVar.h;
                if (bgVar != null) {
                    bgVar.setListSelectionHidden(true);
                    bgVar.requestLayout();
                    break;
                }
                break;
            default:
                bg bgVar2 = jqVar.h;
                if (bgVar2 != null && bgVar2.isAttachedToWindow() && jqVar.h.getCount() > jqVar.h.getChildCount() && jqVar.h.getChildCount() <= jqVar.r) {
                    jqVar.E.setInputMethodMode(2);
                    jqVar.d();
                    break;
                }
                break;
        }
    }
}
