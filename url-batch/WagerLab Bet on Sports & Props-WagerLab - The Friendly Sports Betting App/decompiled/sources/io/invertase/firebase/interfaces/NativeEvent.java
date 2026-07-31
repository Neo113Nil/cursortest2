package io.invertase.firebase.interfaces;

import com.facebook.react.bridge.WritableMap;

/* loaded from: classes8.dex */
public interface NativeEvent {
    WritableMap getEventBody();

    String getEventName();

    String getFirebaseAppName();
}
