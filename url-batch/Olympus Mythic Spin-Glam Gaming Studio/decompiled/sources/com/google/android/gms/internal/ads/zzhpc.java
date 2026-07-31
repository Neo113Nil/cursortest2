package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhpc extends RuntimeException {
    public zzhpc(String str) {
        super(str);
    }

    public static Object zza(zzhpb zzhpbVar) {
        try {
            return zzhpbVar.zza();
        } catch (Exception e) {
            throw new zzhpc(e);
        }
    }

    public zzhpc(String str, Throwable th) {
        super(str, th);
    }

    public zzhpc(Throwable th) {
        super(th);
    }
}
