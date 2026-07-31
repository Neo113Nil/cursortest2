package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes12.dex */
public abstract class Z2 implements Cdo {
    public final int a;
    public final String b;

    @NonNull
    protected final PublicLogger c;

    public Z2(int i, String str, PublicLogger publicLogger) {
        this.a = i;
        this.b = str;
        this.c = publicLogger;
    }
}
