package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzctd implements zzcyy, zzdel {
    private zzbup zza;
    private final Context zzc;
    private final zzfie zzd;
    private final VersionInfoParcel zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    zzctd(Context context, zzfie zzfieVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzc = context;
        this.zzd = zzfieVar;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (android.text.TextUtils.equals(r0, androidx.core.app.NotificationCompat.CATEGORY_SERVICE) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc() {
        zzbup zzbupVar;
        int i;
        int i2;
        zzbod zzb;
        if (!this.zzb.getAndSet(true)) {
            if (!((Boolean) zzbei.zzl.zze()).booleanValue()) {
                i = 3;
                if (!((Boolean) zzbei.zzm.zze()).booleanValue()) {
                    if (((Boolean) zzbei.zzk.zze()).booleanValue()) {
                        try {
                            String optString = new JSONObject(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd()).optString("local_flag_write");
                            if (TextUtils.equals(optString, "client")) {
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    i = 1;
                }
                i2 = i - 1;
                if (i2 != 1) {
                    zzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
                } else if (i2 == 2) {
                    zzb = com.google.android.gms.ads.internal.zzt.zzr().zza(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
                }
                zzbnx zzbnxVar = zzboa.zza;
                this.zza = new zzbur(this.zzc, zzb.zza("google.afma.sdkConstants.getSdkConstants", zzbnxVar, zzbnxVar), this.zze);
                this.zzg = true;
            }
            i = 2;
            i2 = i - 1;
            if (i2 != 1) {
            }
            zzbnx zzbnxVar2 = zzboa.zza;
            this.zza = new zzbur(this.zzc, zzb.zza("google.afma.sdkConstants.getSdkConstants", zzbnxVar2, zzbnxVar2), this.zze);
            this.zzg = true;
        }
        if (this.zzg && (zzbupVar = this.zza) != null) {
            ListenableFuture zza = zzbupVar.zza();
            if (!this.zzh && ((Boolean) zzbea.zzi.zze()).booleanValue()) {
                zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzctd.this.zzf();
                    }
                }, this.zzf);
            }
            zzbzk.zza(zza, "persistFlagsClient");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdU(zzfcu zzfcuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zze(String str) {
        zzc();
    }

    final /* synthetic */ void zzf() {
        zzbbt.zze(this.zzc);
        this.zzh = true;
    }
}
