package sg.bigo.ads.n;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.common.view.ViewFlow;

/* loaded from: classes5.dex */
public final class a {

    @NonNull
    public final RealtimeBlurLinearLayout a;

    @NonNull
    public final ViewFlow b;

    @NonNull
    public final int c;

    private a(RealtimeBlurLinearLayout realtimeBlurLinearLayout, int i) {
        this.a = realtimeBlurLinearLayout;
        this.b = (ViewFlow) realtimeBlurLinearLayout.findViewById(R.id.inter_icon_ads_view_flow);
        this.c = i;
    }

    @NonNull
    public static a a(Context context, @NonNull sg.bigo.ads.o.b bVar, @NonNull List<NativeAd> list, List<NativeAd> list2) {
        int a;
        boolean z;
        d eVar;
        a aVar = new a((RealtimeBlurLinearLayout) sg.bigo.ads.common.utils.a.a(context, R.layout.bigo_ad_layout_interstitial_icon_view_flow, null, false), (int) bVar.k());
        aVar.b.setViewStyle(3);
        aVar.b.setDividerWidth(0);
        if (!bVar.a()) {
            switch (bVar.e()) {
                case 1:
                case 3:
                    aVar.b.setContentMaxWidthSpace(sg.bigo.ads.common.utils.f.a(context, 20));
                    break;
                case 2:
                case 4:
                    aVar.b.setContentMaxWidthSpace(0);
                    break;
                case 5:
                case 6:
                    aVar.b.setContentMaxWidthSpace(sg.bigo.ads.common.utils.f.a(context, 47));
                    ((ViewGroup.MarginLayoutParams) aVar.b.getLayoutParams()).bottomMargin = 0;
                    break;
            }
        } else {
            aVar.b.setContentMaxWidthSpace(0);
            ((LinearLayout.LayoutParams) aVar.b.getLayoutParams()).bottomMargin = 0;
        }
        list2.clear();
        while (!l.a((Collection) list)) {
            sg.bigo.ads.p.a aVar2 = new sg.bigo.ads.p.a(context);
            if (!l.a((Collection) list)) {
                if (bVar.a()) {
                    z = false;
                    a = 1;
                } else {
                    a = sg.bigo.ads.o.b.a(bVar);
                    z = true;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                sg.bigo.ads.p.a.a(arrayList, arrayList2, list, list2, a);
                if (a == 1) {
                    list2.addAll(arrayList2);
                    arrayList2.clear();
                }
                if (bVar.a()) {
                    eVar = new k(aVar2, arrayList, bVar);
                } else {
                    int e = bVar.e();
                    eVar = e != 2 ? e != 3 ? e != 4 ? e != 5 ? e != 6 ? new e(aVar2, arrayList, bVar) : new j(aVar2, arrayList, bVar) : new i(aVar2, arrayList, bVar) : new h(aVar2, arrayList, bVar) : new g(aVar2, arrayList, bVar) : new f(aVar2, arrayList, bVar);
                }
                eVar.a(aVar, z);
                aVar2.a = eVar;
                list = arrayList2;
            }
            ViewFlow.b bVar2 = new ViewFlow.b();
            ((ViewGroup.LayoutParams) bVar2).width = -1;
            ((ViewGroup.LayoutParams) bVar2).height = -2;
            bVar2.e = 48;
            bVar2.d = 3;
            aVar.b.addView(aVar2, bVar2);
        }
        return aVar;
    }
}
