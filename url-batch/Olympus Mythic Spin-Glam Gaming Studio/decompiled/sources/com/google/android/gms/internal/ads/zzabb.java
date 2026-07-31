package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzabb extends zzaau {
    private final boolean zze;
    private final zzaaq zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final int zzw;
    private final boolean zzx;

    @Nullable
    private final String zzy;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0109 A[EDGE_INSN: B:152:0x0109->B:73:0x0109 BREAK  A[LOOP:1: B:66:0x00ef->B:150:0x0107], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzabb(int i, zzbg zzbgVar, int i2, zzaaq zzaaqVar, int i3, @Nullable String str, int i4, boolean z) {
        super(i, zzbgVar, i2);
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        String str2;
        int i8;
        int i9;
        boolean z4;
        boolean z5;
        int i10;
        char c;
        boolean z6;
        zzv zzvVar;
        boolean z7;
        int i11;
        zzv zzvVar2;
        int i12;
        int i13;
        float f;
        int i14;
        zzv zzvVar3;
        int i15;
        int i16;
        int i17;
        this.zzf = zzaaqVar;
        int i18 = 1;
        int i19 = true != zzaaqVar.zzM ? 16 : 24;
        if (z && (((i15 = (zzvVar3 = this.zzd).zzw) == -1 || i15 <= zzaaqVar.zza) && ((i16 = zzvVar3.zzx) == -1 || i16 <= zzaaqVar.zzb))) {
            float f2 = zzvVar3.zzA;
            if ((f2 == -1.0f || f2 <= zzaaqVar.zzc) && ((i17 = zzvVar3.zzj) == -1 || i17 <= zzaaqVar.zzd)) {
                z2 = true;
                this.zze = z2;
                if (z && (((i12 = (zzvVar2 = this.zzd).zzw) == -1 || i12 >= 0) && ((i13 = zzvVar2.zzx) == -1 || i13 >= 0))) {
                    f = zzvVar2.zzA;
                    if ((f != -1.0f || f >= 0.0f) && ((i14 = zzvVar2.zzj) == -1 || i14 >= 0)) {
                        z3 = true;
                        this.zzg = z3;
                        this.zzh = zzng.zzad(i3, false);
                        zzv zzvVar4 = this.zzd;
                        float f3 = zzvVar4.zzA;
                        this.zzi = f3 == -1.0f && f3 >= 10.0f;
                        this.zzj = zzvVar4.zzj;
                        this.zzk = zzvVar4.zzc();
                        i5 = 0;
                        while (true) {
                            i6 = Integer.MAX_VALUE;
                            if (i5 < zzaaqVar.zzo.size()) {
                                i7 = 0;
                                i5 = Integer.MAX_VALUE;
                                break;
                            } else {
                                i7 = zzabc.zzj(this.zzd, (String) zzaaqVar.zzo.get(i5), false);
                                if (i7 > 0) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        this.zzm = i5;
                        this.zzn = i7;
                        this.zzo = zzabc.zzm(this.zzd.zzf, 0);
                        int i20 = this.zzd.zzf;
                        this.zzq = (i20 == 0 && (i20 & 1) == 0) ? false : true;
                        this.zzr = zzabc.zzj(this.zzd, str, zzabc.zzi(str) != null);
                        zzv zzvVar5 = this.zzd;
                        str2 = zzvVar5.zzp;
                        i8 = i3 & 384;
                        int i21 = 256;
                        if (i8 == 256) {
                            String zzg = zzwl.zzg(zzvVar5);
                            str2 = zzg != null ? zzg : str2;
                            i8 = 256;
                        }
                        i9 = 0;
                        while (true) {
                            if (i9 < zzaaqVar.zzm.size()) {
                                if (str2 != null && str2.equals(zzaaqVar.zzm.get(i9))) {
                                    i6 = i9;
                                    break;
                                }
                                i9++;
                            } else {
                                break;
                            }
                        }
                        this.zzl = i6;
                        this.zzp = zzabc.zzn(this.zzd, zzaaqVar.zzn);
                        if (i8 != 128) {
                            z4 = true;
                            i21 = i8;
                        } else if (i8 == 256) {
                            z4 = true;
                        } else {
                            i21 = i8;
                            z4 = false;
                        }
                        this.zzt = z4;
                        z5 = i21 != 128;
                        this.zzu = z5;
                        this.zzv = (i3 & 64) != 64;
                        this.zzy = str2;
                        if (str2 != null) {
                            i10 = 4;
                            switch (str2.hashCode()) {
                                case -1851077871:
                                    if (str2.equals("video/dolby-vision")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1662735862:
                                    if (str2.equals("video/av01")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1662541442:
                                    if (str2.equals("video/hevc")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1331836730:
                                    if (str2.equals("video/avc")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1599127257:
                                    if (str2.equals("video/x-vnd.on2.vp9")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                i10 = 5;
                            } else if (c != 1) {
                                if (c == 2) {
                                    i10 = 3;
                                } else if (c == 3) {
                                    i10 = 2;
                                } else if (c == 4) {
                                    i10 = 1;
                                }
                            }
                            this.zzw = i10;
                            if (z5) {
                                zzi zziVar = this.zzd.zzG;
                                zzi zziVar2 = zzi.zza;
                                if (zziVar != null && ((i11 = zziVar.zzd) == 7 || i11 == 6)) {
                                    z6 = true;
                                    this.zzx = z6;
                                    zzvVar = this.zzd;
                                    if ((zzvVar.zzf & 16384) == 0) {
                                        zzaaq zzaaqVar2 = this.zzf;
                                        if (zzng.zzad(i3, zzaaqVar2.zzV) && ((z7 = this.zze) || zzaaqVar2.zzK)) {
                                            if (zzng.zzad(i3, false) && this.zzg && z7 && zzvVar.zzj != -1 && (i19 & i3) != 0) {
                                                i18 = 2;
                                            }
                                            this.zzs = i18;
                                        }
                                    }
                                    i18 = 0;
                                    this.zzs = i18;
                                }
                            }
                            z6 = false;
                            this.zzx = z6;
                            zzvVar = this.zzd;
                            if ((zzvVar.zzf & 16384) == 0) {
                            }
                            i18 = 0;
                            this.zzs = i18;
                        }
                        i10 = 0;
                        this.zzw = i10;
                        if (z5) {
                        }
                        z6 = false;
                        this.zzx = z6;
                        zzvVar = this.zzd;
                        if ((zzvVar.zzf & 16384) == 0) {
                        }
                        i18 = 0;
                        this.zzs = i18;
                    }
                }
                z3 = false;
                this.zzg = z3;
                this.zzh = zzng.zzad(i3, false);
                zzv zzvVar42 = this.zzd;
                float f32 = zzvVar42.zzA;
                this.zzi = f32 == -1.0f && f32 >= 10.0f;
                this.zzj = zzvVar42.zzj;
                this.zzk = zzvVar42.zzc();
                i5 = 0;
                while (true) {
                    i6 = Integer.MAX_VALUE;
                    if (i5 < zzaaqVar.zzo.size()) {
                    }
                    i5++;
                }
                this.zzm = i5;
                this.zzn = i7;
                this.zzo = zzabc.zzm(this.zzd.zzf, 0);
                int i202 = this.zzd.zzf;
                this.zzq = (i202 == 0 && (i202 & 1) == 0) ? false : true;
                this.zzr = zzabc.zzj(this.zzd, str, zzabc.zzi(str) != null);
                zzv zzvVar52 = this.zzd;
                str2 = zzvVar52.zzp;
                i8 = i3 & 384;
                int i212 = 256;
                if (i8 == 256) {
                }
                i9 = 0;
                while (true) {
                    if (i9 < zzaaqVar.zzm.size()) {
                    }
                    i9++;
                }
                this.zzl = i6;
                this.zzp = zzabc.zzn(this.zzd, zzaaqVar.zzn);
                if (i8 != 128) {
                }
                this.zzt = z4;
                if (i212 != 128) {
                }
                this.zzu = z5;
                this.zzv = (i3 & 64) != 64;
                this.zzy = str2;
                if (str2 != null) {
                }
                i10 = 0;
                this.zzw = i10;
                if (z5) {
                }
                z6 = false;
                this.zzx = z6;
                zzvVar = this.zzd;
                if ((zzvVar.zzf & 16384) == 0) {
                }
                i18 = 0;
                this.zzs = i18;
            }
        }
        z2 = false;
        this.zze = z2;
        if (z) {
            f = zzvVar2.zzA;
            if (f != -1.0f) {
            }
            z3 = true;
            this.zzg = z3;
            this.zzh = zzng.zzad(i3, false);
            zzv zzvVar422 = this.zzd;
            float f322 = zzvVar422.zzA;
            this.zzi = f322 == -1.0f && f322 >= 10.0f;
            this.zzj = zzvVar422.zzj;
            this.zzk = zzvVar422.zzc();
            i5 = 0;
            while (true) {
                i6 = Integer.MAX_VALUE;
                if (i5 < zzaaqVar.zzo.size()) {
                }
                i5++;
            }
            this.zzm = i5;
            this.zzn = i7;
            this.zzo = zzabc.zzm(this.zzd.zzf, 0);
            int i2022 = this.zzd.zzf;
            this.zzq = (i2022 == 0 && (i2022 & 1) == 0) ? false : true;
            this.zzr = zzabc.zzj(this.zzd, str, zzabc.zzi(str) != null);
            zzv zzvVar522 = this.zzd;
            str2 = zzvVar522.zzp;
            i8 = i3 & 384;
            int i2122 = 256;
            if (i8 == 256) {
            }
            i9 = 0;
            while (true) {
                if (i9 < zzaaqVar.zzm.size()) {
                }
                i9++;
            }
            this.zzl = i6;
            this.zzp = zzabc.zzn(this.zzd, zzaaqVar.zzn);
            if (i8 != 128) {
            }
            this.zzt = z4;
            if (i2122 != 128) {
            }
            this.zzu = z5;
            this.zzv = (i3 & 64) != 64;
            this.zzy = str2;
            if (str2 != null) {
            }
            i10 = 0;
            this.zzw = i10;
            if (z5) {
            }
            z6 = false;
            this.zzx = z6;
            zzvVar = this.zzd;
            if ((zzvVar.zzf & 16384) == 0) {
            }
            i18 = 0;
            this.zzs = i18;
        }
        z3 = false;
        this.zzg = z3;
        this.zzh = zzng.zzad(i3, false);
        zzv zzvVar4222 = this.zzd;
        float f3222 = zzvVar4222.zzA;
        this.zzi = f3222 == -1.0f && f3222 >= 10.0f;
        this.zzj = zzvVar4222.zzj;
        this.zzk = zzvVar4222.zzc();
        i5 = 0;
        while (true) {
            i6 = Integer.MAX_VALUE;
            if (i5 < zzaaqVar.zzo.size()) {
            }
            i5++;
        }
        this.zzm = i5;
        this.zzn = i7;
        this.zzo = zzabc.zzm(this.zzd.zzf, 0);
        int i20222 = this.zzd.zzf;
        this.zzq = (i20222 == 0 && (i20222 & 1) == 0) ? false : true;
        this.zzr = zzabc.zzj(this.zzd, str, zzabc.zzi(str) != null);
        zzv zzvVar5222 = this.zzd;
        str2 = zzvVar5222.zzp;
        i8 = i3 & 384;
        int i21222 = 256;
        if (i8 == 256) {
        }
        i9 = 0;
        while (true) {
            if (i9 < zzaaqVar.zzm.size()) {
            }
            i9++;
        }
        this.zzl = i6;
        this.zzp = zzabc.zzn(this.zzd, zzaaqVar.zzn);
        if (i8 != 128) {
        }
        this.zzt = z4;
        if (i21222 != 128) {
        }
        this.zzu = z5;
        this.zzv = (i3 & 64) != 64;
        this.zzy = str2;
        if (str2 != null) {
        }
        i10 = 0;
        this.zzw = i10;
        if (z5) {
        }
        z6 = false;
        this.zzx = z6;
        zzvVar = this.zzd;
        if ((zzvVar.zzf & 16384) == 0) {
        }
        i18 = 0;
        this.zzs = i18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(zzabb zzabbVar, zzabb zzabbVar2) {
        return zzgwz.zzg().zzd(zzabbVar.zzh, zzabbVar2.zzh).zza(Integer.valueOf(zzabbVar.zzm), Integer.valueOf(zzabbVar2.zzm), zzgzg.zzb().zza()).zzb(zzabbVar.zzn, zzabbVar2.zzn).zzb(zzabbVar.zzo, zzabbVar2.zzo).zza(Integer.valueOf(zzabbVar.zzp), Integer.valueOf(zzabbVar2.zzp), zzgzg.zzb().zza()).zzd(zzabbVar.zzq, zzabbVar2.zzq).zzb(zzabbVar.zzr, zzabbVar2.zzr).zzd(zzabbVar.zzi, zzabbVar2.zzi).zzd(zzabbVar.zze, zzabbVar2.zze).zzd(zzabbVar.zzg, zzabbVar2.zzg).zza(Integer.valueOf(zzabbVar.zzl), Integer.valueOf(zzabbVar2.zzl), zzgzg.zzb().zza()).zzd(zzabbVar.zzt, zzabbVar2.zzt).zzd(zzabbVar.zzv, zzabbVar2.zzv).zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(zzabb zzabbVar, zzabb zzabbVar2) {
        zzgzg zzgzgVar;
        zzgzg zza;
        if (zzabbVar.zze && zzabbVar.zzh) {
            zza = zzabc.zzc;
        } else {
            zzgzgVar = zzabc.zzc;
            zza = zzgzgVar.zza();
        }
        zzgwz zzg = zzgwz.zzg();
        boolean z = zzabbVar.zzf.zzF;
        zzgwz zza2 = zzg.zzd(zzabbVar.zzx, zzabbVar2.zzx).zza(Integer.valueOf(zzabbVar.zzk), Integer.valueOf(zzabbVar2.zzk), zza);
        if (zzabbVar.zzt && zzabbVar.zzv) {
            zza2 = zza2.zzb(zzabbVar.zzw, zzabbVar2.zzw);
        }
        return zza2.zzd(zzabbVar.zzu, zzabbVar2.zzu).zza(Integer.valueOf(zzabbVar.zzj), Integer.valueOf(zzabbVar2.zzj), zza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final int zza() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final /* bridge */ /* synthetic */ boolean zzc(zzaau zzaauVar) {
        zzabb zzabbVar = (zzabb) zzaauVar;
        if (!Objects.equals(this.zzy, zzabbVar.zzy)) {
            return false;
        }
        boolean z = this.zzf.zzN;
        return this.zzt == zzabbVar.zzt && this.zzv == zzabbVar.zzv;
    }
}
