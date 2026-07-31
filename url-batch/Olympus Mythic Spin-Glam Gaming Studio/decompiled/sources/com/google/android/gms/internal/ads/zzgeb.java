package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzgeb {
    private final zzggi zza;
    private final zzghf zzb;
    private final zzgqc zzc;
    private final zzgrh zzd;
    private final zzgfo zze;
    private final long zzf;
    private final zzinq zzg;
    private final long zzh;
    private final long zzi = System.currentTimeMillis();
    private final boolean zzj;
    private final long zzk;

    zzgeb(zzggi zzggiVar, zzghf zzghfVar, zzgqc zzgqcVar, zzgrh zzgrhVar, zzgfo zzgfoVar, zzinq zzinqVar, zzgei zzgeiVar) {
        this.zza = zzggiVar;
        this.zzb = zzghfVar;
        this.zzc = zzgqcVar;
        this.zzd = zzgrhVar;
        this.zze = zzgfoVar;
        this.zzf = zzgeiVar.zzj();
        this.zzg = zzinqVar;
        this.zzh = zzgeiVar.zzi();
        this.zzj = zzgeiVar.zzs();
        this.zzk = zzgeiVar.zzr();
    }

    public final ListenableFuture zza() {
        return this.zza.zza();
    }

    public final String zzb(final Context context) {
        String num;
        boolean z = false;
        if (this.zzj) {
            if (System.currentTimeMillis() - this.zzi <= this.zzk) {
                z = true;
            }
        }
        zzgrf zza = this.zzd.zza(3);
        try {
            try {
                try {
                    zza.zza();
                    num = (String) zzhcy.zzj(this.zza.zzb(), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgea
                        @Override // com.google.android.gms.internal.ads.zzhcg
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return zzgeb.this.zzg(context, (Void) obj);
                        }
                    }, zzhdp.zza()).get(z ? this.zzh : this.zzf, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    if (z) {
                        num = ((zzgkh) this.zzg.zzb()).zza(true, this.zzi);
                    } else {
                        this.zzd.zzb(56);
                        num = Integer.toString(17);
                    }
                } catch (Throwable th) {
                    zza.zzb(th);
                    throw th;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                zza.zzb(e);
                num = "";
            } catch (ExecutionException e2) {
                e = e2;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                zza.zzb(e);
                num = Integer.toString(3);
            }
            zza.zzc();
            this.zze.zzb();
            return num;
        } catch (Throwable th2) {
            zza.zzc();
            this.zze.zzb();
            throw th2;
        }
    }

    public final String zzc(final Context context, String str, final View view, final Activity activity) {
        String num;
        zzgrf zza = this.zzd.zza(4);
        try {
            try {
                try {
                    try {
                        zza.zza();
                        final String str2 = null;
                        num = (String) zzhcy.zzj(this.zza.zzb(), new zzhcg(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgdy
                            private final /* synthetic */ Context zzb;
                            private final /* synthetic */ View zzc;
                            private final /* synthetic */ Activity zzd;

                            {
                                this.zzc = view;
                                this.zzd = activity;
                            }

                            @Override // com.google.android.gms.internal.ads.zzhcg
                            public final /* synthetic */ ListenableFuture zza(Object obj) {
                                return zzgeb.this.zzh(this.zzb, null, this.zzc, this.zzd, (Void) obj);
                            }
                        }, zzhdp.zza()).get(this.zzf, TimeUnit.MILLISECONDS);
                    } catch (Throwable th) {
                        zza.zzb(th);
                        throw th;
                    }
                } catch (ExecutionException e) {
                    e = e;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    zza.zzb(e);
                    num = Integer.toString(3);
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                zza.zzb(e2);
                num = "";
            } catch (TimeoutException unused) {
                this.zzd.zzb(57);
                num = Integer.toString(17);
            }
            zza.zzc();
            this.zze.zzb();
            return num;
        } catch (Throwable th2) {
            zza.zzc();
            this.zze.zzb();
            throw th2;
        }
    }

    public final String zzd(final Context context, final String str, final View view, Activity activity) {
        String num;
        zzgrf zza = this.zzd.zza(5);
        try {
            try {
                try {
                    try {
                        zza.zza();
                        final Activity activity2 = null;
                        num = (String) zzhcy.zzj(this.zza.zzb(), new zzhcg(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgdz
                            private final /* synthetic */ Context zzb;
                            private final /* synthetic */ String zzc;
                            private final /* synthetic */ View zzd;

                            @Override // com.google.android.gms.internal.ads.zzhcg
                            public final /* synthetic */ ListenableFuture zza(Object obj) {
                                return zzgeb.this.zzi(this.zzb, this.zzc, this.zzd, null, (Void) obj);
                            }
                        }, zzhdp.zza()).get(this.zzf, TimeUnit.MILLISECONDS);
                    } catch (Throwable th) {
                        zza.zzb(th);
                        throw th;
                    }
                } catch (ExecutionException e) {
                    e = e;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    zza.zzb(e);
                    num = Integer.toString(3);
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                zza.zzb(e2);
                num = "";
            } catch (TimeoutException unused) {
                this.zzd.zzb(58);
                num = Integer.toString(17);
            }
            zza.zzc();
            this.zze.zzb();
            return num;
        } catch (Throwable th2) {
            zza.zzc();
            this.zze.zzb();
            throw th2;
        }
    }

    public final void zze(List list) {
        this.zzc.zza(list);
    }

    public final void zzf(InputEvent inputEvent) {
        this.zzb.zze(inputEvent);
    }

    final /* synthetic */ ListenableFuture zzg(Context context, Void r2) {
        return this.zzb.zzb(context);
    }

    final /* synthetic */ ListenableFuture zzh(Context context, String str, View view, Activity activity, Void r5) {
        return this.zzb.zzc(context, null, view, activity);
    }

    final /* synthetic */ ListenableFuture zzi(Context context, String str, View view, Activity activity, Void r5) {
        return this.zzb.zzd(context, str, view, null);
    }

    public final int zzj() {
        return this.zzb.zzh();
    }
}
