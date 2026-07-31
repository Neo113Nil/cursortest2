package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.google.android.gms.internal.ads.zzhbr;
import com.google.common.util.concurrent.ListenableFuture;
import com.yandex.div.core.ScrollDirection;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
abstract class zzhbs<V> extends zzhea implements ListenableFuture {
    private static final zza zzbt;
    static final Object zze = new Object();
    static final zzhdg zzf = new zzhdg(zzhbr.class);
    static final boolean zzg;
    volatile zzhbr.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    /* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
    /* loaded from: classes5.dex */
    abstract class zza {
        /* synthetic */ zza(byte[] bArr) {
        }

        abstract void zza(zze zzeVar, Thread thread);

        abstract void zzb(zze zzeVar, zze zzeVar2);

        abstract boolean zzc(zzhbs zzhbsVar, zze zzeVar, zze zzeVar2);

        abstract boolean zzd(zzhbs zzhbsVar, zzhbr.zzd zzdVar, zzhbr.zzd zzdVar2);

        abstract zze zze(zzhbs zzhbsVar, zze zzeVar);

        abstract zzhbr.zzd zzf(zzhbs zzhbsVar, zzhbr.zzd zzdVar);

        abstract boolean zzg(zzhbs zzhbsVar, Object obj, Object obj2);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
    /* loaded from: classes5.dex */
    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, ScrollDirection.NEXT);
        private static final AtomicReferenceFieldUpdater<? super zzhbs<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzhbs.class, zze.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super zzhbs<?>, zzhbr.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzhbs.class, zzhbr.zzd.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super zzhbs<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzhbs.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        /* synthetic */ zzb(byte[] bArr) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final void zza(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final void zzb(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final boolean zzc(zzhbs zzhbsVar, zze zzeVar, zze zzeVar2) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(zzc, zzhbsVar, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final boolean zzd(zzhbs zzhbsVar, zzhbr.zzd zzdVar, zzhbr.zzd zzdVar2) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(zzd, zzhbsVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final zze zze(zzhbs zzhbsVar, zze zzeVar) {
            return zzc.getAndSet(zzhbsVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final zzhbr.zzd zzf(zzhbs zzhbsVar, zzhbr.zzd zzdVar) {
            return zzd.getAndSet(zzhbsVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final boolean zzg(zzhbs zzhbsVar, Object obj, Object obj2) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(zze, zzhbsVar, obj, obj2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
    /* loaded from: classes5.dex */
    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        /* synthetic */ zzc(byte[] bArr) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final void zza(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final void zzb(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final boolean zzc(zzhbs zzhbsVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzhbsVar) {
                try {
                    if (zzhbsVar.waitersField != zzeVar) {
                        return false;
                    }
                    zzhbsVar.waitersField = zzeVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final boolean zzd(zzhbs zzhbsVar, zzhbr.zzd zzdVar, zzhbr.zzd zzdVar2) {
            synchronized (zzhbsVar) {
                try {
                    if (zzhbsVar.listenersField != zzdVar) {
                        return false;
                    }
                    zzhbsVar.listenersField = zzdVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final zze zze(zzhbs zzhbsVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzhbsVar) {
                try {
                    zzeVar2 = zzhbsVar.waitersField;
                    if (zzeVar2 != zzeVar) {
                        zzhbsVar.waitersField = zzeVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final zzhbr.zzd zzf(zzhbs zzhbsVar, zzhbr.zzd zzdVar) {
            zzhbr.zzd zzdVar2;
            synchronized (zzhbsVar) {
                try {
                    zzdVar2 = zzhbsVar.listenersField;
                    if (zzdVar2 != zzdVar) {
                        zzhbsVar.listenersField = zzdVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final boolean zzg(zzhbs zzhbsVar, Object obj, Object obj2) {
            synchronized (zzhbsVar) {
                try {
                    if (zzhbsVar.valueField != obj) {
                        return false;
                    }
                    zzhbsVar.valueField = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
    /* loaded from: classes5.dex */
    final class zzd extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe zzi;
            try {
                try {
                    zzi = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    try {
                        zzi = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, zzhbt.zza);
                    } catch (Exception unused2) {
                        zzi = zzi();
                        Unsafe unsafe = zzi;
                    }
                }
                try {
                    zzc = zzi.objectFieldOffset(zzhbs.class.getDeclaredField("waitersField"));
                    zzb = zzi.objectFieldOffset(zzhbs.class.getDeclaredField("listenersField"));
                    zzd = zzi.objectFieldOffset(zzhbs.class.getDeclaredField("valueField"));
                    zze = zzi.objectFieldOffset(zze.class.getDeclaredField("thread"));
                    zzf = zzi.objectFieldOffset(zze.class.getDeclaredField(ScrollDirection.NEXT));
                    zza = zzi;
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                }
            } catch (Exception e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2);
            }
        }

        private zzd() {
            throw null;
        }

        /* synthetic */ zzd(byte[] bArr) {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unsafe zzi() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final void zza(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final void zzb(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final boolean zzc(zzhbs zzhbsVar, zze zzeVar, zze zzeVar2) {
            return zzhbs$zzd$$ExternalSyntheticBackportWithForwarding0.m(zza, zzhbsVar, zzc, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final boolean zzd(zzhbs zzhbsVar, zzhbr.zzd zzdVar, zzhbr.zzd zzdVar2) {
            return zzhbs$zzd$$ExternalSyntheticBackportWithForwarding0.m(zza, zzhbsVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final zze zze(zzhbs zzhbsVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzhbsVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzc(zzhbsVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final zzhbr.zzd zzf(zzhbs zzhbsVar, zzhbr.zzd zzdVar) {
            zzhbr.zzd zzdVar2;
            do {
                zzdVar2 = zzhbsVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zzd(zzhbsVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        final boolean zzg(zzhbs zzhbsVar, Object obj, Object obj2) {
            return zzhbs$zzd$$ExternalSyntheticBackportWithForwarding0.m(zza, zzhbsVar, zzd, obj, obj2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
    /* loaded from: classes5.dex */
    final class zze {
        static final zze zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        zze() {
            zzhbs.zzv(this, Thread.currentThread());
        }

        zze(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzcVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzg = z;
        String property = System.getProperty("java.runtime.name", "");
        byte[] bArr = null;
        if (property == null || property.contains("Android")) {
            try {
                zzcVar = new zzd(bArr);
            } catch (Error | Exception e) {
                try {
                    th = e;
                    th2 = null;
                    zzcVar = new zzb(bArr);
                } catch (Error | Exception e2) {
                    th = e;
                    th2 = e2;
                    zzcVar = new zzc(bArr);
                }
            }
        } else {
            try {
                zzcVar = new zzb(bArr);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(bArr);
            }
        }
        th2 = null;
        th = null;
        zzbt = zzcVar;
        if (th2 != null) {
            zzhdg zzhdgVar = zzf;
            Logger zza2 = zzhdgVar.zza();
            Level level = Level.SEVERE;
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            zzhdgVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    zzhbs() {
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                            break;
                        }
                    } else if (!zzbt.zzc(this, zzeVar2, zzeVar4)) {
                        break;
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    static boolean zzr(zzhbs zzhbsVar, Object obj, Object obj2) {
        return zzbt.zzg(zzhbsVar, obj, obj2);
    }

    static /* synthetic */ void zzv(zze zzeVar, Thread thread) {
        zzbt.zza(zzeVar, thread);
    }

    public abstract /* synthetic */ void addListener(Runnable runnable, Executor executor);

    final boolean zzp(zzhbr.zzd zzdVar, zzhbr.zzd zzdVar2) {
        return zzbt.zzd(this, zzdVar, zzdVar2);
    }

    final zzhbr.zzd zzq(zzhbr.zzd zzdVar) {
        return zzbt.zzf(this, zzdVar);
    }

    final void zzs() {
        for (zze zze2 = zzbt.zze(this, zze.zza); zze2 != null; zze2 = zze2.next) {
            Thread thread = zze2.thread;
            if (thread != null) {
                zze2.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    final Object zzt(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && zzhbr.zzh(obj)) {
            return zzhbr.zzg(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                do {
                    zza zzaVar = zzbt;
                    zzaVar.zzb(zzeVar2, zzeVar);
                    if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zzhbr.zzh(obj2)) {
                                return zzhbr.zzg(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                    } else {
                        zzeVar = this.waitersField;
                    }
                } while (zzeVar != zze.zza);
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzhbr.zzg(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && zzhbr.zzh(obj4)) {
                return zzhbr.zzg(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String obj5 = toString();
        String obj6 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj6.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 8 + String.valueOf(lowerCase2).length());
        sb.append("Waited ");
        sb.append(j);
        sb.append(" ");
        sb.append(lowerCase2);
        String sb2 = sb.toString();
        if (nanos + 1000 < 0) {
            String concat = sb2.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                StringBuilder sb3 = new StringBuilder(concat.length() + String.valueOf(convert).length() + 1 + String.valueOf(lowerCase).length());
                sb3.append(concat);
                sb3.append(convert);
                sb3.append(" ");
                sb3.append(lowerCase);
                String sb4 = sb3.toString();
                if (z) {
                    sb4 = sb4.concat(StringUtils.COMMA);
                }
                concat = sb4.concat(" ");
            }
            if (z) {
                StringBuilder sb5 = new StringBuilder(concat.length() + String.valueOf(nanos2).length() + 13);
                sb5.append(concat);
                sb5.append(nanos2);
                sb5.append(" nanoseconds ");
                concat = sb5.toString();
            }
            sb2 = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(sb2.concat(" but future completed as timeout expired"));
        }
        StringBuilder sb6 = new StringBuilder(sb2.length() + 5 + String.valueOf(obj5).length());
        sb6.append(sb2);
        sb6.append(" for ");
        sb6.append(obj5);
        throw new TimeoutException(sb6.toString());
    }

    final Object zzu() throws InterruptedException, ExecutionException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && zzhbr.zzh(obj2)) {
            return zzhbr.zzg(obj2);
        }
        zze zzeVar = this.waitersField;
        if (zzeVar != zze.zza) {
            zze zzeVar2 = new zze();
            do {
                zza zzaVar = zzbt;
                zzaVar.zzb(zzeVar2, zzeVar);
                if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzeVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & zzhbr.zzh(obj)));
                    return zzhbr.zzg(obj);
                }
                zzeVar = this.waitersField;
            } while (zzeVar != zze.zza);
        }
        Object obj3 = this.valueField;
        Objects.requireNonNull(obj3);
        return zzhbr.zzg(obj3);
    }
}
