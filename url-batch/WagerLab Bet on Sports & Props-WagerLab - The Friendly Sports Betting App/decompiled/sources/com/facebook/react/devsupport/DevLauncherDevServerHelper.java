package com.facebook.react.devsupport;

import android.content.Context;
import android.net.Uri;
import com.amazon.a.a.o.b.f;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.packagerconnection.PackagerConnectionSettings;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import expo.modules.devlauncher.launcher.DevLauncherControllerInterface;
import expo.modules.manifests.core.Manifest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: DevLauncherDevServerHelper.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/facebook/react/devsupport/DevLauncherDevServerHelper;", "Lcom/facebook/react/devsupport/DevServerHelper;", "context", "Landroid/content/Context;", "controller", "Lexpo/modules/devlauncher/launcher/DevLauncherControllerInterface;", "devSettings", "Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "packagerConnection", "Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;", "<init>", "(Landroid/content/Context;Lexpo/modules/devlauncher/launcher/DevLauncherControllerInterface;Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;)V", "httpClient", "Lokhttp3/OkHttpClient;", "getHttpClient", "()Lokhttp3/OkHttpClient;", "httpClient$delegate", "Lkotlin/Lazy;", "getDevServerBundleURL", "", "jsModulePath", "getDevServerSplitBundleURL", "getSourceUrl", "mainModuleName", "getSourceMapUrl", "isPackagerRunning", "", "callback", "Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DevLauncherDevServerHelper extends DevServerHelper {
    public static final int $stable = 8;
    private final DevLauncherControllerInterface controller;

    /* renamed from: httpClient$delegate, reason: from kotlin metadata */
    private final Lazy httpClient;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevLauncherDevServerHelper(Context context, DevLauncherControllerInterface devLauncherControllerInterface, DeveloperSettings devSettings, PackagerConnectionSettings packagerConnection) {
        super(devSettings, context, packagerConnection);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(devSettings, "devSettings");
        Intrinsics.checkNotNullParameter(packagerConnection, "packagerConnection");
        this.controller = devLauncherControllerInterface;
        this.httpClient = LazyKt.lazy(new Function0() { // from class: com.facebook.react.devsupport.DevLauncherDevServerHelper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OkHttpClient httpClient_delegate$lambda$0;
                httpClient_delegate$lambda$0 = DevLauncherDevServerHelper.httpClient_delegate$lambda$0();
                return httpClient_delegate$lambda$0;
            }
        });
    }

    private final OkHttpClient getHttpClient() {
        return (OkHttpClient) this.httpClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient httpClient_delegate$lambda$0() {
        return new OkHttpClient.Builder().connectTimeout(5000L, TimeUnit.MILLISECONDS).readTimeout(0L, TimeUnit.MILLISECONDS).writeTimeout(0L, TimeUnit.MILLISECONDS).build();
    }

    @Override // com.facebook.react.devsupport.DevServerHelper
    public String getDevServerBundleURL(String jsModulePath) {
        Manifest manifest;
        String bundleURL;
        Intrinsics.checkNotNullParameter(jsModulePath, "jsModulePath");
        DevLauncherControllerInterface devLauncherControllerInterface = this.controller;
        return (devLauncherControllerInterface == null || (manifest = devLauncherControllerInterface.getManifest()) == null || (bundleURL = manifest.getBundleURL()) == null) ? super.getDevServerBundleURL(jsModulePath) : bundleURL;
    }

    @Override // com.facebook.react.devsupport.DevServerHelper
    public String getDevServerSplitBundleURL(String jsModulePath) {
        Manifest manifest;
        String bundleURL;
        Intrinsics.checkNotNullParameter(jsModulePath, "jsModulePath");
        DevLauncherControllerInterface devLauncherControllerInterface = this.controller;
        return (devLauncherControllerInterface == null || (manifest = devLauncherControllerInterface.getManifest()) == null || (bundleURL = manifest.getBundleURL()) == null) ? super.getDevServerSplitBundleURL(jsModulePath) : bundleURL;
    }

    @Override // com.facebook.react.devsupport.DevServerHelper
    public String getSourceUrl(String mainModuleName) {
        Manifest manifest;
        String bundleURL;
        Intrinsics.checkNotNullParameter(mainModuleName, "mainModuleName");
        DevLauncherControllerInterface devLauncherControllerInterface = this.controller;
        return (devLauncherControllerInterface == null || (manifest = devLauncherControllerInterface.getManifest()) == null || (bundleURL = manifest.getBundleURL()) == null) ? super.getSourceUrl(mainModuleName) : bundleURL;
    }

    @Override // com.facebook.react.devsupport.DevServerHelper
    public String getSourceMapUrl(String mainModuleName) {
        Manifest manifest;
        String bundleURL;
        Intrinsics.checkNotNullParameter(mainModuleName, "mainModuleName");
        String sourceMapUrl = super.getSourceMapUrl(mainModuleName);
        DevLauncherControllerInterface devLauncherControllerInterface = this.controller;
        if (devLauncherControllerInterface == null || (manifest = devLauncherControllerInterface.getManifest()) == null || (bundleURL = manifest.getBundleURL()) == null) {
            return sourceMapUrl;
        }
        Uri parse = Uri.parse(bundleURL);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : queryParameterNames) {
            Intrinsics.checkNotNull(str);
            Pair pair = null;
            if (StringsKt.startsWith$default(str, ViewProps.TRANSFORM, false, 2, (Object) null)) {
                String queryParameter = parse.getQueryParameter(str);
                if (queryParameter == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                pair = TuplesKt.to(str, queryParameter);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        ArrayList arrayList2 = arrayList;
        return arrayList2.isEmpty() ? sourceMapUrl : sourceMapUrl + "&" + CollectionsKt.joinToString$default(arrayList2, "&", null, null, 0, null, new Function1() { // from class: com.facebook.react.devsupport.DevLauncherDevServerHelper$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence sourceMapUrl$lambda$3;
                sourceMapUrl$lambda$3 = DevLauncherDevServerHelper.getSourceMapUrl$lambda$3((Pair) obj);
                return sourceMapUrl$lambda$3;
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getSourceMapUrl$lambda$3(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        return ((String) pair.component1()) + f.b + ((String) pair.component2());
    }

    @Override // com.facebook.react.devsupport.DevServerHelper
    public void isPackagerRunning(final PackagerStatusCallback callback) {
        Manifest manifest;
        String bundleURL;
        Intrinsics.checkNotNullParameter(callback, "callback");
        DevLauncherControllerInterface devLauncherControllerInterface = this.controller;
        if (devLauncherControllerInterface == null || (manifest = devLauncherControllerInterface.getManifest()) == null || (bundleURL = manifest.getBundleURL()) == null) {
            super.isPackagerRunning(callback);
            return;
        }
        String uri = Uri.parse(bundleURL).buildUpon().path("status").clearQuery().build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        FirebasePerfOkHttpClient.enqueue(getHttpClient().newCall(new Request.Builder().url(uri).build()), new Callback() { // from class: com.facebook.react.devsupport.DevLauncherDevServerHelper$isPackagerRunning$1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e, "e");
                PackagerStatusCallback.this.onPackagerStatusFetched(false);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                String str;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (!response.isSuccessful()) {
                    PackagerStatusCallback.this.onPackagerStatusFetched(false);
                    return;
                }
                ResponseBody body = response.body();
                if (body == null || (str = body.string()) == null) {
                    str = "";
                }
                PackagerStatusCallback.this.onPackagerStatusFetched(Intrinsics.areEqual(str, "packager-status:running"));
            }
        });
    }
}
