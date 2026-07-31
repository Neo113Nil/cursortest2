package com.yandex.div.core.downloader;

import androidx.annotation.NonNull;
import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.Div2View;

@PublicApi
/* loaded from: classes6.dex */
public interface DivDownloader {
    public static final DivDownloader STUB = new DivDownloader() { // from class: com.yandex.div.core.downloader.DivDownloader$$ExternalSyntheticLambda0
        @Override // com.yandex.div.core.downloader.DivDownloader
        public final LoadReference downloadPatch(Div2View div2View, String str, DivPatchDownloadCallback divPatchDownloadCallback) {
            LoadReference lambda$static$0;
            lambda$static$0 = DivDownloader.lambda$static$0(div2View, str, divPatchDownloadCallback);
            return lambda$static$0;
        }
    };

    LoadReference downloadPatch(@NonNull Div2View div2View, @NonNull String str, @NonNull DivPatchDownloadCallback divPatchDownloadCallback);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ LoadReference lambda$static$0(Div2View div2View, String str, DivPatchDownloadCallback divPatchDownloadCallback) {
        throw new AssertionError("To load patch you must provide implementation of DivDownloader to your DivConfiguration. ");
    }
}
