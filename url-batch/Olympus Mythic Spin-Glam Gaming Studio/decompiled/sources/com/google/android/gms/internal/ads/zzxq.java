package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public interface zzxq {
    default void zzB(zzak zzakVar) {
    }

    void zzE(zzxm zzxmVar);

    zzxm zzH(zzxo zzxoVar, zzabp zzabpVar, long j);

    @Nullable
    default zzbf zzI() {
        return null;
    }

    default boolean zzJ() {
        return true;
    }

    zzak zzK();

    void zzm(Handler handler, zzxz zzxzVar);

    void zzn(zzxz zzxzVar);

    void zzo(Handler handler, zzuo zzuoVar);

    void zzp(zzuo zzuoVar);

    default void zzq(zzxp zzxpVar, zzqj zzqjVar, zzabu zzabuVar) {
        zzabuVar.zze();
        throw new IllegalStateException("prepareSource(MediaSourceCaller, TransferListener, PlayerId) not implemented");
    }

    void zzr(zzxp zzxpVar);

    void zzs(zzxp zzxpVar);

    void zzt(zzxp zzxpVar);

    void zzu() throws IOException;
}
