package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zztg implements zzws, zzrx {
    final /* synthetic */ zztl zza;
    private final Uri zzc;
    private final zzfy zzd;
    private final zztb zze;
    private final zzzl zzf;
    private final zzdg zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzaap zzm;
    private boolean zzn;
    private final zzaai zzh = new zzaai();
    private boolean zzj = true;
    private final long zzb = zzrz.zza();
    private zzfc zzl = zzi(0);

    public zztg(zztl zztlVar, Uri uri, zzex zzexVar, zztb zztbVar, zzzl zzzlVar, zzdg zzdgVar) {
        this.zza = zztlVar;
        this.zzc = uri;
        this.zzd = new zzfy(zzexVar);
        this.zze = zztbVar;
        this.zzf = zzzlVar;
        this.zzg = zzdgVar;
    }

    static /* bridge */ /* synthetic */ void zzf(zztg zztgVar, long j, long j2) {
        zztgVar.zzh.zza = j;
        zztgVar.zzk = j2;
        zztgVar.zzj = true;
        zztgVar.zzn = false;
    }

    private final zzfc zzi(long j) {
        zzfa zzfaVar = new zzfa();
        zzfaVar.zzd(this.zzc);
        zzfaVar.zzc(j);
        zzfaVar.zza(6);
        zzfaVar.zzb(zztl.zzb);
        return zzfaVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzws
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c6 A[EDGE_INSN: B:100:0x01c6->B:78:0x01c6 BREAK  A[LOOP:1: B:59:0x0183->B:70:0x0183], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[Catch: all -> 0x01eb, TryCatch #7 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:19:0x0077, B:21:0x0082, B:22:0x008e, B:24:0x0098, B:25:0x00a4, B:27:0x00ae, B:28:0x00ba, B:30:0x00c4, B:31:0x00d6, B:33:0x00e0, B:35:0x00e6, B:40:0x0115, B:41:0x011c, B:43:0x0129, B:45:0x0131, B:46:0x014e, B:110:0x00ee, B:114:0x0105, B:123:0x004b, B:127:0x0065), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098 A[Catch: all -> 0x01eb, TryCatch #7 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:19:0x0077, B:21:0x0082, B:22:0x008e, B:24:0x0098, B:25:0x00a4, B:27:0x00ae, B:28:0x00ba, B:30:0x00c4, B:31:0x00d6, B:33:0x00e0, B:35:0x00e6, B:40:0x0115, B:41:0x011c, B:43:0x0129, B:45:0x0131, B:46:0x014e, B:110:0x00ee, B:114:0x0105, B:123:0x004b, B:127:0x0065), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae A[Catch: all -> 0x01eb, TryCatch #7 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:19:0x0077, B:21:0x0082, B:22:0x008e, B:24:0x0098, B:25:0x00a4, B:27:0x00ae, B:28:0x00ba, B:30:0x00c4, B:31:0x00d6, B:33:0x00e0, B:35:0x00e6, B:40:0x0115, B:41:0x011c, B:43:0x0129, B:45:0x0131, B:46:0x014e, B:110:0x00ee, B:114:0x0105, B:123:0x004b, B:127:0x0065), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4 A[Catch: all -> 0x01eb, TryCatch #7 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:19:0x0077, B:21:0x0082, B:22:0x008e, B:24:0x0098, B:25:0x00a4, B:27:0x00ae, B:28:0x00ba, B:30:0x00c4, B:31:0x00d6, B:33:0x00e0, B:35:0x00e6, B:40:0x0115, B:41:0x011c, B:43:0x0129, B:45:0x0131, B:46:0x014e, B:110:0x00ee, B:114:0x0105, B:123:0x004b, B:127:0x0065), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0 A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #7 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:19:0x0077, B:21:0x0082, B:22:0x008e, B:24:0x0098, B:25:0x00a4, B:27:0x00ae, B:28:0x00ba, B:30:0x00c4, B:31:0x00d6, B:33:0x00e0, B:35:0x00e6, B:40:0x0115, B:41:0x011c, B:43:0x0129, B:45:0x0131, B:46:0x014e, B:110:0x00ee, B:114:0x0105, B:123:0x004b, B:127:0x0065), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0115 A[Catch: all -> 0x01eb, TryCatch #7 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:19:0x0077, B:21:0x0082, B:22:0x008e, B:24:0x0098, B:25:0x00a4, B:27:0x00ae, B:28:0x00ba, B:30:0x00c4, B:31:0x00d6, B:33:0x00e0, B:35:0x00e6, B:40:0x0115, B:41:0x011c, B:43:0x0129, B:45:0x0131, B:46:0x014e, B:110:0x00ee, B:114:0x0105, B:123:0x004b, B:127:0x0065), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129 A[Catch: all -> 0x01eb, TryCatch #7 {all -> 0x01eb, blocks: (B:6:0x000b, B:8:0x001f, B:9:0x0025, B:12:0x003b, B:14:0x0041, B:19:0x0077, B:21:0x0082, B:22:0x008e, B:24:0x0098, B:25:0x00a4, B:27:0x00ae, B:28:0x00ba, B:30:0x00c4, B:31:0x00d6, B:33:0x00e0, B:35:0x00e6, B:40:0x0115, B:41:0x011c, B:43:0x0129, B:45:0x0131, B:46:0x014e, B:110:0x00ee, B:114:0x0105, B:123:0x004b, B:127:0x0065), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0169 A[Catch: all -> 0x01e8, TryCatch #5 {all -> 0x01e8, blocks: (B:49:0x015e, B:51:0x0169, B:52:0x016e, B:54:0x0172), top: B:48:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0172 A[Catch: all -> 0x01e8, TRY_LEAVE, TryCatch #5 {all -> 0x01e8, blocks: (B:49:0x015e, B:51:0x0169, B:52:0x016e, B:54:0x0172), top: B:48:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0185 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[LOOP:0: B:2:0x0004->B:86:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f1  */
    @Override // com.google.android.gms.internal.ads.zzws
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
        zzfy zzfyVar;
        zztl zztlVar;
        zzr zzrVar;
        int i5;
        int i6;
        int i7;
        int i8;
        while (!this.zzi) {
            try {
                long j = this.zzh.zza;
                zzfc zzi = zzi(j);
                this.zzl = zzi;
                long zzb = this.zzd.zzb(zzi);
                if (zzb != -1) {
                    zzb += j;
                    zztl.zzB(this.zza);
                }
                long j2 = zzb;
                zztl zztlVar2 = this.zza;
                Map zze = this.zzd.zze();
                List list6 = (List) zze.get("icy-br");
                if (list6 != null) {
                    String str4 = (String) list6.get(0);
                    try {
                        i8 = Integer.parseInt(str4) * 1000;
                        if (i8 > 0) {
                            z = true;
                        } else {
                            try {
                                zzdw.zze("IcyHeaders", "Invalid bitrate: " + str4);
                                z = false;
                                i8 = -1;
                            } catch (NumberFormatException unused) {
                                zzdw.zze("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str4)));
                                z = false;
                                i3 = i8;
                                list = (List) zze.get("icy-genre");
                                if (list == null) {
                                }
                                list2 = (List) zze.get("icy-name");
                                if (list2 == null) {
                                }
                                list3 = (List) zze.get("icy-url");
                                if (list3 == null) {
                                }
                                list4 = (List) zze.get("icy-pub");
                                if (list4 == null) {
                                }
                                list5 = (List) zze.get("icy-metaint");
                                if (list5 == null) {
                                }
                                zztlVar2.zzr = z ? new zzacm(i3, str, str2, str3, z2, i4) : null;
                                zzfyVar = this.zzd;
                                zztlVar = this.zza;
                                if (zztlVar.zzr != null) {
                                }
                                zzrVar = zzfyVar;
                                this.zze.zzd(zzrVar, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                                if (this.zza.zzr != null) {
                                }
                                if (this.zzj) {
                                }
                                long j3 = j;
                                i5 = i;
                                while (true) {
                                    if (i5 != 0) {
                                    }
                                }
                                if (i5 == 1) {
                                }
                                zzez.zza(this.zzd);
                                if (i6 != 0) {
                                }
                            }
                        }
                    } catch (NumberFormatException unused2) {
                        i8 = -1;
                    }
                    i3 = i8;
                } else {
                    z = false;
                    i3 = -1;
                }
                list = (List) zze.get("icy-genre");
                if (list == null) {
                    str = (String) list.get(0);
                    z = true;
                } else {
                    str = null;
                }
                list2 = (List) zze.get("icy-name");
                if (list2 == null) {
                    str2 = (String) list2.get(0);
                    z = true;
                } else {
                    str2 = null;
                }
                list3 = (List) zze.get("icy-url");
                if (list3 == null) {
                    str3 = (String) list3.get(0);
                    z = true;
                } else {
                    str3 = null;
                }
                list4 = (List) zze.get("icy-pub");
                if (list4 == null) {
                    z2 = ((String) list4.get(0)).equals("1");
                    z = true;
                } else {
                    z2 = false;
                }
                list5 = (List) zze.get("icy-metaint");
                if (list5 == null) {
                    String str5 = (String) list5.get(0);
                    try {
                        i7 = Integer.parseInt(str5);
                        if (i7 > 0) {
                            z = true;
                        } else {
                            try {
                                zzdw.zze("IcyHeaders", "Invalid metadata interval: " + str5);
                                i7 = -1;
                            } catch (NumberFormatException unused3) {
                                zzdw.zze("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str5)));
                                i4 = i7;
                                zztlVar2.zzr = z ? new zzacm(i3, str, str2, str3, z2, i4) : null;
                                zzfyVar = this.zzd;
                                zztlVar = this.zza;
                                if (zztlVar.zzr != null) {
                                }
                                zzrVar = zzfyVar;
                                this.zze.zzd(zzrVar, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                                if (this.zza.zzr != null) {
                                }
                                if (this.zzj) {
                                }
                                long j32 = j;
                                i5 = i;
                                while (true) {
                                    if (i5 != 0) {
                                    }
                                }
                                if (i5 == 1) {
                                }
                                zzez.zza(this.zzd);
                                if (i6 != 0) {
                                }
                            }
                        }
                    } catch (NumberFormatException unused4) {
                        i7 = -1;
                    }
                    i4 = i7;
                } else {
                    i4 = -1;
                }
                zztlVar2.zzr = z ? new zzacm(i3, str, str2, str3, z2, i4) : null;
                zzfyVar = this.zzd;
                zztlVar = this.zza;
                if (zztlVar.zzr != null || zztlVar.zzr.zzf == -1) {
                    zzrVar = zzfyVar;
                } else {
                    zzr zzryVar = new zzry(zzfyVar, zztlVar.zzr.zzf, this);
                    zzaap zzu = this.zza.zzu();
                    this.zzm = zzu;
                    zzu.zzk(zztl.zzc);
                    zzrVar = zzryVar;
                }
                try {
                    this.zze.zzd(zzrVar, this.zzc, this.zzd.zze(), j, j2, this.zzf);
                    if (this.zza.zzr != null) {
                        this.zze.zzc();
                    }
                    if (this.zzj) {
                        this.zze.zzf(j, this.zzk);
                        i = 0;
                        try {
                            this.zzj = false;
                        } catch (Throwable th) {
                            th = th;
                            i2 = i;
                            if (i2 != 1) {
                            }
                            zzez.zza(this.zzd);
                            throw th;
                        }
                    } else {
                        i = 0;
                    }
                    long j322 = j;
                    i5 = i;
                    while (true) {
                        if (i5 != 0) {
                            break;
                        }
                        try {
                            if (this.zzi) {
                                i5 = i;
                                break;
                            }
                            try {
                                this.zzg.zza();
                                i5 = this.zze.zza(this.zzh);
                                long zzb2 = this.zze.zzb();
                                if (zzb2 > this.zza.zzj + j322) {
                                    this.zzg.zzc();
                                    zztl zztlVar3 = this.zza;
                                    zztlVar3.zzp.post(zztlVar3.zzo);
                                    j322 = zzb2;
                                }
                            } catch (InterruptedException unused5) {
                                throw new InterruptedIOException();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i2 = i5;
                            if (i2 != 1) {
                                zztb zztbVar = this.zze;
                                if (zztbVar.zzb() != -1) {
                                    this.zzh.zza = zztbVar.zzb();
                                }
                            }
                            zzez.zza(this.zzd);
                            throw th;
                        }
                    }
                    if (i5 == 1) {
                        i6 = i;
                    } else {
                        zztb zztbVar2 = this.zze;
                        if (zztbVar2.zzb() != -1) {
                            this.zzh.zza = zztbVar2.zzb();
                        }
                        i6 = i5;
                    }
                    zzez.zza(this.zzd);
                    if (i6 != 0) {
                        return;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i = 0;
                }
            } catch (Throwable th4) {
                th = th4;
                i = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zza(zzef zzefVar) {
        long max = !this.zzn ? this.zzk : Math.max(zztl.zzq(this.zza, true), this.zzk);
        int zza = zzefVar.zza();
        zzaap zzaapVar = this.zzm;
        Objects.requireNonNull(zzaapVar);
        zzaan.zzb(zzaapVar, zzefVar, zza);
        zzaapVar.zzs(max, 1, zza, 0, null);
        this.zzn = true;
    }
}
