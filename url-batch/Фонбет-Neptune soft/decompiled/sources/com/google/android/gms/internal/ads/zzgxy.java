package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgxs;
import com.google.android.gms.internal.ads.zzgxy;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgxy<MessageType extends zzgxy<MessageType, BuilderType>, BuilderType extends zzgxs<MessageType, BuilderType>> extends zzgvv<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Object, zzgxy<?, ?>> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected zzhat zzt = zzhat.zzc();

    protected static zzgya zzbA() {
        return zzgwc.zzd();
    }

    protected static zzgya zzbB(zzgya zzgyaVar) {
        int size = zzgyaVar.size();
        return zzgyaVar.zzf(size == 0 ? 10 : size + size);
    }

    protected static zzgyb zzbC() {
        return zzgxf.zze();
    }

    protected static zzgyb zzbD(zzgyb zzgybVar) {
        int size = zzgybVar.size();
        return zzgybVar.zzf(size == 0 ? 10 : size + size);
    }

    protected static zzgyf zzbE() {
        return zzgxp.zze();
    }

    protected static zzgyf zzbF(zzgyf zzgyfVar) {
        int size = zzgyfVar.size();
        return zzgyfVar.zzf(size == 0 ? 10 : size + size);
    }

    protected static zzgyg zzbG() {
        return zzgxz.zzg();
    }

    protected static zzgyg zzbH(zzgyg zzgygVar) {
        int size = zzgygVar.size();
        return zzgygVar.zzf(size == 0 ? 10 : size + size);
    }

    protected static zzgyj zzbI() {
        return zzgyy.zzh();
    }

    protected static zzgyj zzbJ(zzgyj zzgyjVar) {
        int size = zzgyjVar.size();
        return zzgyjVar.zzf(size == 0 ? 10 : size + size);
    }

    protected static <E> zzgyk<E> zzbK() {
        return zzgzu.zzd();
    }

    protected static <E> zzgyk<E> zzbL(zzgyk<E> zzgykVar) {
        int size = zzgykVar.size();
        return zzgykVar.zzf(size == 0 ? 10 : size + size);
    }

    static Object zzbR(Method method, Object obj, Object... objArr) {
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

    protected static Object zzbS(zzgzj zzgzjVar, String str, Object[] objArr) {
        return new zzgzv(zzgzjVar, str, objArr);
    }

    static Method zzbT(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static <ContainingType extends zzgzj, Type> zzgxw<ContainingType, Type> zzbe(ContainingType containingtype, zzgzj zzgzjVar, zzgyd zzgydVar, int i, zzhbf zzhbfVar, boolean z, Class cls) {
        return new zzgxw<>(containingtype, Collections.emptyList(), zzgzjVar, new zzgxv(zzgydVar, i, zzhbfVar, true, z), cls);
    }

    public static <ContainingType extends zzgzj, Type> zzgxw<ContainingType, Type> zzbf(ContainingType containingtype, Type type, zzgzj zzgzjVar, zzgyd zzgydVar, int i, zzhbf zzhbfVar, Class cls) {
        return new zzgxw<>(containingtype, type, zzgzjVar, new zzgxv(zzgydVar, i, zzhbfVar, false, false), cls);
    }

    static <T extends zzgxy> T zzbh(Class<T> cls) {
        zzgxy<?, ?> zzgxyVar = zzc.get(cls);
        if (zzgxyVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgxyVar = zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgxyVar == null) {
            zzgxyVar = ((zzgxy) zzhaz.zzg(cls)).zzbt();
            if (zzgxyVar == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, zzgxyVar);
        }
        return zzgxyVar;
    }

    protected static <T extends zzgxy<T, ?>> T zzbk(T t, InputStream inputStream) throws zzgyn {
        int i = zzgxi.zzb;
        int i2 = zzgzt.zza;
        T t2 = (T) zzf(t, inputStream, zzgxi.zza);
        zze(t2);
        return t2;
    }

    protected static <T extends zzgxy<T, ?>> T zzbl(T t, InputStream inputStream, zzgxi zzgxiVar) throws zzgyn {
        T t2 = (T) zzf(t, inputStream, zzgxiVar);
        zze(t2);
        return t2;
    }

    protected static <T extends zzgxy<T, ?>> T zzbm(T t, zzgwm zzgwmVar) throws zzgyn {
        int i = zzgxi.zzb;
        int i2 = zzgzt.zza;
        T t2 = (T) zzbr(t, zzgwmVar, zzgxi.zza);
        zze(t2);
        return t2;
    }

    protected static <T extends zzgxy<T, ?>> T zzbn(T t, zzgww zzgwwVar) throws zzgyn {
        int i = zzgxi.zzb;
        int i2 = zzgzt.zza;
        return (T) zzbs(t, zzgwwVar, zzgxi.zza);
    }

    protected static <T extends zzgxy<T, ?>> T zzbo(T t, InputStream inputStream) throws zzgyn {
        zzgww zzG = zzgww.zzG(inputStream, 4096);
        int i = zzgxi.zzb;
        int i2 = zzgzt.zza;
        T t2 = (T) zzbz(t, zzG, zzgxi.zza);
        zze(t2);
        return t2;
    }

    protected static <T extends zzgxy<T, ?>> T zzbp(T t, ByteBuffer byteBuffer) throws zzgyn {
        int i = zzgxi.zzb;
        int i2 = zzgzt.zza;
        return (T) zzbv(t, byteBuffer, zzgxi.zza);
    }

    protected static <T extends zzgxy<T, ?>> T zzbq(T t, byte[] bArr) throws zzgyn {
        int length = bArr.length;
        int i = zzgxi.zzb;
        int i2 = zzgzt.zza;
        T t2 = (T) zzh(t, bArr, 0, length, zzgxi.zza);
        zze(t2);
        return t2;
    }

    protected static <T extends zzgxy<T, ?>> T zzbr(T t, zzgwm zzgwmVar, zzgxi zzgxiVar) throws zzgyn {
        T t2 = (T) zzg(t, zzgwmVar, zzgxiVar);
        zze(t2);
        return t2;
    }

    protected static <T extends zzgxy<T, ?>> T zzbs(T t, zzgww zzgwwVar, zzgxi zzgxiVar) throws zzgyn {
        T t2 = (T) zzbz(t, zzgwwVar, zzgxiVar);
        zze(t2);
        return t2;
    }

    protected static <T extends zzgxy<T, ?>> T zzbu(T t, InputStream inputStream, zzgxi zzgxiVar) throws zzgyn {
        T t2 = (T) zzbz(t, zzgww.zzG(inputStream, 4096), zzgxiVar);
        zze(t2);
        return t2;
    }

    protected static <T extends zzgxy<T, ?>> T zzbv(T t, ByteBuffer byteBuffer, zzgxi zzgxiVar) throws zzgyn {
        zzgww zzH;
        int i = zzgww.zzd;
        boolean z = false;
        if (byteBuffer.hasArray()) {
            zzH = zzgww.zzH(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && zzhaz.zzB()) {
            zzH = new zzgwu(byteBuffer, z, null);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            zzH = zzgww.zzH(bArr, 0, remaining, true);
        }
        T t2 = (T) zzbs(t, zzH, zzgxiVar);
        zze(t2);
        return t2;
    }

    protected static <T extends zzgxy<T, ?>> T zzbx(T t, byte[] bArr, zzgxi zzgxiVar) throws zzgyn {
        T t2 = (T) zzh(t, bArr, 0, bArr.length, zzgxiVar);
        zze(t2);
        return t2;
    }

    protected static <T extends zzgxy<T, ?>> T zzby(T t, zzgww zzgwwVar) throws zzgyn {
        int i = zzgxi.zzb;
        int i2 = zzgzt.zza;
        return (T) zzbz(t, zzgwwVar, zzgxi.zza);
    }

    static <T extends zzgxy<T, ?>> T zzbz(T t, zzgww zzgwwVar, zzgxi zzgxiVar) throws zzgyn {
        T t2 = (T) t.zzbj();
        try {
            zzhae zzb2 = zzgzt.zza().zzb(t2.getClass());
            zzb2.zzh(t2, zzgwx.zzq(zzgwwVar), zzgxiVar);
            zzb2.zzf(t2);
            return t2;
        } catch (zzgyn e) {
            if (e.zzk()) {
                throw new zzgyn(e);
            }
            throw e;
        } catch (zzhar e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgyn) {
                throw ((zzgyn) e3.getCause());
            }
            throw new zzgyn(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzgyn) {
                throw ((zzgyn) e4.getCause());
            }
            throw e4;
        }
    }

    private int zzc(zzhae<?> zzhaeVar) {
        if (zzhaeVar != null) {
            return zzhaeVar.zza(this);
        }
        return zzgzt.zza().zzb(getClass()).zza(this);
    }

    protected static <T extends zzgxy> void zzcb(Class<T> cls, T t) {
        t.zzbX();
        zzc.put(cls, t);
    }

    protected static final <T extends zzgxy<T, ?>> boolean zzce(T t, boolean z) {
        byte byteValue = ((Byte) t.zzbP(zzgxx.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzgzt.zza().zzb(t.getClass()).zzl(t);
        if (z) {
            t.zzbQ(zzgxx.SET_MEMOIZED_IS_INITIALIZED, true != zzl ? null : t);
        }
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends zzgxu<MessageType, BuilderType>, BuilderType, T> zzgxw<MessageType, T> zzd(zzgxg<MessageType, T> zzgxgVar) {
        return (zzgxw) zzgxgVar;
    }

    private static <T extends zzgxy<T, ?>> T zze(T t) throws zzgyn {
        if (t == null || t.zzbw()) {
            return t;
        }
        throw t.zzaP().zza();
    }

    private static <T extends zzgxy<T, ?>> T zzf(T t, InputStream inputStream, zzgxi zzgxiVar) throws zzgyn {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            zzgww zzG = zzgww.zzG(new zzgvt(inputStream, zzgww.zzE(read, inputStream)), 4096);
            T t2 = (T) zzbz(t, zzG, zzgxiVar);
            zzG.zzy(0);
            return t2;
        } catch (zzgyn e) {
            if (e.zzk()) {
                throw new zzgyn(e);
            }
            throw e;
        } catch (IOException e2) {
            throw new zzgyn(e2);
        }
    }

    private static <T extends zzgxy<T, ?>> T zzg(T t, zzgwm zzgwmVar, zzgxi zzgxiVar) throws zzgyn {
        zzgww zzl = zzgwmVar.zzl();
        T t2 = (T) zzbz(t, zzl, zzgxiVar);
        zzl.zzy(0);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends zzgxy<T, ?>> T zzh(T t, byte[] bArr, int i, int i2, zzgxi zzgxiVar) throws zzgyn {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.zzbj();
        try {
            zzhae zzb2 = zzgzt.zza().zzb(t2.getClass());
            zzb2.zzi(t2, bArr, i, i + i2, new zzgwa(zzgxiVar));
            zzb2.zzf(t2);
            return t2;
        } catch (zzgyn e) {
            if (e.zzk()) {
                throw new zzgyn(e);
            }
            throw e;
        } catch (zzhar e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgyn) {
                throw ((zzgyn) e3.getCause());
            }
            throw new zzgyn(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw zzgyn.zzi();
        }
    }

    private void zzi() {
        if (this.zzt == zzhat.zzc()) {
            this.zzt = zzhat.zzf();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgzt.zza().zzb(getClass()).zzk(this, (zzgxy) obj);
    }

    public int hashCode() {
        if (zzcf()) {
            return zzaW();
        }
        if (zzcd()) {
            zzcc(zzaW());
        }
        return zzaX();
    }

    public String toString() {
        return zzgzl.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    int zzaL() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    int zzaM(zzhae zzhaeVar) {
        if (!zzcf()) {
            if (zzaL() != Integer.MAX_VALUE) {
                return zzaL();
            }
            int zzc2 = zzc(zzhaeVar);
            zzaS(zzc2);
            return zzc2;
        }
        int zzc3 = zzc(zzhaeVar);
        if (zzc3 >= 0) {
            return zzc3;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zzc3);
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    public zzgzo zzaO() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    void zzaS(int i) {
        if (i >= 0) {
            this.zzd = i | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
    }

    int zzaW() {
        return zzgzt.zza().zzb(getClass()).zzb(this);
    }

    int zzaX() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzgzj
    public int zzaY() {
        return zzaM(null);
    }

    protected final <MessageType extends zzgxy<MessageType, BuilderType>, BuilderType extends zzgxs<MessageType, BuilderType>> BuilderType zzaZ() {
        return (BuilderType) zzbP(zzgxx.NEW_BUILDER);
    }

    public final zzgzr<MessageType> zzbN() {
        return (zzgzr) zzbP(zzgxx.GET_PARSER);
    }

    Object zzbO() throws Exception {
        return zzbP(zzgxx.BUILD_MESSAGE_INFO);
    }

    protected Object zzbP(zzgxx zzgxxVar) {
        return zzde(zzgxxVar, null, null);
    }

    protected Object zzbQ(zzgxx zzgxxVar, Object obj) {
        return zzde(zzgxxVar, obj, null);
    }

    void zzbU() {
        this.zzq = 0;
    }

    void zzbV() {
        zzaS(Integer.MAX_VALUE);
    }

    protected void zzbW() {
        zzgzt.zza().zzb(getClass()).zzf(this);
        zzbX();
    }

    void zzbX() {
        this.zzd &= Integer.MAX_VALUE;
    }

    protected void zzbY(int i, zzgwm zzgwmVar) {
        zzi();
        zzhat zzhatVar = this.zzt;
        zzhatVar.zzg();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhatVar.zzj((i << 3) | 2, zzgwmVar);
    }

    protected final void zzbZ(zzhat zzhatVar) {
        this.zzt = zzhat.zze(this.zzt, zzhatVar);
    }

    protected final <MessageType extends zzgxy<MessageType, BuilderType>, BuilderType extends zzgxs<MessageType, BuilderType>> BuilderType zzba(MessageType messagetype) {
        BuilderType zzaZ = zzaZ();
        zzaZ.zzbj(messagetype);
        return zzaZ;
    }

    @Override // com.google.android.gms.internal.ads.zzgzj
    /* renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcZ() {
        return (BuilderType) zzbP(zzgxx.NEW_BUILDER);
    }

    /* renamed from: zzbc, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzbM() {
        BuilderType buildertype = (BuilderType) zzbP(zzgxx.NEW_BUILDER);
        buildertype.zzbj(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    /* renamed from: zzbi, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbt() {
        return (MessageType) zzbP(zzgxx.GET_DEFAULT_INSTANCE);
    }

    MessageType zzbj() {
        return (MessageType) zzbP(zzgxx.NEW_MUTABLE_INSTANCE);
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final boolean zzbw() {
        return zzce(this, true);
    }

    protected void zzca(int i, int i2) {
        zzi();
        zzhat zzhatVar = this.zzt;
        zzhatVar.zzg();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhatVar.zzj(i << 3, Long.valueOf(i2));
    }

    void zzcc(int i) {
        this.zzq = i;
    }

    boolean zzcd() {
        return zzaX() == 0;
    }

    boolean zzcf() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected boolean zzcg(int i, zzgww zzgwwVar) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        zzi();
        return this.zzt.zzm(i, zzgwwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzj
    public void zzda(zzgxd zzgxdVar) throws IOException {
        zzgzt.zza().zzb(getClass()).zzj(this, zzgxe.zza(zzgxdVar));
    }

    protected abstract Object zzde(zzgxx zzgxxVar, Object obj, Object obj2);
}
