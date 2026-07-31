package yads;

import com.yandex.mobile.ads.common.AdInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class yp3 {
    public final AdInfo a(zz zzVar) {
        String str = zzVar.a;
        String str2 = zzVar.b;
        String str3 = zzVar.c;
        List list = zzVar.d;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k20.a((j00) it.next()));
        }
        return new AdInfo(str, str2, str3, arrayList);
    }
}
