package sg.bigo.ads.k;

import android.content.Context;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.bv.b;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.k.a;
import sg.bigo.ads.k.b;

/* loaded from: classes9.dex */
public class i extends g {
    private IconListView O;

    /* renamed from: sg.bigo.ads.k.i$4, reason: invalid class name */
    final class AnonymousClass4 implements v.a {
        AnonymousClass4() {
        }

        @Override // sg.bigo.ads.common.utils.v.a
        public final void a(View view, @NonNull Rect rect) {
            i.this.C();
        }
    }

    public i(@NonNull sg.bigo.ads.y.b bVar) {
        super(bVar);
    }

    static /* synthetic */ void a(i iVar) {
        if (((b) iVar).z == null || iVar.x) {
            return;
        }
        final boolean v = iVar.v();
        final boolean[] zArr = {false, false};
        Context context = ((b) iVar).z.getContext();
        int a = sg.bigo.ads.common.utils.f.a(context, 12);
        int a2 = sg.bigo.ads.common.utils.f.a(context, 8);
        int a3 = sg.bigo.ads.common.utils.f.a(context, 48);
        final a.C1909a u = iVar.u();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new b.a());
        transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.an.h() { // from class: sg.bigo.ads.k.i.3
            @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                boolean[] zArr2 = zArr;
                zArr2[0] = true;
                sg.bigo.ads.r.e.a(i.this.H, true, zArr2[1], v);
            }

            @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
            public final void onTransitionStart(final Transition transition) {
                sg.bigo.ads.bv.b.a(((b) i.this).z, -1, new b.a() { // from class: sg.bigo.ads.k.i.3.1
                    @Override // sg.bigo.ads.bv.b.a
                    public final long a() {
                        return transition.getDuration();
                    }
                });
                Button button = i.this.H;
                sg.bigo.ads.r.e.a(button, button, u.a, zArr, v, transition.getDuration());
            }
        });
        transitionSet.setDuration(300L);
        TransitionManager.beginDelayedTransition(iVar.s, transitionSet);
        TextView textView = iVar.F;
        if (textView != null) {
            sg.bigo.ads.bv.b.a(textView.getCurrentTextColor(), sg.bigo.ads.ad.interstitial.b.a.f, transitionSet.getDuration(), iVar.F);
        }
        TextView textView2 = iVar.G;
        if (textView2 != null) {
            sg.bigo.ads.bv.b.a(textView2.getCurrentTextColor(), sg.bigo.ads.ad.interstitial.b.a.g, transitionSet.getDuration(), iVar.G);
        }
        ((b) iVar).z.setOutlineProvider(new sg.bigo.ads.cc.b(sg.bigo.ads.common.utils.f.a(context, 12)));
        ((b) iVar).z.setPadding(a, a, a, a);
        ((b) iVar).z.getLayoutParams().width = sg.bigo.ads.common.utils.f.a(((b) iVar).z.getContext(), 288);
        LinearLayout linearLayout = ((g) iVar).N;
        if (linearLayout != null) {
            linearLayout.setMinimumHeight(a3);
            ((RelativeLayout.LayoutParams) ((g) iVar).N.getLayoutParams()).addRule(0, 0);
        }
        RoundedImageView roundedImageView = iVar.J;
        if (roundedImageView != null) {
            ViewGroup.LayoutParams layoutParams = roundedImageView.getLayoutParams();
            layoutParams.width = a3;
            layoutParams.height = a3;
        }
        TextView textView3 = iVar.F;
        if (textView3 != null) {
            textView3.setMaxLines(2);
        }
        int i = R.id.inter_text_layout;
        IconListView iconListView = iVar.O;
        if (iconListView != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) iconListView.getLayoutParams();
            if (sg.bigo.ads.common.utils.l.a((Collection) iVar.O.getItems())) {
                iVar.O.setVisibility(8);
            } else {
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                layoutParams2.topMargin = a2;
                i = iVar.O.getId();
                iVar.O.setVisibility(0);
                sg.bigo.ads.ad.interstitial.c.a(10, 100, 300L, new ValueCallback<Integer>() { // from class: sg.bigo.ads.k.i.5
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Integer num) {
                        i.this.O.setAlpha((num.intValue() * 1.0f) / 100.0f);
                    }
                }, new ValueCallback<Void>() { // from class: sg.bigo.ads.k.i.6
                    @Override // android.webkit.ValueCallback
                    public final /* bridge */ /* synthetic */ void onReceiveValue(Void r1) {
                    }
                });
                a = a2;
            }
        }
        Button button = iVar.H;
        if (button != null) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) button.getLayoutParams();
            layoutParams3.width = -1;
            layoutParams3.addRule(3, i);
            layoutParams3.addRule(1, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
            layoutParams3.topMargin = a;
        }
        sg.bigo.ads.ad.interstitial.b bVar = sg.bigo.ads.ad.interstitial.b.a;
        bVar.a(iVar.F, iVar.G);
        bVar.b(((b) iVar).z);
        bVar.a(iVar.H);
        bVar.a(iVar.J);
        ((b) iVar).z.requestLayout();
    }

    @Override // sg.bigo.ads.k.b
    protected final void A() {
        if (((b) this).z == null) {
            return;
        }
        int max = Math.max(1, super.y());
        final Runnable runnable = new Runnable() { // from class: sg.bigo.ads.k.i.1
            @Override // java.lang.Runnable
            public final void run() {
                i.a(i.this);
            }
        };
        a(max, new Runnable() { // from class: sg.bigo.ads.k.i.2
            @Override // java.lang.Runnable
            public final void run() {
                ((b) i.this).z.post(new Runnable() { // from class: sg.bigo.ads.k.i.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (i.this.O != null) {
                            ((RelativeLayout.LayoutParams) i.this.O.getLayoutParams()).width = (((b) i.this).z.getMeasuredWidth() - ((b) i.this).z.getPaddingLeft()) - ((b) i.this).z.getPaddingRight();
                            i.this.O.requestLayout();
                        }
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        ((b) i.this).z.post(runnable);
                    }
                });
            }
        });
    }

    @Override // sg.bigo.ads.k.b
    protected final void H() {
        super.H();
        IconListView iconListView = this.O;
        if (iconListView != null) {
            List<IconListView.a> items = iconListView.getItems();
            for (int i = 0; items != null && i < items.size(); i++) {
                IconListView.a aVar = items.get(i);
                sg.bigo.ads.y.a.a(aVar.d, 26);
                sg.bigo.ads.y.a.a(this.r, aVar.d, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, this.t.i);
                sg.bigo.ads.y.a.a(aVar.g, 26);
                sg.bigo.ads.y.a.a(this.r, aVar.g, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, this.t.i);
            }
        }
    }

    @Override // sg.bigo.ads.k.g, sg.bigo.ads.k.b
    protected final boolean a(@NonNull sg.bigo.ads.ad.interstitial.b bVar) {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout;
        if (!super.a(bVar) || (realtimeBlurLinearLayout = ((b) this).z) == null) {
            return false;
        }
        IconListView iconListView = (IconListView) realtimeBlurLinearLayout.findViewById(R.id.inter_download_msg);
        this.O = iconListView;
        iconListView.a(this.v);
        return true;
    }

    @Override // sg.bigo.ads.k.g
    protected final void b(int i) {
    }

    @Override // sg.bigo.ads.k.g
    protected final void c(int i) {
        Button button = this.H;
        if (button != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) button.getLayoutParams();
            layoutParams.addRule(11);
            layoutParams.addRule(1);
            LinearLayout linearLayout = ((g) this).N;
            if (linearLayout != null) {
                ((RelativeLayout.LayoutParams) linearLayout.getLayoutParams()).addRule(0, this.H.getId());
            }
        }
        super.c(i);
    }

    @Override // sg.bigo.ads.k.a
    protected final int y() {
        return Math.min(0, super.y());
    }

    @Override // sg.bigo.ads.k.g, sg.bigo.ads.k.b
    protected final int z() {
        return R.id.inter_component_26;
    }
}
