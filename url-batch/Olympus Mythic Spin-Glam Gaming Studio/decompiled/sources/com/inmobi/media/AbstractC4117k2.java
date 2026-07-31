package com.inmobi.media;

import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.k2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC4117k2 implements G2 {
    public final Function0 a;

    public AbstractC4117k2(Function0 predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.a = predicate;
    }

    public final void a(H2 beaconExtras) {
        Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        if (((Boolean) this.a.mo4828invoke()).booleanValue()) {
            Objects.toString(beaconExtras);
            b(beaconExtras);
        }
    }

    public abstract void b(H2 h2);
}
