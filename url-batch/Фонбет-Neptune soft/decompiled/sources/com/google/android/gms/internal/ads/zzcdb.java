package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcdb extends zzccv implements zzgu {
    private String zzd;
    private final zzcbj zze;
    private boolean zzf;
    private final zzcda zzg;
    private final zzccg zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcdb(zzcbk zzcbkVar, zzcbj zzcbjVar) {
        super(zzcbkVar);
        this.zze = zzcbjVar;
        this.zzg = new zzcda();
        this.zzh = new zzccg();
        this.zzk = new Object();
        this.zzl = (String) zzfus.zzd(zzcbkVar != null ? zzcbkVar.zzr() : null).zzb("");
        this.zzm = zzcbkVar != null ? zzcbkVar.zzf() : 0;
    }

    protected static final String zzm(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private final void zzv() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round(zza2 * (position / zza));
        int zzs = zzcbb.zzs();
        int zzu = zzcbb.zzu();
        String str = this.zzd;
        zzn(str, zzm(str), position, zza, round, zza2, round > 0, zzs, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final void zza(zzfs zzfsVar, zzfy zzfyVar, boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final void zzb(zzfs zzfsVar, zzfy zzfyVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final void zzc(zzfs zzfsVar, zzfy zzfyVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final void zzd(zzfs zzfsVar, zzfy zzfyVar, boolean z) {
        if (zzfsVar instanceof zzgg) {
            this.zzg.zzb((zzgg) zzfsVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzf() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final ByteBuffer zzk() {
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

    public final boolean zzl() {
        return this.zzn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00df, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ae, code lost:
    
        r21.zzn = true;
        zzj(r22, r4, (int) r21.zzh.zza(r21.zzi));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:? -> B:51:0x0149). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzccv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzt(String str) {
        String str2;
        String str3;
        this.zzd = str;
        String str4 = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
        String zzm = zzm(str);
        int i = 0;
        try {
            zzgb zzgbVar = new zzgb();
            zzgbVar.zzf(this.zzb);
            zzgbVar.zzc(this.zze.zzd);
            zzgbVar.zzd(this.zze.zze);
            zzgbVar.zzb(true);
            zzgbVar.zze(this);
            zzfs zza = zzgbVar.zza();
            if (this.zze.zzi) {
                zza = new zzcce(this.zza, zza, this.zzl, this.zzm, null, null);
            }
            zza.zzb(new zzfy(Uri.parse(str), 0L, -1L, null));
            zzcbk zzcbkVar = (zzcbk) this.zzc.get();
            if (zzcbkVar != null) {
                zzcbkVar.zzt(zzm, this);
            }
            Clock zzB = com.google.android.gms.ads.internal.zzu.zzB();
            long currentTimeMillis = zzB.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzs)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzr)).longValue();
            this.zzi = ByteBuffer.allocate(this.zze.zzc);
            int i2 = 8192;
            byte[] bArr = new byte[8192];
            long j = currentTimeMillis;
            while (true) {
                int zza2 = zza.zza(bArr, i, Math.min(this.zzi.remaining(), i2));
                if (zza2 == -1) {
                    break;
                }
                synchronized (this.zzk) {
                    try {
                        if (this.zzf) {
                            str2 = str4;
                        } else {
                            str2 = str4;
                            try {
                                this.zzi.put(bArr, 0, zza2);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.zzi.remaining() <= 0) {
                                zzv();
                                break;
                            }
                            str3 = 1;
                            try {
                                if (this.zzf) {
                                    throw new IOException("Precache abort at " + this.zzi.limit() + " bytes");
                                }
                                long currentTimeMillis2 = zzB.currentTimeMillis();
                                if (currentTimeMillis2 - j >= longValue) {
                                    zzv();
                                    j = currentTimeMillis2;
                                }
                                if (currentTimeMillis2 - currentTimeMillis > 1000 * longValue2) {
                                    throw new IOException("Timeout exceeded. Limit: " + longValue2 + " sec");
                                }
                                str4 = str2;
                                i = 0;
                                i2 = 8192;
                            } catch (Exception e) {
                                e = e;
                                String str5 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                                com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + str + " Exception: " + str5);
                                zzg(str, zzm, str3, str5);
                                return false;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = str2;
                            String str52 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + str + " Exception: " + str52);
                            zzg(str, zzm, str3, str52);
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
            str2 = str4;
        }
    }
}
