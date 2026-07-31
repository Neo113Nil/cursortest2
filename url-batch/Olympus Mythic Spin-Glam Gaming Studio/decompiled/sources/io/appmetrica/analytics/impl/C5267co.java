package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.co, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5267co {
    public final V3 a;
    public final Wo b;
    public final ConjunctiveCompositeThreadSafeToggle c;

    public C5267co(Toggle toggle) {
        V3 v3 = new V3(Ka.k().y());
        this.a = v3;
        Wo wo = new Wo();
        this.b = wo;
        this.c = new ConjunctiveCompositeThreadSafeToggle(CollectionsKt.listOf((Object[]) new Toggle[]{v3, wo, toggle == null ? new No() : toggle}), "loc-def");
    }
}
