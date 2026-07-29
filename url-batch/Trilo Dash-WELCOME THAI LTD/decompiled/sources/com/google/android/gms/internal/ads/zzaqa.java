package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaqa extends zzaqm {
    public zzaqa(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i, int i2) {
        super(zzapcVar, "886A7k0gCRGrgCy/c5GSpG0vYnwEUdVtxuzPfTnYprNYN9F5XuGF9g0NY4fPk5Hd", "4rwcEO1STWNFfBc3lwJoy7fjIKj0+9F5WKY6nBJgTk0=", zzaliVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaoj zzaojVar = new zzaoj((String) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzch)).booleanValue())));
        synchronized (this.zze) {
            this.zze.zzi(zzaojVar.zza);
            this.zze.zzz(zzaojVar.zzb);
        }
    }
}
