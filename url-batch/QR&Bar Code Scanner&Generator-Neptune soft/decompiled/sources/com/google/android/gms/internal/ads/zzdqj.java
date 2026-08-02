package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdqj {
    private final zzduy zza;
    private final zzdtn zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdqj(zzduy zzduyVar, zzdtn zzdtnVar) {
        this.zza = zzduyVar;
        this.zzb = zzdtnVar;
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        return zzcgi.zzw(context, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza(final View view, final WindowManager windowManager) throws zzcna {
        zzcmp zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        View view2 = (View) zza;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        zza.zzaf("/sendMessageToSdk", new zzbpu() { // from class: com.google.android.gms.internal.ads.zzdqf
            @Override // com.google.android.gms.internal.ads.zzbpu
            public final void zza(Object obj, Map map) {
                zzdqj.this.zzb((zzcmp) obj, map);
            }
        });
        zza.zzaf("/hideValidatorOverlay", new zzbpu() { // from class: com.google.android.gms.internal.ads.zzdqg
            @Override // com.google.android.gms.internal.ads.zzbpu
            public final void zza(Object obj, Map map) {
                zzdqj.this.zzc(windowManager, view, (zzcmp) obj, map);
            }
        });
        zza.zzaf("/open", new zzbqf(null, null, null, null, null));
        this.zzb.zzj(new WeakReference(zza), "/loadNativeAdPolicyViolations", new zzbpu() { // from class: com.google.android.gms.internal.ads.zzdqh
            @Override // com.google.android.gms.internal.ads.zzbpu
            public final void zza(Object obj, Map map) {
                zzdqj.this.zze(view, windowManager, (zzcmp) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/showValidatorOverlay", new zzbpu() { // from class: com.google.android.gms.internal.ads.zzdqi
            @Override // com.google.android.gms.internal.ads.zzbpu
            public final void zza(Object obj, Map map) {
                com.google.android.gms.ads.internal.util.zze.zze("Show native ad policy validator overlay.");
                ((zzcmp) obj).zzH().setVisibility(0);
            }
        });
        return view2;
    }

    final /* synthetic */ void zzb(zzcmp zzcmpVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcmp zzcmpVar, Map map) {
        com.google.android.gms.ads.internal.util.zze.zze("Hide native ad policy validator overlay.");
        zzcmpVar.zzH().setVisibility(8);
        if (zzcmpVar.zzH().getWindowToken() != null) {
            windowManager.removeView(zzcmpVar.zzH());
        }
        zzcmpVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    final /* synthetic */ void zzd(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    final /* synthetic */ void zze(final View view, final WindowManager windowManager, final zzcmp zzcmpVar, final Map map) {
        zzcmpVar.zzP().zzz(new zzcoa() { // from class: com.google.android.gms.internal.ads.zzdqd
            @Override // com.google.android.gms.internal.ads.zzcoa
            public final void zza(boolean z) {
                zzdqj.this.zzd(map, z);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgU)).intValue());
        int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgV)).intValue());
        int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcmpVar.zzai(zzcoe.zzb(zzf, zzf2));
        try {
            zzcmpVar.zzI().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgW)).booleanValue());
            zzcmpVar.zzI().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgX)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams zzb = com.google.android.gms.ads.internal.util.zzbx.zzb();
        zzb.x = zzf3;
        zzb.y = zzf4;
        windowManager.updateViewLayout(zzcmpVar.zzH(), zzb);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - zzf4;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdqe
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View view2 = view;
                    zzcmp zzcmpVar2 = zzcmpVar;
                    String str2 = str;
                    WindowManager.LayoutParams layoutParams = zzb;
                    int i2 = i;
                    WindowManager windowManager2 = windowManager;
                    Rect rect2 = new Rect();
                    if (!view2.getGlobalVisibleRect(rect2) || zzcmpVar2.zzH().getWindowToken() == null) {
                        return;
                    }
                    if ("1".equals(str2) || "2".equals(str2)) {
                        layoutParams.y = rect2.bottom - i2;
                    } else {
                        layoutParams.y = rect2.top - i2;
                    }
                    windowManager2.updateViewLayout(zzcmpVar2.zzH(), layoutParams);
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
        zzcmpVar.loadUrl(str2);
    }
}
