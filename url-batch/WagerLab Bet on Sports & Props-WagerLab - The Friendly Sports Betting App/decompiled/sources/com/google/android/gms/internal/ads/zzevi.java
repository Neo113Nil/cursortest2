package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.Topic;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final /* synthetic */ class zzevi implements zzgob {
    static final /* synthetic */ zzevi zza = new zzevi();

    private /* synthetic */ zzevi() {
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        if (getTopicsResponse == null) {
            return zzgot.zza(new zzevk("", 1, null));
        }
        zzhme zzc = zzhmf.zzc();
        for (Topic topic : getTopicsResponse.getTopics()) {
            zzhmc zzc2 = zzhmd.zzc();
            zzc2.zza(topic.getTopicId());
            zzc2.zzb(topic.getModelVersion());
            zzc2.zzc(topic.getTaxonomyVersion());
            zzc.zza((zzhmd) zzc2.zzbu());
        }
        return zzgot.zza(new zzevk(Base64.encodeToString(((zzhmf) zzc.zzbu()).zzaN(), 1), 1, null));
    }
}
