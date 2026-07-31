package yads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class n22 {
    public static final /* synthetic */ KProperty[] g = {ra.a(n22.class, "nativeAdView", "getNativeAdView()Landroid/view/View;", 0), ra.a(n22.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0), ra.a(n22.class, "muteButtonView", "getMuteButtonView()Landroid/widget/CheckBox;", 0), ra.a(n22.class, "videoProgressView", "getVideoProgressView()Landroid/widget/ProgressBar;", 0), ra.a(n22.class, "customAssets", "getCustomAssets()Ljava/util/List;", 0)};
    public final qm2 a;
    public final qm2 b = new qm2(null);
    public final qm2 c;
    public final qm2 d;
    public final qm2 e;
    public final LinkedHashMap f;

    public n22(m22 m22Var) {
        this.a = new qm2(m22Var.a);
        this.c = new qm2(m22Var.b);
        this.d = new qm2(m22Var.c);
        this.e = new qm2(m22Var.d);
        Map map = m22Var.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), new WeakReference(entry2.getValue()));
        }
        this.f = linkedHashMap2;
    }

    public final View a() {
        qm2 qm2Var = this.a;
        KProperty kProperty = g[0];
        return (View) qm2Var.a.get();
    }

    public final View a(String str) {
        WeakReference weakReference = (WeakReference) this.f.get(str);
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }
}
