package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes5.dex */
public final class zzgm extends com.google.android.gms.internal.measurement.zzbm implements zzgo {
    zzgm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.measurement.internal.zzgo
    public final void zze(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzd(2, zza);
    }
}
