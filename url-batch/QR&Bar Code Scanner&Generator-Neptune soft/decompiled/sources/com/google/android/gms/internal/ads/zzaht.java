package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaht implements zzaip {
    private final zzahc zza;
    private final zzee zzb = new zzee(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzel zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzaht(zzahc zzahcVar) {
        this.zza = zzahcVar;
    }

    private final void zzd(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zze(zzef zzefVar, byte[] bArr, int i) {
        int min = Math.min(zzefVar.zza(), i - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzefVar.zzG(min);
        } else {
            zzefVar.zzB(bArr, this.zzd, min);
        }
        int i2 = this.zzd + min;
        this.zzd = i2;
        return i2 == i;
    }

    @Override // com.google.android.gms.internal.ads.zzaip
    public final void zza(zzef zzefVar, int i) throws zzbu {
        int i2;
        long j;
        zzdd.zzb(this.zze);
        int i3 = -1;
        int i4 = 2;
        if ((i & 1) != 0) {
            int i5 = this.zzc;
            if (i5 != 0 && i5 != 1) {
                if (i5 != 2) {
                    int i6 = this.zzj;
                    if (i6 != -1) {
                        zzdw.zze("PesReader", "Unexpected start indicator: expected " + i6 + " more bytes");
                    }
                    this.zza.zzc();
                } else {
                    zzdw.zze("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        int i7 = i;
        while (zzefVar.zza() > 0) {
            int i8 = this.zzc;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != i4) {
                        int zza = zzefVar.zza();
                        int i9 = this.zzj;
                        int i10 = i9 != i3 ? zza - i9 : 0;
                        if (i10 > 0) {
                            zza -= i10;
                            zzefVar.zzE(zzefVar.zzc() + zza);
                        }
                        this.zza.zza(zzefVar);
                        int i11 = this.zzj;
                        if (i11 != i3) {
                            int i12 = i11 - zza;
                            this.zzj = i12;
                            if (i12 == 0) {
                                this.zza.zzc();
                                zzd(1);
                            }
                        }
                    } else {
                        if (zze(zzefVar, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzefVar, null, this.zzi)) {
                            this.zzb.zzh(0);
                            if (this.zzf) {
                                this.zzb.zzj(4);
                                int zzc = this.zzb.zzc(3);
                                this.zzb.zzj(1);
                                int zzc2 = this.zzb.zzc(15);
                                this.zzb.zzj(1);
                                long zzc3 = (zzc2 << 15) | (zzc << 30) | this.zzb.zzc(15);
                                this.zzb.zzj(1);
                                if (!this.zzh && this.zzg) {
                                    this.zzb.zzj(4);
                                    int zzc4 = this.zzb.zzc(3);
                                    this.zzb.zzj(1);
                                    int zzc5 = this.zzb.zzc(15);
                                    this.zzb.zzj(1);
                                    int zzc6 = this.zzb.zzc(15);
                                    this.zzb.zzj(1);
                                    this.zze.zzb((zzc4 << 30) | (zzc5 << 15) | zzc6);
                                    this.zzh = true;
                                }
                                j = this.zze.zzb(zzc3);
                            } else {
                                j = -9223372036854775807L;
                            }
                            i7 |= true != this.zzk ? 0 : 4;
                            this.zza.zzd(j, i7);
                            zzd(3);
                            i3 = -1;
                            i4 = 2;
                        }
                    }
                    i2 = i4;
                } else if (zze(zzefVar, this.zzb.zza, 9)) {
                    int i13 = 0;
                    this.zzb.zzh(0);
                    int zzc7 = this.zzb.zzc(24);
                    if (zzc7 != 1) {
                        zzdw.zze("PesReader", "Unexpected start code prefix: " + zzc7);
                        i3 = -1;
                        this.zzj = -1;
                        i2 = 2;
                    } else {
                        this.zzb.zzj(8);
                        int zzc8 = this.zzb.zzc(16);
                        this.zzb.zzj(5);
                        this.zzk = this.zzb.zzl();
                        i2 = 2;
                        this.zzb.zzj(2);
                        this.zzf = this.zzb.zzl();
                        this.zzg = this.zzb.zzl();
                        this.zzb.zzj(6);
                        int zzc9 = this.zzb.zzc(8);
                        this.zzi = zzc9;
                        if (zzc8 == 0) {
                            this.zzj = -1;
                            i3 = -1;
                        } else {
                            int i14 = (zzc8 - 3) - zzc9;
                            this.zzj = i14;
                            if (i14 < 0) {
                                zzdw.zze("PesReader", "Found negative packet payload size: " + i14);
                                i3 = -1;
                                this.zzj = -1;
                            } else {
                                i3 = -1;
                            }
                        }
                        i13 = 2;
                    }
                    zzd(i13);
                } else {
                    i3 = -1;
                    i2 = 2;
                }
            } else {
                i2 = i4;
                zzefVar.zzG(zzefVar.zza());
            }
            i4 = i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaip
    public final void zzb(zzel zzelVar, zzzl zzzlVar, zzaio zzaioVar) {
        this.zze = zzelVar;
        this.zza.zzb(zzzlVar, zzaioVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaip
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}
