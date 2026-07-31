package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetLatestWebViewConfiguration.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JD\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0086B¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;", "", "webviewConfigurationDataSource", "Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "<init>", "(Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;)V", "invoke", "Lcom/unity3d/ads/core/data/model/WebViewConfiguration;", "receivedEntryPoint", "", "receivedVersion", "", "receivedAdditionalFiles", "", "receivedType", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetLatestWebViewConfiguration {

    @NotNull
    private final WebviewConfigurationDataSource webviewConfigurationDataSource;

    public GetLatestWebViewConfiguration(@NotNull WebviewConfigurationDataSource webviewConfigurationDataSource) {
        Intrinsics.checkNotNullParameter(webviewConfigurationDataSource, "webviewConfigurationDataSource");
        this.webviewConfigurationDataSource = webviewConfigurationDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(@Nullable String str, @Nullable Integer num, @Nullable List<String> list, @Nullable String str2, @NotNull Continuation continuation) {
        GetLatestWebViewConfiguration$invoke$1 getLatestWebViewConfiguration$invoke$1;
        int i;
        WebViewConfiguration webViewConfiguration;
        WebViewConfiguration webViewConfiguration2;
        WebViewConfiguration webViewConfiguration3;
        if (continuation instanceof GetLatestWebViewConfiguration$invoke$1) {
            getLatestWebViewConfiguration$invoke$1 = (GetLatestWebViewConfiguration$invoke$1) continuation;
            int i2 = getLatestWebViewConfiguration$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getLatestWebViewConfiguration$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getLatestWebViewConfiguration$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getLatestWebViewConfiguration$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    WebviewConfigurationDataSource webviewConfigurationDataSource = this.webviewConfigurationDataSource;
                    getLatestWebViewConfiguration$invoke$1.L$0 = str;
                    getLatestWebViewConfiguration$invoke$1.L$1 = num;
                    getLatestWebViewConfiguration$invoke$1.L$2 = list;
                    getLatestWebViewConfiguration$invoke$1.L$3 = str2;
                    getLatestWebViewConfiguration$invoke$1.label = 1;
                    obj = webviewConfigurationDataSource.get(getLatestWebViewConfiguration$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        webViewConfiguration3 = (WebViewConfiguration) getLatestWebViewConfiguration$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        return webViewConfiguration3;
                    }
                    str2 = (String) getLatestWebViewConfiguration$invoke$1.L$3;
                    list = (List) getLatestWebViewConfiguration$invoke$1.L$2;
                    num = (Integer) getLatestWebViewConfiguration$invoke$1.L$1;
                    str = (String) getLatestWebViewConfiguration$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore = (WebviewConfigurationStore.WebViewConfigurationStore) obj;
                int version = webViewConfigurationStore.getVersion();
                String entryPoint = webViewConfigurationStore.getEntryPoint();
                Intrinsics.checkNotNullExpressionValue(entryPoint, "getEntryPoint(...)");
                List<String> additionalFilesList = webViewConfigurationStore.getAdditionalFilesList();
                Intrinsics.checkNotNullExpressionValue(additionalFilesList, "getAdditionalFilesList(...)");
                String type = webViewConfigurationStore.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                webViewConfiguration = new WebViewConfiguration(version, entryPoint, additionalFilesList, type);
                if (str != null && num == null && list == null && str2 == null) {
                    return webViewConfiguration;
                }
                int intValue = num == null ? num.intValue() : webViewConfiguration.getVersion();
                if (str == null) {
                    str = webViewConfiguration.getEntryPoint();
                }
                if (list == null) {
                    list = webViewConfiguration.getAdditionalFiles();
                }
                if (str2 == null) {
                    str2 = webViewConfiguration.getType();
                }
                webViewConfiguration2 = new WebViewConfiguration(intValue, str, list, str2);
                if (!Intrinsics.areEqual(webViewConfiguration2, webViewConfiguration)) {
                    return webViewConfiguration2;
                }
                WebviewConfigurationDataSource webviewConfigurationDataSource2 = this.webviewConfigurationDataSource;
                WebviewConfigurationStore.WebViewConfigurationStore.Builder newBuilder = WebviewConfigurationStore.WebViewConfigurationStore.newBuilder();
                newBuilder.setVersion(webViewConfiguration2.getVersion());
                newBuilder.setEntryPoint(webViewConfiguration2.getEntryPoint());
                newBuilder.addAllAdditionalFiles(webViewConfiguration2.getAdditionalFiles());
                newBuilder.setType(webViewConfiguration2.getType());
                WebviewConfigurationStore.WebViewConfigurationStore build = newBuilder.build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                getLatestWebViewConfiguration$invoke$1.L$0 = webViewConfiguration2;
                getLatestWebViewConfiguration$invoke$1.L$1 = null;
                getLatestWebViewConfiguration$invoke$1.L$2 = null;
                getLatestWebViewConfiguration$invoke$1.L$3 = null;
                getLatestWebViewConfiguration$invoke$1.label = 2;
                if (webviewConfigurationDataSource2.set(build, getLatestWebViewConfiguration$invoke$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                webViewConfiguration3 = webViewConfiguration2;
                return webViewConfiguration3;
            }
        }
        getLatestWebViewConfiguration$invoke$1 = new GetLatestWebViewConfiguration$invoke$1(this, continuation);
        Object obj2 = getLatestWebViewConfiguration$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getLatestWebViewConfiguration$invoke$1.label;
        if (i != 0) {
        }
        WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore2 = (WebviewConfigurationStore.WebViewConfigurationStore) obj2;
        int version2 = webViewConfigurationStore2.getVersion();
        String entryPoint2 = webViewConfigurationStore2.getEntryPoint();
        Intrinsics.checkNotNullExpressionValue(entryPoint2, "getEntryPoint(...)");
        List<String> additionalFilesList2 = webViewConfigurationStore2.getAdditionalFilesList();
        Intrinsics.checkNotNullExpressionValue(additionalFilesList2, "getAdditionalFilesList(...)");
        String type2 = webViewConfigurationStore2.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        webViewConfiguration = new WebViewConfiguration(version2, entryPoint2, additionalFilesList2, type2);
        if (str != null) {
        }
        if (num == null) {
        }
        if (str == null) {
        }
        if (list == null) {
        }
        if (str2 == null) {
        }
        webViewConfiguration2 = new WebViewConfiguration(intValue, str, list, str2);
        if (!Intrinsics.areEqual(webViewConfiguration2, webViewConfiguration)) {
        }
    }
}
