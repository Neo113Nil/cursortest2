package com.google.ads.consent;

import android.R;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.Gson;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ConsentForm {
    private final boolean adFreeOption;
    private final URL appPrivacyPolicyURL;
    private final Context context;
    private final Dialog dialog;
    private final ConsentFormListener listener;
    private LoadState loadState;
    private final boolean nonPersonalizedAdsOption;
    private final boolean personalizedAdsOption;
    private final WebView webView;

    private enum LoadState {
        NOT_READY,
        LOADING,
        LOADED
    }

    private ConsentForm(Builder builder) {
        Context context = builder.context;
        this.context = context;
        if (builder.listener == null) {
            this.listener = new ConsentFormListener(this) { // from class: com.google.ads.consent.ConsentForm.1
            };
        } else {
            this.listener = builder.listener;
        }
        this.personalizedAdsOption = builder.personalizedAdsOption;
        this.nonPersonalizedAdsOption = builder.nonPersonalizedAdsOption;
        this.adFreeOption = builder.adFreeOption;
        this.appPrivacyPolicyURL = builder.appPrivacyPolicyURL;
        Dialog dialog = new Dialog(context, R.style.Theme.Translucent.NoTitleBar);
        this.dialog = dialog;
        this.loadState = LoadState.NOT_READY;
        WebView webView = new WebView(context);
        this.webView = webView;
        webView.setBackgroundColor(0);
        dialog.setContentView(webView);
        dialog.setCancelable(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() { // from class: com.google.ads.consent.ConsentForm.2
            boolean isInternalRedirect;

            private boolean isConsentFormUrl(String url) {
                return !TextUtils.isEmpty(url) && url.startsWith("consent://");
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
            
                if (r1.equals("browser") == false) goto L7;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private void handleUrl(String url) {
                if (isConsentFormUrl(url)) {
                    char c = 1;
                    this.isInternalRedirect = true;
                    Uri parse = Uri.parse(url);
                    String queryParameter = parse.getQueryParameter("action");
                    String queryParameter2 = parse.getQueryParameter(NotificationCompat.CATEGORY_STATUS);
                    String queryParameter3 = parse.getQueryParameter(ImagesContract.URL);
                    queryParameter.hashCode();
                    switch (queryParameter.hashCode()) {
                        case -1370505102:
                            if (queryParameter.equals("load_complete")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 150940456:
                            break;
                        case 1671672458:
                            if (queryParameter.equals("dismiss")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            ConsentForm.this.handleLoadComplete(queryParameter2);
                            break;
                        case 1:
                            ConsentForm.this.handleOpenBrowser(queryParameter3);
                            break;
                        case 2:
                            this.isInternalRedirect = false;
                            ConsentForm.this.handleDismiss(queryParameter2);
                            break;
                    }
                }
            }

            @Override // android.webkit.WebViewClient
            public void onLoadResource(WebView view, String url) {
                handleUrl(url);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                String uri = request.getUrl().toString();
                if (!isConsentFormUrl(uri)) {
                    return false;
                }
                handleUrl(uri);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (!isConsentFormUrl(url)) {
                    return false;
                }
                handleUrl(url);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                if (!this.isInternalRedirect) {
                    ConsentForm.this.updateDialogContent(view);
                }
                super.onPageFinished(view, url);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                ConsentForm.this.loadState = LoadState.NOT_READY;
                ConsentForm.this.listener.onConsentFormError(error.toString());
            }
        });
    }

    public static class Builder {
        private final URL appPrivacyPolicyURL;
        private final Context context;
        private ConsentFormListener listener;
        private boolean personalizedAdsOption = false;
        private boolean nonPersonalizedAdsOption = false;
        private boolean adFreeOption = false;

        public Builder(Context context, URL appPrivacyPolicyURL) {
            this.context = context;
            this.appPrivacyPolicyURL = appPrivacyPolicyURL;
            if (appPrivacyPolicyURL == null) {
                throw new IllegalArgumentException("Must provide valid app privacy policy url to create a ConsentForm");
            }
        }

        public Builder withListener(ConsentFormListener listener) {
            this.listener = listener;
            return this;
        }

        public Builder withPersonalizedAdsOption() {
            this.personalizedAdsOption = true;
            return this;
        }

        public Builder withNonPersonalizedAdsOption() {
            this.nonPersonalizedAdsOption = true;
            return this;
        }

        public Builder withAdFreeOption() {
            this.adFreeOption = true;
            return this;
        }

        public ConsentForm build() {
            return new ConsentForm(this);
        }
    }

    private static String getApplicationName(Context context) {
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    private static String getAppIconURIString(Context context) {
        Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getApplicationInfo());
        Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        applicationIcon.draw(canvas);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        return valueOf.length() != 0 ? "data:image/png;base64,".concat(valueOf) : new String("data:image/png;base64,");
    }

    private static String createJavascriptCommand(String command, String argumentsJSON) {
        HashMap hashMap = new HashMap();
        hashMap.put("info", argumentsJSON);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("args", hashMap);
        return String.format("javascript:%s(%s)", command, new Gson().toJson(hashMap2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDialogContent(WebView webView) {
        HashMap hashMap = new HashMap();
        hashMap.put("app_name", getApplicationName(this.context));
        hashMap.put("app_icon", getAppIconURIString(this.context));
        hashMap.put("offer_personalized", Boolean.valueOf(this.personalizedAdsOption));
        hashMap.put("offer_non_personalized", Boolean.valueOf(this.nonPersonalizedAdsOption));
        hashMap.put("offer_ad_free", Boolean.valueOf(this.adFreeOption));
        hashMap.put("is_request_in_eea_or_unknown", Boolean.valueOf(ConsentInformation.getInstance(this.context).isRequestLocationInEeaOrUnknown()));
        hashMap.put("app_privacy_url", this.appPrivacyPolicyURL);
        ConsentData loadConsentData = ConsentInformation.getInstance(this.context).loadConsentData();
        hashMap.put("plat", loadConsentData.getSDKPlatformString());
        hashMap.put("consent_info", loadConsentData);
        webView.loadUrl(createJavascriptCommand("setUpConsentDialog", new Gson().toJson(hashMap)));
    }

    public void load() {
        if (this.loadState == LoadState.LOADING) {
            this.listener.onConsentFormError("Cannot simultaneously load multiple consent forms.");
        } else if (this.loadState == LoadState.LOADED) {
            this.listener.onConsentFormLoaded();
        } else {
            this.loadState = LoadState.LOADING;
            this.webView.loadUrl("file:///android_asset/consentform.html");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleLoadComplete(String status) {
        if (TextUtils.isEmpty(status)) {
            this.loadState = LoadState.NOT_READY;
            this.listener.onConsentFormError("No information");
        } else if (status.contains("Error")) {
            this.loadState = LoadState.NOT_READY;
            this.listener.onConsentFormError(status);
        } else {
            this.loadState = LoadState.LOADED;
            this.listener.onConsentFormLoaded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOpenBrowser(String urlString) {
        if (TextUtils.isEmpty(urlString)) {
            this.listener.onConsentFormError("No valid URL for browser navigation.");
            return;
        }
        try {
            this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(urlString)));
        } catch (ActivityNotFoundException unused) {
            this.listener.onConsentFormError("No Activity found to handle browser intent.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleDismiss(String status) {
        boolean z;
        ConsentStatus consentStatus;
        this.loadState = LoadState.NOT_READY;
        this.dialog.dismiss();
        if (TextUtils.isEmpty(status)) {
            this.listener.onConsentFormError("No information provided.");
            return;
        }
        if (status.contains("Error")) {
            this.listener.onConsentFormError(status);
            return;
        }
        status.hashCode();
        z = true;
        switch (status) {
            case "ad_free":
                consentStatus = ConsentStatus.UNKNOWN;
                break;
            case "personalized":
                consentStatus = ConsentStatus.PERSONALIZED;
                z = false;
                break;
            case "non_personalized":
                consentStatus = ConsentStatus.NON_PERSONALIZED;
                z = false;
                break;
            default:
                consentStatus = ConsentStatus.UNKNOWN;
                z = false;
                break;
        }
        ConsentInformation.getInstance(this.context).setConsentStatus(consentStatus, "form");
        this.listener.onConsentFormClosed(consentStatus, Boolean.valueOf(z));
    }

    public void show() {
        if (this.loadState != LoadState.LOADED) {
            this.listener.onConsentFormError("Consent form is not ready to be displayed.");
            return;
        }
        if (ConsentInformation.getInstance(this.context).isTaggedForUnderAgeOfConsent()) {
            this.listener.onConsentFormError("Error: tagged for under age of consent");
            return;
        }
        this.dialog.getWindow().setLayout(-1, -1);
        this.dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.google.ads.consent.ConsentForm.3
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialog) {
                ConsentForm.this.listener.onConsentFormOpened();
            }
        });
        this.dialog.show();
        if (this.dialog.isShowing()) {
            return;
        }
        this.listener.onConsentFormError("Consent form could not be displayed.");
    }

    public boolean isShowing() {
        return this.dialog.isShowing();
    }
}
