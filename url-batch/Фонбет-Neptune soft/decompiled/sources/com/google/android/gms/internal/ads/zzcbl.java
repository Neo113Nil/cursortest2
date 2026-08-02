package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.neptunesoft.gestionbacdz.QuizContract;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcbl {
    private static final boolean zza;
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    private final zzbci zze;
    private final zzbcl zzf;
    private final com.google.android.gms.ads.internal.util.zzbh zzg;
    private final long[] zzh;
    private final String[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcaq zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;

    static {
        zza = com.google.android.gms.ads.internal.client.zzay.zze().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzlK)).intValue();
    }

    public zzcbl(Context context, VersionInfoParcel versionInfoParcel, String str, zzbcl zzbclVar, zzbci zzbciVar) {
        com.google.android.gms.ads.internal.util.zzbf zzbfVar = new com.google.android.gms.ads.internal.util.zzbf();
        zzbfVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbfVar.zza("1_5", 1.0d, 5.0d);
        zzbfVar.zza("5_10", 5.0d, 10.0d);
        zzbfVar.zza("10_20", 10.0d, 20.0d);
        zzbfVar.zza("20_30", 20.0d, 30.0d);
        zzbfVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.zzg = zzbfVar.zzb();
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzr = -1L;
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zzc = str;
        this.zzf = zzbclVar;
        this.zze = zzbciVar;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzu);
        if (str2 == null) {
            this.zzi = new String[0];
            this.zzh = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.zzi = new String[length];
        this.zzh = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.zzh[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to parse frame hash target time number.", e);
                this.zzh[i] = -1;
            }
        }
    }

    public final void zza(zzcaq zzcaqVar) {
        zzbcd.zza(this.zzf, this.zze, "vpc2");
        this.zzj = true;
        this.zzf.zzd("vpn", zzcaqVar.zzj());
        this.zzo = zzcaqVar;
    }

    public final void zzb() {
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbcd.zza(this.zzf, this.zze, "vfr2");
        this.zzk = true;
    }

    public final void zzc() {
        this.zzn = true;
        if (!this.zzk || this.zzl) {
            return;
        }
        zzbcd.zza(this.zzf, this.zze, "vfp2");
        this.zzl = true;
    }

    public final void zzd() {
        if (!zza || this.zzp) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(QuizContract.QuestionTable.COLUMN_TYPE, "native-player-metrics");
        bundle.putString("request", this.zzc);
        bundle.putString("player", this.zzo.zzj());
        for (com.google.android.gms.ads.internal.util.zzbe zzbeVar : this.zzg.zza()) {
            String valueOf = String.valueOf(zzbeVar.zza);
            bundle.putString("fps_c_".concat(valueOf), Integer.toString(zzbeVar.zze));
            String valueOf2 = String.valueOf(zzbeVar.zza);
            bundle.putString("fps_p_".concat(valueOf2), Double.toString(zzbeVar.zzd));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.zzh;
            if (i >= jArr.length) {
                com.google.android.gms.ads.internal.zzu.zzp().zzh(this.zzb, this.zzd.afmaVersion, "gmob-apps", bundle, true);
                this.zzp = true;
                return;
            }
            String str = this.zzi[i];
            if (str != null) {
                Long valueOf3 = Long.valueOf(jArr[i]);
                Objects.toString(valueOf3);
                bundle.putString("fh_".concat(valueOf3.toString()), str);
            }
            i++;
        }
    }

    public final void zze() {
        this.zzn = false;
    }

    public final void zzf(zzcaq zzcaqVar) {
        if (this.zzl && !this.zzm) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.zzm) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            zzbcd.zza(this.zzf, this.zze, "vff2");
            this.zzm = true;
        }
        long nanoTime = com.google.android.gms.ads.internal.zzu.zzB().nanoTime();
        if (this.zzn && this.zzq && this.zzr != -1) {
            this.zzg.zzb(TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.zzr));
        }
        this.zzq = this.zzn;
        this.zzr = nanoTime;
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzv)).longValue();
        long zza2 = zzcaqVar.zza();
        int i = 0;
        while (true) {
            String[] strArr = this.zzi;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && longValue > Math.abs(zza2 - this.zzh[i])) {
                String[] strArr2 = this.zzi;
                int i2 = 8;
                Bitmap bitmap = zzcaqVar.getBitmap(8, 8);
                long j = 63;
                long j2 = 0;
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j);
                        j--;
                        i4++;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", Long.valueOf(j2));
                return;
            }
            i++;
        }
    }
}
