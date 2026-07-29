package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzdor {
    private final zzdto zza;
    private final zzdsd zzb;
    private final zzcum zzc;
    private final zzdno zzd;

    public zzdor(zzdto zzdtoVar, zzdsd zzdsdVar, zzcum zzcumVar, zzdno zzdnoVar) {
        this.zza = zzdtoVar;
        this.zzb = zzdsdVar;
        this.zzc = zzcumVar;
        this.zzd = zzdnoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza() throws zzclt {
        zzcli zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        View view = (View) zza;
        view.setVisibility(8);
        zza.zzaf("/sendMessageToSdk", new zzbol() { // from class: com.google.android.gms.internal.ads.zzdol
            @Override // com.google.android.gms.internal.ads.zzbol
            public final void zza(Object obj, Map map) {
                zzdor.this.zzb((zzcli) obj, map);
            }
        });
        zza.zzaf("/adMuted", new zzbol() { // from class: com.google.android.gms.internal.ads.zzdom
            @Override // com.google.android.gms.internal.ads.zzbol
            public final void zza(Object obj, Map map) {
                zzdor.this.zzc((zzcli) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/loadHtml", new zzbol() { // from class: com.google.android.gms.internal.ads.zzdon
            @Override // com.google.android.gms.internal.ads.zzbol
            public final void zza(Object obj, final Map map) {
                final zzdor zzdorVar = zzdor.this;
                zzcli zzcliVar = (zzcli) obj;
                zzcliVar.zzP().zzz(new zzcmt() { // from class: com.google.android.gms.internal.ads.zzdoq
                    @Override // com.google.android.gms.internal.ads.zzcmt
                    public final void zza(boolean z) {
                        zzdor.this.zzd(map, z);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcliVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcliVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/showOverlay", new zzbol() { // from class: com.google.android.gms.internal.ads.zzdoo
            @Override // com.google.android.gms.internal.ads.zzbol
            public final void zza(Object obj, Map map) {
                zzdor.this.zze((zzcli) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/hideOverlay", new zzbol() { // from class: com.google.android.gms.internal.ads.zzdop
            @Override // com.google.android.gms.internal.ads.zzbol
            public final void zza(Object obj, Map map) {
                zzdor.this.zzf((zzcli) obj, map);
            }
        });
        return view;
    }

    final /* synthetic */ void zzb(zzcli zzcliVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(zzcli zzcliVar, Map map) {
        this.zzd.zzf();
    }

    final /* synthetic */ void zzd(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    final /* synthetic */ void zze(zzcli zzcliVar, Map map) {
        com.google.android.gms.ads.internal.util.zze.zzi("Showing native ads overlay.");
        zzcliVar.zzH().setVisibility(0);
        this.zzc.zze(true);
    }

    final /* synthetic */ void zzf(zzcli zzcliVar, Map map) {
        com.google.android.gms.ads.internal.util.zze.zzi("Hiding native ads overlay.");
        zzcliVar.zzH().setVisibility(8);
        this.zzc.zze(false);
    }
}
