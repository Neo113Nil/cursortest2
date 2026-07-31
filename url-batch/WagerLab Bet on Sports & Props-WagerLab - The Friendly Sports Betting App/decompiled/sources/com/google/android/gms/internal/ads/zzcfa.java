package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes5.dex */
public final class zzcfa {
    public static final zzcek zza(final Context context, final zzcgt zzcgtVar, final String str, final boolean z, final boolean z2, final zzauu zzauuVar, final zzbdp zzbdpVar, final VersionInfoParcel versionInfoParcel, zzbcx zzbcxVar, final com.google.android.gms.ads.internal.zzn zznVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzbbh zzbbhVar, final zzfcj zzfcjVar, final zzfcm zzfcmVar, final zzecy zzecyVar, final zzfdg zzfdgVar, final zzdsm zzdsmVar) throws zzcez {
        zzbci.zza(context);
        try {
            final zzbcx zzbcxVar2 = null;
            zzght zzghtVar = new zzght(context, zzcgtVar, str, z, z2, zzauuVar, zzbdpVar, versionInfoParcel, zzbcxVar2, zznVar, zzaVar, zzbbhVar, zzfcjVar, zzfcmVar, zzfdgVar, zzdsmVar, zzecyVar) { // from class: com.google.android.gms.internal.ads.zzcew
                private final /* synthetic */ Context zza;
                private final /* synthetic */ zzcgt zzb;
                private final /* synthetic */ String zzc;
                private final /* synthetic */ boolean zzd;
                private final /* synthetic */ boolean zze;
                private final /* synthetic */ zzauu zzf;
                private final /* synthetic */ zzbdp zzg;
                private final /* synthetic */ VersionInfoParcel zzh;
                private final /* synthetic */ com.google.android.gms.ads.internal.zzn zzi;
                private final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                private final /* synthetic */ zzbbh zzk;
                private final /* synthetic */ zzfcj zzl;
                private final /* synthetic */ zzfcm zzm;
                private final /* synthetic */ zzfdg zzn;
                private final /* synthetic */ zzdsm zzo;
                private final /* synthetic */ zzecy zzp;

                {
                    this.zzi = zznVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbbhVar;
                    this.zzl = zzfcjVar;
                    this.zzm = zzfcmVar;
                    this.zzn = zzfdgVar;
                    this.zzo = zzdsmVar;
                    this.zzp = zzecyVar;
                }

                @Override // com.google.android.gms.internal.ads.zzght
                public final /* synthetic */ Object zza() {
                    zzcgt zzcgtVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z3 = this.zzd;
                    boolean z4 = this.zze;
                    zzecy zzecyVar2 = this.zzp;
                    zzdsm zzdsmVar2 = this.zzo;
                    com.google.android.gms.ads.internal.zzn zznVar2 = this.zzi;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzbbh zzbbhVar2 = this.zzk;
                    zzfcj zzfcjVar2 = this.zzl;
                    zzfcm zzfcmVar2 = this.zzm;
                    zzfdg zzfdgVar2 = this.zzn;
                    zzauu zzauuVar2 = this.zzf;
                    zzbdp zzbdpVar2 = this.zzg;
                    VersionInfoParcel versionInfoParcel2 = this.zzh;
                    Context context2 = this.zza;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = zzcfn.zza;
                        zzcfg zzcfgVar = new zzcfg(new zzcfn(new zzcgl(context2), zzcgtVar2, str2, z3, z4, zzauuVar2, zzbdpVar2, versionInfoParcel2, null, zznVar2, zzaVar2, zzbbhVar2, zzfcjVar2, zzfcmVar2, zzfdgVar2), zzdsmVar2);
                        zzcfgVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.zzf().zzb(zzcfgVar, zzbbhVar2, z4, zzecyVar2));
                        zzcfgVar.setWebChromeClient(new zzcej(zzcfgVar));
                        return zzcfgVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object zza = zzghtVar.zza();
                StrictMode.setThreadPolicy(threadPolicy);
                return (zzcek) zza;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new zzcez("Webview initialization failed.", th2);
        }
    }

    public static final ListenableFuture zzb(final Context context, final VersionInfoParcel versionInfoParcel, final String str, final zzauu zzauuVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzecy zzecyVar, final zzfdg zzfdgVar, final zzdsm zzdsmVar) {
        return zzgot.zzf(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzcey
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final /* synthetic */ ListenableFuture zza() {
                com.google.android.gms.ads.internal.zzt.zzd();
                Context context2 = context;
                zzcgt zzb = zzcgt.zzb();
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzbbh zza = zzbbh.zza();
                zzecy zzecyVar2 = zzecyVar;
                zzfdg zzfdgVar2 = zzfdgVar;
                zzdsm zzdsmVar2 = zzdsmVar;
                zzcek zza2 = zzcfa.zza(context2, zzb, "", false, false, zzauuVar, null, versionInfoParcel, null, null, zzaVar2, zza, null, null, zzecyVar2, zzfdgVar2, zzdsmVar2);
                final zzbzl zza3 = zzbzl.zza(zza2);
                zza2.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzcex
                    @Override // com.google.android.gms.internal.ads.zzcgg
                    public final /* synthetic */ void zza(boolean z, int i, String str2, String str3) {
                        zzbzl.this.zzb();
                    }
                });
                zza2.loadUrl(str);
                return zza3;
            }
        }, zzbzh.zzf);
    }
}
