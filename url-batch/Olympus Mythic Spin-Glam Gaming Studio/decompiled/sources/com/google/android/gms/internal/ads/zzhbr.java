package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public abstract class zzhbr<V> extends zzhbs<V> {

    /* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
    /* loaded from: classes13.dex */
    final class zza {
        static final zza zza;
        static final zza zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzhbs.zzg) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zza(false, null);
                zza = new zza(true, null);
            }
        }

        zza(boolean z, Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
    /* loaded from: classes13.dex */
    final class zzb<V> implements Runnable {
        final zzhbr<V> zza;
        final ListenableFuture zzb;

        zzb(zzhbr zzhbrVar, ListenableFuture listenableFuture) {
            this.zza = zzhbrVar;
            this.zzb = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.zza.valueField != this) {
                return;
            }
            if (zzhbs.zzr(this.zza, this, zzhbr.zze(this.zzb))) {
                zzhbr.zzw(this.zza, false);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
    /* loaded from: classes13.dex */
    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzhbr.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
    /* loaded from: classes13.dex */
    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
    /* loaded from: classes14.dex */
    interface zze<V> extends ListenableFuture {
        @Override // com.google.common.util.concurrent.ListenableFuture
        /* synthetic */ void addListener(Runnable runnable, Executor executor);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
    /* loaded from: classes14.dex */
    abstract class zzf<V> extends zzhbr<V> implements zze<V> {
        zzf() {
        }
    }

    protected zzhbr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zze(ListenableFuture listenableFuture) {
        Throwable zzl;
        if (listenableFuture instanceof zze) {
            Object obj = ((zzhbr) listenableFuture).valueField;
            if (obj instanceof zza) {
                zza zzaVar = (zza) obj;
                if (zzaVar.zzc) {
                    Throwable th = zzaVar.zzd;
                    obj = th != null ? new zza(false, th) : zza.zzb;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((listenableFuture instanceof zzhea) && (zzl = ((zzhea) listenableFuture).zzl()) != null) {
            return new zzc(zzl);
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!zzhbs.zzg) && isCancelled) {
            zza zzaVar2 = zza.zzb;
            Objects.requireNonNull(zzaVar2);
            return zzaVar2;
        }
        try {
            Object zzf2 = zzf(listenableFuture);
            if (!isCancelled) {
                return zzz(zzf2);
            }
            String valueOf = String.valueOf(listenableFuture);
            StringBuilder sb = new StringBuilder(valueOf.length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(valueOf);
            return new zza(false, new IllegalArgumentException(sb.toString()));
        } catch (Error e) {
            e = e;
            return new zzc(e);
        } catch (CancellationException e2) {
            return !isCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e2)) : new zza(false, e2);
        } catch (ExecutionException e3) {
            return isCancelled ? new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture)), e3)) : new zzc(e3.getCause());
        } catch (Exception e4) {
            e = e4;
            return new zzc(e);
        }
    }

    private static Object zzf(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    static Object zzg(Object obj) throws ExecutionException {
        if (obj instanceof zza) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((zza) obj).zzd);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzhbs.zze) {
            return null;
        }
        return obj;
    }

    static boolean zzh(Object obj) {
        return !(obj instanceof zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzw(zzhbr zzhbrVar, boolean z) {
        zzd zzdVar = null;
        while (true) {
            zzhbrVar.zzs();
            if (z) {
                zzhbrVar.zzi();
            }
            zzhbrVar.zzc();
            zzd zzdVar2 = zzdVar;
            zzd zzq = zzhbrVar.zzq(zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zzq != null) {
                zzd zzdVar4 = zzq.next;
                zzq.next = zzdVar3;
                zzdVar3 = zzq;
                zzq = zzdVar4;
            }
            while (zzdVar3 != null) {
                Runnable runnable = zzdVar3.zzb;
                zzdVar = zzdVar3.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzb) {
                    zzb zzbVar = (zzb) runnable2;
                    zzhbrVar = zzbVar.zza;
                    if (zzhbrVar.valueField == zzbVar && zzhbs.zzr(zzhbrVar, zzbVar, zze(zzbVar.zzb))) {
                        break;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzy(runnable2, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
            z = false;
        }
    }

    private final void zzx(StringBuilder sb) {
        try {
            Object zzf2 = zzf(this);
            sb.append("SUCCESS, result=[");
            if (zzf2 == null) {
                sb.append(POBCommonConstants.NULL_VALUE);
            } else if (zzf2 == this) {
                sb.append("this future");
            } else {
                sb.append(zzf2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzf2)));
            }
            sb.append(X3.j.e);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append(X3.j.e);
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger zza2 = zzhbs.zzf.zza();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e);
        }
    }

    private static Object zzz(Object obj) {
        return obj == null ? zzhbs.zze : obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhbs, com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzguk.zzk(runnable, "Runnable was null.");
        zzguk.zzk(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listenersField) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzp(zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listenersField;
                }
            } while (zzdVar != zzd.zza);
        }
        zzy(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        zza zzaVar;
        Object obj = this.valueField;
        if (!(obj instanceof zzb) && !(obj == null)) {
            return false;
        }
        if (zzhbs.zzg) {
            zzaVar = new zza(z, new CancellationException("Future.cancel() was called."));
        } else {
            zzaVar = z ? zza.zza : zza.zzb;
            Objects.requireNonNull(zzaVar);
        }
        zzhbr<V> zzhbrVar = this;
        boolean z2 = false;
        while (true) {
            if (zzhbs.zzr(zzhbrVar, obj, zzaVar)) {
                zzw(zzhbrVar, z);
                if (!(obj instanceof zzb)) {
                    break;
                }
                ListenableFuture listenableFuture = ((zzb) obj).zzb;
                if (!(listenableFuture instanceof zze)) {
                    listenableFuture.cancel(z);
                    break;
                }
                zzhbrVar = (zzhbr) listenableFuture;
                obj = zzhbrVar.valueField;
                if (!(obj == null) && !(obj instanceof zzb)) {
                    break;
                }
                z2 = true;
            } else {
                obj = zzhbrVar.valueField;
                if (zzh(obj)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException, ExecutionException {
        return zzu();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & zzh(obj);
    }

    public String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzx(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof zzb) {
                sb.append(", setFuture=[");
                ListenableFuture listenableFuture = ((zzb) obj).zzb;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (Throwable th) {
                    zzhdq.zzb(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append(X3.j.e);
            } else {
                try {
                    concat = zzgvb.zzb(zzd());
                } catch (Throwable th2) {
                    zzhdq.zzb(th2);
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (concat != null) {
                    sb.append(", info=[");
                    sb.append(concat);
                    sb.append(X3.j.e);
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                zzx(sb);
            }
        }
        sb.append(X3.j.e);
        return sb.toString();
    }

    protected boolean zza(Object obj) {
        if (!zzhbs.zzr(this, null, zzz(obj))) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    protected boolean zzb(Throwable th) {
        if (!zzhbs.zzr(this, null, new zzc(th))) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    protected void zzc() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String zzd() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + 21);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    protected void zzi() {
    }

    protected final boolean zzj() {
        Object obj = this.valueField;
        return (obj instanceof zza) && ((zza) obj).zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhea
    protected final Throwable zzl() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    final void zzm(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzj());
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        return zzt(j, timeUnit);
    }

    protected final boolean zzk(ListenableFuture listenableFuture) {
        zzc zzcVar;
        listenableFuture.getClass();
        Object obj = this.valueField;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!zzhbs.zzr(this, null, zze(listenableFuture))) {
                    return false;
                }
                zzw(this, false);
                return true;
            }
            zzb zzbVar = new zzb(this, listenableFuture);
            if (zzhbs.zzr(this, null, zzbVar)) {
                try {
                    listenableFuture.addListener(zzbVar, zzhcn.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.zza;
                    }
                    zzhbs.zzr(this, zzbVar, zzcVar);
                }
                return true;
            }
            obj = this.valueField;
        }
        if (obj instanceof zza) {
            listenableFuture.cancel(((zza) obj).zzc);
        }
        return false;
    }
}
