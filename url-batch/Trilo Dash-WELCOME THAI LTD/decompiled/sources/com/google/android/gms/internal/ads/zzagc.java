package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzagc implements zzaga {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzzz zzc;
    private final zzahp zzd;
    private final zzdy zze;
    private final zzagp zzf;
    private final boolean[] zzg;
    private final zzagb zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzagc() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ce  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzdy zzdyVar) {
        int i;
        zzagp zzagpVar;
        int i2;
        long j;
        long j2;
        int i3;
        float f;
        int i4;
        float f2;
        int i5;
        zzcw.zzb(this.zzc);
        int zzc = zzdyVar.zzc();
        int zzd = zzdyVar.zzd();
        byte[] zzH = zzdyVar.zzH();
        this.zzi += zzdyVar.zza();
        zzzx.zzb(this.zzc, zzdyVar, zzdyVar.zza());
        while (true) {
            int zza2 = zzzp.zza(zzH, zzc, zzd, this.zzg);
            if (zza2 == zzd) {
                break;
            }
            int i6 = zza2 + 3;
            int i7 = zzdyVar.zzH()[i6] & UByte.MAX_VALUE;
            int i8 = zza2 - zzc;
            if (!this.zzk) {
                if (i8 > 0) {
                    this.zzh.zza(zzH, zzc, zza2);
                }
                if (this.zzh.zzc(i7, i8 < 0 ? -i8 : 0)) {
                    zzagb zzagbVar = this.zzh;
                    String str = this.zzb;
                    Objects.requireNonNull(str);
                    byte[] copyOf = Arrays.copyOf(zzagbVar.zzc, zzagbVar.zza);
                    byte b = copyOf[4];
                    int i9 = copyOf[5] & UByte.MAX_VALUE;
                    int i10 = ((b & UByte.MAX_VALUE) << 4) | (i9 >> 4);
                    int i11 = ((i9 & 15) << 8) | (copyOf[6] & UByte.MAX_VALUE);
                    int i12 = (copyOf[7] & 240) >> 4;
                    if (i12 == 2) {
                        f = i11 * 4;
                        i4 = i10 * 3;
                    } else if (i12 == 3) {
                        f = i11 * 16;
                        i4 = i10 * 9;
                    } else if (i12 != 4) {
                        f2 = 1.0f;
                        zzab zzabVar = new zzab();
                        zzabVar.zzH(str);
                        zzabVar.zzS("video/mpeg2");
                        zzabVar.zzX(i10);
                        zzabVar.zzF(i11);
                        zzabVar.zzP(f2);
                        zzabVar.zzI(Collections.singletonList(copyOf));
                        zzad zzY = zzabVar.zzY();
                        i5 = (copyOf[7] & 15) - 1;
                        long j3 = 0;
                        if (i5 >= 0 || i5 >= 8) {
                            i = i6;
                        } else {
                            double d = zza[i5];
                            byte b2 = copyOf[zzagbVar.zzb + 9];
                            int i13 = (b2 & 96) >> 5;
                            int i14 = b2 & 31;
                            if (i13 != i14) {
                                double d2 = i13;
                                Double.isNaN(d2);
                                i = i6;
                                double d3 = i14 + 1;
                                Double.isNaN(d3);
                                d *= (d2 + 1.0d) / d3;
                            } else {
                                i = i6;
                            }
                            j3 = (long) (1000000.0d / d);
                        }
                        Pair create = Pair.create(zzY, Long.valueOf(j3));
                        this.zzc.zzk((zzad) create.first);
                        this.zzl = ((Long) create.second).longValue();
                        this.zzk = true;
                        zzagpVar = this.zzf;
                        if (zzagpVar != null) {
                            if (i8 > 0) {
                                zzagpVar.zza(zzH, zzc, zza2);
                                i3 = 0;
                            } else {
                                i3 = -i8;
                            }
                            if (this.zzf.zzd(i3)) {
                                zzagp zzagpVar2 = this.zzf;
                                int zzb = zzzp.zzb(zzagpVar2.zza, zzagpVar2.zzb);
                                zzdy zzdyVar2 = this.zze;
                                int i15 = zzeg.zza;
                                zzdyVar2.zzD(this.zzf.zza, zzb);
                                this.zzd.zza(this.zzo, this.zze);
                            }
                            if (i7 == 178) {
                                if (zzdyVar.zzH()[zza2 + 2] == 1) {
                                    this.zzf.zzc(178);
                                }
                                i7 = 178;
                            }
                        }
                        if (i7 != 0 || i7 == 179) {
                            i2 = zzd - zza2;
                            if (this.zzq && this.zzk) {
                                j2 = this.zzo;
                                if (j2 != -9223372036854775807L) {
                                    this.zzc.zzs(j2, this.zzp ? 1 : 0, ((int) (this.zzi - this.zzn)) - i2, i2, null);
                                }
                            }
                            if (this.zzj || this.zzq) {
                                this.zzn = this.zzi - i2;
                                j = this.zzm;
                                if (j == -9223372036854775807L) {
                                    long j4 = this.zzo;
                                    j = j4 != -9223372036854775807L ? j4 + this.zzl : -9223372036854775807L;
                                }
                                this.zzo = j;
                                this.zzp = false;
                                this.zzm = -9223372036854775807L;
                                this.zzj = true;
                            }
                            this.zzq = i7 == 0;
                        } else if (i7 == 184) {
                            this.zzp = true;
                        }
                        zzc = i;
                    } else {
                        f = i11 * 121;
                        i4 = i10 * 100;
                    }
                    f2 = f / i4;
                    zzab zzabVar2 = new zzab();
                    zzabVar2.zzH(str);
                    zzabVar2.zzS("video/mpeg2");
                    zzabVar2.zzX(i10);
                    zzabVar2.zzF(i11);
                    zzabVar2.zzP(f2);
                    zzabVar2.zzI(Collections.singletonList(copyOf));
                    zzad zzY2 = zzabVar2.zzY();
                    i5 = (copyOf[7] & 15) - 1;
                    long j32 = 0;
                    if (i5 >= 0) {
                    }
                    i = i6;
                    Pair create2 = Pair.create(zzY2, Long.valueOf(j32));
                    this.zzc.zzk((zzad) create2.first);
                    this.zzl = ((Long) create2.second).longValue();
                    this.zzk = true;
                    zzagpVar = this.zzf;
                    if (zzagpVar != null) {
                    }
                    if (i7 != 0) {
                    }
                    i2 = zzd - zza2;
                    if (this.zzq) {
                        j2 = this.zzo;
                        if (j2 != -9223372036854775807L) {
                        }
                    }
                    if (this.zzj) {
                    }
                    this.zzn = this.zzi - i2;
                    j = this.zzm;
                    if (j == -9223372036854775807L) {
                    }
                    this.zzo = j;
                    this.zzp = false;
                    this.zzm = -9223372036854775807L;
                    this.zzj = true;
                    this.zzq = i7 == 0;
                    zzc = i;
                }
            }
            i = i6;
            zzagpVar = this.zzf;
            if (zzagpVar != null) {
            }
            if (i7 != 0) {
            }
            i2 = zzd - zza2;
            if (this.zzq) {
            }
            if (this.zzj) {
            }
            this.zzn = this.zzi - i2;
            j = this.zzm;
            if (j == -9223372036854775807L) {
            }
            this.zzo = j;
            this.zzp = false;
            this.zzm = -9223372036854775807L;
            this.zzj = true;
            this.zzq = i7 == 0;
            zzc = i;
        }
        if (!this.zzk) {
            this.zzh.zza(zzH, zzc, zzd);
        }
        zzagp zzagpVar3 = this.zzf;
        if (zzagpVar3 != null) {
            zzagpVar3.zza(zzH, zzc, zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyv zzyvVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzb = zzahmVar.zzb();
        this.zzc = zzyvVar.zzv(zzahmVar.zza(), 2);
        zzahp zzahpVar = this.zzd;
        if (zzahpVar != null) {
            zzahpVar.zzb(zzyvVar, zzahmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        zzzp.zze(this.zzg);
        this.zzh.zzb();
        zzagp zzagpVar = this.zzf;
        if (zzagpVar != null) {
            zzagpVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    zzagc(zzahp zzahpVar) {
        zzdy zzdyVar;
        this.zzd = zzahpVar;
        this.zzg = new boolean[4];
        this.zzh = new zzagb(128);
        if (zzahpVar != null) {
            this.zzf = new zzagp(178, 128);
            zzdyVar = new zzdy();
        } else {
            zzdyVar = null;
            this.zzf = null;
        }
        this.zze = zzdyVar;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }
}
