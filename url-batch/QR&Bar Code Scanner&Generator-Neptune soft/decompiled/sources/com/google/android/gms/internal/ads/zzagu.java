package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzagu implements zzzi {
    public static final zzzp zza = new zzzp() { // from class: com.google.android.gms.internal.ads.zzagt
        @Override // com.google.android.gms.internal.ads.zzzp
        public final zzzi[] zza() {
            zzzp zzzpVar = zzagu.zza;
            return new zzzi[]{new zzagu()};
        }

        @Override // com.google.android.gms.internal.ads.zzzp
        public final /* synthetic */ zzzi[] zzb(Uri uri, Map map) {
            return zzzo.zza(this, uri, map);
        }
    };
    private final zzagv zzb = new zzagv(null);
    private final zzef zzc = new zzef(16384);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzzi
    public final int zza(zzzj zzzjVar, zzaai zzaaiVar) throws IOException {
        int zza2 = zzzjVar.zza(this.zzc.zzH(), 0, 16384);
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

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzb(zzzl zzzlVar) {
        this.zzb.zzb(zzzlVar, new zzaio(Integer.MIN_VALUE, 0, 1));
        zzzlVar.zzC();
        zzzlVar.zzN(new zzaak(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzc(long j, long j2) {
        this.zzd = false;
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzzj zzzjVar) throws IOException {
        zzyy zzyyVar;
        int i;
        zzef zzefVar = new zzef(10);
        int i2 = 0;
        while (true) {
            zzyyVar = (zzyy) zzzjVar;
            zzyyVar.zzm(zzefVar.zzH(), 0, 10, false);
            zzefVar.zzF(0);
            if (zzefVar.zzm() != 4801587) {
                break;
            }
            zzefVar.zzG(3);
            int zzj = zzefVar.zzj();
            i2 += zzj + 10;
            zzyyVar.zzl(zzj, false);
        }
        zzzjVar.zzj();
        zzyyVar.zzl(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            zzyyVar.zzm(zzefVar.zzH(), 0, 7, false);
            zzefVar.zzF(0);
            int zzo = zzefVar.zzo();
            if (zzo == 44096 || zzo == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] zzH = zzefVar.zzH();
                int i6 = zzym.zza;
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
                zzyyVar.zzl(i - 7, false);
            } else {
                zzzjVar.zzj();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                zzyyVar.zzl(i4, false);
                i3 = 0;
            }
        }
    }
}
