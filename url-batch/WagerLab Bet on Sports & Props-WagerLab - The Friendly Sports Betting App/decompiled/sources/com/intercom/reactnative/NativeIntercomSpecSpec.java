package com.intercom.reactnative;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes7.dex */
public abstract class NativeIntercomSpecSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IntercomModule";

    @ReactMethod
    public abstract void fetchHelpCenterCollection(String str, Promise promise);

    @ReactMethod
    public abstract void fetchHelpCenterCollections(Promise promise);

    @ReactMethod
    public abstract void fetchLoggedInUserAttributes(Promise promise);

    @ReactMethod
    public abstract void getUnreadConversationCount(Promise promise);

    @ReactMethod
    public abstract void handlePushMessage(Promise promise);

    @ReactMethod
    public abstract void hideIntercom(Promise promise);

    @ReactMethod
    public abstract void initialize(String str, String str2, Promise promise);

    @ReactMethod
    public abstract void isUserLoggedIn(Promise promise);

    @ReactMethod
    public abstract void logEvent(String str, @Nullable ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void loginUnidentifiedUser(Promise promise);

    @ReactMethod
    public abstract void loginUserWithUserAttributes(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void logout(Promise promise);

    @ReactMethod
    public abstract void presentContent(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void presentIntercom(Promise promise);

    @ReactMethod
    public abstract void presentIntercomSpace(String str, Promise promise);

    @ReactMethod
    public abstract void presentMessageComposer(@Nullable String str, Promise promise);

    @ReactMethod
    public abstract void searchHelpCenter(String str, Promise promise);

    @ReactMethod
    public abstract void sendTokenToIntercom(String str, Promise promise);

    @ReactMethod
    public abstract void setAuthTokens(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void setBottomPadding(double d, Promise promise);

    @ReactMethod
    public abstract void setInAppMessageVisibility(String str, Promise promise);

    @ReactMethod
    public abstract void setLauncherVisibility(String str, Promise promise);

    @ReactMethod
    public abstract void setLogLevel(String str, Promise promise);

    @ReactMethod
    public abstract void setNeedsStatusBarAppearanceUpdate(Promise promise);

    @ReactMethod
    public abstract void setThemeMode(String str, Promise promise);

    @ReactMethod
    public abstract void setUserHash(String str, Promise promise);

    @ReactMethod
    public abstract void setUserJwt(String str, Promise promise);

    @ReactMethod
    public abstract void updateUser(ReadableMap readableMap, Promise promise);

    public NativeIntercomSpecSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "IntercomModule";
    }
}
