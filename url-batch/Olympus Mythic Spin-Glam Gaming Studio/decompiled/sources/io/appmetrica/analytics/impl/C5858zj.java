package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.zj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5858zj {
    public final String a;
    public final Context b;
    public final CounterConfigurationReporterType c;
    public final Cj d;

    public C5858zj(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, Cj cj) {
        this.a = str;
        this.b = context;
        int i = AbstractC5832yj.a[counterConfigurationReporterType.ordinal()];
        if (i == 1) {
            this.c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i != 2) {
            this.c = null;
        } else {
            this.c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.d = cj;
    }
}
