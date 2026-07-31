package yads;

import android.view.ViewTreeObserver;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes6.dex */
public final class qn1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ rn1 a;
    public final /* synthetic */ CustomizableMediaView b;
    public final /* synthetic */ gn1 c;

    public qn1(rn1 rn1Var, CustomizableMediaView customizableMediaView, gn1 gn1Var) {
        this.a = rn1Var;
        this.b = customizableMediaView;
        this.c = gn1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.b.a(this.b, this.c.b);
        return false;
    }
}
