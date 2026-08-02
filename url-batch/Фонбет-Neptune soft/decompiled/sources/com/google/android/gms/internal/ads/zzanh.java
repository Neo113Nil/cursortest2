package com.google.android.gms.internal.ads;

import androidx.core.view.InputDeviceCompat;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzanh implements zzant {
    private final zzang zza;
    private final zzek zzb = new zzek(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzanh(zzang zzangVar) {
        this.zza = zzangVar;
    }

    @Override // com.google.android.gms.internal.ads.zzant
    public final void zza(zzek zzekVar, int i) {
        int i2 = i & 1;
        int zzd = i2 != 0 ? zzekVar.zzd() + zzekVar.zzm() : -1;
        if (this.zzf) {
            if (i2 == 0) {
                return;
            }
            this.zzf = false;
            zzekVar.zzK(zzd);
            this.zzd = 0;
        }
        while (zzekVar.zzb() > 0) {
            int i3 = this.zzd;
            if (i3 < 3) {
                if (i3 == 0) {
                    int zzm = zzekVar.zzm();
                    zzekVar.zzK(zzekVar.zzd() - 1);
                    if (zzm == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzekVar.zzb(), 3 - this.zzd);
                zzekVar.zzG(this.zzb.zzM(), this.zzd, min);
                int i4 = this.zzd + min;
                this.zzd = i4;
                if (i4 == 3) {
                    this.zzb.zzK(0);
                    this.zzb.zzJ(3);
                    this.zzb.zzL(1);
                    zzek zzekVar2 = this.zzb;
                    int zzm2 = zzekVar2.zzm();
                    boolean z = (zzm2 & 128) != 0;
                    int zzm3 = zzekVar2.zzm();
                    this.zze = z;
                    this.zzc = (zzm3 | ((zzm2 & 15) << 8)) + 3;
                    int zzc = this.zzb.zzc();
                    int i5 = this.zzc;
                    if (zzc < i5) {
                        int zzc2 = this.zzb.zzc();
                        this.zzb.zzE(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i5, zzc2 + zzc2)));
                    }
                }
            } else {
                int min2 = Math.min(zzekVar.zzb(), this.zzc - i3);
                zzekVar.zzG(this.zzb.zzM(), this.zzd, min2);
                int i6 = this.zzd + min2;
                this.zzd = i6;
                int i7 = this.zzc;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.zze) {
                        this.zzb.zzJ(i7);
                    } else {
                        if (zzet.zze(this.zzb.zzM(), 0, i7, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        this.zzb.zzJ(this.zzc - 4);
                    }
                    this.zzb.zzK(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzant
    public final void zzb(zzer zzerVar, zzacn zzacnVar, zzans zzansVar) {
        this.zza.zzb(zzerVar, zzacnVar, zzansVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzant
    public final void zzc() {
        this.zzf = true;
    }
}
