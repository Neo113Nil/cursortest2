package io.branch.referral;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.branch.referral.BranchJsonConfig;
import io.branch.referral.Defines;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.jar.JarFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class BranchUtil {
    private static final String BRANCH_KEY_LIVE = "io.branch.sdk.BranchKey";
    private static final String BRANCH_KEY_TEST = "io.branch.sdk.BranchKey.test";
    private static final String SOURCE_BRANCH_JSON = "branch_json";
    private static final String SOURCE_MANIFEST = "manifest";
    private static final String SOURCE_MANIFEST_TEST_FALLBACK = "manifest_test_fallback";
    private static final String SOURCE_STRINGS = "strings";
    private static boolean isTestModeEnabled_ = false;
    private static Boolean testModeEnabledViaCompileTimeConfiguration;

    static void shutDown() {
        isTestModeEnabled_ = false;
        testModeEnabledViaCompileTimeConfiguration = null;
    }

    static boolean checkTestMode(Context context) {
        if (!isTestModeEnabled_ && testModeEnabledViaCompileTimeConfiguration == null) {
            BranchJsonConfig branchJsonConfig = BranchJsonConfig.getInstance(context);
            if (branchJsonConfig.isValid(BranchJsonConfig.BranchJsonKey.useTestInstance)) {
                Boolean useTestInstance = branchJsonConfig.getUseTestInstance();
                isTestModeEnabled_ = useTestInstance != null ? useTestInstance.booleanValue() : false;
            } else {
                isTestModeEnabled_ = readTestMode(context);
            }
            testModeEnabledViaCompileTimeConfiguration = Boolean.valueOf(isTestModeEnabled_);
        }
        return isTestModeEnabled_;
    }

    private static boolean readTestMode(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData != null && applicationInfo.metaData.containsKey("io.branch.sdk.TestMode")) {
                return applicationInfo.metaData.getBoolean("io.branch.sdk.TestMode", false);
            }
            Resources resources = context.getResources();
            return Boolean.parseBoolean(resources.getString(resources.getIdentifier("io.branch.sdk.TestMode", TypedValues.Custom.S_STRING, context.getPackageName())));
        } catch (Exception unused) {
            return isTestModeEnabled_;
        }
    }

    public static String readBranchKey(Context context) {
        BranchLogger.v("Reading branch key from available sources...");
        BranchLogger.v("Attempting to read branch key from branch.json configuration...");
        String readBranchKeyFromJson = readBranchKeyFromJson(context);
        if (readBranchKeyFromJson != null) {
            BranchLogger.v("Successfully read branch key from branch.json configuration");
            setBranchKeyAndSource(context, readBranchKeyFromJson, SOURCE_BRANCH_JSON);
            return readBranchKeyFromJson;
        }
        BranchLogger.v("Branch key not found in branch.json, falling back to manifest...");
        BranchLogger.v("Attempting to read branch key from manifest meta-data...");
        String readBranchKeyFromManifest = readBranchKeyFromManifest(context);
        if (readBranchKeyFromManifest != null) {
            BranchLogger.v("Successfully read branch key from manifest meta-data");
            return readBranchKeyFromManifest;
        }
        BranchLogger.v("Branch key not found in manifest, falling back to string resources...");
        BranchLogger.v("Attempting to read branch key from string resources...");
        String readBranchKeyFromStringResources = readBranchKeyFromStringResources(context);
        if (readBranchKeyFromStringResources != null) {
            BranchLogger.v("Successfully read branch key from string resources");
            return readBranchKeyFromStringResources;
        }
        BranchLogger.w("Branch key not found in any source (branch.json, manifest, or string resources)");
        return readBranchKeyFromStringResources;
    }

    private static String readBranchKeyFromJson(Context context) {
        BranchJsonConfig branchJsonConfig = BranchJsonConfig.getInstance(context);
        String branchKey = branchJsonConfig.isValid() ? branchJsonConfig.getBranchKey() : null;
        if (branchKey != null) {
            BranchLogger.v("Found branch key in branch.json: " + (branchKey.length() > 10 ? branchKey.substring(0, 10) + "..." : branchKey));
            return branchKey;
        }
        BranchLogger.v("branch.json configuration not valid or branch key not present");
        return branchKey;
    }

    private static String readBranchKeyFromManifest(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                BranchLogger.v("No meta-data found in manifest");
                return null;
            }
            return readBranchKeyFromMetaData(context, applicationInfo);
        } catch (PackageManager.NameNotFoundException e) {
            BranchLogger.d("Error reading manifest: " + e.getMessage());
            return null;
        }
    }

    private static String readBranchKeyFromMetaData(Context context, ApplicationInfo applicationInfo) {
        String str = isTestModeEnabled() ? BRANCH_KEY_TEST : BRANCH_KEY_LIVE;
        BranchLogger.v("Looking for branch key in manifest with key: " + str + " (test mode: " + isTestModeEnabled() + ")");
        String string = applicationInfo.metaData.getString(str);
        if (string != null) {
            BranchLogger.v("Found branch key in manifest meta-data: " + (string.length() > 10 ? string.substring(0, 10) + "..." : string));
            setBranchKeyAndSource(context, string, SOURCE_MANIFEST);
            return string;
        }
        return handleTestModeFallback(context, applicationInfo);
    }

    private static String handleTestModeFallback(Context context, ApplicationInfo applicationInfo) {
        if (!isTestModeEnabled()) {
            BranchLogger.v("Branch key not found for live mode in manifest");
            return null;
        }
        BranchLogger.v("Test mode enabled but test key not found, attempting fallback to live key...");
        String string = applicationInfo.metaData.getString(BRANCH_KEY_LIVE);
        if (string != null) {
            BranchLogger.v("Found live branch key for test mode fallback: " + (string.length() > 10 ? string.substring(0, 10) + "..." : string));
            setBranchKeyAndSource(context, string, SOURCE_MANIFEST_TEST_FALLBACK);
            return string;
        }
        BranchLogger.v("No live key found for test mode fallback");
        return string;
    }

    private static String readBranchKeyFromStringResources(Context context) {
        String str = isTestModeEnabled() ? BRANCH_KEY_TEST : BRANCH_KEY_LIVE;
        BranchLogger.v("Looking for branch key in string resources with key: " + str + " (test mode: " + isTestModeEnabled() + ")");
        try {
            Resources resources = context.getResources();
            String string = resources.getString(resources.getIdentifier(str, TypedValues.Custom.S_STRING, context.getPackageName()));
            if (!TextUtils.isEmpty(string)) {
                BranchLogger.v("Found branch key in string resources: " + (string.length() > 10 ? string.substring(0, 10) + "..." : string));
                setBranchKeyAndSource(context, string, SOURCE_STRINGS);
                return string;
            }
            BranchLogger.v("Branch key string resource is empty");
            return string;
        } catch (Resources.NotFoundException unused) {
            BranchLogger.v("Branch key string resource not found: ".concat(str));
            return null;
        }
    }

    private static void setBranchKeyAndSource(Context context, String str, String str2) {
        PrefHelper prefHelper = PrefHelper.getInstance(context);
        prefHelper.setBranchKey(str);
        prefHelper.setBranchKeySource(str2);
    }

    public static boolean getEnableLoggingConfig(Context context) {
        BranchJsonConfig branchJsonConfig = BranchJsonConfig.getInstance(context);
        if (branchJsonConfig.isValid()) {
            return Boolean.TRUE.equals(branchJsonConfig.getEnableLogging());
        }
        return false;
    }

    public static boolean getDeferInitForPluginRuntimeConfig(Context context) {
        BranchJsonConfig branchJsonConfig = BranchJsonConfig.getInstance(context);
        if (branchJsonConfig.isValid()) {
            return Boolean.TRUE.equals(branchJsonConfig.getDeferInitForPluginRuntime());
        }
        return false;
    }

    public static void setAPIBaseUrlFromConfig(Context context) {
        String aPIUrl = BranchJsonConfig.getInstance(context).getAPIUrl();
        if (TextUtils.isEmpty(aPIUrl)) {
            return;
        }
        Branch.setAPIUrl(aPIUrl);
    }

    public static void setFbAppIdFromConfig(Context context) {
        String fbAppId = BranchJsonConfig.getInstance(context).getFbAppId();
        if (TextUtils.isEmpty(fbAppId)) {
            return;
        }
        Branch.setFBAppID(fbAppId);
    }

    public static void setCPPLevelFromConfig(Context context) {
        String consumerProtectionAttributionLevel = BranchJsonConfig.getInstance(context).getConsumerProtectionAttributionLevel();
        if (TextUtils.isEmpty(consumerProtectionAttributionLevel)) {
            return;
        }
        Branch.getInstance().setConsumerProtectionAttributionLevel(Defines.BranchAttributionLevel.valueOf(consumerProtectionAttributionLevel));
    }

    public static boolean isTestModeEnabled() {
        return isTestModeEnabled_;
    }

    static void setTestMode(boolean z) {
        isTestModeEnabled_ = z;
    }

    public static String decodeResourceId(Context context, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return context.getResources().getString(i);
        } catch (Exception e) {
            BranchLogger.d(e.getMessage());
            return null;
        }
    }

    public static class JsonReader {
        private final JSONObject jsonObject;

        public JsonReader(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2 = new JSONObject(jSONObject.toString());
            } catch (JSONException e) {
                BranchLogger.d(e.getMessage());
            }
            this.jsonObject = jSONObject2;
        }

        public JSONObject getJsonObject() {
            return this.jsonObject;
        }

        public int readOutInt(String str) {
            int optInt = this.jsonObject.optInt(str);
            this.jsonObject.remove(str);
            return optInt;
        }

        public Integer readOutInt(String str, Integer num) {
            if (!this.jsonObject.has(str)) {
                return num;
            }
            Integer valueOf = Integer.valueOf(this.jsonObject.optInt(str));
            this.jsonObject.remove(str);
            return valueOf;
        }

        public String readOutString(String str) {
            String optString = this.jsonObject.optString(str);
            this.jsonObject.remove(str);
            return optString;
        }

        public String readOutString(String str, String str2) {
            String optString = this.jsonObject.optString(str, str2);
            this.jsonObject.remove(str);
            return optString;
        }

        public long readOutLong(String str) {
            long optLong = this.jsonObject.optLong(str);
            this.jsonObject.remove(str);
            return optLong;
        }

        public double readOutDouble(String str) {
            double optDouble = this.jsonObject.optDouble(str);
            this.jsonObject.remove(str);
            return optDouble;
        }

        public Double readOutDouble(String str, Double d) {
            if (!this.jsonObject.has(str)) {
                return d;
            }
            Double valueOf = Double.valueOf(this.jsonObject.optDouble(str));
            this.jsonObject.remove(str);
            return valueOf;
        }

        public boolean readOutBoolean(String str) {
            boolean optBoolean = this.jsonObject.optBoolean(str);
            this.jsonObject.remove(str);
            return optBoolean;
        }

        public JSONArray readOutJsonArray(String str) {
            JSONArray optJSONArray = this.jsonObject.optJSONArray(str);
            this.jsonObject.remove(str);
            return optJSONArray;
        }

        public Object readOut(String str) {
            Object opt = this.jsonObject.opt(str);
            this.jsonObject.remove(str);
            return opt;
        }

        public boolean has(String str) {
            return this.jsonObject.has(str);
        }

        public Iterator<String> keys() {
            return this.jsonObject.keys();
        }
    }

    public static Drawable getDrawable(Context context, int i) {
        return context.getResources().getDrawable(i, context.getTheme());
    }

    public static int dpToPx(Context context, int i) {
        return Math.round(i * (context.getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    public static boolean isLowOnMemory(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076 A[Catch: IOException -> 0x0072, TRY_LEAVE, TryCatch #3 {IOException -> 0x0072, blocks: (B:34:0x006e, B:27:0x0076), top: B:33:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject getDeepLinkSchemes(Context context) {
        JarFile jarFile;
        InputStream inputStream;
        JSONObject jSONObject = null;
        jSONObject = null;
        jSONObject = null;
        r1 = null;
        InputStream inputStream2 = null;
        jSONObject = null;
        try {
            if (!isLowOnMemory(context)) {
                try {
                    jarFile = new JarFile(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).publicSourceDir);
                    try {
                        inputStream = jarFile.getInputStream(jarFile.getEntry("AndroidManifest.xml"));
                        try {
                            try {
                                byte[] bArr = new byte[inputStream.available()];
                                inputStream.read(bArr);
                                jSONObject = new ApkParser().decompressXMLForValidator(bArr, context);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                jarFile.close();
                            } catch (Exception e) {
                                e = e;
                                BranchLogger.d(e.getMessage());
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (jarFile != null) {
                                    jarFile.close();
                                }
                                return jSONObject;
                            }
                        } catch (Throwable th) {
                            th = th;
                            inputStream2 = inputStream;
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (IOException e2) {
                                    BranchLogger.d(e2.getMessage());
                                    throw th;
                                }
                            }
                            if (jarFile != null) {
                                jarFile.close();
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        inputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStream2 != null) {
                        }
                        if (jarFile != null) {
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    jarFile = null;
                    inputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    jarFile = null;
                }
            }
        } catch (IOException e5) {
            BranchLogger.d(e5.getMessage());
        }
        return jSONObject;
    }
}
