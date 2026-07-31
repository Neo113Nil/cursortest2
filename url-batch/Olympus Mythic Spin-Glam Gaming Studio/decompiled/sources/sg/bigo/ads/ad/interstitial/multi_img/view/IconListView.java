package sg.bigo.ads.ad.interstitial.multi_img.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.f;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.y.e;

/* loaded from: classes8.dex */
public class IconListView extends LinearLayout {
    private boolean a;
    private List<a> b;

    public static class a {
        public final Context a;
        public final View b;
        public boolean c;
        public final LinearLayout d;
        public final TextView e;
        public final ImageView f;
        public final LinearLayout g;
        public final TextView h;
        public final ImageView i;
        public final f.a j;
        public final String k;

        public a(Context context, f.a aVar, String str, boolean z) {
            this.a = context;
            View a = sg.bigo.ads.common.utils.a.a(context, R.layout.bigo_ad_layout_ic_item, null, false);
            this.b = a;
            this.c = z;
            LinearLayout linearLayout = (LinearLayout) a.findViewById(R.id.bigo_ad_ic_title_layout);
            this.d = linearLayout;
            this.e = (TextView) a.findViewById(R.id.bigo_ad_ic_title_txt);
            this.f = (ImageView) a.findViewById(R.id.bigo_ad_ic_title_iv);
            linearLayout.setTag(26);
            LinearLayout linearLayout2 = (LinearLayout) a.findViewById(R.id.bigo_ad_ic_desc_layout);
            this.g = linearLayout2;
            this.h = (TextView) a.findViewById(R.id.bigo_ad_ic_desc_txt);
            this.i = (ImageView) a.findViewById(R.id.bigo_ad_ic_desc_iv);
            linearLayout2.setTag(26);
            this.j = aVar;
            this.k = str;
            a();
        }

        public void a() {
            if (this.j.r == 0) {
                this.e.setVisibility(8);
            } else {
                this.e.setVisibility(0);
                this.e.setText(this.j.r);
                if (this.c) {
                    this.e.setTextColor(-1);
                }
            }
            if (this.j.s == 0) {
                this.f.setVisibility(8);
            } else {
                this.f.setVisibility(0);
                this.f.setImageResource(this.j.s);
            }
            if (this.j.t == 0) {
                this.h.setVisibility(8);
            } else {
                this.h.setVisibility(0);
                this.h.setText(this.j.t);
                if (this.c) {
                    this.h.setTextColor(r.b("#9AFFFFFF", -1));
                }
            }
            if (this.j.u == 0) {
                this.i.setVisibility(8);
            } else {
                this.i.setVisibility(0);
                this.i.setImageResource(this.j.u);
            }
        }
    }

    public static class b extends a {
        public b(Context context, f.a aVar, String str, boolean z) {
            super(context, aVar, str, z);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.e.setVisibility(0);
            this.e.setText(sg.bigo.ads.common.utils.a.a(this.a, this.j.r, e.a(this.k)));
            if (this.c) {
                this.e.setTextColor(-1);
            }
            this.f.setVisibility(8);
            this.h.setVisibility(0);
            this.h.setText(this.j.t);
            if (this.c) {
                this.h.setTextColor(r.b("#9AFFFFFF", -1));
            }
            this.i.setVisibility(8);
        }
    }

    public static class c extends a {
        public c(Context context, f.a aVar, String str, boolean z) {
            super(context, aVar, str, z);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.e.setVisibility(8);
            this.f.setVisibility(0);
            this.f.setImageResource(this.j.s);
            this.h.setVisibility(0);
            this.h.setText(this.j.t);
            if (this.c) {
                this.h.setTextColor(r.b("#9AFFFFFF", -1));
            }
            this.i.setVisibility(0);
            this.i.setImageResource(this.j.u);
        }
    }

    public static class d extends a {
        public d(Context context, f.a aVar, String str, boolean z) {
            super(context, aVar, str, z);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.e.setVisibility(0);
            this.e.setText(sg.bigo.ads.common.utils.a.a(this.a, this.j.r, e.c(this.k)));
            if (this.c) {
                this.e.setTextColor(-1);
            }
            this.f.setVisibility(0);
            this.f.setImageResource(this.j.s);
            this.h.setVisibility(0);
            this.h.setText(e.b(this.k) + " " + sg.bigo.ads.common.utils.a.a(this.a, this.j.t, new Object[0]));
            if (this.c) {
                this.h.setTextColor(r.b("#9AFFFFFF", -1));
            }
            this.i.setVisibility(8);
        }
    }

    public IconListView(Context context) {
        this(context, null);
    }

    public IconListView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconListView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = false;
        setOrientation(0);
        setGravity(17);
    }

    private List<a> a(Context context, int i, String str) {
        d dVar;
        c cVar;
        ArrayList arrayList = new ArrayList();
        if (i == 1 || i == 2 || i == 4 || i == 8) {
            List<f.a> a2 = f.a.a(i);
            Random random = new Random();
            while (!a2.isEmpty()) {
                arrayList.add(new a(context, a2.remove(random.nextInt(a2.size())), str, this.a));
            }
        } else {
            boolean z = this.a;
            if (z) {
                dVar = new d(context, f.a.STAR_WHITE, str, z);
                arrayList.add(dVar);
                arrayList.add(new b(context, f.a.DOWNLOAD_NUM_WHITE, str, this.a));
                cVar = new c(context, f.a.Everyone_WHITE, str, this.a);
            } else {
                dVar = new d(context, f.a.STAR, str, z);
                arrayList.add(dVar);
                arrayList.add(new b(context, f.a.DOWNLOAD_NUM, str, this.a));
                cVar = new c(context, f.a.Everyone, str, this.a);
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x003d, code lost:
    
        if (r8.a != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0040, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0055, code lost:
    
        if (r8.a != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(f fVar) {
        List<a> a2;
        removeAllViews();
        if (fVar == null) {
            return;
        }
        Context context = getContext();
        int i = fVar.a;
        if (i != 1) {
            int i2 = 4;
            if (i != 2) {
                if (i == 3) {
                    if (fVar.d) {
                        i2 = this.a ? 8 : 2;
                    }
                    a2 = a(context, i2, fVar.c);
                } else if (i != 4 || !fVar.d) {
                    return;
                } else {
                    a2 = a(context, this.a ? 8 : 2, fVar.c);
                }
            } else if (!fVar.d) {
            }
            this.b = a2;
            if (l.a((Collection) this.b)) {
                for (int i3 = 0; i3 < this.b.size(); i3++) {
                    if (i3 > 0) {
                        sg.bigo.ads.common.utils.a.a(getContext(), this.a ? R.layout.bigo_ad_layout_space : R.layout.bigo_ad_layout_space_black, this, true);
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                    layoutParams.weight = 1.0f;
                    addView(this.b.get(i3).b, layoutParams);
                }
                return;
            }
            return;
        }
        if (!fVar.d) {
            return;
        }
        a2 = a(context, 0, fVar.c);
        this.b = a2;
        if (l.a((Collection) this.b)) {
        }
    }

    public List<a> getItems() {
        return this.b;
    }

    public void setThemeWhite(boolean z) {
        this.a = z;
    }
}
