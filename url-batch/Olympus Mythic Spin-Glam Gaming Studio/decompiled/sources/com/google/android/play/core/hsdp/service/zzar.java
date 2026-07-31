package com.google.android.play.core.hsdp.service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import com.safedk.android.utils.Logger;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes11.dex */
final class zzar extends zzas {
    final /* synthetic */ Activity zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ zzat zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzar(zzat zzatVar, HsdpDeepLinkService.HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener, Activity activity, String str, String str2, Map map) {
        super(hsdpDeepLinkServiceListener);
        this.zza = activity;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = map;
        Objects.requireNonNull(zzatVar);
        this.zze = zzatVar;
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onAffordanceEnded() {
        throw new UnsupportedOperationException("HPOA service should not be called in service based HSDP.");
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onAffordanceStarted() {
        throw new UnsupportedOperationException("HPOA service should not be called in service based HSDP.");
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onDeepLinkStarted() {
        throw new UnsupportedOperationException("HSDP Activity should not be started in service based HSDP.");
    }

    @Override // com.google.android.play.core.hsdp.service.zzas, com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onDismissed(Bundle bundle) {
        this.zza.runOnUiThread(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzaq
            @Override // java.lang.Runnable
            public final void run() {
                zzar.this.zze.zza();
            }
        });
        super.onDismissed(bundle);
    }

    @Override // com.google.android.play.core.hsdp.service.zzas, com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onError(Bundle bundle) {
        final Activity activity = this.zza;
        final String str = this.zzb;
        final String str2 = this.zzc;
        final Map map = this.zzd;
        activity.runOnUiThread(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzao
            public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
                Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
                if (p1 == null) {
                    return;
                }
                p0.startActivityForResult(p1, p2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzar.this.zze.zza();
                safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, zzq.zza(str, str2, map), 0);
            }
        });
        super.onError(bundle);
    }

    @Override // com.google.android.play.core.hsdp.service.zzas, com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onShown(Bundle bundle) {
        this.zza.runOnUiThread(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzap
            @Override // java.lang.Runnable
            public final void run() {
                zzar.this.zze.zza();
            }
        });
        super.onShown(bundle);
    }
}
