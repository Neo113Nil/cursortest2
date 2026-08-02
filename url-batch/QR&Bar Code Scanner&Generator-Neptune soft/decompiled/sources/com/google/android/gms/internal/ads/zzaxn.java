package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzaxn implements zzaxg {
    public final String zze;

    public zzaxn(String str) {
        Objects.requireNonNull(str);
        this.zze = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }
}
