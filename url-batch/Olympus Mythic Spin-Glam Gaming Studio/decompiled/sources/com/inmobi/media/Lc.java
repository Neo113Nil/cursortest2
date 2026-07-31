package com.inmobi.media;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class Lc extends AbstractC4117k2 {
    public final Zc b;
    public final Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lc(final Zc nativeBeaconMacroData, Function0 getBeacons) {
        super(new Function0() { // from class: com.inmobi.media.Lc$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Boolean.valueOf(Lc.a(Zc.this));
            }
        });
        Intrinsics.checkNotNullParameter(nativeBeaconMacroData, "nativeBeaconMacroData");
        Intrinsics.checkNotNullParameter(getBeacons, "getBeacons");
        this.b = nativeBeaconMacroData;
        this.c = getBeacons;
    }

    public static final boolean a(Zc zc) {
        return AbstractC3890bd.a(zc.a);
    }

    @Override // com.inmobi.media.AbstractC4117k2
    public final void b(H2 beaconExtras) {
        Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        boolean z = beaconExtras instanceof ep;
        List plus = CollectionsKt.plus((Collection) this.c.mo4828invoke(), (Iterable) (z ? ((ep) beaconExtras).b : CollectionsKt.emptyList()));
        if (plus.isEmpty()) {
            return;
        }
        Map emptyMap = z ? ((ep) beaconExtras).a : MapsKt.emptyMap();
        Iterator it = plus.iterator();
        while (it.hasNext()) {
            String url = AbstractC3890bd.a((String) it.next(), this.b, emptyMap);
            E3 e3 = E3.a;
            Intrinsics.checkNotNullParameter(url, "url");
            E3.a(url, false, null);
        }
    }
}
