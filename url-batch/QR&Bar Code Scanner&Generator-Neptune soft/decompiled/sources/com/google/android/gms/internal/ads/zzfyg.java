package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
abstract class zzfyg extends zzfyl {
    private static final Logger zza = Logger.getLogger(zzfyg.class.getName());

    @CheckForNull
    private zzfvi zzb;
    private final boolean zzc;
    private final boolean zze;

    zzfyg(zzfvi zzfviVar, boolean z, boolean z2) {
        super(zzfviVar.size());
        Objects.requireNonNull(zzfviVar);
        this.zzb = zzfviVar;
        this.zzc = z;
        this.zze = z2;
    }

    private final void zzG(int i, Future future) {
        try {
            zzg(i, zzfzg.zzp(future));
        } catch (Error e) {
            e = e;
            zzI(e);
        } catch (RuntimeException e2) {
            e = e2;
            zzI(e);
        } catch (ExecutionException e3) {
            zzI(e3.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzy(@CheckForNull zzfvi zzfviVar) {
        int zzB = zzB();
        int i = 0;
        zzfsx.zzi(zzB >= 0, "Less than 0 remaining futures");
        if (zzB == 0) {
            if (zzfviVar != null) {
                zzfxm it = zzfviVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i, future);
                    }
                    i++;
                }
            }
            zzF();
            zzv();
            zzz(2);
        }
    }

    private static void zzJ(Throwable th) {
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean zzK(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    @CheckForNull
    protected final String zza() {
        zzfvi zzfviVar = this.zzb;
        if (zzfviVar == null) {
            return super.zza();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("futures=");
        sb.append(zzfviVar);
        return "futures=".concat(zzfviVar.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    protected final void zzb() {
        zzfvi zzfviVar = this.zzb;
        zzz(1);
        if ((zzfviVar != null) && isCancelled()) {
            boolean zzu = zzu();
            zzfxm it = zzfviVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zzu);
            }
        }
    }

    abstract void zzg(int i, Object obj);

    abstract void zzv();

    final void zzw() {
        zzfvi zzfviVar = this.zzb;
        zzfviVar.getClass();
        if (zzfviVar.isEmpty()) {
            zzv();
            return;
        }
        if (!this.zzc) {
            final zzfvi zzfviVar2 = this.zze ? this.zzb : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfyf
                @Override // java.lang.Runnable
                public final void run() {
                    zzfyg.this.zzy(zzfviVar2);
                }
            };
            zzfxm it = this.zzb.iterator();
            while (it.hasNext()) {
                ((zzfzp) it.next()).zzc(runnable, zzfyu.INSTANCE);
            }
            return;
        }
        zzfxm it2 = this.zzb.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final zzfzp zzfzpVar = (zzfzp) it2.next();
            zzfzpVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfye
                @Override // java.lang.Runnable
                public final void run() {
                    zzfyg.this.zzx(zzfzpVar, i);
                }
            }, zzfyu.INSTANCE);
            i++;
        }
    }

    final /* synthetic */ void zzx(zzfzp zzfzpVar, int i) {
        try {
            if (zzfzpVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, zzfzpVar);
            }
        } finally {
            zzy(null);
        }
    }

    void zzz(int i) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfyl
    final void zzf(Set set) {
        Objects.requireNonNull(set);
        if (isCancelled()) {
            return;
        }
        Throwable zzp = zzp();
        zzp.getClass();
        zzK(set, zzp);
    }

    private final void zzI(Throwable th) {
        Objects.requireNonNull(th);
        if (this.zzc && !zze(th) && zzK(zzE(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }
}
