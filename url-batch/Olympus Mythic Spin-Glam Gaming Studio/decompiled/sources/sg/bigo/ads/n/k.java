package sg.bigo.ads.n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.c;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes5.dex */
public final class k extends e {
    public k(@NonNull sg.bigo.ads.p.a aVar, @NonNull List<NativeAd> list, @NonNull sg.bigo.ads.o.b bVar) {
        super(aVar, list, bVar);
    }

    @Override // sg.bigo.ads.n.e, sg.bigo.ads.n.d
    @Nullable
    protected final List<View> a(@NonNull a aVar) {
        if (this.b.size() != 1) {
            return super.a(aVar);
        }
        View a = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_word_icon, this.a, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        FrameLayout frameLayout = new FrameLayout(this.d);
        frameLayout.setBackgroundColor(-16777216);
        View a2 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_word_icon_first_page, frameLayout, false);
        v.a(a2, frameLayout, layoutParams, -1);
        v.a(a, frameLayout, layoutParams, -1);
        v.a(frameLayout, this.a, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.f.a(this.d, 32)), -1);
        Handler handler = new Handler(Looper.getMainLooper());
        c.AnonymousClass7 anonymousClass7 = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.7
            boolean a = true;
            final /* synthetic */ WeakReference b;
            final /* synthetic */ WeakReference c;
            final /* synthetic */ Handler d;

            /* renamed from: sg.bigo.ads.ad.interstitial.c$7$1 */
            final class AnonymousClass1 extends AnimatorListenerAdapter {
                final /* synthetic */ View a;

                AnonymousClass1(View view) {
                    r2 = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    r2.setVisibility(8);
                }
            }

            /* renamed from: sg.bigo.ads.ad.interstitial.c$7$2 */
            final class AnonymousClass2 extends AnimatorListenerAdapter {
                final /* synthetic */ View a;

                AnonymousClass2(View view) {
                    r2 = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    r2.setVisibility(0);
                }
            }

            public AnonymousClass7(WeakReference weakReference, WeakReference weakReference2, Handler handler2) {
                r1 = weakReference;
                r2 = weakReference2;
                r3 = handler2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                View view = (View) r1.get();
                View view2 = (View) r2.get();
                boolean z = this.a;
                View view3 = z ? view : view2;
                if (z) {
                    view = view2;
                }
                if (view3 == null || view == null) {
                    return;
                }
                int height = view3.getHeight();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, "alpha", 1.0f, 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view3, "translationY", 0.0f, height);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(300L);
                animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.interstitial.c.7.1
                    final /* synthetic */ View a;

                    AnonymousClass1(View view32) {
                        r2 = view32;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        r2.setVisibility(8);
                    }
                });
                animatorSet.start();
                view.setAlpha(0.0f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "translationY", -height, 0.0f);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setDuration(300L);
                animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
                animatorSet2.playTogether(ofFloat3, ofFloat4);
                animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.interstitial.c.7.2
                    final /* synthetic */ View a;

                    AnonymousClass2(View view4) {
                        r2 = view4;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        r2.setVisibility(0);
                    }
                });
                animatorSet2.start();
                boolean z2 = this.a;
                this.a = true ^ z2;
                r3.postDelayed(this, !z2 ? 1000L : 2000L);
            }
        };
        a2.setTranslationY(0.0f);
        a2.setVisibility(0);
        a2.setAlpha(1.0f);
        a.setAlpha(0.0f);
        a.setVisibility(8);
        handler2.postDelayed(anonymousClass7, 1000L);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        arrayList.add(a2);
        this.f = true;
        return arrayList;
    }

    @Override // sg.bigo.ads.n.d
    protected final void a(TextView textView) {
        if (textView != null) {
            textView.setMaxWidth(this.d.getResources().getDisplayMetrics().widthPixels - sg.bigo.ads.common.utils.f.a(this.d, 60));
        }
    }
}
