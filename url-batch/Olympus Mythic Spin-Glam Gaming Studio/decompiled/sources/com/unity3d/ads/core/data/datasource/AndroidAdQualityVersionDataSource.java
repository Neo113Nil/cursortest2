package com.unity3d.ads.core.data.datasource;

import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.ads.core.log.Logger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidAdQualityVersionDataSource.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidAdQualityVersionDataSource;", "Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "(Lcom/unity3d/ads/core/log/Logger;)V", "cachedVersion", "", "getCachedVersion", "()Ljava/lang/String;", "cachedVersion$delegate", "Lkotlin/Lazy;", "invoke", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AndroidAdQualityVersionDataSource implements AdQualityVersionDataSource {

    /* renamed from: cachedVersion$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cachedVersion;

    @NotNull
    private final Logger logger;

    public AndroidAdQualityVersionDataSource(@NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        this.cachedVersion = LazyKt.lazy(new Function0() { // from class: com.unity3d.ads.core.data.datasource.AndroidAdQualityVersionDataSource$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                String cachedVersion_delegate$lambda$4;
                cachedVersion_delegate$lambda$4 = AndroidAdQualityVersionDataSource.cachedVersion_delegate$lambda$4(AndroidAdQualityVersionDataSource.this);
                return cachedVersion_delegate$lambda$4;
            }
        });
    }

    private final String getCachedVersion() {
        return (String) this.cachedVersion.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cachedVersion_delegate$lambda$4(AndroidAdQualityVersionDataSource androidAdQualityVersionDataSource) {
        try {
            String sDKVersion = IronSourceAdQuality.getSDKVersion();
            if (sDKVersion == null) {
                return null;
            }
            if (StringsKt.isBlank(sDKVersion)) {
                return null;
            }
            return sDKVersion;
        } catch (ClassNotFoundException e) {
            androidAdQualityVersionDataSource.logger.debug(new Function0() { // from class: com.unity3d.ads.core.data.datasource.AndroidAdQualityVersionDataSource$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String cachedVersion_delegate$lambda$4$lambda$2;
                    cachedVersion_delegate$lambda$4$lambda$2 = AndroidAdQualityVersionDataSource.cachedVersion_delegate$lambda$4$lambda$2(e);
                    return cachedVersion_delegate$lambda$4$lambda$2;
                }
            });
            return null;
        } catch (NoClassDefFoundError e2) {
            androidAdQualityVersionDataSource.logger.debug(new Function0() { // from class: com.unity3d.ads.core.data.datasource.AndroidAdQualityVersionDataSource$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String cachedVersion_delegate$lambda$4$lambda$1;
                    cachedVersion_delegate$lambda$4$lambda$1 = AndroidAdQualityVersionDataSource.cachedVersion_delegate$lambda$4$lambda$1(e2);
                    return cachedVersion_delegate$lambda$4$lambda$1;
                }
            });
            return null;
        } catch (NoSuchMethodError e3) {
            androidAdQualityVersionDataSource.logger.debug(new Function0() { // from class: com.unity3d.ads.core.data.datasource.AndroidAdQualityVersionDataSource$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String cachedVersion_delegate$lambda$4$lambda$3;
                    cachedVersion_delegate$lambda$4$lambda$3 = AndroidAdQualityVersionDataSource.cachedVersion_delegate$lambda$4$lambda$3(e3);
                    return cachedVersion_delegate$lambda$4$lambda$3;
                }
            });
            return null;
        } catch (Throwable th) {
            androidAdQualityVersionDataSource.logger.error("Failed to get Ad Quality version", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cachedVersion_delegate$lambda$4$lambda$1(NoClassDefFoundError noClassDefFoundError) {
        return "Ad Quality SDK not available: " + noClassDefFoundError.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cachedVersion_delegate$lambda$4$lambda$2(ClassNotFoundException classNotFoundException) {
        return "Ad Quality SDK not available: " + classNotFoundException.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cachedVersion_delegate$lambda$4$lambda$3(NoSuchMethodError noSuchMethodError) {
        return "Ad Quality SDK not available: " + noSuchMethodError.getMessage();
    }

    @Override // com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource
    @Nullable
    public String invoke() {
        return getCachedVersion();
    }
}
