package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes6.dex */
final class zziih {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final zziig zze;
    private static final boolean zzf;

    /* JADX WARN: Removed duplicated region for block: B:25:0x010c  */
    static {
        boolean z;
        Field zzw;
        zziig zziigVar;
        Unsafe zzn = zzn();
        zzb = zzn;
        int i = zzidv.zza;
        zzc = Memory.class;
        Class cls = Long.TYPE;
        boolean zzo = zzo(cls);
        zzd = zzo;
        boolean zzo2 = zzo(Integer.TYPE);
        zziig zziigVar2 = null;
        if (zzn != null) {
            if (zzo) {
                zziigVar2 = new zziif(zzn);
            } else if (zzo2) {
                zziigVar2 = new zziie(zzn);
            }
        }
        zze = zziigVar2;
        if (zziigVar2 != null) {
            try {
                Class<?> cls2 = zziigVar2.zza.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                zzw();
            } catch (Throwable th) {
                zzt(th);
            }
        }
        zziig zziigVar3 = zze;
        if (zziigVar3 != null) {
            try {
                Class<?> cls3 = zziigVar3.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("arrayBaseOffset", Class.class);
                cls3.getMethod("arrayIndexScale", Class.class);
                Class cls4 = Long.TYPE;
                cls3.getMethod("getInt", Object.class, cls4);
                cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                cls3.getMethod("getLong", Object.class, cls4);
                cls3.getMethod("putLong", Object.class, cls4, cls4);
                cls3.getMethod("getObject", Object.class, cls4);
                cls3.getMethod("putObject", Object.class, cls4, Object.class);
                z = true;
            } catch (Throwable th2) {
                zzt(th2);
            }
            zzf = z;
            zzu(byte[].class);
            zzu(boolean[].class);
            zzv(boolean[].class);
            zzu(int[].class);
            zzv(int[].class);
            zzu(long[].class);
            zzv(long[].class);
            zzu(float[].class);
            zzv(float[].class);
            zzu(double[].class);
            zzv(double[].class);
            zzu(Object[].class);
            zzv(Object[].class);
            zzw = zzw();
            if (zzw != null && (zziigVar = zze) != null) {
                zziigVar.zza.objectFieldOffset(zzw);
            }
            zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        z = false;
        zzf = z;
        zzu(byte[].class);
        zzu(boolean[].class);
        zzv(boolean[].class);
        zzu(int[].class);
        zzv(int[].class);
        zzu(long[].class);
        zzv(long[].class);
        zzu(float[].class);
        zzv(float[].class);
        zzu(double[].class);
        zzv(double[].class);
        zzu(Object[].class);
        zzv(Object[].class);
        zzw = zzw();
        if (zzw != null) {
            zziigVar.zza.objectFieldOffset(zzw);
        }
        zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zziih() {
    }

    static Object zza(Class cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    static int zzb(Object obj, long j) {
        return zze.zza.getInt(obj, j);
    }

    static void zzc(Object obj, long j, int i) {
        zze.zza.putInt(obj, j, i);
    }

    static long zzd(Object obj, long j) {
        return zze.zza.getLong(obj, j);
    }

    static void zze(Object obj, long j, long j2) {
        zze.zza.putLong(obj, j, j2);
    }

    static boolean zzf(Object obj, long j) {
        return zze.zza(obj, j);
    }

    static void zzg(Object obj, long j, boolean z) {
        zze.zzb(obj, j, z);
    }

    static float zzh(Object obj, long j) {
        return zze.zzc(obj, j);
    }

    static void zzi(Object obj, long j, float f) {
        zze.zzd(obj, j, f);
    }

    static double zzj(Object obj, long j) {
        return zze.zze(obj, j);
    }

    static void zzk(Object obj, long j, double d) {
        zze.zzf(obj, j, d);
    }

    static Object zzl(Object obj, long j) {
        return zze.zza.getObject(obj, j);
    }

    static void zzm(Object obj, long j, Object obj2) {
        zze.zza.putObject(obj, j, obj2);
    }

    static Unsafe zzn() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new zziid());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(zziih.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    static boolean zzo(Class cls) {
        int i = zzidv.zza;
        try {
            Class cls2 = zzc;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static /* synthetic */ boolean zzp(Object obj, long j) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean zzq(Object obj, long j) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ void zzr(Object obj, long j, boolean z) {
        Unsafe unsafe = zze.zza;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((z ? 1 : 0) << i2) | ((~(255 << i2)) & i));
    }

    static /* synthetic */ void zzs(Object obj, long j, boolean z) {
        Unsafe unsafe = zze.zza;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & unsafe.getInt(obj, j2)));
    }

    static /* synthetic */ void zzt(Throwable th) {
        Logger.getLogger(zziih.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int zzu(Class cls) {
        if (zzf) {
            return zze.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzv(Class cls) {
        if (zzf) {
            return zze.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzw() {
        int i = zzidv.zza;
        Field zzx = zzx(Buffer.class, "effectiveDirectAddress");
        if (zzx != null) {
            return zzx;
        }
        Field zzx2 = zzx(Buffer.class, "address");
        if (zzx2 == null || zzx2.getType() != Long.TYPE) {
            return null;
        }
        return zzx2;
    }

    private static Field zzx(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
