package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
abstract class zzfua extends zzfuf {
    private static final Logger zza = Logger.getLogger(zzfua.class.getName());

    @CheckForNull
    private zzfrc zzb;
    private final boolean zzc;
    private final boolean zze;

    zzfua(zzfrc zzfrcVar, boolean z, boolean z2) {
        super(zzfrcVar.size());
        Objects.requireNonNull(zzfrcVar);
        this.zzb = zzfrcVar;
        this.zzc = z;
        this.zze = z2;
    }

    private final void zzG(int i, Future future) {
        try {
            zzg(i, zzfva.zzp(future));
        } catch (ExecutionException e) {
            zzI(e.getCause());
        } catch (Throwable th) {
            zzI(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzy(@CheckForNull zzfrc zzfrcVar) {
        int zzB = zzB();
        int i = 0;
        zzfos.zzi(zzB >= 0, "Less than 0 remaining futures");
        if (zzB == 0) {
            if (zzfrcVar != null) {
                zzftg it = zzfrcVar.iterator();
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

    @Override // com.google.android.gms.internal.ads.zzftr
    @CheckForNull
    protected final String zza() {
        zzfrc zzfrcVar = this.zzb;
        return zzfrcVar != null ? "futures=".concat(zzfrcVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    protected final void zzb() {
        zzfrc zzfrcVar = this.zzb;
        zzz(1);
        if ((zzfrcVar != null) && isCancelled()) {
            boolean zzu = zzu();
            zzftg it = zzfrcVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zzu);
            }
        }
    }

    abstract void zzg(int i, Object obj);

    abstract void zzv();

    final void zzw() {
        zzfrc zzfrcVar = this.zzb;
        zzfrcVar.getClass();
        if (zzfrcVar.isEmpty()) {
            zzv();
            return;
        }
        if (!this.zzc) {
            final zzfrc zzfrcVar2 = this.zze ? this.zzb : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzftz
                @Override // java.lang.Runnable
                public final void run() {
                    zzfua.this.zzy(zzfrcVar2);
                }
            };
            zzftg it = this.zzb.iterator();
            while (it.hasNext()) {
                ((zzfvj) it.next()).zzc(runnable, zzfuo.INSTANCE);
            }
            return;
        }
        zzftg it2 = this.zzb.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final zzfvj zzfvjVar = (zzfvj) it2.next();
            zzfvjVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfty
                @Override // java.lang.Runnable
                public final void run() {
                    zzfua.this.zzx(zzfvjVar, i);
                }
            }, zzfuo.INSTANCE);
            i++;
        }
    }

    final /* synthetic */ void zzx(zzfvj zzfvjVar, int i) {
        try {
            if (zzfvjVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, zzfvjVar);
            }
        } finally {
            zzy(null);
        }
    }

    void zzz(int i) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
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
