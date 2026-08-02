package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.core.view.PointerIconCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzit extends zzm implements zzhl {
    public static final /* synthetic */ int zzd = 0;
    private final zzkm zzA;
    private final zzkn zzB;
    private final long zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private int zzG;
    private zzkd zzH;
    private zzcc zzI;
    private zzbm zzJ;
    private zzbm zzK;
    private zzaf zzL;
    private zzaf zzM;
    private AudioTrack zzN;
    private Object zzO;
    private Surface zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private zzgs zzT;
    private zzgs zzU;
    private int zzV;
    private zzk zzW;
    private float zzX;
    private boolean zzY;
    private zzdc zzZ;
    private boolean zzaa;
    private boolean zzab;
    private zzt zzac;
    private zzda zzad;
    private zzbm zzae;
    private zzju zzaf;
    private int zzag;
    private long zzah;
    private final zzhw zzai;
    private zzuc zzaj;
    final zzwa zzb;
    final zzcc zzc;
    private final zzdg zze;
    private final Context zzf;
    private final zzcg zzg;
    private final zzka[] zzh;
    private final zzvz zzi;
    private final zzdn zzj;
    private final zzjd zzk;
    private final zzdt zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzck zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzsh zzq;
    private final zzko zzr;
    private final Looper zzs;
    private final zzwh zzt;
    private final zzde zzu;
    private final zzip zzv;
    private final zzir zzw;
    private final zzgm zzx;
    private final zzgq zzy;
    private final zzkl zzz;

    static {
        zzbh.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.zzko, com.google.android.gms.internal.ads.zzwg, java.lang.Object] */
    public zzit(zzhk zzhkVar, zzcg zzcgVar) {
        zzdg zzdgVar = new zzdg(zzde.zza);
        this.zze = zzdgVar;
        try {
            zzdw.zzd("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.0.0-beta02] [" + zzen.zze + "]");
            Context applicationContext = zzhkVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? apply = zzhkVar.zzh.apply(zzhkVar.zzb);
            this.zzr = apply;
            this.zzW = zzhkVar.zzj;
            this.zzQ = zzhkVar.zzk;
            this.zzY = false;
            this.zzC = zzhkVar.zzo;
            zzip zzipVar = new zzip(this, null);
            this.zzv = zzipVar;
            zzir zzirVar = new zzir(null == true ? 1 : 0);
            this.zzw = zzirVar;
            Handler handler = new Handler(zzhkVar.zzi);
            zzka[] zza = ((zzhe) zzhkVar.zzc).zza.zza(handler, zzipVar, zzipVar, zzipVar, zzipVar);
            this.zzh = zza;
            int length = zza.length;
            zzvz zzvzVar = (zzvz) zzhkVar.zze.zza();
            this.zzi = zzvzVar;
            this.zzq = zzhk.zza(((zzhf) zzhkVar.zzd).zza);
            zzwl zzg = zzwl.zzg(((zzhi) zzhkVar.zzg).zza);
            this.zzt = zzg;
            this.zzp = zzhkVar.zzl;
            this.zzH = zzhkVar.zzm;
            Looper looper = zzhkVar.zzi;
            this.zzs = looper;
            zzde zzdeVar = zzhkVar.zzb;
            this.zzu = zzdeVar;
            this.zzg = zzcgVar;
            zzdt zzdtVar = new zzdt(looper, zzdeVar, new zzdr() { // from class: com.google.android.gms.internal.ads.zzhv
                @Override // com.google.android.gms.internal.ads.zzdr
                public final void zza(Object obj, zzaa zzaaVar) {
                }
            });
            this.zzl = zzdtVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzaj = new zzuc(0);
            int length2 = zza.length;
            zzwa zzwaVar = new zzwa(new zzkc[2], new zzvt[2], zzcy.zza, null);
            this.zzb = zzwaVar;
            this.zzn = new zzck();
            zzca zzcaVar = new zzca();
            zzcaVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            zzvzVar.zzl();
            zzcaVar.zzd(29, true);
            zzcc zze = zzcaVar.zze();
            this.zzc = zze;
            zzca zzcaVar2 = new zzca();
            zzcaVar2.zzb(zze);
            zzcaVar2.zza(4);
            zzcaVar2.zza(10);
            this.zzI = zzcaVar2.zze();
            this.zzj = zzdeVar.zzb(looper, null);
            zzhw zzhwVar = new zzhw(this);
            this.zzai = zzhwVar;
            this.zzaf = zzju.zzg(zzwaVar);
            apply.zzS(zzcgVar, looper);
            this.zzk = new zzjd(zza, zzvzVar, zzwaVar, (zzjh) zzhkVar.zzf.zza(), zzg, 0, false, apply, this.zzH, zzhkVar.zzr, zzhkVar.zzn, false, looper, zzdeVar, zzhwVar, zzen.zza < 31 ? new zznb() : zzii.zza(applicationContext, this, zzhkVar.zzp), null);
            this.zzX = 1.0f;
            zzbm zzbmVar = zzbm.zza;
            this.zzJ = zzbmVar;
            this.zzK = zzbmVar;
            this.zzae = zzbmVar;
            this.zzag = -1;
            if (zzen.zza < 21) {
                AudioTrack audioTrack = this.zzN;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.zzN.release();
                    this.zzN = null;
                }
                if (this.zzN == null) {
                    this.zzN = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.zzV = this.zzN.getAudioSessionId();
            } else {
                this.zzV = zzen.zzi(applicationContext);
            }
            this.zzZ = new zzdc(zzfvn.zzo(), 0L);
            this.zzaa = true;
            Objects.requireNonNull(apply);
            zzdtVar.zzb(apply);
            zzg.zze(new Handler(looper), apply);
            copyOnWriteArraySet.add(zzipVar);
            this.zzx = new zzgm(zzhkVar.zza, handler, zzipVar);
            this.zzy = new zzgq(zzhkVar.zza, handler, zzipVar);
            zzen.zzT(null, null);
            zzkl zzklVar = new zzkl(zzhkVar.zza, handler, zzipVar);
            this.zzz = zzklVar;
            int i = this.zzW.zzc;
            zzklVar.zzf(3);
            this.zzA = new zzkm(zzhkVar.zza);
            this.zzB = new zzkn(zzhkVar.zza);
            this.zzac = zzam(zzklVar);
            this.zzad = zzda.zza;
            zzvzVar.zzi(this.zzW);
            zzaq(1, 10, Integer.valueOf(this.zzV));
            zzaq(2, 10, Integer.valueOf(this.zzV));
            zzaq(1, 3, this.zzW);
            zzaq(2, 4, Integer.valueOf(this.zzQ));
            zzaq(2, 5, 0);
            zzaq(1, 9, Boolean.valueOf(this.zzY));
            zzaq(2, 7, zzirVar);
            zzaq(6, 8, zzirVar);
            zzdgVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    static /* bridge */ /* synthetic */ void zzN(zzit zzitVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzitVar.zzas(surface);
        zzitVar.zzP = surface;
    }

    private final int zzag() {
        if (this.zzaf.zza.zzo()) {
            return this.zzag;
        }
        zzju zzjuVar = this.zzaf;
        return zzjuVar.zza.zzn(zzjuVar.zzb.zza, this.zzn).zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzah(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    private final long zzai(zzju zzjuVar) {
        if (zzjuVar.zza.zzo()) {
            return zzen.zzv(this.zzah);
        }
        if (zzjuVar.zzb.zzb()) {
            return zzjuVar.zzr;
        }
        zzcn zzcnVar = zzjuVar.zza;
        zzsi zzsiVar = zzjuVar.zzb;
        long j = zzjuVar.zzr;
        zzak(zzcnVar, zzsiVar, j);
        return j;
    }

    private static long zzaj(zzju zzjuVar) {
        zzcm zzcmVar = new zzcm();
        zzck zzckVar = new zzck();
        zzjuVar.zza.zzn(zzjuVar.zzb.zza, zzckVar);
        long j = zzjuVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzjuVar.zza.zze(zzckVar.zzd, zzcmVar, 0L).zzm;
        return 0L;
    }

    private final long zzak(zzcn zzcnVar, zzsi zzsiVar, long j) {
        zzcnVar.zzn(zzsiVar.zza, this.zzn);
        return j;
    }

    private final Pair zzal(zzcn zzcnVar, int i, long j) {
        if (zzcnVar.zzo()) {
            this.zzag = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzah = j;
            return null;
        }
        if (i == -1 || i >= zzcnVar.zzc()) {
            i = zzcnVar.zzg(false);
            long j2 = zzcnVar.zze(i, this.zza, 0L).zzm;
            j = zzen.zzz(0L);
        }
        return zzcnVar.zzl(this.zza, this.zzn, i, zzen.zzv(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzt zzam(zzkl zzklVar) {
        return new zzt(0, zzklVar.zzb(), zzklVar.zza());
    }

    private final zzju zzan(zzju zzjuVar, zzcn zzcnVar, Pair pair) {
        zzsi zzsiVar;
        zzwa zzwaVar;
        zzju zzb;
        zzdd.zzd(zzcnVar.zzo() || pair != null);
        zzcn zzcnVar2 = zzjuVar.zza;
        zzju zzf = zzjuVar.zzf(zzcnVar);
        if (zzcnVar.zzo()) {
            zzsi zzh = zzju.zzh();
            long zzv = zzen.zzv(this.zzah);
            zzju zza = zzf.zzb(zzh, zzv, zzv, zzv, 0L, zzuh.zza, this.zzb, zzfvn.zzo()).zza(zzh);
            zza.zzp = zza.zzr;
            return zza;
        }
        Object obj = zzf.zzb.zza;
        int i = zzen.zza;
        boolean z = !obj.equals(pair.first);
        zzsi zzsiVar2 = z ? new zzsi(pair.first) : zzf.zzb;
        long longValue = ((Long) pair.second).longValue();
        long zzv2 = zzen.zzv(zzk());
        if (!zzcnVar2.zzo()) {
            zzcnVar2.zzn(obj, this.zzn);
        }
        if (z || longValue < zzv2) {
            zzdd.zzf(!zzsiVar2.zzb());
            zzuh zzuhVar = z ? zzuh.zza : zzf.zzh;
            if (z) {
                zzsiVar = zzsiVar2;
                zzwaVar = this.zzb;
            } else {
                zzsiVar = zzsiVar2;
                zzwaVar = zzf.zzi;
            }
            zzju zza2 = zzf.zzb(zzsiVar, longValue, longValue, longValue, 0L, zzuhVar, zzwaVar, z ? zzfvn.zzo() : zzf.zzj).zza(zzsiVar);
            zza2.zzp = longValue;
            return zza2;
        }
        if (longValue == zzv2) {
            int zza3 = zzcnVar.zza(zzf.zzk.zza);
            if (zza3 != -1 && zzcnVar.zzd(zza3, this.zzn, false).zzd == zzcnVar.zzn(zzsiVar2.zza, this.zzn).zzd) {
                return zzf;
            }
            zzcnVar.zzn(zzsiVar2.zza, this.zzn);
            long zzg = zzsiVar2.zzb() ? this.zzn.zzg(zzsiVar2.zzb, zzsiVar2.zzc) : this.zzn.zze;
            zzb = zzf.zzb(zzsiVar2, zzf.zzr, zzf.zzr, zzf.zzd, zzg - zzf.zzr, zzf.zzh, zzf.zzi, zzf.zzj).zza(zzsiVar2);
            zzb.zzp = zzg;
        } else {
            zzdd.zzf(!zzsiVar2.zzb());
            long max = Math.max(0L, zzf.zzq - (longValue - zzv2));
            long j = zzf.zzp;
            if (zzf.zzk.equals(zzf.zzb)) {
                j = longValue + max;
            }
            zzb = zzf.zzb(zzsiVar2, longValue, longValue, longValue, max, zzf.zzh, zzf.zzi, zzf.zzj);
            zzb.zzp = j;
        }
        return zzb;
    }

    private final zzjx zzao(zzjw zzjwVar) {
        int zzag = zzag();
        zzjd zzjdVar = this.zzk;
        zzcn zzcnVar = this.zzaf.zza;
        if (zzag == -1) {
            zzag = 0;
        }
        return new zzjx(zzjdVar, zzjwVar, zzcnVar, zzag, this.zzu, zzjdVar.zzb());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzap(final int i, final int i2) {
        if (i == this.zzR && i2 == this.zzS) {
            return;
        }
        this.zzR = i;
        this.zzS = i2;
        zzdt zzdtVar = this.zzl;
        zzdtVar.zzd(24, new zzdq() { // from class: com.google.android.gms.internal.ads.zzhz
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                int i3 = i;
                int i4 = i2;
                int i5 = zzit.zzd;
                ((zzcd) obj).zzr(i3, i4);
            }
        });
        zzdtVar.zzc();
    }

    private final void zzaq(int i, int i2, Object obj) {
        zzka[] zzkaVarArr = this.zzh;
        int length = zzkaVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzka zzkaVar = zzkaVarArr[i3];
            if (zzkaVar.zzb() == i) {
                zzjx zzao = zzao(zzkaVar);
                zzao.zzf(i2);
                zzao.zze(obj);
                zzao.zzd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzar() {
        zzaq(1, 2, Float.valueOf(this.zzX * this.zzy.zza()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzas(Object obj) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        zzka[] zzkaVarArr = this.zzh;
        int length = zzkaVarArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= 2) {
                break;
            }
            zzka zzkaVar = zzkaVarArr[i];
            if (zzkaVar.zzb() == 2) {
                zzjx zzao = zzao(zzkaVar);
                zzao.zzf(1);
                zzao.zze(obj);
                zzao.zzd();
                arrayList.add(zzao);
            }
            i++;
        }
        Object obj2 = this.zzO;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzjx) it.next()).zzi(this.zzC);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.zzO;
            Surface surface = this.zzP;
            if (obj3 == surface) {
                surface.release();
                this.zzP = null;
            }
        }
        this.zzO = obj;
        if (z) {
            zzat(false, zzha.zzd(new zzjf(3), PointerIconCompat.TYPE_HELP));
        }
    }

    private final void zzat(boolean z, zzha zzhaVar) {
        zzju zzjuVar = this.zzaf;
        zzju zza = zzjuVar.zza(zzjuVar.zzb);
        zza.zzp = zza.zzr;
        zza.zzq = 0L;
        zzju zze = zza.zze(1);
        if (zzhaVar != null) {
            zze = zze.zzd(zzhaVar);
        }
        zzju zzjuVar2 = zze;
        this.zzD++;
        this.zzk.zzo();
        zzav(zzjuVar2, 0, 1, false, zzjuVar2.zza.zzo() && !this.zzaf.zza.zzo(), 4, zzai(zzjuVar2), -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzau(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        zzju zzjuVar = this.zzaf;
        if (zzjuVar.zzl == z2 && zzjuVar.zzm == i3) {
            return;
        }
        this.zzD++;
        zzju zzc = zzjuVar.zzc(z2, i3);
        this.zzk.zzn(z2, i3);
        zzav(zzc, 0, i2, false, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzav(final zzju zzjuVar, final int i, final int i2, boolean z, boolean z2, final int i3, long j, int i4) {
        Pair pair;
        int i5;
        final zzbg zzbgVar;
        boolean z3;
        boolean z4;
        int i6;
        int i7;
        int i8;
        Object obj;
        zzbg zzbgVar2;
        Object obj2;
        int i9;
        long j2;
        long zzaj;
        Object obj3;
        zzbg zzbgVar3;
        Object obj4;
        int i10;
        zzju zzjuVar2 = this.zzaf;
        this.zzaf = zzjuVar;
        boolean z5 = !zzjuVar2.zza.equals(zzjuVar.zza);
        zzcn zzcnVar = zzjuVar2.zza;
        zzcn zzcnVar2 = zzjuVar.zza;
        if (zzcnVar2.zzo() && zzcnVar.zzo()) {
            pair = new Pair(false, -1);
        } else if (zzcnVar2.zzo() != zzcnVar.zzo()) {
            pair = new Pair(true, 3);
        } else if (zzcnVar.zze(zzcnVar.zzn(zzjuVar2.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc.equals(zzcnVar2.zze(zzcnVar2.zzn(zzjuVar.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc)) {
            pair = (z2 && i3 == 0 && zzjuVar2.zzb.zzd < zzjuVar.zzb.zzd) ? new Pair(true, 0) : new Pair(false, -1);
        } else {
            if (z2 && i3 == 0) {
                i5 = 1;
            } else if (z2 && i3 == 1) {
                i5 = 2;
            } else {
                if (!z5) {
                    throw new IllegalStateException();
                }
                i5 = 3;
            }
            pair = new Pair(true, Integer.valueOf(i5));
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue = ((Integer) pair.second).intValue();
        zzbm zzbmVar = this.zzJ;
        if (booleanValue) {
            zzbgVar = !zzjuVar.zza.zzo() ? zzjuVar.zza.zze(zzjuVar.zza.zzn(zzjuVar.zzb.zza, this.zzn).zzd, this.zza, 0L).zzd : null;
            this.zzae = zzbm.zza;
        } else {
            zzbgVar = null;
        }
        if (booleanValue || !zzjuVar2.zzj.equals(zzjuVar.zzj)) {
            zzbk zza = this.zzae.zza();
            List list = zzjuVar.zzj;
            for (int i11 = 0; i11 < list.size(); i11++) {
                zzbq zzbqVar = (zzbq) list.get(i11);
                for (int i12 = 0; i12 < zzbqVar.zza(); i12++) {
                    zzbqVar.zzb(i12).zza(zza);
                }
            }
            this.zzae = zza.zzv();
            zzcn zzn = zzn();
            if (zzn.zzo()) {
                zzbmVar = this.zzae;
            } else {
                zzbg zzbgVar4 = zzn.zze(zzf(), this.zza, 0L).zzd;
                zzbk zza2 = this.zzae.zza();
                zza2.zzb(zzbgVar4.zzg);
                zzbmVar = zza2.zzv();
            }
        }
        boolean z6 = !zzbmVar.equals(this.zzJ);
        this.zzJ = zzbmVar;
        boolean z7 = zzjuVar2.zzl;
        boolean z8 = zzjuVar.zzl;
        int i13 = zzjuVar2.zze;
        int i14 = zzjuVar.zze;
        if (i13 != i14 || z7 != z8) {
            zzaw();
        }
        boolean z9 = zzjuVar2.zzg;
        boolean z10 = zzjuVar.zzg;
        if (zzjuVar2.zza.equals(zzjuVar.zza)) {
            z3 = z7;
        } else {
            z3 = z7;
            this.zzl.zzd(0, new zzdq() { // from class: com.google.android.gms.internal.ads.zzib
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj5) {
                    zzju zzjuVar3 = zzju.this;
                    int i15 = i;
                    int i16 = zzit.zzd;
                    ((zzcd) obj5).zzs(zzjuVar3.zza, i15);
                }
            });
        }
        if (z2) {
            zzck zzckVar = new zzck();
            if (zzjuVar2.zza.zzo()) {
                z4 = z8;
                i6 = i13;
                i7 = i14;
                i8 = i4;
                obj = null;
                zzbgVar2 = null;
                obj2 = null;
                i9 = -1;
            } else {
                Object obj5 = zzjuVar2.zzb.zza;
                zzjuVar2.zza.zzn(obj5, zzckVar);
                int i15 = zzckVar.zzd;
                z4 = z8;
                i6 = i13;
                i7 = i14;
                i9 = zzjuVar2.zza.zza(obj5);
                obj2 = obj5;
                obj = zzjuVar2.zza.zze(i15, this.zza, 0L).zzc;
                zzbgVar2 = this.zza.zzd;
                i8 = i15;
            }
            if (i3 == 0) {
                if (zzjuVar2.zzb.zzb()) {
                    zzsi zzsiVar = zzjuVar2.zzb;
                    j2 = zzckVar.zzg(zzsiVar.zzb, zzsiVar.zzc);
                    zzaj = zzaj(zzjuVar2);
                    long zzz = zzen.zzz(j2);
                    zzsi zzsiVar2 = zzjuVar2.zzb;
                    final zzcf zzcfVar = new zzcf(obj, i8, zzbgVar2, obj2, i9, zzz, zzen.zzz(zzaj), zzsiVar2.zzb, zzsiVar2.zzc);
                    int zzf = zzf();
                    if (this.zzaf.zza.zzo()) {
                        zzju zzjuVar3 = this.zzaf;
                        Object obj6 = zzjuVar3.zzb.zza;
                        zzjuVar3.zza.zzn(obj6, this.zzn);
                        i10 = this.zzaf.zza.zza(obj6);
                        obj3 = this.zzaf.zza.zze(zzf, this.zza, 0L).zzc;
                        zzbgVar3 = this.zza.zzd;
                        obj4 = obj6;
                    } else {
                        obj3 = null;
                        zzbgVar3 = null;
                        obj4 = null;
                        i10 = -1;
                    }
                    long zzz2 = zzen.zzz(j);
                    long zzz3 = !this.zzaf.zzb.zzb() ? zzen.zzz(zzaj(this.zzaf)) : zzz2;
                    zzsi zzsiVar3 = this.zzaf.zzb;
                    final zzcf zzcfVar2 = new zzcf(obj3, zzf, zzbgVar3, obj4, i10, zzz2, zzz3, zzsiVar3.zzb, zzsiVar3.zzc);
                    this.zzl.zzd(11, new zzdq() { // from class: com.google.android.gms.internal.ads.zzih
                        @Override // com.google.android.gms.internal.ads.zzdq
                        public final void zza(Object obj7) {
                            int i16 = i3;
                            zzcf zzcfVar3 = zzcfVar;
                            zzcf zzcfVar4 = zzcfVar2;
                            int i17 = zzit.zzd;
                            ((zzcd) obj7).zzo(zzcfVar3, zzcfVar4, i16);
                        }
                    });
                } else {
                    j2 = zzjuVar2.zzb.zze != -1 ? zzaj(this.zzaf) : zzckVar.zze;
                    zzaj = j2;
                    long zzz4 = zzen.zzz(j2);
                    zzsi zzsiVar22 = zzjuVar2.zzb;
                    final zzcf zzcfVar3 = new zzcf(obj, i8, zzbgVar2, obj2, i9, zzz4, zzen.zzz(zzaj), zzsiVar22.zzb, zzsiVar22.zzc);
                    int zzf2 = zzf();
                    if (this.zzaf.zza.zzo()) {
                    }
                    long zzz22 = zzen.zzz(j);
                    if (!this.zzaf.zzb.zzb()) {
                    }
                    zzsi zzsiVar32 = this.zzaf.zzb;
                    final zzcf zzcfVar22 = new zzcf(obj3, zzf2, zzbgVar3, obj4, i10, zzz22, zzz3, zzsiVar32.zzb, zzsiVar32.zzc);
                    this.zzl.zzd(11, new zzdq() { // from class: com.google.android.gms.internal.ads.zzih
                        @Override // com.google.android.gms.internal.ads.zzdq
                        public final void zza(Object obj7) {
                            int i16 = i3;
                            zzcf zzcfVar32 = zzcfVar3;
                            zzcf zzcfVar4 = zzcfVar22;
                            int i17 = zzit.zzd;
                            ((zzcd) obj7).zzo(zzcfVar32, zzcfVar4, i16);
                        }
                    });
                }
            } else if (zzjuVar2.zzb.zzb()) {
                j2 = zzjuVar2.zzr;
                zzaj = zzaj(zzjuVar2);
                long zzz42 = zzen.zzz(j2);
                zzsi zzsiVar222 = zzjuVar2.zzb;
                final zzcf zzcfVar32 = new zzcf(obj, i8, zzbgVar2, obj2, i9, zzz42, zzen.zzz(zzaj), zzsiVar222.zzb, zzsiVar222.zzc);
                int zzf22 = zzf();
                if (this.zzaf.zza.zzo()) {
                }
                long zzz222 = zzen.zzz(j);
                if (!this.zzaf.zzb.zzb()) {
                }
                zzsi zzsiVar322 = this.zzaf.zzb;
                final zzcf zzcfVar222 = new zzcf(obj3, zzf22, zzbgVar3, obj4, i10, zzz222, zzz3, zzsiVar322.zzb, zzsiVar322.zzc);
                this.zzl.zzd(11, new zzdq() { // from class: com.google.android.gms.internal.ads.zzih
                    @Override // com.google.android.gms.internal.ads.zzdq
                    public final void zza(Object obj7) {
                        int i16 = i3;
                        zzcf zzcfVar322 = zzcfVar32;
                        zzcf zzcfVar4 = zzcfVar222;
                        int i17 = zzit.zzd;
                        ((zzcd) obj7).zzo(zzcfVar322, zzcfVar4, i16);
                    }
                });
            } else {
                j2 = zzjuVar2.zzr;
                zzaj = j2;
                long zzz422 = zzen.zzz(j2);
                zzsi zzsiVar2222 = zzjuVar2.zzb;
                final zzcf zzcfVar322 = new zzcf(obj, i8, zzbgVar2, obj2, i9, zzz422, zzen.zzz(zzaj), zzsiVar2222.zzb, zzsiVar2222.zzc);
                int zzf222 = zzf();
                if (this.zzaf.zza.zzo()) {
                }
                long zzz2222 = zzen.zzz(j);
                if (!this.zzaf.zzb.zzb()) {
                }
                zzsi zzsiVar3222 = this.zzaf.zzb;
                final zzcf zzcfVar2222 = new zzcf(obj3, zzf222, zzbgVar3, obj4, i10, zzz2222, zzz3, zzsiVar3222.zzb, zzsiVar3222.zzc);
                this.zzl.zzd(11, new zzdq() { // from class: com.google.android.gms.internal.ads.zzih
                    @Override // com.google.android.gms.internal.ads.zzdq
                    public final void zza(Object obj7) {
                        int i16 = i3;
                        zzcf zzcfVar3222 = zzcfVar322;
                        zzcf zzcfVar4 = zzcfVar2222;
                        int i17 = zzit.zzd;
                        ((zzcd) obj7).zzo(zzcfVar3222, zzcfVar4, i16);
                    }
                });
            }
        } else {
            z4 = z8;
            i6 = i13;
            i7 = i14;
        }
        if (booleanValue) {
            this.zzl.zzd(1, new zzdq() { // from class: com.google.android.gms.internal.ads.zzhm
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    zzbg zzbgVar5 = zzbg.this;
                    int i16 = intValue;
                    int i17 = zzit.zzd;
                    ((zzcd) obj7).zzf(zzbgVar5, i16);
                }
            });
        }
        if (zzjuVar2.zzf != zzjuVar.zzf) {
            this.zzl.zzd(10, new zzdq() { // from class: com.google.android.gms.internal.ads.zzhn
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    zzju zzjuVar4 = zzju.this;
                    int i16 = zzit.zzd;
                    ((zzcd) obj7).zzm(zzjuVar4.zzf);
                }
            });
            if (zzjuVar.zzf != null) {
                this.zzl.zzd(10, new zzdq() { // from class: com.google.android.gms.internal.ads.zzho
                    @Override // com.google.android.gms.internal.ads.zzdq
                    public final void zza(Object obj7) {
                        zzju zzjuVar4 = zzju.this;
                        int i16 = zzit.zzd;
                        ((zzcd) obj7).zzl(zzjuVar4.zzf);
                    }
                });
            }
        }
        zzwa zzwaVar = zzjuVar2.zzi;
        zzwa zzwaVar2 = zzjuVar.zzi;
        if (zzwaVar != zzwaVar2) {
            this.zzi.zzo(zzwaVar2.zze);
            this.zzl.zzd(2, new zzdq() { // from class: com.google.android.gms.internal.ads.zzhp
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    zzju zzjuVar4 = zzju.this;
                    int i16 = zzit.zzd;
                    ((zzcd) obj7).zzt(zzjuVar4.zzi.zzd);
                }
            });
        }
        if (z6) {
            final zzbm zzbmVar2 = this.zzJ;
            this.zzl.zzd(14, new zzdq() { // from class: com.google.android.gms.internal.ads.zzhq
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    zzbm zzbmVar3 = zzbm.this;
                    int i16 = zzit.zzd;
                    ((zzcd) obj7).zzg(zzbmVar3);
                }
            });
        }
        if (z9 != z10) {
            this.zzl.zzd(3, new zzdq() { // from class: com.google.android.gms.internal.ads.zzhr
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    zzju zzjuVar4 = zzju.this;
                    int i16 = zzit.zzd;
                    ((zzcd) obj7).zzd(zzjuVar4.zzg);
                }
            });
        }
        int i16 = i6;
        int i17 = i7;
        boolean z11 = z4;
        boolean z12 = z3;
        if (i16 != i17 || z12 != z11) {
            this.zzl.zzd(-1, new zzdq() { // from class: com.google.android.gms.internal.ads.zzhs
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    zzju zzjuVar4 = zzju.this;
                    int i18 = zzit.zzd;
                    ((zzcd) obj7).zzn(zzjuVar4.zzl, zzjuVar4.zze);
                }
            });
        }
        if (i16 != i17) {
            this.zzl.zzd(4, new zzdq() { // from class: com.google.android.gms.internal.ads.zzht
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    zzju zzjuVar4 = zzju.this;
                    int i18 = zzit.zzd;
                    ((zzcd) obj7).zzj(zzjuVar4.zze);
                }
            });
        }
        if (z12 != z11) {
            this.zzl.zzd(5, new zzdq() { // from class: com.google.android.gms.internal.ads.zzic
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    zzju zzjuVar4 = zzju.this;
                    int i18 = i2;
                    int i19 = zzit.zzd;
                    ((zzcd) obj7).zzh(zzjuVar4.zzl, i18);
                }
            });
        }
        if (zzjuVar2.zzm != zzjuVar.zzm) {
            this.zzl.zzd(6, new zzdq() { // from class: com.google.android.gms.internal.ads.zzid
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    zzju zzjuVar4 = zzju.this;
                    int i18 = zzit.zzd;
                    ((zzcd) obj7).zzk(zzjuVar4.zzm);
                }
            });
        }
        if (zzay(zzjuVar2) != zzay(zzjuVar)) {
            this.zzl.zzd(7, new zzdq() { // from class: com.google.android.gms.internal.ads.zzie
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    ((zzcd) obj7).zze(zzit.zzay(zzju.this));
                }
            });
        }
        if (!zzjuVar2.zzn.equals(zzjuVar.zzn)) {
            this.zzl.zzd(12, new zzdq() { // from class: com.google.android.gms.internal.ads.zzif
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    zzju zzjuVar4 = zzju.this;
                    int i18 = zzit.zzd;
                    ((zzcd) obj7).zzi(zzjuVar4.zzn);
                }
            });
        }
        if (z) {
            this.zzl.zzd(-1, new zzdq() { // from class: com.google.android.gms.internal.ads.zzig
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    ((zzcd) obj7).zzp();
                }
            });
        }
        zzcc zzccVar = this.zzI;
        zzcc zzG = zzen.zzG(this.zzg, this.zzc);
        this.zzI = zzG;
        if (!zzG.equals(zzccVar)) {
            this.zzl.zzd(13, new zzdq() { // from class: com.google.android.gms.internal.ads.zzhu
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    zzit.this.zzU((zzcd) obj7);
                }
            });
        }
        this.zzl.zzc();
        if (zzjuVar2.zzo != zzjuVar.zzo) {
            Iterator it = this.zzm.iterator();
            while (it.hasNext()) {
                ((zzhb) it.next()).zza(zzjuVar.zzo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaw() {
        int zzh = zzh();
        if (zzh == 2 || zzh == 3) {
            zzax();
            boolean z = this.zzaf.zzo;
            zzq();
            zzq();
        }
    }

    private final void zzax() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String zzI = zzen.zzI("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (this.zzaa) {
                throw new IllegalStateException(zzI);
            }
            zzdw.zzf("ExoPlayerImpl", zzI, this.zzab ? null : new IllegalStateException());
            this.zzab = true;
        }
    }

    private static boolean zzay(zzju zzjuVar) {
        return zzjuVar.zze == 3 && zzjuVar.zzl && zzjuVar.zzm == 0;
    }

    public final zzha zzA() {
        zzax();
        return this.zzaf.zzf;
    }

    final /* synthetic */ void zzS(zzjb zzjbVar) {
        long j;
        boolean z;
        long j2;
        int i = this.zzD - zzjbVar.zzb;
        this.zzD = i;
        boolean z2 = true;
        if (zzjbVar.zzc) {
            this.zzE = zzjbVar.zzd;
            this.zzF = true;
        }
        if (zzjbVar.zze) {
            this.zzG = zzjbVar.zzf;
        }
        if (i == 0) {
            zzcn zzcnVar = zzjbVar.zza.zza;
            if (!this.zzaf.zza.zzo() && zzcnVar.zzo()) {
                this.zzag = -1;
                this.zzah = 0L;
            }
            if (!zzcnVar.zzo()) {
                List zzw = ((zzjy) zzcnVar).zzw();
                zzdd.zzf(zzw.size() == this.zzo.size());
                for (int i2 = 0; i2 < zzw.size(); i2++) {
                    ((zzis) this.zzo.get(i2)).zzb = (zzcn) zzw.get(i2);
                }
            }
            if (this.zzF) {
                if (zzjbVar.zza.zzb.equals(this.zzaf.zzb) && zzjbVar.zza.zzd == this.zzaf.zzr) {
                    z2 = false;
                }
                if (z2) {
                    if (zzcnVar.zzo() || zzjbVar.zza.zzb.zzb()) {
                        j2 = zzjbVar.zza.zzd;
                    } else {
                        zzju zzjuVar = zzjbVar.zza;
                        zzsi zzsiVar = zzjuVar.zzb;
                        j2 = zzjuVar.zzd;
                        zzak(zzcnVar, zzsiVar, j2);
                    }
                    z = z2;
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                    z = z2;
                }
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.zzF = false;
            zzav(zzjbVar.zza, 1, this.zzG, false, z, this.zzE, j, -1);
        }
    }

    final /* synthetic */ void zzT(final zzjb zzjbVar) {
        this.zzj.zzg(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhx
            @Override // java.lang.Runnable
            public final void run() {
                zzit.this.zzS(zzjbVar);
            }
        });
    }

    final /* synthetic */ void zzU(zzcd zzcdVar) {
        zzcdVar.zza(this.zzI);
    }

    public final void zzW() {
        zzax();
        boolean zzq = zzq();
        int zzb = this.zzy.zzb(zzq, 2);
        zzau(zzq, zzb, zzah(zzq, zzb));
        zzju zzjuVar = this.zzaf;
        if (zzjuVar.zze != 1) {
            return;
        }
        zzju zzd2 = zzjuVar.zzd(null);
        zzju zze = zzd2.zze(true == zzd2.zza.zzo() ? 4 : 2);
        this.zzD++;
        this.zzk.zzk();
        zzav(zze, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final void zzX() {
        AudioTrack audioTrack;
        zzdw.zzd("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.0.0-beta02] [" + zzen.zze + "] [" + zzbh.zza() + "]");
        zzax();
        if (zzen.zza < 21 && (audioTrack = this.zzN) != null) {
            audioTrack.release();
            this.zzN = null;
        }
        this.zzz.zze();
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzdt zzdtVar = this.zzl;
            zzdtVar.zzd(10, new zzdq() { // from class: com.google.android.gms.internal.ads.zzhy
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj) {
                    ((zzcd) obj).zzl(zzha.zzd(new zzjf(1), PointerIconCompat.TYPE_HELP));
                }
            });
            zzdtVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zzd(null);
        this.zzt.zzf(this.zzr);
        zzju zze = this.zzaf.zze(1);
        this.zzaf = zze;
        zzju zza = zze.zza(zze.zzb);
        this.zzaf = zza;
        zza.zzp = zza.zzr;
        this.zzaf.zzq = 0L;
        this.zzr.zzQ();
        this.zzi.zzh();
        Surface surface = this.zzP;
        if (surface != null) {
            surface.release();
            this.zzP = null;
        }
        this.zzZ = new zzdc(zzfvn.zzo(), 0L);
    }

    public final void zzY(zzkr zzkrVar) {
        this.zzr.zzR(zzkrVar);
    }

    public final void zzZ(zzsk zzskVar) {
        zzax();
        List singletonList = Collections.singletonList(zzskVar);
        zzax();
        zzax();
        zzag();
        zzl();
        this.zzD++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzo.remove(i);
            }
            this.zzaj = this.zzaj.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            zzjr zzjrVar = new zzjr((zzsk) singletonList.get(i2), this.zzp);
            arrayList.add(zzjrVar);
            this.zzo.add(i2, new zzis(zzjrVar.zzb, zzjrVar.zza.zzA()));
        }
        this.zzaj = this.zzaj.zzg(0, arrayList.size());
        zzjy zzjyVar = new zzjy(this.zzo, this.zzaj, null);
        if (!zzjyVar.zzo() && zzjyVar.zzc() < 0) {
            throw new zzag(zzjyVar, -1, -9223372036854775807L);
        }
        int zzg = zzjyVar.zzg(false);
        zzju zzan = zzan(this.zzaf, zzjyVar, zzal(zzjyVar, zzg, -9223372036854775807L));
        int i3 = zzan.zze;
        if (zzg != -1 && i3 != 1) {
            i3 = (zzjyVar.zzo() || zzg >= zzjyVar.zzc()) ? 4 : 2;
        }
        zzju zze = zzan.zze(i3);
        this.zzk.zzq(arrayList, zzg, zzen.zzv(-9223372036854775807L), this.zzaj);
        zzav(zze, 0, 1, false, (this.zzaf.zzb.zza.equals(zze.zzb.zza) || this.zzaf.zza.zzo()) ? false : true, 4, zzai(zze), -1);
    }

    public final void zzaa(boolean z) {
        zzax();
        int zzb = this.zzy.zzb(z, zzh());
        zzau(z, zzb, zzah(z, zzb));
    }

    final void zzab(boolean z) {
        this.zzaa = false;
    }

    public final void zzac(Surface surface) {
        zzax();
        zzas(surface);
        int i = surface == null ? 0 : -1;
        zzap(i, i);
    }

    public final void zzad(float f) {
        zzax();
        final float zza = zzen.zza(f, 0.0f, 1.0f);
        if (this.zzX == zza) {
            return;
        }
        this.zzX = zza;
        zzar();
        zzdt zzdtVar = this.zzl;
        zzdtVar.zzd(22, new zzdq() { // from class: com.google.android.gms.internal.ads.zzia
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                float f2 = zza;
                int i = zzit.zzd;
                ((zzcd) obj).zzv(f2);
            }
        });
        zzdtVar.zzc();
    }

    public final void zzae() {
        zzax();
        zzax();
        this.zzy.zzb(zzq(), 1);
        zzat(false, null);
        this.zzZ = new zzdc(zzfvn.zzo(), this.zzaf.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzd() {
        zzax();
        if (zzs()) {
            return this.zzaf.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zze() {
        zzax();
        if (zzs()) {
            return this.zzaf.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzf() {
        zzax();
        int zzag = zzag();
        if (zzag == -1) {
            return 0;
        }
        return zzag;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzg() {
        zzax();
        if (this.zzaf.zza.zzo()) {
            return 0;
        }
        zzju zzjuVar = this.zzaf;
        return zzjuVar.zza.zza(zzjuVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzh() {
        zzax();
        return this.zzaf.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzi() {
        zzax();
        return this.zzaf.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzj() {
        zzax();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zzk() {
        zzax();
        if (!zzs()) {
            return zzl();
        }
        zzju zzjuVar = this.zzaf;
        zzjuVar.zza.zzn(zzjuVar.zzb.zza, this.zzn);
        zzju zzjuVar2 = this.zzaf;
        if (zzjuVar2.zzc != -9223372036854775807L) {
            return zzen.zzz(0L) + zzen.zzz(this.zzaf.zzc);
        }
        long j = zzjuVar2.zza.zze(zzf(), this.zza, 0L).zzm;
        return zzen.zzz(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zzl() {
        zzax();
        return zzen.zzz(zzai(this.zzaf));
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zzm() {
        zzax();
        return zzen.zzz(this.zzaf.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzcn zzn() {
        zzax();
        return this.zzaf.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzcy zzo() {
        zzax();
        return this.zzaf.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzp(int i, long j) {
        zzax();
        this.zzr.zzx();
        zzcn zzcnVar = this.zzaf.zza;
        if (i < 0 || (!zzcnVar.zzo() && i >= zzcnVar.zzc())) {
            throw new zzag(zzcnVar, i, j);
        }
        this.zzD++;
        if (zzs()) {
            zzdw.zze("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            zzjb zzjbVar = new zzjb(this.zzaf);
            zzjbVar.zza(1);
            this.zzai.zza.zzT(zzjbVar);
            return;
        }
        int i2 = zzh() != 1 ? 2 : 1;
        int zzf = zzf();
        zzju zzan = zzan(this.zzaf.zze(i2), zzcnVar, zzal(zzcnVar, i, j));
        this.zzk.zzl(zzcnVar, i, zzen.zzv(j));
        zzav(zzan, 0, 1, true, true, 1, zzai(zzan), zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzq() {
        zzax();
        return this.zzaf.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzr() {
        zzax();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzs() {
        zzax();
        return this.zzaf.zzb.zzb();
    }

    public final int zzu() {
        zzax();
        int length = this.zzh.length;
        return 2;
    }

    public final long zzv() {
        zzax();
        if (zzs()) {
            zzju zzjuVar = this.zzaf;
            return zzjuVar.zzk.equals(zzjuVar.zzb) ? zzen.zzz(this.zzaf.zzp) : zzw();
        }
        zzax();
        if (this.zzaf.zza.zzo()) {
            return this.zzah;
        }
        zzju zzjuVar2 = this.zzaf;
        long j = 0;
        if (zzjuVar2.zzk.zzd != zzjuVar2.zzb.zzd) {
            return zzen.zzz(zzjuVar2.zza.zze(zzf(), this.zza, 0L).zzn);
        }
        long j2 = zzjuVar2.zzp;
        if (this.zzaf.zzk.zzb()) {
            zzju zzjuVar3 = this.zzaf;
            zzjuVar3.zza.zzn(zzjuVar3.zzk.zza, this.zzn).zzh(this.zzaf.zzk.zzb);
        } else {
            j = j2;
        }
        zzju zzjuVar4 = this.zzaf;
        zzak(zzjuVar4.zza, zzjuVar4.zzk, j);
        return zzen.zzz(j);
    }

    public final long zzw() {
        zzax();
        if (zzs()) {
            zzju zzjuVar = this.zzaf;
            zzsi zzsiVar = zzjuVar.zzb;
            zzjuVar.zza.zzn(zzsiVar.zza, this.zzn);
            return zzen.zzz(this.zzn.zzg(zzsiVar.zzb, zzsiVar.zzc));
        }
        zzcn zzn = zzn();
        if (zzn.zzo()) {
            return -9223372036854775807L;
        }
        return zzen.zzz(zzn.zze(zzf(), this.zza, 0L).zzn);
    }

    public final void zzR(zzkr zzkrVar) {
        zzko zzkoVar = this.zzr;
        Objects.requireNonNull(zzkrVar);
        zzkoVar.zzw(zzkrVar);
    }
}
