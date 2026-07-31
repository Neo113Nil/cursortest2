package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class Mi extends Q4 {
    public Mi(N4 n4) {
        super(n4);
    }

    @Override // io.appmetrica.analytics.impl.Q4
    public final boolean a(@NonNull C5326f6 c5326f6, @NonNull L4 l4) {
        Bundle bundle = c5326f6.m;
        this.a.a(bundle != null ? (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null);
        return false;
    }
}
