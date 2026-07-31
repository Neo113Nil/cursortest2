package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcai;
import com.google.android.gms.internal.ads.zzhcv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzz implements zzhcv {
    final /* synthetic */ zzcai zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzap zzc;

    zzz(zzap zzapVar, zzcai zzcaiVar, boolean z) {
        this.zza = zzcaiVar;
        this.zzb = z;
        Objects.requireNonNull(zzapVar);
        this.zzc = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        try {
            zzcai zzcaiVar = this.zza;
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
            sb.append("Internal error: ");
            sb.append(message);
            zzcaiVar.zzf(sb.toString());
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Uri zzY;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.zza.zze(arrayList);
            zzap zzapVar = this.zzc;
            if (!zzapVar.zzB() && !this.zzb) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (zzapVar.zzb(uri)) {
                    zzY = zzap.zzY(uri, zzapVar.zzL(), "1");
                    zzapVar.zzA().zzb(zzY.toString(), null, null, null);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziC)).booleanValue()) {
                        zzapVar.zzA().zzb(uri.toString(), null, null, null);
                    }
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }
}
