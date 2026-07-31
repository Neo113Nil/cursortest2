package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ad, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3864ad {
    public final Zc a;
    public final Yc b;

    public C3864ad(Jl jl, C3903c0 adLifecycleData, Ri responseBeaconData) {
        Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        Intrinsics.checkNotNullParameter(responseBeaconData, "responseBeaconData");
        ArrayList arrayList = null;
        this.a = new Zc(adLifecycleData, jl != null ? jl.a : null, jl != null ? jl.b : null, 24);
        if (jl != null) {
            ArrayList arrayList2 = jl.d;
            arrayList = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String type = ((Je) next).b;
                Intrinsics.checkNotNullParameter(type, "type");
                if (Intrinsics.areEqual(type, "Impression")) {
                    arrayList.add(next);
                }
            }
        }
        this.b = new Yc(this.a, new C3916cd(responseBeaconData, arrayList));
    }

    public final void a(short s, List trackers) {
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        this.b.c.a(new ep(MapsKt.mapOf(TuplesKt.to("[EVENTTYPE]", String.valueOf((int) s))), trackers));
    }
}
