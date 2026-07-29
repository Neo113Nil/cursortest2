package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzafs implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzafr
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzafs.zza;
            return new zzys[]{new zzafs()};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private final zzaft zzb = new zzaft(null);
    private final zzdy zzc = new zzdy(16384);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzys
    public final int zza(zzyt zzytVar, zzzs zzzsVar) throws IOException {
        int zza2 = zzytVar.zza(this.zzc.zzH(), 0, 16384);
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        r16.zzj();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if ((r4 - r3) >= 8192) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzd(zzyt zzytVar) throws IOException {
        zzym zzymVar;
        int i;
        zzdy zzdyVar = new zzdy(10);
        int i2 = 0;
        while (true) {
            zzymVar = (zzym) zzytVar;
            zzymVar.zzm(zzdyVar.zzH(), 0, 10, false);
            zzdyVar.zzF(0);
            if (zzdyVar.zzm() != 4801587) {
                break;
            }
            zzdyVar.zzG(3);
            int zzj = zzdyVar.zzj();
            i2 += zzj + 10;
            zzymVar.zzl(zzj, false);
        }
        zzytVar.zzj();
        zzymVar.zzl(i2, false);
        int i3 = i2;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = 7;
                zzymVar.zzm(zzdyVar.zzH(), 0, 7, false);
                zzdyVar.zzF(0);
                int zzo = zzdyVar.zzo();
                if (zzo != 44096 && zzo != 44097) {
                    break;
                }
                i4++;
                if (i4 >= 4) {
                    return true;
                }
                byte[] zzH = zzdyVar.zzH();
                int i6 = zzya.zza;
                if (zzH.length < 7) {
                    i = -1;
                } else {
                    int i7 = ((zzH[2] & UByte.MAX_VALUE) << 8) | (zzH[3] & UByte.MAX_VALUE);
                    if (i7 == 65535) {
                        i7 = ((zzH[4] & UByte.MAX_VALUE) << 16) | ((zzH[5] & UByte.MAX_VALUE) << 8) | (zzH[6] & UByte.MAX_VALUE);
                    } else {
                        i5 = 4;
                    }
                    if (zzo == 44097) {
                        i5 += 2;
                    }
                    i = i7 + i5;
                }
                if (i == -1) {
                    return false;
                }
                zzymVar.zzl(i - 7, false);
            }
            zzymVar.zzl(i3, false);
        }
    }
}
