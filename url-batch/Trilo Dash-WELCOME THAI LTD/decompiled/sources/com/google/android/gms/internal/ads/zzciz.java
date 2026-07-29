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

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzciz extends zzchi implements zzayx, zzawv, zzbah, zzasp, zzarf {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzcio zze;
    private final zzarx zzf;
    private final zzarx zzg;
    private final zzaxz zzh;
    private final zzchq zzi;
    private zzari zzj;
    private ByteBuffer zzk;
    private boolean zzl;
    private final WeakReference zzm;
    private zzchh zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private final String zzr;
    private final int zzs;
    private final ArrayList zzu;
    private volatile zzcin zzv;
    private final Object zzt = new Object();
    private final Set zzw = new HashSet();

    public zzciz(Context context, zzchq zzchqVar, zzchr zzchrVar) {
        this.zzd = context;
        this.zzi = zzchqVar;
        this.zzm = new WeakReference(zzchrVar);
        zzcio zzcioVar = new zzcio();
        this.zze = zzcioVar;
        zzazw zzazwVar = new zzazw(context, zzavs.zza, 0L, com.google.android.gms.ads.internal.util.zzs.zza, this, -1);
        this.zzf = zzazwVar;
        zzate zzateVar = new zzate(zzavs.zza, null, true, com.google.android.gms.ads.internal.util.zzs.zza, this);
        this.zzg = zzateVar;
        zzaxv zzaxvVar = new zzaxv(null);
        this.zzh = zzaxvVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        zza.incrementAndGet();
        zzari zza = zzarj.zza(new zzarx[]{zzateVar, zzazwVar}, zzaxvVar, zzcioVar);
        this.zzj = zza;
        zza.zze(this);
        this.zzo = 0;
        this.zzq = 0L;
        this.zzp = 0;
        this.zzu = new ArrayList();
        this.zzv = null;
        this.zzr = (zzchrVar == null || zzchrVar.zzt() == null) ? "" : zzchrVar.zzt();
        this.zzs = zzchrVar != null ? zzchrVar.zzh() : 0;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzn)).booleanValue()) {
            this.zzj.zzg();
        }
        if (zzchrVar != null && zzchrVar.zzg() > 0) {
            this.zzj.zzp(zzchrVar.zzg());
        }
        if (zzchrVar != null && zzchrVar.zzf() > 0) {
            this.zzj.zzo(zzchrVar.zzf());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzp)).booleanValue()) {
            this.zzj.zzi();
            this.zzj.zzh(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzq)).intValue());
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

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzA() {
        if (zzY()) {
            return 0L;
        }
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzB() {
        if (zzY()) {
            return this.zzv.zzf();
        }
        synchronized (this.zzt) {
            while (!this.zzu.isEmpty()) {
                long j = this.zzq;
                Map zze = ((zzayr) this.zzu.remove(0)).zze();
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
                                if (entry.getKey() != null && zzfoa.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
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

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzC(Uri[] uriArr, String str) {
        zzD(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzE() {
        zzari zzariVar = this.zzj;
        if (zzariVar != null) {
            zzariVar.zzl(this);
            this.zzj.zzk();
            this.zzj = null;
            zzb.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzF(long j) {
        this.zzj.zzm(j);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzG(int i) {
        this.zze.zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzH(int i) {
        this.zze.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzI(zzchh zzchhVar) {
        this.zzn = zzchhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzJ(int i) {
        this.zze.zzh(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzK(int i) {
        this.zze.zzi(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzL(boolean z) {
        this.zzj.zzq(z);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzM(boolean z) {
        if (this.zzj != null) {
            for (int i = 0; i < 2; i++) {
                this.zzh.zze(i, !z);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzN(int i) {
        Iterator it = this.zzw.iterator();
        while (it.hasNext()) {
            zzcil zzcilVar = (zzcil) ((WeakReference) it.next()).get();
            if (zzcilVar != null) {
                zzcilVar.zzh(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzO(Surface surface, boolean z) {
        zzari zzariVar = this.zzj;
        if (zzariVar == null) {
            return;
        }
        zzarh zzarhVar = new zzarh(this.zzf, 1, surface);
        if (z) {
            zzariVar.zzf(zzarhVar);
        } else {
            zzariVar.zzn(zzarhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzP(float f, boolean z) {
        if (this.zzj == null) {
            return;
        }
        this.zzj.zzn(new zzarh(this.zzg, 2, Float.valueOf(f)));
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzQ() {
        this.zzj.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final boolean zzR() {
        return this.zzj != null;
    }

    final /* synthetic */ zzayi zzS(String str, boolean z) {
        zzciz zzcizVar = true != z ? null : this;
        zzchq zzchqVar = this.zzi;
        zzcil zzcilVar = new zzcil(str, zzcizVar, zzchqVar.zzd, zzchqVar.zzf, zzchqVar.zzi);
        this.zzw.add(new WeakReference(zzcilVar));
        return zzcilVar;
    }

    final /* synthetic */ zzayi zzT(String str, boolean z) {
        zzciz zzcizVar = true != z ? null : this;
        zzchq zzchqVar = this.zzi;
        return new zzaym(str, null, zzcizVar, zzchqVar.zzd, zzchqVar.zzf, true, null);
    }

    final /* synthetic */ zzayi zzU(zzayh zzayhVar) {
        return new zzcin(this.zzd, zzayhVar.zza(), this.zzr, this.zzs, this, new zzciv(this), null);
    }

    final /* synthetic */ void zzV(boolean z, long j) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzi(z, j);
        }
    }

    public final void zzW(zzayi zzayiVar, int i) {
        this.zzo += i;
    }

    @Override // com.google.android.gms.internal.ads.zzayx
    /* renamed from: zzX, reason: merged with bridge method [inline-methods] */
    public final void zzk(zzayi zzayiVar, zzayk zzaykVar) {
        if (zzayiVar instanceof zzayr) {
            synchronized (this.zzt) {
                this.zzu.add((zzayr) zzayiVar);
            }
        } else if (zzayiVar instanceof zzcin) {
            this.zzv = (zzcin) zzayiVar;
            final zzchr zzchrVar = (zzchr) this.zzm.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() && zzchrVar != null && this.zzv.zzh()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzv.zzj()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzv.zzi()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzchr zzchrVar2 = zzchr.this;
                        Map map = hashMap;
                        int i = zzciz.zzc;
                        zzchrVar2.zzd("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarf
    public final void zza(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzarf
    public final void zzb(zzarw zzarwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzarf
    public final void zzc(zzare zzareVar) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzk("onPlayerError", zzareVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarf
    public final void zzd(boolean z, int i) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzarf
    public final void zzf(zzasd zzasdVar, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzarf
    public final void zzg(zzaxp zzaxpVar, zzayb zzaybVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final void zzh(zzars zzarsVar) {
        zzchr zzchrVar = (zzchr) this.zzm.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() || zzchrVar == null || zzarsVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", zzarsVar.zze);
        hashMap.put("audioSampleMime", zzarsVar.zzf);
        hashMap.put("audioCodec", zzarsVar.zzc);
        zzchrVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zzi(IOException iOException) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            if (this.zzi.zzl) {
                zzchhVar.zzl("onLoadException", iOException);
            } else {
                zzchhVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayx
    public final /* synthetic */ void zzj(Object obj, int i) {
        this.zzo += i;
    }

    @Override // com.google.android.gms.internal.ads.zzbah
    public final void zzl(int i, long j) {
        this.zzp += i;
    }

    @Override // com.google.android.gms.internal.ads.zzbah
    public final void zzm(Surface surface) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbah
    public final void zzn(zzars zzarsVar) {
        zzchr zzchrVar = (zzchr) this.zzm.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() || zzchrVar == null || zzarsVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzarsVar.zzl));
        hashMap.put("bitRate", String.valueOf(zzarsVar.zzb));
        hashMap.put("resolution", zzarsVar.zzj + "x" + zzarsVar.zzk);
        hashMap.put("videoMime", zzarsVar.zze);
        hashMap.put("videoSampleMime", zzarsVar.zzf);
        hashMap.put("videoCodec", zzarsVar.zzc);
        zzchrVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbah
    public final void zzo(int i, int i2, int i3, float f) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzC(i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(com.google.android.gms.internal.ads.zzbhy.zzbB)).booleanValue() == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final zzaxa zzp(Uri uri, final String str) {
        final zzayh zzayhVar;
        zzayh zzayhVar2;
        if (!this.zzl || this.zzk.limit() <= 0) {
            final boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbK)).booleanValue()) {
            }
            if (this.zzi.zzj) {
                z = false;
            }
            zzchq zzchqVar = this.zzi;
            zzayhVar = zzchqVar.zzo ? new zzayh() { // from class: com.google.android.gms.internal.ads.zzciq
                @Override // com.google.android.gms.internal.ads.zzayh
                public final zzayi zza() {
                    return zzciz.this.zzq(str, z);
                }
            } : zzchqVar.zzi > 0 ? new zzayh() { // from class: com.google.android.gms.internal.ads.zzcir
                @Override // com.google.android.gms.internal.ads.zzayh
                public final zzayi zza() {
                    return zzciz.this.zzS(str, z);
                }
            } : new zzayh() { // from class: com.google.android.gms.internal.ads.zzcis
                @Override // com.google.android.gms.internal.ads.zzayh
                public final zzayi zza() {
                    return zzciz.this.zzT(str, z);
                }
            };
            if (this.zzi.zzj) {
                zzayhVar = new zzayh() { // from class: com.google.android.gms.internal.ads.zzcit
                    @Override // com.google.android.gms.internal.ads.zzayh
                    public final zzayi zza() {
                        return zzciz.this.zzU(zzayhVar);
                    }
                };
            }
            ByteBuffer byteBuffer = this.zzk;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.zzk.limit()];
                this.zzk.get(bArr);
                zzayhVar2 = new zzayh() { // from class: com.google.android.gms.internal.ads.zzciu
                    @Override // com.google.android.gms.internal.ads.zzayh
                    public final zzayi zza() {
                        zzayh zzayhVar3 = zzayh.this;
                        byte[] bArr2 = bArr;
                        int i = zzciz.zzc;
                        return new zzcja(new zzayg(bArr2), bArr2.length, zzayhVar3.zza());
                    }
                };
                return new zzaww(uri, zzayhVar2, !((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzm)).booleanValue() ? new zzatx() { // from class: com.google.android.gms.internal.ads.zzcix
                    @Override // com.google.android.gms.internal.ads.zzatx
                    public final zzatv[] zza() {
                        int i = zzciz.zzc;
                        return new zzatv[]{new zzavi(), new zzaun(0), new zzave(0, null, null)};
                    }
                } : new zzatx() { // from class: com.google.android.gms.internal.ads.zzciy
                    @Override // com.google.android.gms.internal.ads.zzatx
                    public final zzatv[] zza() {
                        int i = zzciz.zzc;
                        return new zzatv[]{new zzavi(), new zzaun(0)};
                    }
                }, this.zzi.zzk, com.google.android.gms.ads.internal.util.zzs.zza, this, null, this.zzi.zzg);
            }
        } else {
            final byte[] bArr2 = new byte[this.zzk.limit()];
            this.zzk.get(bArr2);
            zzayhVar = new zzayh() { // from class: com.google.android.gms.internal.ads.zzcip
                @Override // com.google.android.gms.internal.ads.zzayh
                public final zzayi zza() {
                    return new zzayg(bArr2);
                }
            };
        }
        zzayhVar2 = zzayhVar;
        return new zzaww(uri, zzayhVar2, !((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzm)).booleanValue() ? new zzatx() { // from class: com.google.android.gms.internal.ads.zzcix
            @Override // com.google.android.gms.internal.ads.zzatx
            public final zzatv[] zza() {
                int i = zzciz.zzc;
                return new zzatv[]{new zzavi(), new zzaun(0), new zzave(0, null, null)};
            }
        } : new zzatx() { // from class: com.google.android.gms.internal.ads.zzciy
            @Override // com.google.android.gms.internal.ads.zzatx
            public final zzatv[] zza() {
                int i = zzciz.zzc;
                return new zzatv[]{new zzavi(), new zzaun(0)};
            }
        }, this.zzi.zzk, com.google.android.gms.ads.internal.util.zzs.zza, this, null, this.zzi.zzg);
    }

    final /* synthetic */ zzayi zzq(String str, boolean z) {
        zzciz zzcizVar = true != z ? null : this;
        zzchq zzchqVar = this.zzi;
        return new zzcjd(str, zzcizVar, zzchqVar.zzd, zzchqVar.zzf, zzchqVar.zzp, zzchqVar.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final int zzr() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final int zzt() {
        return this.zzj.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzv() {
        return this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzw() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzx() {
        if (zzY() && this.zzv.zzj()) {
            return Math.min(this.zzo, this.zzv.zze());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzy() {
        return this.zzj.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzz() {
        return this.zzj.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzD(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzaxa zzaxeVar;
        if (this.zzj == null) {
            return;
        }
        this.zzk = byteBuffer;
        this.zzl = z;
        int length = uriArr.length;
        if (length == 1) {
            zzaxeVar = zzp(uriArr[0], str);
        } else {
            zzaxa[] zzaxaVarArr = new zzaxa[length];
            for (int i = 0; i < uriArr.length; i++) {
                zzaxaVarArr[i] = zzp(uriArr[i], str);
            }
            zzaxeVar = new zzaxe(zzaxaVarArr);
        }
        this.zzj.zzj(zzaxeVar);
        zzb.incrementAndGet();
    }
}
