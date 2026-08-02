package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzxs extends zzxp {
    private final boolean zze;
    private final zzxi zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final boolean zzp;
    private final boolean zzq;
    private final int zzr;

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
    
        if (r11 >= 0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzxs(int i, zzcd zzcdVar, int i2, zzxi zzxiVar, int i3, int i4, boolean z) {
        super(i, zzcdVar, i2);
        boolean z2;
        boolean z3;
        int i5;
        zzaf zzafVar;
        String str;
        int i6;
        char c;
        boolean z4;
        this.zzf = zzxiVar;
        int i7 = 1;
        int i8 = true != zzxiVar.zzE ? 16 : 24;
        boolean z5 = zzxiVar.zzD;
        if (z) {
            zzaf zzafVar2 = this.zzd;
            if (zzafVar2.zzr != -1) {
                int i9 = zzxiVar.zza;
            }
            if (zzafVar2.zzs != -1) {
                int i10 = zzxiVar.zzb;
            }
            float f = zzafVar2.zzt;
            if (f != -1.0f) {
                int i11 = zzxiVar.zzc;
            }
            if (zzafVar2.zzi != -1) {
                int i12 = zzxiVar.zzd;
            }
            z2 = true;
            this.zze = z2;
            if (z) {
                zzaf zzafVar3 = this.zzd;
                int i13 = zzafVar3.zzr;
                if (i13 != -1) {
                    int i14 = zzxiVar.zze;
                }
                int i15 = zzafVar3.zzs;
                if (i15 != -1) {
                    int i16 = zzxiVar.zzf;
                }
                float f2 = zzafVar3.zzt;
                if (f2 != -1.0f) {
                    int i17 = zzxiVar.zzg;
                }
                int i18 = zzafVar3.zzi;
                if (i18 != -1) {
                    int i19 = zzxiVar.zzh;
                }
                z3 = true;
                this.zzg = z3;
                this.zzh = zzlf.zza(i3, false);
                zzaf zzafVar4 = this.zzd;
                float f3 = zzafVar4.zzt;
                this.zzi = f3 == -1.0f && f3 >= 10.0f;
                this.zzj = zzafVar4.zzi;
                this.zzk = zzafVar4.zza();
                int i20 = this.zzd.zzf;
                int i21 = zzxiVar.zzm;
                this.zzm = zzxt.zzb(i20, 0);
                int i22 = this.zzd.zzf;
                this.zzn = (i22 == 0 && (i22 & 1) == 0) ? false : true;
                i5 = 0;
                while (true) {
                    if (i5 >= zzxiVar.zzl.size()) {
                        i5 = Integer.MAX_VALUE;
                        break;
                    }
                    String str2 = this.zzd.zzm;
                    if (str2 != null && str2.equals(zzxiVar.zzl.get(i5))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                this.zzl = i5;
                this.zzp = (i3 & 384) == 128;
                this.zzq = (i3 & 64) == 64;
                zzafVar = this.zzd;
                str = zzafVar.zzm;
                if (str != null) {
                    i6 = 4;
                    switch (str.hashCode()) {
                        case -1851077871:
                            if (str.equals("video/dolby-vision")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1662735862:
                            if (str.equals("video/av01")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1662541442:
                            if (str.equals("video/hevc")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1331836730:
                            if (str.equals("video/avc")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1599127257:
                            if (str.equals("video/x-vnd.on2.vp9")) {
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
                        i6 = 5;
                    } else if (c != 1) {
                        if (c == 2) {
                            i6 = 3;
                        } else if (c == 3) {
                            i6 = 2;
                        } else if (c == 4) {
                            i6 = 1;
                        }
                    }
                    this.zzr = i6;
                    if ((zzafVar.zzf & 16384) == 0) {
                        zzxi zzxiVar2 = this.zzf;
                        if (zzlf.zza(i3, zzxiVar2.zzN) && ((z4 = this.zze) || zzxiVar2.zzC)) {
                            if (zzlf.zza(i3, false) && this.zzg && z4 && zzafVar.zzi != -1) {
                                boolean z6 = zzxiVar2.zzz;
                                boolean z7 = zzxiVar2.zzy;
                                if ((i8 & i3) != 0) {
                                    i7 = 2;
                                }
                            }
                            this.zzo = i7;
                        }
                    }
                    i7 = 0;
                    this.zzo = i7;
                }
                i6 = 0;
                this.zzr = i6;
                if ((zzafVar.zzf & 16384) == 0) {
                }
                i7 = 0;
                this.zzo = i7;
            }
            z3 = false;
            this.zzg = z3;
            this.zzh = zzlf.zza(i3, false);
            zzaf zzafVar42 = this.zzd;
            float f32 = zzafVar42.zzt;
            this.zzi = f32 == -1.0f && f32 >= 10.0f;
            this.zzj = zzafVar42.zzi;
            this.zzk = zzafVar42.zza();
            int i202 = this.zzd.zzf;
            int i212 = zzxiVar.zzm;
            this.zzm = zzxt.zzb(i202, 0);
            int i222 = this.zzd.zzf;
            this.zzn = (i222 == 0 && (i222 & 1) == 0) ? false : true;
            i5 = 0;
            while (true) {
                if (i5 >= zzxiVar.zzl.size()) {
                }
                i5++;
            }
            this.zzl = i5;
            this.zzp = (i3 & 384) == 128;
            this.zzq = (i3 & 64) == 64;
            zzafVar = this.zzd;
            str = zzafVar.zzm;
            if (str != null) {
            }
            i6 = 0;
            this.zzr = i6;
            if ((zzafVar.zzf & 16384) == 0) {
            }
            i7 = 0;
            this.zzo = i7;
        }
        z2 = false;
        this.zze = z2;
        if (z) {
        }
        z3 = false;
        this.zzg = z3;
        this.zzh = zzlf.zza(i3, false);
        zzaf zzafVar422 = this.zzd;
        float f322 = zzafVar422.zzt;
        this.zzi = f322 == -1.0f && f322 >= 10.0f;
        this.zzj = zzafVar422.zzi;
        this.zzk = zzafVar422.zza();
        int i2022 = this.zzd.zzf;
        int i2122 = zzxiVar.zzm;
        this.zzm = zzxt.zzb(i2022, 0);
        int i2222 = this.zzd.zzf;
        this.zzn = (i2222 == 0 && (i2222 & 1) == 0) ? false : true;
        i5 = 0;
        while (true) {
            if (i5 >= zzxiVar.zzl.size()) {
            }
            i5++;
        }
        this.zzl = i5;
        this.zzp = (i3 & 384) == 128;
        this.zzq = (i3 & 64) == 64;
        zzafVar = this.zzd;
        str = zzafVar.zzm;
        if (str != null) {
        }
        i6 = 0;
        this.zzr = i6;
        if ((zzafVar.zzf & 16384) == 0) {
        }
        i7 = 0;
        this.zzo = i7;
    }

    public static /* synthetic */ int zza(zzxs zzxsVar, zzxs zzxsVar2) {
        zzfzc zzfzcVar;
        zzfzc zza;
        if (zzxsVar.zze && zzxsVar.zzh) {
            zza = zzxt.zzb;
        } else {
            zzfzcVar = zzxt.zzb;
            zza = zzfzcVar.zza();
        }
        zzfxg zzj = zzfxg.zzj();
        boolean z = zzxsVar.zzf.zzy;
        return zzj.zzc(Integer.valueOf(zzxsVar.zzk), Integer.valueOf(zzxsVar2.zzk), zza).zzc(Integer.valueOf(zzxsVar.zzj), Integer.valueOf(zzxsVar2.zzj), zza).zza();
    }

    public static /* synthetic */ int zzd(zzxs zzxsVar, zzxs zzxsVar2) {
        zzfxg zzc = zzfxg.zzj().zzd(zzxsVar.zzh, zzxsVar2.zzh).zzb(zzxsVar.zzm, zzxsVar2.zzm).zzd(zzxsVar.zzn, zzxsVar2.zzn).zzd(zzxsVar.zzi, zzxsVar2.zzi).zzd(zzxsVar.zze, zzxsVar2.zze).zzd(zzxsVar.zzg, zzxsVar2.zzg).zzc(Integer.valueOf(zzxsVar.zzl), Integer.valueOf(zzxsVar2.zzl), zzfzc.zzc().zza());
        boolean z = zzxsVar.zzp;
        zzfxg zzd = zzc.zzd(z, zzxsVar2.zzp);
        boolean z2 = zzxsVar.zzq;
        zzfxg zzd2 = zzd.zzd(z2, zzxsVar2.zzq);
        if (z && z2) {
            zzd2 = zzd2.zzb(zzxsVar.zzr, zzxsVar2.zzr);
        }
        return zzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final int zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final /* bridge */ /* synthetic */ boolean zzc(zzxp zzxpVar) {
        zzxs zzxsVar = (zzxs) zzxpVar;
        if (!zzet.zzG(this.zzd.zzm, zzxsVar.zzd.zzm)) {
            return false;
        }
        boolean z = this.zzf.zzF;
        return this.zzp == zzxsVar.zzp && this.zzq == zzxsVar.zzq;
    }
}
