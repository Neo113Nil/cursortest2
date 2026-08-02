package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbtc;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzgcf;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
final class zzah implements zzgcf {
    final /* synthetic */ zzbtc zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzak zzc;

    zzah(zzak zzakVar, zzbtc zzbtcVar, boolean z) {
        this.zza = zzbtcVar;
        this.zzb = z;
        this.zzc = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th) {
        try {
            this.zza.zze("Internal error: " + th.getMessage());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        boolean z;
        String str;
        Uri zzZ;
        zzfll zzfllVar;
        zzfll zzfllVar2;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.zza.zzf(arrayList);
            z = this.zzc.zzr;
            if (z || this.zzb) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (this.zzc.zzP(uri)) {
                        str = this.zzc.zzA;
                        zzZ = zzak.zzZ(uri, str, "1");
                        zzfllVar = this.zzc.zzq;
                        zzfllVar.zzc(zzZ.toString(), null);
                    } else {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgJ)).booleanValue()) {
                            zzfllVar2 = this.zzc.zzq;
                            zzfllVar2.zzc(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }
}
