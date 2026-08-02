package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzeom implements zzeou {
    final /* synthetic */ zzeon zza;

    zzeom(zzeon zzeonVar) {
        this.zza = zzeonVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeou
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeou
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdlg zzdlgVar;
        zzdlg zzdlgVar2 = (zzdlg) obj;
        synchronized (this.zza) {
            this.zza.zzh = zzdlgVar2;
            zzdlgVar = this.zza.zzh;
            zzdlgVar.zzW();
        }
    }
}
