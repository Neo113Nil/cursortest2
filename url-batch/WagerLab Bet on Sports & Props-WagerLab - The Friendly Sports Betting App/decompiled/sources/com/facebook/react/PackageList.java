package com.facebook.react;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.airbnb.android.react.lottie.LottiePackage;
import com.autoskeleton.AutoSkeletonViewPackage;
import com.facebook.react.shell.MainPackageConfig;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.reactnative.androidsdk.FBSDKPackage;
import com.horcrux.svg.SvgPackage;
import com.intercom.reactnative.IntercomPackage;
import com.reactcommunity.rndatetimepicker.RNDateTimePickerPackage;
import com.reactnativecommunity.webview.RNCWebViewPackage;
import com.reactnativegooglesignin.RNGoogleSigninPackage;
import com.reactnativekeyboardcontroller.KeyboardControllerPackage;
import com.reactnativepagerview.PagerViewPackage;
import com.revenuecat.purchases.react.RNPurchasesPackage;
import com.swmansion.gesturehandler.RNGestureHandlerPackage;
import com.swmansion.reanimated.ReanimatedPackage;
import com.swmansion.rnscreens.RNScreensPackage;
import com.swmansion.worklets.WorkletsPackage;
import com.th3rdwave.safeareacontext.SafeAreaContextPackage;
import expo.modules.ExpoModulesPackage;
import io.branch.rnbranch.RNBranchPackage;
import io.invertase.firebase.analytics.ReactNativeFirebaseAnalyticsPackage;
import io.invertase.firebase.app.ReactNativeFirebaseAppPackage;
import io.invertase.firebase.appcheck.ReactNativeFirebaseAppCheckPackage;
import io.invertase.firebase.auth.ReactNativeFirebaseAuthPackage;
import io.invertase.firebase.config.ReactNativeFirebaseConfigPackage;
import io.invertase.firebase.crashlytics.ReactNativeFirebaseCrashlyticsPackage;
import io.invertase.firebase.database.ReactNativeFirebaseDatabasePackage;
import io.invertase.firebase.firestore.ReactNativeFirebaseFirestorePackage;
import io.invertase.firebase.functions.ReactNativeFirebaseFunctionsPackage;
import io.invertase.firebase.messaging.ReactNativeFirebaseMessagingPackage;
import io.invertase.firebase.perf.ReactNativeFirebasePerfPackage;
import io.invertase.firebase.storage.ReactNativeFirebaseStoragePackage;
import io.invertase.googlemobileads.ReactNativeGoogleMobileAdsPackage;
import java.util.ArrayList;
import java.util.Arrays;
import org.reactnative.maskedview.RNCMaskedViewPackage;

/* loaded from: classes4.dex */
public class PackageList {
    private Application application;
    private MainPackageConfig mConfig;
    private ReactNativeHost reactNativeHost;

    public PackageList(ReactNativeHost reactNativeHost) {
        this(reactNativeHost, (MainPackageConfig) null);
    }

    public PackageList(Application application) {
        this(application, (MainPackageConfig) null);
    }

    public PackageList(ReactNativeHost reactNativeHost, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = reactNativeHost;
        this.mConfig = mainPackageConfig;
    }

    public PackageList(Application application, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = null;
        this.application = application;
        this.mConfig = mainPackageConfig;
    }

    private ReactNativeHost getReactNativeHost() {
        return this.reactNativeHost;
    }

    private Resources getResources() {
        return getApplication().getResources();
    }

    private Application getApplication() {
        ReactNativeHost reactNativeHost = this.reactNativeHost;
        return reactNativeHost == null ? this.application : reactNativeHost.getApplication();
    }

    private Context getApplicationContext() {
        return getApplication().getApplicationContext();
    }

    public ArrayList<ReactPackage> getPackages() {
        return new ArrayList<>(Arrays.asList(new MainReactPackage(this.mConfig), new IntercomPackage(), new RNDateTimePickerPackage(), new ReactNativeFirebaseAnalyticsPackage(), new ReactNativeFirebaseAppPackage(), new ReactNativeFirebaseAppCheckPackage(), new ReactNativeFirebaseAuthPackage(), new ReactNativeFirebaseCrashlyticsPackage(), new ReactNativeFirebaseDatabasePackage(), new ReactNativeFirebaseFirestorePackage(), new ReactNativeFirebaseFunctionsPackage(), new ReactNativeFirebaseMessagingPackage(), new ReactNativeFirebasePerfPackage(), new ReactNativeFirebaseConfigPackage(), new ReactNativeFirebaseStoragePackage(), new RNGoogleSigninPackage(), new RNCMaskedViewPackage(), new ExpoModulesPackage(), new LottiePackage(), new AutoSkeletonViewPackage(), new RNBranchPackage(), new FBSDKPackage(), new RNGestureHandlerPackage(), new ReactNativeGoogleMobileAdsPackage(), new KeyboardControllerPackage(), new PagerViewPackage(), new RNPurchasesPackage(), new ReanimatedPackage(), new SafeAreaContextPackage(), new RNScreensPackage(), new SvgPackage(), new RNCWebViewPackage(), new WorkletsPackage()));
    }
}
