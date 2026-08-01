package M0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import l.C0219d0;

/* loaded from: classes.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f566c;
    public final /* synthetic */ TextView d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f567e;

    public s(u uVar, int i, TextView textView, int i2, TextView textView2) {
        this.f567e = uVar;
        this.f564a = i;
        this.f565b = textView;
        this.f566c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0219d0 c0219d0;
        int i = this.f564a;
        u uVar = this.f567e;
        uVar.f581n = i;
        uVar.f579l = null;
        TextView textView = this.f565b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f566c == 1 && (c0219d0 = uVar.f585r) != null) {
                c0219d0.setText((CharSequence) null);
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
