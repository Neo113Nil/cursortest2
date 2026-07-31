package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.iab.vast.tags.VastAttributes;
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

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzcku extends zzchw implements zziq, zznt {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcke zzc;
    private final zzabc zzd;
    private final zzcie zze;
    private final WeakReference zzf;
    private final zzyx zzg;

    @Nullable
    private zzjy zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzchv zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;

    @Nullable
    private Integer zzr;
    private final ArrayList zzs;

    @Nullable
    private volatile zzckh zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzcG)).booleanValue() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ef, code lost:
    
        if (r5.zzl == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f1, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzckk(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0108, code lost:
    
        if (r5.zzi == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010a, code lost:
    
        r5 = new com.google.android.gms.internal.ads.zzckn(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0112, code lost:
    
        r4 = r3.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0114, code lost:
    
        if (r4 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011a, code lost:
    
        if (r4.limit() <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011c, code lost:
    
        r4 = new byte[r3.zzi.limit()];
        r3.zzi.get(r4);
        r5 = new com.google.android.gms.internal.ads.zzcko(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0111, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        if (r5.zzh <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzckm(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0101, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzckl(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
    
        if (r5.zzi == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcku(Context context, zzcie zzcieVar, zzcif zzcifVar, @Nullable Integer num) {
        final zzhr zzhrVar;
        this.zzb = context;
        this.zze = zzcieVar;
        this.zzr = num;
        this.zzf = new WeakReference(zzcifVar);
        zzcke zzckeVar = new zzcke();
        this.zzc = zzckeVar;
        zzabc zzabcVar = new zzabc(context);
        this.zzd = zzabcVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzchw.zzf().incrementAndGet();
        zznn zznnVar = new zznn(context, new zznj() { // from class: com.google.android.gms.internal.ads.zzckp
            @Override // com.google.android.gms.internal.ads.zznj
            public final /* synthetic */ zzne[] zza(Handler handler, zzaey zzaeyVar, zzrz zzrzVar, zzzu zzzuVar, zzwo zzwoVar) {
                return zzcku.this.zzW(handler, zzaeyVar, zzrzVar, zzzuVar, zzwoVar);
            }
        });
        zznnVar.zza(zzabcVar);
        zznnVar.zzb(zzckeVar);
        zzno zzc = zznnVar.zzc();
        this.zzh = zzc;
        zzc.zzD(this);
        final boolean z = false;
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new ArrayList();
        this.zzt = null;
        this.zzo = (String) zzgui.zzd(zzcifVar != null ? zzcifVar.zzn() : null).zza("");
        this.zzp = zzcifVar != null ? zzcifVar.zzp() : 0;
        final String zze = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzcifVar.zzs().afmaVersion);
        if (!this.zzj || this.zzi.limit() <= 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcO)).booleanValue()) {
            }
        } else {
            final byte[] bArr = new byte[this.zzi.limit()];
            this.zzi.get(bArr);
            zzhrVar = new zzhr() { // from class: com.google.android.gms.internal.ads.zzckj
                @Override // com.google.android.gms.internal.ads.zzhr
                public final /* synthetic */ zzhs zza() {
                    int i = zzcku.zza;
                    return new zzhn(bArr);
                }
            };
        }
        this.zzg = new zzyx(zzhrVar, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzq)).booleanValue() ? zzckr.zza : zzckq.zza);
    }

    private final boolean zzY() {
        return this.zzt != null && this.zzt.zzl();
    }

    public final void finalize() {
        zzchw.zzf().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzA(int i) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzckd zzckdVar = (zzckd) ((WeakReference) it.next()).get();
            if (zzckdVar != null) {
                zzckdVar.zzk(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final boolean zzB() {
        return this.zzh != null;
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final int zzC() {
        return this.zzh.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final long zzD() {
        return this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzE(boolean z) {
        this.zzh.zzj(z);
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzF(int i) {
        this.zzc.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzG(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final long zzH() {
        return this.zzh.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final long zzI() {
        if (zzY()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final long zzJ() {
        if (zzY() && this.zzt.zzm()) {
            return Math.min(this.zzl, this.zzt.zzo());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final long zzK() {
        if (zzY()) {
            return this.zzt.zzp();
        }
        synchronized (this.zzq) {
            while (true) {
                ArrayList arrayList = this.zzs;
                if (!arrayList.isEmpty()) {
                    long j = this.zzn;
                    Map zzj = ((zzil) arrayList.remove(0)).zzj();
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
                                    if (entry.getKey() != null && zzgts.zze("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
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

    @Override // com.google.android.gms.internal.ads.zzchw
    public final int zzL() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzM(boolean z) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzF();
            if (i >= 2) {
                return;
            }
            zzabc zzabcVar = this.zzd;
            zzaap zzd = zzabcVar.zzc().zzd();
            zzd.zzy(i, !z);
            zzabcVar.zzf(zzd);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final long zzN() {
        return this.zzh.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final long zzO() {
        return this.zzl;
    }

    @VisibleForTesting
    final zzxq zzR(Uri uri) {
        zzz zzzVar = new zzz();
        zzzVar.zzb(uri);
        zzak zzc = zzzVar.zzc();
        zzyx zzyxVar = this.zzg;
        zzyxVar.zza(this.zze.zzf);
        return zzyxVar.zzb(zzc);
    }

    final /* synthetic */ zzhs zzS(String str, boolean z) {
        zzcku zzckuVar = true != z ? null : this;
        zzcie zzcieVar = this.zze;
        return new zzckx(str, zzckuVar, zzcieVar.zzd, zzcieVar.zze, zzcieVar.zzm, zzcieVar.zzn);
    }

    final /* synthetic */ zzhs zzT(String str, boolean z) {
        zzhz zzhzVar = new zzhz();
        zzhzVar.zzb(str);
        zzhzVar.zzf(true != z ? null : this);
        zzcie zzcieVar = this.zze;
        zzhzVar.zzc(zzcieVar.zzd);
        zzhzVar.zzd(zzcieVar.zze);
        zzhzVar.zze(true);
        return zzhzVar.zza();
    }

    final /* synthetic */ zzhs zzU(String str, boolean z) {
        zzcku zzckuVar = true != z ? null : this;
        zzcie zzcieVar = this.zze;
        zzckd zzckdVar = new zzckd(str, zzckuVar, zzcieVar.zzd, zzcieVar.zze, zzcieVar.zzh);
        this.zzu.add(new WeakReference(zzckdVar));
        return zzckdVar;
    }

    final /* synthetic */ zzhs zzV(zzhr zzhrVar) {
        zzhs zza2 = zzhrVar.zza();
        zzckf zzckfVar = new zzckf() { // from class: com.google.android.gms.internal.ads.zzcks
            @Override // com.google.android.gms.internal.ads.zzckf
            public final /* synthetic */ void zza(boolean z, long j) {
                zzcku.this.zzX(z, j);
            }
        };
        return new zzckh(this.zzb, zza2, this.zzo, this.zzp, this, zzckfVar);
    }

    final /* synthetic */ zzne[] zzW(Handler handler, zzaey zzaeyVar, zzrz zzrzVar, zzzu zzzuVar, zzwo zzwoVar) {
        zzwb zzwbVar = zzwb.zzb;
        Context context = this.zzb;
        zzuc zzucVar = new zzuc(context, new zzvh(context, null, null), zzwbVar, false, handler, zzrzVar, new zztp(context).zza());
        zzadk zzadkVar = new zzadk(context);
        zzadkVar.zza(zzwbVar);
        zzadkVar.zzb(handler);
        zzadkVar.zzc(zzaeyVar);
        return new zzne[]{zzucVar, zzadkVar.zzd()};
    }

    final /* synthetic */ void zzX(boolean z, long j) {
        zzchv zzchvVar = this.zzk;
        if (zzchvVar != null) {
            zzchvVar.zzr(z, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final void zza(zzhs zzhsVar, zzhw zzhwVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final void zzb(zzhs zzhsVar, zzhw zzhwVar, boolean z) {
        if (zzhsVar instanceof zzil) {
            synchronized (this.zzq) {
                this.zzs.add((zzil) zzhsVar);
            }
        } else if (zzhsVar instanceof zzckh) {
            this.zzt = (zzckh) zzhsVar;
            final zzcif zzcifVar = (zzcif) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcG)).booleanValue() && zzcifVar != null && this.zzt.zzk()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzm()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzn()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckt
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        int i = zzcku.zza;
                        zzcif.this.zze("onGcacheInfoEvent", hashMap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final void zzc(zzhs zzhsVar, zzhw zzhwVar, boolean z, int i) {
        this.zzl += i;
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final void zzd(zzhs zzhsVar, zzhw zzhwVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void zze(zznr zznrVar, int i) {
        zzchv zzchvVar = this.zzk;
        if (zzchvVar != null) {
            zzchvVar.zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void zzg(zznr zznrVar, zzau zzauVar) {
        zzchv zzchvVar = this.zzk;
        if (zzchvVar != null) {
            zzchvVar.zzu("onPlayerError", zzauVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void zzh(zznr zznrVar, zzxf zzxfVar, zzxk zzxkVar, IOException iOException, boolean z) {
        zzchv zzchvVar = this.zzk;
        if (zzchvVar != null) {
            if (this.zze.zzj) {
                zzchvVar.zzv("onLoadException", iOException);
            } else {
                zzchvVar.zzu("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    @Nullable
    public final Integer zzj() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void zzk(zznr zznrVar, zzv zzvVar, @Nullable zzjf zzjfVar) {
        zzcif zzcifVar = (zzcif) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcG)).booleanValue() || zzcifVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = zzvVar.zzo;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = zzvVar.zzp;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        zzcifVar.zze("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void zzl(zznr zznrVar, zzv zzvVar, @Nullable zzjf zzjfVar) {
        zzcif zzcifVar = (zzcif) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcG)).booleanValue() || zzcifVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzvVar.zzA));
        hashMap.put("bitRate", String.valueOf(zzvVar.zzj));
        int i = zzvVar.zzw;
        int i2 = zzvVar.zzx;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
        sb.append(i);
        sb.append(VastAttributes.HORIZONTAL_POSITION);
        sb.append(i2);
        hashMap.put("resolution", sb.toString());
        String str = zzvVar.zzo;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = zzvVar.zzp;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        zzcifVar.zze("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void zzm(zznr zznrVar, int i, long j) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzn(@Nullable Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void zzo(zznr zznrVar, Object obj, long j) {
        zzchv zzchvVar = this.zzk;
        if (zzchvVar != null) {
            zzchvVar.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void zzp(zznr zznrVar, zzbv zzbvVar) {
        zzchv zzchvVar = this.zzk;
        if (zzchvVar != null) {
            zzchvVar.zzt(zzbvVar.zzb, zzbvVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzq(Uri[] uriArr, String str) {
        zzr(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzs(zzchv zzchvVar) {
        this.zzk = zzchvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzt() {
        zzjy zzjyVar = this.zzh;
        if (zzjyVar != null) {
            zzjyVar.zzE(this);
            this.zzh.zzH();
            this.zzh = null;
            zzchw.zzi().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzu(Surface surface, boolean z) {
        zzjy zzjyVar = this.zzh;
        if (zzjyVar != null) {
            zzjyVar.zzC(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzv(float f, boolean z) {
        zzjy zzjyVar = this.zzh;
        if (zzjyVar != null) {
            zzjyVar.zzB(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzw() {
        this.zzh.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzx(long j) {
        this.zzh.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzy(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzz(int i) {
        this.zzc.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzr(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzxq zzyfVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zzyfVar = zzR(uriArr[0]);
            } else {
                zzxq[] zzxqVarArr = new zzxq[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzxqVarArr[i] = zzR(uriArr[i]);
                }
                zzyfVar = new zzyf(false, false, new zzwz(), zzxqVarArr);
            }
            this.zzh.zzG(zzyfVar);
            this.zzh.zzg();
            zzchw.zzi().incrementAndGet();
        }
    }
}
