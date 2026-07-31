package sg.bigo.ads.p;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.n.d;
import sg.bigo.ads.n.j;
import sg.bigo.ads.y.b;

/* loaded from: classes12.dex */
public final class a extends RealtimeBlurLinearLayout {
    public d a;

    public a(@NonNull Context context) {
        this(context, (byte) 0);
    }

    private a(@NonNull Context context, byte b) {
        this(context, (char) 0);
    }

    private a(@NonNull Context context, char c) {
        super(context, null, 0);
    }

    public static void a(List<NativeAd> list, List<NativeAd> list2, List<NativeAd> list3, @NonNull List<NativeAd> list4, int i) {
        if (list3 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<NativeAd> arrayList2 = new ArrayList();
        for (NativeAd nativeAd : list3) {
            if (!(nativeAd instanceof b) || ((b) nativeAd).p()) {
                arrayList.add(nativeAd);
            } else {
                arrayList2.add(nativeAd);
            }
        }
        for (NativeAd nativeAd2 : arrayList2) {
            if (list.size() < i) {
                list.add(nativeAd2);
                list4.add(nativeAd2);
            } else {
                list2.add(nativeAd2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && list.size() < i) {
            NativeAd nativeAd3 = (NativeAd) it.next();
            list.add(nativeAd3);
            list4.add(nativeAd3);
            it.remove();
        }
        list2.addAll(arrayList);
        list4.addAll(list2);
    }

    public final d getIconAdsRenderStyle() {
        return this.a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d dVar = this.a;
        if ((dVar instanceof j) && dVar.b() == 4) {
            int defaultSize = (int) ((r0 * 2) + (((View.getDefaultSize(Integer.MIN_VALUE, i) - (((j) this.a).i * 3.0f)) / 4.0f) * 3.0f));
            setMeasuredDimension(defaultSize, getMeasuredHeight());
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(defaultSize, 1073741824);
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                measureChildWithMargins(getChildAt(i3), makeMeasureSpec, 0, i2, 0);
            }
        }
    }
}
