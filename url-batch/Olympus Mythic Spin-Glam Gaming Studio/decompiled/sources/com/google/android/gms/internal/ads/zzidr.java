package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzidq;
import com.google.android.gms.internal.ads.zzidr;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public abstract class zzidr<MessageType extends zzidr<MessageType, BuilderType>, BuilderType extends zzidq<MessageType, BuilderType>> implements zzigw {
    protected transient int zzq = 0;

    protected static void zzaV(zziei zzieiVar) throws IllegalArgumentException {
        if (!zzieiVar.zzi()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    protected static <T> void zzaW(Iterable<T> iterable, List<? super T> list) {
        zzidq.zzaT(iterable, list);
    }

    private String zzdX(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 18 + String.valueOf(str).length() + 44);
        sb.append("Serializing ");
        sb.append(name);
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public zziei zzaM() {
        try {
            int zzbr = zzbr();
            zziei zzieiVar = zziei.zza;
            byte[] bArr = new byte[zzbr];
            zzieo zzieoVar = new zzieo(bArr, 0, zzbr);
            zzcX(zzieoVar);
            return zziee.zza(zzieoVar, bArr);
        } catch (IOException e) {
            throw new RuntimeException(zzdX("ByteString"), e);
        }
    }

    public byte[] zzaN() {
        try {
            int zzbr = zzbr();
            byte[] bArr = new byte[zzbr];
            zzieo zzieoVar = new zzieo(bArr, 0, zzbr);
            zzcX(zzieoVar);
            zzieoVar.zzI();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(zzdX("byte array"), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public void zzaO(OutputStream outputStream) throws IOException {
        zzieq zzieqVar = new zzieq(outputStream, zzier.zzE(zzbr()));
        zzcX(zzieqVar);
        zzieqVar.zzx();
    }

    public void zzaP(OutputStream outputStream) throws IOException {
        int zzbr = zzbr();
        zzieq zzieqVar = new zzieq(outputStream, zzier.zzE(zzier.zzF(zzbr) + zzbr));
        zzieqVar.zzr(zzbr);
        zzcX(zzieqVar);
        zzieqVar.zzx();
    }

    int zzaQ() {
        throw new UnsupportedOperationException();
    }

    void zzaR(int i) {
        throw new UnsupportedOperationException();
    }

    public zzihb zzaS() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    int zzaT(zziho zzihoVar) {
        return zzaQ();
    }

    zzihz zzaU() {
        return new zzihz(this);
    }
}
