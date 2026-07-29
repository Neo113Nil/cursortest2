package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfcg implements zzfuw {
    final /* synthetic */ zzcli zza;
    final /* synthetic */ zzfig zzb;
    final /* synthetic */ zzeen zzc;

    zzfcg(zzcli zzcliVar, zzfig zzfigVar, zzeen zzeenVar) {
        this.zza = zzcliVar;
        this.zzb = zzfigVar;
        this.zzc = zzeenVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        if (r8.zza.zzF().zzT != false) goto L12;
     */
    @Override // com.google.android.gms.internal.ads.zzfuw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (!this.zza.zzF().zzak) {
            this.zzb.zzc(str, null);
            return;
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
        String str2 = this.zza.zzR().zzb;
        int i = 1;
        if (!com.google.android.gms.ads.internal.zzt.zzo().zzv(this.zza.getContext())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfk)).booleanValue()) {
            }
            this.zzc.zzd(new zzeep(currentTimeMillis, str2, str, i));
        }
        i = 2;
        this.zzc.zzd(new zzeep(currentTimeMillis, str2, str, i));
    }
}
