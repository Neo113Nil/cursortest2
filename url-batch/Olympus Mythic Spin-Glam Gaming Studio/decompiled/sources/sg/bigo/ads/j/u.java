package sg.bigo.ads.j;

import android.graphics.Bitmap;
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
import sg.bigo.ads.R;
import sg.bigo.ads.bv.b;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* loaded from: classes12.dex */
public class u extends b {
    private ImageView A;
    private TextView B;
    private TextView C;
    private ImageView D;
    private RoundedFrameLayout E;
    private Button F;
    private boolean G;
    private RoundedFrameLayout x;
    private LinearLayout y;
    private RoundedFrameLayout z;

    public u(@NonNull sg.bigo.ads.y.b bVar, int i, @NonNull sg.bigo.ads.ai.o oVar, @NonNull sg.bigo.ads.r.b bVar2, @Nullable sg.bigo.ads.n.c cVar) {
        super(bVar, i, oVar, bVar2, cVar);
        this.G = false;
    }

    static /* synthetic */ boolean b(u uVar) {
        uVar.G = true;
        return true;
    }

    @Override // sg.bigo.ads.j.b, sg.bigo.ads.j.a
    protected final void a(int i, boolean z, boolean z2) {
        super.a(i, z, z2);
        sg.bigo.ads.ai.o oVar = this.g;
        boolean z3 = true;
        if (oVar != null && oVar.a("endpage.ad_component_clickable_switch") != 1) {
            z3 = false;
        }
        sg.bigo.ads.y.a.a(this.x, 18);
        if (z3) {
            sg.bigo.ads.y.a.a(this.k, this.x, 8, this.f, i);
        } else {
            sg.bigo.ads.y.a.a(this.k, this.x, 8, sg.bigo.ads.ad.interstitial.r.H, 0);
        }
    }

    @Override // sg.bigo.ads.j.a
    protected final void a(View view) {
        View findViewById;
        if (view == null || this.h == null || (findViewById = view.findViewById(R.id.inter_media_ad_extra)) == null) {
            return;
        }
        this.h.a(findViewById, 0);
    }

    @Override // sg.bigo.ads.j.a
    protected final void a(@NonNull sg.bigo.ads.ad.interstitial.r rVar, int i) {
        super.a(rVar, i);
        final int a = sg.bigo.ads.common.utils.f.a(this.l.getContext(), 12);
        final int a2 = sg.bigo.ads.common.utils.f.a(this.l.getContext(), 16);
        final int a3 = sg.bigo.ads.common.utils.f.a(this.l.getContext(), 20);
        final int a4 = sg.bigo.ads.common.utils.f.a(this.l.getContext(), 72);
        int max = Math.max(1, i);
        final boolean[] zArr = {false, false};
        final Pair<Integer, Boolean> e = e(rVar);
        this.l.postDelayed(new Runnable() { // from class: sg.bigo.ads.j.u.1
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) u.this.f)) {
                    return;
                }
                u.b(u.this);
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.addTransition(new ChangeBounds());
                transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.an.h() { // from class: sg.bigo.ads.j.u.1.1
                    @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
                    public final void onTransitionEnd(Transition transition) {
                        u.this.n();
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        zArr[0] = true;
                        RoundedFrameLayout roundedFrameLayout = u.this.E;
                        AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                        boolean[] zArr2 = zArr;
                        sg.bigo.ads.r.e.a(roundedFrameLayout, zArr2[0], zArr2[1], ((Boolean) e.second).booleanValue());
                    }

                    @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
                    public final void onTransitionStart(final Transition transition) {
                        u.this.m();
                        sg.bigo.ads.bv.b.a(u.this.y, -1, new b.a() { // from class: sg.bigo.ads.j.u.1.1.1
                            @Override // sg.bigo.ads.bv.b.a
                            public final long a() {
                                return transition.getDuration();
                            }
                        });
                        RoundedFrameLayout roundedFrameLayout = u.this.E;
                        Button button = u.this.F;
                        int intValue = ((Integer) e.first).intValue();
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        sg.bigo.ads.r.e.a(roundedFrameLayout, button, intValue, zArr, ((Boolean) e.second).booleanValue(), transition.getDuration());
                    }
                });
                TransitionManager.beginDelayedTransition(u.this.l, transitionSet);
                u.this.x.setCornerRadius(a);
                if (u.this.l()) {
                    ViewGroup.LayoutParams layoutParams = u.this.s.getLayoutParams();
                    layoutParams.height = a2;
                    u.this.s.setLayoutParams(layoutParams);
                }
                int childCount = u.this.y.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = u.this.y.getChildAt(i2);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    int i3 = a2;
                    layoutParams2.leftMargin = i3;
                    layoutParams2.rightMargin = i3;
                    if (i2 == 0) {
                        layoutParams2.topMargin = i3;
                    }
                    if (i2 == childCount - 1) {
                        layoutParams2.bottomMargin = i3;
                    }
                    if (childAt.getId() == R.id.inter_btn_cta_layout) {
                        layoutParams2.topMargin = a3;
                    }
                    childAt.setLayoutParams(layoutParams2);
                }
                u.this.z.setCornerRadius(a2);
                ViewGroup.LayoutParams layoutParams3 = u.this.A.getLayoutParams();
                int i4 = a4;
                layoutParams3.width = i4;
                layoutParams3.height = i4;
                u.this.A.setLayoutParams(layoutParams3);
                u uVar = u.this;
                uVar.p.a(uVar.B);
                u uVar2 = u.this;
                uVar2.p.a(uVar2.C);
                u.this.B.setTextColor(sg.bigo.ads.ad.interstitial.d.b);
                u.this.C.setTextColor(sg.bigo.ads.ad.interstitial.d.b);
                u.this.D.setVisibility(0);
            }
        }, max * 1000);
    }

    @Override // sg.bigo.ads.j.b
    protected final void b(double d) {
        super.b(d);
        if (this.G) {
            return;
        }
        if (d <= 3.0d) {
            Button button = this.F;
            if (button != null) {
                button.setBackgroundColor(857743652);
                return;
            }
            return;
        }
        Button button2 = this.F;
        if (button2 != null) {
            button2.setBackgroundColor(872415231);
        }
    }

    @Override // sg.bigo.ads.j.b
    protected final void g(sg.bigo.ads.ad.interstitial.r rVar) {
        Bitmap a;
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
        this.y = (LinearLayout) roundedFrameLayout.findViewById(R.id.inter_media_ad_card_info_container);
        this.z = (RoundedFrameLayout) this.x.findViewById(R.id.inter_rounded_icon_layout);
        this.A = (ImageView) this.x.findViewById(R.id.inter_icon);
        this.B = (TextView) this.x.findViewById(R.id.inter_title);
        this.C = (TextView) this.x.findViewById(R.id.inter_description);
        this.E = (RoundedFrameLayout) this.l.findViewById(R.id.inter_btn_cta_layout);
        this.F = (Button) this.x.findViewById(R.id.inter_btn_cta);
        this.D = (ImageView) this.x.findViewById(R.id.inter_star);
        RoundedFrameLayout roundedFrameLayout2 = this.x;
        roundedFrameLayout2.a(roundedFrameLayout2.getCornerRadiusTopLeft(), this.x.getCornerRadiusTopRight(), this.E.getCornerRadiusBottomLeft(), this.E.getCornerRadiusBottomRight());
        ImageView imageView = this.D;
        if (imageView != null && (a = sg.bigo.ads.ad.interstitial.s.a(imageView.getContext(), this.f, ((a) this).j, sg.bigo.ads.ad.interstitial.g.BLACK)) != null) {
            this.D.setImageBitmap(a);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
        marginLayoutParams2.topMargin = sg.bigo.ads.common.utils.f.a(this.m.getContext(), 0);
        this.m.setLayoutParams(marginLayoutParams2);
        this.p.b(this.B);
        this.p.b(this.C);
        this.p.b(this.m);
    }

    @Override // sg.bigo.ads.j.a
    protected final int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_8;
    }
}
