package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzcnb {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzcmp, java.lang.Object] */
    public static final zzcmp zza(final Context context, final zzcoe zzcoeVar, final String str, final boolean z, final boolean z2, final zzape zzapeVar, final zzbkb zzbkbVar, final zzcgv zzcgvVar, zzbjr zzbjrVar, final com.google.android.gms.ads.internal.zzl zzlVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzbep zzbepVar, final zzfdk zzfdkVar, final zzfdn zzfdnVar) throws zzcna {
        zzbjc.zzc(context);
        try {
            final zzbjr zzbjrVar2 = null;
            zzftn zzftnVar = new zzftn(context, zzcoeVar, str, z, z2, zzapeVar, zzbkbVar, zzcgvVar, zzbjrVar2, zzlVar, zzaVar, zzbepVar, zzfdkVar, zzfdnVar) { // from class: com.google.android.gms.internal.ads.zzcmx
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzcoe zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzape zzf;
                public final /* synthetic */ zzbkb zzg;
                public final /* synthetic */ zzcgv zzh;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzl zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                public final /* synthetic */ zzbep zzk;
                public final /* synthetic */ zzfdk zzl;
                public final /* synthetic */ zzfdn zzm;

                {
                    this.zzi = zzlVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbepVar;
                    this.zzl = zzfdkVar;
                    this.zzm = zzfdnVar;
                }

                @Override // com.google.android.gms.internal.ads.zzftn
                public final Object zza() {
                    Context context2 = this.zza;
                    zzcoe zzcoeVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z3 = this.zzd;
                    boolean z4 = this.zze;
                    zzape zzapeVar2 = this.zzf;
                    zzbkb zzbkbVar2 = this.zzg;
                    zzcgv zzcgvVar2 = this.zzh;
                    com.google.android.gms.ads.internal.zzl zzlVar2 = this.zzi;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzbep zzbepVar2 = this.zzk;
                    zzfdk zzfdkVar2 = this.zzl;
                    zzfdn zzfdnVar2 = this.zzm;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = zzcni.zza;
                        zzcne zzcneVar = new zzcne(new zzcni(new zzcod(context2), zzcoeVar2, str2, z3, z4, zzapeVar2, zzbkbVar2, zzcgvVar2, null, zzlVar2, zzaVar2, zzbepVar2, zzfdkVar2, zzfdnVar2));
                        zzcneVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.zzq().zzd(zzcneVar, zzbepVar2, z4));
                        zzcneVar.setWebChromeClient(new zzcmo(zzcneVar));
                        return zzcneVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return zzftnVar.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zzcna("Webview initialization failed.", th);
        }
    }
}
