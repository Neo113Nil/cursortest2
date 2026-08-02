package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public class zzazs extends IOException {
    public final zzazo zza;

    public zzazs(IOException iOException, zzazo zzazoVar, int i) {
        super(iOException);
        this.zza = zzazoVar;
    }

    public zzazs(String str, zzazo zzazoVar, int i) {
        super(str);
        this.zza = zzazoVar;
    }

    public zzazs(String str, IOException iOException, zzazo zzazoVar, int i) {
        super(str, iOException);
        this.zza = zzazoVar;
    }
}
