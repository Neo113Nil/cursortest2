package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbrs extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbrs(zzbew zzbewVar) {
        try {
            this.zzb = zzbewVar.zzg();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbewVar.zzh()) {
                zzbfd zzg = obj instanceof IBinder ? zzbfc.zzg((IBinder) obj) : null;
                if (zzg != null) {
                    this.zza.add(new zzbru(zzg));
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
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
