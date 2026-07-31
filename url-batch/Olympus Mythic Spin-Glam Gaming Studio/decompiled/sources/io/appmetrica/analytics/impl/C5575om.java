package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import com.pubmatic.sdk.common.POBCommonConstants;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.om, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5575om implements IParamsAppender {
    public final Ce a;
    public final Id b;
    public final C5281dc c = new C5281dc();

    public C5575om(@NonNull Ce ce, @NonNull Id id) {
        this.a = ce;
        this.b = id;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(@NonNull Uri.Builder builder, @NonNull C5679sm c5679sm) {
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.a.a(CommonUrlParts.DEVICE_ID), c5679sm.getDeviceId());
        a(builder, Ka.I.h(), this.c);
        builder.appendQueryParameter(this.a.a(CommonUrlParts.APP_SET_ID), c5679sm.getAppSetId());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.APP_SET_ID_SCOPE), c5679sm.getAppSetIdScope());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.APP_PLATFORM), c5679sm.getAppPlatform());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.PROTOCOL_VERSION), c5679sm.getProtocolVersion());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c5679sm.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.a.a("model"), c5679sm.getModel());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.MANUFACTURER), c5679sm.getManufacturer());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.OS_VERSION), c5679sm.getOsVersion());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c5679sm.getScreenWidth()));
        builder.appendQueryParameter(this.a.a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c5679sm.getScreenHeight()));
        builder.appendQueryParameter(this.a.a(CommonUrlParts.SCREEN_DPI), String.valueOf(c5679sm.getScreenDpi()));
        builder.appendQueryParameter(this.a.a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c5679sm.getScaleFactor()));
        builder.appendQueryParameter(this.a.a(CommonUrlParts.LOCALE), c5679sm.getLocale());
        builder.appendQueryParameter(this.a.a(CommonUrlParts.DEVICE_TYPE), c5679sm.getDeviceType());
        builder.appendQueryParameter(this.a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("query_hosts"), String.valueOf(2));
        String a = this.a.a("features");
        List<String> g = ((Ok) this.b).g();
        String[] strArr = {this.a.a("permissions_collecting"), this.a.a("features_collecting"), this.a.a("google_aid"), this.a.a("huawei_oaid"), this.a.a("sim_info"), this.a.a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(g);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(a, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.a.a("app_id"), c5679sm.getPackageName());
        builder.appendQueryParameter(this.a.a("app_debuggable"), ((C5275d6) c5679sm).a);
        if (c5679sm.l) {
            String str = c5679sm.m;
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter(this.a.a("country_init"), str);
            }
        } else {
            builder.appendQueryParameter(this.a.a("detect_locale"), String.valueOf(1));
        }
        I3 i3 = c5679sm.i;
        if (!Do.a(i3.a)) {
            builder.appendQueryParameter(this.a.a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.a.a("clids_set"), Wm.a(i3.a));
            int ordinal = i3.b.ordinal();
            builder.appendQueryParameter(this.a.a("clids_set_source"), ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "retail" : "satellite" : "api");
            String str2 = c5679sm.f;
            String str3 = c5679sm.g;
            if (TextUtils.isEmpty(str2)) {
                Eg eg = c5679sm.o.b;
                C5751vg a2 = eg == null ? null : eg.a();
                if (a2 != null) {
                    str2 = a2.a;
                    str3 = AbstractC5725ug.a(a2.d);
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.a.a(Constants.INSTALL_REFERRER), str2);
                if (str3 == null) {
                    str3 = POBCommonConstants.NULL_VALUE;
                }
                builder.appendQueryParameter(this.a.a("install_referrer_source"), str3);
            }
        }
        String uuid = c5679sm.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.a.a(CommonUrlParts.UUID), uuid);
        }
        builder.appendQueryParameter(this.a.a("time"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("app_system_flag"), ((C5275d6) c5679sm).b);
        builder.appendQueryParameter(this.a.a(com.ironsource.Y3.c), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("external_attribution"), String.valueOf(1));
        Map<String, Integer> c = ((Ok) this.b).c();
        for (String str4 : c.keySet()) {
            builder.appendQueryParameter(str4, String.valueOf(c.get(str4)));
        }
    }

    public final void a(@NonNull Uri.Builder builder, @NonNull DataSendingRestrictionController dataSendingRestrictionController, @NonNull C5281dc c5281dc) {
        c5281dc.getClass();
        AdvertisingIdsHolder identifiers = Ka.I.c().getIdentifiers();
        if (identifiers != null && !dataSendingRestrictionController.isRestrictedForSdk()) {
            AdTrackingInfoResult google = identifiers.getGoogle();
            if (!google.isValid()) {
                builder.appendQueryParameter(this.a.a(CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(this.a.a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult huawei = identifiers.getHuawei();
            if (!huawei.isValid()) {
                builder.appendQueryParameter(this.a.a(CommonUrlParts.HUAWEI_OAID), "");
            } else {
                builder.appendQueryParameter(this.a.a(CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult yandex = identifiers.getYandex();
            if (!yandex.isValid()) {
                builder.appendQueryParameter(this.a.a(CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(this.a.a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.a.a(CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.a.a(CommonUrlParts.HUAWEI_OAID), "");
        builder.appendQueryParameter(this.a.a(CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
