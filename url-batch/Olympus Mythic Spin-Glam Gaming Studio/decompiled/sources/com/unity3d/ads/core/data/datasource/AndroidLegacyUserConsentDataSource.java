package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: AndroidLegacyUserConsentDataSource.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidLegacyUserConsentDataSource;", "Lcom/unity3d/ads/core/data/datasource/LegacyUserConsentDataSource;", "flattenerRulesUseCase", "Lcom/unity3d/ads/core/domain/privacy/FlattenerRulesUseCase;", "privateStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", "<init>", "(Lcom/unity3d/ads/core/domain/privacy/FlattenerRulesUseCase;Lcom/unity3d/services/core/misc/JsonStorage;)V", "privacyData", "", "getPrivacyData", "()Ljava/lang/String;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidLegacyUserConsentDataSource implements LegacyUserConsentDataSource {

    @NotNull
    private final FlattenerRulesUseCase flattenerRulesUseCase;

    @NotNull
    private final JsonStorage privateStorage;

    public AndroidLegacyUserConsentDataSource(@NotNull FlattenerRulesUseCase flattenerRulesUseCase, @NotNull JsonStorage privateStorage) {
        Intrinsics.checkNotNullParameter(flattenerRulesUseCase, "flattenerRulesUseCase");
        Intrinsics.checkNotNullParameter(privateStorage, "privateStorage");
        this.flattenerRulesUseCase = flattenerRulesUseCase;
        this.privateStorage = privateStorage;
    }

    @Override // com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource
    @Nullable
    public String getPrivacyData() {
        JSONObject flattenJson;
        JSONObject data = this.privateStorage.getData();
        if (data == null || (flattenJson = new JsonFlattener(data).flattenJson(".", this.flattenerRulesUseCase.invoke())) == null) {
            return null;
        }
        return flattenJson.toString();
    }
}
