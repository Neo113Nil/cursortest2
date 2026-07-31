package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationManager;

/* loaded from: classes6.dex */
public final class E2 {
    public final LocationManager a;

    public E2(Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    public E2(LocationManager locationManager) {
        this.a = locationManager;
    }
}
