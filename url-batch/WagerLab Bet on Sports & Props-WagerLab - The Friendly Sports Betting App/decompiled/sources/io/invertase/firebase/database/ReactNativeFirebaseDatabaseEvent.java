package io.invertase.firebase.database;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import io.invertase.firebase.interfaces.NativeEvent;

/* loaded from: classes8.dex */
public class ReactNativeFirebaseDatabaseEvent implements NativeEvent {
    static final String EVENT_SYNC = "database_sync_event";
    static final String EVENT_TRANSACTION = "database_transaction_event";
    private static final String KEY_BODY = "body";
    private static final String KEY_EVENT_NAME = "eventName";
    private WritableMap eventBody;
    private String eventName;

    @Override // io.invertase.firebase.interfaces.NativeEvent
    public String getFirebaseAppName() {
        return null;
    }

    ReactNativeFirebaseDatabaseEvent(String str, WritableMap writableMap) {
        this.eventName = str;
        this.eventBody = writableMap;
    }

    @Override // io.invertase.firebase.interfaces.NativeEvent
    public String getEventName() {
        return this.eventName;
    }

    @Override // io.invertase.firebase.interfaces.NativeEvent
    public WritableMap getEventBody() {
        WritableMap createMap = Arguments.createMap();
        createMap.putMap("body", this.eventBody);
        createMap.putString(KEY_EVENT_NAME, this.eventName);
        return createMap;
    }
}
