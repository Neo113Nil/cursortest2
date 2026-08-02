package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzvq extends zzvn {
    private final boolean zze;
    private final zzvf zzf;
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
    public zzvq(int i, zzcp zzcpVar, int i2, zzvf zzvfVar, int i3, int i4, boolean z) {
        super(i, zzcpVar, i2);
        boolean z2;
        boolean z3;
        int i5;
        String str;
        char c;
        zzvf zzvfVar2;
        boolean z4;
        this.zzf = zzvfVar;
        int i6 = 1;
        int i7 = true != zzvfVar.zzI ? 16 : 24;
        boolean z5 = zzvfVar.zzH;
        if (z) {
            zzaf zzafVar = this.zzd;
            if (zzafVar.zzr != -1) {
                int i8 = zzvfVar.zzd;
            }
            if (zzafVar.zzs != -1) {
                int i9 = zzvfVar.zze;
            }
            float f = zzafVar.zzt;
            if (f != -1.0f) {
                int i10 = zzvfVar.zzf;
            }
            if (zzafVar.zzi != -1) {
                int i11 = zzvfVar.zzg;
            }
            z2 = true;
            this.zze = z2;
            if (z) {
                zzaf zzafVar2 = this.zzd;
                int i12 = zzafVar2.zzr;
                if (i12 != -1) {
                    int i13 = zzvfVar.zzh;
                }
                int i14 = zzafVar2.zzs;
                if (i14 != -1) {
                    int i15 = zzvfVar.zzi;
                }
                float f2 = zzafVar2.zzt;
                if (f2 != -1.0f) {
                    int i16 = zzvfVar.zzj;
                }
                int i17 = zzafVar2.zzi;
                if (i17 != -1) {
                    int i18 = zzvfVar.zzk;
                }
                z3 = true;
                this.zzg = z3;
                this.zzh = zzvr.zzm(i3, false);
                zzaf zzafVar3 = this.zzd;
                this.zzi = zzafVar3.zzi;
                this.zzj = zzafVar3.zza();
                int i19 = this.zzd.zzf;
                int i20 = zzvfVar.zzp;
                this.zzl = Integer.bitCount(0);
                int i21 = this.zzd.zzf;
                this.zzm = true;
                i5 = 0;
                while (true) {
                    if (i5 >= zzvfVar.zzo.size()) {
                        i5 = Integer.MAX_VALUE;
                        break;
                    }
                    String str2 = this.zzd.zzm;
                    if (str2 != null && str2.equals(zzvfVar.zzo.get(i5))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                this.zzk = i5;
                this.zzo = (i3 & 128) == 128;
                this.zzp = (i3 & 64) == 64;
                zzaf zzafVar4 = this.zzd;
                str = zzafVar4.zzm;
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
                    int i23 = zzafVar4.zzf;
                    zzvfVar2 = this.zzf;
                    if (!zzvr.zzm(i3, zzvfVar2.zzQ) || (!(z4 = this.zze) && !zzvfVar2.zzG)) {
                        i6 = 0;
                    } else if (zzvr.zzm(i3, false) && this.zzg && z4 && zzafVar4.zzi != -1) {
                        boolean z6 = zzvfVar2.zzA;
                        boolean z7 = zzvfVar2.zzz;
                        if ((i7 & i3) != 0) {
                            i6 = 2;
                        }
                    }
                    this.zzn = i6;
                }
                i22 = 0;
                this.zzq = i22;
                int i232 = zzafVar4.zzf;
                zzvfVar2 = this.zzf;
                if (!zzvr.zzm(i3, zzvfVar2.zzQ)) {
                    if (zzvr.zzm(i3, false)) {
                        boolean z62 = zzvfVar2.zzA;
                        boolean z72 = zzvfVar2.zzz;
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
            this.zzh = zzvr.zzm(i3, false);
            zzaf zzafVar32 = this.zzd;
            this.zzi = zzafVar32.zzi;
            this.zzj = zzafVar32.zza();
            int i192 = this.zzd.zzf;
            int i202 = zzvfVar.zzp;
            this.zzl = Integer.bitCount(0);
            int i212 = this.zzd.zzf;
            this.zzm = true;
            i5 = 0;
            while (true) {
                if (i5 >= zzvfVar.zzo.size()) {
                }
                i5++;
            }
            this.zzk = i5;
            this.zzo = (i3 & 128) == 128;
            this.zzp = (i3 & 64) == 64;
            zzaf zzafVar42 = this.zzd;
            str = zzafVar42.zzm;
            int i222 = 3;
            if (str != null) {
            }
            i222 = 0;
            this.zzq = i222;
            int i2322 = zzafVar42.zzf;
            zzvfVar2 = this.zzf;
            if (!zzvr.zzm(i3, zzvfVar2.zzQ)) {
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
        this.zzh = zzvr.zzm(i3, false);
        zzaf zzafVar322 = this.zzd;
        this.zzi = zzafVar322.zzi;
        this.zzj = zzafVar322.zza();
        int i1922 = this.zzd.zzf;
        int i2022 = zzvfVar.zzp;
        this.zzl = Integer.bitCount(0);
        int i2122 = this.zzd.zzf;
        this.zzm = true;
        i5 = 0;
        while (true) {
            if (i5 >= zzvfVar.zzo.size()) {
            }
            i5++;
        }
        this.zzk = i5;
        this.zzo = (i3 & 128) == 128;
        this.zzp = (i3 & 64) == 64;
        zzaf zzafVar422 = this.zzd;
        str = zzafVar422.zzm;
        int i2222 = 3;
        if (str != null) {
        }
        i2222 = 0;
        this.zzq = i2222;
        int i23222 = zzafVar422.zzf;
        zzvfVar2 = this.zzf;
        if (!zzvr.zzm(i3, zzvfVar2.zzQ)) {
        }
        i6 = 0;
        this.zzn = i6;
    }

    public static /* synthetic */ int zza(zzvq zzvqVar, zzvq zzvqVar2) {
        zzfwv zzfwvVar;
        zzfwv zza;
        zzfwv zzfwvVar2;
        if (zzvqVar.zze && zzvqVar.zzh) {
            zza = zzvr.zzc;
        } else {
            zzfwvVar = zzvr.zzc;
            zza = zzfwvVar.zza();
        }
        zzfvc zzj = zzfvc.zzj();
        Integer valueOf = Integer.valueOf(zzvqVar.zzi);
        Integer valueOf2 = Integer.valueOf(zzvqVar2.zzi);
        boolean z = zzvqVar.zzf.zzz;
        zzfwvVar2 = zzvr.zzd;
        return zzj.zzc(valueOf, valueOf2, zzfwvVar2).zzc(Integer.valueOf(zzvqVar.zzj), Integer.valueOf(zzvqVar2.zzj), zza).zzc(Integer.valueOf(zzvqVar.zzi), Integer.valueOf(zzvqVar2.zzi), zza).zza();
    }

    public static /* synthetic */ int zzd(zzvq zzvqVar, zzvq zzvqVar2) {
        zzfvc zzb = zzfvc.zzj().zzd(zzvqVar.zzh, zzvqVar2.zzh).zzb(zzvqVar.zzl, zzvqVar2.zzl);
        boolean z = zzvqVar.zzm;
        boolean z2 = zzvqVar2.zzm;
        zzfvc zzc = zzb.zzd(true, true).zzd(zzvqVar.zze, zzvqVar2.zze).zzd(zzvqVar.zzg, zzvqVar2.zzg).zzc(Integer.valueOf(zzvqVar.zzk), Integer.valueOf(zzvqVar2.zzk), zzfwv.zzc().zza());
        boolean z3 = zzvqVar.zzo;
        zzfvc zzd = zzc.zzd(z3, zzvqVar2.zzo);
        boolean z4 = zzvqVar.zzp;
        zzfvc zzd2 = zzd.zzd(z4, zzvqVar2.zzp);
        if (z3 && z4) {
            zzd2 = zzd2.zzb(zzvqVar.zzq, zzvqVar2.zzq);
        }
        return zzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final int zzb() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final /* bridge */ /* synthetic */ boolean zzc(zzvn zzvnVar) {
        zzvq zzvqVar = (zzvq) zzvnVar;
        if (!zzen.zzT(this.zzd.zzm, zzvqVar.zzd.zzm)) {
            return false;
        }
        boolean z = this.zzf.zzJ;
        return this.zzo == zzvqVar.zzo && this.zzp == zzvqVar.zzp;
    }
}
