package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzcka extends zzcju implements zzayx {
    private String zzd;
    private final zzchq zze;
    private boolean zzf;
    private final zzcjz zzg;
    private final zzcjf zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcka(zzchr zzchrVar, zzchq zzchqVar) {
        super(zzchrVar);
        this.zze = zzchqVar;
        this.zzg = new zzcjz();
        this.zzh = new zzcjf();
        this.zzk = new Object();
        this.zzl = zzchrVar != null ? zzchrVar.zzt() : "";
        this.zzm = zzchrVar != null ? zzchrVar.zzh() : 0;
    }

    protected static final String zzt(String str) {
        return "cache:".concat(String.valueOf(zzcfb.zze(str)));
    }

    private final void zzu() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round(zza2 * (position / zza));
        boolean z = round > 0;
        int zzs = zzchi.zzs();
        int zzu = zzchi.zzu();
        String str = this.zzd;
        zzf(str, zzt(str), position, zza, round, zza2, z, zzs, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final void zzb() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzayx
    public final /* bridge */ /* synthetic */ void zzj(Object obj, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzayx
    public final /* bridge */ /* synthetic */ void zzk(Object obj, zzayk zzaykVar) {
        this.zzg.zzb((zzaym) obj);
    }

    public final ByteBuffer zzl() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }

    public final boolean zzm() {
        return this.zzn;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:? -> B:50:0x0140). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcju
    public final boolean zzq(String str) {
        String str2;
        this.zzd = str;
        String zzt = zzt(str);
        String str3 = "error";
        try {
            String str4 = this.zzb;
            zzchq zzchqVar = this.zze;
            zzayi zzaymVar = new zzaym(str4, null, this, zzchqVar.zzd, zzchqVar.zzf, true, null);
            if (this.zze.zzj) {
                zzaymVar = new zzcin(this.zza, zzaymVar, this.zzl, this.zzm, null, null, null);
            }
            zzaymVar.zzb(new zzayk(Uri.parse(str), null, 0L, 0L, -1L, null, 0));
            zzchr zzchrVar = (zzchr) this.zzc.get();
            if (zzchrVar != null) {
                zzchrVar.zzv(zzt, this);
            }
            Clock zzA = com.google.android.gms.ads.internal.zzt.zzA();
            long currentTimeMillis = zzA.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzw)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzv)).longValue();
            this.zzi = ByteBuffer.allocate(this.zze.zzc);
            int i = 8192;
            byte[] bArr = new byte[8192];
            long j = currentTimeMillis;
            while (true) {
                int zza = zzaymVar.zza(bArr, 0, Math.min(this.zzi.remaining(), i));
                zzayi zzayiVar = zzaymVar;
                if (zza == -1) {
                    this.zzn = true;
                    zze(str, zzt, (int) this.zzh.zza(this.zzi));
                    return true;
                }
                synchronized (this.zzk) {
                    try {
                        if (this.zzf) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            str3 = null;
                            try {
                                this.zzi.put(bArr, 0, zza);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.zzi.remaining() <= 0) {
                                zzu();
                                return true;
                            }
                            try {
                                if (this.zzf) {
                                    throw new IOException("Precache abort at " + this.zzi.limit() + " bytes");
                                }
                                long currentTimeMillis2 = zzA.currentTimeMillis();
                                if (currentTimeMillis2 - j >= longValue) {
                                    zzu();
                                    j = currentTimeMillis2;
                                }
                                if (currentTimeMillis2 - currentTimeMillis > 1000 * longValue2) {
                                    throw new IOException("Timeout exceeded. Limit: " + longValue2 + " sec");
                                }
                                zzaymVar = zzayiVar;
                                str3 = str2;
                                i = 8192;
                            } catch (Exception e) {
                                e = e;
                                String str5 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                                com.google.android.gms.ads.internal.util.zze.zzj("Failed to preload url " + str + " Exception: " + str5);
                                zzc(str, zzt, str3, str5);
                                return false;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = str2;
                            String str52 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                            com.google.android.gms.ads.internal.util.zze.zzj("Failed to preload url " + str + " Exception: " + str52);
                            zzc(str, zzt, str3, str52);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
            str2 = str3;
        }
    }
}
