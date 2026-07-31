package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import android.util.Log;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes14.dex */
abstract class zzn extends com.google.android.play.core.hsdp.protocol.zzd {
    /* synthetic */ zzn(zzo zzoVar) {
    }

    @Override // com.google.android.play.core.hsdp.protocol.zze
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 9270);
        if (i == 9281) {
            Log.i("HpoaClientImpl", "onStateChange: HPOA_SERVICE_NO_OP");
            return;
        }
        if (i == 9282) {
            zzd();
            return;
        }
        switch (i) {
            case 9271:
                zzi();
                break;
            case 9272:
                zzh();
                break;
            case 9273:
                zzj();
                break;
            case 9274:
                zzc();
                break;
            case 9275:
                zzk();
                break;
            case 9276:
                zze();
                break;
            case 9277:
                zzg();
                break;
            default:
                zzf(i);
                break;
        }
    }

    abstract void zzc();

    abstract void zzd();

    abstract void zze();

    abstract void zzf(int i);

    abstract void zzg();

    abstract void zzh();

    abstract void zzi();

    abstract void zzj();

    abstract void zzk();
}
