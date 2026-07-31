package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzgbp;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzf extends zzgbp {
    public zzf(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdMobHandler.handleMessage");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    protected final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzc();
            zzs.zzP(com.google.android.gms.ads.internal.zzt.zzh().zzq(), th);
            throw th;
        }
    }
}
