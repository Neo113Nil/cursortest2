package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.MolocoAd;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes15.dex */
public interface z {

    public static final class a {
        public static void a(@NotNull z zVar) {
        }

        public static /* synthetic */ void a(z zVar, MolocoAd molocoAd, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAdShowSuccess");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            zVar.a(molocoAd, str);
        }
    }

    void a();

    void a(@NotNull com.moloco.sdk.internal.t tVar);

    void a(@NotNull MolocoAd molocoAd, @Nullable String str);

    void onAdClicked(@NotNull MolocoAd molocoAd);

    void onAdHidden(@NotNull MolocoAd molocoAd);
}
