package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfdx implements zzfdi {
    private final zzhdi zza;
    private final Context zzb;

    public zzfdx(zzhdi zzhdiVar, Context context) {
        this.zza = zzhdiVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfdw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfdx.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 39;
    }

    final /* synthetic */ zzfdv zzc() {
        boolean z;
        int i;
        Context context = this.zzb;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzt.zzc();
        int i2 = -1;
        if (com.google.android.gms.ads.internal.util.zzs.zzD(context, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i = type;
                i2 = ordinal;
            } else {
                i = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
        } else {
            z = false;
            i = -2;
        }
        return new zzfdv(networkOperator, i, com.google.android.gms.ads.internal.zzt.zzf().zzk(context), phoneType, z, i2);
    }
}
