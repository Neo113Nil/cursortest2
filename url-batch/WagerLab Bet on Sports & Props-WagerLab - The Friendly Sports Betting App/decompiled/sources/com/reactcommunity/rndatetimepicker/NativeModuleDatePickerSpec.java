package com.reactcommunity.rndatetimepicker;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: classes7.dex */
public abstract class NativeModuleDatePickerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCDatePicker";

    @ReactMethod
    public abstract void dismiss(Promise promise);

    @ReactMethod
    public abstract void open(ReadableMap readableMap, Promise promise);

    public NativeModuleDatePickerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "RNCDatePicker";
    }
}
