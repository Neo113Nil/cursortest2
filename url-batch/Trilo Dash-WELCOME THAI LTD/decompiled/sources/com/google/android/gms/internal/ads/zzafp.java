package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzafp implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzafo
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzafp.zza;
            return new zzys[]{new zzafp()};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private final zzafq zzb = new zzafq(null);
    private final zzdy zzc = new zzdy(2786);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzys
    public final int zza(zzyt zzytVar, zzzs zzzsVar) throws IOException {
        int zza2 = zzytVar.zza(this.zzc.zzH(), 0, 2786);
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzE(zza2);
        if (!this.zzd) {
            this.zzb.zzd(0L, 4);
            this.zzd = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzb.zzb(zzyvVar, new zzahm(Integer.MIN_VALUE, 0, 1));
        zzyvVar.zzB();
        zzyvVar.zzL(new zzzu(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j, long j2) {
        this.zzd = false;
        this.zzb.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r9.zzj();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if ((r4 - r3) >= 8192) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzd(zzyt zzytVar) throws IOException {
        zzym zzymVar;
        zzdy zzdyVar = new zzdy(10);
        int i = 0;
        while (true) {
            zzymVar = (zzym) zzytVar;
            zzymVar.zzm(zzdyVar.zzH(), 0, 10, false);
            zzdyVar.zzF(0);
            if (zzdyVar.zzm() != 4801587) {
                break;
            }
            zzdyVar.zzG(3);
            int zzj = zzdyVar.zzj();
            i += zzj + 10;
            zzymVar.zzl(zzj, false);
        }
        zzytVar.zzj();
        zzymVar.zzl(i, false);
        int i2 = i;
        while (true) {
            int i3 = 0;
            while (true) {
                zzymVar.zzm(zzdyVar.zzH(), 0, 6, false);
                zzdyVar.zzF(0);
                if (zzdyVar.zzo() != 2935) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int zzb = zzxx.zzb(zzdyVar.zzH());
                if (zzb == -1) {
                    return false;
                }
                zzymVar.zzl(zzb - 6, false);
            }
            zzymVar.zzl(i2, false);
        }
    }
}
