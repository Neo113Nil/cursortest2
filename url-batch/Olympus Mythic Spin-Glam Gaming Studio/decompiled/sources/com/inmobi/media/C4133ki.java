package com.inmobi.media;

import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* renamed from: com.inmobi.media.ki, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4133ki implements N {
    public final /* synthetic */ GestureDetectorOnGestureListenerC4476xi a;

    public C4133ki(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        this.a = gestureDetectorOnGestureListenerC4476xi;
    }

    public final void a(M6 metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        float f = metrics.a;
        N6 n6 = metrics.b;
        Object obj = POBCommonConstants.NULL_VALUE;
        Object a = n6 != null ? O6.a(n6) : POBCommonConstants.NULL_VALUE;
        ArrayList arrayList = metrics.c;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(O6.a((N6) it.next()));
            }
            obj = new JSONArray((Collection) arrayList2);
        }
        gestureDetectorOnGestureListenerC4476xi.h("window.mraidview.broadcastEvent('exposureChange', " + f + ", " + a + ", " + obj + ");");
    }
}
