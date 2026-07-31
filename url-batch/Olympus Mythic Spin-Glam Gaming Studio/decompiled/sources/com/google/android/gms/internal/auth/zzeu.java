package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzes;
import com.google.android.gms.internal.auth.zzeu;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes4.dex */
public abstract class zzeu<MessageType extends zzeu<MessageType, BuilderType>, BuilderType extends zzes<MessageType, BuilderType>> extends zzdp<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzgz zzc = zzgz.zza();

    static zzeu zza(Class cls) {
        Map map = zzb;
        zzeu zzeuVar = (zzeu) map.get(cls);
        if (zzeuVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzeuVar = (zzeu) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzeuVar == null) {
            zzeuVar = (zzeu) ((zzeu) zzhi.zze(cls)).zzi(6, null, null);
            if (zzeuVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzeuVar);
        }
        return zzeuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r1 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static zzeu zzb(zzeu zzeuVar, byte[] bArr) throws zzfa {
        byte byteValue;
        zzeu zzj = zzj(zzeuVar, bArr, 0, bArr.length, zzek.zza);
        if (zzj != null && (byteValue = ((Byte) zzj.zzi(1, null, null)).byteValue()) != 1) {
            if (byteValue != 0) {
                boolean zzi = zzge.zza().zzb(zzj.getClass()).zzi(zzj);
                zzj.zzi(2, true != zzi ? null : zzj, null);
            }
            zzfa zza = new zzgx(zzj).zza();
            zza.zze(zzj);
            throw zza;
        }
        return zzj;
    }

    protected static zzey zzc() {
        return zzgf.zze();
    }

    static Object zze(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object zzf(zzfw zzfwVar, String str, Object[] objArr) {
        return new zzgg(zzfwVar, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    protected static void zzg(Class cls, zzeu zzeuVar) {
        zzb.put(cls, zzeuVar);
    }

    private static zzeu zzj(zzeu zzeuVar, byte[] bArr, int i, int i2, zzek zzekVar) throws zzfa {
        zzeu zzeuVar2 = (zzeu) zzeuVar.zzi(4, null, null);
        try {
            zzgh zzb2 = zzge.zza().zzb(zzeuVar2.getClass());
            zzb2.zzg(zzeuVar2, bArr, 0, i2, new zzds(zzekVar));
            zzb2.zze(zzeuVar2);
            if (zzeuVar2.zza == 0) {
                return zzeuVar2;
            }
            throw new RuntimeException();
        } catch (zzfa e) {
            e.zze(zzeuVar2);
            throw e;
        } catch (zzgx e2) {
            zzfa zza = e2.zza();
            zza.zze(zzeuVar2);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzfa) {
                throw ((zzfa) e3.getCause());
            }
            zzfa zzfaVar = new zzfa(e3);
            zzfaVar.zze(zzeuVar2);
            throw zzfaVar;
        } catch (IndexOutOfBoundsException unused) {
            zzfa zzf = zzfa.zzf();
            zzf.zze(zzeuVar2);
            throw zzf;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzge.zza().zzb(getClass()).zzh(this, (zzeu) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zza = zzge.zza().zzb(getClass()).zza(this);
        this.zza = zza;
        return zza;
    }

    public final String toString() {
        return zzfy.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.auth.zzfw
    public final /* synthetic */ zzfv zzd() {
        zzes zzesVar = (zzes) zzi(5, null, null);
        zzesVar.zze(this);
        return zzesVar;
    }

    @Override // com.google.android.gms.internal.auth.zzfx
    public final /* synthetic */ zzfw zzh() {
        return (zzeu) zzi(6, null, null);
    }

    protected abstract Object zzi(int i, Object obj, Object obj2);
}
