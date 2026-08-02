package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbzz {

    @Nonnull
    private final View zza;
    private final Map zzb;
    private final zzcfg zzc;

    public zzbzz(zzbzy zzbzyVar) {
        View view;
        Map map;
        View view2;
        view = zzbzyVar.zza;
        this.zza = view;
        map = zzbzyVar.zzb;
        this.zzb = map;
        view2 = zzbzyVar.zza;
        zzcfg zza = zzbzt.zza(view2.getContext());
        this.zzc = zza;
        if (zza == null || map.isEmpty()) {
            return;
        }
        try {
            zza.zzf(new zzcaa(ObjectWrapper.wrap(view).asBinder(), ObjectWrapper.wrap(map).asBinder()));
        } catch (RemoteException unused) {
            zzcgp.zzg("Failed to call remote method.");
        }
    }

    public final void zza(List list) {
        if (list == null || list.isEmpty()) {
            zzcgp.zzj("No click urls were passed to recordClick");
            return;
        }
        if (this.zzc == null) {
            zzcgp.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            this.zzc.zzg(list, ObjectWrapper.wrap(this.zza), new zzbzx(this, list));
        } catch (RemoteException e) {
            zzcgp.zzg("RemoteException recording click: ".concat(e.toString()));
        }
    }

    public final void zzb(List list) {
        if (list == null || list.isEmpty()) {
            zzcgp.zzj("No impression urls were passed to recordImpression");
            return;
        }
        zzcfg zzcfgVar = this.zzc;
        if (zzcfgVar == null) {
            zzcgp.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        try {
            zzcfgVar.zzh(list, ObjectWrapper.wrap(this.zza), new zzbzw(this, list));
        } catch (RemoteException e) {
            zzcgp.zzg("RemoteException recording impression urls: ".concat(e.toString()));
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        zzcfg zzcfgVar = this.zzc;
        if (zzcfgVar == null) {
            zzcgp.zze("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zzcfgVar.zzj(ObjectWrapper.wrap(motionEvent));
        } catch (RemoteException unused) {
            zzcgp.zzg("Failed to call remote method.");
        }
    }

    public final void zzd(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzk(new ArrayList(Arrays.asList(uri)), ObjectWrapper.wrap(this.zza), new zzbzv(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzl(list, ObjectWrapper.wrap(this.zza), new zzbzu(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }
}
