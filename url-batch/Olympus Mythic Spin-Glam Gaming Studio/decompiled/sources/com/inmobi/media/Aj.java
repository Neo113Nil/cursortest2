package com.inmobi.media;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class Aj extends AbstractC4117k2 {
    public final Zc b;
    public final Function0 c;
    public final AtomicBoolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Aj(final Zc vastBeaconDataModel, Function0 getBeacons) {
        super(new Function0() { // from class: com.inmobi.media.Aj$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Boolean.valueOf(Aj.a(Zc.this));
            }
        });
        Intrinsics.checkNotNullParameter(vastBeaconDataModel, "vastBeaconDataModel");
        Intrinsics.checkNotNullParameter(getBeacons, "getBeacons");
        this.b = vastBeaconDataModel;
        this.c = getBeacons;
        this.d = new AtomicBoolean(false);
    }

    public static final boolean a(Zc zc) {
        return AbstractC3890bd.a(zc.a);
    }

    @Override // com.inmobi.media.AbstractC4117k2
    public final void b(H2 beaconExtras) {
        Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        if (this.d.getAndSet(true)) {
            return;
        }
        boolean z = beaconExtras instanceof ep;
        Map emptyMap = z ? ((ep) beaconExtras).a : MapsKt.emptyMap();
        List plus = CollectionsKt.plus((Collection) this.c.mo4828invoke(), (Iterable) (z ? ((ep) beaconExtras).b : CollectionsKt.emptyList()));
        if (plus.isEmpty()) {
            return;
        }
        Iterator it = plus.iterator();
        while (it.hasNext()) {
            String url = AbstractC3890bd.a((String) it.next(), this.b, emptyMap);
            E3 e3 = E3.a;
            Intrinsics.checkNotNullParameter(url, "url");
            E3.a(url, false, null);
        }
    }
}
