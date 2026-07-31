package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidAppSetIdDataSource.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000e\u001a\u00020\u000fH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "", "applicationContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "isCollecting", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_appSetIdFlow", "", "appSetId", "getAppSetId", "()Ljava/lang/String;", "invoke", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidAppSetIdDataSource {

    @NotNull
    private final MutableStateFlow _appSetIdFlow;

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final MutableStateFlow isCollecting;

    public AndroidAppSetIdDataSource(@NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
        this.isCollecting = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._appSetIdFlow = StateFlowKt.MutableStateFlow(null);
    }

    @Nullable
    public final String getAppSetId() {
        return (String) this._appSetIdFlow.getValue();
    }

    public final void invoke() {
        Object value;
        Boolean bool;
        MutableStateFlow mutableStateFlow = this.isCollecting;
        do {
            value = mutableStateFlow.getValue();
            bool = (Boolean) value;
            bool.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        try {
            Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(this.applicationContext).getAppSetIdInfo();
            final Function1 function1 = new Function1() { // from class: com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1;
                    invoke$lambda$1 = AndroidAppSetIdDataSource.invoke$lambda$1(AndroidAppSetIdDataSource.this, (AppSetIdInfo) obj);
                    return invoke$lambda$1;
                }
            };
            Intrinsics.checkNotNull(appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    Function1.this.invoke(obj);
                }
            }));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(AndroidAppSetIdDataSource androidAppSetIdDataSource, AppSetIdInfo appSetIdInfo) {
        String id = appSetIdInfo.getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        androidAppSetIdDataSource._appSetIdFlow.setValue(id);
        return Unit.INSTANCE;
    }
}
