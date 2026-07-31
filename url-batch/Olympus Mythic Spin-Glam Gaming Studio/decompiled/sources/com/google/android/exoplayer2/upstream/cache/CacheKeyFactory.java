package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSpec;

/* loaded from: classes5.dex */
public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = new CacheKeyFactory() { // from class: com.google.android.exoplayer2.upstream.cache.CacheKeyFactory$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.upstream.cache.CacheKeyFactory
        public final String buildCacheKey(DataSpec dataSpec) {
            String lambda$static$0;
            lambda$static$0 = CacheKeyFactory.lambda$static$0(dataSpec);
            return lambda$static$0;
        }
    };

    String buildCacheKey(DataSpec dataSpec);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String lambda$static$0(DataSpec dataSpec) {
        String str = dataSpec.key;
        return str != null ? str : dataSpec.uri.toString();
    }
}
