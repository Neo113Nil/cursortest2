package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzamz implements zzant {
    private final zzamf zza;
    private final zzej zzb = new zzej(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzer zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzamz(zzamf zzamfVar) {
        this.zza = zzamfVar;
    }

    private final void zze(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zzf(zzek zzekVar, byte[] bArr, int i) {
        int min = Math.min(zzekVar.zzb(), i - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzekVar.zzL(min);
        } else {
            zzekVar.zzG(bArr, this.zzd, min);
        }
        int i2 = this.zzd + min;
        this.zzd = i2;
        return i2 == i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.google.android.gms.internal.ads.zzant
    public final void zza(zzek zzekVar, int i) throws zzbo {
        int i2;
        long j;
        int i3;
        zzdi.zzb(this.zze);
        int i4 = -1;
        int i5 = 2;
        ?? r6 = 0;
        int i6 = 1;
        if ((i & 1) != 0) {
            int i7 = this.zzc;
            if (i7 != 0 && i7 != 1) {
                if (i7 != 2) {
                    int i8 = this.zzj;
                    if (i8 != -1) {
                        zzea.zzf("PesReader", "Unexpected start indicator: expected " + i8 + " more bytes");
                    }
                    this.zza.zzc(zzekVar.zze() == 0);
                } else {
                    zzea.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i9 = i;
        while (zzekVar.zzb() > 0) {
            int i10 = this.zzc;
            if (i10 == 0) {
                zzekVar.zzL(zzekVar.zzb());
            } else if (i10 != i6) {
                if (i10 != i5) {
                    int zzb = zzekVar.zzb();
                    int i11 = this.zzj;
                    int i12 = i11 == i4 ? 0 : zzb - i11;
                    if (i12 > 0) {
                        zzb -= i12;
                        zzekVar.zzJ(zzekVar.zzd() + zzb);
                    }
                    this.zza.zza(zzekVar);
                    int i13 = this.zzj;
                    if (i13 != i4) {
                        int i14 = i13 - zzb;
                        this.zzj = i14;
                        if (i14 == 0) {
                            this.zza.zzc(r6);
                            zze(i6);
                        }
                    }
                } else {
                    if (zzf(zzekVar, this.zzb.zza, Math.min(10, this.zzi)) && zzf(zzekVar, null, this.zzi)) {
                        this.zzb.zzl(r6);
                        if (this.zzf) {
                            this.zzb.zzn(4);
                            long zzd = this.zzb.zzd(3);
                            this.zzb.zzn(i6);
                            int zzd2 = this.zzb.zzd(15) << 15;
                            this.zzb.zzn(i6);
                            long zzd3 = this.zzb.zzd(15);
                            this.zzb.zzn(i6);
                            if (this.zzh || !this.zzg) {
                                i3 = zzd2;
                            } else {
                                this.zzb.zzn(4);
                                this.zzb.zzn(i6);
                                int zzd4 = this.zzb.zzd(15) << 15;
                                this.zzb.zzn(i6);
                                long zzd5 = this.zzb.zzd(15);
                                this.zzb.zzn(i6);
                                i3 = zzd2;
                                this.zze.zzb((this.zzb.zzd(3) << 30) | zzd4 | zzd5);
                                this.zzh = true;
                            }
                            j = this.zze.zzb((zzd << 30) | i3 | zzd3);
                        } else {
                            j = -9223372036854775807L;
                        }
                        i9 |= true != this.zzk ? 0 : 4;
                        this.zza.zzd(j, i9);
                        zze(3);
                        i4 = -1;
                    }
                }
            } else if (zzf(zzekVar, this.zzb.zza, 9)) {
                this.zzb.zzl(0);
                int zzd6 = this.zzb.zzd(24);
                if (zzd6 != 1) {
                    zzea.zzf("PesReader", "Unexpected start code prefix: " + zzd6);
                    i4 = -1;
                    this.zzj = -1;
                    i2 = 0;
                } else {
                    this.zzb.zzn(8);
                    zzej zzejVar = this.zzb;
                    int zzd7 = zzejVar.zzd(16);
                    zzejVar.zzn(5);
                    this.zzk = this.zzb.zzp();
                    this.zzb.zzn(2);
                    this.zzf = this.zzb.zzp();
                    this.zzg = this.zzb.zzp();
                    this.zzb.zzn(6);
                    int zzd8 = this.zzb.zzd(8);
                    this.zzi = zzd8;
                    if (zzd7 == 0) {
                        this.zzj = -1;
                    } else {
                        int i15 = (zzd7 - 3) - zzd8;
                        this.zzj = i15;
                        if (i15 < 0) {
                            zzea.zzf("PesReader", "Found negative packet payload size: " + i15);
                            i4 = -1;
                            this.zzj = -1;
                            i2 = 2;
                        }
                    }
                    i4 = -1;
                    i2 = 2;
                }
                zze(i2);
            } else {
                i4 = -1;
            }
            i5 = 2;
            r6 = 0;
            i6 = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzant
    public final void zzb(zzer zzerVar, zzacn zzacnVar, zzans zzansVar) {
        this.zze = zzerVar;
        this.zza.zzb(zzacnVar, zzansVar);
    }

    @Override // com.google.android.gms.internal.ads.zzant
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }

    public final boolean zzd(boolean z) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
