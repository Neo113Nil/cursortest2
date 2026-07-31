package com.unity3d.ads.core.domain.privacy;

import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: DeveloperConsentFlattenerRulesUseCase.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0002¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/domain/privacy/DeveloperConsentFlattenerRulesUseCase;", "Lcom/unity3d/ads/core/domain/privacy/FlattenerRulesUseCase;", "<init>", "()V", "invoke", "Lcom/unity3d/services/core/misc/JsonFlattenerRules;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DeveloperConsentFlattenerRulesUseCase implements FlattenerRulesUseCase {
    @Override // com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase
    @NotNull
    public JsonFlattenerRules invoke() {
        return new JsonFlattenerRules(CollectionsKt.mutableListOf("privacy", "gdpr", "pipl", POBConstants.KEY_USER), CollectionsKt.listOf("value"), CollectionsKt.mutableListOf("ts"));
    }
}
