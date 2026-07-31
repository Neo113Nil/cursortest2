package sg.bigo.ads.j;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.u;

/* loaded from: classes5.dex */
public final class w extends ab {
    private ViewGroup u;
    private final sg.bigo.ads.aa.b v;
    private boolean w;
    private boolean x;
    private final int y;
    private final int z;

    public w(@NonNull sg.bigo.ads.y.b bVar, @NonNull sg.bigo.ads.ai.o oVar, @Nullable sg.bigo.ads.n.c cVar) {
        super(bVar, oVar, cVar);
        this.y = 0;
        this.z = 1;
        this.v = (sg.bigo.ads.aa.b) bVar;
        this.p = oVar.a("multi_ads_endpage.ad_component_layout");
    }

    @Override // sg.bigo.ads.j.ab, sg.bigo.ads.j.a
    protected final void a(@NonNull sg.bigo.ads.ad.interstitial.r rVar, int i) {
        super.a(rVar, i);
        a((Button) this.u.findViewById(R.id.inter_btn_cta), rVar);
    }

    @Override // sg.bigo.ads.j.ab
    protected final void a(boolean z) {
        super.a(z);
        if (this.x) {
            return;
        }
        this.x = true;
        if (z) {
            sg.bigo.ads.y.a.a(this.k, this.u, 13, this.v.f(1), this.s);
        } else {
            sg.bigo.ads.y.a.a(this.k, this.u, 13, sg.bigo.ads.ad.interstitial.r.H, 0);
        }
    }

    @Override // sg.bigo.ads.j.ab, sg.bigo.ads.ad.interstitial.v
    public final boolean a(@NonNull sg.bigo.ads.ad.interstitial.r rVar, @NonNull ViewGroup viewGroup, @NonNull View view, u.a aVar, int i, int i2, int i3, @Nullable View... viewArr) {
        sg.bigo.ads.y.b f = this.v.f(0);
        if (f != null) {
            super.a(f, rVar, viewGroup, this.q, aVar, i, 13, i3, viewArr);
        } else {
            this.q.setVisibility(8);
        }
        sg.bigo.ads.y.b f2 = this.v.f(1);
        if (f2 != null) {
            super.a(f2, rVar, viewGroup, this.u, aVar, i, 13, i3, viewArr);
        } else {
            this.u.setVisibility(8);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    @Override // sg.bigo.ads.j.ab, sg.bigo.ads.j.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void d(sg.bigo.ads.ad.interstitial.r rVar) {
        ViewGroup viewGroup;
        int i;
        ViewGroup viewGroup2;
        super.d(rVar);
        int i2 = this.p;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        viewGroup = this.l;
                        i = R.id.bigo_ad_end_stub_2_half_wrap;
                        this.u = (ViewGroup) ((ViewStub) viewGroup.findViewById(i)).inflate();
                        if (1 == this.p && (viewGroup2 = this.u) != null) {
                            ((ViewGroup.MarginLayoutParams) viewGroup2.getLayoutParams()).topMargin = sg.bigo.ads.common.utils.f.a(this.l.getContext(), 58);
                        }
                        ab.a((ViewGroup) this.u.findViewById(R.id.bigo_ad_inter_layout_end_page));
                    }
                }
            }
            ViewGroup viewGroup3 = (ViewGroup) ((ViewStub) this.l.findViewById(R.id.bigo_ad_end_stub_2_img_wrap)).inflate();
            this.u = viewGroup3;
            a(rVar, viewGroup3, this.v.f(1));
            if (1 == this.p) {
                ((ViewGroup.MarginLayoutParams) viewGroup2.getLayoutParams()).topMargin = sg.bigo.ads.common.utils.f.a(this.l.getContext(), 58);
            }
            ab.a((ViewGroup) this.u.findViewById(R.id.bigo_ad_inter_layout_end_page));
        }
        viewGroup = this.l;
        i = R.id.bigo_ad_end_stub_2_all_wrap;
        this.u = (ViewGroup) ((ViewStub) viewGroup.findViewById(i)).inflate();
        if (1 == this.p) {
        }
        ab.a((ViewGroup) this.u.findViewById(R.id.bigo_ad_inter_layout_end_page));
    }

    @Override // sg.bigo.ads.j.ab, sg.bigo.ads.j.a
    protected final int h() {
        return R.layout.bigo_ad_activity_interstitial_multi_mix_end;
    }

    @Override // sg.bigo.ads.j.a
    protected final boolean k() {
        return true;
    }

    @Override // sg.bigo.ads.j.ab
    protected final int l() {
        return 13;
    }

    @Override // sg.bigo.ads.j.ab
    protected final sg.bigo.ads.y.b m() {
        sg.bigo.ads.aa.b bVar = this.v;
        if (bVar != null) {
            return bVar.f(0);
        }
        return null;
    }

    @Override // sg.bigo.ads.j.ab
    protected final ViewGroup n() {
        return this.u;
    }

    @Override // sg.bigo.ads.j.ab
    protected final void o() {
        super.o();
        if (this.w) {
            return;
        }
        ViewGroup viewGroup = this.u;
        View findViewWithTag = viewGroup != null ? viewGroup.findViewWithTag(9) : null;
        if (this.r && findViewWithTag != null) {
            this.w = true;
            sg.bigo.ads.y.a.a(this.k, findViewWithTag, 13, this.v.f(1), this.s);
        } else if (findViewWithTag != null) {
            this.w = true;
            sg.bigo.ads.y.a.a(this.k, findViewWithTag, 13, sg.bigo.ads.ad.interstitial.r.H, this.s);
        }
    }
}
