package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzcds extends zzcau implements zzgy, zzmg {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcdc zzc;
    private final zzyd zzd;
    private final zzcbc zze;
    private final WeakReference zzf;
    private final zzvw zzg;
    private zzik zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcat zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcdf zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbci.zzcd)).booleanValue() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ec, code lost:
    
        if (r5.zzl == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ee, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcdi(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0105, code lost:
    
        if (r5.zzi == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0107, code lost:
    
        r5 = new com.google.android.gms.internal.ads.zzcdl(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010f, code lost:
    
        r4 = r3.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0111, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0117, code lost:
    
        if (r4.limit() <= 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0119, code lost:
    
        r4 = new byte[r3.zzi.limit()];
        r3.zzi.get(r4);
        r5 = new com.google.android.gms.internal.ads.zzcdm(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010e, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        if (r5.zzh <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcdk(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fe, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcdj(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        if (r5.zzi == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcds(Context context, zzcbc zzcbcVar, zzcbd zzcbdVar, Integer num) {
        final zzfz zzfzVar;
        this.zzb = context;
        this.zze = zzcbcVar;
        this.zzr = num;
        this.zzf = new WeakReference(zzcbdVar);
        zzcdc zzcdcVar = new zzcdc();
        this.zzc = zzcdcVar;
        zzyd zzydVar = new zzyd(context);
        this.zzd = zzydVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzf().incrementAndGet();
        zzlu zzluVar = new zzlu(context, new zzlq() { // from class: com.google.android.gms.internal.ads.zzcdn
            @Override // com.google.android.gms.internal.ads.zzlq
            public final /* synthetic */ zzll[] zza(Handler handler, zzabm zzabmVar, zzpv zzpvVar, zzwt zzwtVar, zztn zztnVar) {
                return zzcds.this.zzW(handler, zzabmVar, zzpvVar, zzwtVar, zztnVar);
            }
        });
        zzluVar.zza(zzydVar);
        zzluVar.zzb(zzcdcVar);
        zzlv zzc = zzluVar.zzc();
        this.zzh = zzc;
        zzc.zzB(this);
        final boolean z = false;
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new ArrayList();
        this.zzt = null;
        this.zzo = (String) zzgha.zzd(zzcbdVar != null ? zzcbdVar.zzn() : null).zza("");
        this.zzp = zzcbdVar != null ? zzcbdVar.zzp() : 0;
        final String zze = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzcbdVar.zzs().afmaVersion);
        if (!this.zzj || this.zzi.limit() <= 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcl)).booleanValue()) {
            }
        } else {
            final byte[] bArr = new byte[this.zzi.limit()];
            this.zzi.get(bArr);
            zzfzVar = new zzfz() { // from class: com.google.android.gms.internal.ads.zzcdh
                @Override // com.google.android.gms.internal.ads.zzfz
                public final /* synthetic */ zzga zza() {
                    int i = zzcds.zza;
                    return new zzfv(bArr);
                }
            };
        }
        this.zzg = new zzvw(zzfzVar, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzn)).booleanValue() ? zzcdp.zza : zzcdo.zza);
    }

    private final boolean zzY() {
        return this.zzt != null && this.zzt.zzl();
    }

    public final void finalize() {
        zzf().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzA(int i) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcdb zzcdbVar = (zzcdb) ((WeakReference) it.next()).get();
            if (zzcdbVar != null) {
                zzcdbVar.zzk(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final boolean zzB() {
        return this.zzh != null;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final int zzC() {
        return this.zzh.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzD() {
        return this.zzh.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzE(boolean z) {
        this.zzh.zzi(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzF(int i) {
        this.zzc.zzj(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzG(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzH() {
        return this.zzh.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzI() {
        if (zzY()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzJ() {
        if (zzY() && this.zzt.zzm()) {
            return Math.min(this.zzl, this.zzt.zzo());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzK() {
        if (zzY()) {
            return this.zzt.zzp();
        }
        synchronized (this.zzq) {
            while (true) {
                ArrayList arrayList = this.zzs;
                if (!arrayList.isEmpty()) {
                    long j = this.zzn;
                    Map zzj = ((zzgt) arrayList.remove(0)).zzj();
                    long j2 = 0;
                    if (zzj != null) {
                        Iterator it = zzj.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzggj.zze("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j + j2;
                }
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final int zzL() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzM(boolean z) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzD();
            if (i >= 2) {
                return;
            }
            zzyd zzydVar = this.zzd;
            zzxn zzd = zzydVar.zzc().zzd();
            zzd.zzy(i, !z);
            zzydVar.zzf(zzd);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzN() {
        return this.zzh.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final long zzO() {
        return this.zzl;
    }

    final zzur zzR(Uri uri) {
        zzy zzyVar = new zzy();
        zzyVar.zzb(uri);
        zzaj zzc = zzyVar.zzc();
        zzvw zzvwVar = this.zzg;
        zzvwVar.zza(this.zze.zzf);
        return zzvwVar.zzb(zzc);
    }

    final /* synthetic */ zzga zzS(String str, boolean z) {
        zzcds zzcdsVar = true != z ? null : this;
        zzcbc zzcbcVar = this.zze;
        return new zzcdv(str, zzcdsVar, zzcbcVar.zzd, zzcbcVar.zze, zzcbcVar.zzm, zzcbcVar.zzn);
    }

    final /* synthetic */ zzga zzT(String str, boolean z) {
        zzgh zzghVar = new zzgh();
        zzghVar.zzb(str);
        zzghVar.zzf(true != z ? null : this);
        zzcbc zzcbcVar = this.zze;
        zzghVar.zzc(zzcbcVar.zzd);
        zzghVar.zzd(zzcbcVar.zze);
        zzghVar.zze(true);
        return zzghVar.zza();
    }

    final /* synthetic */ zzga zzU(String str, boolean z) {
        zzcds zzcdsVar = true != z ? null : this;
        zzcbc zzcbcVar = this.zze;
        zzcdb zzcdbVar = new zzcdb(str, zzcdsVar, zzcbcVar.zzd, zzcbcVar.zze, zzcbcVar.zzh);
        this.zzu.add(new WeakReference(zzcdbVar));
        return zzcdbVar;
    }

    final /* synthetic */ zzga zzV(zzfz zzfzVar) {
        zzga zza2 = zzfzVar.zza();
        zzcdd zzcddVar = new zzcdd() { // from class: com.google.android.gms.internal.ads.zzcdq
            @Override // com.google.android.gms.internal.ads.zzcdd
            public final /* synthetic */ void zza(boolean z, long j) {
                zzcds.this.zzX(z, j);
            }
        };
        return new zzcdf(this.zzb, zza2, this.zzo, this.zzp, this, zzcddVar);
    }

    final /* synthetic */ zzll[] zzW(Handler handler, zzabm zzabmVar, zzpv zzpvVar, zzwt zzwtVar, zztn zztnVar) {
        zztb zztbVar = zztb.zzb;
        Context context = this.zzb;
        zzrg zzrgVar = new zzrg(context, new zzsi(context, null, null), zztbVar, false, handler, zzpvVar, new zzqk(context).zza());
        zzaac zzaacVar = new zzaac(context);
        zzaacVar.zza(zztbVar);
        zzaacVar.zzb(handler);
        zzaacVar.zzc(zzabmVar);
        return new zzll[]{zzrgVar, zzaacVar.zzd()};
    }

    final /* synthetic */ void zzX(boolean z, long j) {
        zzcat zzcatVar = this.zzk;
        if (zzcatVar != null) {
            zzcatVar.zzr(z, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zza(zzga zzgaVar, zzge zzgeVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzb(zzga zzgaVar, zzge zzgeVar, boolean z) {
        if (zzgaVar instanceof zzgt) {
            synchronized (this.zzq) {
                this.zzs.add((zzgt) zzgaVar);
            }
        } else if (zzgaVar instanceof zzcdf) {
            this.zzt = (zzcdf) zzgaVar;
            final zzcbd zzcbdVar = (zzcbd) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue() && zzcbdVar != null && this.zzt.zzk()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzm()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzn()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        int i = zzcds.zza;
                        zzcbd.this.zze("onGcacheInfoEvent", hashMap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzc(zzga zzgaVar, zzge zzgeVar, boolean z, int i) {
        this.zzl += i;
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzd(zzga zzgaVar, zzge zzgeVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zze(zzme zzmeVar, int i) {
        zzcat zzcatVar = this.zzk;
        if (zzcatVar != null) {
            zzcatVar.zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzg(zzme zzmeVar, zzat zzatVar) {
        zzcat zzcatVar = this.zzk;
        if (zzcatVar != null) {
            zzcatVar.zzu("onPlayerError", zzatVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzh(zzme zzmeVar, zzug zzugVar, zzul zzulVar, IOException iOException, boolean z) {
        zzcat zzcatVar = this.zzk;
        if (zzcatVar != null) {
            if (this.zze.zzj) {
                zzcatVar.zzv("onLoadException", iOException);
            } else {
                zzcatVar.zzu("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final Integer zzj() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzk(zzme zzmeVar, zzu zzuVar, zzhs zzhsVar) {
        zzcbd zzcbdVar = (zzcbd) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue() || zzcbdVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = zzuVar.zzn;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = zzuVar.zzo;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = zzuVar.zzk;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        zzcbdVar.zze("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzl(zzme zzmeVar, zzu zzuVar, zzhs zzhsVar) {
        zzcbd zzcbdVar = (zzcbd) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue() || zzcbdVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzuVar.zzz));
        hashMap.put("bitRate", String.valueOf(zzuVar.zzj));
        int i = zzuVar.zzv;
        int i2 = zzuVar.zzw;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        hashMap.put("resolution", sb.toString());
        String str = zzuVar.zzn;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = zzuVar.zzo;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = zzuVar.zzk;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        zzcbdVar.zze("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzm(zzme zzmeVar, int i, long j) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzn(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzo(zzme zzmeVar, Object obj, long j) {
        zzcat zzcatVar = this.zzk;
        if (zzcatVar != null) {
            zzcatVar.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzp(zzme zzmeVar, zzbu zzbuVar) {
        zzcat zzcatVar = this.zzk;
        if (zzcatVar != null) {
            zzcatVar.zzt(zzbuVar.zzb, zzbuVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzq(Uri[] uriArr, String str) {
        zzr(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzs(zzcat zzcatVar) {
        this.zzk = zzcatVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzt() {
        zzik zzikVar = this.zzh;
        if (zzikVar != null) {
            zzikVar.zzC(this);
            this.zzh.zzF();
            this.zzh = null;
            zzi().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzu(Surface surface, boolean z) {
        zzik zzikVar = this.zzh;
        if (zzikVar != null) {
            zzikVar.zzA(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzv(float f, boolean z) {
        zzik zzikVar = this.zzh;
        if (zzikVar != null) {
            zzikVar.zzz(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzw() {
        this.zzh.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzx(long j) {
        this.zzh.zza(j);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzy(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzz(int i) {
        this.zzc.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzr(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzur zzvgVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zzvgVar = zzR(uriArr[0]);
            } else {
                zzur[] zzurVarArr = new zzur[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzurVarArr[i] = zzR(uriArr[i]);
                }
                zzvgVar = new zzvg(false, false, new zzua(), zzurVarArr);
            }
            this.zzh.zzE(zzvgVar);
            this.zzh.zzf();
            zzi().incrementAndGet();
        }
    }
}
