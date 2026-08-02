package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzect extends zzcax {
    final /* synthetic */ zzecu zza;

    protected zzect(zzecu zzecuVar) {
        this.zza = zzecuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zze(com.google.android.gms.ads.internal.util.zzaz zzazVar) {
        this.zza.zza.zze(new com.google.android.gms.ads.internal.util.zzay(zzazVar.zza, zzazVar.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzd(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
