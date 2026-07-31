package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgmq extends zzgml {
    private final File zza;
    private final zzgke zzb;

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(valueOf).length() + 1);
        sb.append("Files.asByteSink(");
        sb.append(obj);
        sb.append(", ");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final /* bridge */ /* synthetic */ OutputStream zza() throws IOException {
        return new FileOutputStream(this.zza, this.zzb.contains(zzgmp.APPEND));
    }

    /* synthetic */ zzgmq(File file, zzgmp[] zzgmpVarArr, byte[] bArr) {
        file.getClass();
        this.zza = file;
        this.zzb = zzgke.zzp(zzgmpVarArr);
    }
}
