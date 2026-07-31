package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import android.util.Log;
import java.util.Objects;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes9.dex */
abstract class zzaf extends com.google.android.play.core.hsdp.protocol.zzi {
    final /* synthetic */ zzai zzb;

    /* synthetic */ zzaf(zzai zzaiVar, zzah zzahVar) {
        Objects.requireNonNull(zzaiVar);
        this.zzb = zzaiVar;
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzj
    public final void zzb(Bundle bundle) {
        this.zzb.zza();
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzj
    public final void zzc(Bundle bundle) {
        int i = bundle.getInt("hsdpStatusCode", 1);
        if (!bundle.containsKey("hsdpStatusCode")) {
            Log.w("HsdpClientImpl", "HsdpServiceListener.onStateChange: cannot find status code");
        }
        String string = bundle.getString("targetPackage", "");
        if (Log.isLoggable("HsdpClientImpl", 4)) {
            Log.i("HsdpClientImpl", "HsdpServiceListener.onStateChange: " + i + " for target package: " + string);
        }
        if (string.isEmpty()) {
            Log.e("HsdpClientImpl", "HsdpServiceListener.onStateChange: cannot find target package");
        }
        switch (i) {
            case 1:
                zzf(string, i, bundle.getString("errorMessage", "HSDP service unknown status"));
                break;
            case 2:
                break;
            case 3:
                zzh(string);
                break;
            case 4:
                zze(string);
                break;
            case 5:
                zzg(string);
                break;
            case 6:
                zzf(string, i, bundle.getString("errorMessage", "HSDP service error"));
                break;
            case 7:
                zzd(string);
                break;
            case 8:
                zzf(string, i, bundle.getString("errorMessage", "HSDP service cancelled"));
                break;
            default:
                Log.w("HsdpClientImpl", "Ignoring HSDP service unsupported status code: " + i + " for target package: " + string);
                break;
        }
    }

    abstract void zzd(String str);

    abstract void zze(String str);

    abstract void zzf(String str, int i, String str2);

    abstract void zzg(String str);

    abstract void zzh(String str);
}
