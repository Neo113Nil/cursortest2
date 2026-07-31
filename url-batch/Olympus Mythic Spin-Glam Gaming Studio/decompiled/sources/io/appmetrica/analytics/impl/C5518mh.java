package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.events.CrashEvent;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;

/* renamed from: io.appmetrica.analytics.impl.mh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5518mh implements IParamsAppender {
    public final AdvIdWithLimitedAppender a;
    public final NetworkTaskForSendingDataParamsAppender b;
    public C7 c;
    public final C5281dc d;
    public long e;

    public C5518mh(@NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter), new C5281dc());
    }

    public final void a(@NonNull C7 c7) {
        this.c = c7;
    }

    public C5518mh(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender, C5281dc c5281dc) {
        this.a = advIdWithLimitedAppender;
        this.b = networkTaskForSendingDataParamsAppender;
        this.d = c5281dc;
    }

    public final void a(long j) {
        this.e = j;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(@NonNull Uri.Builder builder, @NonNull C5804xh c5804xh) {
        builder.path(CrashEvent.e);
        this.b.appendEncryptedData(builder);
        C7 c7 = this.c;
        if (c7 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(c7.a, c5804xh.getDeviceId()));
            builder.appendQueryParameter(CommonUrlParts.UUID, StringUtils.ifIsEmptyToDef(this.c.b, c5804xh.getUuid()));
            a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.c.c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.c.f, c5804xh.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.c.h, c5804xh.getAppBuildNumber()));
            builder.appendQueryParameter(CommonUrlParts.OS_VERSION, StringUtils.ifIsEmptyToDef(this.c.i, c5804xh.getOsVersion()));
            a(builder, CommonUrlParts.OS_API_LEVEL, this.c.j);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.c.d);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.c.e);
            a(builder, "app_debuggable", this.c.g);
            builder.appendQueryParameter(CommonUrlParts.LOCALE, StringUtils.ifIsEmptyToDef(this.c.k, c5804xh.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.c.l, c5804xh.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.c.m, c5804xh.getAppFramework()));
            a(builder, "attribution_id", this.c.n);
        }
        builder.appendQueryParameter("api_key_128", c5804xh.m);
        builder.appendQueryParameter("app_id", c5804xh.getPackageName());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, c5804xh.getAppPlatform());
        builder.appendQueryParameter("model", c5804xh.getModel());
        builder.appendQueryParameter(CommonUrlParts.MANUFACTURER, c5804xh.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c5804xh.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c5804xh.getScreenHeight()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c5804xh.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c5804xh.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c5804xh.getDeviceType());
        a(builder, "clids_set", (String) WrapUtils.getOrDefault(c5804xh.p, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c5804xh.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c5804xh.getAppSetIdScope());
        AdvIdWithLimitedAppender advIdWithLimitedAppender = this.a;
        this.d.getClass();
        advIdWithLimitedAppender.appendParams(builder, Ka.I.c().getIdentifiers());
        builder.appendQueryParameter("request_id", String.valueOf(this.e));
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
