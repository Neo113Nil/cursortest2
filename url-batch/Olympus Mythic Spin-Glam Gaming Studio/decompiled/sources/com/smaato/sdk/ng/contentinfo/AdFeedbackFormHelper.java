package com.smaato.sdk.ng.contentinfo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.NextGenError;
import com.smaato.sdk.ng.NextGenErrorCode;
import com.smaato.sdk.ng.contentinfo.listeners.AdFeedbackLoadListener;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.utils.Logger;

/* loaded from: classes3.dex */
public class AdFeedbackFormHelper extends ResultReceiver {
    private static final String b = "AdFeedbackFormHelper";
    private AdFeedbackLoadListener a;

    enum a {
        OPEN(1),
        ERROR(-1),
        CLOSE(0);

        final int a;

        a(int i) {
            this.a = i;
        }
    }

    public AdFeedbackFormHelper() {
        super(null);
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null || !TextUtils.isEmpty(parse.getQueryParameter("apptoken"))) {
                return null;
            }
            return parse.buildUpon().appendQueryParameter("apptoken", "token_macro").build().toString().replace("token_macro", "[APPTOKEN]");
        } catch (RuntimeException e) {
            Logger.e(b, e.getMessage());
            NextGen.reportException((Exception) e);
            return null;
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.v);
        p0.startActivity(p1);
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        a(i, bundle);
    }

    public void showFeedbackForm(Context context, String str, Ad ad, String str2, IntegrationType integrationType) {
        showFeedbackForm(context, str, ad, str2, integrationType, null);
    }

    public synchronized void showFeedbackForm(Context context, String str, Ad ad, String str2, IntegrationType integrationType, AdFeedbackLoadListener adFeedbackLoadListener) {
        this.a = adFeedbackLoadListener;
        String a2 = a(str);
        if (a2 == null) {
            AdFeedbackLoadListener adFeedbackLoadListener2 = this.a;
            if (adFeedbackLoadListener2 != null) {
                adFeedbackLoadListener2.onLoadFailed(new NextGenError(NextGenErrorCode.ERROR_LOADING_FEEDBACK));
            }
        } else {
            AdFeedbackData collectData = new AdFeedbackDataCollector(integrationType).collectData(ad, str2, integrationType);
            String processUrl = new FeedbackMacros().processUrl(a2, collectData);
            try {
                Intent intent = new Intent(context, (Class<?>) AdFeedbackActivity.class);
                intent.addFlags(268435456);
                intent.putExtra("extra_feedback_form_url", processUrl);
                intent.putExtra("extra_feedback_form_callback", this);
                intent.putExtra("extra_feedback_form_data", collectData);
                intent.addFlags(65536);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            } catch (Exception unused) {
                AdFeedbackLoadListener adFeedbackLoadListener3 = this.a;
                if (adFeedbackLoadListener3 != null) {
                    adFeedbackLoadListener3.onLoadFailed(new NextGenError(NextGenErrorCode.ERROR_LOADING_FEEDBACK, "The feedback form requires an Activity context"));
                }
            }
        }
    }

    private void a(int i, Bundle bundle) {
        AdFeedbackLoadListener adFeedbackLoadListener;
        if (i == a.OPEN.a) {
            AdFeedbackLoadListener adFeedbackLoadListener2 = this.a;
            if (adFeedbackLoadListener2 != null) {
                adFeedbackLoadListener2.onLoad("");
                return;
            }
            return;
        }
        if (i == a.CLOSE.a) {
            AdFeedbackLoadListener adFeedbackLoadListener3 = this.a;
            if (adFeedbackLoadListener3 != null) {
                adFeedbackLoadListener3.onFormClosed();
                return;
            }
            return;
        }
        if (i != a.ERROR.a || (adFeedbackLoadListener = this.a) == null) {
            return;
        }
        adFeedbackLoadListener.onLoadFailed(new NextGenError(NextGenErrorCode.ERROR_LOADING_FEEDBACK));
    }
}
