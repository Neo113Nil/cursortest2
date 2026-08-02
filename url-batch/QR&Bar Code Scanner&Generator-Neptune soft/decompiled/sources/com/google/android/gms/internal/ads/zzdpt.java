package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.database.core.ServerValues;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdpt implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdtn zzd;
    private final Clock zze;
    private zzbny zzf;
    private zzbpu zzg;

    public zzdpt(zzdtn zzdtnVar, Clock clock) {
        this.zzd = zzdtnVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.zza);
            hashMap.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.zzd.zzg("sendMessageToNativeJs", hashMap);
        }
        zzd();
    }

    public final zzbny zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zze();
        } catch (RemoteException e) {
            zzcgp.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzc(final zzbny zzbnyVar) {
        this.zzf = zzbnyVar;
        zzbpu zzbpuVar = this.zzg;
        if (zzbpuVar != null) {
            this.zzd.zzk("/unconfirmedClick", zzbpuVar);
        }
        zzbpu zzbpuVar2 = new zzbpu() { // from class: com.google.android.gms.internal.ads.zzdps
            @Override // com.google.android.gms.internal.ads.zzbpu
            public final void zza(Object obj, Map map) {
                zzdpt zzdptVar = zzdpt.this;
                zzbny zzbnyVar2 = zzbnyVar;
                try {
                    zzdptVar.zzb = Long.valueOf(Long.parseLong((String) map.get(ServerValues.NAME_OP_TIMESTAMP)));
                } catch (NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.zze.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzdptVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbnyVar2 == null) {
                    com.google.android.gms.ads.internal.util.zze.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbnyVar2.zzf(str);
                } catch (RemoteException e) {
                    zzcgp.zzl("#007 Could not call remote method.", e);
                }
            }
        };
        this.zzg = zzbpuVar2;
        this.zzd.zzi("/unconfirmedClick", zzbpuVar2);
    }
}
