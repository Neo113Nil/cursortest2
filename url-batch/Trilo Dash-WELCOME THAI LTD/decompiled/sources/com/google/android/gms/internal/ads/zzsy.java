package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzsy implements zzwg, zzrq {
    final /* synthetic */ zztd zza;
    private final Uri zzc;
    private final zzfs zzd;
    private final zzsu zze;
    private final zzyv zzf;
    private final zzcz zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzzz zzn;
    private boolean zzo;
    private final zzzs zzh = new zzzs();
    private boolean zzj = true;
    private long zzm = -1;
    private final long zzb = zzrs.zza();
    private zzew zzl = zzj(0);

    public zzsy(zztd zztdVar, Uri uri, zzer zzerVar, zzsu zzsuVar, zzyv zzyvVar, zzcz zzczVar) {
        this.zza = zztdVar;
        this.zzc = uri;
        this.zzd = new zzfs(zzerVar);
        this.zze = zzsuVar;
        this.zzf = zzyvVar;
        this.zzg = zzczVar;
    }

    static /* bridge */ /* synthetic */ void zzg(zzsy zzsyVar, long j, long j2) {
        zzsyVar.zzh.zza = j;
        zzsyVar.zzk = j2;
        zzsyVar.zzj = true;
        zzsyVar.zzo = false;
    }

    private final zzew zzj(long j) {
        zzeu zzeuVar = new zzeu();
        zzeuVar.zzd(this.zzc);
        zzeuVar.zzc(j);
        zzeuVar.zza(6);
        zzeuVar.zzb(zztd.zzb);
        return zzeuVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzh() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083 A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x0078, B:21:0x0083, B:22:0x008f, B:24:0x0099, B:25:0x00a5, B:27:0x00af, B:28:0x00bb, B:30:0x00c5, B:31:0x00d7, B:33:0x00e1, B:35:0x00e7, B:40:0x0116, B:41:0x011c, B:43:0x0129, B:45:0x0131, B:46:0x014d, B:48:0x016c, B:49:0x0171, B:51:0x0175, B:94:0x00ef, B:98:0x0106, B:107:0x004a, B:111:0x0064), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x0078, B:21:0x0083, B:22:0x008f, B:24:0x0099, B:25:0x00a5, B:27:0x00af, B:28:0x00bb, B:30:0x00c5, B:31:0x00d7, B:33:0x00e1, B:35:0x00e7, B:40:0x0116, B:41:0x011c, B:43:0x0129, B:45:0x0131, B:46:0x014d, B:48:0x016c, B:49:0x0171, B:51:0x0175, B:94:0x00ef, B:98:0x0106, B:107:0x004a, B:111:0x0064), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x0078, B:21:0x0083, B:22:0x008f, B:24:0x0099, B:25:0x00a5, B:27:0x00af, B:28:0x00bb, B:30:0x00c5, B:31:0x00d7, B:33:0x00e1, B:35:0x00e7, B:40:0x0116, B:41:0x011c, B:43:0x0129, B:45:0x0131, B:46:0x014d, B:48:0x016c, B:49:0x0171, B:51:0x0175, B:94:0x00ef, B:98:0x0106, B:107:0x004a, B:111:0x0064), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5 A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x0078, B:21:0x0083, B:22:0x008f, B:24:0x0099, B:25:0x00a5, B:27:0x00af, B:28:0x00bb, B:30:0x00c5, B:31:0x00d7, B:33:0x00e1, B:35:0x00e7, B:40:0x0116, B:41:0x011c, B:43:0x0129, B:45:0x0131, B:46:0x014d, B:48:0x016c, B:49:0x0171, B:51:0x0175, B:94:0x00ef, B:98:0x0106, B:107:0x004a, B:111:0x0064), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1 A[Catch: all -> 0x01e3, TRY_LEAVE, TryCatch #3 {all -> 0x01e3, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x0078, B:21:0x0083, B:22:0x008f, B:24:0x0099, B:25:0x00a5, B:27:0x00af, B:28:0x00bb, B:30:0x00c5, B:31:0x00d7, B:33:0x00e1, B:35:0x00e7, B:40:0x0116, B:41:0x011c, B:43:0x0129, B:45:0x0131, B:46:0x014d, B:48:0x016c, B:49:0x0171, B:51:0x0175, B:94:0x00ef, B:98:0x0106, B:107:0x004a, B:111:0x0064), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0116 A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x0078, B:21:0x0083, B:22:0x008f, B:24:0x0099, B:25:0x00a5, B:27:0x00af, B:28:0x00bb, B:30:0x00c5, B:31:0x00d7, B:33:0x00e1, B:35:0x00e7, B:40:0x0116, B:41:0x011c, B:43:0x0129, B:45:0x0131, B:46:0x014d, B:48:0x016c, B:49:0x0171, B:51:0x0175, B:94:0x00ef, B:98:0x0106, B:107:0x004a, B:111:0x0064), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129 A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x0078, B:21:0x0083, B:22:0x008f, B:24:0x0099, B:25:0x00a5, B:27:0x00af, B:28:0x00bb, B:30:0x00c5, B:31:0x00d7, B:33:0x00e1, B:35:0x00e7, B:40:0x0116, B:41:0x011c, B:43:0x0129, B:45:0x0131, B:46:0x014d, B:48:0x016c, B:49:0x0171, B:51:0x0175, B:94:0x00ef, B:98:0x0106, B:107:0x004a, B:111:0x0064), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016c A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x0078, B:21:0x0083, B:22:0x008f, B:24:0x0099, B:25:0x00a5, B:27:0x00af, B:28:0x00bb, B:30:0x00c5, B:31:0x00d7, B:33:0x00e1, B:35:0x00e7, B:40:0x0116, B:41:0x011c, B:43:0x0129, B:45:0x0131, B:46:0x014d, B:48:0x016c, B:49:0x0171, B:51:0x0175, B:94:0x00ef, B:98:0x0106, B:107:0x004a, B:111:0x0064), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0175 A[Catch: all -> 0x01e3, TRY_LEAVE, TryCatch #3 {all -> 0x01e3, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x0078, B:21:0x0083, B:22:0x008f, B:24:0x0099, B:25:0x00a5, B:27:0x00af, B:28:0x00bb, B:30:0x00c5, B:31:0x00d7, B:33:0x00e1, B:35:0x00e7, B:40:0x0116, B:41:0x011c, B:43:0x0129, B:45:0x0131, B:46:0x014d, B:48:0x016c, B:49:0x0171, B:51:0x0175, B:94:0x00ef, B:98:0x0106, B:107:0x004a, B:111:0x0064), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[LOOP:0: B:2:0x0004->B:82:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c3 A[EDGE_INSN: B:91:0x01c3->B:72:0x01c3 BREAK  A[LOOP:1: B:53:0x0180->B:64:0x0180], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzwg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi() throws IOException {
        boolean z;
        int i;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z2;
        List list5;
        int i2;
        zzfs zzfsVar;
        zztd zztdVar;
        zzp zzpVar;
        int i3;
        int i4;
        int i5;
        while (!this.zzi) {
            int i6 = 0;
            try {
                long j = this.zzh.zza;
                zzew zzj = zzj(j);
                this.zzl = zzj;
                long zzb = this.zzd.zzb(zzj);
                this.zzm = zzb;
                if (zzb != -1) {
                    this.zzm = zzb + j;
                }
                zztd zztdVar2 = this.zza;
                Map zze = this.zzd.zze();
                List list6 = (List) zze.get("icy-br");
                if (list6 != null) {
                    String str4 = (String) list6.get(0);
                    try {
                        i5 = Integer.parseInt(str4) * 1000;
                        if (i5 > 0) {
                            z = true;
                        } else {
                            try {
                                Log.w("IcyHeaders", "Invalid bitrate: " + str4);
                                z = false;
                                i5 = -1;
                            } catch (NumberFormatException unused) {
                                Log.w("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str4)));
                                i = i5;
                                z = false;
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
                                zztdVar2.zzr = z ? new zzabl(i, str, str2, str3, z2, i2) : null;
                                zzfsVar = this.zzd;
                                zztdVar = this.zza;
                                if (zztdVar.zzr != null) {
                                }
                                zzpVar = zzfsVar;
                                this.zze.zzd(zzpVar, this.zzc, this.zzd.zze(), j, this.zzm, this.zzf);
                                if (this.zza.zzr != null) {
                                }
                                if (this.zzj) {
                                }
                                long j2 = j;
                                i3 = 0;
                                while (true) {
                                    if (i3 != 0) {
                                    }
                                }
                                if (i3 != 1) {
                                }
                                zzet.zza(this.zzd);
                                if (i6 != 0) {
                                }
                            }
                        }
                        i = i5;
                    } catch (NumberFormatException unused2) {
                        i5 = -1;
                    }
                } else {
                    z = false;
                    i = -1;
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
                        i4 = Integer.parseInt(str5);
                        if (i4 > 0) {
                            z = true;
                        } else {
                            try {
                                Log.w("IcyHeaders", "Invalid metadata interval: " + str5);
                                i4 = -1;
                            } catch (NumberFormatException unused3) {
                                Log.w("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str5)));
                                i2 = i4;
                                zztdVar2.zzr = z ? new zzabl(i, str, str2, str3, z2, i2) : null;
                                zzfsVar = this.zzd;
                                zztdVar = this.zza;
                                if (zztdVar.zzr != null) {
                                }
                                zzpVar = zzfsVar;
                                this.zze.zzd(zzpVar, this.zzc, this.zzd.zze(), j, this.zzm, this.zzf);
                                if (this.zza.zzr != null) {
                                }
                                if (this.zzj) {
                                }
                                long j22 = j;
                                i3 = 0;
                                while (true) {
                                    if (i3 != 0) {
                                    }
                                }
                                if (i3 != 1) {
                                }
                                zzet.zza(this.zzd);
                                if (i6 != 0) {
                                }
                            }
                        }
                    } catch (NumberFormatException unused4) {
                        i4 = -1;
                    }
                    i2 = i4;
                } else {
                    i2 = -1;
                }
                zztdVar2.zzr = z ? new zzabl(i, str, str2, str3, z2, i2) : null;
                zzfsVar = this.zzd;
                zztdVar = this.zza;
                if (zztdVar.zzr != null || zztdVar.zzr.zzf == -1) {
                    zzpVar = zzfsVar;
                } else {
                    zzpVar = new zzrr(zzfsVar, zztdVar.zzr.zzf, this);
                    zzzz zzu = this.zza.zzu();
                    this.zzn = zzu;
                    zzu.zzk(zztd.zzc);
                }
                this.zze.zzd(zzpVar, this.zzc, this.zzd.zze(), j, this.zzm, this.zzf);
                if (this.zza.zzr != null) {
                    this.zze.zzc();
                }
                if (this.zzj) {
                    this.zze.zzf(j, this.zzk);
                    this.zzj = false;
                }
                long j222 = j;
                i3 = 0;
                while (true) {
                    if (i3 != 0) {
                        break;
                    }
                    try {
                        if (this.zzi) {
                            i3 = 0;
                            break;
                        }
                        try {
                            this.zzg.zza();
                            i3 = this.zze.zza(this.zzh);
                            long zzb2 = this.zze.zzb();
                            if (zzb2 > this.zza.zzj + j222) {
                                this.zzg.zzc();
                                zztd zztdVar3 = this.zza;
                                zztdVar3.zzp.post(zztdVar3.zzo);
                                j222 = zzb2;
                            }
                        } catch (InterruptedException unused5) {
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        th = th;
                        i6 = i3;
                        if (i6 != 1) {
                            zzsu zzsuVar = this.zze;
                            if (zzsuVar.zzb() != -1) {
                                this.zzh.zza = zzsuVar.zzb();
                            }
                        }
                        zzet.zza(this.zzd);
                        throw th;
                    }
                }
                if (i3 != 1) {
                    zzsu zzsuVar2 = this.zze;
                    if (zzsuVar2.zzb() != -1) {
                        this.zzh.zza = zzsuVar2.zzb();
                    }
                    i6 = i3;
                }
                zzet.zza(this.zzd);
                if (i6 != 0) {
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrq
    public final void zza(zzdy zzdyVar) {
        long max = !this.zzo ? this.zzk : Math.max(this.zza.zzO(), this.zzk);
        int zza = zzdyVar.zza();
        zzzz zzzzVar = this.zzn;
        Objects.requireNonNull(zzzzVar);
        zzzx.zzb(zzzzVar, zzdyVar, zza);
        zzzzVar.zzs(max, 1, zza, 0, null);
        this.zzo = true;
    }
}
