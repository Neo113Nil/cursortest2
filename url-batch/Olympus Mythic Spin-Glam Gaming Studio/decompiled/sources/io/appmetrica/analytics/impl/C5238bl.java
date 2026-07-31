package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Map;
import kotlin.collections.MapsKt;

/* renamed from: io.appmetrica.analytics.impl.bl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5238bl {
    public final C5341fl a;
    public final Map b;

    public C5238bl(Context context, C5351g5 c5351g5) {
        c5351g5.a();
        C5341fl c5341fl = new C5341fl(context, c5351g5);
        this.a = c5341fl;
        this.b = MapsKt.toMutableMap(c5341fl.a());
    }
}
