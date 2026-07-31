package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.exifinterface.media.ExifInterface;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdkp {
    private final zzdpi zza;
    private final zzdnx zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdkp(zzdpi zzdpiVar, zzdnx zzdnxVar) {
        this.zza = zzdpiVar;
        this.zzb = zzdnxVar;
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i);
    }

    public final View zza(final View view, final WindowManager windowManager) throws zzcez {
        zzcek zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        zza.zzE().setVisibility(4);
        zza.zzE().setContentDescription("policy_validator");
        zza.zzab("/sendMessageToSdk", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdko
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdkp.this.zzb((zzcek) obj, map);
            }
        });
        zza.zzab("/hideValidatorOverlay", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdkj
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdkp.this.zzc(windowManager, view, (zzcek) obj, map);
            }
        });
        zza.zzab("/open", new zzbjy(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(zza);
        zzbjl zzbjlVar = new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdkk
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdkp.this.zzd(view, windowManager, (zzcek) obj, map);
            }
        };
        zzdnx zzdnxVar = this.zzb;
        zzdnxVar.zzh(weakReference, "/loadNativeAdPolicyViolations", zzbjlVar);
        zzdnxVar.zzh(new WeakReference(zza), "/showValidatorOverlay", zzdkl.zza);
        return zza.zzE();
    }

    final /* synthetic */ void zzb(zzcek zzcekVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcek zzcekVar, Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Hide native ad policy validator overlay.");
        zzcekVar.zzE().setVisibility(8);
        if (zzcekVar.zzE().getWindowToken() != null) {
            windowManager.removeView(zzcekVar.zzE());
        }
        zzcekVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    final /* synthetic */ void zzd(final View view, final WindowManager windowManager, zzcek zzcekVar, final Map map) {
        final zzcek zzcekVar2;
        zzcekVar.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdkn
            @Override // com.google.android.gms.internal.ads.zzcgg
            public final /* synthetic */ void zza(boolean z, int i, String str, String str2) {
                zzdkp.this.zze(map, z, i, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziP)).intValue());
        int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziQ)).intValue());
        int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcekVar.zzaf(zzcgt.zzc(zzf, zzf2));
        try {
            zzcekVar.zzD().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziR)).booleanValue());
            zzcekVar.zzD().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziS)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams zzk = com.google.android.gms.ads.internal.util.zzbs.zzk();
        zzk.x = zzf3;
        zzk.y = zzf4;
        windowManager.updateViewLayout(zzcekVar.zzE(), zzk);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = (("1".equals(str) || ExifInterface.GPS_MEASUREMENT_2D.equals(str)) ? rect.bottom : rect.top) - zzf4;
            zzcekVar2 = zzcekVar;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdkm
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final /* synthetic */ void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        zzcek zzcekVar3 = zzcekVar2;
                        if (zzcekVar3.zzE().getWindowToken() == null) {
                            return;
                        }
                        int i2 = i;
                        WindowManager.LayoutParams layoutParams = zzk;
                        String str2 = str;
                        if ("1".equals(str2) || ExifInterface.GPS_MEASUREMENT_2D.equals(str2)) {
                            layoutParams.y = rect2.bottom - i2;
                        } else {
                            layoutParams.y = rect2.top - i2;
                        }
                        windowManager.updateViewLayout(zzcekVar3.zzE(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        } else {
            zzcekVar2 = zzcekVar;
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzcekVar2.loadUrl(str2);
    }

    final /* synthetic */ void zze(Map map, boolean z, int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", hashMap);
    }
}
