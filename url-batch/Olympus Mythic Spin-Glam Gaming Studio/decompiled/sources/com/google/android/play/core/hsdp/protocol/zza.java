package com.google.android.play.core.hsdp.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes12.dex */
public final class zza extends com.google.android.gms.internal.playcore_hsdp.zza implements zzc {
    zza(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.hsdp.protocol.IHpoaService");
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzc
    public final void zzc(Bundle bundle) {
        Parcel zza = zza();
        com.google.android.gms.internal.playcore_hsdp.zzc.zzc(zza, bundle);
        zzb(3, zza);
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzc
    public final void zze(Bundle bundle) {
        Parcel zza = zza();
        com.google.android.gms.internal.playcore_hsdp.zzc.zzc(zza, bundle);
        zzb(2, zza);
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzc
    public final void zzf(Bundle bundle, zze zzeVar) {
        Parcel zza = zza();
        com.google.android.gms.internal.playcore_hsdp.zzc.zzc(zza, bundle);
        com.google.android.gms.internal.playcore_hsdp.zzc.zzd(zza, zzeVar);
        zzb(1, zza);
    }
}
