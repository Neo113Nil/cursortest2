package sg.bigo.ads.j;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.common.view.RoundedImageView;

/* loaded from: classes5.dex */
public class l extends k {
    private TextView w;
    private TextView x;
    private IconListView y;

    public l(@NonNull sg.bigo.ads.y.b bVar, int i, @NonNull sg.bigo.ads.ai.o oVar, @Nullable sg.bigo.ads.n.c cVar) {
        super(bVar, i, oVar, cVar);
    }

    @Override // sg.bigo.ads.j.k
    protected final void a(int i) {
        super.a(i);
        sg.bigo.ads.ad.interstitial.b.a.a(this.v);
        ViewGroup viewGroup = this.l;
        if (viewGroup != null) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.inter_company);
            this.w = textView;
            if (textView != null) {
                textView.setTextColor(i);
            }
        }
    }

    @Override // sg.bigo.ads.j.k, sg.bigo.ads.j.a
    protected final void a(int i, boolean z, boolean z2) {
        sg.bigo.ads.y.a.a(this.t, 5);
        sg.bigo.ads.y.a.a(this.u, 5);
        if (z) {
            sg.bigo.ads.y.a.a(this.k, this.t, 4, this.f, i);
            sg.bigo.ads.y.a.a(this.k, this.u, 4, this.f, i);
        } else {
            ViewGroup viewGroup = this.k;
            RoundedImageView roundedImageView = this.t;
            sg.bigo.ads.core.adview.h hVar = sg.bigo.ads.ad.interstitial.r.H;
            sg.bigo.ads.y.a.a(viewGroup, roundedImageView, 4, hVar, 0);
            sg.bigo.ads.y.a.a(this.k, this.u, 4, hVar, 0);
        }
        sg.bigo.ads.y.a.a(this.l, 9);
        ViewGroup viewGroup2 = this.k;
        if (z2) {
            sg.bigo.ads.y.a.a(viewGroup2, this.l, 4, this.f, i);
        } else {
            sg.bigo.ads.y.a.a(viewGroup2, this.l, 4, sg.bigo.ads.ad.interstitial.r.H, 0);
        }
        sg.bigo.ads.ai.o oVar = this.g;
        boolean z3 = true;
        if (oVar != null && oVar.a("endpage.ad_component_clickable_switch") != 1) {
            z3 = false;
        }
        View view = this.p;
        if (view != null) {
            sg.bigo.ads.y.a.a(view, 18);
            ViewGroup viewGroup3 = this.k;
            if (z3) {
                sg.bigo.ads.y.a.a(viewGroup3, this.p, 8, this.f, i);
            } else {
                sg.bigo.ads.y.a.a(viewGroup3, this.p, 8, sg.bigo.ads.ad.interstitial.r.H, 0);
            }
        }
        IconListView iconListView = this.y;
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

    @Override // sg.bigo.ads.j.k
    protected final void a(sg.bigo.ads.ad.interstitial.r rVar, @NonNull Rect rect) {
        sg.bigo.ads.an.p b = b(rVar);
        int a = sg.bigo.ads.common.utils.f.a(this.s.getContext(), 16);
        int width = rect.width();
        int height = rect.height();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.s.getLayoutParams();
        int i = sg.bigo.ads.an.p.b(b.b, b.c, width).c;
        if (i <= height) {
            layoutParams.height = i;
        } else {
            int i2 = a * 2;
            layoutParams.height = sg.bigo.ads.an.p.a(b.b, b.c, width - i2, height - i2).c + i2;
            ((ViewGroup.MarginLayoutParams) this.t.getLayoutParams()).setMargins(a, a, a, a);
            this.t.requestLayout();
        }
        this.s.requestLayout();
    }

    @Override // sg.bigo.ads.j.k, sg.bigo.ads.j.a
    protected final void d(sg.bigo.ads.ad.interstitial.r rVar) {
        IconListView iconListView;
        int i;
        super.d(rVar);
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_description);
        this.x = textView;
        sg.bigo.ads.ad.interstitial.b bVar = sg.bigo.ads.ad.interstitial.b.a;
        bVar.a(null, textView);
        IconListView iconListView2 = (IconListView) this.l.findViewById(R.id.inter_download_msg);
        this.y = iconListView2;
        iconListView2.a(((a) this).j);
        if (sg.bigo.ads.common.utils.l.a((Collection) this.y.getItems())) {
            iconListView = this.y;
            i = 8;
        } else {
            iconListView = this.y;
            i = 0;
        }
        iconListView.setVisibility(i);
        int a = sg.bigo.ads.common.utils.f.a(this.l.getContext(), 16);
        View view = this.p;
        if (view != null) {
            float f = a;
            view.setBackground(sg.bigo.ads.common.utils.e.a(f, f, f, f, (Rect) null, -1));
            bVar.b(this.p);
        }
        a(rVar, this.u);
    }

    @Override // sg.bigo.ads.j.k, sg.bigo.ads.j.a
    protected final int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_19;
    }

    @Override // sg.bigo.ads.j.k
    @NonNull
    protected final sg.bigo.ads.ad.interstitial.b l() {
        return sg.bigo.ads.ad.interstitial.b.a;
    }
}
