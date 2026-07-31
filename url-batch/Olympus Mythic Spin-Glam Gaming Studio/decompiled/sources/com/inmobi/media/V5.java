package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class V5 extends AbstractC4117k2 {
    public final Zc b;
    public final C4190mm c;
    public final Aj d;
    public final AtomicInteger e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V5(final Zc nativeBeaconMacroData, C4190mm nativeBeaconTrackerData, Aj progressReceivedBeacons, Aj progressTriggeredBeacons) {
        super(new Function0() { // from class: com.inmobi.media.V5$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Boolean.valueOf(V5.a(Zc.this));
            }
        });
        Intrinsics.checkNotNullParameter(nativeBeaconMacroData, "nativeBeaconMacroData");
        Intrinsics.checkNotNullParameter(nativeBeaconTrackerData, "nativeBeaconTrackerData");
        Intrinsics.checkNotNullParameter(progressReceivedBeacons, "progressReceivedBeacons");
        Intrinsics.checkNotNullParameter(progressTriggeredBeacons, "progressTriggeredBeacons");
        this.b = nativeBeaconMacroData;
        this.c = nativeBeaconTrackerData;
        this.d = progressTriggeredBeacons;
        this.e = new AtomicInteger(-1);
        if (nativeBeaconTrackerData.c.isEmpty()) {
            return;
        }
        progressReceivedBeacons.a(C4052hf.a);
    }

    public static final boolean a(Zc zc) {
        return AbstractC3890bd.a(zc.a);
    }

    @Override // com.inmobi.media.AbstractC4117k2
    public final void b(H2 beaconExtras) {
        Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        int i = this.b.e;
        int i2 = this.e.get();
        if (i <= this.e.getAndSet(i)) {
            return;
        }
        ArrayList arrayList = this.c.c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            int i4 = ((U5) next).a;
            if (i3 <= i4 && i4 <= i) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.d.a(C4052hf.a);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String url = AbstractC3890bd.a(((U5) it2.next()).b, this.b, MapsKt.emptyMap());
            E3 e3 = E3.a;
            Intrinsics.checkNotNullParameter(url, "url");
            E3.a(url, false, null);
        }
    }
}
