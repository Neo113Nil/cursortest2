package com.google.android.gms.dynamic;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.LifecycleDelegate;

/* compiled from: com.google.android.gms:play-services-base@@18.6.0 */
@KeepForSdk
/* loaded from: classes4.dex */
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {
    private final OnDelegateCreatedListener zad = new zaa(this);

    @KeepForSdk
    public DeferredLifecycleHelper() {
    }
}
