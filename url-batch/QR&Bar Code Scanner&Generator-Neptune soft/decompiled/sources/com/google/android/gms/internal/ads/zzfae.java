package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfae implements zzfgl {
    public final zzfay zza;
    public final zzfba zzb;
    public final com.google.android.gms.ads.internal.client.zzl zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzw zzf;
    public final zzfga zzg;

    public zzfae(zzfay zzfayVar, zzfba zzfbaVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzw zzwVar, zzfga zzfgaVar) {
        this.zza = zzfayVar;
        this.zzb = zzfbaVar;
        this.zzc = zzlVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzwVar;
        this.zzg = zzfgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgl
    public final zzfga zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfgl
    public final Executor zzb() {
        return this.zze;
    }
}
