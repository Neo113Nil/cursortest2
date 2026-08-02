package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzve implements zzyt, zztx {
    final /* synthetic */ zzvj zza;
    private final Uri zzc;
    private final zzgt zzd;
    private final zzuy zze;
    private final zzacn zzf;
    private final zzdm zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzadp zzm;
    private boolean zzn;
    private final zzadf zzh = new zzadf();
    private boolean zzj = true;
    private final long zzb = zztz.zza();
    private zzfy zzl = zzi(0);

    public zzve(zzvj zzvjVar, Uri uri, zzfs zzfsVar, zzuy zzuyVar, zzacn zzacnVar, zzdm zzdmVar) {
        this.zza = zzvjVar;
        this.zzc = uri;
        this.zzd = new zzgt(zzfsVar);
        this.zze = zzuyVar;
        this.zzf = zzacnVar;
        this.zzg = zzdmVar;
    }

    static /* bridge */ /* synthetic */ void zzf(zzve zzveVar, long j, long j2) {
        zzveVar.zzh.zza = j;
        zzveVar.zzk = j2;
        zzveVar.zzj = true;
        zzveVar.zzn = false;
    }

    private final zzfy zzi(long j) {
        zzfw zzfwVar = new zzfw();
        zzfwVar.zzd(this.zzc);
        zzfwVar.zzc(j);
        zzfwVar.zza(6);
        zzfwVar.zzb(zzvj.zzb);
        return zzfwVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e A[Catch: all -> 0x0207, TryCatch #1 {all -> 0x0207, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:49:0x0186, B:50:0x018b, B:52:0x018f, B:104:0x010c, B:107:0x0120, B:116:0x0069, B:119:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4 A[Catch: all -> 0x0207, TryCatch #1 {all -> 0x0207, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:49:0x0186, B:50:0x018b, B:52:0x018f, B:104:0x010c, B:107:0x0120, B:116:0x0069, B:119:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca A[Catch: all -> 0x0207, TryCatch #1 {all -> 0x0207, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:49:0x0186, B:50:0x018b, B:52:0x018f, B:104:0x010c, B:107:0x0120, B:116:0x0069, B:119:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0 A[Catch: all -> 0x0207, TryCatch #1 {all -> 0x0207, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:49:0x0186, B:50:0x018b, B:52:0x018f, B:104:0x010c, B:107:0x0120, B:116:0x0069, B:119:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc A[Catch: all -> 0x0207, TRY_LEAVE, TryCatch #1 {all -> 0x0207, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:49:0x0186, B:50:0x018b, B:52:0x018f, B:104:0x010c, B:107:0x0120, B:116:0x0069, B:119:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0132 A[Catch: all -> 0x0207, TryCatch #1 {all -> 0x0207, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:49:0x0186, B:50:0x018b, B:52:0x018f, B:104:0x010c, B:107:0x0120, B:116:0x0069, B:119:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0146 A[Catch: all -> 0x0207, TryCatch #1 {all -> 0x0207, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:49:0x0186, B:50:0x018b, B:52:0x018f, B:104:0x010c, B:107:0x0120, B:116:0x0069, B:119:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0186 A[Catch: all -> 0x0207, TryCatch #1 {all -> 0x0207, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:49:0x0186, B:50:0x018b, B:52:0x018f, B:104:0x010c, B:107:0x0120, B:116:0x0069, B:119:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018f A[Catch: all -> 0x0207, TRY_LEAVE, TryCatch #1 {all -> 0x0207, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:49:0x0186, B:50:0x018b, B:52:0x018f, B:104:0x010c, B:107:0x0120, B:116:0x0069, B:119:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[LOOP:0: B:2:0x0004->B:83:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e5 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh() throws IOException {
        int i;
        int i2;
        boolean z;
        int i3;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z2;
        List list5;
        int i4;
        zzgt zzgtVar;
        zzvj zzvjVar;
        zzp zzpVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        while (!this.zzi) {
            try {
                long j = this.zzh.zza;
                zzfy zzi = zzi(j);
                this.zzl = zzi;
                long zzb = this.zzd.zzb(zzi);
                if (this.zzi) {
                    zzuy zzuyVar = this.zze;
                    if (zzuyVar.zzb() != -1) {
                        this.zzh.zza = zzuyVar.zzb();
                    }
                    zzfu.zza(this.zzd);
                    return;
                }
                if (zzb != -1) {
                    zzb += j;
                    zzvj.zzC(this.zza);
                }
                long j2 = zzb;
                zzvj zzvjVar2 = this.zza;
                Map zze = this.zzd.zze();
                List list6 = (List) zze.get("icy-br");
                if (list6 != null) {
                    String str4 = (String) list6.get(0);
                    try {
                        i9 = Integer.parseInt(str4) * 1000;
                    } catch (NumberFormatException unused) {
                        i9 = -1;
                    }
                    if (i9 > 0) {
                        i3 = i9;
                        z = true;
                        list = (List) zze.get("icy-genre");
                        if (list != null) {
                            str = (String) list.get(0);
                            z = true;
                        } else {
                            str = null;
                        }
                        list2 = (List) zze.get("icy-name");
                        if (list2 != null) {
                            str2 = (String) list2.get(0);
                            z = true;
                        } else {
                            str2 = null;
                        }
                        list3 = (List) zze.get("icy-url");
                        if (list3 != null) {
                            str3 = (String) list3.get(0);
                            z = true;
                        } else {
                            str3 = null;
                        }
                        list4 = (List) zze.get("icy-pub");
                        if (list4 != null) {
                            z2 = ((String) list4.get(0)).equals("1");
                            z = true;
                        } else {
                            z2 = false;
                        }
                        list5 = (List) zze.get("icy-metaint");
                        if (list5 != null) {
                            String str5 = (String) list5.get(0);
                            try {
                                i8 = Integer.parseInt(str5);
                            } catch (NumberFormatException unused2) {
                                i8 = -1;
                            }
                            if (i8 > 0) {
                                i4 = i8;
                                z = true;
                                zzvjVar2.zzs = z ? new zzafn(i3, str, str2, str3, z2, i4) : null;
                                zzgtVar = this.zzd;
                                zzvjVar = this.zza;
                                if (zzvjVar.zzs != null || zzvjVar.zzs.zzf == -1) {
                                    zzpVar = zzgtVar;
                                } else {
                                    zzp zztyVar = new zzty(zzgtVar, zzvjVar.zzs.zzf, this);
                                    zzadp zzv = this.zza.zzv();
                                    this.zzm = zzv;
                                    zzv.zzl(zzvj.zzc);
                                    zzpVar = zztyVar;
                                }
                                this.zze.zzd(zzpVar, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                                if (this.zza.zzs != null) {
                                    this.zze.zzc();
                                }
                                if (this.zzj) {
                                    this.zze.zzf(j, this.zzk);
                                    try {
                                        this.zzj = false;
                                    } catch (Throwable th) {
                                        th = th;
                                        i = 1;
                                        i2 = 0;
                                        if (i2 != i) {
                                        }
                                        zzfu.zza(this.zzd);
                                        throw th;
                                    }
                                }
                                long j3 = j;
                                i5 = 0;
                                while (true) {
                                    if (i5 != 0) {
                                        i6 = 1;
                                        break;
                                    }
                                    try {
                                        if (this.zzi) {
                                            i6 = 1;
                                            i5 = 0;
                                            break;
                                        }
                                        try {
                                            this.zzg.zza();
                                            i5 = this.zze.zza(this.zzh);
                                            long zzb2 = this.zze.zzb();
                                            if (zzb2 > this.zza.zzj + j3) {
                                                this.zzg.zzc();
                                                zzvj zzvjVar3 = this.zza;
                                                zzvjVar3.zzq.post(zzvjVar3.zzp);
                                                j3 = zzb2;
                                            }
                                        } catch (InterruptedException unused3) {
                                            throw new InterruptedIOException();
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        i2 = i5;
                                        i = 1;
                                        if (i2 != i) {
                                            zzuy zzuyVar2 = this.zze;
                                            if (zzuyVar2.zzb() != -1) {
                                                this.zzh.zza = zzuyVar2.zzb();
                                            }
                                        }
                                        zzfu.zza(this.zzd);
                                        throw th;
                                    }
                                }
                                if (i5 == i6) {
                                    i7 = 0;
                                } else {
                                    zzuy zzuyVar3 = this.zze;
                                    if (zzuyVar3.zzb() != -1) {
                                        this.zzh.zza = zzuyVar3.zzb();
                                    }
                                    i7 = i5;
                                }
                                zzfu.zza(this.zzd);
                                if (i7 != 0) {
                                    return;
                                }
                            } else {
                                try {
                                    zzea.zzf("IcyHeaders", "Invalid metadata interval: " + str5);
                                } catch (NumberFormatException unused4) {
                                    zzea.zzf("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str5)));
                                    i4 = i8;
                                    zzvjVar2.zzs = z ? new zzafn(i3, str, str2, str3, z2, i4) : null;
                                    zzgtVar = this.zzd;
                                    zzvjVar = this.zza;
                                    if (zzvjVar.zzs != null) {
                                    }
                                    zzpVar = zzgtVar;
                                    this.zze.zzd(zzpVar, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                                    if (this.zza.zzs != null) {
                                    }
                                    if (this.zzj) {
                                    }
                                    long j32 = j;
                                    i5 = 0;
                                    while (true) {
                                        if (i5 != 0) {
                                        }
                                    }
                                    if (i5 == i6) {
                                    }
                                    zzfu.zza(this.zzd);
                                    if (i7 != 0) {
                                    }
                                }
                            }
                        }
                        i4 = -1;
                        zzvjVar2.zzs = z ? new zzafn(i3, str, str2, str3, z2, i4) : null;
                        zzgtVar = this.zzd;
                        zzvjVar = this.zza;
                        if (zzvjVar.zzs != null) {
                        }
                        zzpVar = zzgtVar;
                        this.zze.zzd(zzpVar, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                        if (this.zza.zzs != null) {
                        }
                        if (this.zzj) {
                        }
                        long j322 = j;
                        i5 = 0;
                        while (true) {
                            if (i5 != 0) {
                            }
                        }
                        if (i5 == i6) {
                        }
                        zzfu.zza(this.zzd);
                        if (i7 != 0) {
                        }
                    } else {
                        try {
                            zzea.zzf("IcyHeaders", "Invalid bitrate: " + str4);
                        } catch (NumberFormatException unused5) {
                            zzea.zzf("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str4)));
                            i3 = i9;
                            z = false;
                            list = (List) zze.get("icy-genre");
                            if (list != null) {
                            }
                            list2 = (List) zze.get("icy-name");
                            if (list2 != null) {
                            }
                            list3 = (List) zze.get("icy-url");
                            if (list3 != null) {
                            }
                            list4 = (List) zze.get("icy-pub");
                            if (list4 != null) {
                            }
                            list5 = (List) zze.get("icy-metaint");
                            if (list5 != null) {
                            }
                            i4 = -1;
                            zzvjVar2.zzs = z ? new zzafn(i3, str, str2, str3, z2, i4) : null;
                            zzgtVar = this.zzd;
                            zzvjVar = this.zza;
                            if (zzvjVar.zzs != null) {
                            }
                            zzpVar = zzgtVar;
                            this.zze.zzd(zzpVar, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                            if (this.zza.zzs != null) {
                            }
                            if (this.zzj) {
                            }
                            long j3222 = j;
                            i5 = 0;
                            while (true) {
                                if (i5 != 0) {
                                }
                            }
                            if (i5 == i6) {
                            }
                            zzfu.zza(this.zzd);
                            if (i7 != 0) {
                            }
                        }
                    }
                }
                z = false;
                i3 = -1;
                list = (List) zze.get("icy-genre");
                if (list != null) {
                }
                list2 = (List) zze.get("icy-name");
                if (list2 != null) {
                }
                list3 = (List) zze.get("icy-url");
                if (list3 != null) {
                }
                list4 = (List) zze.get("icy-pub");
                if (list4 != null) {
                }
                list5 = (List) zze.get("icy-metaint");
                if (list5 != null) {
                }
                i4 = -1;
                zzvjVar2.zzs = z ? new zzafn(i3, str, str2, str3, z2, i4) : null;
                zzgtVar = this.zzd;
                zzvjVar = this.zza;
                if (zzvjVar.zzs != null) {
                }
                zzpVar = zzgtVar;
                this.zze.zzd(zzpVar, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                if (this.zza.zzs != null) {
                }
                if (this.zzj) {
                }
                long j32222 = j;
                i5 = 0;
                while (true) {
                    if (i5 != 0) {
                    }
                }
                if (i5 == i6) {
                }
                zzfu.zza(this.zzd);
                if (i7 != 0) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztx
    public final void zza(zzek zzekVar) {
        long max = !this.zzn ? this.zzk : Math.max(zzvj.zzr(this.zza, true), this.zzk);
        int zzb = zzekVar.zzb();
        zzadp zzadpVar = this.zzm;
        zzadpVar.getClass();
        zzadn.zzb(zzadpVar, zzekVar, zzb);
        zzadpVar.zzs(max, 1, zzb, 0, null);
        this.zzn = true;
    }
}
