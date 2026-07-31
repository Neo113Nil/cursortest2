package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HandleOpenUrl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JX\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0003H¦B¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/HandleOpenUrl;", "", "invoke", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "url", "", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "action", "extras", "", HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT, "(Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface HandleOpenUrl {
    @Nullable
    Object invoke(@NotNull AdObject adObject, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, ? extends Object> map, boolean z, @NotNull Continuation continuation);

    /* compiled from: HandleOpenUrl.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(HandleOpenUrl handleOpenUrl, AdObject adObject, String str, String str2, String str3, Map map, boolean z, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return handleOpenUrl.invoke(adObject, str, str2, (i & 8) != 0 ? "android.intent.action.VIEW" : str3, (i & 16) != 0 ? null : map, (i & 32) != 0 ? false : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }
}
