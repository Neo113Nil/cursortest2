package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzagr implements zzahn {
    private final zzaga zza;
    private final zzdx zzb = new zzdx(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzee zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzagr(zzaga zzagaVar) {
        this.zza = zzagaVar;
    }

    private final void zzd(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zze(zzdy zzdyVar, byte[] bArr, int i) {
        int min = Math.min(zzdyVar.zza(), i - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzdyVar.zzG(min);
        } else {
            zzdyVar.zzB(bArr, this.zzd, min);
        }
        int i2 = this.zzd + min;
        this.zzd = i2;
        return i2 == i;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzdy zzdyVar, int i) throws zzbp {
        long j;
        zzcw.zzb(this.zze);
        int i2 = -1;
        int i3 = 2;
        if ((i & 1) != 0) {
            int i4 = this.zzc;
            if (i4 != 0 && i4 != 1) {
                if (i4 != 2) {
                    int i5 = this.zzj;
                    if (i5 != -1) {
                        Log.w("PesReader", "Unexpected start indicator: expected " + i5 + " more bytes");
                    }
                    this.zza.zzc();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        int i6 = i;
        while (zzdyVar.zza() > 0) {
            int i7 = this.zzc;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != i3) {
                        int zza = zzdyVar.zza();
                        int i8 = this.zzj;
                        int i9 = i8 != i2 ? zza - i8 : 0;
                        if (i9 > 0) {
                            zza -= i9;
                            zzdyVar.zzE(zzdyVar.zzc() + zza);
                        }
                        this.zza.zza(zzdyVar);
                        int i10 = this.zzj;
                        if (i10 != i2) {
                            int i11 = i10 - zza;
                            this.zzj = i11;
                            if (i11 == 0) {
                                this.zza.zzc();
                                zzd(1);
                            }
                        }
                    } else {
                        if (zze(zzdyVar, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzdyVar, null, this.zzi)) {
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
                            i6 |= true != this.zzk ? 0 : 4;
                            this.zza.zzd(j, i6);
                            zzd(3);
                            i2 = -1;
                        }
                    }
                } else if (zze(zzdyVar, this.zzb.zza, 9)) {
                    int i12 = 0;
                    this.zzb.zzh(0);
                    int zzc7 = this.zzb.zzc(24);
                    if (zzc7 != 1) {
                        Log.w("PesReader", "Unexpected start code prefix: " + zzc7);
                        i2 = -1;
                        this.zzj = -1;
                    } else {
                        this.zzb.zzj(8);
                        int zzc8 = this.zzb.zzc(16);
                        this.zzb.zzj(5);
                        this.zzk = this.zzb.zzl();
                        this.zzb.zzj(2);
                        this.zzf = this.zzb.zzl();
                        this.zzg = this.zzb.zzl();
                        this.zzb.zzj(6);
                        int zzc9 = this.zzb.zzc(8);
                        this.zzi = zzc9;
                        if (zzc8 == 0) {
                            this.zzj = -1;
                        } else {
                            int i13 = (zzc8 - 3) - zzc9;
                            this.zzj = i13;
                            if (i13 < 0) {
                                Log.w("PesReader", "Found negative packet payload size: " + i13);
                                i2 = -1;
                                this.zzj = -1;
                                i12 = 2;
                            }
                        }
                        i2 = -1;
                        i12 = 2;
                    }
                    zzd(i12);
                } else {
                    i2 = -1;
                }
            } else {
                zzdyVar.zzG(zzdyVar.zza());
            }
            i3 = 2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzee zzeeVar, zzyv zzyvVar, zzahm zzahmVar) {
        this.zze = zzeeVar;
        this.zza.zzb(zzyvVar, zzahmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}
