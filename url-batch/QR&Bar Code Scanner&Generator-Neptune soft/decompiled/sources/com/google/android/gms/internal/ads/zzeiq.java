package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeiq implements zzehc {
    private final Context zza;
    private final zzdmh zzb;
    private final Executor zzc;
    private final zzfdj zzd;

    public zzeiq(Context context, Executor executor, zzdmh zzdmhVar, zzfdj zzfdjVar) {
        this.zza = context;
        this.zzb = zzdmhVar;
        this.zzc = executor;
        this.zzd = zzfdjVar;
    }

    private static String zzd(zzfdk zzfdkVar) {
        try {
            return zzfdkVar.zzw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final zzfzp zza(final zzfdw zzfdwVar, final zzfdk zzfdkVar) {
        String zzd = zzd(zzfdkVar);
        final Uri parse = zzd != null ? Uri.parse(zzd) : null;
        return zzfzg.zzn(zzfzg.zzi(null), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzeio
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzeiq.this.zzc(parse, zzfdwVar, zzfdkVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final boolean zzb(zzfdw zzfdwVar, zzfdk zzfdkVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbka.zzg(context) && !TextUtils.isEmpty(zzd(zzfdkVar));
    }

    final /* synthetic */ zzfzp zzc(Uri uri, zzfdw zzfdwVar, zzfdk zzfdkVar, Object obj) throws Exception {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(build.intent, null);
            final zzchh zzchhVar = new zzchh();
            zzdlh zze = this.zzb.zze(new zzczt(zzfdwVar, zzfdkVar, null), new zzdlk(new zzdmp() { // from class: com.google.android.gms.internal.ads.zzeip
                @Override // com.google.android.gms.internal.ads.zzdmp
                public final void zza(boolean z, Context context, zzddn zzddnVar) {
                    zzchh zzchhVar2 = zzchh.this;
                    try {
                        com.google.android.gms.ads.internal.zzt.zzi();
                        com.google.android.gms.ads.internal.overlay.zzm.zza(context, (AdOverlayInfoParcel) zzchhVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzchhVar.zzd(new AdOverlayInfoParcel(zzcVar, null, zze.zza(), null, new zzcgv(0, 0, false, false, false), null, null));
            this.zzd.zza();
            return zzfzg.zzi(zze.zzg());
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
