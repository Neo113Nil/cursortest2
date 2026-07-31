package org.chromium.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import internal.org.chromium.build.BuildConfig;
import internal.org.chromium.build.NullUtil;
import internal.org.jni_zero.CalledByNative;
import org.chromium.base.version_info.VersionInfo;

/* loaded from: classes11.dex */
public final class ApkInfo {
    private static final Object CREATION_LOCK = new Object();
    private static PackageInfo sBrowserPackageInfo;
    private static String sHostSigningCertSha256;
    private static boolean sInitialized;
    private static volatile ApkInfo sInstance;
    private final ApplicationInfo mBrowserApplicationInfo;
    private final IApkInfo mIApkInfo;

    interface Natives {
        void fillFields(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, int i);
    }

    @CalledByNative
    private static void nativeReadyForFields() {
        sendToNative(getInstance().mIApkInfo);
    }

    public static void sendToNative(IApkInfo iApkInfo) {
        ApkInfoJni.get().fillFields(iApkInfo.hostPackageName, iApkInfo.hostVersionCode, iApkInfo.hostPackageLabel, iApkInfo.packageVersionCode, iApkInfo.packageVersionName, iApkInfo.packageName, iApkInfo.resourcesVersion, iApkInfo.installerPackageName, iApkInfo.isDebugApp, iApkInfo.targetSdkVersion);
    }

    public static String getHostPackageName() {
        return getInstance().mIApkInfo.hostPackageName;
    }

    public static ApkInfo getInstance() {
        if (BuildConfig.IS_FOR_TEST) {
            return new ApkInfo();
        }
        if (sInstance == null) {
            synchronized (CREATION_LOCK) {
                try {
                    if (sInstance == null) {
                        sInstance = new ApkInfo();
                    }
                } finally {
                }
            }
        }
        return sInstance;
    }

    private static String nullToEmpty(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    private ApkInfo() {
        Long l;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String[] packagesForUid;
        String str7;
        sInitialized = true;
        IApkInfo iApkInfo = new IApkInfo();
        this.mIApkInfo = iApkInfo;
        Context applicationContext = ContextUtils.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        PackageManager packageManager = applicationContext.getPackageManager();
        iApkInfo.packageVersionCode = String.valueOf(BuildConfig.VERSION_CODE);
        if (CommandLine.isInitialized()) {
            CommandLine commandLine = CommandLine.getInstance();
            str = commandLine.getSwitchValue("host-package-name");
            str2 = commandLine.getSwitchValue("host-package-label");
            str3 = commandLine.getSwitchValue("package-name");
            str4 = commandLine.getSwitchValue("package-version-name");
            String switchValue = commandLine.getSwitchValue("host-version-code");
            l = switchValue != null ? Long.valueOf(Long.parseLong(switchValue)) : null;
        } else {
            l = null;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        boolean z = (str == null || str2 == null || l == null || str3 == null || str4 == null) ? false : true;
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        iApkInfo.isDebugApp = (applicationInfo.flags & 2) != 0;
        if (z) {
            iApkInfo.hostPackageName = (String) NullUtil.assumeNonNull(str);
            iApkInfo.hostPackageLabel = (String) NullUtil.assumeNonNull(str2);
            iApkInfo.hostVersionCode = String.valueOf(NullUtil.assumeNonNull(l));
            iApkInfo.packageVersionName = (String) NullUtil.assumeNonNull(str4);
            iApkInfo.packageName = (String) NullUtil.assumeNonNull(str3);
        } else {
            if (!ContextUtils.isSdkSandboxProcess() || (packagesForUid = packageManager.getPackagesForUid(Process.myUid() - 10000)) == null || packagesForUid.length <= 0) {
                str5 = packageName;
                str6 = str5;
            } else {
                str5 = packagesForUid[0];
                str6 = packageName + ":" + str5;
            }
            iApkInfo.hostPackageName = str6;
            iApkInfo.hostPackageLabel = nullToEmpty(packageManager.getApplicationLabel(applicationInfo));
            if (sBrowserPackageInfo != null) {
                iApkInfo.hostVersionCode = String.valueOf(PackageUtils.packageVersionCode((PackageInfo) NullUtil.assumeNonNull(PackageUtils.getPackageInfo(str5, 0))));
                PackageInfo packageInfo = sBrowserPackageInfo;
                iApkInfo.packageName = packageInfo.packageName;
                iApkInfo.packageVersionName = nullToEmpty(packageInfo.versionName);
                applicationInfo = sBrowserPackageInfo.applicationInfo;
                sBrowserPackageInfo = null;
            } else {
                iApkInfo.packageName = packageName;
                iApkInfo.hostVersionCode = String.valueOf(BuildConfig.VERSION_CODE);
                iApkInfo.packageVersionName = VersionInfo.getProductVersion();
            }
            packageName = str5;
        }
        this.mBrowserApplicationInfo = applicationInfo;
        iApkInfo.installerPackageName = nullToEmpty(packageManager.getInstallerPackageName(packageName));
        if (BuildConfig.R_STRING_PRODUCT_VERSION == 0) {
            str7 = "Not Enabled";
        } else {
            try {
                str7 = ContextUtils.getApplicationContext().getString(BuildConfig.R_STRING_PRODUCT_VERSION);
            } catch (Exception unused) {
                str7 = "Not found";
            }
        }
        IApkInfo iApkInfo2 = this.mIApkInfo;
        iApkInfo2.resourcesVersion = str7;
        iApkInfo2.targetSdkVersion = applicationInfo.targetSdkVersion;
    }

    @CalledByNative
    public static String getHostSigningCertSha256() {
        String str;
        synchronized (CREATION_LOCK) {
            try {
                str = sHostSigningCertSha256;
                if (str == null) {
                    str = PackageUtils.computeCertSignatureSha256ForPackage(getHostPackageName());
                    if (str == null) {
                        str = "";
                    }
                    sHostSigningCertSha256 = str;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
