package com.facebook.react.devsupport;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevMenuSettingsBase.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001/B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001eH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R$\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R$\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u001a\u0010!\u001a\u00020\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R*\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0010\"\u0004\b'\u0010\u0012R \u0010(\u001a\u00020\u000eX\u0096\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0010\"\u0004\b*\u0010\u0012R$\u0010-\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0010\"\u0004\b.\u0010\u0012¨\u00060"}, d2 = {"Lcom/facebook/react/devsupport/DevMenuSettingsBase;", "Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "context", "Landroid/content/Context;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/react/devsupport/DevMenuSettingsBase$Listener;", "<init>", "(Landroid/content/Context;Lcom/facebook/react/devsupport/DevMenuSettingsBase$Listener;)V", "mPreferences", "Landroid/content/SharedPreferences;", "getMPreferences", "()Landroid/content/SharedPreferences;", ViewProps.ENABLED, "", "isFpsDebugEnabled", "()Z", "setFpsDebugEnabled", "(Z)V", "isAnimationFpsDebugEnabled", "setAnimationFpsDebugEnabled", "value", "isJSDevModeEnabled", "setJSDevModeEnabled", "isJSMinifyEnabled", "setJSMinifyEnabled", "onSharedPreferenceChanged", "", "sharedPreferences", "key", "", "isElementInspectorEnabled", "setElementInspectorEnabled", "isDeviceDebugEnabled", "setDeviceDebugEnabled", "remoteJSDebugEnabled", "isRemoteJSDebugEnabled", "isRemoteJSDebugEnabled$annotations", "()V", "setRemoteJSDebugEnabled", "isStartSamplingProfilerOnInit", "isStartSamplingProfilerOnInit$annotations", "setStartSamplingProfilerOnInit", "addMenuItem", "title", "isHotModuleReplacementEnabled", "setHotModuleReplacementEnabled", "Listener", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DevMenuSettingsBase implements DeveloperSettings, SharedPreferences.OnSharedPreferenceChangeListener {
    public static final int $stable = 8;
    private boolean isAnimationFpsDebugEnabled;
    private boolean isDeviceDebugEnabled;
    private boolean isJSMinifyEnabled;
    private boolean isStartSamplingProfilerOnInit;
    private final Listener listener;
    private final SharedPreferences mPreferences;

    /* compiled from: DevMenuSettingsBase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/devsupport/DevMenuSettingsBase$Listener;", "", "onInternalSettingsChanged", "", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Listener {
        void onInternalSettingsChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0() {
    }

    public static /* synthetic */ void isRemoteJSDebugEnabled$annotations() {
    }

    public static /* synthetic */ void isStartSamplingProfilerOnInit$annotations() {
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void addMenuItem(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
    }

    public DevMenuSettingsBase(Context context, Listener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.listener = listener;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.mPreferences = defaultSharedPreferences;
        this.isAnimationFpsDebugEnabled = defaultSharedPreferences.getBoolean("animations_debug", false);
        this.isJSMinifyEnabled = defaultSharedPreferences.getBoolean("js_minify_debug", false);
        this.isDeviceDebugEnabled = ReactBuildConfig.DEBUG;
        this.isStartSamplingProfilerOnInit = defaultSharedPreferences.getBoolean("start_sampling_profiler_on_init", false);
    }

    public /* synthetic */ DevMenuSettingsBase(Context context, Listener listener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new Listener() { // from class: com.facebook.react.devsupport.DevMenuSettingsBase$$ExternalSyntheticLambda0
            @Override // com.facebook.react.devsupport.DevMenuSettingsBase.Listener
            public final void onInternalSettingsChanged() {
                DevMenuSettingsBase._init_$lambda$0();
            }
        } : listener);
    }

    protected final SharedPreferences getMPreferences() {
        return this.mPreferences;
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public boolean isFpsDebugEnabled() {
        return this.mPreferences.getBoolean("fps_debug", false);
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setFpsDebugEnabled(boolean z) {
        SharedPreferences.Editor edit = this.mPreferences.edit();
        edit.putBoolean("fps_debug", z);
        edit.commit();
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    /* renamed from: isAnimationFpsDebugEnabled, reason: from getter */
    public boolean getIsAnimationFpsDebugEnabled() {
        return this.isAnimationFpsDebugEnabled;
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setAnimationFpsDebugEnabled(boolean z) {
        this.isAnimationFpsDebugEnabled = z;
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public boolean isJSDevModeEnabled() {
        return this.mPreferences.getBoolean("js_dev_mode_debug", true);
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setJSDevModeEnabled(boolean z) {
        SharedPreferences.Editor edit = this.mPreferences.edit();
        edit.putBoolean("js_dev_mode_debug", z);
        edit.commit();
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    /* renamed from: isJSMinifyEnabled, reason: from getter */
    public boolean getIsJSMinifyEnabled() {
        return this.isJSMinifyEnabled;
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setJSMinifyEnabled(boolean z) {
        this.isJSMinifyEnabled = z;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        if (this.listener != null) {
            if (Intrinsics.areEqual("fps_debug", key) || Intrinsics.areEqual("js_dev_mode_debug", key) || Intrinsics.areEqual("start_sampling_profiler_on_init", key) || Intrinsics.areEqual("js_minify_debug", key)) {
                this.listener.onInternalSettingsChanged();
            }
        }
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public boolean isElementInspectorEnabled() {
        return this.mPreferences.getBoolean("inspector_debug", false);
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setElementInspectorEnabled(boolean z) {
        SharedPreferences.Editor edit = this.mPreferences.edit();
        edit.putBoolean("inspector_debug", z);
        edit.commit();
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    /* renamed from: isDeviceDebugEnabled, reason: from getter */
    public boolean getIsDeviceDebugEnabled() {
        return this.isDeviceDebugEnabled;
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setDeviceDebugEnabled(boolean z) {
        this.isDeviceDebugEnabled = z;
    }

    public boolean isRemoteJSDebugEnabled() {
        return this.mPreferences.getBoolean("remote_js_debug", false);
    }

    public void setRemoteJSDebugEnabled(boolean z) {
        SharedPreferences.Editor edit = this.mPreferences.edit();
        edit.putBoolean("remote_js_debug", z);
        edit.commit();
    }

    /* renamed from: isStartSamplingProfilerOnInit, reason: from getter */
    public boolean getIsStartSamplingProfilerOnInit() {
        return this.isStartSamplingProfilerOnInit;
    }

    public void setStartSamplingProfilerOnInit(boolean z) {
        this.isStartSamplingProfilerOnInit = z;
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public boolean isHotModuleReplacementEnabled() {
        return this.mPreferences.getBoolean("hot_module_replacement", true);
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setHotModuleReplacementEnabled(boolean z) {
        SharedPreferences.Editor edit = this.mPreferences.edit();
        edit.putBoolean("hot_module_replacement", z);
        edit.commit();
    }
}
