package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
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

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzckg extends zzcip implements zzbab, zzaxz, zzbbl, zzatt, zzasj {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzcjv zze;
    private final zzatb zzf;
    private final zzatb zzg;
    private final zzazd zzh;
    private final zzcix zzi;
    private zzasm zzj;
    private ByteBuffer zzk;
    private boolean zzl;
    private final WeakReference zzm;
    private zzcio zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private final String zzr;
    private final int zzs;
    private final ArrayList zzu;
    private volatile zzcju zzv;
    private final Object zzt = new Object();
    private final Set zzw = new HashSet();

    public zzckg(Context context, zzcix zzcixVar, zzciy zzciyVar) {
        this.zzd = context;
        this.zzi = zzcixVar;
        this.zzm = new WeakReference(zzciyVar);
        zzcjv zzcjvVar = new zzcjv();
        this.zze = zzcjvVar;
        zzbba zzbbaVar = new zzbba(context, zzaww.zza, 0L, com.google.android.gms.ads.internal.util.zzs.zza, this, -1);
        this.zzf = zzbbaVar;
        zzaui zzauiVar = new zzaui(zzaww.zza, null, true, com.google.android.gms.ads.internal.util.zzs.zza, this);
        this.zzg = zzauiVar;
        zzayz zzayzVar = new zzayz(null);
        this.zzh = zzayzVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        zza.incrementAndGet();
        zzasm zza = zzasn.zza(new zzatb[]{zzauiVar, zzbbaVar}, zzayzVar, zzcjvVar);
        this.zzj = zza;
        zza.zze(this);
        this.zzo = 0;
        this.zzq = 0L;
        this.zzp = 0;
        this.zzu = new ArrayList();
        this.zzv = null;
        this.zzr = (zzciyVar == null || zzciyVar.zzt() == null) ? "" : zzciyVar.zzt();
        this.zzs = zzciyVar != null ? zzciyVar.zzh() : 0;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzn)).booleanValue()) {
            this.zzj.zzg();
        }
        if (zzciyVar != null && zzciyVar.zzg() > 0) {
            this.zzj.zzp(zzciyVar.zzg());
        }
        if (zzciyVar != null && zzciyVar.zzf() > 0) {
            this.zzj.zzo(zzciyVar.zzf());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzp)).booleanValue()) {
            this.zzj.zzi();
            this.zzj.zzh(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzq)).intValue());
        }
    }

    private final boolean zzY() {
        return this.zzv != null && this.zzv.zzk();
    }

    public final void finalize() throws Throwable {
        zza.decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final long zzA() {
        if (zzY()) {
            return 0L;
        }
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final long zzB() {
        if (zzY()) {
            return this.zzv.zzf();
        }
        synchronized (this.zzt) {
            while (!this.zzu.isEmpty()) {
                long j = this.zzq;
                Map zze = ((zzazv) this.zzu.remove(0)).zze();
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
                this.zzq = j + j2;
            }
        }
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzC(Uri[] uriArr, String str) {
        zzD(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzE() {
        zzasm zzasmVar = this.zzj;
        if (zzasmVar != null) {
            zzasmVar.zzl(this);
            this.zzj.zzk();
            this.zzj = null;
            zzb.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzF(long j) {
        this.zzj.zzm(j);
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzG(int i) {
        this.zze.zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzH(int i) {
        this.zze.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzI(zzcio zzcioVar) {
        this.zzn = zzcioVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzJ(int i) {
        this.zze.zzh(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzK(int i) {
        this.zze.zzi(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzL(boolean z) {
        this.zzj.zzq(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzM(boolean z) {
        if (this.zzj != null) {
            for (int i = 0; i < 2; i++) {
                this.zzh.zze(i, !z);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzN(int i) {
        Iterator it = this.zzw.iterator();
        while (it.hasNext()) {
            zzcjs zzcjsVar = (zzcjs) ((WeakReference) it.next()).get();
            if (zzcjsVar != null) {
                zzcjsVar.zzh(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzO(Surface surface, boolean z) {
        zzasm zzasmVar = this.zzj;
        if (zzasmVar == null) {
            return;
        }
        zzasl zzaslVar = new zzasl(this.zzf, 1, surface);
        if (z) {
            zzasmVar.zzf(zzaslVar);
        } else {
            zzasmVar.zzn(zzaslVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzP(float f, boolean z) {
        if (this.zzj == null) {
            return;
        }
        this.zzj.zzn(new zzasl(this.zzg, 2, Float.valueOf(f)));
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzQ() {
        this.zzj.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final boolean zzR() {
        return this.zzj != null;
    }

    final /* synthetic */ zzazm zzS(String str, boolean z) {
        zzckg zzckgVar = true != z ? null : this;
        zzcix zzcixVar = this.zzi;
        zzcjs zzcjsVar = new zzcjs(str, zzckgVar, zzcixVar.zzd, zzcixVar.zzf, zzcixVar.zzi);
        this.zzw.add(new WeakReference(zzcjsVar));
        return zzcjsVar;
    }

    final /* synthetic */ zzazm zzT(String str, boolean z) {
        zzckg zzckgVar = true != z ? null : this;
        zzcix zzcixVar = this.zzi;
        return new zzazq(str, null, zzckgVar, zzcixVar.zzd, zzcixVar.zzf, true, null);
    }

    final /* synthetic */ zzazm zzU(zzazl zzazlVar) {
        return new zzcju(this.zzd, zzazlVar.zza(), this.zzr, this.zzs, this, new zzckc(this), null);
    }

    final /* synthetic */ void zzV(boolean z, long j) {
        zzcio zzcioVar = this.zzn;
        if (zzcioVar != null) {
            zzcioVar.zzi(z, j);
        }
    }

    public final void zzW(zzazm zzazmVar, int i) {
        this.zzo += i;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    /* renamed from: zzX, reason: merged with bridge method [inline-methods] */
    public final void zzk(zzazm zzazmVar, zzazo zzazoVar) {
        if (zzazmVar instanceof zzazv) {
            synchronized (this.zzt) {
                this.zzu.add((zzazv) zzazmVar);
            }
        } else if (zzazmVar instanceof zzcju) {
            this.zzv = (zzcju) zzazmVar;
            final zzciy zzciyVar = (zzciy) this.zzm.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbD)).booleanValue() && zzciyVar != null && this.zzv.zzh()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzv.zzj()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzv.zzi()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckd
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzciy zzciyVar2 = zzciy.this;
                        Map map = hashMap;
                        int i = zzckg.zzc;
                        zzciyVar2.zzd("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasj
    public final void zza(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzasj
    public final void zzb(zzata zzataVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzasj
    public final void zzc(zzasi zzasiVar) {
        zzcio zzcioVar = this.zzn;
        if (zzcioVar != null) {
            zzcioVar.zzk("onPlayerError", zzasiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasj
    public final void zzd(boolean z, int i) {
        zzcio zzcioVar = this.zzn;
        if (zzcioVar != null) {
            zzcioVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasj
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzasj
    public final void zzf(zzath zzathVar, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzasj
    public final void zzg(zzayt zzaytVar, zzazf zzazfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void zzh(zzasw zzaswVar) {
        zzciy zzciyVar = (zzciy) this.zzm.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbD)).booleanValue() || zzciyVar == null || zzaswVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", zzaswVar.zze);
        hashMap.put("audioSampleMime", zzaswVar.zzf);
        hashMap.put("audioCodec", zzaswVar.zzc);
        zzciyVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzaxz
    public final void zzi(IOException iOException) {
        zzcio zzcioVar = this.zzn;
        if (zzcioVar != null) {
            if (this.zzi.zzl) {
                zzcioVar.zzl("onLoadException", iOException);
            } else {
                zzcioVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final /* synthetic */ void zzj(Object obj, int i) {
        this.zzo += i;
    }

    @Override // com.google.android.gms.internal.ads.zzbbl
    public final void zzl(int i, long j) {
        this.zzp += i;
    }

    @Override // com.google.android.gms.internal.ads.zzbbl
    public final void zzm(Surface surface) {
        zzcio zzcioVar = this.zzn;
        if (zzcioVar != null) {
            zzcioVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbl
    public final void zzn(zzasw zzaswVar) {
        zzciy zzciyVar = (zzciy) this.zzm.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbD)).booleanValue() || zzciyVar == null || zzaswVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzaswVar.zzl));
        hashMap.put("bitRate", String.valueOf(zzaswVar.zzb));
        hashMap.put("resolution", zzaswVar.zzj + "x" + zzaswVar.zzk);
        hashMap.put("videoMime", zzaswVar.zze);
        hashMap.put("videoSampleMime", zzaswVar.zzf);
        hashMap.put("videoCodec", zzaswVar.zzc);
        zzciyVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbbl
    public final void zzo(int i, int i2, int i3, float f) {
        zzcio zzcioVar = this.zzn;
        if (zzcioVar != null) {
            zzcioVar.zzC(i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(com.google.android.gms.internal.ads.zzbjc.zzbD)).booleanValue() == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final zzaye zzp(Uri uri, final String str) {
        final zzazl zzazlVar;
        zzazl zzazlVar2;
        if (!this.zzl || this.zzk.limit() <= 0) {
            final boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbM)).booleanValue()) {
            }
            if (this.zzi.zzj) {
                z = false;
            }
            zzcix zzcixVar = this.zzi;
            zzazlVar = zzcixVar.zzo ? new zzazl() { // from class: com.google.android.gms.internal.ads.zzcjx
                @Override // com.google.android.gms.internal.ads.zzazl
                public final zzazm zza() {
                    return zzckg.this.zzq(str, z);
                }
            } : zzcixVar.zzi > 0 ? new zzazl() { // from class: com.google.android.gms.internal.ads.zzcjy
                @Override // com.google.android.gms.internal.ads.zzazl
                public final zzazm zza() {
                    return zzckg.this.zzS(str, z);
                }
            } : new zzazl() { // from class: com.google.android.gms.internal.ads.zzcjz
                @Override // com.google.android.gms.internal.ads.zzazl
                public final zzazm zza() {
                    return zzckg.this.zzT(str, z);
                }
            };
            if (this.zzi.zzj) {
                zzazlVar = new zzazl() { // from class: com.google.android.gms.internal.ads.zzcka
                    @Override // com.google.android.gms.internal.ads.zzazl
                    public final zzazm zza() {
                        return zzckg.this.zzU(zzazlVar);
                    }
                };
            }
            ByteBuffer byteBuffer = this.zzk;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.zzk.limit()];
                this.zzk.get(bArr);
                zzazlVar2 = new zzazl() { // from class: com.google.android.gms.internal.ads.zzckb
                    @Override // com.google.android.gms.internal.ads.zzazl
                    public final zzazm zza() {
                        zzazl zzazlVar3 = zzazl.this;
                        byte[] bArr2 = bArr;
                        int i = zzckg.zzc;
                        return new zzckh(new zzazk(bArr2), bArr2.length, zzazlVar3.zza());
                    }
                };
                return new zzaya(uri, zzazlVar2, !((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzm)).booleanValue() ? new zzavb() { // from class: com.google.android.gms.internal.ads.zzcke
                    @Override // com.google.android.gms.internal.ads.zzavb
                    public final zzauz[] zza() {
                        int i = zzckg.zzc;
                        return new zzauz[]{new zzawm(), new zzavr(0), new zzawi(0, null, null)};
                    }
                } : new zzavb() { // from class: com.google.android.gms.internal.ads.zzckf
                    @Override // com.google.android.gms.internal.ads.zzavb
                    public final zzauz[] zza() {
                        int i = zzckg.zzc;
                        return new zzauz[]{new zzawm(), new zzavr(0)};
                    }
                }, this.zzi.zzk, com.google.android.gms.ads.internal.util.zzs.zza, this, null, this.zzi.zzg);
            }
        } else {
            final byte[] bArr2 = new byte[this.zzk.limit()];
            this.zzk.get(bArr2);
            zzazlVar = new zzazl() { // from class: com.google.android.gms.internal.ads.zzcjw
                @Override // com.google.android.gms.internal.ads.zzazl
                public final zzazm zza() {
                    return new zzazk(bArr2);
                }
            };
        }
        zzazlVar2 = zzazlVar;
        return new zzaya(uri, zzazlVar2, !((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzm)).booleanValue() ? new zzavb() { // from class: com.google.android.gms.internal.ads.zzcke
            @Override // com.google.android.gms.internal.ads.zzavb
            public final zzauz[] zza() {
                int i = zzckg.zzc;
                return new zzauz[]{new zzawm(), new zzavr(0), new zzawi(0, null, null)};
            }
        } : new zzavb() { // from class: com.google.android.gms.internal.ads.zzckf
            @Override // com.google.android.gms.internal.ads.zzavb
            public final zzauz[] zza() {
                int i = zzckg.zzc;
                return new zzauz[]{new zzawm(), new zzavr(0)};
            }
        }, this.zzi.zzk, com.google.android.gms.ads.internal.util.zzs.zza, this, null, this.zzi.zzg);
    }

    final /* synthetic */ zzazm zzq(String str, boolean z) {
        zzckg zzckgVar = true != z ? null : this;
        zzcix zzcixVar = this.zzi;
        return new zzckk(str, zzckgVar, zzcixVar.zzd, zzcixVar.zzf, zzcixVar.zzp, zzcixVar.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final int zzr() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final int zzt() {
        return this.zzj.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final long zzv() {
        return this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final long zzw() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final long zzx() {
        if (zzY() && this.zzv.zzj()) {
            return Math.min(this.zzo, this.zzv.zze());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final long zzy() {
        return this.zzj.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final long zzz() {
        return this.zzj.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcip
    public final void zzD(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzaye zzayiVar;
        if (this.zzj == null) {
            return;
        }
        this.zzk = byteBuffer;
        this.zzl = z;
        int length = uriArr.length;
        if (length == 1) {
            zzayiVar = zzp(uriArr[0], str);
        } else {
            zzaye[] zzayeVarArr = new zzaye[length];
            for (int i = 0; i < uriArr.length; i++) {
                zzayeVarArr[i] = zzp(uriArr[i], str);
            }
            zzayiVar = new zzayi(zzayeVarArr);
        }
        this.zzj.zzj(zzayiVar);
        zzb.incrementAndGet();
    }
}
