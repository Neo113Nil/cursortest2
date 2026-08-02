package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgui {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzguh zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    static {
        boolean z;
        zzguh zzguhVar;
        boolean z2;
        Field zzE;
        long j;
        zzguh zzguhVar2;
        Unsafe zzi2 = zzi();
        zzc = zzi2;
        zzd = zzgph.zza();
        boolean zzy = zzy(Long.TYPE);
        zze = zzy;
        boolean zzy2 = zzy(Integer.TYPE);
        zzguh zzguhVar3 = null;
        if (zzi2 != null) {
            if (zzy) {
                zzguhVar3 = new zzgug(zzi2);
            } else if (zzy2) {
                zzguhVar3 = new zzguf(zzi2);
            }
        }
        zzf = zzguhVar3;
        if (zzguhVar3 != null) {
            try {
                Class<?> cls = zzguhVar3.zza.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
            } catch (Throwable th) {
                zzj(th);
            }
            if (zzE() != null) {
                z = true;
                zzg = z;
                zzguhVar = zzf;
                if (zzguhVar != null) {
                    try {
                        Class<?> cls2 = zzguhVar.zza.getClass();
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
                        zzj(th2);
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
                    if (zzE != null && (zzguhVar2 = zzf) != null) {
                        j = zzguhVar2.zzn(zzE);
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
                    j = zzguhVar2.zzn(zzE);
                }
                zzi = j;
                zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z = false;
        zzg = z;
        zzguhVar = zzf;
        if (zzguhVar != null) {
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

    private zzgui() {
    }

    static boolean zzA() {
        return zzh;
    }

    static boolean zzB() {
        return zzg;
    }

    private static int zzC(Class cls) {
        if (zzh) {
            return zzf.zzj(cls);
        }
        return -1;
    }

    private static int zzD(Class cls) {
        if (zzh) {
            return zzf.zzk(cls);
        }
        return -1;
    }

    private static Field zzE() {
        int i = zzgph.zza;
        Field zzF = zzF(Buffer.class, "effectiveDirectAddress");
        if (zzF != null) {
            return zzF;
        }
        Field zzF2 = zzF(Buffer.class, "address");
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
        long j2 = (-4) & j;
        zzguh zzguhVar = zzf;
        int zzl = zzguhVar.zzl(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzguhVar.zzp(obj, j2, ((255 & b) << i) | (zzl & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        zzguh zzguhVar = zzf;
        int i = (((int) j) & 3) << 3;
        zzguhVar.zzp(obj, j2, ((255 & b) << i) | (zzguhVar.zzl(obj, j2) & (~(255 << i))));
    }

    static byte zza(long j) {
        return zzf.zza(j);
    }

    static double zzb(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    static float zzc(Object obj, long j) {
        return zzf.zzc(obj, j);
    }

    static int zzd(Object obj, long j) {
        return zzf.zzl(obj, j);
    }

    static long zze(ByteBuffer byteBuffer) {
        return zzf.zzm(byteBuffer, zzi);
    }

    static long zzf(Object obj, long j) {
        return zzf.zzm(obj, j);
    }

    static Object zzg(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    static Object zzh(Object obj, long j) {
        return zzf.zzo(obj, j);
    }

    static Unsafe zzi() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzgue());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzj(Throwable th) {
        Logger.getLogger(zzgui.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void zzo(long j, byte[] bArr, long j2, long j3) {
        zzf.zzd(j, bArr, j2, j3);
    }

    static void zzp(Object obj, long j, boolean z) {
        zzf.zze(obj, j, z);
    }

    static void zzq(byte[] bArr, long j, byte b) {
        zzf.zzf(bArr, zza + j, b);
    }

    static void zzr(Object obj, long j, double d) {
        zzf.zzg(obj, j, d);
    }

    static void zzs(Object obj, long j, float f) {
        zzf.zzh(obj, j, f);
    }

    static void zzt(Object obj, long j, int i) {
        zzf.zzp(obj, j, i);
    }

    static void zzu(Object obj, long j, long j2) {
        zzf.zzq(obj, j, j2);
    }

    static void zzv(Object obj, long j, Object obj2) {
        zzf.zzr(obj, j, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzw(Object obj, long j) {
        return ((byte) ((zzf.zzl(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzx(Object obj, long j) {
        return ((byte) ((zzf.zzl(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzy(Class cls) {
        int i = zzgph.zza;
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

    static boolean zzz(Object obj, long j) {
        return zzf.zzi(obj, j);
    }
}
