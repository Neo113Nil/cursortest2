package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgio;
import com.google.android.gms.internal.ads.zzgip;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzgip<MessageType extends zzgip<MessageType, BuilderType>, BuilderType extends zzgio<MessageType, BuilderType>> implements zzgly {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    protected static void zzar(Iterable iterable, List list) {
        zzgky.zze(iterable);
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

    int zzap() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgly
    public final zzgjg zzaq() {
        try {
            int zzav = zzav();
            zzgjg zzgjgVar = zzgjg.zzb;
            byte[] bArr = new byte[zzav];
            zzgjv zzG = zzgjv.zzG(bArr);
            zzaO(zzG);
            zzG.zzI();
            return new zzgjc(bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    void zzas(int i) {
        throw null;
    }

    public final void zzat(OutputStream outputStream) throws IOException {
        zzgjv zzH = zzgjv.zzH(outputStream, zzgjv.zzB(zzav()));
        zzaO(zzH);
        zzH.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzgly
    public final byte[] zzau() {
        try {
            byte[] bArr = new byte[zzav()];
            zzgjv zzG = zzgjv.zzG(bArr);
            zzaO(zzG);
            zzG.zzI();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
