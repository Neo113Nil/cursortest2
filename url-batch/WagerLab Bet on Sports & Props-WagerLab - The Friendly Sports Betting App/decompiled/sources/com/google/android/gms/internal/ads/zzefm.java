package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzefm implements zzedz {
    private final Context zza;
    private final zzdgh zzb;
    private final Executor zzc;
    private final zzfci zzd;
    private final zzdsm zze;

    public zzefm(Context context, Executor executor, zzdgh zzdghVar, zzfci zzfciVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = zzdghVar;
        this.zzc = executor;
        this.zzd = zzfciVar;
        this.zze = zzdsmVar;
    }

    private static String zze(zzfcj zzfcjVar) {
        try {
            return zzfcjVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final boolean zza(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbdj.zza(context) && !TextUtils.isEmpty(zze(zzfcjVar));
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final ListenableFuture zzb(final zzfcu zzfcuVar, final zzfcj zzfcjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznT)).booleanValue()) {
            zzdsl zza = this.zze.zza();
            zza.zzc("action", "cstm_tbs_rndr");
            zza.zzd();
        }
        String zze = zze(zzfcjVar);
        final Uri parse = zze != null ? Uri.parse(zze) : null;
        final zzfcm zzfcmVar = zzfcuVar.zzb.zzb;
        return zzgot.zzj(zzgot.zza(null), new zzgob() { // from class: com.google.android.gms.internal.ads.zzefl
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzefm.this.zzc(parse, zzfcuVar, zzfcjVar, zzfcmVar, obj);
            }
        }, this.zzc);
    }

    final /* synthetic */ ListenableFuture zzc(Uri uri, zzfcu zzfcuVar, zzfcj zzfcjVar, zzfcm zzfcmVar, Object obj) {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(build.intent, null);
            zzbzm zzbzmVar = new zzbzm();
            zzdfb zzd = this.zzb.zzd(new zzcri(zzfcuVar, zzfcjVar, null), new zzdfe(new zzefk(this, zzbzmVar, zzfcjVar), null));
            zzbzmVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zzd.zzi(), null, new VersionInfoParcel(0, 0, false), null, null, zzfcmVar.zzb));
            this.zzd.zzd();
            return zzgot.zza(zzd.zzh());
        } catch (Throwable th) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    final /* synthetic */ zzdsm zzd() {
        return this.zze;
    }
}
