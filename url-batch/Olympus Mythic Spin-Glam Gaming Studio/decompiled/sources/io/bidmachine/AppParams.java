package io.bidmachine;

import android.content.Context;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.sdk.App;
import io.bidmachine.utils.ProtoUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/bidmachine/AppParams;", "", "Lio/bidmachine/f;", "appReleaseParams", "<init>", "(Lio/bidmachine/f;)V", "Landroid/content/Context;", "context", "Lcom/explorestack/protobuf/adcom/Context$App$Builder;", "contextAppBuilder", "", "build", "(Landroid/content/Context;Lcom/explorestack/protobuf/adcom/Context$App$Builder;)V", "Lio/bidmachine/protobuf/sdk/App$Builder;", "appBuilder", "(Landroid/content/Context;Lio/bidmachine/protobuf/sdk/App$Builder;)V", "Lio/bidmachine/f;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class AppParams {

    @NotNull
    private final f appReleaseParams;

    public AppParams(@NotNull f appReleaseParams) {
        Intrinsics.checkNotNullParameter(appReleaseParams, "appReleaseParams");
        this.appReleaseParams = appReleaseParams;
    }

    public final void build(@NotNull Context context, @NotNull Context.App.Builder contextAppBuilder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contextAppBuilder, "contextAppBuilder");
        String packageName = context.getPackageName();
        if (packageName != null && packageName.length() != 0) {
            contextAppBuilder.setBundle(packageName);
        }
        String appVersion = Utils.getAppVersion(context);
        if (appVersion != null && appVersion.length() != 0) {
            contextAppBuilder.setVer(appVersion);
        }
        String appName = Utils.getAppName(context);
        if (appName != null && appName.length() != 0) {
            contextAppBuilder.setName(appName);
        }
        this.appReleaseParams.a(context, contextAppBuilder);
    }

    public final void build(@NotNull android.content.Context context, @NotNull App.Builder appBuilder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appBuilder, "appBuilder");
        k b = k.b();
        Intrinsics.checkNotNullExpressionValue(b, "get()");
        String appVersion = Utils.getAppVersion(context);
        if (appVersion != null && appVersion.length() != 0) {
            appBuilder.setAppVer(appVersion);
        }
        String appName = Utils.getAppName(context);
        if (appName != null && appName.length() != 0) {
            appBuilder.setAppName(appName);
        }
        b.h().fill(appBuilder);
        long h = b.h(context);
        if (h > 0) {
            appBuilder.setFirstLaunchTime(ProtoUtils.msToTimestamp(h));
        }
        long c = b.c(context);
        if (c > 0) {
            appBuilder.setSdkInstallTime(ProtoUtils.msToTimestamp(c));
        }
        this.appReleaseParams.a(context, appBuilder);
    }
}
