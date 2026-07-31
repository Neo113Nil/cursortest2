package com.pubmatic.sdk.webrendering.dsa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebSettings;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.cache.POBAdViewCacheService;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBDSATransparencyInfo;
import com.pubmatic.sdk.common.ui.POBFullScreenActivityListener;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.webrendering.ui.POBFullScreenActivity;
import com.pubmatic.sdk.webrendering.ui.POBMraidViewContainer;
import com.pubmatic.sdk.webrendering.ui.POBMraidViewContainerListener;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.partials.PubMaticNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/pubmatic/sdk/webrendering/dsa/POBDsaInfoPresenterHelper;", "", "<init>", "()V", "Landroid/content/Context;", "mContext", "Lcom/pubmatic/sdk/common/base/POBAdDescriptor;", "mDescriptor", "", "webPageData", "", "show", "(Landroid/content/Context;Lcom/pubmatic/sdk/common/base/POBAdDescriptor;Ljava/lang/String;)V", "context", "url", "data", "Lcom/pubmatic/sdk/common/view/POBWebView;", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/pubmatic/sdk/common/view/POBWebView;", "webrendering_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class POBDsaInfoPresenterHelper {

    @NotNull
    public static final POBDsaInfoPresenterHelper INSTANCE = new POBDsaInfoPresenterHelper();

    private POBDsaInfoPresenterHelper() {
    }

    private final POBWebView a(Context context, String url, String data) {
        POBWebView createInstance = POBWebView.createInstance(POBUtils.resolveWebViewContext(context));
        if (createInstance != null) {
            WebSettings settings = createInstance.getSettings();
            Intrinsics.checkNotNullExpressionValue(settings, "webView.settings");
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setDomStorageEnabled(true);
            PubMaticNetworkBridge.webviewLoadDataWithBaseURL(createInstance, url, data, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
        }
        return createInstance;
    }

    public static void safedk_POBFullScreenActivity_startActivity_9b43eeb3a2c956a47043e4be8e9dab59(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/pubmatic/sdk/webrendering/ui/POBFullScreenActivity;->startActivity(Landroid/content/Context;Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.F);
        POBFullScreenActivity.startActivity(p0, p1);
    }

    public static final void show(@NotNull final Context mContext, @Nullable POBAdDescriptor mDescriptor, @NotNull String webPageData) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(webPageData, "webPageData");
        if (mDescriptor != null) {
            str = "";
            if (mDescriptor.enableDsaInfoIcon()) {
                String encodeToUTF8 = POBDsaInfoPresenterHelperKt.encodeToUTF8(mDescriptor.getDisplayedOnBehalfOf());
                str3 = POBDsaInfoPresenterHelperKt.encodeToUTF8(mDescriptor.getPaidBy());
                List<POBDSATransparencyInfo> transparencyData = mDescriptor.getTransparencyData();
                POBLog.debug("POBDsaInfoUtil", "DSA Icon clicked: Advertiser: %s Paid By: %s Transparency: %s", encodeToUTF8, str3, transparencyData);
                str = transparencyData != null ? POBDsaInfoPresenterHelperKt.encodeToUTF8(POBDSATransparencyInfo.INSTANCE.getCombinedListOfParams(transparencyData)) : "";
                POBLog.debug("POBDsaInfoUtil", "Combined Params: %s", str);
                str2 = str;
                str = encodeToUTF8;
            } else {
                str2 = "";
                str3 = str2;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(POBCommonConstants.DSA_INFO_BASE_URL, Arrays.copyOf(new Object[]{str, str3, str2}, 3));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            final POBWebView a = INSTANCE.a(mContext, format, webPageData);
            final int hashCode = a != null ? a.hashCode() : 0;
            if (a != null) {
                POBMraidViewContainer pOBMraidViewContainer = new POBMraidViewContainer(mContext, a, false, true);
                pOBMraidViewContainer.setMraidViewContainerListener(new POBMraidViewContainerListener() { // from class: com.pubmatic.sdk.webrendering.dsa.POBDsaInfoPresenterHelper$show$1
                    @Override // com.pubmatic.sdk.webrendering.ui.POBMraidViewContainerListener
                    public void onClose() {
                        POBFullScreenActivity.closeActivity(mContext, hashCode);
                    }

                    @Override // com.pubmatic.sdk.webrendering.ui.POBMraidViewContainerListener
                    public void onForward() {
                    }
                });
                POBInstanceProvider.getAdViewCacheService().storeAdView(Integer.valueOf(hashCode), new POBAdViewCacheService.AdViewConfig(pOBMraidViewContainer, new POBFullScreenActivityListener() { // from class: com.pubmatic.sdk.webrendering.dsa.POBDsaInfoPresenterHelper$show$2
                    @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityListener
                    public void onCreate(@NotNull Activity context) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        POBWebView.this.setBaseContext(context);
                    }

                    @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityListener
                    public void onDestroy() {
                        POBWebView.this.setBaseContext(mContext);
                    }
                }));
                Intent intent = new Intent();
                intent.putExtra(POBFullScreenActivity.RENDERER_IDENTIFIER, hashCode);
                intent.putExtra(POBFullScreenActivity.IS_DSA_CONTENT, true);
                try {
                    safedk_POBFullScreenActivity_startActivity_9b43eeb3a2c956a47043e4be8e9dab59(mContext, intent);
                } catch (Exception e) {
                    POBLog.error("POBDsaInfoUtil", "Error while starting full screen activity for DSA detail screen. Error: %s", e.getMessage());
                }
            }
        }
    }
}
