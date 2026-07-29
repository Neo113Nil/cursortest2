package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzafv implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzafu
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzafv.zza;
            return new zzys[]{new zzafv(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private final zzafw zzb;
    private final zzdy zzc;
    private final zzdy zzd;
    private final zzdx zze;
    private zzyv zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzafv() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final int zza(zzyt zzytVar, zzzs zzzsVar) throws IOException {
        zzcw.zzb(this.zzf);
        int zza2 = zzytVar.zza(this.zzc.zzH(), 0, 2048);
        if (!this.zzj) {
            this.zzf.zzL(new zzzu(-9223372036854775807L, 0L));
            this.zzj = true;
        }
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzE(zza2);
        if (!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzf = zzyvVar;
        this.zzb.zzb(zzyvVar, new zzahm(Integer.MIN_VALUE, 0, 1));
        zzyvVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j, long j2) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) throws IOException {
        zzym zzymVar;
        int i = 0;
        while (true) {
            zzymVar = (zzym) zzytVar;
            zzymVar.zzm(this.zzd.zzH(), 0, 10, false);
            this.zzd.zzF(0);
            if (this.zzd.zzm() != 4801587) {
                break;
            }
            this.zzd.zzG(3);
            int zzj = this.zzd.zzj();
            i += zzj + 10;
            zzymVar.zzl(zzj, false);
        }
        zzytVar.zzj();
        zzymVar.zzl(i, false);
        if (this.zzh == -1) {
            this.zzh = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            zzymVar.zzm(this.zzd.zzH(), 0, 2, false);
            this.zzd.zzF(0);
            if (zzafw.zzf(this.zzd.zzo())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                zzymVar.zzm(this.zzd.zzH(), 0, 4, false);
                this.zze.zzh(14);
                int zzc = this.zze.zzc(13);
                if (zzc <= 6) {
                    i2++;
                    zzytVar.zzj();
                    zzymVar.zzl(i2, false);
                } else {
                    zzymVar.zzl(zzc - 6, false);
                    i4 += zzc;
                }
            } else {
                i2++;
                zzytVar.zzj();
                zzymVar.zzl(i2, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    public zzafv(int i) {
        this.zzb = new zzafw(true, null);
        this.zzc = new zzdy(2048);
        this.zzh = -1L;
        zzdy zzdyVar = new zzdy(10);
        this.zzd = zzdyVar;
        byte[] zzH = zzdyVar.zzH();
        this.zze = new zzdx(zzH, zzH.length);
    }
}
