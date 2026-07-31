package yads;

import android.view.View;
import com.monetization.ads.mediation.nativeads.MediatedNativeAd;

/* loaded from: classes11.dex */
public final class vp1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ np1 a;
    public final /* synthetic */ MediatedNativeAd b;
    public final /* synthetic */ op1 c;

    public vp1(np1 np1Var, MediatedNativeAd mediatedNativeAd, op1 op1Var) {
        this.a = np1Var;
        this.b = mediatedNativeAd;
        this.c = op1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        this.b.bindNativeAd(this.c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
