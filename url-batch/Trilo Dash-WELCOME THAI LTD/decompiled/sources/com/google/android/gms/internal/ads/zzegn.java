package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzegn implements zzeey {
    private final Context zza;
    private final zzdkx zzb;
    private final Executor zzc;
    private final zzfbf zzd;

    public zzegn(Context context, Executor executor, zzdkx zzdkxVar, zzfbf zzfbfVar) {
        this.zza = context;
        this.zzb = zzdkxVar;
        this.zzc = executor;
        this.zzd = zzfbfVar;
    }

    private static String zzd(zzfbg zzfbgVar) {
        try {
            return zzfbgVar.zzw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final zzfvj zza(final zzfbs zzfbsVar, final zzfbg zzfbgVar) {
        String zzd = zzd(zzfbgVar);
        final Uri parse = zzd != null ? Uri.parse(zzd) : null;
        return zzfva.zzn(zzfva.zzi(null), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzegl
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzegn.this.zzc(parse, zzfbsVar, zzfbgVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final boolean zzb(zzfbs zzfbsVar, zzfbg zzfbgVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbiw.zzg(context) && !TextUtils.isEmpty(zzd(zzfbgVar));
    }

    final /* synthetic */ zzfvj zzc(Uri uri, zzfbs zzfbsVar, zzfbg zzfbgVar, Object obj) throws Exception {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(build.intent, null);
            final zzcga zzcgaVar = new zzcga();
            zzdjz zze = this.zzb.zze(new zzcyl(zzfbsVar, zzfbgVar, null), new zzdkc(new zzdlf() { // from class: com.google.android.gms.internal.ads.zzegm
                @Override // com.google.android.gms.internal.ads.zzdlf
                public final void zza(boolean z, Context context, zzdcf zzdcfVar) {
                    zzcga zzcgaVar2 = zzcga.this;
                    try {
                        com.google.android.gms.ads.internal.zzt.zzj();
                        com.google.android.gms.ads.internal.overlay.zzm.zza(context, (AdOverlayInfoParcel) zzcgaVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzcgaVar.zzd(new AdOverlayInfoParcel(zzcVar, null, zze.zza(), null, new zzcfo(0, 0, false, false, false), null, null));
            this.zzd.zza();
            return zzfva.zzi(zze.zzg());
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
