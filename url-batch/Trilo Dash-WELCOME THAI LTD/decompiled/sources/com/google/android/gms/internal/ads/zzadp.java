package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzadp implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzadn
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzadp.zza;
            return new zzys[]{new zzadp(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private static final zzabz zzb = new zzabz() { // from class: com.google.android.gms.internal.ads.zzado
    };
    private final zzdy zzc;
    private final zzzl zzd;
    private final zzzh zze;
    private final zzzj zzf;
    private final zzzz zzg;
    private zzyv zzh;
    private zzzz zzi;
    private zzzz zzj;
    private int zzk;
    private zzbl zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzadr zzq;
    private boolean zzr;

    public zzadp() {
        this(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f1  */
    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzf(zzyt zzytVar) throws IOException {
        int i;
        int i2;
        zzadt zza2;
        zzadr zzh;
        int i3;
        int i4;
        zzbl zzblVar;
        zzadm zzadmVar;
        long j;
        if (this.zzk == 0) {
            try {
                zzk(zzytVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzq == null) {
            zzdy zzdyVar = new zzdy(this.zzd.zzc);
            zzym zzymVar = (zzym) zzytVar;
            zzymVar.zzm(zzdyVar.zzH(), 0, this.zzd.zzc, false);
            zzzl zzzlVar = this.zzd;
            if ((zzzlVar.zza & 1) != 0) {
                if (zzzlVar.zze != 1) {
                    i = 36;
                    if (zzdyVar.zzd() >= i + 4) {
                        zzdyVar.zzF(i);
                        int zze = zzdyVar.zze();
                        if (zze == 1483304551) {
                            i2 = zze;
                        } else if (zze == 1231971951) {
                            i2 = 1231971951;
                        }
                        if (i2 != 1483304551 || i2 == 1231971951) {
                            int i5 = i2;
                            zza2 = zzadt.zza(zzytVar.zzd(), zzytVar.zzf(), this.zzd, zzdyVar);
                            if (zza2 != null && !this.zze.zza()) {
                                zzytVar.zzj();
                                zzymVar.zzl(i + 141, false);
                                zzymVar.zzm(this.zzc.zzH(), 0, 3, false);
                                this.zzc.zzF(0);
                                zzzh zzzhVar = this.zze;
                                int zzm = this.zzc.zzm();
                                i3 = zzm >> 12;
                                i4 = zzm & 4095;
                                if (i3 <= 0 || i4 > 0) {
                                    zzzhVar.zza = i3;
                                    zzzhVar.zzb = i4;
                                }
                            }
                            zzymVar.zzo(this.zzd.zzc, false);
                            zzh = (zza2 == null && !zza2.zzh() && i5 == 1231971951) ? zzh(zzytVar, false) : zza2;
                        } else if (i2 == 1447187017) {
                            zzh = zzads.zza(zzytVar.zzd(), zzytVar.zzf(), this.zzd, zzdyVar);
                            zzymVar.zzo(this.zzd.zzc, false);
                        } else {
                            zzytVar.zzj();
                            zzh = null;
                        }
                        zzblVar = this.zzl;
                        long zzf = zzytVar.zzf();
                        if (zzblVar != null) {
                            int zza3 = zzblVar.zza();
                            for (int i6 = 0; i6 < zza3; i6++) {
                                zzbk zzb2 = zzblVar.zzb(i6);
                                if (zzb2 instanceof zzacg) {
                                    zzacg zzacgVar = (zzacg) zzb2;
                                    int zza4 = zzblVar.zza();
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= zza4) {
                                            j = -9223372036854775807L;
                                            break;
                                        }
                                        zzbk zzb3 = zzblVar.zzb(i7);
                                        if (zzb3 instanceof zzack) {
                                            zzack zzackVar = (zzack) zzb3;
                                            if (zzackVar.zzf.equals("TLEN")) {
                                                j = zzeg.zzv(Long.parseLong(zzackVar.zzb));
                                                break;
                                            }
                                        }
                                        i7++;
                                    }
                                    zzadmVar = zzadm.zza(zzf, zzacgVar, j);
                                    if (this.zzr) {
                                        zzh = new zzadq();
                                    } else {
                                        if (zzadmVar != null) {
                                            zzh = zzadmVar;
                                        } else if (zzh == null) {
                                            zzh = null;
                                        }
                                        if (zzh != null) {
                                            zzh.zzh();
                                        } else {
                                            zzh = zzh(zzytVar, false);
                                        }
                                    }
                                    this.zzq = zzh;
                                    this.zzh.zzL(zzh);
                                    zzzz zzzzVar = this.zzj;
                                    zzab zzabVar = new zzab();
                                    zzabVar.zzS(this.zzd.zzb);
                                    zzabVar.zzL(4096);
                                    zzabVar.zzw(this.zzd.zze);
                                    zzabVar.zzT(this.zzd.zzd);
                                    zzabVar.zzC(this.zze.zza);
                                    zzabVar.zzD(this.zze.zzb);
                                    zzabVar.zzM(this.zzl);
                                    zzzzVar.zzk(zzabVar.zzY());
                                    this.zzo = zzytVar.zzf();
                                }
                            }
                        }
                        zzadmVar = null;
                        if (this.zzr) {
                        }
                        this.zzq = zzh;
                        this.zzh.zzL(zzh);
                        zzzz zzzzVar2 = this.zzj;
                        zzab zzabVar2 = new zzab();
                        zzabVar2.zzS(this.zzd.zzb);
                        zzabVar2.zzL(4096);
                        zzabVar2.zzw(this.zzd.zze);
                        zzabVar2.zzT(this.zzd.zzd);
                        zzabVar2.zzC(this.zze.zza);
                        zzabVar2.zzD(this.zze.zzb);
                        zzabVar2.zzM(this.zzl);
                        zzzzVar2.zzk(zzabVar2.zzY());
                        this.zzo = zzytVar.zzf();
                    }
                    if (zzdyVar.zzd() >= 40) {
                        zzdyVar.zzF(36);
                        if (zzdyVar.zze() == 1447187017) {
                            i2 = 1447187017;
                            if (i2 != 1483304551) {
                            }
                            int i52 = i2;
                            zza2 = zzadt.zza(zzytVar.zzd(), zzytVar.zzf(), this.zzd, zzdyVar);
                            if (zza2 != null) {
                                zzytVar.zzj();
                                zzymVar.zzl(i + 141, false);
                                zzymVar.zzm(this.zzc.zzH(), 0, 3, false);
                                this.zzc.zzF(0);
                                zzzh zzzhVar2 = this.zze;
                                int zzm2 = this.zzc.zzm();
                                i3 = zzm2 >> 12;
                                i4 = zzm2 & 4095;
                                if (i3 <= 0) {
                                }
                                zzzhVar2.zza = i3;
                                zzzhVar2.zzb = i4;
                            }
                            zzymVar.zzo(this.zzd.zzc, false);
                            if (zza2 == null) {
                            }
                            zzblVar = this.zzl;
                            long zzf2 = zzytVar.zzf();
                            if (zzblVar != null) {
                            }
                            zzadmVar = null;
                            if (this.zzr) {
                            }
                            this.zzq = zzh;
                            this.zzh.zzL(zzh);
                            zzzz zzzzVar22 = this.zzj;
                            zzab zzabVar22 = new zzab();
                            zzabVar22.zzS(this.zzd.zzb);
                            zzabVar22.zzL(4096);
                            zzabVar22.zzw(this.zzd.zze);
                            zzabVar22.zzT(this.zzd.zzd);
                            zzabVar22.zzC(this.zze.zza);
                            zzabVar22.zzD(this.zze.zzb);
                            zzabVar22.zzM(this.zzl);
                            zzzzVar22.zzk(zzabVar22.zzY());
                            this.zzo = zzytVar.zzf();
                        }
                    }
                    i2 = 0;
                    if (i2 != 1483304551) {
                    }
                    int i522 = i2;
                    zza2 = zzadt.zza(zzytVar.zzd(), zzytVar.zzf(), this.zzd, zzdyVar);
                    if (zza2 != null) {
                    }
                    zzymVar.zzo(this.zzd.zzc, false);
                    if (zza2 == null) {
                    }
                    zzblVar = this.zzl;
                    long zzf22 = zzytVar.zzf();
                    if (zzblVar != null) {
                    }
                    zzadmVar = null;
                    if (this.zzr) {
                    }
                    this.zzq = zzh;
                    this.zzh.zzL(zzh);
                    zzzz zzzzVar222 = this.zzj;
                    zzab zzabVar222 = new zzab();
                    zzabVar222.zzS(this.zzd.zzb);
                    zzabVar222.zzL(4096);
                    zzabVar222.zzw(this.zzd.zze);
                    zzabVar222.zzT(this.zzd.zzd);
                    zzabVar222.zzC(this.zze.zza);
                    zzabVar222.zzD(this.zze.zzb);
                    zzabVar222.zzM(this.zzl);
                    zzzzVar222.zzk(zzabVar222.zzY());
                    this.zzo = zzytVar.zzf();
                }
                i = 21;
                if (zzdyVar.zzd() >= i + 4) {
                }
                if (zzdyVar.zzd() >= 40) {
                }
                i2 = 0;
                if (i2 != 1483304551) {
                }
                int i5222 = i2;
                zza2 = zzadt.zza(zzytVar.zzd(), zzytVar.zzf(), this.zzd, zzdyVar);
                if (zza2 != null) {
                }
                zzymVar.zzo(this.zzd.zzc, false);
                if (zza2 == null) {
                }
                zzblVar = this.zzl;
                long zzf222 = zzytVar.zzf();
                if (zzblVar != null) {
                }
                zzadmVar = null;
                if (this.zzr) {
                }
                this.zzq = zzh;
                this.zzh.zzL(zzh);
                zzzz zzzzVar2222 = this.zzj;
                zzab zzabVar2222 = new zzab();
                zzabVar2222.zzS(this.zzd.zzb);
                zzabVar2222.zzL(4096);
                zzabVar2222.zzw(this.zzd.zze);
                zzabVar2222.zzT(this.zzd.zzd);
                zzabVar2222.zzC(this.zze.zza);
                zzabVar2222.zzD(this.zze.zzb);
                zzabVar2222.zzM(this.zzl);
                zzzzVar2222.zzk(zzabVar2222.zzY());
                this.zzo = zzytVar.zzf();
            } else {
                if (zzzlVar.zze == 1) {
                    i = 13;
                    if (zzdyVar.zzd() >= i + 4) {
                    }
                    if (zzdyVar.zzd() >= 40) {
                    }
                    i2 = 0;
                    if (i2 != 1483304551) {
                    }
                    int i52222 = i2;
                    zza2 = zzadt.zza(zzytVar.zzd(), zzytVar.zzf(), this.zzd, zzdyVar);
                    if (zza2 != null) {
                    }
                    zzymVar.zzo(this.zzd.zzc, false);
                    if (zza2 == null) {
                    }
                    zzblVar = this.zzl;
                    long zzf2222 = zzytVar.zzf();
                    if (zzblVar != null) {
                    }
                    zzadmVar = null;
                    if (this.zzr) {
                    }
                    this.zzq = zzh;
                    this.zzh.zzL(zzh);
                    zzzz zzzzVar22222 = this.zzj;
                    zzab zzabVar22222 = new zzab();
                    zzabVar22222.zzS(this.zzd.zzb);
                    zzabVar22222.zzL(4096);
                    zzabVar22222.zzw(this.zzd.zze);
                    zzabVar22222.zzT(this.zzd.zzd);
                    zzabVar22222.zzC(this.zze.zza);
                    zzabVar22222.zzD(this.zze.zzb);
                    zzabVar22222.zzM(this.zzl);
                    zzzzVar22222.zzk(zzabVar22222.zzY());
                    this.zzo = zzytVar.zzf();
                }
                i = 21;
                if (zzdyVar.zzd() >= i + 4) {
                }
                if (zzdyVar.zzd() >= 40) {
                }
                i2 = 0;
                if (i2 != 1483304551) {
                }
                int i522222 = i2;
                zza2 = zzadt.zza(zzytVar.zzd(), zzytVar.zzf(), this.zzd, zzdyVar);
                if (zza2 != null) {
                }
                zzymVar.zzo(this.zzd.zzc, false);
                if (zza2 == null) {
                }
                zzblVar = this.zzl;
                long zzf22222 = zzytVar.zzf();
                if (zzblVar != null) {
                }
                zzadmVar = null;
                if (this.zzr) {
                }
                this.zzq = zzh;
                this.zzh.zzL(zzh);
                zzzz zzzzVar222222 = this.zzj;
                zzab zzabVar222222 = new zzab();
                zzabVar222222.zzS(this.zzd.zzb);
                zzabVar222222.zzL(4096);
                zzabVar222222.zzw(this.zzd.zze);
                zzabVar222222.zzT(this.zzd.zzd);
                zzabVar222222.zzC(this.zze.zza);
                zzabVar222222.zzD(this.zze.zzb);
                zzabVar222222.zzM(this.zzl);
                zzzzVar222222.zzk(zzabVar222222.zzY());
                this.zzo = zzytVar.zzf();
            }
        } else {
            long j2 = this.zzo;
            if (j2 != 0) {
                long zzf3 = zzytVar.zzf();
                if (zzf3 < j2) {
                    ((zzym) zzytVar).zzo((int) (j2 - zzf3), false);
                }
            }
        }
        int i8 = this.zzp;
        if (i8 == 0) {
            zzytVar.zzj();
            if (zzj(zzytVar)) {
                return -1;
            }
            this.zzc.zzF(0);
            int zze2 = this.zzc.zze();
            if (!zzi(zze2, this.zzk) || zzzm.zzb(zze2) == -1) {
                ((zzym) zzytVar).zzo(1, false);
                this.zzk = 0;
                return 0;
            }
            this.zzd.zza(zze2);
            if (this.zzm == -9223372036854775807L) {
                this.zzm = this.zzq.zzc(zzytVar.zzf());
            }
            int i9 = this.zzd.zzc;
            this.zzp = i9;
            zzadr zzadrVar = this.zzq;
            if (zzadrVar instanceof zzadl) {
                zzg(this.zzn + r2.zzg);
                throw null;
            }
            i8 = i9;
        }
        int zze3 = this.zzj.zze(zzytVar, i8, true);
        if (zze3 == -1) {
            return -1;
        }
        int i10 = this.zzp - zze3;
        this.zzp = i10;
        if (i10 <= 0) {
            this.zzj.zzs(zzg(this.zzn), 1, this.zzd.zzc, 0, null);
            this.zzn += this.zzd.zzg;
            this.zzp = 0;
            return 0;
        }
        return 0;
    }

    private final long zzg(long j) {
        return this.zzm + ((j * 1000000) / this.zzd.zzd);
    }

    private final zzadr zzh(zzyt zzytVar, boolean z) throws IOException {
        ((zzym) zzytVar).zzm(this.zzc.zzH(), 0, 4, false);
        this.zzc.zzF(0);
        this.zzd.zza(this.zzc.zze());
        return new zzadk(zzytVar.zzd(), zzytVar.zzf(), this.zzd, false);
    }

    private static boolean zzi(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean zzj(zzyt zzytVar) throws IOException {
        zzadr zzadrVar = this.zzq;
        if (zzadrVar != null) {
            long zzb2 = zzadrVar.zzb();
            if (zzb2 != -1 && zzytVar.zze() > zzb2 - 4) {
                return true;
            }
        }
        try {
            return !zzytVar.zzm(this.zzc.zzH(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzk(zzyt zzytVar, boolean z) throws IOException {
        int i;
        int i2;
        int zzb2;
        int i3 = true != z ? 131072 : 32768;
        zzytVar.zzj();
        if (zzytVar.zzf() == 0) {
            zzbl zza2 = this.zzf.zza(zzytVar, null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zzb(zza2);
            }
            i2 = (int) zzytVar.zze();
            if (!z) {
                ((zzym) zzytVar).zzo(i2, false);
            }
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!zzj(zzytVar)) {
                this.zzc.zzF(0);
                int zze = this.zzc.zze();
                if ((i == 0 || zzi(zze, i)) && (zzb2 = zzzm.zzb(zze)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(zze);
                        i = zze;
                    }
                    ((zzym) zzytVar).zzl(zzb2 - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        throw zzbp.zza("Searched too many bytes.", null);
                    }
                    if (z) {
                        zzytVar.zzj();
                        ((zzym) zzytVar).zzl(i2 + i6, false);
                    } else {
                        ((zzym) zzytVar).zzo(1, false);
                    }
                    i5 = i6;
                    i = 0;
                    i4 = 0;
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((zzym) zzytVar).zzo(i2 + i5, false);
        } else {
            zzytVar.zzj();
        }
        this.zzk = i;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final int zza(zzyt zzytVar, zzzs zzzsVar) throws IOException {
        zzcw.zzb(this.zzi);
        int i = zzeg.zza;
        int zzf = zzf(zzytVar);
        if (zzf == -1 && (this.zzq instanceof zzadl)) {
            if (this.zzq.zze() != zzg(this.zzn)) {
                throw null;
            }
        }
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzh = zzyvVar;
        zzzz zzv = zzyvVar.zzv(0, 1);
        this.zzi = zzv;
        this.zzj = zzv;
        this.zzh.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j, long j2) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzadr zzadrVar = this.zzq;
        if (zzadrVar instanceof zzadl) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) throws IOException {
        return zzk(zzytVar, true);
    }

    public final void zze() {
        this.zzr = true;
    }

    public zzadp(int i) {
        this.zzc = new zzdy(10);
        this.zzd = new zzzl();
        this.zze = new zzzh();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzzj();
        zzyr zzyrVar = new zzyr();
        this.zzg = zzyrVar;
        this.zzj = zzyrVar;
    }
}
