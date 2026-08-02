package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzbbc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbav {
    private final zzbbb zza;
    private final zzbbc.zzt.zza zzb;
    private final boolean zzc;

    private zzbav() {
        this.zzb = zzbbc.zzt.zzj();
        this.zzc = false;
        this.zza = new zzbbb();
    }

    public static zzbav zza() {
        return new zzbav();
    }

    private final synchronized String zzd(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzb.zzah(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime()), Integer.valueOf(i - 1), Base64.encodeToString(this.zzb.zzbr().zzaV(), 3));
    }

    private final synchronized void zze(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfqu.zza(zzfqt.zza(), externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(zzd(i).getBytes());
                } catch (IOException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized void zzf(int i) {
        zzbbc.zzt.zza zzaVar = this.zzb;
        zzaVar.zzq();
        zzaVar.zzj(com.google.android.gms.ads.internal.util.zzt.zzd());
        zzbba zzbbaVar = new zzbba(this.zza, this.zzb.zzbr().zzaV(), null);
        int i2 = i - 1;
        zzbbaVar.zza(i2);
        zzbbaVar.zzc();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public final synchronized void zzb(zzbau zzbauVar) {
        if (this.zzc) {
            try {
                zzbauVar.zza(this.zzb);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeu)).booleanValue()) {
                zze(i);
            } else {
                zzf(i);
            }
        }
    }

    public zzbav(zzbbb zzbbbVar) {
        this.zzb = zzbbc.zzt.zzj();
        this.zza = zzbbbVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzet)).booleanValue();
    }
}
