package sg.bigo.ads.ab;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: sg.bigo.ads.ab.a$4, reason: invalid class name */
    static class AnonymousClass4 implements Runnable {
        final /* synthetic */ View a;
        final /* synthetic */ View b;
        final /* synthetic */ int[] c;
        final /* synthetic */ ViewGroup d;
        final /* synthetic */ int e;

        AnonymousClass4(View view, View view2, int[] iArr, ViewGroup viewGroup, int i) {
            this.a = view;
            this.b = view2;
            this.c = iArr;
            this.d = viewGroup;
            this.e = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.a.getVisibility() != 0) {
                this.a.setVisibility(0);
            }
            View view = this.b;
            int[] iArr = this.c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", iArr[0], iArr[1]);
            ofFloat.setDuration(1000L);
            ofFloat.setInterpolator(sg.bigo.ads.common.utils.b.a(0));
            ofFloat.addListener(new b.e() { // from class: sg.bigo.ads.ab.a.4.1
                @Override // sg.bigo.ads.common.utils.b.e, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(AnonymousClass4.this.b, "rotation", 0.0f, -20.0f, 0.0f);
                    ofFloat2.setInterpolator(sg.bigo.ads.common.utils.b.a(1));
                    ofFloat2.setDuration(500L);
                    ofFloat2.setRepeatCount(1);
                    ofFloat2.addListener(new b.e() { // from class: sg.bigo.ads.ab.a.4.1.1
                        @Override // sg.bigo.ads.common.utils.b.e, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator2) {
                            AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                            ViewGroup viewGroup = anonymousClass4.d;
                            View view2 = anonymousClass4.a;
                            int i = anonymousClass4.e - 1;
                            a.a(viewGroup, 0L, i, anonymousClass4.c);
                            if (i == 0) {
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "alpha", view2.getAlpha(), 0.0f);
                                ofFloat3.setDuration(300L);
                                ofFloat3.setInterpolator(sg.bigo.ads.common.utils.b.a(1));
                                ofFloat3.start();
                            }
                        }
                    });
                    ofFloat2.start();
                }
            });
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.b, "alpha", 0.0f, 1.0f);
            ofFloat2.setDuration(300L);
            ofFloat2.setInterpolator(sg.bigo.ads.common.utils.b.a(1));
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.b, "scaleX", 0.0f, 1.0f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.b, "scaleY", 0.0f, 1.0f);
            ofFloat3.setDuration(300L);
            ofFloat3.setInterpolator(sg.bigo.ads.common.utils.b.a(1));
            ofFloat4.setDuration(300L);
            ofFloat4.setInterpolator(sg.bigo.ads.common.utils.b.a(1));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            animatorSet.start();
        }
    }

    public static void a(@NonNull final ViewGroup viewGroup, final long j, final int i) {
        Handler handler = new Handler(Looper.getMainLooper());
        if (i <= 0) {
            return;
        }
        handler.post(new Runnable() { // from class: sg.bigo.ads.ab.a.3
            @Override // java.lang.Runnable
            public final void run() {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationX", 0.0f, -r0, 0.0f, f.a(viewGroup.getContext(), 8), 0.0f);
                ofFloat.setInterpolator(sg.bigo.ads.common.utils.b.a(3));
                ofFloat.setDuration(300L);
                ofFloat.setRepeatMode(2);
                ofFloat.setStartDelay(j);
                ofFloat.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ab.a.3.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        a.a(viewGroup, 100L, i - 1);
                    }
                });
                ofFloat.start();
            }
        });
    }

    public static void a(ViewGroup viewGroup, long j, int i, int[] iArr) {
        if (i > 0 && iArr.length >= 2 && viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.inter_banner_click_img);
            View findViewById2 = viewGroup.findViewById(R.id.inter_banner_click_guide_contain);
            if (findViewById == null || findViewById2 == null) {
                return;
            }
            viewGroup.postDelayed(new AnonymousClass4(findViewById2, findViewById, iArr, viewGroup, i), j);
        }
    }

    public static void a(final ViewGroup viewGroup, final View view, final boolean z) {
        Handler handler = new Handler(Looper.getMainLooper());
        if (viewGroup == null || view == null) {
            return;
        }
        handler.post(new Runnable() { // from class: sg.bigo.ads.ab.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (z) {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new ChangeBounds());
                    transitionSet.setDuration(300L);
                    TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
                }
                if (view.getVisibility() != 0) {
                    view.setVisibility(0);
                }
                View findViewById = view.findViewById(R.id.bigo_ad_banner_placeholder_view);
                if (findViewById != null) {
                    v.b(findViewById);
                }
            }
        });
    }
}
