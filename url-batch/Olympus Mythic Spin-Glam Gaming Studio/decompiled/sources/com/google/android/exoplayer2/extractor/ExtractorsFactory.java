package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public interface ExtractorsFactory {
    public static final ExtractorsFactory EMPTY = new ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.ExtractorsFactory$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            Extractor[] lambda$static$0;
            lambda$static$0 = ExtractorsFactory.lambda$static$0();
            return lambda$static$0;
        }
    };

    Extractor[] createExtractors();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[0];
    }

    default Extractor[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return createExtractors();
    }
}
