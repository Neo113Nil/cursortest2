package K0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import l.C0230d0;

/* loaded from: classes.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f544b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f545c;
    public final /* synthetic */ TextView d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f546e;

    public s(u uVar, int i, TextView textView, int i2, TextView textView2) {
        this.f546e = uVar;
        this.f543a = i;
        this.f544b = textView;
        this.f545c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0230d0 c0230d0;
        int i = this.f543a;
        u uVar = this.f546e;
        uVar.f560n = i;
        uVar.f558l = null;
        TextView textView = this.f544b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f545c == 1 && (c0230d0 = uVar.f564r) != null) {
                c0230d0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
