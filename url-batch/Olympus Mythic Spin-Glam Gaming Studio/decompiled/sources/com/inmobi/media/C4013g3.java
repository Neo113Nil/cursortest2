package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.inmobi.media.g3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4013g3 extends AbstractC4117k2 {
    public final Zc b;
    public final AtomicBoolean c;
    public final AtomicBoolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4013g3(final Zc vastBeaconDataModel) {
        super(new Function0() { // from class: com.inmobi.media.g3$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Boolean.valueOf(C4013g3.a(Zc.this));
            }
        });
        Intrinsics.checkNotNullParameter(vastBeaconDataModel, "vastBeaconDataModel");
        this.b = vastBeaconDataModel;
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
    }

    public static final boolean a(Zc zc) {
        return AbstractC3890bd.a(zc.a);
    }

    @Override // com.inmobi.media.AbstractC4117k2
    public final void b(H2 beaconExtras) {
        Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        ep epVar = beaconExtras instanceof ep ? (ep) beaconExtras : null;
        if (epVar == null) {
            return;
        }
        Map map = epVar.a;
        List list = epVar.b;
        String str = (String) map.get("[EVENTTYPE]");
        if (str == null) {
            return;
        }
        if (Intrinsics.areEqual(str, "1") || StringsKt.contains((CharSequence) str, (CharSequence) "companion", true)) {
            if (!this.d.compareAndSet(false, true)) {
                return;
            }
        } else if (!this.c.compareAndSet(false, true)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String url = AbstractC3890bd.a((String) it.next(), this.b, map);
            E3 e3 = E3.a;
            Intrinsics.checkNotNullParameter(url, "url");
            E3.a(url, false, null);
        }
    }
}
