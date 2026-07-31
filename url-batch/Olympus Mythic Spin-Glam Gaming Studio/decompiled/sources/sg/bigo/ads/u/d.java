package sg.bigo.ads.u;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.an.p;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.l;

/* loaded from: classes13.dex */
public final class d extends c {
    private TextView x;
    private TextView y;
    private IconListView z;

    protected d(@NonNull sg.bigo.ads.y.b bVar, @NonNull o oVar, p pVar) {
        super(bVar, oVar, pVar);
    }

    @Override // sg.bigo.ads.u.c, sg.bigo.ads.u.a
    protected final void a(int i, boolean z, boolean z2) {
        super.a(i, z, z2);
        o oVar = this.g;
        boolean z3 = true;
        if (oVar != null && oVar.a("layer.ad_component_clickable_switch") != 1) {
            z3 = false;
        }
        View view = this.t;
        if (view != null) {
            sg.bigo.ads.y.a.a(view, 18);
            ViewGroup viewGroup = this.k;
            if (z3) {
                sg.bigo.ads.y.a.a(viewGroup, this.t, 8, this.f, i);
            } else {
                sg.bigo.ads.y.a.a(viewGroup, this.t, 8, r.H, 0);
            }
        }
        IconListView iconListView = this.z;
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

    @Override // sg.bigo.ads.u.c
    protected final void a(@NonNull r rVar, @NonNull Rect rect) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.z.getLayoutParams();
        layoutParams.addRule(3, this.v.getId());
        layoutParams.addRule(2, 0);
        this.z.requestLayout();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.o.getLayoutParams();
        layoutParams2.addRule(12, 0);
        layoutParams2.addRule(3, (l.a((Collection) this.z.getItems()) ? this.v : this.z).getId());
        this.o.requestLayout();
        p b = b(rVar);
        int a = f.a(this.v.getContext(), 16);
        int width = rect.width();
        int height = rect.height();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.v.getLayoutParams();
        layoutParams3.addRule(2, 0);
        int i = p.b(b.b, b.c, width).c;
        if (i <= height) {
            layoutParams3.height = i;
        } else {
            int i2 = a * 2;
            layoutParams3.height = p.a(b.b, b.c, width - i2, height - i2).c + i2;
            ((ViewGroup.MarginLayoutParams) this.n.getLayoutParams()).setMargins(a, a, a, a);
            this.n.requestLayout();
        }
        this.v.requestLayout();
    }

    @Override // sg.bigo.ads.u.c, sg.bigo.ads.u.a
    protected final void d(@NonNull r rVar) {
        IconListView iconListView;
        int i;
        super.d(rVar);
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_description);
        this.y = textView;
        sg.bigo.ads.ad.interstitial.b bVar = sg.bigo.ads.ad.interstitial.b.a;
        bVar.a(null, textView);
        IconListView iconListView2 = (IconListView) this.l.findViewById(R.id.inter_download_msg);
        this.z = iconListView2;
        iconListView2.a(((a) this).j);
        if (l.a((Collection) this.z.getItems())) {
            iconListView = this.z;
            i = 8;
        } else {
            iconListView = this.z;
            i = 0;
        }
        iconListView.setVisibility(i);
        int a = f.a(this.l.getContext(), 16);
        View view = this.t;
        if (view != null) {
            float f = a;
            view.setBackground(e.a(f, f, f, f, (Rect) null, -1));
            bVar.b(this.t);
        }
        a(rVar, this.w);
    }

    @Override // sg.bigo.ads.u.c, sg.bigo.ads.u.a
    protected final void f(@NonNull r rVar) {
        super.f(rVar);
        ViewGroup viewGroup = this.l;
        if (viewGroup != null) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.inter_company);
            this.x = textView;
            if (textView != null) {
                textView.setTextColor(g(rVar));
            }
        }
    }

    @Override // sg.bigo.ads.u.c, sg.bigo.ads.u.a
    protected final int h() {
        return R.layout.bigo_ad_view_click_guide_3;
    }

    @Override // sg.bigo.ads.u.c
    @NonNull
    protected final sg.bigo.ads.ad.interstitial.b l() {
        return sg.bigo.ads.ad.interstitial.b.a;
    }
}
