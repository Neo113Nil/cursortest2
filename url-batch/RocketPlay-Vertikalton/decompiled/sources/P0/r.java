package P0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import l.C0244c0;

/* loaded from: classes.dex */
public final class r extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f983b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f984c;
    public final /* synthetic */ TextView d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f985e;

    public r(t tVar, int i, TextView textView, int i2, TextView textView2) {
        this.f985e = tVar;
        this.f982a = i;
        this.f983b = textView;
        this.f984c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0244c0 c0244c0;
        int i = this.f982a;
        t tVar = this.f985e;
        tVar.f999n = i;
        tVar.f997l = null;
        TextView textView = this.f983b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f984c == 1 && (c0244c0 = tVar.f1003r) != null) {
                c0244c0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(RecyclerView.f1949A0);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(RecyclerView.f1949A0);
        }
    }
}
