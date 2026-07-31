package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.ironsource.X3;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdsm {
    private final zzdxg zza;
    private final zzdvv zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdsm(zzdxg zzdxgVar, zzdvv zzdvvVar) {
        this.zza = zzdxgVar;
        this.zzb = zzdvvVar;
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
    }

    public final View zza(@NonNull final View view, @NonNull final WindowManager windowManager) throws zzcmb {
        zzclm zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        zza.zzE().setVisibility(4);
        zza.zzE().setContentDescription("policy_validator");
        zza.zzab("/sendMessageToSdk", new zzbqh() { // from class: com.google.android.gms.internal.ads.zzdsl
            @Override // com.google.android.gms.internal.ads.zzbqh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdsm.this.zzb((zzclm) obj, map);
            }
        });
        zza.zzab("/hideValidatorOverlay", new zzbqh() { // from class: com.google.android.gms.internal.ads.zzdsg
            @Override // com.google.android.gms.internal.ads.zzbqh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdsm.this.zzc(windowManager, view, (zzclm) obj, map);
            }
        });
        zza.zzab("/open", new zzbqv(null, null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(zza);
        zzbqh zzbqhVar = new zzbqh() { // from class: com.google.android.gms.internal.ads.zzdsh
            @Override // com.google.android.gms.internal.ads.zzbqh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdsm.this.zzd(view, windowManager, (zzclm) obj, map);
            }
        };
        zzdvv zzdvvVar = this.zzb;
        zzdvvVar.zzh(weakReference, "/loadNativeAdPolicyViolations", zzbqhVar);
        zzdvvVar.zzh(new WeakReference(zza), "/showValidatorOverlay", zzdsi.zza);
        return zza.zzE();
    }

    final /* synthetic */ void zzb(zzclm zzclmVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(WindowManager windowManager, View view, zzclm zzclmVar, Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Hide native ad policy validator overlay.");
        zzclmVar.zzE().setVisibility(8);
        if (zzclmVar.zzE().getWindowToken() != null) {
            windowManager.removeView(zzclmVar.zzE());
        }
        zzclmVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    final /* synthetic */ void zzd(final View view, final WindowManager windowManager, final zzclm zzclmVar, final Map map) {
        zzclmVar.zzP().zzG(new zzcni() { // from class: com.google.android.gms.internal.ads.zzdsk
            @Override // com.google.android.gms.internal.ads.zzcni
            public final /* synthetic */ void zza(boolean z, int i, String str, String str2) {
                zzdsm.this.zze(map, z, i, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjw)).intValue());
        int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjx)).intValue());
        int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzclmVar.zzaf(zzcnw.zzc(zzf, zzf2));
        try {
            zzclmVar.zzD().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjy)).booleanValue());
            zzclmVar.zzD().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjz)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams zzk = com.google.android.gms.ads.internal.util.zzbs.zzk();
        zzk.x = zzf3;
        zzk.y = zzf4;
        windowManager.updateViewLayout(zzclmVar.zzE(), zzk);
        final String str = (String) map.get(X3.i.n);
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - zzf4;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdsj
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final /* synthetic */ void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        zzclm zzclmVar2 = zzclmVar;
                        if (zzclmVar2.zzE().getWindowToken() == null) {
                            return;
                        }
                        int i2 = i;
                        WindowManager.LayoutParams layoutParams = zzk;
                        String str2 = str;
                        if ("1".equals(str2) || "2".equals(str2)) {
                            layoutParams.y = rect2.bottom - i2;
                        } else {
                            layoutParams.y = rect2.top - i2;
                        }
                        windowManager.updateViewLayout(zzclmVar2.zzE(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzclmVar.loadUrl(str2);
    }

    final /* synthetic */ void zze(Map map, boolean z, int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", hashMap);
    }
}
