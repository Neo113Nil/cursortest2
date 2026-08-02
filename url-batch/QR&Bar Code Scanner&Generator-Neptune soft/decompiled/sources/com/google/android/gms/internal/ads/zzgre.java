package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgra;
import com.google.android.gms.internal.ads.zzgre;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgre<MessageType extends zzgre<MessageType, BuilderType>, BuilderType extends zzgra<MessageType, BuilderType>> extends zzgpf<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzgtz zzc = zzgtz.zzc();
    protected int zzd = -1;

    private static zzgre zza(zzgre zzgreVar) throws zzgrq {
        if (zzgreVar == null || zzgreVar.zzaS()) {
            return zzgreVar;
        }
        zzgrq zza = new zzgtx(zzgreVar).zza();
        zza.zzh(zzgreVar);
        throw zza;
    }

    static zzgre zzaB(Class cls) {
        Map map = zzb;
        zzgre zzgreVar = (zzgre) map.get(cls);
        if (zzgreVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgreVar = (zzgre) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgreVar == null) {
            zzgreVar = (zzgre) ((zzgre) zzgui.zzg(cls)).zzb(6, null, null);
            if (zzgreVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzgreVar);
        }
        return zzgreVar;
    }

    protected static zzgre zzaC(zzgre zzgreVar, zzgpw zzgpwVar) throws zzgrq {
        zzgqq zza = zzgqq.zza();
        zzgqe zzl = zzgpwVar.zzl();
        zzgre zzgreVar2 = (zzgre) zzgreVar.zzb(4, null, null);
        try {
            zzgth zzb2 = zzgsw.zza().zzb(zzgreVar2.getClass());
            zzb2.zzh(zzgreVar2, zzgqf.zzq(zzl), zza);
            zzb2.zzf(zzgreVar2);
            try {
                zzl.zzz(0);
                zza(zzgreVar2);
                zza(zzgreVar2);
                return zzgreVar2;
            } catch (zzgrq e) {
                e.zzh(zzgreVar2);
                throw e;
            }
        } catch (zzgrq e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgrq(e);
            }
            e.zzh(zzgreVar2);
            throw e;
        } catch (zzgtx e3) {
            zzgrq zza2 = e3.zza();
            zza2.zzh(zzgreVar2);
            throw zza2;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgrq) {
                throw ((zzgrq) e4.getCause());
            }
            zzgrq zzgrqVar = new zzgrq(e4);
            zzgrqVar.zzh(zzgreVar2);
            throw zzgrqVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgrq) {
                throw ((zzgrq) e5.getCause());
            }
            throw e5;
        }
    }

    protected static zzgre zzaD(zzgre zzgreVar, byte[] bArr) throws zzgrq {
        zzgre zzc = zzc(zzgreVar, bArr, 0, bArr.length, zzgqq.zza());
        zza(zzc);
        return zzc;
    }

    protected static zzgre zzaE(zzgre zzgreVar, zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        zzgqe zzl = zzgpwVar.zzl();
        zzgre zzgreVar2 = (zzgre) zzgreVar.zzb(4, null, null);
        try {
            zzgth zzb2 = zzgsw.zza().zzb(zzgreVar2.getClass());
            zzb2.zzh(zzgreVar2, zzgqf.zzq(zzl), zzgqqVar);
            zzb2.zzf(zzgreVar2);
            try {
                zzl.zzz(0);
                zza(zzgreVar2);
                return zzgreVar2;
            } catch (zzgrq e) {
                e.zzh(zzgreVar2);
                throw e;
            }
        } catch (zzgrq e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgrq(e);
            }
            e.zzh(zzgreVar2);
            throw e;
        } catch (zzgtx e3) {
            zzgrq zza = e3.zza();
            zza.zzh(zzgreVar2);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgrq) {
                throw ((zzgrq) e4.getCause());
            }
            zzgrq zzgrqVar = new zzgrq(e4);
            zzgrqVar.zzh(zzgreVar2);
            throw zzgrqVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgrq) {
                throw ((zzgrq) e5.getCause());
            }
            throw e5;
        }
    }

    protected static zzgre zzaF(zzgre zzgreVar, InputStream inputStream, zzgqq zzgqqVar) throws zzgrq {
        zzgqe zzH = zzgqe.zzH(inputStream, 4096);
        zzgre zzgreVar2 = (zzgre) zzgreVar.zzb(4, null, null);
        try {
            zzgth zzb2 = zzgsw.zza().zzb(zzgreVar2.getClass());
            zzb2.zzh(zzgreVar2, zzgqf.zzq(zzH), zzgqqVar);
            zzb2.zzf(zzgreVar2);
            zza(zzgreVar2);
            return zzgreVar2;
        } catch (zzgrq e) {
            e = e;
            if (e.zzl()) {
                e = new zzgrq(e);
            }
            e.zzh(zzgreVar2);
            throw e;
        } catch (zzgtx e2) {
            zzgrq zza = e2.zza();
            zza.zzh(zzgreVar2);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgrq) {
                throw ((zzgrq) e3.getCause());
            }
            zzgrq zzgrqVar = new zzgrq(e3);
            zzgrqVar.zzh(zzgreVar2);
            throw zzgrqVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzgrq) {
                throw ((zzgrq) e4.getCause());
            }
            throw e4;
        }
    }

    protected static zzgre zzaG(zzgre zzgreVar, byte[] bArr, zzgqq zzgqqVar) throws zzgrq {
        zzgre zzc = zzc(zzgreVar, bArr, 0, bArr.length, zzgqqVar);
        zza(zzc);
        return zzc;
    }

    protected static zzgrj zzaH() {
        return zzgrf.zzf();
    }

    protected static zzgrj zzaI(zzgrj zzgrjVar) {
        int size = zzgrjVar.size();
        return zzgrjVar.zzd(size == 0 ? 10 : size + size);
    }

    protected static zzgrm zzaJ() {
        return zzgsd.zzf();
    }

    protected static zzgrn zzaK() {
        return zzgsx.zze();
    }

    protected static zzgrn zzaL(zzgrn zzgrnVar) {
        int size = zzgrnVar.size();
        return zzgrnVar.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzaO(Method method, Object obj, Object... objArr) {
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

    protected static Object zzaP(zzgso zzgsoVar, String str, Object[] objArr) {
        return new zzgsy(zzgsoVar, str, objArr);
    }

    protected static void zzaQ(Class cls, zzgre zzgreVar) {
        zzb.put(cls, zzgreVar);
    }

    private static zzgre zzc(zzgre zzgreVar, byte[] bArr, int i, int i2, zzgqq zzgqqVar) throws zzgrq {
        zzgre zzgreVar2 = (zzgre) zzgreVar.zzb(4, null, null);
        try {
            zzgth zzb2 = zzgsw.zza().zzb(zzgreVar2.getClass());
            zzb2.zzi(zzgreVar2, bArr, 0, i2, new zzgpi(zzgqqVar));
            zzb2.zzf(zzgreVar2);
            if (zzgreVar2.zza == 0) {
                return zzgreVar2;
            }
            throw new RuntimeException();
        } catch (zzgrq e) {
            e = e;
            if (e.zzl()) {
                e = new zzgrq(e);
            }
            e.zzh(zzgreVar2);
            throw e;
        } catch (zzgtx e2) {
            zzgrq zza = e2.zza();
            zza.zzh(zzgreVar2);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgrq) {
                throw ((zzgrq) e3.getCause());
            }
            zzgrq zzgrqVar = new zzgrq(e3);
            zzgrqVar.zzh(zzgreVar2);
            throw zzgrqVar;
        } catch (IndexOutOfBoundsException unused) {
            zzgrq zzj = zzgrq.zzj();
            zzj.zzh(zzgreVar2);
            throw zzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzgsw.zza().zzb(getClass()).zzj(this, (zzgre) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = zzgsw.zza().zzb(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final String toString() {
        return zzgsq.zza(this, super.toString());
    }

    public final zzgra zzaA() {
        zzgra zzgraVar = (zzgra) zzb(5, null, null);
        zzgraVar.zzak(this);
        return zzgraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgso
    public final /* synthetic */ zzgsn zzaM() {
        return (zzgra) zzb(5, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgso
    public final /* synthetic */ zzgsn zzaN() {
        zzgra zzgraVar = (zzgra) zzb(5, null, null);
        zzgraVar.zzak(this);
        return zzgraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgso
    public final void zzaR(zzgql zzgqlVar) throws IOException {
        zzgsw.zza().zzb(getClass()).zzn(this, zzgqm.zza(zzgqlVar));
    }

    public final boolean zzaS() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzgsw.zza().zzb(getClass()).zzk(this);
        if (!booleanValue) {
            return zzk;
        }
        zzb(2, true != zzk ? null : this, null);
        return zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzgpf
    final int zzas() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgpf
    final void zzav(int i) {
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgso
    public final int zzay() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int zza = zzgsw.zza().zzb(getClass()).zza(this);
        this.zzd = zza;
        return zza;
    }

    protected final zzgra zzaz() {
        return (zzgra) zzb(5, null, null);
    }

    protected abstract Object zzb(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final /* synthetic */ zzgso zzbh() {
        return (zzgre) zzb(6, null, null);
    }
}
