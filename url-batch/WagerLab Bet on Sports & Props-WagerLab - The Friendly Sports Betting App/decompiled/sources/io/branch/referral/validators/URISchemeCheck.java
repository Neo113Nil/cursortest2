package io.branch.referral.validators;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class URISchemeCheck extends IntegrationValidatorCheck {
    JSONObject branchAppConfig;
    BranchIntegrationModel integrationModel;
    String name = "URI Scheme";
    String uriSchemeNotSetInManifestErrorMessage = "No intent found for opening the app through uri Scheme. Please add the intent with URI scheme to your Android manifest.";
    String uriSchemeNotSetInBranchDashboardErrorMessage = "Uri Scheme to open your app is not specified in Branch dashboard. Please add URI scheme in Branch dashboard.";
    String uriSchemesDoNotMatchErrorMessage = "Uri scheme specified in Branch dashboard doesn't match with the deep link intent in manifest file.";
    String moreInfoLinkApp = IntegrationValidatorConstants.uriSchemeAppMoreInfoDocsLink;
    String moreInfoLinkDashboard = IntegrationValidatorConstants.uriSchemeDashboardMoreInfoDocsLink;

    public URISchemeCheck(BranchIntegrationModel branchIntegrationModel, JSONObject jSONObject) {
        super.name = "URI Scheme";
        this.errorMessage = "";
        this.moreInfoLink = this.moreInfoLinkApp;
        this.integrationModel = branchIntegrationModel;
        this.branchAppConfig = jSONObject;
    }

    @Override // io.branch.referral.validators.IntegrationValidatorCheck
    public boolean RunTests(Context context) {
        String substring = this.branchAppConfig.optString("android_uri_scheme").substring(0, this.branchAppConfig.optString("android_uri_scheme").length() - 3);
        String checkBranchKey = checkBranchKey(this.integrationModel.deeplinkUriScheme.keys(), substring);
        boolean isEmpty = TextUtils.isEmpty(substring);
        boolean z = checkIfIntentAddedForURIScheme(this.branchAppConfig.optString("android_uri_scheme")) && this.integrationModel.appSettingsAvailable;
        boolean equals = substring.trim().equals(checkBranchKey.trim());
        if (isEmpty) {
            this.errorMessage = this.uriSchemeNotSetInBranchDashboardErrorMessage;
            this.moreInfoLink = this.moreInfoLinkDashboard;
        } else if (!z) {
            this.errorMessage = this.uriSchemeNotSetInManifestErrorMessage;
            this.moreInfoLink = this.moreInfoLinkApp;
        } else if (!equals) {
            this.errorMessage = this.uriSchemesDoNotMatchErrorMessage;
            this.moreInfoLink = this.moreInfoLinkApp;
        }
        return equals && !isEmpty && z;
    }

    private String checkBranchKey(Iterator<String> it, String str) {
        String replace = str.replace("://", "");
        while (it.hasNext()) {
            String next = it.next();
            if (replace.equals(next)) {
                return next;
            }
        }
        return "";
    }

    @Override // io.branch.referral.validators.IntegrationValidatorCheck
    public String GetOutput(Context context, boolean z) {
        return super.GetOutput(context, RunTests(context));
    }

    private boolean checkIfIntentAddedForURIScheme(String str) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        if (TextUtils.isEmpty(host)) {
            host = TtmlNode.TEXT_EMPHASIS_MARK_OPEN;
        }
        if (this.integrationModel.deeplinkUriScheme == null) {
            return false;
        }
        Iterator<String> keys = this.integrationModel.deeplinkUriScheme.keys();
        boolean z = false;
        while (keys.hasNext()) {
            String next = keys.next();
            if (scheme != null && scheme.equals(next)) {
                JSONArray optJSONArray = this.integrationModel.deeplinkUriScheme.optJSONArray(next);
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int i = 0;
                    while (true) {
                        if (i < optJSONArray.length()) {
                            if (host != null && host.equals(optJSONArray.optString(i))) {
                                z = true;
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return z;
    }
}
