package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
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

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzin extends zzk implements zzhf {
    public static final /* synthetic */ int zzd = 0;
    private final zzkg zzA;
    private final zzkh zzB;
    private final long zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private int zzG;
    private zzjx zzH;
    private zzbx zzI;
    private zzbh zzJ;
    private zzbh zzK;
    private zzad zzL;
    private zzad zzM;
    private AudioTrack zzN;
    private Object zzO;
    private Surface zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private zzgm zzT;
    private zzgm zzU;
    private int zzV;
    private zzi zzW;
    private float zzX;
    private boolean zzY;
    private List zzZ;
    private boolean zzaa;
    private boolean zzab;
    private zzr zzac;
    private zzcv zzad;
    private zzbh zzae;
    private zzjo zzaf;
    private int zzag;
    private long zzah;
    private final zzhq zzai;
    private zztu zzaj;
    final zzvo zzb;
    final zzbx zzc;
    private final zzcz zze;
    private final Context zzf;
    private final zzcb zzg;
    private final zzju[] zzh;
    private final zzvn zzi;
    private final zzdg zzj;
    private final zzix zzk;
    private final zzdm zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzcf zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzsa zzq;
    private final zzki zzr;
    private final Looper zzs;
    private final zzvv zzt;
    private final zzcx zzu;
    private final zzij zzv;
    private final zzil zzw;
    private final zzgg zzx;
    private final zzgk zzy;
    private final zzkf zzz;

    static {
        zzbc.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.zzki, com.google.android.gms.internal.ads.zzvu, java.lang.Object] */
    public zzin(zzhe zzheVar, zzcb zzcbVar) {
        Object obj;
        zzcz zzczVar = new zzcz(zzcx.zza);
        this.zze = zzczVar;
        try {
            Log.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.0.0-alpha03] [" + zzeg.zze + "]");
            Context applicationContext = zzheVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? apply = zzheVar.zzh.apply(zzheVar.zzb);
            this.zzr = apply;
            this.zzW = zzheVar.zzj;
            this.zzQ = 1;
            this.zzY = false;
            this.zzC = 2000L;
            zzij zzijVar = new zzij(this, null);
            this.zzv = zzijVar;
            zzil zzilVar = new zzil(null == true ? 1 : 0);
            this.zzw = zzilVar;
            Handler handler = new Handler(zzheVar.zzi);
            zzju[] zza = ((zzgy) zzheVar.zzc).zza.zza(handler, zzijVar, zzijVar, zzijVar, zzijVar);
            this.zzh = zza;
            int length = zza.length;
            zzvn zzvnVar = (zzvn) zzheVar.zze.zza();
            this.zzi = zzvnVar;
            this.zzq = zzhe.zza(((zzgz) zzheVar.zzd).zza);
            zzvz zzg = zzvz.zzg(((zzhc) zzheVar.zzg).zza);
            this.zzt = zzg;
            this.zzp = true;
            this.zzH = zzheVar.zzk;
            Looper looper = zzheVar.zzi;
            this.zzs = looper;
            zzcx zzcxVar = zzheVar.zzb;
            this.zzu = zzcxVar;
            this.zzg = zzcbVar;
            zzdm zzdmVar = new zzdm(looper, zzcxVar, new zzdk() { // from class: com.google.android.gms.internal.ads.zzhp
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj2, zzy zzyVar) {
                }
            });
            this.zzl = zzdmVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzaj = new zztu(0);
            int length2 = zza.length;
            zzvo zzvoVar = new zzvo(new zzjw[2], new zzvh[2], zzct.zza, null);
            this.zzb = zzvoVar;
            this.zzn = new zzcf();
            zzbv zzbvVar = new zzbv();
            zzbvVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            zzvnVar.zzh();
            zzbvVar.zzd(29, true);
            zzbx zze = zzbvVar.zze();
            this.zzc = zze;
            zzbv zzbvVar2 = new zzbv();
            zzbvVar2.zzb(zze);
            zzbvVar2.zza(4);
            zzbvVar2.zza(10);
            this.zzI = zzbvVar2.zze();
            this.zzj = zzcxVar.zzb(looper, null);
            zzhq zzhqVar = new zzhq(this);
            this.zzai = zzhqVar;
            this.zzaf = zzjo.zzh(zzvoVar);
            apply.zzS(zzcbVar, looper);
            this.zzk = new zzix(zza, zzvnVar, zzvoVar, (zzjb) zzheVar.zzf.zza(), zzg, 0, false, apply, this.zzH, zzheVar.zzm, 500L, false, looper, zzcxVar, zzhqVar, zzeg.zza < 31 ? new zzmv() : zzic.zza(applicationContext, this, true), null);
            this.zzX = 1.0f;
            zzbh zzbhVar = zzbh.zza;
            this.zzJ = zzbhVar;
            this.zzK = zzbhVar;
            this.zzae = zzbhVar;
            this.zzag = -1;
            if (zzeg.zza < 21) {
                AudioTrack audioTrack = this.zzN;
                if (audioTrack == null || audioTrack.getAudioSessionId() == 0) {
                    obj = null;
                } else {
                    this.zzN.release();
                    obj = null;
                    this.zzN = null;
                }
                if (this.zzN == null) {
                    this.zzN = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.zzV = this.zzN.getAudioSessionId();
            } else {
                obj = null;
                this.zzV = zzeg.zzi(applicationContext);
            }
            this.zzZ = zzfrh.zzo();
            this.zzaa = true;
            Objects.requireNonNull(apply);
            zzdmVar.zzb(apply);
            zzg.zze(new Handler(looper), apply);
            copyOnWriteArraySet.add(zzijVar);
            this.zzx = new zzgg(zzheVar.zza, handler, zzijVar);
            this.zzy = new zzgk(zzheVar.zza, handler, zzijVar);
            zzeg.zzS(obj, obj);
            zzkf zzkfVar = new zzkf(zzheVar.zza, handler, zzijVar);
            this.zzz = zzkfVar;
            int i = this.zzW.zzc;
            zzkfVar.zzf(3);
            this.zzA = new zzkg(zzheVar.zza);
            this.zzB = new zzkh(zzheVar.zza);
            this.zzac = zzam(zzkfVar);
            this.zzad = zzcv.zza;
            zzaq(1, 10, Integer.valueOf(this.zzV));
            zzaq(2, 10, Integer.valueOf(this.zzV));
            zzaq(1, 3, this.zzW);
            zzaq(2, 4, Integer.valueOf(this.zzQ));
            zzaq(2, 5, 0);
            zzaq(1, 9, Boolean.valueOf(this.zzY));
            zzaq(2, 7, zzilVar);
            zzaq(6, 8, zzilVar);
            zzczVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    static /* bridge */ /* synthetic */ void zzN(zzin zzinVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzinVar.zzas(surface);
        zzinVar.zzP = surface;
    }

    private final int zzag() {
        if (this.zzaf.zza.zzo()) {
            return this.zzag;
        }
        zzjo zzjoVar = this.zzaf;
        return zzjoVar.zza.zzn(zzjoVar.zzb.zza, this.zzn).zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzah(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    private final long zzai(zzjo zzjoVar) {
        if (zzjoVar.zza.zzo()) {
            return zzeg.zzv(this.zzah);
        }
        if (zzjoVar.zzb.zzb()) {
            return zzjoVar.zzs;
        }
        zzci zzciVar = zzjoVar.zza;
        zzsb zzsbVar = zzjoVar.zzb;
        long j = zzjoVar.zzs;
        zzak(zzciVar, zzsbVar, j);
        return j;
    }

    private static long zzaj(zzjo zzjoVar) {
        zzch zzchVar = new zzch();
        zzcf zzcfVar = new zzcf();
        zzjoVar.zza.zzn(zzjoVar.zzb.zza, zzcfVar);
        long j = zzjoVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzjoVar.zza.zze(zzcfVar.zzd, zzchVar, 0L).zzm;
        return 0L;
    }

    private final long zzak(zzci zzciVar, zzsb zzsbVar, long j) {
        zzciVar.zzn(zzsbVar.zza, this.zzn);
        return j;
    }

    private final Pair zzal(zzci zzciVar, int i, long j) {
        if (zzciVar.zzo()) {
            this.zzag = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzah = j;
            return null;
        }
        if (i == -1 || i >= zzciVar.zzc()) {
            i = zzciVar.zzg(false);
            long j2 = zzciVar.zze(i, this.zza, 0L).zzm;
            j = zzeg.zzz(0L);
        }
        return zzciVar.zzl(this.zza, this.zzn, i, zzeg.zzv(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzr zzam(zzkf zzkfVar) {
        return new zzr(0, zzkfVar.zzb(), zzkfVar.zza());
    }

    private final zzjo zzan(zzjo zzjoVar, zzci zzciVar, Pair pair) {
        zzsb zzsbVar;
        zzvo zzvoVar;
        zzjo zzb;
        zzcw.zzd(zzciVar.zzo() || pair != null);
        zzci zzciVar2 = zzjoVar.zza;
        zzjo zzg = zzjoVar.zzg(zzciVar);
        if (zzciVar.zzo()) {
            zzsb zzi = zzjo.zzi();
            long zzv = zzeg.zzv(this.zzah);
            zzjo zza = zzg.zzb(zzi, zzv, zzv, zzv, 0L, zztz.zza, this.zzb, zzfrh.zzo()).zza(zzi);
            zza.zzq = zza.zzs;
            return zza;
        }
        Object obj = zzg.zzb.zza;
        int i = zzeg.zza;
        boolean z = !obj.equals(pair.first);
        zzsb zzsbVar2 = z ? new zzsb(pair.first) : zzg.zzb;
        long longValue = ((Long) pair.second).longValue();
        long zzv2 = zzeg.zzv(zzk());
        if (!zzciVar2.zzo()) {
            zzciVar2.zzn(obj, this.zzn);
        }
        if (z || longValue < zzv2) {
            zzcw.zzf(!zzsbVar2.zzb());
            zztz zztzVar = z ? zztz.zza : zzg.zzh;
            if (z) {
                zzsbVar = zzsbVar2;
                zzvoVar = this.zzb;
            } else {
                zzsbVar = zzsbVar2;
                zzvoVar = zzg.zzi;
            }
            zzjo zza2 = zzg.zzb(zzsbVar, longValue, longValue, longValue, 0L, zztzVar, zzvoVar, z ? zzfrh.zzo() : zzg.zzj).zza(zzsbVar);
            zza2.zzq = longValue;
            return zza2;
        }
        if (longValue == zzv2) {
            int zza3 = zzciVar.zza(zzg.zzk.zza);
            if (zza3 != -1 && zzciVar.zzd(zza3, this.zzn, false).zzd == zzciVar.zzn(zzsbVar2.zza, this.zzn).zzd) {
                return zzg;
            }
            zzciVar.zzn(zzsbVar2.zza, this.zzn);
            long zzg2 = zzsbVar2.zzb() ? this.zzn.zzg(zzsbVar2.zzb, zzsbVar2.zzc) : this.zzn.zze;
            zzb = zzg.zzb(zzsbVar2, zzg.zzs, zzg.zzs, zzg.zzd, zzg2 - zzg.zzs, zzg.zzh, zzg.zzi, zzg.zzj).zza(zzsbVar2);
            zzb.zzq = zzg2;
        } else {
            zzcw.zzf(!zzsbVar2.zzb());
            long max = Math.max(0L, zzg.zzr - (longValue - zzv2));
            long j = zzg.zzq;
            if (zzg.zzk.equals(zzg.zzb)) {
                j = longValue + max;
            }
            zzb = zzg.zzb(zzsbVar2, longValue, longValue, longValue, max, zzg.zzh, zzg.zzi, zzg.zzj);
            zzb.zzq = j;
        }
        return zzb;
    }

    private final zzjr zzao(zzjq zzjqVar) {
        int zzag = zzag();
        zzix zzixVar = this.zzk;
        return new zzjr(zzixVar, zzjqVar, this.zzaf.zza, zzag == -1 ? 0 : zzag, this.zzu, zzixVar.zzb());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzap(final int i, final int i2) {
        if (i == this.zzR && i2 == this.zzS) {
            return;
        }
        this.zzR = i;
        this.zzS = i2;
        zzdm zzdmVar = this.zzl;
        zzdmVar.zzd(24, new zzdj() { // from class: com.google.android.gms.internal.ads.zzht
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                int i3 = i;
                int i4 = i2;
                int i5 = zzin.zzd;
                ((zzby) obj).zzr(i3, i4);
            }
        });
        zzdmVar.zzc();
    }

    private final void zzaq(int i, int i2, Object obj) {
        zzju[] zzjuVarArr = this.zzh;
        int length = zzjuVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzju zzjuVar = zzjuVarArr[i3];
            if (zzjuVar.zzb() == i) {
                zzjr zzao = zzao(zzjuVar);
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
        zzju[] zzjuVarArr = this.zzh;
        int length = zzjuVarArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= 2) {
                break;
            }
            zzju zzjuVar = zzjuVarArr[i];
            if (zzjuVar.zzb() == 2) {
                zzjr zzao = zzao(zzjuVar);
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
                    ((zzjr) it.next()).zzi(this.zzC);
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
            zzat(false, zzgu.zzd(new zziz(3), PointerIconCompat.TYPE_HELP));
        }
    }

    private final void zzat(boolean z, zzgu zzguVar) {
        zzjo zzjoVar = this.zzaf;
        zzjo zza = zzjoVar.zza(zzjoVar.zzb);
        zza.zzq = zza.zzs;
        zza.zzr = 0L;
        zzjo zzf = zza.zzf(1);
        if (zzguVar != null) {
            zzf = zzf.zze(zzguVar);
        }
        zzjo zzjoVar2 = zzf;
        this.zzD++;
        this.zzk.zzo();
        zzav(zzjoVar2, 0, 1, false, zzjoVar2.zza.zzo() && !this.zzaf.zza.zzo(), 4, zzai(zzjoVar2), -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzau(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        zzjo zzjoVar = this.zzaf;
        if (zzjoVar.zzl == z2 && zzjoVar.zzm == i3) {
            return;
        }
        this.zzD++;
        zzjo zzd2 = zzjoVar.zzd(z2, i3);
        this.zzk.zzn(z2, i3);
        zzav(zzd2, 0, i2, false, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzav(final zzjo zzjoVar, final int i, final int i2, boolean z, boolean z2, final int i3, long j, int i4) {
        Pair pair;
        int i5;
        final zzbb zzbbVar;
        boolean z3;
        boolean z4;
        int i6;
        int i7;
        int i8;
        Object obj;
        zzbb zzbbVar2;
        Object obj2;
        int i9;
        long j2;
        long zzaj;
        Object obj3;
        zzbb zzbbVar3;
        Object obj4;
        int i10;
        zzjo zzjoVar2 = this.zzaf;
        this.zzaf = zzjoVar;
        boolean z5 = !zzjoVar2.zza.equals(zzjoVar.zza);
        zzci zzciVar = zzjoVar2.zza;
        zzci zzciVar2 = zzjoVar.zza;
        if (zzciVar2.zzo() && zzciVar.zzo()) {
            pair = new Pair(false, -1);
        } else if (zzciVar2.zzo() != zzciVar.zzo()) {
            pair = new Pair(true, 3);
        } else if (zzciVar.zze(zzciVar.zzn(zzjoVar2.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc.equals(zzciVar2.zze(zzciVar2.zzn(zzjoVar.zzb.zza, this.zzn).zzd, this.zza, 0L).zzc)) {
            pair = (z2 && i3 == 0 && zzjoVar2.zzb.zzd < zzjoVar.zzb.zzd) ? new Pair(true, 0) : new Pair(false, -1);
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
        zzbh zzbhVar = this.zzJ;
        if (booleanValue) {
            zzbbVar = !zzjoVar.zza.zzo() ? zzjoVar.zza.zze(zzjoVar.zza.zzn(zzjoVar.zzb.zza, this.zzn).zzd, this.zza, 0L).zzd : null;
            this.zzae = zzbh.zza;
        } else {
            zzbbVar = null;
        }
        if (booleanValue || !zzjoVar2.zzj.equals(zzjoVar.zzj)) {
            zzbf zza = this.zzae.zza();
            List list = zzjoVar.zzj;
            for (int i11 = 0; i11 < list.size(); i11++) {
                zzbl zzblVar = (zzbl) list.get(i11);
                for (int i12 = 0; i12 < zzblVar.zza(); i12++) {
                    zzblVar.zzb(i12).zza(zza);
                }
            }
            this.zzae = zza.zzv();
            zzci zzn = zzn();
            if (zzn.zzo()) {
                zzbhVar = this.zzae;
            } else {
                zzbb zzbbVar4 = zzn.zze(zzf(), this.zza, 0L).zzd;
                zzbf zza2 = this.zzae.zza();
                zza2.zzb(zzbbVar4.zzg);
                zzbhVar = zza2.zzv();
            }
        }
        boolean z6 = !zzbhVar.equals(this.zzJ);
        this.zzJ = zzbhVar;
        boolean z7 = zzjoVar2.zzl;
        boolean z8 = zzjoVar.zzl;
        int i13 = zzjoVar2.zze;
        int i14 = zzjoVar.zze;
        if (i13 != i14 || z7 != z8) {
            zzaw();
        }
        boolean z9 = zzjoVar2.zzg;
        boolean z10 = zzjoVar.zzg;
        if (zzjoVar2.zza.equals(zzjoVar.zza)) {
            z3 = z7;
        } else {
            z3 = z7;
            this.zzl.zzd(0, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhv
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj5) {
                    zzjo zzjoVar3 = zzjo.this;
                    int i15 = i;
                    int i16 = zzin.zzd;
                    ((zzby) obj5).zzs(zzjoVar3.zza, i15);
                }
            });
        }
        if (z2) {
            zzcf zzcfVar = new zzcf();
            if (zzjoVar2.zza.zzo()) {
                z4 = z8;
                i6 = i13;
                i7 = i14;
                i8 = i4;
                obj = null;
                zzbbVar2 = null;
                obj2 = null;
                i9 = -1;
            } else {
                Object obj5 = zzjoVar2.zzb.zza;
                zzjoVar2.zza.zzn(obj5, zzcfVar);
                int i15 = zzcfVar.zzd;
                z4 = z8;
                i6 = i13;
                i7 = i14;
                i9 = zzjoVar2.zza.zza(obj5);
                obj2 = obj5;
                obj = zzjoVar2.zza.zze(i15, this.zza, 0L).zzc;
                zzbbVar2 = this.zza.zzd;
                i8 = i15;
            }
            if (i3 == 0) {
                if (zzjoVar2.zzb.zzb()) {
                    zzsb zzsbVar = zzjoVar2.zzb;
                    j2 = zzcfVar.zzg(zzsbVar.zzb, zzsbVar.zzc);
                    zzaj = zzaj(zzjoVar2);
                    long zzz = zzeg.zzz(j2);
                    zzsb zzsbVar2 = zzjoVar2.zzb;
                    final zzca zzcaVar = new zzca(obj, i8, zzbbVar2, obj2, i9, zzz, zzeg.zzz(zzaj), zzsbVar2.zzb, zzsbVar2.zzc);
                    int zzf = zzf();
                    if (this.zzaf.zza.zzo()) {
                        zzjo zzjoVar3 = this.zzaf;
                        Object obj6 = zzjoVar3.zzb.zza;
                        zzjoVar3.zza.zzn(obj6, this.zzn);
                        i10 = this.zzaf.zza.zza(obj6);
                        obj3 = this.zzaf.zza.zze(zzf, this.zza, 0L).zzc;
                        zzbbVar3 = this.zza.zzd;
                        obj4 = obj6;
                    } else {
                        obj3 = null;
                        zzbbVar3 = null;
                        obj4 = null;
                        i10 = -1;
                    }
                    long zzz2 = zzeg.zzz(j);
                    long zzz3 = !this.zzaf.zzb.zzb() ? zzeg.zzz(zzaj(this.zzaf)) : zzz2;
                    zzsb zzsbVar3 = this.zzaf.zzb;
                    final zzca zzcaVar2 = new zzca(obj3, zzf, zzbbVar3, obj4, i10, zzz2, zzz3, zzsbVar3.zzb, zzsbVar3.zzc);
                    this.zzl.zzd(11, new zzdj() { // from class: com.google.android.gms.internal.ads.zzib
                        @Override // com.google.android.gms.internal.ads.zzdj
                        public final void zza(Object obj7) {
                            int i16 = i3;
                            zzca zzcaVar3 = zzcaVar;
                            zzca zzcaVar4 = zzcaVar2;
                            int i17 = zzin.zzd;
                            ((zzby) obj7).zzo(zzcaVar3, zzcaVar4, i16);
                        }
                    });
                } else {
                    j2 = zzjoVar2.zzb.zze != -1 ? zzaj(this.zzaf) : zzcfVar.zze;
                    zzaj = j2;
                    long zzz4 = zzeg.zzz(j2);
                    zzsb zzsbVar22 = zzjoVar2.zzb;
                    final zzca zzcaVar3 = new zzca(obj, i8, zzbbVar2, obj2, i9, zzz4, zzeg.zzz(zzaj), zzsbVar22.zzb, zzsbVar22.zzc);
                    int zzf2 = zzf();
                    if (this.zzaf.zza.zzo()) {
                    }
                    long zzz22 = zzeg.zzz(j);
                    if (!this.zzaf.zzb.zzb()) {
                    }
                    zzsb zzsbVar32 = this.zzaf.zzb;
                    final zzca zzcaVar22 = new zzca(obj3, zzf2, zzbbVar3, obj4, i10, zzz22, zzz3, zzsbVar32.zzb, zzsbVar32.zzc);
                    this.zzl.zzd(11, new zzdj() { // from class: com.google.android.gms.internal.ads.zzib
                        @Override // com.google.android.gms.internal.ads.zzdj
                        public final void zza(Object obj7) {
                            int i16 = i3;
                            zzca zzcaVar32 = zzcaVar3;
                            zzca zzcaVar4 = zzcaVar22;
                            int i17 = zzin.zzd;
                            ((zzby) obj7).zzo(zzcaVar32, zzcaVar4, i16);
                        }
                    });
                }
            } else if (zzjoVar2.zzb.zzb()) {
                j2 = zzjoVar2.zzs;
                zzaj = zzaj(zzjoVar2);
                long zzz42 = zzeg.zzz(j2);
                zzsb zzsbVar222 = zzjoVar2.zzb;
                final zzca zzcaVar32 = new zzca(obj, i8, zzbbVar2, obj2, i9, zzz42, zzeg.zzz(zzaj), zzsbVar222.zzb, zzsbVar222.zzc);
                int zzf22 = zzf();
                if (this.zzaf.zza.zzo()) {
                }
                long zzz222 = zzeg.zzz(j);
                if (!this.zzaf.zzb.zzb()) {
                }
                zzsb zzsbVar322 = this.zzaf.zzb;
                final zzca zzcaVar222 = new zzca(obj3, zzf22, zzbbVar3, obj4, i10, zzz222, zzz3, zzsbVar322.zzb, zzsbVar322.zzc);
                this.zzl.zzd(11, new zzdj() { // from class: com.google.android.gms.internal.ads.zzib
                    @Override // com.google.android.gms.internal.ads.zzdj
                    public final void zza(Object obj7) {
                        int i16 = i3;
                        zzca zzcaVar322 = zzcaVar32;
                        zzca zzcaVar4 = zzcaVar222;
                        int i17 = zzin.zzd;
                        ((zzby) obj7).zzo(zzcaVar322, zzcaVar4, i16);
                    }
                });
            } else {
                j2 = zzjoVar2.zzs;
                zzaj = j2;
                long zzz422 = zzeg.zzz(j2);
                zzsb zzsbVar2222 = zzjoVar2.zzb;
                final zzca zzcaVar322 = new zzca(obj, i8, zzbbVar2, obj2, i9, zzz422, zzeg.zzz(zzaj), zzsbVar2222.zzb, zzsbVar2222.zzc);
                int zzf222 = zzf();
                if (this.zzaf.zza.zzo()) {
                }
                long zzz2222 = zzeg.zzz(j);
                if (!this.zzaf.zzb.zzb()) {
                }
                zzsb zzsbVar3222 = this.zzaf.zzb;
                final zzca zzcaVar2222 = new zzca(obj3, zzf222, zzbbVar3, obj4, i10, zzz2222, zzz3, zzsbVar3222.zzb, zzsbVar3222.zzc);
                this.zzl.zzd(11, new zzdj() { // from class: com.google.android.gms.internal.ads.zzib
                    @Override // com.google.android.gms.internal.ads.zzdj
                    public final void zza(Object obj7) {
                        int i16 = i3;
                        zzca zzcaVar3222 = zzcaVar322;
                        zzca zzcaVar4 = zzcaVar2222;
                        int i17 = zzin.zzd;
                        ((zzby) obj7).zzo(zzcaVar3222, zzcaVar4, i16);
                    }
                });
            }
        } else {
            z4 = z8;
            i6 = i13;
            i7 = i14;
        }
        if (booleanValue) {
            this.zzl.zzd(1, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhg
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzbb zzbbVar5 = zzbb.this;
                    int i16 = intValue;
                    int i17 = zzin.zzd;
                    ((zzby) obj7).zzf(zzbbVar5, i16);
                }
            });
        }
        if (zzjoVar2.zzf != zzjoVar.zzf) {
            this.zzl.zzd(10, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhh
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzjo zzjoVar4 = zzjo.this;
                    int i16 = zzin.zzd;
                    ((zzby) obj7).zzm(zzjoVar4.zzf);
                }
            });
            if (zzjoVar.zzf != null) {
                this.zzl.zzd(10, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhi
                    @Override // com.google.android.gms.internal.ads.zzdj
                    public final void zza(Object obj7) {
                        zzjo zzjoVar4 = zzjo.this;
                        int i16 = zzin.zzd;
                        ((zzby) obj7).zzl(zzjoVar4.zzf);
                    }
                });
            }
        }
        zzvo zzvoVar = zzjoVar2.zzi;
        zzvo zzvoVar2 = zzjoVar.zzi;
        if (zzvoVar != zzvoVar2) {
            this.zzi.zzk(zzvoVar2.zze);
            this.zzl.zzd(2, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhj
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzjo zzjoVar4 = zzjo.this;
                    int i16 = zzin.zzd;
                    ((zzby) obj7).zzt(zzjoVar4.zzi.zzd);
                }
            });
        }
        if (z6) {
            final zzbh zzbhVar2 = this.zzJ;
            this.zzl.zzd(14, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhk
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzbh zzbhVar3 = zzbh.this;
                    int i16 = zzin.zzd;
                    ((zzby) obj7).zzg(zzbhVar3);
                }
            });
        }
        if (z9 != z10) {
            this.zzl.zzd(3, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhl
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzjo zzjoVar4 = zzjo.this;
                    int i16 = zzin.zzd;
                    ((zzby) obj7).zzd(zzjoVar4.zzg);
                }
            });
        }
        int i16 = i6;
        int i17 = i7;
        boolean z11 = z4;
        boolean z12 = z3;
        if (i16 != i17 || z12 != z11) {
            this.zzl.zzd(-1, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhm
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzjo zzjoVar4 = zzjo.this;
                    int i18 = zzin.zzd;
                    ((zzby) obj7).zzn(zzjoVar4.zzl, zzjoVar4.zze);
                }
            });
        }
        if (i16 != i17) {
            this.zzl.zzd(4, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhn
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzjo zzjoVar4 = zzjo.this;
                    int i18 = zzin.zzd;
                    ((zzby) obj7).zzj(zzjoVar4.zze);
                }
            });
        }
        if (z12 != z11) {
            this.zzl.zzd(5, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhw
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzjo zzjoVar4 = zzjo.this;
                    int i18 = i2;
                    int i19 = zzin.zzd;
                    ((zzby) obj7).zzh(zzjoVar4.zzl, i18);
                }
            });
        }
        if (zzjoVar2.zzm != zzjoVar.zzm) {
            this.zzl.zzd(6, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhx
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzjo zzjoVar4 = zzjo.this;
                    int i18 = zzin.zzd;
                    ((zzby) obj7).zzk(zzjoVar4.zzm);
                }
            });
        }
        if (zzay(zzjoVar2) != zzay(zzjoVar)) {
            this.zzl.zzd(7, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhy
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    ((zzby) obj7).zze(zzin.zzay(zzjo.this));
                }
            });
        }
        if (!zzjoVar2.zzn.equals(zzjoVar.zzn)) {
            this.zzl.zzd(12, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhz
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzjo zzjoVar4 = zzjo.this;
                    int i18 = zzin.zzd;
                    ((zzby) obj7).zzi(zzjoVar4.zzn);
                }
            });
        }
        if (z) {
            this.zzl.zzd(-1, new zzdj() { // from class: com.google.android.gms.internal.ads.zzia
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    ((zzby) obj7).zzp();
                }
            });
        }
        zzbx zzbxVar = this.zzI;
        zzbx zzF = zzeg.zzF(this.zzg, this.zzc);
        this.zzI = zzF;
        if (!zzF.equals(zzbxVar)) {
            this.zzl.zzd(13, new zzdj() { // from class: com.google.android.gms.internal.ads.zzho
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj7) {
                    zzin.this.zzU((zzby) obj7);
                }
            });
        }
        this.zzl.zzc();
        if (zzjoVar2.zzo != zzjoVar.zzo) {
            Iterator it = this.zzm.iterator();
            while (it.hasNext()) {
                ((zzgv) it.next()).zza(zzjoVar.zzo);
            }
        }
        if (zzjoVar2.zzp != zzjoVar.zzp) {
            Iterator it2 = this.zzm.iterator();
            while (it2.hasNext()) {
                ((zzgv) it2.next()).zzb(zzjoVar.zzp);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaw() {
        int zzh = zzh();
        if (zzh == 2 || zzh == 3) {
            zzax();
            boolean z = this.zzaf.zzp;
            zzq();
            zzq();
        }
    }

    private final void zzax() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String zzH = zzeg.zzH("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (this.zzaa) {
                throw new IllegalStateException(zzH);
            }
            zzdn.zzb("ExoPlayerImpl", zzH, this.zzab ? null : new IllegalStateException());
            this.zzab = true;
        }
    }

    private static boolean zzay(zzjo zzjoVar) {
        return zzjoVar.zze == 3 && zzjoVar.zzl && zzjoVar.zzm == 0;
    }

    public final zzgu zzA() {
        zzax();
        return this.zzaf.zzf;
    }

    final /* synthetic */ void zzS(zziv zzivVar) {
        long j;
        boolean z;
        long j2;
        int i = this.zzD - zzivVar.zzb;
        this.zzD = i;
        boolean z2 = true;
        if (zzivVar.zzc) {
            this.zzE = zzivVar.zzd;
            this.zzF = true;
        }
        if (zzivVar.zze) {
            this.zzG = zzivVar.zzf;
        }
        if (i == 0) {
            zzci zzciVar = zzivVar.zza.zza;
            if (!this.zzaf.zza.zzo() && zzciVar.zzo()) {
                this.zzag = -1;
                this.zzah = 0L;
            }
            if (!zzciVar.zzo()) {
                List zzw = ((zzjs) zzciVar).zzw();
                zzcw.zzf(zzw.size() == this.zzo.size());
                for (int i2 = 0; i2 < zzw.size(); i2++) {
                    ((zzim) this.zzo.get(i2)).zzb = (zzci) zzw.get(i2);
                }
            }
            if (this.zzF) {
                if (zzivVar.zza.zzb.equals(this.zzaf.zzb) && zzivVar.zza.zzd == this.zzaf.zzs) {
                    z2 = false;
                }
                if (z2) {
                    if (zzciVar.zzo() || zzivVar.zza.zzb.zzb()) {
                        j2 = zzivVar.zza.zzd;
                    } else {
                        zzjo zzjoVar = zzivVar.zza;
                        zzsb zzsbVar = zzjoVar.zzb;
                        j2 = zzjoVar.zzd;
                        zzak(zzciVar, zzsbVar, j2);
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
            zzav(zzivVar.zza, 1, this.zzG, false, z, this.zzE, j, -1);
        }
    }

    final /* synthetic */ void zzT(final zziv zzivVar) {
        this.zzj.zzg(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhr
            @Override // java.lang.Runnable
            public final void run() {
                zzin.this.zzS(zzivVar);
            }
        });
    }

    final /* synthetic */ void zzU(zzby zzbyVar) {
        zzbyVar.zza(this.zzI);
    }

    public final void zzW() {
        zzax();
        boolean zzq = zzq();
        int zzb = this.zzy.zzb(zzq, 2);
        zzau(zzq, zzb, zzah(zzq, zzb));
        zzjo zzjoVar = this.zzaf;
        if (zzjoVar.zze != 1) {
            return;
        }
        zzjo zze = zzjoVar.zze(null);
        zzjo zzf = zze.zzf(true == zze.zza.zzo() ? 4 : 2);
        this.zzD++;
        this.zzk.zzk();
        zzav(zzf, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final void zzX() {
        AudioTrack audioTrack;
        Log.i("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.0.0-alpha03] [" + zzeg.zze + "] [" + zzbc.zza() + "]");
        zzax();
        if (zzeg.zza < 21 && (audioTrack = this.zzN) != null) {
            audioTrack.release();
            this.zzN = null;
        }
        this.zzz.zze();
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzdm zzdmVar = this.zzl;
            zzdmVar.zzd(10, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhs
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj) {
                    ((zzby) obj).zzl(zzgu.zzd(new zziz(1), PointerIconCompat.TYPE_HELP));
                }
            });
            zzdmVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zzd(null);
        this.zzt.zzf(this.zzr);
        zzjo zzf = this.zzaf.zzf(1);
        this.zzaf = zzf;
        zzjo zza = zzf.zza(zzf.zzb);
        this.zzaf = zza;
        zza.zzq = zza.zzs;
        this.zzaf.zzr = 0L;
        this.zzr.zzQ();
        Surface surface = this.zzP;
        if (surface != null) {
            surface.release();
            this.zzP = null;
        }
        this.zzZ = zzfrh.zzo();
    }

    public final void zzY(zzkl zzklVar) {
        this.zzr.zzR(zzklVar);
    }

    public final void zzZ(zzsd zzsdVar) {
        zzax();
        List singletonList = Collections.singletonList(zzsdVar);
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
            zzjl zzjlVar = new zzjl((zzsd) singletonList.get(i2), this.zzp);
            arrayList.add(zzjlVar);
            this.zzo.add(i2, new zzim(zzjlVar.zzb, zzjlVar.zza.zzA()));
        }
        this.zzaj = this.zzaj.zzg(0, arrayList.size());
        zzjs zzjsVar = new zzjs(this.zzo, this.zzaj, null);
        if (!zzjsVar.zzo() && zzjsVar.zzc() < 0) {
            throw new zzae(zzjsVar, -1, -9223372036854775807L);
        }
        int zzg = zzjsVar.zzg(false);
        zzjo zzan = zzan(this.zzaf, zzjsVar, zzal(zzjsVar, zzg, -9223372036854775807L));
        int i3 = zzan.zze;
        if (zzg != -1 && i3 != 1) {
            i3 = (zzjsVar.zzo() || zzg >= zzjsVar.zzc()) ? 4 : 2;
        }
        zzjo zzf = zzan.zzf(i3);
        this.zzk.zzq(arrayList, zzg, zzeg.zzv(-9223372036854775807L), this.zzaj);
        zzav(zzf, 0, 1, false, (this.zzaf.zzb.zza.equals(zzf.zzb.zza) || this.zzaf.zza.zzo()) ? false : true, 4, zzai(zzf), -1);
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
        final float zza = zzeg.zza(f, 0.0f, 1.0f);
        if (this.zzX == zza) {
            return;
        }
        this.zzX = zza;
        zzar();
        zzdm zzdmVar = this.zzl;
        zzdmVar.zzd(22, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhu
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                float f2 = zza;
                int i = zzin.zzd;
                ((zzby) obj).zzv(f2);
            }
        });
        zzdmVar.zzc();
    }

    public final void zzae() {
        zzax();
        zzax();
        this.zzy.zzb(zzq(), 1);
        zzat(false, null);
        this.zzZ = zzfrh.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzd() {
        zzax();
        if (zzs()) {
            return this.zzaf.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zze() {
        zzax();
        if (zzs()) {
            return this.zzaf.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzf() {
        zzax();
        int zzag = zzag();
        if (zzag == -1) {
            return 0;
        }
        return zzag;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzg() {
        zzax();
        if (this.zzaf.zza.zzo()) {
            return 0;
        }
        zzjo zzjoVar = this.zzaf;
        return zzjoVar.zza.zza(zzjoVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzh() {
        zzax();
        return this.zzaf.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzi() {
        zzax();
        return this.zzaf.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzj() {
        zzax();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final long zzk() {
        zzax();
        if (!zzs()) {
            return zzl();
        }
        zzjo zzjoVar = this.zzaf;
        zzjoVar.zza.zzn(zzjoVar.zzb.zza, this.zzn);
        zzjo zzjoVar2 = this.zzaf;
        if (zzjoVar2.zzc != -9223372036854775807L) {
            return zzeg.zzz(0L) + zzeg.zzz(this.zzaf.zzc);
        }
        long j = zzjoVar2.zza.zze(zzf(), this.zza, 0L).zzm;
        return zzeg.zzz(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final long zzl() {
        zzax();
        return zzeg.zzz(zzai(this.zzaf));
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final long zzm() {
        zzax();
        return zzeg.zzz(this.zzaf.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final zzci zzn() {
        zzax();
        return this.zzaf.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final zzct zzo() {
        zzax();
        return this.zzaf.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final void zzp(int i, long j) {
        zzax();
        this.zzr.zzx();
        zzci zzciVar = this.zzaf.zza;
        if (i < 0 || (!zzciVar.zzo() && i >= zzciVar.zzc())) {
            throw new zzae(zzciVar, i, j);
        }
        this.zzD++;
        if (zzs()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            zziv zzivVar = new zziv(this.zzaf);
            zzivVar.zza(1);
            this.zzai.zza.zzT(zzivVar);
            return;
        }
        int i2 = zzh() != 1 ? 2 : 1;
        int zzf = zzf();
        zzjo zzan = zzan(this.zzaf.zzf(i2), zzciVar, zzal(zzciVar, i, j));
        this.zzk.zzl(zzciVar, i, zzeg.zzv(j));
        zzav(zzan, 0, 1, true, true, 1, zzai(zzan), zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final boolean zzq() {
        zzax();
        return this.zzaf.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final boolean zzr() {
        zzax();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
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
            zzjo zzjoVar = this.zzaf;
            return zzjoVar.zzk.equals(zzjoVar.zzb) ? zzeg.zzz(this.zzaf.zzq) : zzw();
        }
        zzax();
        if (this.zzaf.zza.zzo()) {
            return this.zzah;
        }
        zzjo zzjoVar2 = this.zzaf;
        long j = 0;
        if (zzjoVar2.zzk.zzd != zzjoVar2.zzb.zzd) {
            return zzeg.zzz(zzjoVar2.zza.zze(zzf(), this.zza, 0L).zzn);
        }
        long j2 = zzjoVar2.zzq;
        if (this.zzaf.zzk.zzb()) {
            zzjo zzjoVar3 = this.zzaf;
            zzjoVar3.zza.zzn(zzjoVar3.zzk.zza, this.zzn).zzh(this.zzaf.zzk.zzb);
        } else {
            j = j2;
        }
        zzjo zzjoVar4 = this.zzaf;
        zzak(zzjoVar4.zza, zzjoVar4.zzk, j);
        return zzeg.zzz(j);
    }

    public final long zzw() {
        zzax();
        if (zzs()) {
            zzjo zzjoVar = this.zzaf;
            zzsb zzsbVar = zzjoVar.zzb;
            zzjoVar.zza.zzn(zzsbVar.zza, this.zzn);
            return zzeg.zzz(this.zzn.zzg(zzsbVar.zzb, zzsbVar.zzc));
        }
        zzci zzn = zzn();
        if (zzn.zzo()) {
            return -9223372036854775807L;
        }
        return zzeg.zzz(zzn.zze(zzf(), this.zza, 0L).zzn);
    }

    public final void zzR(zzkl zzklVar) {
        Objects.requireNonNull(zzklVar);
        this.zzr.zzw(zzklVar);
    }
}
