package sg.bigo.ads.j;

import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.bv.b;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* loaded from: classes10.dex */
public class v extends b {
    private RoundedFrameLayout A;
    private ImageView B;
    private TextView C;
    private TextView D;
    private TextView E;
    private IconListView F;
    private RoundedFrameLayout G;
    private Button H;
    private boolean I;
    private RoundedFrameLayout x;
    private LinearLayout y;
    private LinearLayout z;

    public v(@NonNull sg.bigo.ads.y.b bVar, int i, @NonNull sg.bigo.ads.ai.o oVar, @NonNull sg.bigo.ads.r.b bVar2, @Nullable sg.bigo.ads.n.c cVar) {
        super(bVar, i, oVar, bVar2, cVar);
        this.I = false;
    }

    static /* synthetic */ boolean b(v vVar) {
        vVar.I = true;
        return true;
    }

    @Override // sg.bigo.ads.j.b, sg.bigo.ads.j.a
    protected final void a(int i, boolean z, boolean z2) {
        super.a(i, z, z2);
        sg.bigo.ads.ai.o oVar = this.g;
        if (oVar == null || oVar.a("endpage.ad_component_clickable_switch") == 1) {
            sg.bigo.ads.y.a.a(this.x, 18);
            sg.bigo.ads.y.a.a(this.k, this.x, 8, this.f, i);
        } else {
            sg.bigo.ads.y.a.a(this.k, this.x, 8, sg.bigo.ads.ad.interstitial.r.H, 0);
        }
        IconListView iconListView = this.F;
        if (iconListView != null) {
            List<IconListView.a> items = iconListView.getItems();
            for (int i2 = 0; items != null && i2 < items.size(); i2++) {
                IconListView.a aVar = items.get(i2);
                sg.bigo.ads.y.a.a(aVar.d, 26);
                sg.bigo.ads.y.a.a(this.k, aVar.d, 8, this.f, i);
                sg.bigo.ads.y.a.a(aVar.g, 26);
                sg.bigo.ads.y.a.a(this.k, aVar.g, 8, this.f, i);
            }
        }
    }

    @Override // sg.bigo.ads.j.a
    protected final void a(View view) {
        View findViewById;
        if (view == null || this.h == null || (findViewById = view.findViewById(R.id.inter_media_ad_extra)) == null) {
            return;
        }
        this.h.a(findViewById, 0);
        this.h.a(view.findViewById(R.id.inter_options), 0);
    }

    @Override // sg.bigo.ads.j.a
    protected final void a(@NonNull sg.bigo.ads.ad.interstitial.r rVar, int i) {
        super.a(rVar, i);
        final int a = sg.bigo.ads.common.utils.f.a(this.l.getContext(), 16);
        final int a2 = sg.bigo.ads.common.utils.f.a(this.k.getContext(), 40);
        final int a3 = sg.bigo.ads.common.utils.f.a(this.l.getContext(), 72);
        final Pair<Integer, Boolean> e = e(rVar);
        if (((a) this).j != null) {
            final boolean[] zArr = {false, false};
            this.l.postDelayed(new Runnable() { // from class: sg.bigo.ads.j.v.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) v.this.f)) {
                        return;
                    }
                    v.b(v.this);
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new ChangeBounds());
                    transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.an.h() { // from class: sg.bigo.ads.j.v.1.1
                        @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
                        public final void onTransitionEnd(Transition transition) {
                            v.this.n();
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            zArr[0] = true;
                            RoundedFrameLayout roundedFrameLayout = v.this.G;
                            AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                            boolean[] zArr2 = zArr;
                            sg.bigo.ads.r.e.a(roundedFrameLayout, zArr2[0], zArr2[1], ((Boolean) e.second).booleanValue());
                        }

                        @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
                        public final void onTransitionStart(final Transition transition) {
                            v.this.m();
                            sg.bigo.ads.bv.b.a(v.this.y, -1, new b.a() { // from class: sg.bigo.ads.j.v.1.1.1
                                @Override // sg.bigo.ads.bv.b.a
                                public final long a() {
                                    return transition.getDuration();
                                }
                            });
                            RoundedFrameLayout roundedFrameLayout = v.this.G;
                            Button button = v.this.H;
                            int intValue = ((Integer) e.first).intValue();
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            sg.bigo.ads.r.e.a(roundedFrameLayout, button, intValue, zArr, ((Boolean) e.second).booleanValue(), transition.getDuration());
                        }
                    });
                    TransitionManager.beginDelayedTransition(v.this.l, transitionSet);
                    v.this.x.setCornerRadius(a);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.this.z.getLayoutParams();
                    int i2 = a;
                    marginLayoutParams.setMargins(i2, i2, i2, 0);
                    v.this.z.setLayoutParams(marginLayoutParams);
                    v.this.A.setCornerRadius(a);
                    ViewGroup.LayoutParams layoutParams = v.this.B.getLayoutParams();
                    int i3 = a3;
                    layoutParams.width = i3;
                    layoutParams.height = i3;
                    v.this.B.setLayoutParams(layoutParams);
                    v.this.D.setVisibility(0);
                    v.this.D.setTextColor(((Integer) e.first).intValue());
                    v.this.E.setTextSize(2, 12.0f);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) v.this.E.getLayoutParams();
                    marginLayoutParams2.topMargin = sg.bigo.ads.common.utils.f.a(v.this.k.getContext(), 4);
                    v.this.E.setLayoutParams(marginLayoutParams2);
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) v.this.F.getLayoutParams();
                    marginLayoutParams3.topMargin = a;
                    v.this.F.setLayoutParams(marginLayoutParams3);
                    if (sg.bigo.ads.common.utils.l.a((Collection) v.this.F.getItems())) {
                        v.this.F.setVisibility(8);
                    } else {
                        v.this.F.setVisibility(0);
                    }
                    v.this.z.removeView(v.this.G);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, a2);
                    int i4 = a;
                    layoutParams2.setMargins(i4, i4, i4, i4);
                    v.this.y.addView(v.this.G, layoutParams2);
                    v vVar = v.this;
                    vVar.p.a(vVar.C);
                    v vVar2 = v.this;
                    vVar2.p.a(vVar2.E);
                    v.this.C.setTextColor(sg.bigo.ads.ad.interstitial.d.b);
                    v.this.E.setTextColor(sg.bigo.ads.ad.interstitial.d.b);
                }
            }, Math.max(1, i) * 1000);
        } else {
            if (this.G == null || !((Boolean) e.second).booleanValue()) {
                return;
            }
            sg.bigo.ads.ad.interstitial.c.e(this.G);
        }
    }

    @Override // sg.bigo.ads.j.b
    protected final void b(double d) {
        super.b(d);
        if (this.I) {
            return;
        }
        if (d <= 3.0d) {
            Button button = this.H;
            if (button != null) {
                button.setBackgroundColor(857743652);
                return;
            }
            return;
        }
        Button button2 = this.H;
        if (button2 != null) {
            button2.setBackgroundColor(872415231);
        }
    }

    @Override // sg.bigo.ads.j.b
    protected final void g(sg.bigo.ads.ad.interstitial.r rVar) {
        super.g(rVar);
        if (l()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.s.getLayoutParams();
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.height = sg.bigo.ads.common.utils.f.a(this.l.getContext(), 24);
            this.s.setLayoutParams(marginLayoutParams);
            this.s.setVisibility(4);
        }
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) this.l.findViewById(R.id.inter_media_ad_card_layout);
        this.x = roundedFrameLayout;
        this.y = (LinearLayout) roundedFrameLayout.findViewById(R.id.inter_media_ad_card_container);
        this.z = (LinearLayout) this.x.findViewById(R.id.inter_media_ad_card_top_layout);
        this.A = (RoundedFrameLayout) this.x.findViewById(R.id.inter_rounded_icon_layout);
        this.B = (ImageView) this.x.findViewById(R.id.inter_icon);
        this.C = (TextView) this.x.findViewById(R.id.inter_title);
        this.D = (TextView) this.x.findViewById(R.id.inter_company);
        this.E = (TextView) this.x.findViewById(R.id.inter_description);
        this.G = (RoundedFrameLayout) this.x.findViewById(R.id.inter_btn_cta_layout);
        this.H = (Button) this.x.findViewById(R.id.inter_btn_cta);
        RoundedFrameLayout roundedFrameLayout2 = this.x;
        roundedFrameLayout2.a(roundedFrameLayout2.getCornerRadiusTopLeft(), this.G.getCornerRadiusTopRight(), this.x.getCornerRadiusBottomLeft(), this.G.getCornerRadiusBottomRight());
        IconListView iconListView = (IconListView) this.x.findViewById(R.id.inter_download_msg);
        this.F = iconListView;
        iconListView.a(((a) this).j);
        this.F.setVisibility(8);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
        marginLayoutParams2.topMargin = sg.bigo.ads.common.utils.f.a(this.m.getContext(), 0);
        this.m.setLayoutParams(marginLayoutParams2);
        this.p.b(this.C);
        this.p.b(this.E);
        this.p.b(this.m);
    }

    @Override // sg.bigo.ads.j.a
    protected final int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_9;
    }
}
