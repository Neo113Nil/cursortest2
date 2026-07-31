package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-base@@18.6.0 */
@KeepForSdk
/* loaded from: classes12.dex */
public class HashAccumulator {
    private int zaa = 1;

    public HashAccumulator addObject(Object obj) {
        this.zaa = (this.zaa * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int hash() {
        return this.zaa;
    }

    public final HashAccumulator zaa(boolean z) {
        this.zaa = (this.zaa * 31) + (z ? 1 : 0);
        return this;
    }
}
