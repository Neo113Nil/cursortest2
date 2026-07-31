package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidGoogleAppIdDataSource.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidGoogleAppIdDataSource;", "Lcom/unity3d/ads/core/data/datasource/GoogleAppIdDataSource;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "googleAppId", "", "getGoogleAppId", "()Ljava/lang/String;", "googleAppId$delegate", "Lkotlin/Lazy;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidGoogleAppIdDataSource implements GoogleAppIdDataSource {

    @NotNull
    public static final String GOOGLE_APP_ID_RESOURCE_NAME = "google_app_id";

    @NotNull
    private final Context context;

    /* renamed from: googleAppId$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy googleAppId;

    public AndroidGoogleAppIdDataSource(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.googleAppId = LazyKt.lazy(new Function0() { // from class: com.unity3d.ads.core.data.datasource.AndroidGoogleAppIdDataSource$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                String googleAppId_delegate$lambda$3;
                googleAppId_delegate$lambda$3 = AndroidGoogleAppIdDataSource.googleAppId_delegate$lambda$3(AndroidGoogleAppIdDataSource.this);
                return googleAppId_delegate$lambda$3;
            }
        });
    }

    @Override // com.unity3d.ads.core.data.datasource.GoogleAppIdDataSource
    @Nullable
    public String getGoogleAppId() {
        return (String) this.googleAppId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String googleAppId_delegate$lambda$3(AndroidGoogleAppIdDataSource androidGoogleAppIdDataSource) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(Integer.valueOf(androidGoogleAppIdDataSource.context.getResources().getIdentifier(GOOGLE_APP_ID_RESOURCE_NAME, "string", androidGoogleAppIdDataSource.context.getPackageName())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        Integer num = (Integer) m8023constructorimpl;
        if (num == null) {
            return null;
        }
        if (num.intValue() == 0) {
            num = null;
        }
        if (num == null) {
            return null;
        }
        return androidGoogleAppIdDataSource.context.getString(num.intValue());
    }
}
