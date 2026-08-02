package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbyh extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbyh(zzblw zzblwVar) {
        try {
            this.zzb = zzblwVar.zzg();
        } catch (RemoteException e) {
            zzcgp.zzh("", e);
            this.zzb = "";
        }
        try {
            for (Object obj : zzblwVar.zzh()) {
                zzbme zzg = obj instanceof IBinder ? zzbmd.zzg((IBinder) obj) : null;
                if (zzg != null) {
                    this.zza.add(new zzbyj(zzg));
                }
            }
        } catch (RemoteException e2) {
            zzcgp.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }
}
