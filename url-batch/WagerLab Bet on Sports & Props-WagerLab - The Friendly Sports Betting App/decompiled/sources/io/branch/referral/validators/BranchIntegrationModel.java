package io.branch.referral.validators;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import io.branch.referral.BranchAsyncTask;
import io.branch.referral.BranchLogger;
import io.branch.referral.BranchUtil;
import io.branch.referral.Defines;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class BranchIntegrationModel {
    boolean appSettingsAvailable = false;
    final List<String> applinkScheme = new ArrayList();
    private final String branchKeyLive;
    private final String branchKeyTest;
    JSONObject deeplinkUriScheme;
    final String packageName;

    public BranchIntegrationModel(Context context) {
        String str;
        String str2;
        ApplicationInfo applicationInfo;
        this.packageName = context.getPackageName();
        String str3 = null;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            str = null;
        }
        if (applicationInfo.metaData != null) {
            str = applicationInfo.metaData.getString("io.branch.sdk.BranchKey");
            try {
                str3 = applicationInfo.metaData.getString("io.branch.sdk.BranchKey.test");
            } catch (PackageManager.NameNotFoundException e2) {
                e = e2;
                e.printStackTrace();
                str2 = str3;
                str3 = str;
                this.branchKeyLive = str3;
                this.branchKeyTest = str2;
                updateDeepLinkSchemes(context);
            }
            str2 = str3;
            str3 = str;
            this.branchKeyLive = str3;
            this.branchKeyTest = str2;
            updateDeepLinkSchemes(context);
        }
        str2 = null;
        this.branchKeyLive = str3;
        this.branchKeyTest = str2;
        updateDeepLinkSchemes(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateDeepLinkSchemes(Context context) {
        Exception e;
        JSONObject jSONObject;
        try {
            jSONObject = new getDeepLinkSchemeTasks().executeTask(context).get(2500L, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e = e2;
            jSONObject = null;
        }
        try {
            this.appSettingsAvailable = true;
        } catch (Exception e3) {
            e = e3;
            BranchLogger.d(e.getMessage());
            if (jSONObject == null) {
            }
        }
        if (jSONObject == null) {
            this.deeplinkUriScheme = jSONObject.optJSONObject(Defines.Jsonkey.URIScheme.getKey());
            JSONArray optJSONArray = jSONObject.optJSONArray(Defines.Jsonkey.AppLinks.getKey());
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.applinkScheme.add(optJSONArray.optString(i));
                }
            }
        }
    }

    private class getDeepLinkSchemeTasks extends BranchAsyncTask<Context, Void, JSONObject> {
        private getDeepLinkSchemeTasks() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public JSONObject doInBackground(Context... contextArr) {
            return BranchUtil.getDeepLinkSchemes(contextArr[0]);
        }
    }
}
