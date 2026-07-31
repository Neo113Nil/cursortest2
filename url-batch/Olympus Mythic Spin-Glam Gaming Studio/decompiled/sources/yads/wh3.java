package yads;

import android.content.Context;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class wh3 {
    public final Context a;
    public final kh1 b = new kh1();
    public final zj3 c = new zj3();

    public wh3(Context context) {
        this.a = context.getApplicationContext();
    }

    public final void a(List list, Map map) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.b.a((String) it.next(), map));
        }
        this.c.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!Intrinsics.areEqual((String) next, AndroidWebViewClient.BLANK_PAGE)) {
                arrayList2.add(next);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            String str = (String) it3.next();
            li3 a = li3.c.a(this.a);
            a.b.a(new nd2(a.a, str, new om3()));
        }
    }
}
