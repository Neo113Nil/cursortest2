package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzve extends zzvb {
    private final boolean zze;
    private final zzuu zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final boolean zzo;
    private final boolean zzp;
    private final int zzq;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r2 <= 2.1474836E9f) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r1 >= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if (r1 >= 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        if (r1 >= 0.0f) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
    
        if (r7 >= 0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzve(int i, zzck zzckVar, int i2, zzuu zzuuVar, int i3, int i4, boolean z) {
        super(i, zzckVar, i2);
        boolean z2;
        boolean z3;
        int i5;
        String str;
        char c;
        zzuu zzuuVar2;
        boolean z4;
        this.zzf = zzuuVar;
        int i6 = 1;
        int i7 = true != zzuuVar.zzI ? 16 : 24;
        boolean z5 = zzuuVar.zzH;
        if (z) {
            zzad zzadVar = this.zzd;
            if (zzadVar.zzr != -1) {
                int i8 = zzuuVar.zzd;
            }
            if (zzadVar.zzs != -1) {
                int i9 = zzuuVar.zze;
            }
            float f = zzadVar.zzt;
            if (f != -1.0f) {
                int i10 = zzuuVar.zzf;
            }
            if (zzadVar.zzi != -1) {
                int i11 = zzuuVar.zzg;
            }
            z2 = true;
            this.zze = z2;
            if (z) {
                zzad zzadVar2 = this.zzd;
                int i12 = zzadVar2.zzr;
                if (i12 != -1) {
                    int i13 = zzuuVar.zzh;
                }
                int i14 = zzadVar2.zzs;
                if (i14 != -1) {
                    int i15 = zzuuVar.zzi;
                }
                float f2 = zzadVar2.zzt;
                if (f2 != -1.0f) {
                    int i16 = zzuuVar.zzj;
                }
                int i17 = zzadVar2.zzi;
                if (i17 != -1) {
                    int i18 = zzuuVar.zzk;
                }
                z3 = true;
                this.zzg = z3;
                this.zzh = zzvf.zzi(i3, false);
                zzad zzadVar3 = this.zzd;
                this.zzi = zzadVar3.zzi;
                this.zzj = zzadVar3.zza();
                int i19 = this.zzd.zzf;
                int i20 = zzuuVar.zzp;
                this.zzl = Integer.bitCount(0);
                int i21 = this.zzd.zzf;
                this.zzm = true;
                i5 = 0;
                while (true) {
                    if (i5 >= zzuuVar.zzo.size()) {
                        i5 = Integer.MAX_VALUE;
                        break;
                    }
                    String str2 = this.zzd.zzm;
                    if (str2 != null && str2.equals(zzuuVar.zzo.get(i5))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                this.zzk = i5;
                this.zzo = (i3 & 128) == 128;
                this.zzp = (i3 & 64) == 64;
                zzad zzadVar4 = this.zzd;
                str = zzadVar4.zzm;
                int i22 = 3;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1662735862:
                            if (str.equals("video/av01")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1662541442:
                            if (str.equals("video/hevc")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1331836730:
                            if (str.equals("video/avc")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1599127257:
                            if (str.equals("video/x-vnd.on2.vp9")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        i22 = 4;
                    } else if (c != 1) {
                        if (c == 2) {
                            i22 = 2;
                        } else if (c == 3) {
                            i22 = 1;
                        }
                    }
                    this.zzq = i22;
                    int i23 = zzadVar4.zzf;
                    zzuuVar2 = this.zzf;
                    if (!zzvf.zzi(i3, zzuuVar2.zzP) || (!(z4 = this.zze) && !zzuuVar2.zzG)) {
                        i6 = 0;
                    } else if (zzvf.zzi(i3, false) && this.zzg && z4 && zzadVar4.zzi != -1) {
                        boolean z6 = zzuuVar2.zzz;
                        boolean z7 = zzuuVar2.zzy;
                        if ((i7 & i3) != 0) {
                            i6 = 2;
                        }
                    }
                    this.zzn = i6;
                }
                i22 = 0;
                this.zzq = i22;
                int i232 = zzadVar4.zzf;
                zzuuVar2 = this.zzf;
                if (!zzvf.zzi(i3, zzuuVar2.zzP)) {
                    if (zzvf.zzi(i3, false)) {
                        boolean z62 = zzuuVar2.zzz;
                        boolean z72 = zzuuVar2.zzy;
                        if ((i7 & i3) != 0) {
                        }
                    }
                    this.zzn = i6;
                }
                i6 = 0;
                this.zzn = i6;
            }
            z3 = false;
            this.zzg = z3;
            this.zzh = zzvf.zzi(i3, false);
            zzad zzadVar32 = this.zzd;
            this.zzi = zzadVar32.zzi;
            this.zzj = zzadVar32.zza();
            int i192 = this.zzd.zzf;
            int i202 = zzuuVar.zzp;
            this.zzl = Integer.bitCount(0);
            int i212 = this.zzd.zzf;
            this.zzm = true;
            i5 = 0;
            while (true) {
                if (i5 >= zzuuVar.zzo.size()) {
                }
                i5++;
            }
            this.zzk = i5;
            this.zzo = (i3 & 128) == 128;
            this.zzp = (i3 & 64) == 64;
            zzad zzadVar42 = this.zzd;
            str = zzadVar42.zzm;
            int i222 = 3;
            if (str != null) {
            }
            i222 = 0;
            this.zzq = i222;
            int i2322 = zzadVar42.zzf;
            zzuuVar2 = this.zzf;
            if (!zzvf.zzi(i3, zzuuVar2.zzP)) {
            }
            i6 = 0;
            this.zzn = i6;
        }
        z2 = false;
        this.zze = z2;
        if (z) {
        }
        z3 = false;
        this.zzg = z3;
        this.zzh = zzvf.zzi(i3, false);
        zzad zzadVar322 = this.zzd;
        this.zzi = zzadVar322.zzi;
        this.zzj = zzadVar322.zza();
        int i1922 = this.zzd.zzf;
        int i2022 = zzuuVar.zzp;
        this.zzl = Integer.bitCount(0);
        int i2122 = this.zzd.zzf;
        this.zzm = true;
        i5 = 0;
        while (true) {
            if (i5 >= zzuuVar.zzo.size()) {
            }
            i5++;
        }
        this.zzk = i5;
        this.zzo = (i3 & 128) == 128;
        this.zzp = (i3 & 64) == 64;
        zzad zzadVar422 = this.zzd;
        str = zzadVar422.zzm;
        int i2222 = 3;
        if (str != null) {
        }
        i2222 = 0;
        this.zzq = i2222;
        int i23222 = zzadVar422.zzf;
        zzuuVar2 = this.zzf;
        if (!zzvf.zzi(i3, zzuuVar2.zzP)) {
        }
        i6 = 0;
        this.zzn = i6;
    }

    public static /* synthetic */ int zza(zzve zzveVar, zzve zzveVar2) {
        zzfsp zzfspVar;
        zzfsp zza;
        zzfsp zzfspVar2;
        if (zzveVar.zze && zzveVar.zzh) {
            zza = zzvf.zzb;
        } else {
            zzfspVar = zzvf.zzb;
            zza = zzfspVar.zza();
        }
        zzfqw zzj = zzfqw.zzj();
        Integer valueOf = Integer.valueOf(zzveVar.zzi);
        Integer valueOf2 = Integer.valueOf(zzveVar2.zzi);
        boolean z = zzveVar.zzf.zzy;
        zzfspVar2 = zzvf.zzc;
        return zzj.zzc(valueOf, valueOf2, zzfspVar2).zzc(Integer.valueOf(zzveVar.zzj), Integer.valueOf(zzveVar2.zzj), zza).zzc(Integer.valueOf(zzveVar.zzi), Integer.valueOf(zzveVar2.zzi), zza).zza();
    }

    public static /* synthetic */ int zzd(zzve zzveVar, zzve zzveVar2) {
        zzfqw zzb = zzfqw.zzj().zzd(zzveVar.zzh, zzveVar2.zzh).zzb(zzveVar.zzl, zzveVar2.zzl);
        boolean z = zzveVar.zzm;
        boolean z2 = zzveVar2.zzm;
        zzfqw zzc = zzb.zzd(true, true).zzd(zzveVar.zze, zzveVar2.zze).zzd(zzveVar.zzg, zzveVar2.zzg).zzc(Integer.valueOf(zzveVar.zzk), Integer.valueOf(zzveVar2.zzk), zzfsp.zzc().zza());
        boolean z3 = zzveVar.zzo;
        zzfqw zzd = zzc.zzd(z3, zzveVar2.zzo);
        boolean z4 = zzveVar.zzp;
        zzfqw zzd2 = zzd.zzd(z4, zzveVar2.zzp);
        if (z3 && z4) {
            zzd2 = zzd2.zzb(zzveVar.zzq, zzveVar2.zzq);
        }
        return zzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final int zzb() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final /* bridge */ /* synthetic */ boolean zzc(zzvb zzvbVar) {
        zzve zzveVar = (zzve) zzvbVar;
        if (!zzeg.zzS(this.zzd.zzm, zzveVar.zzd.zzm)) {
            return false;
        }
        boolean z = this.zzf.zzJ;
        return this.zzo == zzveVar.zzo && this.zzp == zzveVar.zzp;
    }
}
