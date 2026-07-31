package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.revenuecat.purchases.common.Constants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzccw extends zzccq implements zzgy {
    private static final AtomicInteger zzo = new AtomicInteger(0);
    private String zzd;
    private final zzcbc zze;
    private boolean zzf;
    private final zzccv zzg;
    private final zzcbz zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzccw(zzcbd zzcbdVar, zzcbc zzcbcVar) {
        super(zzcbdVar);
        this.zze = zzcbcVar;
        this.zzg = new zzccv();
        this.zzh = new zzcbz();
        this.zzk = new Object();
        this.zzl = (String) zzgha.zzd(zzcbdVar != null ? zzcbdVar.zzn() : null).zza("");
        this.zzm = zzcbdVar != null ? zzcbdVar.zzp() : 0;
        zzo.incrementAndGet();
    }

    public static int zzr() {
        return zzo.get();
    }

    protected static final String zzv(String str) {
        String zzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(str);
        String.valueOf(zzf);
        return "cache:".concat(String.valueOf(zzf));
    }

    private final void zzx() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round(zza2 * (position / zza));
        int zzP = zzcau.zzP();
        int zzQ = zzcau.zzQ();
        String str = this.zzd;
        zzn(str, zzv(str), position, zza, round, zza2, round > 0, zzP, zzQ);
    }

    @Override // com.google.android.gms.internal.ads.zzccq, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzo.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zza(zzga zzgaVar, zzge zzgeVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzb(zzga zzgaVar, zzge zzgeVar, boolean z) {
        if (zzgaVar instanceof zzgl) {
            this.zzg.zzb((zzgl) zzgaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzc(zzga zzgaVar, zzge zzgeVar, boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzd(zzga zzgaVar, zzge zzgeVar, boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // com.google.android.gms.internal.ads.zzccq
    public final boolean zze(String str) {
        String str2;
        String str3;
        Clock clock;
        long j;
        this.zzd = str;
        String str4 = "error";
        String zzv = zzv(str);
        try {
            zzgh zzghVar = new zzgh();
            zzghVar.zzb(this.zzb);
            zzcbc zzcbcVar = this.zze;
            zzghVar.zzc(zzcbcVar.zzd);
            zzghVar.zzd(zzcbcVar.zze);
            zzghVar.zze(true);
            zzghVar.zzf(this);
            zzga zza = zzghVar.zza();
            if (zzcbcVar.zzi) {
                zza = new zzcbx(this.zza, zza, this.zzl, this.zzm, null, null);
            }
            zza.zzb(new zzge(Uri.parse(str), 0L, -1L, null));
            zzcbd zzcbdVar = (zzcbd) this.zzc.get();
            if (zzcbdVar != null) {
                zzcbdVar.zzt(zzv, this);
            }
            Clock zzk = com.google.android.gms.ads.internal.zzt.zzk();
            long currentTimeMillis = zzk.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzR)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzQ)).longValue();
            this.zzi = ByteBuffer.allocate(zzcbcVar.zzc);
            byte[] bArr = new byte[8192];
            long j2 = currentTimeMillis;
            while (true) {
                str2 = str4;
                try {
                    int zza2 = zza.zza(bArr, 0, Math.min(this.zzi.remaining(), 8192));
                    if (zza2 == -1) {
                        this.zzn = true;
                        zzp(str, zzv, (int) this.zzh.zza(this.zzi));
                        break;
                    }
                    synchronized (this.zzk) {
                        clock = zzk;
                        if (this.zzf) {
                            j = currentTimeMillis;
                        } else {
                            j = currentTimeMillis;
                            this.zzi.put(bArr, 0, zza2);
                        }
                    }
                    if (this.zzi.remaining() <= 0) {
                        zzx();
                        break;
                    }
                    str3 = this.zzf;
                    try {
                        if (str3 != 0) {
                            int limit = this.zzi.limit();
                            StringBuilder sb = new StringBuilder(String.valueOf(limit).length() + 24);
                            sb.append("Precache abort at ");
                            sb.append(limit);
                            sb.append(" bytes");
                            throw new IOException(sb.toString());
                        }
                        long currentTimeMillis2 = clock.currentTimeMillis();
                        if (currentTimeMillis2 - j2 >= longValue) {
                            zzx();
                            j2 = currentTimeMillis2;
                        }
                        if (currentTimeMillis2 - j > 1000 * longValue2) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(longValue2).length() + 29);
                            sb2.append("Timeout exceeded. Limit: ");
                            sb2.append(longValue2);
                            sb2.append(" sec");
                            throw new IOException(sb2.toString());
                        }
                        str4 = str2;
                        zzk = clock;
                        currentTimeMillis = j;
                    } catch (Exception e) {
                        e = e;
                        String canonicalName = e.getClass().getCanonicalName();
                        String message = e.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length());
                        sb3.append(canonicalName);
                        sb3.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                        sb3.append(message);
                        String sb4 = sb3.toString();
                        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 34 + sb4.length());
                        sb5.append("Failed to preload url ");
                        sb5.append(str);
                        sb5.append(" Exception: ");
                        sb5.append(sb4);
                        String sb6 = sb5.toString();
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb6);
                        zzq(str, zzv, str3, sb4);
                        return false;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str3 = str2;
                    String canonicalName2 = e.getClass().getCanonicalName();
                    String message2 = e.getMessage();
                    StringBuilder sb32 = new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length());
                    sb32.append(canonicalName2);
                    sb32.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                    sb32.append(message2);
                    String sb42 = sb32.toString();
                    StringBuilder sb52 = new StringBuilder(String.valueOf(str).length() + 34 + sb42.length());
                    sb52.append("Failed to preload url ");
                    sb52.append(str);
                    sb52.append(" Exception: ");
                    sb52.append(sb42);
                    String sb62 = sb52.toString();
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb62);
                    zzq(str, zzv, str3, sb42);
                    return false;
                }
            }
            return true;
        } catch (Exception e3) {
            e = e3;
            str2 = str4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzl() {
        this.zzf = true;
    }

    public final String zzs() {
        return this.zzd;
    }

    public final boolean zzt() {
        return this.zzn;
    }

    public final ByteBuffer zzu() {
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
}
