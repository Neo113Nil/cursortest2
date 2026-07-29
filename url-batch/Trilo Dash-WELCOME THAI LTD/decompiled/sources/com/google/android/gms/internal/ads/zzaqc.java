package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaqc extends zzaqm {
    private List zzi;

    public zzaqc(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i, int i2) {
        super(zzapcVar, "Hi6y3/CP3FfCDFHJzBy2rbo5w1qdyw4sxSVfaLENOd74y8BTNPMSy00WznqvaqDe", "doCqFliMrm1a/QUTbgigv63oWalof2MAZ3FbCUkhzYI=", zzaliVar, i, 31);
        this.zzi = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzT(-1L);
        this.zze.zzP(-1L);
        if (this.zzi == null) {
            this.zzi = (List) this.zzf.invoke(null, this.zzb.zzb());
        }
        List list = this.zzi;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zze) {
            this.zze.zzT(((Long) this.zzi.get(0)).longValue());
            this.zze.zzP(((Long) this.zzi.get(1)).longValue());
        }
    }
}
