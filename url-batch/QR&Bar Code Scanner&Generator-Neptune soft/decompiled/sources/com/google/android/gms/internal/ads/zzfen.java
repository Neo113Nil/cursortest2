package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfen implements zzfzc {
    final /* synthetic */ zzcmp zza;
    final /* synthetic */ zzfkm zzb;
    final /* synthetic */ zzego zzc;

    zzfen(zzcmp zzcmpVar, zzfkm zzfkmVar, zzego zzegoVar) {
        this.zza = zzcmpVar;
        this.zzb = zzfkmVar;
        this.zzc = zzegoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        if (r8.zza.zzF().zzT != false) goto L12;
     */
    @Override // com.google.android.gms.internal.ads.zzfzc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (!this.zza.zzF().zzak) {
            this.zzb.zzc(str, null);
            return;
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        String str2 = this.zza.zzR().zzb;
        int i = 1;
        if (!com.google.android.gms.ads.internal.zzt.zzo().zzv(this.zza.getContext())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfr)).booleanValue()) {
            }
            this.zzc.zzd(new zzegq(currentTimeMillis, str2, str, i));
        }
        i = 2;
        this.zzc.zzd(new zzegq(currentTimeMillis, str2, str, i));
    }
}
