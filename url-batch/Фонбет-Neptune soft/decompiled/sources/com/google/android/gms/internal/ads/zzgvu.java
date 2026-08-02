package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgvu;
import com.google.android.gms.internal.ads.zzgvv;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgvu<MessageType extends zzgvv<MessageType, BuilderType>, BuilderType extends zzgvu<MessageType, BuilderType>> implements zzgzi {
    private String zza(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size = list.size();
        for (T t : iterable) {
            if (t == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size2);
                }
            } else {
                list.add(t);
            }
        }
    }

    protected static zzhar zzbb(zzgzj zzgzjVar) {
        return new zzhar(zzgzjVar);
    }

    @Deprecated
    protected static <T> void zzbc(Iterable<T> iterable, Collection<? super T> collection) {
        zzbd(iterable, (List) collection);
    }

    protected static <T> void zzbd(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzgyl.zzb;
        iterable.getClass();
        if (!(iterable instanceof zzgyv)) {
            if (iterable instanceof zzgzs) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List zza = ((zzgyv) iterable).zza();
        zzgyv zzgyvVar = (zzgyv) list;
        int size = list.size();
        for (Object obj : zza) {
            if (obj == null) {
                String str = "Element at index " + (zzgyvVar.size() - size) + " is null.";
                int size2 = zzgyvVar.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    zzgyvVar.remove(size2);
                }
            } else if (obj instanceof zzgwm) {
                zzgyvVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                zzgwm.zzv(bArr2, 0, bArr2.length);
                zzgyvVar.zzb();
            } else {
                zzgyvVar.add((String) obj);
            }
        }
    }

    @Override // 
    /* renamed from: zzaC, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BuilderType zzaP();

    protected abstract BuilderType zzaD(MessageType messagetype);

    public BuilderType zzaE(zzgwm zzgwmVar) throws zzgyn {
        try {
            zzgww zzl = zzgwmVar.zzl();
            zzaR(zzl);
            zzl.zzy(0);
            return this;
        } catch (zzgyn e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    /* renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaR(zzgww zzgwwVar) throws IOException {
        int i = zzgxi.zzb;
        int i2 = zzgzt.zza;
        return zzaW(zzgwwVar, zzgxi.zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzaG, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaS(zzgzj zzgzjVar) {
        if (zzbt().getClass().isInstance(zzgzjVar)) {
            return (BuilderType) zzaD((zzgvv) zzgzjVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public BuilderType zzaH(InputStream inputStream) throws IOException {
        zzgww zzG = zzgww.zzG(inputStream, 4096);
        zzaR(zzG);
        zzG.zzy(0);
        return this;
    }

    /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(byte[] bArr) throws zzgyn {
        return zzaZ(bArr, 0, bArr.length);
    }

    public BuilderType zzaJ(zzgwm zzgwmVar, zzgxi zzgxiVar) throws zzgyn {
        try {
            zzgww zzl = zzgwmVar.zzl();
            zzaW(zzl, zzgxiVar);
            zzl.zzy(0);
            return this;
        } catch (zzgyn e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    @Override // 
    /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzaW(zzgww zzgwwVar, zzgxi zzgxiVar) throws IOException;

    public BuilderType zzaL(InputStream inputStream, zzgxi zzgxiVar) throws IOException {
        zzgww zzG = zzgww.zzG(inputStream, 4096);
        zzaW(zzG, zzgxiVar);
        zzG.zzy(0);
        return this;
    }

    /* renamed from: zzaM, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzgxi zzgxiVar) throws zzgyn {
        return zzba(bArr, 0, bArr.length, zzgxiVar);
    }

    @Override // 
    /* renamed from: zzaN, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i, int i2) throws zzgyn {
        try {
            zzgww zzH = zzgww.zzH(bArr, i, i2, false);
            zzaR(zzH);
            zzH.zzy(0);
            return this;
        } catch (zzgyn e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    @Override // 
    /* renamed from: zzaO, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr, int i, int i2, zzgxi zzgxiVar) throws zzgyn {
        try {
            zzgww zzH = zzgww.zzH(bArr, i, i2, false);
            zzaW(zzH, zzgxiVar);
            zzH.zzy(0);
            return this;
        } catch (zzgyn e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    public /* bridge */ /* synthetic */ zzgzi zzaQ(zzgwm zzgwmVar) throws zzgyn {
        zzaE(zzgwmVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgzi zzaT(InputStream inputStream) throws IOException {
        zzaH(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgzi zzaV(zzgwm zzgwmVar, zzgxi zzgxiVar) throws zzgyn {
        zzaJ(zzgwmVar, zzgxiVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgzi zzaX(InputStream inputStream, zzgxi zzgxiVar) throws IOException {
        zzaL(inputStream, zzgxiVar);
        return this;
    }

    public boolean zzbe(InputStream inputStream) throws IOException {
        int i = zzgxi.zzb;
        int i2 = zzgzt.zza;
        return zzbf(inputStream, zzgxi.zza);
    }

    public boolean zzbf(InputStream inputStream, zzgxi zzgxiVar) throws IOException {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        zzaL(new zzgvt(inputStream, zzgww.zzE(read, inputStream)), zzgxiVar);
        return true;
    }
}
