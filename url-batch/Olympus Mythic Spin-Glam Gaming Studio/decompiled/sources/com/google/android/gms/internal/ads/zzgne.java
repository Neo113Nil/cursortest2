package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.analytics.brandsafety.m;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzgne implements zzgmf {
    private final zzggv zza;
    private final zzgpx zzb;
    private final zzgpi zzc;
    private final ExecutorService zzd;
    private final zzgqc zze;
    private final zzgrh zzf;
    private final Object zzg = new Object();
    private final String zzh;
    private final long zzi;
    private final long zzj;
    private final boolean zzk;
    private final boolean zzl;
    private zzgnd zzm;

    zzgne(zzggv zzggvVar, zziol zziolVar, zzgpx zzgpxVar, zzgpi zzgpiVar, zzgqc zzgqcVar, zzgrh zzgrhVar, zzgei zzgeiVar, ExecutorService executorService) {
        this.zza = zzggvVar;
        this.zzb = zzgpxVar;
        this.zzc = zzgpiVar;
        this.zzd = executorService;
        this.zze = zzgqcVar;
        this.zzf = zzgrhVar;
        this.zzh = zzgeiVar.zzd();
        this.zzi = zzgeiVar.zzm();
        this.zzj = zzgeiVar.zzl();
        this.zzk = zzgeiVar.zzb();
        this.zzl = zzgeiVar.zzc();
    }

    private final ListenableFuture zzs() {
        return zzhcy.zzk(this.zzc.zzf(), new zzgub() { // from class: com.google.android.gms.internal.ads.zzgmy
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                zzgne.this.zzo((byte[]) obj);
                return null;
            }
        }, zzhdp.zza());
    }

    private final void zzt(zzavl zzavlVar, byte[] bArr, boolean z) {
        zzgrf zza = this.zzf.zza(20102);
        try {
            try {
                zza.zza();
                synchronized (this.zzg) {
                    this.zzm = zzgnd.zza(zzavlVar, bArr, z);
                }
                zza.zzc();
            } catch (zzavj e) {
                e = e;
                zza.zzb(e);
                throw new zzgmg(2, e);
            } catch (zzavn e2) {
                e = e2;
                zza.zzb(e);
                throw new zzgmg(2, e);
            } catch (Throwable th) {
                zza.zzb(th);
                throw th;
            }
        } catch (Throwable th2) {
            zza.zzc();
            throw th2;
        }
    }

    private final String zzu(Map map) throws zzavn, zzavj {
        String zzb;
        zzgrh zzgrhVar = this.zzf;
        try {
            zzgrhVar.zza(20110).zza();
            synchronized (this.zzg) {
                try {
                    zzgnd zzgndVar = this.zzm;
                    if (zzgndVar == null) {
                        zzgrhVar.zzb(20109);
                        zzb = "";
                    } else {
                        zzb = zzgndVar.zzb(map);
                    }
                } finally {
                }
            }
            return zzb;
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final String zza() {
        synchronized (this.zzg) {
            try {
                zzgnd zzgndVar = this.zzm;
                if (zzgndVar == null) {
                    return "3.904631200.-1";
                }
                return zzgndVar.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final ListenableFuture zzb() {
        if (this.zzl) {
            return zzs();
        }
        zzhcq zzw = zzhcq.zzw(this.zzc.zzb());
        ExecutorService executorService = this.zzd;
        return (zzhcq) zzhcy.zzh((zzhcq) zzhcy.zzj((zzhcq) zzhcy.zzg(zzw, Throwable.class, zzgnc.zza, executorService), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgms
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgne.this.zzi((zzggt) obj);
            }
        }, executorService), Throwable.class, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgmt
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgne.this.zzj((Throwable) obj);
            }
        }, zzhdp.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final ListenableFuture zzc(final Context context) {
        return zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgne.this.zzk(context);
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final ListenableFuture zzd(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return zzhcy.zzd(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgmv
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ View zzc;
            private final /* synthetic */ Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgne.this.zzl(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final ListenableFuture zze(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return zzhcy.zzd(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgmw
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ String zzc;
            private final /* synthetic */ View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgne.this.zzm(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final void zzf(InputEvent inputEvent) {
        try {
            synchronized (this.zzg) {
                try {
                    zzgnd zzgndVar = this.zzm;
                    if (zzgndVar != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("evt", inputEvent);
                        zzgndVar.zzc(hashMap);
                    } else {
                        this.zzf.zzb(20105);
                    }
                } finally {
                }
            }
        } catch (zzavj | zzavn e) {
            this.zzf.zzd(20104, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final int zzg() {
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzh(Map map) {
        String str;
        zzgrf zza;
        String str2;
        map.put("v", this.zzh);
        ListenableFuture listenableFuture = (ListenableFuture) map.get("gs");
        ListenableFuture listenableFuture2 = (ListenableFuture) map.get("ai");
        byte[] bArr = null;
        long j = -1;
        if (listenableFuture != null) {
            zza = this.zzf.zza(20107);
            try {
                try {
                    zza.zza();
                    zzaza zzazaVar = (zzaza) listenableFuture.get(this.zzj, TimeUnit.MILLISECONDS);
                    if (zzazaVar != null) {
                        bArr = zzazaVar.zzh().zzaN();
                        str = zzazaVar.zzb().length() > 1 ? zzazaVar.zzb() : "E";
                        try {
                            if (zzazaVar.zzc()) {
                                j = zzazaVar.zzd();
                            }
                        } catch (ClassCastException e) {
                            e = e;
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals("E")) {
                            }
                            map.put(m.w, str);
                            if (bArr != null) {
                            }
                            map.put("gv", Long.valueOf(j));
                        } catch (InterruptedException e2) {
                            e = e2;
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals("E")) {
                            }
                            map.put(m.w, str);
                            if (bArr != null) {
                            }
                            map.put("gv", Long.valueOf(j));
                        } catch (ExecutionException e3) {
                            e = e3;
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals("E")) {
                            }
                            map.put(m.w, str);
                            if (bArr != null) {
                            }
                            map.put("gv", Long.valueOf(j));
                        } catch (TimeoutException e4) {
                            e = e4;
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals("E")) {
                            }
                            map.put(m.w, str);
                            if (bArr != null) {
                            }
                            map.put("gv", Long.valueOf(j));
                        }
                    } else {
                        str = "E";
                    }
                } finally {
                }
            } catch (ClassCastException e5) {
                e = e5;
                str = "E";
                zza.zzb(e);
                zza.zzc();
                if (str.equals("E")) {
                    zza = this.zzf.zza(20108);
                    try {
                        try {
                            zza.zza();
                            str2 = (String) listenableFuture2.get(this.zzi, TimeUnit.MILLISECONDS);
                            if (true != zzgvb.zzc(str2)) {
                            }
                        } catch (ClassCastException e6) {
                            e = e6;
                            zza.zzb(e);
                        } catch (InterruptedException e7) {
                            e = e7;
                            zza.zzb(e);
                        } catch (ExecutionException e8) {
                            e = e8;
                            Throwable cause2 = e.getCause();
                            if (cause2 != null) {
                                e = cause2;
                            }
                            zza.zzb(e);
                        } catch (TimeoutException e9) {
                            e = e9;
                            zza.zzb(e);
                        }
                    } finally {
                    }
                }
                map.put(m.w, str);
                if (bArr != null) {
                }
                map.put("gv", Long.valueOf(j));
            } catch (InterruptedException e10) {
                e = e10;
                str = "E";
                zza.zzb(e);
                zza.zzc();
                if (str.equals("E")) {
                }
                map.put(m.w, str);
                if (bArr != null) {
                }
                map.put("gv", Long.valueOf(j));
            } catch (ExecutionException e11) {
                e = e11;
                str = "E";
            } catch (TimeoutException e12) {
                e = e12;
                str = "E";
                zza.zzb(e);
                zza.zzc();
                if (str.equals("E")) {
                }
                map.put(m.w, str);
                if (bArr != null) {
                }
                map.put("gv", Long.valueOf(j));
            }
            zza.zzc();
        } else {
            str = "E";
        }
        if (str.equals("E") && listenableFuture2 != null) {
            zza = this.zzf.zza(20108);
            zza.zza();
            str2 = (String) listenableFuture2.get(this.zzi, TimeUnit.MILLISECONDS);
            if (true != zzgvb.zzc(str2)) {
                str = str2;
            }
        }
        map.put(m.w, str);
        if (bArr != null) {
            map.put("att", bArr);
        }
        map.put("gv", Long.valueOf(j));
    }

    final /* synthetic */ ListenableFuture zzi(zzggt zzggtVar) {
        if (zzggtVar != null) {
            this.zza.zzd(zzggtVar.zzd());
        }
        if (this.zzb.zzb(zzggtVar)) {
            return zzhcy.zzk(this.zzc.zze(), new zzgub() { // from class: com.google.android.gms.internal.ads.zzgmx
                @Override // com.google.android.gms.internal.ads.zzgub
                public final /* synthetic */ Object apply(Object obj) {
                    zzgne.this.zzn((byte[]) obj);
                    return null;
                }
            }, zzhdp.zza());
        }
        this.zzf.zzb(20103);
        throw new zzgmg(1);
    }

    final /* synthetic */ ListenableFuture zzj(Throwable th) {
        return this.zzk ? zzs() : zzhcy.zzc(th);
    }

    final /* synthetic */ String zzk(final Context context) {
        final HashMap hashMap = new HashMap();
        this.zzf.zzf(20106, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgmz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgne.this.zzp(hashMap, context);
            }
        });
        String zzu = zzu(hashMap);
        hashMap.clear();
        return zzu;
    }

    final /* synthetic */ String zzl(final Context context, String str, final View view, final Activity activity) {
        final HashMap hashMap = new HashMap();
        final String str2 = null;
        this.zzf.zzf(20106, new Runnable(hashMap, context, view, activity, str2) { // from class: com.google.android.gms.internal.ads.zzgna
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ Activity zze;

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgne.this.zzq(this.zzb, this.zzc, this.zzd, this.zze, null);
            }
        });
        String zzu = zzu(hashMap);
        hashMap.clear();
        return zzu;
    }

    final /* synthetic */ String zzm(final Context context, final String str, final View view, Activity activity) {
        final HashMap hashMap = new HashMap();
        final Activity activity2 = null;
        this.zzf.zzf(20106, new Runnable(hashMap, context, view, activity2, str) { // from class: com.google.android.gms.internal.ads.zzgnb
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ String zze;

            {
                this.zze = str;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgne.this.zzr(this.zzb, this.zzc, this.zzd, null, this.zze);
            }
        });
        String zzu = zzu(hashMap);
        hashMap.clear();
        return zzu;
    }

    final /* synthetic */ Void zzn(byte[] bArr) {
        zzt(zzgnh.zzc(), bArr, false);
        return null;
    }

    final /* synthetic */ Void zzo(byte[] bArr) {
        zzt(zzgnh.zzc(), bArr, true);
        return null;
    }

    final /* synthetic */ void zzp(Map map, Context context) {
        map.putAll(this.zze.zzb());
        zzh(map);
        map.put(InneractiveMediationDefs.GENDER_FEMALE, CampaignEx.JSON_KEY_AD_Q);
        map.put("ctx", context);
    }

    final /* synthetic */ void zzq(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zze.zzc(context, view));
        zzh(map);
        map.put(InneractiveMediationDefs.GENDER_FEMALE, "v");
        map.put("ctx", context);
        map.put("view", view);
        map.put(POBConstants.KEY_ACT, activity);
        map.put("bds", null);
    }

    final /* synthetic */ void zzr(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zze.zzd());
        zzh(map);
        map.put(InneractiveMediationDefs.GENDER_FEMALE, "c");
        map.put("ctx", context);
        map.put("view", view);
        map.put(POBConstants.KEY_ACT, null);
        map.put("bds", str);
    }
}
