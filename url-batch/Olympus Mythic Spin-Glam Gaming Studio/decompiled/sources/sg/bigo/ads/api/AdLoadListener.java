package sg.bigo.ads.api;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.Ad;

/* loaded from: classes13.dex */
public interface AdLoadListener<T extends Ad> {
    @MainThread
    void onAdLoaded(@NonNull T t);

    @MainThread
    void onError(@NonNull AdError adError);
}
