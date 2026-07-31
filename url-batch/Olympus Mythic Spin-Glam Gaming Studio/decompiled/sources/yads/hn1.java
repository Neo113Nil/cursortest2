package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes6.dex */
public abstract class hn1 extends ek3 {
    public final rn1 c;

    public hn1(CustomizableMediaView customizableMediaView, rn1 rn1Var) {
        super(customizableMediaView);
        this.c = rn1Var;
    }

    public abstract void a(CustomizableMediaView customizableMediaView);

    @Override // yads.ek3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(CustomizableMediaView customizableMediaView, dn1 dn1Var) {
        rn1 rn1Var = this.c;
        gn1 d = d();
        if (rn1Var.c) {
            if (rn1Var.a.a == e00.g) {
                qn1 qn1Var = new qn1(rn1Var, customizableMediaView, d);
                tl3 tl3Var = hl3.a;
                customizableMediaView.getViewTreeObserver().addOnPreDrawListener(new gl3(qn1Var, customizableMediaView));
            }
            rn1Var.c = false;
        }
    }

    public abstract void a(dn1 dn1Var);

    public abstract gn1 d();
}
