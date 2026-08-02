package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzclh extends zzclb implements zzbab {
    private String zzd;
    private final zzcix zze;
    private boolean zzf;
    private final zzclg zzg;
    private final zzckm zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzclh(zzciy zzciyVar, zzcix zzcixVar) {
        super(zzciyVar);
        this.zze = zzcixVar;
        this.zzg = new zzclg();
        this.zzh = new zzckm();
        this.zzk = new Object();
        this.zzl = zzciyVar != null ? zzciyVar.zzt() : "";
        this.zzm = zzciyVar != null ? zzciyVar.zzh() : 0;
    }

    protected static final String zzt(String str) {
        return "cache:".concat(String.valueOf(zzcgi.zze(str)));
    }

    private final void zzu() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round(zza2 * (position / zza));
        boolean z = round > 0;
        int zzs = zzcip.zzs();
        int zzu = zzcip.zzu();
        String str = this.zzd;
        zzf(str, zzt(str), position, zza, round, zza2, z, zzs, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzb() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final /* bridge */ /* synthetic */ void zzj(Object obj, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final /* bridge */ /* synthetic */ void zzk(Object obj, zzazo zzazoVar) {
        this.zzg.zzb((zzazq) obj);
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
    @Override // com.google.android.gms.internal.ads.zzclb
    public final boolean zzq(String str) {
        String str2;
        this.zzd = str;
        String zzt = zzt(str);
        String str3 = "error";
        try {
            String str4 = this.zzb;
            zzcix zzcixVar = this.zze;
            zzazm zzazqVar = new zzazq(str4, null, this, zzcixVar.zzd, zzcixVar.zzf, true, null);
            if (this.zze.zzj) {
                zzazqVar = new zzcju(this.zza, zzazqVar, this.zzl, this.zzm, null, null, null);
            }
            zzazqVar.zzb(new zzazo(Uri.parse(str), null, 0L, 0L, -1L, null, 0));
            zzciy zzciyVar = (zzciy) this.zzc.get();
            if (zzciyVar != null) {
                zzciyVar.zzv(zzt, this);
            }
            Clock zzB = com.google.android.gms.ads.internal.zzt.zzB();
            long currentTimeMillis = zzB.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzw)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzv)).longValue();
            this.zzi = ByteBuffer.allocate(this.zze.zzc);
            int i = 8192;
            byte[] bArr = new byte[8192];
            long j = currentTimeMillis;
            while (true) {
                int zza = zzazqVar.zza(bArr, 0, Math.min(this.zzi.remaining(), i));
                zzazm zzazmVar = zzazqVar;
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
                                long currentTimeMillis2 = zzB.currentTimeMillis();
                                if (currentTimeMillis2 - j >= longValue) {
                                    zzu();
                                    j = currentTimeMillis2;
                                }
                                if (currentTimeMillis2 - currentTimeMillis > 1000 * longValue2) {
                                    throw new IOException("Timeout exceeded. Limit: " + longValue2 + " sec");
                                }
                                zzazqVar = zzazmVar;
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
