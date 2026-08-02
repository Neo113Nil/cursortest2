package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzagr implements zzzi {
    public static final zzzp zza = new zzzp() { // from class: com.google.android.gms.internal.ads.zzagq
        @Override // com.google.android.gms.internal.ads.zzzp
        public final zzzi[] zza() {
            zzzp zzzpVar = zzagr.zza;
            return new zzzi[]{new zzagr()};
        }

        @Override // com.google.android.gms.internal.ads.zzzp
        public final /* synthetic */ zzzi[] zzb(Uri uri, Map map) {
            return zzzo.zza(this, uri, map);
        }
    };
    private final zzags zzb = new zzags(null);
    private final zzef zzc = new zzef(2786);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzzi
    public final int zza(zzzj zzzjVar, zzaai zzaaiVar) throws IOException {
        int zza2 = zzzjVar.zza(this.zzc.zzH(), 0, 2786);
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
        zzef zzefVar = new zzef(10);
        int i = 0;
        while (true) {
            zzyyVar = (zzyy) zzzjVar;
            zzyyVar.zzm(zzefVar.zzH(), 0, 10, false);
            zzefVar.zzF(0);
            if (zzefVar.zzm() != 4801587) {
                break;
            }
            zzefVar.zzG(3);
            int zzj = zzefVar.zzj();
            i += zzj + 10;
            zzyyVar.zzl(zzj, false);
        }
        zzzjVar.zzj();
        zzyyVar.zzl(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            zzyyVar.zzm(zzefVar.zzH(), 0, 6, false);
            zzefVar.zzF(0);
            if (zzefVar.zzo() != 2935) {
                zzzjVar.zzj();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                zzyyVar.zzl(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int zzb = zzyj.zzb(zzefVar.zzH());
                if (zzb == -1) {
                    return false;
                }
                zzyyVar.zzl(zzb - 6, false);
            }
        }
    }
}
