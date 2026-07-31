package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfdn {
    public static zzbjl zza(final zzecn zzecnVar, final zzfjv zzfjvVar, final zzcmi zzcmiVar, final zzddz zzddzVar) {
        return new zzbjl() { // from class: com.google.android.gms.internal.ads.zzfdm
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcek zzcekVar = (zzcek) obj;
                zzbjk.zzc(map, zzddz.this);
                String str = (String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                } else {
                    zzecn zzecnVar2 = zzecnVar;
                    zzfjv zzfjvVar2 = zzfjvVar;
                    zzgot.zzq(zzbjk.zza(zzcekVar, str), new zzfdk(zzcekVar, zzcmiVar, zzfjvVar2, zzecnVar2), zzbzh.zza);
                }
            }
        };
    }

    public static zzbjl zzb(final zzecn zzecnVar, final zzfjv zzfjvVar) {
        return new zzbjl() { // from class: com.google.android.gms.internal.ads.zzfdl
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzceb zzcebVar = (zzceb) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
                    return;
                }
                zzfcj zzC = zzcebVar.zzC();
                if (zzC != null && !zzC.zzai) {
                    zzfjv.this.zzb(str, zzC.zzax, null, null);
                    return;
                }
                zzfcm zzaC = ((zzcfr) zzcebVar).zzaC();
                if (zzaC != null) {
                    zzecnVar.zze(new zzecp(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), zzaC.zzb, str, 2));
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                }
            }
        };
    }
}
