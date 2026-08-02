package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaeq implements zzzi {
    public static final zzzp zza = new zzzp() { // from class: com.google.android.gms.internal.ads.zzaeo
        @Override // com.google.android.gms.internal.ads.zzzp
        public final zzzi[] zza() {
            zzzp zzzpVar = zzaeq.zza;
            return new zzzi[]{new zzaeq(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzzp
        public final /* synthetic */ zzzi[] zzb(Uri uri, Map map) {
            return zzzo.zza(this, uri, map);
        }
    };
    private static final zzada zzb = new zzada() { // from class: com.google.android.gms.internal.ads.zzaep
    };
    private final zzef zzc;
    private final zzaab zzd;
    private final zzzx zze;
    private final zzzz zzf;
    private final zzaap zzg;
    private zzzl zzh;
    private zzaap zzi;
    private zzaap zzj;
    private int zzk;
    private zzbq zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzaes zzq;
    private boolean zzr;

    public zzaeq() {
        this(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e9  */
    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzf(zzzj zzzjVar) throws IOException {
        int i;
        int i2;
        zzaeu zza2;
        zzaes zzh;
        int i3;
        int i4;
        zzbq zzbqVar;
        zzaen zzaenVar;
        long j;
        if (this.zzk == 0) {
            try {
                zzk(zzzjVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzq == null) {
            zzef zzefVar = new zzef(this.zzd.zzc);
            zzyy zzyyVar = (zzyy) zzzjVar;
            zzyyVar.zzm(zzefVar.zzH(), 0, this.zzd.zzc, false);
            zzaab zzaabVar = this.zzd;
            int i5 = 21;
            if ((zzaabVar.zza & 1) != 0) {
                if (zzaabVar.zze != 1) {
                    i = 36;
                    if (zzefVar.zzd() >= i + 4) {
                        zzefVar.zzF(i);
                        int zze = zzefVar.zze();
                        if (zze == 1483304551) {
                            i2 = zze;
                        } else if (zze == 1231971951) {
                            i2 = 1231971951;
                        }
                        if (i2 != 1483304551 || i2 == 1231971951) {
                            int i6 = i2;
                            zza2 = zzaeu.zza(zzzjVar.zzd(), zzzjVar.zzf(), this.zzd, zzefVar);
                            if (zza2 != null && !this.zze.zza()) {
                                zzzjVar.zzj();
                                zzyyVar.zzl(i + 141, false);
                                zzyyVar.zzm(this.zzc.zzH(), 0, 3, false);
                                this.zzc.zzF(0);
                                zzzx zzzxVar = this.zze;
                                int zzm = this.zzc.zzm();
                                i3 = zzm >> 12;
                                i4 = zzm & 4095;
                                if (i3 <= 0 || i4 > 0) {
                                    zzzxVar.zza = i3;
                                    zzzxVar.zzb = i4;
                                }
                            }
                            zzyyVar.zzo(this.zzd.zzc, false);
                            zzh = (zza2 == null && !zza2.zzh() && i6 == 1231971951) ? zzh(zzzjVar, false) : zza2;
                        } else if (i2 == 1447187017) {
                            zzh = zzaet.zza(zzzjVar.zzd(), zzzjVar.zzf(), this.zzd, zzefVar);
                            zzyyVar.zzo(this.zzd.zzc, false);
                        } else {
                            zzzjVar.zzj();
                            zzh = null;
                        }
                        zzbqVar = this.zzl;
                        long zzf = zzzjVar.zzf();
                        if (zzbqVar != null) {
                            int zza3 = zzbqVar.zza();
                            for (int i7 = 0; i7 < zza3; i7++) {
                                zzbp zzb2 = zzbqVar.zzb(i7);
                                if (zzb2 instanceof zzadh) {
                                    zzadh zzadhVar = (zzadh) zzb2;
                                    int zza4 = zzbqVar.zza();
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 >= zza4) {
                                            j = -9223372036854775807L;
                                            break;
                                        }
                                        zzbp zzb3 = zzbqVar.zzb(i8);
                                        if (zzb3 instanceof zzadl) {
                                            zzadl zzadlVar = (zzadl) zzb3;
                                            if (zzadlVar.zzf.equals("TLEN")) {
                                                j = zzen.zzv(Long.parseLong(zzadlVar.zzb));
                                                break;
                                            }
                                        }
                                        i8++;
                                    }
                                    zzaenVar = zzaen.zza(zzf, zzadhVar, j);
                                    if (this.zzr) {
                                        zzh = new zzaer();
                                    } else {
                                        if (zzaenVar != null) {
                                            zzh = zzaenVar;
                                        } else if (zzh == null) {
                                            zzh = null;
                                        }
                                        if (zzh != null) {
                                            zzh.zzh();
                                        } else {
                                            zzh = zzh(zzzjVar, false);
                                        }
                                    }
                                    this.zzq = zzh;
                                    this.zzh.zzN(zzh);
                                    zzaap zzaapVar = this.zzj;
                                    zzad zzadVar = new zzad();
                                    zzadVar.zzS(this.zzd.zzb);
                                    zzadVar.zzL(4096);
                                    zzadVar.zzw(this.zzd.zze);
                                    zzadVar.zzT(this.zzd.zzd);
                                    zzadVar.zzC(this.zze.zza);
                                    zzadVar.zzD(this.zze.zzb);
                                    zzadVar.zzM(this.zzl);
                                    zzaapVar.zzk(zzadVar.zzY());
                                    this.zzo = zzzjVar.zzf();
                                }
                            }
                        }
                        zzaenVar = null;
                        if (this.zzr) {
                        }
                        this.zzq = zzh;
                        this.zzh.zzN(zzh);
                        zzaap zzaapVar2 = this.zzj;
                        zzad zzadVar2 = new zzad();
                        zzadVar2.zzS(this.zzd.zzb);
                        zzadVar2.zzL(4096);
                        zzadVar2.zzw(this.zzd.zze);
                        zzadVar2.zzT(this.zzd.zzd);
                        zzadVar2.zzC(this.zze.zza);
                        zzadVar2.zzD(this.zze.zzb);
                        zzadVar2.zzM(this.zzl);
                        zzaapVar2.zzk(zzadVar2.zzY());
                        this.zzo = zzzjVar.zzf();
                    }
                    if (zzefVar.zzd() >= 40) {
                        zzefVar.zzF(36);
                        if (zzefVar.zze() == 1447187017) {
                            i2 = 1447187017;
                            if (i2 != 1483304551) {
                            }
                            int i62 = i2;
                            zza2 = zzaeu.zza(zzzjVar.zzd(), zzzjVar.zzf(), this.zzd, zzefVar);
                            if (zza2 != null) {
                                zzzjVar.zzj();
                                zzyyVar.zzl(i + 141, false);
                                zzyyVar.zzm(this.zzc.zzH(), 0, 3, false);
                                this.zzc.zzF(0);
                                zzzx zzzxVar2 = this.zze;
                                int zzm2 = this.zzc.zzm();
                                i3 = zzm2 >> 12;
                                i4 = zzm2 & 4095;
                                if (i3 <= 0) {
                                }
                                zzzxVar2.zza = i3;
                                zzzxVar2.zzb = i4;
                            }
                            zzyyVar.zzo(this.zzd.zzc, false);
                            if (zza2 == null) {
                            }
                            zzbqVar = this.zzl;
                            long zzf2 = zzzjVar.zzf();
                            if (zzbqVar != null) {
                            }
                            zzaenVar = null;
                            if (this.zzr) {
                            }
                            this.zzq = zzh;
                            this.zzh.zzN(zzh);
                            zzaap zzaapVar22 = this.zzj;
                            zzad zzadVar22 = new zzad();
                            zzadVar22.zzS(this.zzd.zzb);
                            zzadVar22.zzL(4096);
                            zzadVar22.zzw(this.zzd.zze);
                            zzadVar22.zzT(this.zzd.zzd);
                            zzadVar22.zzC(this.zze.zza);
                            zzadVar22.zzD(this.zze.zzb);
                            zzadVar22.zzM(this.zzl);
                            zzaapVar22.zzk(zzadVar22.zzY());
                            this.zzo = zzzjVar.zzf();
                        }
                    }
                    i2 = 0;
                    if (i2 != 1483304551) {
                    }
                    int i622 = i2;
                    zza2 = zzaeu.zza(zzzjVar.zzd(), zzzjVar.zzf(), this.zzd, zzefVar);
                    if (zza2 != null) {
                    }
                    zzyyVar.zzo(this.zzd.zzc, false);
                    if (zza2 == null) {
                    }
                    zzbqVar = this.zzl;
                    long zzf22 = zzzjVar.zzf();
                    if (zzbqVar != null) {
                    }
                    zzaenVar = null;
                    if (this.zzr) {
                    }
                    this.zzq = zzh;
                    this.zzh.zzN(zzh);
                    zzaap zzaapVar222 = this.zzj;
                    zzad zzadVar222 = new zzad();
                    zzadVar222.zzS(this.zzd.zzb);
                    zzadVar222.zzL(4096);
                    zzadVar222.zzw(this.zzd.zze);
                    zzadVar222.zzT(this.zzd.zzd);
                    zzadVar222.zzC(this.zze.zza);
                    zzadVar222.zzD(this.zze.zzb);
                    zzadVar222.zzM(this.zzl);
                    zzaapVar222.zzk(zzadVar222.zzY());
                    this.zzo = zzzjVar.zzf();
                }
            } else if (zzaabVar.zze == 1) {
                i5 = 13;
            }
            i = i5;
            if (zzefVar.zzd() >= i + 4) {
            }
            if (zzefVar.zzd() >= 40) {
            }
            i2 = 0;
            if (i2 != 1483304551) {
            }
            int i6222 = i2;
            zza2 = zzaeu.zza(zzzjVar.zzd(), zzzjVar.zzf(), this.zzd, zzefVar);
            if (zza2 != null) {
            }
            zzyyVar.zzo(this.zzd.zzc, false);
            if (zza2 == null) {
            }
            zzbqVar = this.zzl;
            long zzf222 = zzzjVar.zzf();
            if (zzbqVar != null) {
            }
            zzaenVar = null;
            if (this.zzr) {
            }
            this.zzq = zzh;
            this.zzh.zzN(zzh);
            zzaap zzaapVar2222 = this.zzj;
            zzad zzadVar2222 = new zzad();
            zzadVar2222.zzS(this.zzd.zzb);
            zzadVar2222.zzL(4096);
            zzadVar2222.zzw(this.zzd.zze);
            zzadVar2222.zzT(this.zzd.zzd);
            zzadVar2222.zzC(this.zze.zza);
            zzadVar2222.zzD(this.zze.zzb);
            zzadVar2222.zzM(this.zzl);
            zzaapVar2222.zzk(zzadVar2222.zzY());
            this.zzo = zzzjVar.zzf();
        } else {
            long j2 = this.zzo;
            if (j2 != 0) {
                long zzf3 = zzzjVar.zzf();
                if (zzf3 < j2) {
                    ((zzyy) zzzjVar).zzo((int) (j2 - zzf3), false);
                }
            }
        }
        int i9 = this.zzp;
        if (i9 == 0) {
            zzzjVar.zzj();
            if (zzj(zzzjVar)) {
                return -1;
            }
            this.zzc.zzF(0);
            int zze2 = this.zzc.zze();
            if (!zzi(zze2, this.zzk) || zzaac.zzb(zze2) == -1) {
                ((zzyy) zzzjVar).zzo(1, false);
                this.zzk = 0;
                return 0;
            }
            this.zzd.zza(zze2);
            if (this.zzm == -9223372036854775807L) {
                this.zzm = this.zzq.zzc(zzzjVar.zzf());
            }
            int i10 = this.zzd.zzc;
            this.zzp = i10;
            zzaes zzaesVar = this.zzq;
            if (zzaesVar instanceof zzaem) {
                zzg(this.zzn + r2.zzg);
                throw null;
            }
            i9 = i10;
        }
        int zze3 = this.zzj.zze(zzzjVar, i9, true);
        if (zze3 == -1) {
            return -1;
        }
        int i11 = this.zzp - zze3;
        this.zzp = i11;
        if (i11 <= 0) {
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

    private final zzaes zzh(zzzj zzzjVar, boolean z) throws IOException {
        ((zzyy) zzzjVar).zzm(this.zzc.zzH(), 0, 4, false);
        this.zzc.zzF(0);
        this.zzd.zza(this.zzc.zze());
        return new zzael(zzzjVar.zzd(), zzzjVar.zzf(), this.zzd, false);
    }

    private static boolean zzi(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean zzj(zzzj zzzjVar) throws IOException {
        zzaes zzaesVar = this.zzq;
        if (zzaesVar != null) {
            long zzb2 = zzaesVar.zzb();
            if (zzb2 != -1 && zzzjVar.zze() > zzb2 - 4) {
                return true;
            }
        }
        try {
            return !zzzjVar.zzm(this.zzc.zzH(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzk(zzzj zzzjVar, boolean z) throws IOException {
        int i;
        int i2;
        int zzb2;
        int i3 = true != z ? 131072 : 32768;
        zzzjVar.zzj();
        if (zzzjVar.zzf() == 0) {
            zzbq zza2 = this.zzf.zza(zzzjVar, null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zzb(zza2);
            }
            i = (int) zzzjVar.zze();
            if (!z) {
                ((zzyy) zzzjVar).zzo(i, false);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (!zzj(zzzjVar)) {
                this.zzc.zzF(0);
                int zze = this.zzc.zze();
                if ((i2 == 0 || zzi(zze, i2)) && (zzb2 = zzaac.zzb(zze)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(zze);
                        i2 = zze;
                    }
                    ((zzyy) zzzjVar).zzl(zzb2 - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        throw zzbu.zza("Searched too many bytes.", null);
                    }
                    if (z) {
                        zzzjVar.zzj();
                        ((zzyy) zzzjVar).zzl(i + i6, false);
                    } else {
                        ((zzyy) zzzjVar).zzo(1, false);
                    }
                    i4 = 0;
                    i5 = i6;
                    i2 = 0;
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((zzyy) zzzjVar).zzo(i + i5, false);
        } else {
            zzzjVar.zzj();
        }
        this.zzk = i2;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final int zza(zzzj zzzjVar, zzaai zzaaiVar) throws IOException {
        zzdd.zzb(this.zzi);
        int i = zzen.zza;
        int zzf = zzf(zzzjVar);
        if (zzf == -1 && (this.zzq instanceof zzaem)) {
            if (this.zzq.zze() != zzg(this.zzn)) {
                throw null;
            }
        }
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzb(zzzl zzzlVar) {
        this.zzh = zzzlVar;
        zzaap zzv = zzzlVar.zzv(0, 1);
        this.zzi = zzv;
        this.zzj = zzv;
        this.zzh.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzc(long j, long j2) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzaes zzaesVar = this.zzq;
        if (zzaesVar instanceof zzaem) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzzj zzzjVar) throws IOException {
        return zzk(zzzjVar, true);
    }

    public final void zze() {
        this.zzr = true;
    }

    public zzaeq(int i) {
        this.zzc = new zzef(10);
        this.zzd = new zzaab();
        this.zze = new zzzx();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzzz();
        zzzh zzzhVar = new zzzh();
        this.zzg = zzzhVar;
        this.zzj = zzzhVar;
    }
}
