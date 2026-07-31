package sg.bigo.ads.ah;

import android.animation.ObjectAnimator;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.internal.FacebookRequestErrorClassification;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.an.p;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* loaded from: classes13.dex */
public final class f extends b {
    final int l;
    int m;

    public f(int i, @NonNull sg.bigo.ads.api.core.g gVar, @NonNull o oVar, @Nullable o oVar2, @NonNull sg.bigo.ads.ad.splash.b bVar) {
        super(gVar, oVar, oVar2, bVar);
        this.l = i;
    }

    @Override // sg.bigo.ads.ah.b
    protected final void a(ViewGroup viewGroup, int i) {
        this.m = i;
    }

    @Override // sg.bigo.ads.ah.b, sg.bigo.ads.ah.c
    public final void a(boolean z, @NonNull final ViewGroup viewGroup, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        super.a(z, viewGroup, i);
        if (z) {
            final RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) viewGroup.findViewById(R.id.bigo_ad_splash_media_container);
            final ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.bigo_ad_splash_btn_cta_container_round);
            MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.bigo_ad_splash_media);
            if (viewGroup2 == null || roundedFrameLayout == null) {
                return;
            }
            final int a = sg.bigo.ads.common.utils.f.a(viewGroup2.getContext(), 20);
            final int a2 = sg.bigo.ads.common.utils.f.a(viewGroup2.getContext(), 12);
            final int a3 = sg.bigo.ads.common.utils.f.a(viewGroup2.getContext(), 38);
            final int a4 = sg.bigo.ads.common.utils.f.a(viewGroup2.getContext(), FacebookRequestErrorClassification.EC_INVALID_TOKEN);
            final ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewGroup2.getLayoutParams();
            marginLayoutParams2.width = 0;
            marginLayoutParams2.height = 0;
            viewGroup2.setLayoutParams(marginLayoutParams2);
            final int c = sg.bigo.ads.common.utils.f.c(viewGroup2.getContext());
            final int i3 = viewGroup2.getContext().getResources().getDisplayMetrics().widthPixels;
            final int i4 = (c - a3) - a;
            final p a5 = s.a(this.h.z);
            final p a6 = p.a(a5.b, a5.c, i3 - (a * 2), i4);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) roundedFrameLayout.getLayoutParams();
            marginLayoutParams3.width = a6.b;
            marginLayoutParams3.height = a6.c;
            roundedFrameLayout.setLayoutParams(marginLayoutParams3);
            roundedFrameLayout.setCornerRadius(a2);
            v.c(mediaView, -1, -1);
            o oVar = this.c;
            int a7 = oVar == null ? 0 : oVar.a("video_play_page.ad_component_show_time");
            if (a7 != 0) {
                int i5 = 1;
                if (a7 != 1) {
                    i5 = 3;
                    marginLayoutParams = marginLayoutParams3;
                    if (a7 != 2) {
                        if (a7 == 3) {
                            i5 = 5;
                        }
                    }
                } else {
                    marginLayoutParams = marginLayoutParams3;
                }
                i2 = i5;
                final ViewGroup.MarginLayoutParams marginLayoutParams4 = marginLayoutParams;
                viewGroup2.postDelayed(new Runnable() { // from class: sg.bigo.ads.ah.f.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (f.this.h.i) {
                            return;
                        }
                        TransitionSet transitionSet = new TransitionSet();
                        transitionSet.addTransition(new ChangeBounds());
                        transitionSet.addTransition(new Fade());
                        transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.an.h() { // from class: sg.bigo.ads.ah.f.1.1
                            @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
                            public final void onTransitionStart(Transition transition) {
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup2, "alpha", 0.0f, 1.0f);
                                ofFloat.setDuration(500L);
                                ofFloat.start();
                            }
                        });
                        TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
                        int i6 = a4;
                        if (5 == f.this.l) {
                            i6 = sg.bigo.ads.common.utils.f.a(viewGroup2.getContext(), 80);
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams5 = marginLayoutParams2;
                        marginLayoutParams5.width = i3 - a;
                        marginLayoutParams5.height = i6;
                        viewGroup2.setLayoutParams(marginLayoutParams5);
                        int i7 = i4 - i6;
                        int i8 = a6.c;
                        if (i8 > i7) {
                            int i9 = (int) (((i7 * 1.0f) * r2.b) / i8);
                            p pVar = a5;
                            p a8 = p.a(pVar.b, pVar.c, i9, i7);
                            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) roundedFrameLayout.getLayoutParams();
                            marginLayoutParams6.width = a8.b;
                            marginLayoutParams6.height = a8.c;
                            roundedFrameLayout.setLayoutParams(marginLayoutParams6);
                            roundedFrameLayout.setCornerRadius(a2);
                        }
                        int i10 = c;
                        int i11 = a3;
                        int i12 = (i10 - i11) / 2;
                        marginLayoutParams4.bottomMargin = Math.abs(((((i10 - i11) - i6) - a) / 2) - i12);
                        roundedFrameLayout.setLayoutParams(marginLayoutParams4);
                        ViewGroup viewGroup3 = viewGroup2;
                        if (f.this.m == 0) {
                            viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.bigo_ad_splash_btn_cta_container);
                        }
                        sg.bigo.ads.ad.splash.a.a(viewGroup3, f.this.m);
                    }
                }, i2 * 1000);
            }
            marginLayoutParams = marginLayoutParams3;
            i2 = 0;
            final ViewGroup.MarginLayoutParams marginLayoutParams42 = marginLayoutParams;
            viewGroup2.postDelayed(new Runnable() { // from class: sg.bigo.ads.ah.f.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (f.this.h.i) {
                        return;
                    }
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new ChangeBounds());
                    transitionSet.addTransition(new Fade());
                    transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.an.h() { // from class: sg.bigo.ads.ah.f.1.1
                        @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
                        public final void onTransitionStart(Transition transition) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup2, "alpha", 0.0f, 1.0f);
                            ofFloat.setDuration(500L);
                            ofFloat.start();
                        }
                    });
                    TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
                    int i6 = a4;
                    if (5 == f.this.l) {
                        i6 = sg.bigo.ads.common.utils.f.a(viewGroup2.getContext(), 80);
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = marginLayoutParams2;
                    marginLayoutParams5.width = i3 - a;
                    marginLayoutParams5.height = i6;
                    viewGroup2.setLayoutParams(marginLayoutParams5);
                    int i7 = i4 - i6;
                    int i8 = a6.c;
                    if (i8 > i7) {
                        int i9 = (int) (((i7 * 1.0f) * r2.b) / i8);
                        p pVar = a5;
                        p a8 = p.a(pVar.b, pVar.c, i9, i7);
                        ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) roundedFrameLayout.getLayoutParams();
                        marginLayoutParams6.width = a8.b;
                        marginLayoutParams6.height = a8.c;
                        roundedFrameLayout.setLayoutParams(marginLayoutParams6);
                        roundedFrameLayout.setCornerRadius(a2);
                    }
                    int i10 = c;
                    int i11 = a3;
                    int i12 = (i10 - i11) / 2;
                    marginLayoutParams42.bottomMargin = Math.abs(((((i10 - i11) - i6) - a) / 2) - i12);
                    roundedFrameLayout.setLayoutParams(marginLayoutParams42);
                    ViewGroup viewGroup3 = viewGroup2;
                    if (f.this.m == 0) {
                        viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.bigo_ad_splash_btn_cta_container);
                    }
                    sg.bigo.ads.ad.splash.a.a(viewGroup3, f.this.m);
                }
            }, i2 * 1000);
        }
    }

    @Override // sg.bigo.ads.ah.b
    protected final int e() {
        return 5 == this.l ? R.layout.bigo_ad_splash_style_5_card_widget : R.layout.bigo_ad_splash_style_4_cta_widget;
    }
}
