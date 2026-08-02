package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdqb {
    private final zzduy zza;
    private final zzdtn zzb;
    private final zzcvu zzc;
    private final zzdoy zzd;

    public zzdqb(zzduy zzduyVar, zzdtn zzdtnVar, zzcvu zzcvuVar, zzdoy zzdoyVar) {
        this.zza = zzduyVar;
        this.zzb = zzdtnVar;
        this.zzc = zzcvuVar;
        this.zzd = zzdoyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza() throws zzcna {
        zzcmp zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        View view = (View) zza;
        view.setVisibility(8);
        zza.zzaf("/sendMessageToSdk", new zzbpu() { // from class: com.google.android.gms.internal.ads.zzdpv
            @Override // com.google.android.gms.internal.ads.zzbpu
            public final void zza(Object obj, Map map) {
                zzdqb.this.zzb((zzcmp) obj, map);
            }
        });
        zza.zzaf("/adMuted", new zzbpu() { // from class: com.google.android.gms.internal.ads.zzdpw
            @Override // com.google.android.gms.internal.ads.zzbpu
            public final void zza(Object obj, Map map) {
                zzdqb.this.zzc((zzcmp) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/loadHtml", new zzbpu() { // from class: com.google.android.gms.internal.ads.zzdpx
            @Override // com.google.android.gms.internal.ads.zzbpu
            public final void zza(Object obj, final Map map) {
                final zzdqb zzdqbVar = zzdqb.this;
                zzcmp zzcmpVar = (zzcmp) obj;
                zzcmpVar.zzP().zzz(new zzcoa() { // from class: com.google.android.gms.internal.ads.zzdqa
                    @Override // com.google.android.gms.internal.ads.zzcoa
                    public final void zza(boolean z) {
                        zzdqb.this.zzd(map, z);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcmpVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcmpVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/showOverlay", new zzbpu() { // from class: com.google.android.gms.internal.ads.zzdpy
            @Override // com.google.android.gms.internal.ads.zzbpu
            public final void zza(Object obj, Map map) {
                zzdqb.this.zze((zzcmp) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/hideOverlay", new zzbpu() { // from class: com.google.android.gms.internal.ads.zzdpz
            @Override // com.google.android.gms.internal.ads.zzbpu
            public final void zza(Object obj, Map map) {
                zzdqb.this.zzf((zzcmp) obj, map);
            }
        });
        return view;
    }

    final /* synthetic */ void zzb(zzcmp zzcmpVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(zzcmp zzcmpVar, Map map) {
        this.zzd.zzf();
    }

    final /* synthetic */ void zzd(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    final /* synthetic */ void zze(zzcmp zzcmpVar, Map map) {
        com.google.android.gms.ads.internal.util.zze.zzi("Showing native ads overlay.");
        zzcmpVar.zzH().setVisibility(0);
        this.zzc.zze(true);
    }

    final /* synthetic */ void zzf(zzcmp zzcmpVar, Map map) {
        com.google.android.gms.ads.internal.util.zze.zzi("Hiding native ads overlay.");
        zzcmpVar.zzH().setVisibility(8);
        this.zzc.zze(false);
    }
}
