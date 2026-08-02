package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzagx implements zzzi {
    public static final zzzp zza = new zzzp() { // from class: com.google.android.gms.internal.ads.zzagw
        @Override // com.google.android.gms.internal.ads.zzzp
        public final zzzi[] zza() {
            zzzp zzzpVar = zzagx.zza;
            return new zzzi[]{new zzagx(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzzp
        public final /* synthetic */ zzzi[] zzb(Uri uri, Map map) {
            return zzzo.zza(this, uri, map);
        }
    };
    private final zzagy zzb;
    private final zzef zzc;
    private final zzef zzd;
    private final zzee zze;
    private zzzl zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzagx() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final int zza(zzzj zzzjVar, zzaai zzaaiVar) throws IOException {
        zzdd.zzb(this.zzf);
        int zza2 = zzzjVar.zza(this.zzc.zzH(), 0, 2048);
        if (!this.zzj) {
            this.zzf.zzN(new zzaak(-9223372036854775807L, 0L));
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

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzb(zzzl zzzlVar) {
        this.zzf = zzzlVar;
        this.zzb.zzb(zzzlVar, new zzaio(Integer.MIN_VALUE, 0, 1));
        zzzlVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzc(long j, long j2) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzzj zzzjVar) throws IOException {
        zzyy zzyyVar;
        int i = 0;
        while (true) {
            zzyyVar = (zzyy) zzzjVar;
            zzyyVar.zzm(this.zzd.zzH(), 0, 10, false);
            this.zzd.zzF(0);
            if (this.zzd.zzm() != 4801587) {
                break;
            }
            this.zzd.zzG(3);
            int zzj = this.zzd.zzj();
            i += zzj + 10;
            zzyyVar.zzl(zzj, false);
        }
        zzzjVar.zzj();
        zzyyVar.zzl(i, false);
        if (this.zzh == -1) {
            this.zzh = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zzyyVar.zzm(this.zzd.zzH(), 0, 2, false);
            this.zzd.zzF(0);
            if (zzagy.zzf(this.zzd.zzo())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zzyyVar.zzm(this.zzd.zzH(), 0, 4, false);
                this.zze.zzh(14);
                int zzc = this.zze.zzc(13);
                if (zzc <= 6) {
                    i4++;
                    zzzjVar.zzj();
                    zzyyVar.zzl(i4, false);
                } else {
                    zzyyVar.zzl(zzc - 6, false);
                    i3 += zzc;
                }
            } else {
                i4++;
                zzzjVar.zzj();
                zzyyVar.zzl(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    public zzagx(int i) {
        this.zzb = new zzagy(true, null);
        this.zzc = new zzef(2048);
        this.zzh = -1L;
        zzef zzefVar = new zzef(10);
        this.zzd = zzefVar;
        byte[] zzH = zzefVar.zzH();
        this.zze = new zzee(zzH, zzH.length);
    }
}
