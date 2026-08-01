package R0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import l.C0201b0;

/* loaded from: classes.dex */
public final class r extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f717b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f718c;
    public final /* synthetic */ TextView d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f719e;

    public r(t tVar, int i, TextView textView, int i2, TextView textView2) {
        this.f719e = tVar;
        this.f716a = i;
        this.f717b = textView;
        this.f718c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0201b0 c0201b0;
        int i = this.f716a;
        t tVar = this.f719e;
        tVar.f733n = i;
        tVar.f731l = null;
        TextView textView = this.f717b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f718c == 1 && (c0201b0 = tVar.f737r) != null) {
                c0201b0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(RecyclerView.f1570A0);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(RecyclerView.f1570A0);
        }
    }
}
