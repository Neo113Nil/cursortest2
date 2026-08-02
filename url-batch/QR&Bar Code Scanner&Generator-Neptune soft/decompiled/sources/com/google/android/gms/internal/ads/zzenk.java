package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzenk extends com.google.android.gms.ads.internal.client.zzbk {
    private final zzeoq zza;

    public zzenk(Context context, zzcom zzcomVar, zzfed zzfedVar, zzdpb zzdpbVar, com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        zzeos zzeosVar = new zzeos(zzdpbVar, zzcomVar.zzx());
        zzeosVar.zze(zzbfVar);
        this.zza = new zzeoq(new zzepc(zzcomVar, context, zzeosVar, zzfedVar), zzfedVar.zzI());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized String zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        this.zza.zzd(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzl zzlVar, int i) throws RemoteException {
        this.zza.zzd(zzlVar, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized boolean zzi() throws RemoteException {
        return this.zza.zze();
    }
}
