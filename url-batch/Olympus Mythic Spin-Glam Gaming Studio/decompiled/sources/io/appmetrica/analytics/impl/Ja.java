package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* loaded from: classes11.dex */
public final class Ja implements Ck {
    @Override // io.appmetrica.analytics.impl.Ck
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.Ck
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
