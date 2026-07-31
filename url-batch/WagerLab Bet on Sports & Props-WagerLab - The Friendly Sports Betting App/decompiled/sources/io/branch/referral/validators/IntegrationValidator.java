package io.branch.referral.validators;

import android.content.Context;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import io.branch.interfaces.IBranchLoggingCallbacks;
import io.branch.referral.Branch;
import io.branch.referral.validators.ServerRequestGetAppConfig;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class IntegrationValidator implements ServerRequestGetAppConfig.IGetAppConfigEvents {
    private static IntegrationValidator instance;
    Context context;
    private final BranchIntegrationModel integrationModel;
    IntegrationValidatorDialog integrationValidatorDialog;
    private final String TAG = "BranchSDK_Doctor";
    boolean hasRan = false;
    boolean hasTestFailed = false;
    private final StringBuilder branchLogsStringBuilder = new StringBuilder();

    private IntegrationValidator(Context context) {
        this.integrationModel = new BranchIntegrationModel(context);
        this.context = context;
    }

    public static void validate(Context context) {
        if (instance == null) {
            instance = new IntegrationValidator(context);
        }
        Branch.enableLogging(new IBranchLoggingCallbacks() { // from class: io.branch.referral.validators.IntegrationValidator.1
            @Override // io.branch.interfaces.IBranchLoggingCallbacks
            public void onBranchLog(String str, String str2) {
                IntegrationValidator.instance.branchLogsStringBuilder.append(str);
            }
        });
        instance.validateSDKIntegration(context);
        instance.integrationValidatorDialog = new IntegrationValidatorDialog(context);
    }

    public static String getLogs() {
        return instance.branchLogsStringBuilder.toString();
    }

    private void validateSDKIntegration(Context context) {
        Branch.getInstance().requestQueue_.handleNewRequest(new ServerRequestGetAppConfig(context, this));
    }

    private void doValidateWithAppConfig(JSONObject jSONObject) {
        Branch.getInstance().requestQueue_.handleNewRequest(new ServerRequestGetAppConfig(this.context, this));
        logValidationProgress("\n\n------------------- Initiating Branch integration verification ---------------------------");
        BranchInstanceCreationValidatorCheck branchInstanceCreationValidatorCheck = new BranchInstanceCreationValidatorCheck();
        boolean RunTests = branchInstanceCreationValidatorCheck.RunTests(this.context);
        this.integrationValidatorDialog.SetTestResultForRowItem(1, branchInstanceCreationValidatorCheck.GetTestName(), RunTests, branchInstanceCreationValidatorCheck.GetOutput(this.context, RunTests), branchInstanceCreationValidatorCheck.GetMoreInfoLink());
        logOutputForTest(RunTests, "1. Verifying Branch instance creation", "Branch is not initialised from your Application class. Please add `Branch.getAutoInstance(this);` to your Application#onCreate() method.", "https://help.branch.io/developers-hub/docs/android-basic-integration#section-load-branch");
        BranchKeysValidatorCheck branchKeysValidatorCheck = new BranchKeysValidatorCheck();
        boolean RunTests2 = branchKeysValidatorCheck.RunTests(this.context);
        this.integrationValidatorDialog.SetTestResultForRowItem(2, branchKeysValidatorCheck.GetTestName(), RunTests2, branchKeysValidatorCheck.GetOutput(this.context, RunTests2), branchKeysValidatorCheck.GetMoreInfoLink());
        logOutputForTest(RunTests2, "2. Checking Branch keys", "Unable to read Branch keys from your application. Did you forget to add Branch keys in your application?.", "https://help.branch.io/developers-hub/docs/android-basic-integration#section-configure-app");
        PackageNameCheck packageNameCheck = new PackageNameCheck(this.integrationModel, jSONObject);
        boolean RunTests3 = packageNameCheck.RunTests(this.context);
        this.integrationValidatorDialog.SetTestResultForRowItem(3, packageNameCheck.GetTestName(), RunTests3, packageNameCheck.GetOutput(this.context, RunTests3), packageNameCheck.GetMoreInfoLink());
        logOutputForTest(RunTests3, "3. Verifying application package name", packageNameCheck.errorMessage, "https://help.branch.io/developers-hub/docs/android-basic-integration#section-configure-branch-dashboard");
        URISchemeCheck uRISchemeCheck = new URISchemeCheck(this.integrationModel, jSONObject);
        boolean RunTests4 = uRISchemeCheck.RunTests(this.context);
        this.integrationValidatorDialog.SetTestResultForRowItem(4, uRISchemeCheck.GetTestName(), RunTests4, uRISchemeCheck.GetOutput(this.context, RunTests4), uRISchemeCheck.GetMoreInfoLink());
        logOutputForTest(RunTests4, "4. Checking Android Manifest for URI based deep link config", uRISchemeCheck.errorMessage, "https://help.branch.io/developers-hub/docs/android-basic-integration#section-configure-app");
        AppLinksCheck appLinksCheck = new AppLinksCheck(this.integrationModel, jSONObject);
        boolean RunTests5 = appLinksCheck.RunTests(this.context);
        this.integrationValidatorDialog.SetTestResultForRowItem(5, appLinksCheck.GetTestName(), RunTests5, appLinksCheck.GetOutput(this.context, RunTests5), appLinksCheck.GetMoreInfoLink());
        logOutputForTest(RunTests5, "5. Checking AndroidManifest for AppLink config.", "Could not find any App Link hosts to support Android AppLinks. Please add intent filter for handling AppLinks in your Android Manifest file", "https://help.branch.io/using-branch/docs/android-app-links#section-add-intent-filter-to-manifest");
        CustomDomainCheck customDomainCheck = new CustomDomainCheck(this.integrationModel, jSONObject);
        boolean RunTests6 = customDomainCheck.RunTests(this.context);
        this.integrationValidatorDialog.SetTestResultForRowItem(6, customDomainCheck.GetTestName(), RunTests6, customDomainCheck.GetOutput(this.context, RunTests6), customDomainCheck.GetMoreInfoLink());
        logOutputForTest(RunTests6, "6. Verifying any supported custom link domains.", String.format("Could not find intent filter to support custom link domain '%s'. Please add intent filter for handling custom link domain in your Android Manifest file ", jSONObject.optString("short_url_domain")), "https://help.branch.io/developers-hub/docs/android-basic-integration#section-configure-app");
        DefaultDomainsCheck defaultDomainsCheck = new DefaultDomainsCheck(this.integrationModel, jSONObject);
        boolean RunTests7 = defaultDomainsCheck.RunTests(this.context);
        this.integrationValidatorDialog.SetTestResultForRowItem(7, defaultDomainsCheck.GetTestName(), RunTests7, defaultDomainsCheck.GetOutput(this.context, RunTests7), defaultDomainsCheck.GetMoreInfoLink());
        logOutputForTest(RunTests7, "7. Verifying default link domains integrations.", String.format("Could not find intent filter to support Branch default link domain '%s'. Please add intent filter for handling custom link domain in your Android Manifest file ", jSONObject.optString("default_short_url_domain")), "https://help.branch.io/developers-hub/docs/android-basic-integration#section-configure-app");
        AlternateDomainsCheck alternateDomainsCheck = new AlternateDomainsCheck(this.integrationModel, jSONObject);
        boolean RunTests8 = alternateDomainsCheck.RunTests(this.context);
        this.integrationValidatorDialog.SetTestResultForRowItem(8, alternateDomainsCheck.GetTestName(), RunTests8, alternateDomainsCheck.GetOutput(this.context, RunTests8), alternateDomainsCheck.GetMoreInfoLink());
        logOutputForTest(RunTests8, "8. Verifying alternate link domains integrations.", String.format("Could not find intent filter to support alternate link domain '%s'. Please add intent filter for handling custom link domain in your Android Manifest file ", jSONObject.optString("alternate_short_url_domain")), "https://help.branch.io/developers-hub/docs/android-basic-integration#section-configure-app");
        finishTestingOutput();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(((Window) Objects.requireNonNull(instance.integrationValidatorDialog.getWindow())).getAttributes());
        layoutParams.width = -1;
        layoutParams.height = 1500;
        instance.integrationValidatorDialog.show();
        instance.integrationValidatorDialog.getWindow().setAttributes(layoutParams);
    }

    @Override // io.branch.referral.validators.ServerRequestGetAppConfig.IGetAppConfigEvents
    public void onAppConfigAvailable(JSONObject jSONObject) {
        if (jSONObject != null && !this.hasRan) {
            this.hasRan = true;
            doValidateWithAppConfig(jSONObject);
        } else if (jSONObject == null) {
            logIntegrationError("Unable to read Dashboard config. Please confirm that your Branch key is properly added to the manifest. Please fix your Dashboard settings.", "https://branch.app.link/link-settings-page");
        }
    }

    private void logIntegrationError(String str, String str2) {
        Log.d("BranchSDK_Doctor", "** ERROR ** : " + str + "\nPlease follow the link for more info " + str2);
    }

    private void logValidationProgress(String str) {
        Log.d("BranchSDK_Doctor", str + " ... ");
    }

    private void logValidationPassed() {
        Log.d("BranchSDK_Doctor", "Passed");
    }

    private void logOutputForTest(boolean z, String str, String str2, String str3) {
        logValidationProgress(str);
        if (z) {
            logValidationPassed();
        } else {
            logIntegrationError(str2, str3);
            this.hasTestFailed = true;
        }
    }

    private void finishTestingOutput() {
        if (!this.hasTestFailed) {
            Log.d("BranchSDK_Doctor", "--------------------------------------------\nSuccessfully completed Branch integration validation. Everything looks good!");
            Log.d("BranchSDK_Doctor", "\n         Great! Comment out the 'validateSDKIntegration' line in your app. Next check your deep link routing.\n         Append '?bnc_validate=true' to any of your app's Branch links and click it on your mobile device (not the Simulator!) to start the test.\n         For instance, to validate a link like:\n         https://<yourapp>.app.link/NdJ6nFzRbK\n         click on:\n         https://<yourapp>.app.link/NdJ6nFzRbK?bnc_validate=true");
        } else {
            Log.d("BranchSDK_Doctor", "--------------------------------------------\nCompleted Branch integration validation. Almost there! Please correct the issues identified for your Branch SDK implementation.");
        }
    }
}
