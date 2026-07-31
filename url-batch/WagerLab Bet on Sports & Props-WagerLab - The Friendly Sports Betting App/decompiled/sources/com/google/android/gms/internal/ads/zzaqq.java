package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzaqq extends zzhpi implements Closeable {
    static {
        zzhpp.zzb(zzaqq.class);
    }

    public zzaqq(zzhpj zzhpjVar, zzaqp zzaqpVar) throws IOException {
        zzd(zzhpjVar, zzhpjVar.zzb(), zzaqpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhpi, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhpi
    public final String toString() {
        String obj = this.zzc.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
