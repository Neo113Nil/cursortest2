package io.invertase.firebase.interfaces;

import com.facebook.react.bridge.WritableMap;

/* loaded from: classes8.dex */
public interface NativeError {
    String getErrorCode();

    String getErrorMessage();

    String getFirebaseAppName();

    String getFirebaseServiceName();

    WritableMap getUserInfo();
}
