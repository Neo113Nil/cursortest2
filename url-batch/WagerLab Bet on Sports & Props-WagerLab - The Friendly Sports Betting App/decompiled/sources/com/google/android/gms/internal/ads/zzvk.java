package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzvk implements zzzd, zzue {
    final /* synthetic */ zzvt zza;
    private final long zzb;
    private final Uri zzc;
    private final zzgx zzd;
    private final zzvi zze;
    private final zzacx zzf;
    private final zzde zzg;
    private final zzads zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private zzge zzl;
    private zzaeb zzm;
    private boolean zzn;

    public zzvk(zzvt zzvtVar, Uri uri, zzga zzgaVar, zzvi zzviVar, zzacx zzacxVar, zzde zzdeVar) {
        Objects.requireNonNull(zzvtVar);
        this.zza = zzvtVar;
        this.zzc = uri;
        this.zzd = new zzgx(zzgaVar);
        this.zze = zzviVar;
        this.zzf = zzacxVar;
        this.zzg = zzdeVar;
        this.zzh = new zzads();
        this.zzj = true;
        this.zzb = zzug.zza();
        this.zzl = zzi(0L);
    }

    private final zzge zzi(long j) {
        Map map;
        zzgd zzgdVar = new zzgd();
        zzgdVar.zza(this.zzc);
        zzgdVar.zzc(j);
        zzgdVar.zzd(6);
        map = zzvt.zzb;
        zzgdVar.zzb(map);
        return zzgdVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final void zzb() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad A[Catch: all -> 0x009c, TryCatch #4 {all -> 0x009c, blocks: (B:104:0x005a, B:106:0x0060, B:16:0x00a2, B:18:0x00ad, B:19:0x00b9, B:21:0x00c3, B:22:0x00cf, B:24:0x00d9, B:25:0x00e5, B:27:0x00ef, B:28:0x0101, B:30:0x010b, B:32:0x0111, B:36:0x014e, B:37:0x0155, B:39:0x0162, B:41:0x016b, B:42:0x0186, B:44:0x0199, B:45:0x019c, B:47:0x01a0, B:92:0x011b, B:95:0x0139, B:111:0x006c, B:114:0x008a), top: B:103:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3 A[Catch: all -> 0x009c, TryCatch #4 {all -> 0x009c, blocks: (B:104:0x005a, B:106:0x0060, B:16:0x00a2, B:18:0x00ad, B:19:0x00b9, B:21:0x00c3, B:22:0x00cf, B:24:0x00d9, B:25:0x00e5, B:27:0x00ef, B:28:0x0101, B:30:0x010b, B:32:0x0111, B:36:0x014e, B:37:0x0155, B:39:0x0162, B:41:0x016b, B:42:0x0186, B:44:0x0199, B:45:0x019c, B:47:0x01a0, B:92:0x011b, B:95:0x0139, B:111:0x006c, B:114:0x008a), top: B:103:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9 A[Catch: all -> 0x009c, TryCatch #4 {all -> 0x009c, blocks: (B:104:0x005a, B:106:0x0060, B:16:0x00a2, B:18:0x00ad, B:19:0x00b9, B:21:0x00c3, B:22:0x00cf, B:24:0x00d9, B:25:0x00e5, B:27:0x00ef, B:28:0x0101, B:30:0x010b, B:32:0x0111, B:36:0x014e, B:37:0x0155, B:39:0x0162, B:41:0x016b, B:42:0x0186, B:44:0x0199, B:45:0x019c, B:47:0x01a0, B:92:0x011b, B:95:0x0139, B:111:0x006c, B:114:0x008a), top: B:103:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef A[Catch: all -> 0x009c, TryCatch #4 {all -> 0x009c, blocks: (B:104:0x005a, B:106:0x0060, B:16:0x00a2, B:18:0x00ad, B:19:0x00b9, B:21:0x00c3, B:22:0x00cf, B:24:0x00d9, B:25:0x00e5, B:27:0x00ef, B:28:0x0101, B:30:0x010b, B:32:0x0111, B:36:0x014e, B:37:0x0155, B:39:0x0162, B:41:0x016b, B:42:0x0186, B:44:0x0199, B:45:0x019c, B:47:0x01a0, B:92:0x011b, B:95:0x0139, B:111:0x006c, B:114:0x008a), top: B:103:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #4 {all -> 0x009c, blocks: (B:104:0x005a, B:106:0x0060, B:16:0x00a2, B:18:0x00ad, B:19:0x00b9, B:21:0x00c3, B:22:0x00cf, B:24:0x00d9, B:25:0x00e5, B:27:0x00ef, B:28:0x0101, B:30:0x010b, B:32:0x0111, B:36:0x014e, B:37:0x0155, B:39:0x0162, B:41:0x016b, B:42:0x0186, B:44:0x0199, B:45:0x019c, B:47:0x01a0, B:92:0x011b, B:95:0x0139, B:111:0x006c, B:114:0x008a), top: B:103:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014e A[Catch: all -> 0x009c, TryCatch #4 {all -> 0x009c, blocks: (B:104:0x005a, B:106:0x0060, B:16:0x00a2, B:18:0x00ad, B:19:0x00b9, B:21:0x00c3, B:22:0x00cf, B:24:0x00d9, B:25:0x00e5, B:27:0x00ef, B:28:0x0101, B:30:0x010b, B:32:0x0111, B:36:0x014e, B:37:0x0155, B:39:0x0162, B:41:0x016b, B:42:0x0186, B:44:0x0199, B:45:0x019c, B:47:0x01a0, B:92:0x011b, B:95:0x0139, B:111:0x006c, B:114:0x008a), top: B:103:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0162 A[Catch: all -> 0x009c, TryCatch #4 {all -> 0x009c, blocks: (B:104:0x005a, B:106:0x0060, B:16:0x00a2, B:18:0x00ad, B:19:0x00b9, B:21:0x00c3, B:22:0x00cf, B:24:0x00d9, B:25:0x00e5, B:27:0x00ef, B:28:0x0101, B:30:0x010b, B:32:0x0111, B:36:0x014e, B:37:0x0155, B:39:0x0162, B:41:0x016b, B:42:0x0186, B:44:0x0199, B:45:0x019c, B:47:0x01a0, B:92:0x011b, B:95:0x0139, B:111:0x006c, B:114:0x008a), top: B:103:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0199 A[Catch: all -> 0x009c, TryCatch #4 {all -> 0x009c, blocks: (B:104:0x005a, B:106:0x0060, B:16:0x00a2, B:18:0x00ad, B:19:0x00b9, B:21:0x00c3, B:22:0x00cf, B:24:0x00d9, B:25:0x00e5, B:27:0x00ef, B:28:0x0101, B:30:0x010b, B:32:0x0111, B:36:0x014e, B:37:0x0155, B:39:0x0162, B:41:0x016b, B:42:0x0186, B:44:0x0199, B:45:0x019c, B:47:0x01a0, B:92:0x011b, B:95:0x0139, B:111:0x006c, B:114:0x008a), top: B:103:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a0 A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #4 {all -> 0x009c, blocks: (B:104:0x005a, B:106:0x0060, B:16:0x00a2, B:18:0x00ad, B:19:0x00b9, B:21:0x00c3, B:22:0x00cf, B:24:0x00d9, B:25:0x00e5, B:27:0x00ef, B:28:0x0101, B:30:0x010b, B:32:0x0111, B:36:0x014e, B:37:0x0155, B:39:0x0162, B:41:0x016b, B:42:0x0186, B:44:0x0199, B:45:0x019c, B:47:0x01a0, B:92:0x011b, B:95:0x0139, B:111:0x006c, B:114:0x008a), top: B:103:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[LOOP:0: B:2:0x0002->B:79:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e1 A[EDGE_INSN: B:89:0x01e1->B:68:0x01e1 BREAK  A[LOOP:1: B:49:0x01a8->B:60:0x01a8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ff  */
    @Override // com.google.android.gms.internal.ads.zzzd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc() throws IOException {
        long j;
        int i;
        boolean z;
        int i2;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z2;
        List list5;
        int i3;
        zzgx zzgxVar;
        zzvt zzvtVar;
        zzga zzgaVar;
        int i4;
        zzu zzuVar;
        int i5;
        while (!this.zzi) {
            int i6 = 0;
            try {
                long j2 = this.zzh.zza;
                zzge zzi = zzi(j2);
                this.zzl = zzi;
                zzgx zzgxVar2 = this.zzd;
                long zzb = zzgxVar2.zzb(zzi);
                if (this.zzi) {
                    zzvi zzviVar = this.zze;
                    if (zzviVar.zzd() != -1) {
                        this.zzh.zza = zzviVar.zzd();
                    }
                    zzgc.zza(this.zzd);
                    return;
                }
                if (zzb != -1) {
                    zzb += j2;
                    this.zza.zzH();
                }
                long j3 = zzb;
                zzvt zzvtVar2 = this.zza;
                Map zzj = zzgxVar2.zzj();
                List list6 = (List) zzj.get("icy-br");
                j = -1;
                if (list6 != null) {
                    try {
                        String str4 = (String) list6.get(0);
                        try {
                            i = Integer.parseInt(str4) * 1000;
                        } catch (NumberFormatException unused) {
                            i = -1;
                        }
                        if (i > 0) {
                            i2 = i;
                            z = true;
                            list = (List) zzj.get("icy-genre");
                            if (list != null) {
                                str = (String) list.get(0);
                                z = true;
                            } else {
                                str = null;
                            }
                            list2 = (List) zzj.get("icy-name");
                            if (list2 != null) {
                                str2 = (String) list2.get(0);
                                z = true;
                            } else {
                                str2 = null;
                            }
                            list3 = (List) zzj.get("icy-url");
                            if (list3 != null) {
                                str3 = (String) list3.get(0);
                                z = true;
                            } else {
                                str3 = null;
                            }
                            list4 = (List) zzj.get("icy-pub");
                            if (list4 != null) {
                                z2 = ((String) list4.get(0)).equals("1");
                                z = true;
                            } else {
                                z2 = false;
                            }
                            list5 = (List) zzj.get("icy-metaint");
                            if (list5 != null) {
                                String str5 = (String) list5.get(0);
                                try {
                                    i5 = Integer.parseInt(str5);
                                } catch (NumberFormatException unused2) {
                                    i5 = -1;
                                }
                                if (i5 > 0) {
                                    i3 = i5;
                                    z = true;
                                    zzvtVar2.zzP(z ? new zzafw(i2, str, str2, str3, z2, i3) : null);
                                    zzgxVar = this.zzd;
                                    zzvtVar = this.zza;
                                    if (zzvtVar.zzO() != null || zzvtVar.zzO().zzf == -1) {
                                        zzgaVar = zzgxVar;
                                    } else {
                                        zzga zzufVar = new zzuf(zzgxVar, zzvtVar.zzO().zzf, this);
                                        zzaeb zzx = zzvtVar.zzx();
                                        this.zzm = zzx;
                                        zzuVar = zzvt.zzc;
                                        zzx.zzu(zzuVar);
                                        zzgaVar = zzufVar;
                                    }
                                    zzvi zzviVar2 = this.zze;
                                    zzviVar2.zza(zzgaVar, this.zzc, zzgxVar.zzj(), j2, j3, this.zzf);
                                    if (zzvtVar.zzO() != null) {
                                        zzviVar2.zzc();
                                    }
                                    if (this.zzj) {
                                        zzviVar2.zze(j2, this.zzk);
                                        this.zzj = false;
                                    }
                                    i4 = 0;
                                    while (true) {
                                        if (i4 != 0) {
                                            break;
                                        }
                                        try {
                                            if (this.zzi) {
                                                i4 = 0;
                                                break;
                                            }
                                            try {
                                                zzde zzdeVar = this.zzg;
                                                zzdeVar.zzc();
                                                i4 = zzviVar2.zzf(this.zzh);
                                                long zzd = zzviVar2.zzd();
                                                if (zzd > zzvtVar.zzL() + j2) {
                                                    zzdeVar.zzb();
                                                    zzvtVar.zzN().post(zzvtVar.zzM());
                                                    j2 = zzd;
                                                }
                                            } catch (InterruptedException unused3) {
                                                throw new InterruptedIOException();
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            i6 = i4;
                                            if (i6 != 1) {
                                            }
                                            zzgc.zza(this.zzd);
                                            throw th;
                                        }
                                    }
                                    if (i4 != 1) {
                                        if (zzviVar2.zzd() != -1) {
                                            this.zzh.zza = zzviVar2.zzd();
                                        }
                                        i6 = i4;
                                    }
                                    zzgc.zza(zzgxVar);
                                    if (i6 != 0) {
                                        return;
                                    }
                                } else {
                                    try {
                                        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 27);
                                        sb.append("Invalid metadata interval: ");
                                        sb.append(str5);
                                        zzds.zzc("IcyHeaders", sb.toString());
                                    } catch (NumberFormatException unused4) {
                                        String.valueOf(str5);
                                        zzds.zzc("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str5)));
                                        i3 = i5;
                                        zzvtVar2.zzP(z ? new zzafw(i2, str, str2, str3, z2, i3) : null);
                                        zzgxVar = this.zzd;
                                        zzvtVar = this.zza;
                                        if (zzvtVar.zzO() != null) {
                                        }
                                        zzgaVar = zzgxVar;
                                        zzvi zzviVar22 = this.zze;
                                        zzviVar22.zza(zzgaVar, this.zzc, zzgxVar.zzj(), j2, j3, this.zzf);
                                        if (zzvtVar.zzO() != null) {
                                        }
                                        if (this.zzj) {
                                        }
                                        i4 = 0;
                                        while (true) {
                                            if (i4 != 0) {
                                            }
                                        }
                                        if (i4 != 1) {
                                        }
                                        zzgc.zza(zzgxVar);
                                        if (i6 != 0) {
                                        }
                                    }
                                }
                            }
                            i3 = -1;
                            zzvtVar2.zzP(z ? new zzafw(i2, str, str2, str3, z2, i3) : null);
                            zzgxVar = this.zzd;
                            zzvtVar = this.zza;
                            if (zzvtVar.zzO() != null) {
                            }
                            zzgaVar = zzgxVar;
                            zzvi zzviVar222 = this.zze;
                            zzviVar222.zza(zzgaVar, this.zzc, zzgxVar.zzj(), j2, j3, this.zzf);
                            if (zzvtVar.zzO() != null) {
                            }
                            if (this.zzj) {
                            }
                            i4 = 0;
                            while (true) {
                                if (i4 != 0) {
                                }
                            }
                            if (i4 != 1) {
                            }
                            zzgc.zza(zzgxVar);
                            if (i6 != 0) {
                            }
                        } else {
                            try {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 17);
                                sb2.append("Invalid bitrate: ");
                                sb2.append(str4);
                                zzds.zzc("IcyHeaders", sb2.toString());
                            } catch (NumberFormatException unused5) {
                                String.valueOf(str4);
                                zzds.zzc("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str4)));
                                z = false;
                                i2 = i;
                                list = (List) zzj.get("icy-genre");
                                if (list != null) {
                                }
                                list2 = (List) zzj.get("icy-name");
                                if (list2 != null) {
                                }
                                list3 = (List) zzj.get("icy-url");
                                if (list3 != null) {
                                }
                                list4 = (List) zzj.get("icy-pub");
                                if (list4 != null) {
                                }
                                list5 = (List) zzj.get("icy-metaint");
                                if (list5 != null) {
                                }
                                i3 = -1;
                                zzvtVar2.zzP(z ? new zzafw(i2, str, str2, str3, z2, i3) : null);
                                zzgxVar = this.zzd;
                                zzvtVar = this.zza;
                                if (zzvtVar.zzO() != null) {
                                }
                                zzgaVar = zzgxVar;
                                zzvi zzviVar2222 = this.zze;
                                zzviVar2222.zza(zzgaVar, this.zzc, zzgxVar.zzj(), j2, j3, this.zzf);
                                if (zzvtVar.zzO() != null) {
                                }
                                if (this.zzj) {
                                }
                                i4 = 0;
                                while (true) {
                                    if (i4 != 0) {
                                    }
                                }
                                if (i4 != 1) {
                                }
                                zzgc.zza(zzgxVar);
                                if (i6 != 0) {
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (i6 != 1) {
                            zzvi zzviVar3 = this.zze;
                            if (zzviVar3.zzd() != j) {
                                this.zzh.zza = zzviVar3.zzd();
                            }
                        }
                        zzgc.zza(this.zzd);
                        throw th;
                    }
                }
                z = false;
                i2 = -1;
                list = (List) zzj.get("icy-genre");
                if (list != null) {
                }
                list2 = (List) zzj.get("icy-name");
                if (list2 != null) {
                }
                list3 = (List) zzj.get("icy-url");
                if (list3 != null) {
                }
                list4 = (List) zzj.get("icy-pub");
                if (list4 != null) {
                }
                list5 = (List) zzj.get("icy-metaint");
                if (list5 != null) {
                }
                i3 = -1;
                zzvtVar2.zzP(z ? new zzafw(i2, str, str2, str3, z2, i3) : null);
                zzgxVar = this.zzd;
                zzvtVar = this.zza;
                if (zzvtVar.zzO() != null) {
                }
                zzgaVar = zzgxVar;
                zzvi zzviVar22222 = this.zze;
                zzviVar22222.zza(zzgaVar, this.zzc, zzgxVar.zzj(), j2, j3, this.zzf);
                if (zzvtVar.zzO() != null) {
                }
                if (this.zzj) {
                }
                i4 = 0;
                while (true) {
                    if (i4 != 0) {
                    }
                }
                if (i4 != 1) {
                }
                zzgc.zza(zzgxVar);
                if (i6 != 0) {
                }
            } catch (Throwable th3) {
                th = th3;
                j = -1;
            }
        }
    }

    final /* synthetic */ void zzd(long j, long j2) {
        this.zzh.zza = j;
        this.zzk = j2;
        this.zzj = true;
        this.zzn = false;
    }

    final /* synthetic */ long zze() {
        return this.zzb;
    }

    final /* synthetic */ zzgx zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zzk;
    }

    final /* synthetic */ zzge zzh() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zza(zzef zzefVar) {
        long max = !this.zzn ? this.zzk : Math.max(this.zza.zzI(true), this.zzk);
        int zzd = zzefVar.zzd();
        zzaeb zzaebVar = this.zzm;
        zzaebVar.getClass();
        zzaebVar.zzz(zzefVar, zzd);
        zzaebVar.zzx(max, 1, zzd, 0, null);
        this.zzn = true;
    }
}
