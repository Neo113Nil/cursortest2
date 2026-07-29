package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbkt extends NativeAd.AdChoicesInfo {
    private final zzbks zza;
    private final List zzb = new ArrayList();
    private String zzc;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        r4.zzb.add(new com.google.android.gms.internal.ads.zzblb(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbkt(zzbks zzbksVar) {
        IBinder iBinder;
        this.zza = zzbksVar;
        try {
            this.zzc = zzbksVar.zzg();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbksVar.zzh()) {
                zzbla zzblaVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzblaVar = queryLocalInterface instanceof zzbla ? (zzbla) queryLocalInterface : new zzbky(iBinder);
                }
            }
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
