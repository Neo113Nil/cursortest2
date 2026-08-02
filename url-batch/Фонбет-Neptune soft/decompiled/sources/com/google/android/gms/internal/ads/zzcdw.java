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

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcdw extends zzcbb implements zzgu, zzlq {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcdh zzc;
    private final zzxt zzd;
    private final zzcbj zze;
    private final WeakReference zzf;
    private final zzvm zzg;
    private zzih zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcba zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcdj zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zzbG)).booleanValue() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ec, code lost:
    
        if (r5.zzl == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ee, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcdn(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0105, code lost:
    
        if (r5.zzi == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0107, code lost:
    
        r5 = new com.google.android.gms.internal.ads.zzcdq(r3, r6);
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
        r5 = new com.google.android.gms.internal.ads.zzcdr(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010e, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        if (r5.zzh <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcdo(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fe, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcdp(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        if (r5.zzi == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcdw(Context context, zzcbj zzcbjVar, zzcbk zzcbkVar, Integer num) {
        final zzfr zzfrVar;
        this.zzb = context;
        this.zze = zzcbjVar;
        this.zzr = num;
        this.zzf = new WeakReference(zzcbkVar);
        zzcdh zzcdhVar = new zzcdh();
        this.zzc = zzcdhVar;
        zzxt zzxtVar = new zzxt(context);
        this.zzd = zzxtVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzD().incrementAndGet();
        zzlk zzlkVar = new zzlk(context, new zzcdt(this));
        zzlkVar.zzb(zzxtVar);
        zzlkVar.zza(zzcdhVar);
        zzll zzc = zzlkVar.zzc();
        this.zzh = zzc;
        zzc.zzy(this);
        final boolean z = false;
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new ArrayList();
        this.zzt = null;
        this.zzo = (String) zzfus.zzd(zzcbkVar != null ? zzcbkVar.zzr() : null).zzb("");
        this.zzp = zzcbkVar != null ? zzcbkVar.zzf() : 0;
        final String zzc2 = com.google.android.gms.ads.internal.zzu.zzp().zzc(context, zzcbkVar.zzn().afmaVersion);
        if (!this.zzj || this.zzi.limit() <= 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbO)).booleanValue()) {
            }
        } else {
            final byte[] bArr = new byte[this.zzi.limit()];
            this.zzi.get(bArr);
            zzfrVar = new zzfr() { // from class: com.google.android.gms.internal.ads.zzcdl
                @Override // com.google.android.gms.internal.ads.zzfr
                public final zzfs zza() {
                    return new zzfn(bArr);
                }
            };
        }
        this.zzg = new zzvm(zzfrVar, new zzvl(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzl)).booleanValue() ? new zzacp() { // from class: com.google.android.gms.internal.ads.zzcdv
            @Override // com.google.android.gms.internal.ads.zzacp
            public final /* synthetic */ zzack[] zza(Uri uri, Map map) {
                int i = zzcdw.zza;
                return new zzack[]{new zzaiq(), new zzahj(), new zzail(zzajy.zza, 32, null, null, zzfxr.zzm(), null)};
            }
        } : new zzacp() { // from class: com.google.android.gms.internal.ads.zzcdm
            @Override // com.google.android.gms.internal.ads.zzacp
            public final /* synthetic */ zzack[] zza(Uri uri, Map map) {
                int i = zzcdw.zza;
                return new zzack[]{new zzaiq(), new zzahj()};
            }
        }));
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    public final void finalize() {
        zzD().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final long zzA() {
        if (zzad()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final long zzB() {
        if (zzad()) {
            return this.zzt.zzl();
        }
        synchronized (this.zzq) {
            while (!this.zzs.isEmpty()) {
                long j = this.zzn;
                Map zze = ((zzgp) this.zzs.remove(0)).zze();
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
                                if (entry.getKey() != null && zzfuf.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
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
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzH() {
        zzih zzihVar = this.zzh;
        if (zzihVar != null) {
            zzihVar.zzA(this);
            this.zzh.zzz();
            this.zzh = null;
            zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzI(long j) {
        zzj zzjVar = (zzj) this.zzh;
        zzjVar.zza(zzjVar.zzd(), j, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzJ(int i) {
        this.zzc.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzK(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzL(zzcba zzcbaVar) {
        this.zzk = zzcbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzM(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzN(int i) {
        this.zzc.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzO(boolean z) {
        this.zzh.zzq(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzP(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzQ(boolean z) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzx();
            if (i >= 2) {
                return;
            }
            zzxt zzxtVar = this.zzd;
            zzxg zzc = zzxtVar.zzf().zzc();
            zzc.zzp(i, !z);
            zzxtVar.zzl(zzc);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzR(int i) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcdg zzcdgVar = (zzcdg) ((WeakReference) it.next()).get();
            if (zzcdgVar != null) {
                zzcdgVar.zzm(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzS(Surface surface, boolean z) {
        zzih zzihVar = this.zzh;
        if (zzihVar != null) {
            zzihVar.zzr(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzT(float f, boolean z) {
        zzih zzihVar = this.zzh;
        if (zzihVar != null) {
            zzihVar.zzs(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzU() {
        this.zzh.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final boolean zzV() {
        return this.zzh != null;
    }

    final /* synthetic */ zzfs zzW(String str, boolean z) {
        zzcdw zzcdwVar = true != z ? null : this;
        zzcbj zzcbjVar = this.zze;
        return new zzcdz(str, zzcdwVar, zzcbjVar.zzd, zzcbjVar.zze, zzcbjVar.zzm, zzcbjVar.zzn);
    }

    final /* synthetic */ zzfs zzX(String str, boolean z) {
        zzcdw zzcdwVar = true != z ? null : this;
        zzcbj zzcbjVar = this.zze;
        zzcdg zzcdgVar = new zzcdg(str, zzcdwVar, zzcbjVar.zzd, zzcbjVar.zze, zzcbjVar.zzh);
        this.zzu.add(new WeakReference(zzcdgVar));
        return zzcdgVar;
    }

    final /* synthetic */ zzfs zzY(String str, boolean z) {
        zzgb zzgbVar = new zzgb();
        zzgbVar.zzf(str);
        zzgbVar.zze(true != z ? null : this);
        zzgbVar.zzc(this.zze.zzd);
        zzgbVar.zzd(this.zze.zze);
        zzgbVar.zzb(true);
        return zzgbVar.zza();
    }

    final /* synthetic */ zzfs zzZ(zzfr zzfrVar) {
        zzfs zza2 = zzfrVar.zza();
        zzcdu zzcduVar = new zzcdu(this);
        return new zzcdj(this.zzb, zza2, this.zzo, this.zzp, this, zzcduVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final void zza(zzfs zzfsVar, zzfy zzfyVar, boolean z, int i) {
        this.zzl += i;
    }

    final zzuk zzaa(Uri uri) {
        zzam zzamVar = new zzam();
        zzamVar.zzb(uri);
        zzbc zzc = zzamVar.zzc();
        zzvm zzvmVar = this.zzg;
        zzvmVar.zza(this.zze.zzf);
        return zzvmVar.zzb(zzc);
    }

    final /* synthetic */ void zzab(boolean z, long j) {
        zzcba zzcbaVar = this.zzk;
        if (zzcbaVar != null) {
            zzcbaVar.zzi(z, j);
        }
    }

    final /* synthetic */ zzle[] zzac(Handler handler, zzaay zzaayVar, zzpe zzpeVar, zzwl zzwlVar, zztg zztgVar) {
        zzsq zzsqVar = zzsq.zza;
        Context context = this.zzb;
        zzqv zzqvVar = new zzqv(context, new zzry(context), zzsqVar, false, handler, zzpeVar, new zzqb(context).zzc());
        zzsq zzsqVar2 = zzsq.zza;
        Context context2 = this.zzb;
        return new zzle[]{zzqvVar, new zzaaa(context2, new zzry(context2), zzsqVar2, 0L, false, handler, zzaayVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final void zzb(zzfs zzfsVar, zzfy zzfyVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final void zzc(zzfs zzfsVar, zzfy zzfyVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final void zzd(zzfs zzfsVar, zzfy zzfyVar, boolean z) {
        if (zzfsVar instanceof zzgp) {
            synchronized (this.zzq) {
                this.zzs.add((zzgp) zzfsVar);
            }
        } else if (zzfsVar instanceof zzcdj) {
            this.zzt = (zzcdj) zzfsVar;
            final zzcbk zzcbkVar = (zzcbk) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbG)).booleanValue() && zzcbkVar != null && this.zzt.zzn()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcds
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = zzcdw.zza;
                        zzcbk.this.zzd("onGcacheInfoEvent", hashMap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zze(zzlo zzloVar, zzaf zzafVar, zzho zzhoVar) {
        zzcbk zzcbkVar = (zzcbk) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbG)).booleanValue() || zzcbkVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = zzafVar.zzl;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = zzafVar.zzm;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = zzafVar.zzj;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        zzcbkVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zzf(zzlo zzloVar, int i, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zzg(zzlo zzloVar, zzue zzueVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzh(zzlo zzloVar, int i, long j) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zzi(zzbw zzbwVar, zzlp zzlpVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzj(zzlo zzloVar, zztz zztzVar, zzue zzueVar, IOException iOException, boolean z) {
        zzcba zzcbaVar = this.zzk;
        if (zzcbaVar != null) {
            if (this.zze.zzj) {
                zzcbaVar.zzl("onLoadException", iOException);
            } else {
                zzcbaVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzk(zzlo zzloVar, int i) {
        zzcba zzcbaVar = this.zzk;
        if (zzcbaVar != null) {
            zzcbaVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzl(zzlo zzloVar, zzbp zzbpVar) {
        zzcba zzcbaVar = this.zzk;
        if (zzcbaVar != null) {
            zzcbaVar.zzk("onPlayerError", zzbpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zzm(zzlo zzloVar, zzbv zzbvVar, zzbv zzbvVar2, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzn(zzlo zzloVar, Object obj, long j) {
        zzcba zzcbaVar = this.zzk;
        if (zzcbaVar != null) {
            zzcbaVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zzo(zzlo zzloVar, zzhn zzhnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzp(zzlo zzloVar, zzaf zzafVar, zzho zzhoVar) {
        zzcbk zzcbkVar = (zzcbk) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbG)).booleanValue() || zzcbkVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzafVar.zzt));
        hashMap.put("bitRate", String.valueOf(zzafVar.zzi));
        hashMap.put("resolution", zzafVar.zzr + "x" + zzafVar.zzs);
        String str = zzafVar.zzl;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = zzafVar.zzm;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = zzafVar.zzj;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        zzcbkVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzq(zzlo zzloVar, zzcp zzcpVar) {
        zzcba zzcbaVar = this.zzk;
        if (zzcbaVar != null) {
            zzcbaVar.zzD(zzcpVar.zzb, zzcpVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final int zzt() {
        return this.zzh.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final long zzv() {
        return this.zzh.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min(this.zzl, this.zzt.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final long zzy() {
        return this.zzh.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final long zzz() {
        return this.zzh.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzuk zzuxVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zzuxVar = zzaa(uriArr[0]);
            } else {
                zzuk[] zzukVarArr = new zzuk[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzukVarArr[i] = zzaa(uriArr[i]);
                }
                zzuxVar = new zzux(false, false, new zztt(), zzukVarArr);
            }
            this.zzh.zzB(zzuxVar);
            this.zzh.zzp();
            zzE().incrementAndGet();
        }
    }
}
