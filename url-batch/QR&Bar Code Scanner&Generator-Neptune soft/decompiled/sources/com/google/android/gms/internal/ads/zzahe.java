package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzahe implements zzahc {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzaap zzc;
    private final zzair zzd;
    private final zzef zze;
    private final zzahr zzf;
    private final boolean[] zzg;
    private final zzahd zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzahe() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c6  */
    @Override // com.google.android.gms.internal.ads.zzahc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzef zzefVar) {
        int i;
        zzahr zzahrVar;
        int i2;
        long j;
        boolean z;
        boolean z2;
        long j2;
        int i3;
        float f;
        int i4;
        float f2;
        int i5;
        zzdd.zzb(this.zzc);
        int zzc = zzefVar.zzc();
        int zzd = zzefVar.zzd();
        byte[] zzH = zzefVar.zzH();
        this.zzi += zzefVar.zza();
        this.zzc.zzq(zzefVar, zzefVar.zza());
        while (true) {
            int zza2 = zzaaf.zza(zzH, zzc, zzd, this.zzg);
            if (zza2 == zzd) {
                break;
            }
            int i6 = zza2 + 3;
            int i7 = zzefVar.zzH()[i6] & UByte.MAX_VALUE;
            int i8 = zza2 - zzc;
            if (!this.zzk) {
                if (i8 > 0) {
                    this.zzh.zza(zzH, zzc, zza2);
                }
                if (this.zzh.zzc(i7, i8 < 0 ? -i8 : 0)) {
                    zzahd zzahdVar = this.zzh;
                    String str = this.zzb;
                    Objects.requireNonNull(str);
                    byte[] copyOf = Arrays.copyOf(zzahdVar.zzc, zzahdVar.zza);
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
                        zzad zzadVar = new zzad();
                        zzadVar.zzH(str);
                        zzadVar.zzS("video/mpeg2");
                        zzadVar.zzX(i10);
                        zzadVar.zzF(i11);
                        zzadVar.zzP(f2);
                        zzadVar.zzI(Collections.singletonList(copyOf));
                        zzaf zzY = zzadVar.zzY();
                        i5 = (copyOf[7] & 15) - 1;
                        long j3 = 0;
                        if (i5 >= 0 || i5 >= 8) {
                            i = i6;
                        } else {
                            double d = zza[i5];
                            byte b2 = copyOf[zzahdVar.zzb + 9];
                            int i13 = (b2 & 96) >> 5;
                            if (i13 != (b2 & 31)) {
                                i = i6;
                                d *= (i13 + 1.0d) / (r9 + 1);
                            } else {
                                i = i6;
                            }
                            j3 = (long) (1000000.0d / d);
                        }
                        Pair create = Pair.create(zzY, Long.valueOf(j3));
                        this.zzc.zzk((zzaf) create.first);
                        this.zzl = ((Long) create.second).longValue();
                        this.zzk = true;
                        zzahrVar = this.zzf;
                        if (zzahrVar != null) {
                            if (i8 > 0) {
                                zzahrVar.zza(zzH, zzc, zza2);
                                i3 = 0;
                            } else {
                                i3 = -i8;
                            }
                            if (this.zzf.zzd(i3)) {
                                zzahr zzahrVar2 = this.zzf;
                                int zzb = zzaaf.zzb(zzahrVar2.zza, zzahrVar2.zzb);
                                zzef zzefVar2 = this.zze;
                                int i14 = zzen.zza;
                                zzefVar2.zzD(this.zzf.zza, zzb);
                                this.zzd.zza(this.zzo, this.zze);
                            }
                            if (i7 == 178) {
                                if (zzefVar.zzH()[zza2 + 2] == 1) {
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
                                z = false;
                                this.zzp = false;
                                this.zzm = -9223372036854775807L;
                                z2 = true;
                                this.zzj = true;
                            } else {
                                z = false;
                                z2 = true;
                            }
                            this.zzq = i7 == 0 ? z2 : z;
                        } else if (i7 == 184) {
                            this.zzp = true;
                        }
                        zzc = i;
                    } else {
                        f = i11 * 121;
                        i4 = i10 * 100;
                    }
                    f2 = f / i4;
                    zzad zzadVar2 = new zzad();
                    zzadVar2.zzH(str);
                    zzadVar2.zzS("video/mpeg2");
                    zzadVar2.zzX(i10);
                    zzadVar2.zzF(i11);
                    zzadVar2.zzP(f2);
                    zzadVar2.zzI(Collections.singletonList(copyOf));
                    zzaf zzY2 = zzadVar2.zzY();
                    i5 = (copyOf[7] & 15) - 1;
                    long j32 = 0;
                    if (i5 >= 0) {
                    }
                    i = i6;
                    Pair create2 = Pair.create(zzY2, Long.valueOf(j32));
                    this.zzc.zzk((zzaf) create2.first);
                    this.zzl = ((Long) create2.second).longValue();
                    this.zzk = true;
                    zzahrVar = this.zzf;
                    if (zzahrVar != null) {
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
                    z = false;
                    this.zzp = false;
                    this.zzm = -9223372036854775807L;
                    z2 = true;
                    this.zzj = true;
                    this.zzq = i7 == 0 ? z2 : z;
                    zzc = i;
                }
            }
            i = i6;
            zzahrVar = this.zzf;
            if (zzahrVar != null) {
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
            z = false;
            this.zzp = false;
            this.zzm = -9223372036854775807L;
            z2 = true;
            this.zzj = true;
            this.zzq = i7 == 0 ? z2 : z;
            zzc = i;
        }
        if (!this.zzk) {
            this.zzh.zza(zzH, zzc, zzd);
        }
        zzahr zzahrVar3 = this.zzf;
        if (zzahrVar3 != null) {
            zzahrVar3.zza(zzH, zzc, zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzb(zzzl zzzlVar, zzaio zzaioVar) {
        zzaioVar.zzc();
        this.zzb = zzaioVar.zzb();
        this.zzc = zzzlVar.zzv(zzaioVar.zza(), 2);
        zzair zzairVar = this.zzd;
        if (zzairVar != null) {
            zzairVar.zzb(zzzlVar, zzaioVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zze() {
        zzaaf.zze(this.zzg);
        this.zzh.zzb();
        zzahr zzahrVar = this.zzf;
        if (zzahrVar != null) {
            zzahrVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    zzahe(zzair zzairVar) {
        zzef zzefVar;
        this.zzd = zzairVar;
        this.zzg = new boolean[4];
        this.zzh = new zzahd(128);
        if (zzairVar != null) {
            this.zzf = new zzahr(178, 128);
            zzefVar = new zzef();
        } else {
            zzefVar = null;
            this.zzf = null;
        }
        this.zze = zzefVar;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }
}
