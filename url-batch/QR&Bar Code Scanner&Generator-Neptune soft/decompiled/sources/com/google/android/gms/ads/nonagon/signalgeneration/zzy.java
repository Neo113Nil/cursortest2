package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzfkm;
import com.google.android.gms.internal.ads.zzfzc;
import java.util.List;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes.dex */
final class zzy implements zzfzc {
    final /* synthetic */ zzbzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaa zzc;

    zzy(zzaa zzaaVar, zzbzr zzbzrVar, boolean z) {
        this.zzc = zzaaVar;
        this.zza = zzbzrVar;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
        try {
            this.zza.zze("Internal error: " + th.getMessage());
        } catch (RemoteException e) {
            zzcgp.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        boolean z;
        String str;
        Uri zzW;
        zzfkm zzfkmVar;
        zzfkm zzfkmVar2;
        List<Uri> list = (List) obj;
        try {
            zzaa.zzF(this.zzc, list);
            this.zza.zzf(list);
            z = this.zzc.zzu;
            if (z || this.zzb) {
                for (Uri uri : list) {
                    if (this.zzc.zzN(uri)) {
                        str = this.zzc.zzC;
                        zzW = zzaa.zzW(uri, str, "1");
                        zzfkmVar = this.zzc.zzs;
                        zzfkmVar.zzc(zzW.toString(), null);
                    } else {
                        if (((Boolean) zzay.zzc().zzb(zzbjc.zzgB)).booleanValue()) {
                            zzfkmVar2 = this.zzc.zzs;
                            zzfkmVar2.zzc(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            zzcgp.zzh("", e);
        }
    }
}
