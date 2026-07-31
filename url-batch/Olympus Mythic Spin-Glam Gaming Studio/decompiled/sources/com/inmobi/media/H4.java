package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.Trackers;
import com.inmobi.media.ads.network.common.model.TrackersV2;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class H4 {
    public static final ArrayList a(G g, String type) {
        Intrinsics.checkNotNullParameter(g, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        List list = g.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((Trackers) obj).getType(), type)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((Trackers) it.next()).getUrl());
        }
        return arrayList2.isEmpty() ? a(type, g.g) : arrayList2;
    }

    public static final ArrayList a(String type, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TrackingInfo trackingInfo = (TrackingInfo) it.next();
            List<TrackersV2> trackers = trackingInfo.getTrackers();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : trackers) {
                if (Intrinsics.areEqual(((TrackersV2) obj).getType(), type)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                TrackersV2 trackersV2 = (TrackersV2) it2.next();
                List<String> url = trackersV2.getUrl();
                List<String> imExts = trackersV2.getImExts();
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(imExts, 10));
                for (String str : imExts) {
                    arrayList4.add(trackingInfo.getImBaseUrl() + str);
                }
                CollectionsKt.addAll(arrayList3, CollectionsKt.plus((Collection) url, (Iterable) arrayList4));
            }
            CollectionsKt.addAll(arrayList, arrayList3);
        }
        return arrayList;
    }
}
