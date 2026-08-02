package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgpe;
import com.google.android.gms.internal.ads.zzgpf;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgpf<MessageType extends zzgpf<MessageType, BuilderType>, BuilderType extends zzgpe<MessageType, BuilderType>> implements zzgso {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    protected static void zzau(Iterable iterable, List list) {
        zzgro.zze(iterable);
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
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
                list.add(obj);
            }
        }
    }

    int zzas() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgso
    public final zzgpw zzat() {
        try {
            int zzay = zzay();
            zzgpw zzgpwVar = zzgpw.zzb;
            byte[] bArr = new byte[zzay];
            zzgql zzG = zzgql.zzG(bArr);
            zzaR(zzG);
            zzG.zzI();
            return new zzgps(bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    void zzav(int i) {
        throw null;
    }

    public final void zzaw(OutputStream outputStream) throws IOException {
        zzgql zzH = zzgql.zzH(outputStream, zzgql.zzB(zzay()));
        zzaR(zzH);
        zzH.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzgso
    public final byte[] zzax() {
        try {
            byte[] bArr = new byte[zzay()];
            zzgql zzG = zzgql.zzG(bArr);
            zzaR(zzG);
            zzG.zzI();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
