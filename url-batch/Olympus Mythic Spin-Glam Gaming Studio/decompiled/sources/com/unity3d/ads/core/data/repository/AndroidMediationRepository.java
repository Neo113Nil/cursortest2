package com.unity3d.ads.core.data.repository;

import com.ironsource.C4901tg;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.domain.MediationProviderParser;
import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidMediationRepository.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidMediationRepository;", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "mediationDataSource", "Lcom/unity3d/ads/core/data/datasource/MediationDataSource;", "mediationProviderParser", "Lcom/unity3d/ads/core/domain/MediationProviderParser;", "<init>", "(Lcom/unity3d/ads/core/data/datasource/MediationDataSource;Lcom/unity3d/ads/core/domain/MediationProviderParser;)V", "name", "", "getName", "()Ljava/lang/String;", "version", C4901tg.b, "mediationProvider", "Lkotlin/Function0;", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "getMediationProvider", "()Lkotlin/jvm/functions/Function0;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AndroidMediationRepository implements MediationRepository {

    @NotNull
    private final MediationDataSource mediationDataSource;

    @NotNull
    private final MediationProviderParser mediationProviderParser;

    public AndroidMediationRepository(@NotNull MediationDataSource mediationDataSource, @NotNull MediationProviderParser mediationProviderParser) {
        Intrinsics.checkNotNullParameter(mediationDataSource, "mediationDataSource");
        Intrinsics.checkNotNullParameter(mediationProviderParser, "mediationProviderParser");
        this.mediationDataSource = mediationDataSource;
        this.mediationProviderParser = mediationProviderParser;
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    @Nullable
    public String getName() {
        return this.mediationDataSource.getName();
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    @Nullable
    public String getVersion() {
        return this.mediationDataSource.getVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClientInfoOuterClass.MediationProvider _get_mediationProvider_$lambda$0(AndroidMediationRepository androidMediationRepository) {
        return androidMediationRepository.mediationProviderParser.invoke(androidMediationRepository.getName());
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    @NotNull
    public Function0 getMediationProvider() {
        return new Function0() { // from class: com.unity3d.ads.core.data.repository.AndroidMediationRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                ClientInfoOuterClass.MediationProvider _get_mediationProvider_$lambda$0;
                _get_mediationProvider_$lambda$0 = AndroidMediationRepository._get_mediationProvider_$lambda$0(AndroidMediationRepository.this);
                return _get_mediationProvider_$lambda$0;
            }
        };
    }
}
