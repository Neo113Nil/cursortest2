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
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcmc extends zzcip implements zzfz, zzkr {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzcln zze;
    private final zzvr zzf;
    private final zzcix zzg;
    private final WeakReference zzh;
    private final zzto zzi;
    private zzkf zzj;
    private ByteBuffer zzk;
    private boolean zzl;
    private zzcio zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private final String zzq;
    private final int zzr;
    private final ArrayList zzt;
    private volatile zzclp zzu;
    private final Object zzs = new Object();
    private final Set zzv = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f5, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(com.google.android.gms.internal.ads.zzbjc.zzbD)).booleanValue() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fb, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fe, code lost:
    
        if (r7.zzo == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0100, code lost:
    
        r8 = new com.google.android.gms.internal.ads.zzclt(r5, r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0117, code lost:
    
        if (r7.zzj == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0119, code lost:
    
        r7 = new com.google.android.gms.internal.ads.zzclw(r5, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0121, code lost:
    
        r6 = r5.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0123, code lost:
    
        if (r6 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0129, code lost:
    
        if (r6.limit() <= 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012b, code lost:
    
        r6 = new byte[r5.zzk.limit()];
        r5.zzk.get(r6);
        r7 = new com.google.android.gms.internal.ads.zzclx(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0120, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0108, code lost:
    
        if (r7.zzi <= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010a, code lost:
    
        r8 = new com.google.android.gms.internal.ads.zzclu(r5, r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0110, code lost:
    
        r8 = new com.google.android.gms.internal.ads.zzclv(r5, r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f9, code lost:
    
        if (r7.zzj == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcmc(Context context, zzcix zzcixVar, zzciy zzciyVar) {
        final zzew zzewVar;
        this.zzd = context;
        this.zzg = zzcixVar;
        this.zzh = new WeakReference(zzciyVar);
        zzcln zzclnVar = new zzcln();
        this.zze = zzclnVar;
        zzvr zzvrVar = new zzvr(context);
        this.zzf = zzvrVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("OfficialSimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zza.incrementAndGet();
        zzke zzkeVar = new zzke(context, new zzcly(this), null);
        zzkeVar.zzb(zzvrVar);
        zzkeVar.zza(zzclnVar);
        this.zzj = zzkeVar.zzc();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbK)).booleanValue()) {
            zzje.zza(this.zzj);
        }
        this.zzj.zzx(this);
        final boolean z = false;
        this.zzn = 0;
        this.zzp = 0L;
        this.zzo = 0;
        this.zzt = new ArrayList();
        this.zzu = null;
        this.zzq = (zzciyVar == null || zzciyVar.zzt() == null) ? "" : zzciyVar.zzt();
        this.zzr = zzciyVar != null ? zzciyVar.zzh() : 0;
        final String zzc2 = com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzciyVar.zzp().zza);
        if (!this.zzl || this.zzk.limit() <= 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbM)).booleanValue()) {
            }
        } else {
            final byte[] bArr = new byte[this.zzk.limit()];
            this.zzk.get(bArr);
            zzewVar = new zzew() { // from class: com.google.android.gms.internal.ads.zzclr
                @Override // com.google.android.gms.internal.ads.zzew
                public final zzex zza() {
                    return new zzes(bArr);
                }
            };
        }
        this.zzi = new zzto(zzewVar, new zztn(((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzm)).booleanValue() ? new zzzp() { // from class: com.google.android.gms.internal.ads.zzcma
            @Override // com.google.android.gms.internal.ads.zzzp
            public final zzzi[] zza() {
                int i = zzcmc.zzc;
                return new zzzi[]{new zzafq(0), new zzaei(0), new zzafl(0, null)};
            }

            @Override // com.google.android.gms.internal.ads.zzzp
            public final /* synthetic */ zzzi[] zzb(Uri uri, Map map) {
                return zzzo.zza(this, uri, map);
            }
        } : new zzzp() { // from class: com.google.android.gms.internal.ads.zzcmb
            @Override // com.google.android.gms.internal.ads.zzzp
            public final zzzi[] zza() {
                int i = zzcmc.zzc;
                return new zzzi[]{new zzafq(0), new zzaei(0)};
            }

            @Override // com.google.android.gms.internal.ads.zzzp
            public final /* synthetic */ zzzi[] zzb(Uri uri, Map map) {
                return zzzo.zza(this, uri, map);
            }
        }), null);
    }

    private final boolean zzZ() {
        return this.zzu != null && this.zzu.zzq();
    }

    public final void finalize() {
        zza.decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final long zzA() {
        if (zzZ()) {
            return 0L;
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final long zzB() {
        if (zzZ()) {
            return this.zzu.zzl();
        }
        synchronized (this.zzs) {
            while (!this.zzt.isEmpty()) {
                long j = this.zzp;
                Map zze = ((zzfu) this.zzt.remove(0)).zze();
                long j2 = 0;
                if (zze != null) {
                    Iterator it = zze.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && zzfse.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzp = j + j2;
            }
        }
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzC(Uri[] uriArr, String str) {
        zzD(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzE() {
        zzkf zzkfVar = this.zzj;
        if (zzkfVar != null) {
            zzkfVar.zzA(this);
            this.zzj.zzz();
            this.zzj = null;
            zzb.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzF(long j) {
        zzkf zzkfVar = this.zzj;
        zzkfVar.zzp(zzkfVar.zzf(), j);
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzG(int i) {
        this.zze.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzH(int i) {
        this.zze.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzI(zzcio zzcioVar) {
        this.zzm = zzcioVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzJ(int i) {
        this.zze.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzK(int i) {
        this.zze.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzL(boolean z) {
        this.zzj.zzC(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzM(boolean z) {
        if (this.zzj == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzj.zzt();
            if (i >= 2) {
                return;
            }
            zzvr zzvrVar = this.zzf;
            zzvd zzc2 = zzvrVar.zzc().zzc();
            zzc2.zzo(i, !z);
            zzvrVar.zzj(zzc2);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzN(int i) {
        Iterator it = this.zzv.iterator();
        while (it.hasNext()) {
            zzclm zzclmVar = (zzclm) ((WeakReference) it.next()).get();
            if (zzclmVar != null) {
                zzclmVar.zzm(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzO(Surface surface, boolean z) {
        zzkf zzkfVar = this.zzj;
        if (zzkfVar == null) {
            return;
        }
        zzkfVar.zzE(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzP(float f, boolean z) {
        zzkf zzkfVar = this.zzj;
        if (zzkfVar == null) {
            return;
        }
        zzkfVar.zzF(f);
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzQ() {
        this.zzj.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final boolean zzR() {
        return this.zzj != null;
    }

    final /* synthetic */ zzex zzS(String str, boolean z) {
        zzcmc zzcmcVar = true != z ? null : this;
        zzcix zzcixVar = this.zzg;
        return new zzcmf(str, zzcmcVar, zzcixVar.zzd, zzcixVar.zzf, zzcixVar.zzp, zzcixVar.zzq);
    }

    final /* synthetic */ zzex zzT(String str, boolean z) {
        zzcmc zzcmcVar = true != z ? null : this;
        zzcix zzcixVar = this.zzg;
        zzclm zzclmVar = new zzclm(str, zzcmcVar, zzcixVar.zzd, zzcixVar.zzf, zzcixVar.zzi);
        this.zzv.add(new WeakReference(zzclmVar));
        return zzclmVar;
    }

    final /* synthetic */ zzex zzU(String str, boolean z) {
        zzff zzffVar = new zzff();
        zzffVar.zzf(str);
        zzffVar.zze(true != z ? null : this);
        zzffVar.zzc(this.zzg.zzd);
        zzffVar.zzd(this.zzg.zzf);
        zzffVar.zzb(true);
        return zzffVar.zza();
    }

    final /* synthetic */ zzex zzV(zzew zzewVar) {
        return new zzclp(this.zzd, zzewVar.zza(), this.zzq, this.zzr, this, new zzcls(this), null);
    }

    final zzsk zzW(Uri uri) {
        zzaj zzajVar = new zzaj();
        zzajVar.zzb(uri);
        zzbg zzc2 = zzajVar.zzc();
        zzto zztoVar = this.zzi;
        zztoVar.zza(this.zzg.zzg);
        return zztoVar.zzb(zzc2);
    }

    final /* synthetic */ void zzX(boolean z, long j) {
        zzcio zzcioVar = this.zzm;
        if (zzcioVar != null) {
            zzcioVar.zzi(z, j);
        }
    }

    final /* synthetic */ zzka[] zzY(Handler handler, zzyd zzydVar, zzns zznsVar, zzuj zzujVar, zzri zzriVar) {
        Context context = this.zzd;
        zzqs zzqsVar = zzqs.zzb;
        zznd zzndVar = zznd.zza;
        zzng[] zzngVarArr = new zzng[0];
        zzoi zzoiVar = new zzoi();
        zznd zzndVar2 = zznd.zza;
        if (zzndVar == null) {
            Objects.requireNonNull(zzndVar2, "Both parameters are null");
            zzndVar = zzndVar2;
        }
        zzoiVar.zzb(zzndVar);
        zzoiVar.zzc(zzngVarArr);
        return new zzka[]{new zzpa(context, zzqk.zza, zzqsVar, false, handler, zznsVar, zzoiVar.zzd()), new zzxg(this.zzd, zzqk.zza, zzqs.zzb, 0L, false, handler, zzydVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    public final void zza(zzex zzexVar, zzfc zzfcVar, boolean z, int i) {
        this.zzn += i;
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    public final void zzb(zzex zzexVar, zzfc zzfcVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    public final void zzc(zzex zzexVar, zzfc zzfcVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    public final void zzd(zzex zzexVar, zzfc zzfcVar, boolean z) {
        if (zzexVar instanceof zzfu) {
            synchronized (this.zzs) {
                this.zzt.add((zzfu) zzexVar);
            }
        } else if (zzexVar instanceof zzclp) {
            this.zzu = (zzclp) zzexVar;
            final zzciy zzciyVar = (zzciy) this.zzh.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbD)).booleanValue() && zzciyVar != null && this.zzu.zzn()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzu.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzu.zzo()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzciy zzciyVar2 = zzciy.this;
                        Map map = hashMap;
                        int i = zzcmc.zzc;
                        zzciyVar2.zzd("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final void zze(zzkp zzkpVar, zzaf zzafVar, zzgt zzgtVar) {
        zzciy zzciyVar = (zzciy) this.zzh.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbD)).booleanValue() || zzciyVar == null || zzafVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", zzafVar.zzl);
        hashMap.put("audioSampleMime", zzafVar.zzm);
        hashMap.put("audioCodec", zzafVar.zzj);
        zzciyVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final /* synthetic */ void zzf(zzkp zzkpVar, int i, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final /* synthetic */ void zzg(zzkp zzkpVar, zzse zzseVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final void zzh(zzkp zzkpVar, int i, long j) {
        this.zzo += i;
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final /* synthetic */ void zzi(zzcg zzcgVar, zzkq zzkqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final void zzj(zzkp zzkpVar, zzrz zzrzVar, zzse zzseVar, IOException iOException, boolean z) {
        zzcio zzcioVar = this.zzm;
        if (zzcioVar != null) {
            if (this.zzg.zzl) {
                zzcioVar.zzl("onLoadException", iOException);
            } else {
                zzcioVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final void zzk(zzkp zzkpVar, int i) {
        zzcio zzcioVar = this.zzm;
        if (zzcioVar != null) {
            zzcioVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final void zzl(zzkp zzkpVar, zzbw zzbwVar) {
        zzcio zzcioVar = this.zzm;
        if (zzcioVar != null) {
            zzcioVar.zzk("onPlayerError", zzbwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final /* synthetic */ void zzm(zzkp zzkpVar, zzcf zzcfVar, zzcf zzcfVar2, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final void zzn(zzkp zzkpVar, Object obj, long j) {
        zzcio zzcioVar = this.zzm;
        if (zzcioVar != null) {
            zzcioVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final /* synthetic */ void zzo(zzkp zzkpVar, zzgs zzgsVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final void zzp(zzkp zzkpVar, zzaf zzafVar, zzgt zzgtVar) {
        zzciy zzciyVar = (zzciy) this.zzh.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbD)).booleanValue() || zzciyVar == null || zzafVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzafVar.zzt));
        hashMap.put("bitRate", String.valueOf(zzafVar.zzi));
        hashMap.put("resolution", zzafVar.zzr + "x" + zzafVar.zzs);
        hashMap.put("videoMime", zzafVar.zzl);
        hashMap.put("videoSampleMime", zzafVar.zzm);
        hashMap.put("videoCodec", zzafVar.zzj);
        zzciyVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final void zzq(zzkp zzkpVar, zzda zzdaVar) {
        zzcio zzcioVar = this.zzm;
        if (zzcioVar != null) {
            zzcioVar.zzC(zzdaVar.zzc, zzdaVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final int zzr() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final int zzt() {
        return this.zzj.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final long zzv() {
        return this.zzj.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final long zzw() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final long zzx() {
        if (zzZ() && this.zzu.zzp()) {
            return Math.min(this.zzn, this.zzu.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final long zzy() {
        return this.zzj.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final long zzz() {
        return this.zzj.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzD(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzsk zztaVar;
        if (this.zzj == null) {
            return;
        }
        this.zzk = byteBuffer;
        this.zzl = z;
        int length = uriArr.length;
        if (length == 1) {
            zztaVar = zzW(uriArr[0]);
        } else {
            zzsk[] zzskVarArr = new zzsk[length];
            for (int i = 0; i < uriArr.length; i++) {
                zzskVarArr[i] = zzW(uriArr[i]);
            }
            zztaVar = new zzta(false, false, zzskVarArr);
        }
        this.zzj.zzB(zztaVar);
        this.zzj.zzy();
        zzb.incrementAndGet();
    }
}
