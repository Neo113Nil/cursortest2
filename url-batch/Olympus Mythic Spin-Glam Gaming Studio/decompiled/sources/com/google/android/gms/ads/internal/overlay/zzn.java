package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzdlw;
import com.google.android.gms.internal.ads.zzeaj;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzn {
    public static final void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z, @Nullable zzeaj zzeajVar) {
        if (adOverlayInfoParcel.zzk == 4 && adOverlayInfoParcel.zzc == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            zzdlw zzdlwVar = adOverlayInfoParcel.zzu;
            if (zzdlwVar != null) {
                zzdlwVar.zzdu();
            }
            Activity zzj = adOverlayInfoParcel.zzd.zzj();
            zzc zzcVar = adOverlayInfoParcel.zza;
            Context context2 = (zzcVar == null || !zzcVar.zzj || zzj == null) ? context : zzj;
            com.google.android.gms.ads.internal.zzt.zza();
            zza.zzb(context2, zzcVar, adOverlayInfoParcel.zzi, zzcVar != null ? zzcVar.zzi : null, zzeajVar, adOverlayInfoParcel.zzq);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzm.isClientJar);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) zzba.zzc().zzd(zzbjg.zzoU)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzac(context, intent, zzeajVar, adOverlayInfoParcel.zzq);
        } else {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzY(context, intent);
        }
    }
}
