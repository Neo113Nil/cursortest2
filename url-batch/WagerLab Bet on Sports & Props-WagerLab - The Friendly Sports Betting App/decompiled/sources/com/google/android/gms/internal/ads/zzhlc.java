package com.google.android.gms.internal.ads;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
final class zzhlc {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzhlb zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    static {
        boolean z;
        zzhlb zzhlbVar;
        boolean z2;
        Field zzE;
        long j;
        zzhlb zzhlbVar2;
        Unsafe zzt = zzt();
        zzc = zzt;
        int i = zzhgo.zza;
        zzd = Memory.class;
        boolean zzu = zzu(Long.TYPE);
        zze = zzu;
        boolean zzu2 = zzu(Integer.TYPE);
        zzhlb zzhlbVar3 = null;
        if (zzt != null) {
            if (zzu) {
                zzhlbVar3 = new zzhla(zzt);
            } else if (zzu2) {
                zzhlbVar3 = new zzhkz(zzt);
            }
        }
        zzf = zzhlbVar3;
        if (zzhlbVar3 != null) {
            try {
                Class<?> cls = zzhlbVar3.zza.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
            } catch (Throwable th) {
                zzB(th);
            }
            if (zzE() != null) {
                z = true;
                zzg = z;
                zzhlbVar = zzf;
                if (zzhlbVar != null) {
                    try {
                        Class<?> cls2 = zzhlbVar.zza.getClass();
                        cls2.getMethod("objectFieldOffset", Field.class);
                        cls2.getMethod("arrayBaseOffset", Class.class);
                        cls2.getMethod("arrayIndexScale", Class.class);
                        cls2.getMethod("getInt", Object.class, Long.TYPE);
                        cls2.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                        cls2.getMethod("getLong", Object.class, Long.TYPE);
                        cls2.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
                        cls2.getMethod("getObject", Object.class, Long.TYPE);
                        cls2.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                        z2 = true;
                    } catch (Throwable th2) {
                        zzB(th2);
                    }
                    zzh = z2;
                    zza = zzC(byte[].class);
                    zzC(boolean[].class);
                    zzD(boolean[].class);
                    zzC(int[].class);
                    zzD(int[].class);
                    zzC(long[].class);
                    zzD(long[].class);
                    zzC(float[].class);
                    zzD(float[].class);
                    zzC(double[].class);
                    zzD(double[].class);
                    zzC(Object[].class);
                    zzD(Object[].class);
                    zzE = zzE();
                    j = -1;
                    if (zzE != null && (zzhlbVar2 = zzf) != null) {
                        j = zzhlbVar2.zza.objectFieldOffset(zzE);
                    }
                    zzi = j;
                    zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z2 = false;
                zzh = z2;
                zza = zzC(byte[].class);
                zzC(boolean[].class);
                zzD(boolean[].class);
                zzC(int[].class);
                zzD(int[].class);
                zzC(long[].class);
                zzD(long[].class);
                zzC(float[].class);
                zzD(float[].class);
                zzC(double[].class);
                zzD(double[].class);
                zzC(Object[].class);
                zzD(Object[].class);
                zzE = zzE();
                j = -1;
                if (zzE != null) {
                    j = zzhlbVar2.zza.objectFieldOffset(zzE);
                }
                zzi = j;
                zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z = false;
        zzg = z;
        zzhlbVar = zzf;
        if (zzhlbVar != null) {
        }
        z2 = false;
        zzh = z2;
        zza = zzC(byte[].class);
        zzC(boolean[].class);
        zzD(boolean[].class);
        zzC(int[].class);
        zzD(int[].class);
        zzC(long[].class);
        zzD(long[].class);
        zzC(float[].class);
        zzD(float[].class);
        zzC(double[].class);
        zzD(double[].class);
        zzC(Object[].class);
        zzD(Object[].class);
        zzE = zzE();
        j = -1;
        if (zzE != null) {
        }
        zzi = j;
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzhlc() {
    }

    static /* synthetic */ void zzB(Throwable th) {
        Logger.getLogger(zzhlc.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int zzC(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzD(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzE() {
        int i = zzhgo.zza;
        Field zzF = zzF(Buffer.class, "effectiveDirectAddress");
        if (zzF != null) {
            return zzF;
        }
        Field zzF2 = zzF(Buffer.class, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        if (zzF2 == null || zzF2.getType() != Long.TYPE) {
            return null;
        }
        return zzF2;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j, byte b) {
        Unsafe unsafe = zzf.zza;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(Object obj, long j, byte b) {
        Unsafe unsafe = zzf.zza;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    static boolean zza() {
        return zzh;
    }

    static boolean zzb() {
        return zzg;
    }

    static Object zzc(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    static int zzd(Object obj, long j) {
        return zzf.zza.getInt(obj, j);
    }

    static void zze(Object obj, long j, int i) {
        zzf.zza.putInt(obj, j, i);
    }

    static long zzf(Object obj, long j) {
        return zzf.zza.getLong(obj, j);
    }

    static void zzg(Object obj, long j, long j2) {
        zzf.zza.putLong(obj, j, j2);
    }

    static boolean zzh(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    static void zzi(Object obj, long j, boolean z) {
        zzf.zzc(obj, j, z);
    }

    static float zzj(Object obj, long j) {
        return zzf.zzd(obj, j);
    }

    static void zzk(Object obj, long j, float f) {
        zzf.zze(obj, j, f);
    }

    static double zzl(Object obj, long j) {
        return zzf.zzf(obj, j);
    }

    static void zzm(Object obj, long j, double d) {
        zzf.zzg(obj, j, d);
    }

    static Object zzn(Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    static void zzo(Object obj, long j, Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    static void zzp(byte[] bArr, long j, byte b) {
        zzf.zza(bArr, zza + j, b);
    }

    static void zzq(long j, byte[] bArr, long j2, long j3) {
        zzf.zzi(j, bArr, j2, j3);
    }

    static byte zzr(long j) {
        return zzf.zzh(j);
    }

    static long zzs(ByteBuffer byteBuffer) {
        zzhlb zzhlbVar = zzf;
        return zzhlbVar.zza.getLong(byteBuffer, zzi);
    }

    static Unsafe zzt() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhky());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzu(Class cls) {
        int i = zzhgo.zza;
        try {
            Class cls2 = zzd;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static /* synthetic */ boolean zzx(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean zzy(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
