package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzaw;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzbck;
import com.google.android.gms.internal.ads.zzbdx;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzbji;
import com.google.android.gms.internal.ads.zzbsq;
import com.google.android.gms.internal.ads.zzbub;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzcbk;
import com.google.android.gms.internal.ads.zzceu;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzchi;
import com.google.android.gms.internal.ads.zzchp;
import com.google.android.gms.internal.ads.zzcku;
import com.google.android.gms.internal.ads.zzcnb;
import com.google.android.gms.internal.ads.zzegy;
import com.google.android.gms.internal.ads.zzegz;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes.dex */
public final class zzt {
    private static final zzt zza = new zzt();
    private final zzceu zzA;
    private final zzcg zzB;
    private final zzcku zzC;
    private final zzchp zzD;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzm zzc;
    private final com.google.android.gms.ads.internal.util.zzs zzd;
    private final zzcnb zze;
    private final zzaa zzf;
    private final zzbck zzg;
    private final zzcfy zzh;
    private final zzab zzi;
    private final zzbdx zzj;
    private final Clock zzk;
    private final zze zzl;
    private final zzbji zzm;
    private final zzaw zzn;
    private final zzcbk zzo;
    private final zzbsq zzp;
    private final zzchi zzq;
    private final zzbub zzr;
    private final zzw zzs;
    private final zzbv zzt;
    private final com.google.android.gms.ads.internal.overlay.zzaa zzu;
    private final com.google.android.gms.ads.internal.overlay.zzab zzv;
    private final zzbvg zzw;
    private final zzbw zzx;
    private final zzegz zzy;
    private final zzbem zzz;

    protected zzt() {
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = new com.google.android.gms.ads.internal.overlay.zzm();
        com.google.android.gms.ads.internal.util.zzs zzsVar = new com.google.android.gms.ads.internal.util.zzs();
        zzcnb zzcnbVar = new zzcnb();
        zzaa zzm = zzaa.zzm(Build.VERSION.SDK_INT);
        zzbck zzbckVar = new zzbck();
        zzcfy zzcfyVar = new zzcfy();
        zzab zzabVar = new zzab();
        zzbdx zzbdxVar = new zzbdx();
        Clock defaultClock = DefaultClock.getInstance();
        zze zzeVar = new zze();
        zzbji zzbjiVar = new zzbji();
        zzaw zzawVar = new zzaw();
        zzcbk zzcbkVar = new zzcbk();
        zzbsq zzbsqVar = new zzbsq();
        zzchi zzchiVar = new zzchi();
        zzbub zzbubVar = new zzbub();
        zzw zzwVar = new zzw();
        zzbv zzbvVar = new zzbv();
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = new com.google.android.gms.ads.internal.overlay.zzaa();
        com.google.android.gms.ads.internal.overlay.zzab zzabVar2 = new com.google.android.gms.ads.internal.overlay.zzab();
        zzbvg zzbvgVar = new zzbvg();
        zzbw zzbwVar = new zzbw();
        zzegy zzegyVar = new zzegy();
        zzbem zzbemVar = new zzbem();
        zzceu zzceuVar = new zzceu();
        zzcg zzcgVar = new zzcg();
        zzcku zzckuVar = new zzcku();
        zzchp zzchpVar = new zzchp();
        this.zzb = zzaVar;
        this.zzc = zzmVar;
        this.zzd = zzsVar;
        this.zze = zzcnbVar;
        this.zzf = zzm;
        this.zzg = zzbckVar;
        this.zzh = zzcfyVar;
        this.zzi = zzabVar;
        this.zzj = zzbdxVar;
        this.zzk = defaultClock;
        this.zzl = zzeVar;
        this.zzm = zzbjiVar;
        this.zzn = zzawVar;
        this.zzo = zzcbkVar;
        this.zzp = zzbsqVar;
        this.zzq = zzchiVar;
        this.zzr = zzbubVar;
        this.zzt = zzbvVar;
        this.zzs = zzwVar;
        this.zzu = zzaaVar;
        this.zzv = zzabVar2;
        this.zzw = zzbvgVar;
        this.zzx = zzbwVar;
        this.zzy = zzegyVar;
        this.zzz = zzbemVar;
        this.zzA = zzceuVar;
        this.zzB = zzcgVar;
        this.zzC = zzckuVar;
        this.zzD = zzchpVar;
    }

    public static zzegz zzA() {
        return zza.zzy;
    }

    public static Clock zzB() {
        return zza.zzk;
    }

    public static zze zza() {
        return zza.zzl;
    }

    public static zzbck zzb() {
        return zza.zzg;
    }

    public static zzbdx zzc() {
        return zza.zzj;
    }

    public static zzbem zzd() {
        return zza.zzz;
    }

    public static zzbji zze() {
        return zza.zzm;
    }

    public static zzbub zzf() {
        return zza.zzr;
    }

    public static zzbvg zzg() {
        return zza.zzw;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zzh() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzm zzi() {
        return zza.zzc;
    }

    public static zzw zzj() {
        return zza.zzs;
    }

    public static com.google.android.gms.ads.internal.overlay.zzaa zzk() {
        return zza.zzu;
    }

    public static com.google.android.gms.ads.internal.overlay.zzab zzl() {
        return zza.zzv;
    }

    public static zzcbk zzm() {
        return zza.zzo;
    }

    public static zzceu zzn() {
        return zza.zzA;
    }

    public static zzcfy zzo() {
        return zza.zzh;
    }

    public static com.google.android.gms.ads.internal.util.zzs zzp() {
        return zza.zzd;
    }

    public static zzaa zzq() {
        return zza.zzf;
    }

    public static zzab zzr() {
        return zza.zzi;
    }

    public static zzaw zzs() {
        return zza.zzn;
    }

    public static zzbv zzt() {
        return zza.zzt;
    }

    public static zzbw zzu() {
        return zza.zzx;
    }

    public static zzcg zzv() {
        return zza.zzB;
    }

    public static zzchi zzw() {
        return zza.zzq;
    }

    public static zzchp zzx() {
        return zza.zzD;
    }

    public static zzcku zzy() {
        return zza.zzC;
    }

    public static zzcnb zzz() {
        return zza.zze;
    }
}
