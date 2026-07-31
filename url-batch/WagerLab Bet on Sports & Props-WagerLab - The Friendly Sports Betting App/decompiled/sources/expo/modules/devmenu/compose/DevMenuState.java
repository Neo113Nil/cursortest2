package expo.modules.devmenu.compose;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import expo.modules.devmenu.DevMenuPreferencesHandle;
import expo.modules.devmenu.DevToolsSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DevMenuState.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002$%BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lexpo/modules/devmenu/compose/DevMenuState;", "", "appInfo", "Lexpo/modules/devmenu/compose/DevMenuState$AppInfo;", "isOpen", "", "devToolsSettings", "Lexpo/modules/devmenu/DevToolsSettings;", "isOnboardingFinished", "showFab", "customItems", "", "Lexpo/modules/devmenu/compose/DevMenuState$CustomItem;", "<init>", "(Lexpo/modules/devmenu/compose/DevMenuState$AppInfo;ZLexpo/modules/devmenu/DevToolsSettings;ZZLjava/util/List;)V", "getAppInfo", "()Lexpo/modules/devmenu/compose/DevMenuState$AppInfo;", "()Z", "getDevToolsSettings", "()Lexpo/modules/devmenu/DevToolsSettings;", "getShowFab", "getCustomItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "CustomItem", "AppInfo", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DevMenuState {
    public static final int $stable = 8;
    private final AppInfo appInfo;
    private final List<CustomItem> customItems;
    private final DevToolsSettings devToolsSettings;
    private final boolean isOnboardingFinished;
    private final boolean isOpen;
    private final boolean showFab;

    public DevMenuState() {
        this(null, false, null, false, false, null, 63, null);
    }

    public static /* synthetic */ DevMenuState copy$default(DevMenuState devMenuState, AppInfo appInfo, boolean z, DevToolsSettings devToolsSettings, boolean z2, boolean z3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            appInfo = devMenuState.appInfo;
        }
        if ((i & 2) != 0) {
            z = devMenuState.isOpen;
        }
        if ((i & 4) != 0) {
            devToolsSettings = devMenuState.devToolsSettings;
        }
        if ((i & 8) != 0) {
            z2 = devMenuState.isOnboardingFinished;
        }
        if ((i & 16) != 0) {
            z3 = devMenuState.showFab;
        }
        if ((i & 32) != 0) {
            list = devMenuState.customItems;
        }
        boolean z4 = z3;
        List list2 = list;
        return devMenuState.copy(appInfo, z, devToolsSettings, z2, z4, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final AppInfo getAppInfo() {
        return this.appInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsOpen() {
        return this.isOpen;
    }

    /* renamed from: component3, reason: from getter */
    public final DevToolsSettings getDevToolsSettings() {
        return this.devToolsSettings;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsOnboardingFinished() {
        return this.isOnboardingFinished;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowFab() {
        return this.showFab;
    }

    public final List<CustomItem> component6() {
        return this.customItems;
    }

    public final DevMenuState copy(AppInfo appInfo, boolean isOpen, DevToolsSettings devToolsSettings, boolean isOnboardingFinished, boolean showFab, List<CustomItem> customItems) {
        Intrinsics.checkNotNullParameter(devToolsSettings, "devToolsSettings");
        Intrinsics.checkNotNullParameter(customItems, "customItems");
        return new DevMenuState(appInfo, isOpen, devToolsSettings, isOnboardingFinished, showFab, customItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevMenuState)) {
            return false;
        }
        DevMenuState devMenuState = (DevMenuState) other;
        return Intrinsics.areEqual(this.appInfo, devMenuState.appInfo) && this.isOpen == devMenuState.isOpen && Intrinsics.areEqual(this.devToolsSettings, devMenuState.devToolsSettings) && this.isOnboardingFinished == devMenuState.isOnboardingFinished && this.showFab == devMenuState.showFab && Intrinsics.areEqual(this.customItems, devMenuState.customItems);
    }

    public int hashCode() {
        AppInfo appInfo = this.appInfo;
        return ((((((((((appInfo == null ? 0 : appInfo.hashCode()) * 31) + Boolean.hashCode(this.isOpen)) * 31) + this.devToolsSettings.hashCode()) * 31) + Boolean.hashCode(this.isOnboardingFinished)) * 31) + Boolean.hashCode(this.showFab)) * 31) + this.customItems.hashCode();
    }

    public String toString() {
        return "DevMenuState(appInfo=" + this.appInfo + ", isOpen=" + this.isOpen + ", devToolsSettings=" + this.devToolsSettings + ", isOnboardingFinished=" + this.isOnboardingFinished + ", showFab=" + this.showFab + ", customItems=" + this.customItems + ")";
    }

    public DevMenuState(AppInfo appInfo, boolean z, DevToolsSettings devToolsSettings, boolean z2, boolean z3, List<CustomItem> customItems) {
        Intrinsics.checkNotNullParameter(devToolsSettings, "devToolsSettings");
        Intrinsics.checkNotNullParameter(customItems, "customItems");
        this.appInfo = appInfo;
        this.isOpen = z;
        this.devToolsSettings = devToolsSettings;
        this.isOnboardingFinished = z2;
        this.showFab = z3;
        this.customItems = customItems;
    }

    public final AppInfo getAppInfo() {
        return this.appInfo;
    }

    public final boolean isOpen() {
        return this.isOpen;
    }

    public /* synthetic */ DevMenuState(AppInfo appInfo, boolean z, DevToolsSettings devToolsSettings, boolean z2, boolean z3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : appInfo, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new DevToolsSettings(false, false, false, 7, null) : devToolsSettings, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? DevMenuPreferencesHandle.INSTANCE.getShowFab() : z3, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final DevToolsSettings getDevToolsSettings() {
        return this.devToolsSettings;
    }

    public final boolean isOnboardingFinished() {
        return this.isOnboardingFinished;
    }

    public final boolean getShowFab() {
        return this.showFab;
    }

    public final List<CustomItem> getCustomItems() {
        return this.customItems;
    }

    /* compiled from: DevMenuState.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lexpo/modules/devmenu/compose/DevMenuState$CustomItem;", "", "name", "", "shouldCollapse", "", "<init>", "(Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getShouldCollapse", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CustomItem {
        public static final int $stable = 0;
        private final String name;
        private final boolean shouldCollapse;

        public static /* synthetic */ CustomItem copy$default(CustomItem customItem, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customItem.name;
            }
            if ((i & 2) != 0) {
                z = customItem.shouldCollapse;
            }
            return customItem.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldCollapse() {
            return this.shouldCollapse;
        }

        public final CustomItem copy(String name, boolean shouldCollapse) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new CustomItem(name, shouldCollapse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomItem)) {
                return false;
            }
            CustomItem customItem = (CustomItem) other;
            return Intrinsics.areEqual(this.name, customItem.name) && this.shouldCollapse == customItem.shouldCollapse;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Boolean.hashCode(this.shouldCollapse);
        }

        public String toString() {
            return "CustomItem(name=" + this.name + ", shouldCollapse=" + this.shouldCollapse + ")";
        }

        public CustomItem(String name, boolean z) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.shouldCollapse = z;
        }

        public final String getName() {
            return this.name;
        }

        public final boolean getShouldCollapse() {
            return this.shouldCollapse;
        }
    }

    /* compiled from: DevMenuState.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lexpo/modules/devmenu/compose/DevMenuState$AppInfo;", "", "appName", "", "hostUrl", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "runtimeVersion", "sdkVersion", "engine", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppName", "()Ljava/lang/String;", "getHostUrl", "getAppVersion", "getRuntimeVersion", "getSdkVersion", "getEngine", "toJson", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AppInfo {
        public static final int $stable = 0;
        private final String appName;
        private final String appVersion;
        private final String engine;
        private final String hostUrl;
        private final String runtimeVersion;
        private final String sdkVersion;

        public static /* synthetic */ AppInfo copy$default(AppInfo appInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = appInfo.appName;
            }
            if ((i & 2) != 0) {
                str2 = appInfo.hostUrl;
            }
            if ((i & 4) != 0) {
                str3 = appInfo.appVersion;
            }
            if ((i & 8) != 0) {
                str4 = appInfo.runtimeVersion;
            }
            if ((i & 16) != 0) {
                str5 = appInfo.sdkVersion;
            }
            if ((i & 32) != 0) {
                str6 = appInfo.engine;
            }
            String str7 = str5;
            String str8 = str6;
            return appInfo.copy(str, str2, str3, str4, str7, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAppName() {
            return this.appName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getHostUrl() {
            return this.hostUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAppVersion() {
            return this.appVersion;
        }

        /* renamed from: component4, reason: from getter */
        public final String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSdkVersion() {
            return this.sdkVersion;
        }

        /* renamed from: component6, reason: from getter */
        public final String getEngine() {
            return this.engine;
        }

        public final AppInfo copy(String appName, String hostUrl, String appVersion, String runtimeVersion, String sdkVersion, String engine) {
            Intrinsics.checkNotNullParameter(appName, "appName");
            Intrinsics.checkNotNullParameter(hostUrl, "hostUrl");
            return new AppInfo(appName, hostUrl, appVersion, runtimeVersion, sdkVersion, engine);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AppInfo)) {
                return false;
            }
            AppInfo appInfo = (AppInfo) other;
            return Intrinsics.areEqual(this.appName, appInfo.appName) && Intrinsics.areEqual(this.hostUrl, appInfo.hostUrl) && Intrinsics.areEqual(this.appVersion, appInfo.appVersion) && Intrinsics.areEqual(this.runtimeVersion, appInfo.runtimeVersion) && Intrinsics.areEqual(this.sdkVersion, appInfo.sdkVersion) && Intrinsics.areEqual(this.engine, appInfo.engine);
        }

        public int hashCode() {
            int hashCode = ((this.appName.hashCode() * 31) + this.hostUrl.hashCode()) * 31;
            String str = this.appVersion;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.runtimeVersion;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.sdkVersion;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.engine;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "AppInfo(appName=" + this.appName + ", hostUrl=" + this.hostUrl + ", appVersion=" + this.appVersion + ", runtimeVersion=" + this.runtimeVersion + ", sdkVersion=" + this.sdkVersion + ", engine=" + this.engine + ")";
        }

        public AppInfo(String appName, String hostUrl, String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(appName, "appName");
            Intrinsics.checkNotNullParameter(hostUrl, "hostUrl");
            this.appName = appName;
            this.hostUrl = hostUrl;
            this.appVersion = str;
            this.runtimeVersion = str2;
            this.sdkVersion = str3;
            this.engine = str4;
        }

        public /* synthetic */ AppInfo(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
        }

        public final String getAppName() {
            return this.appName;
        }

        public final String getHostUrl() {
            return this.hostUrl;
        }

        public final String getAppVersion() {
            return this.appVersion;
        }

        public final String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        public final String getSdkVersion() {
            return this.sdkVersion;
        }

        public final String getEngine() {
            return this.engine;
        }

        public final String toJson() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appName", this.appName);
            jSONObject.put("hostUrl", this.hostUrl);
            Object obj = this.appVersion;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, obj);
            Object obj2 = this.runtimeVersion;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("runtimeVersion", obj2);
            Object obj3 = this.sdkVersion;
            if (obj3 == null) {
                obj3 = JSONObject.NULL;
            }
            jSONObject.put("sdkVersion", obj3);
            Object obj4 = this.engine;
            if (obj4 == null) {
                obj4 = JSONObject.NULL;
            }
            jSONObject.put("engine", obj4);
            String jSONObject2 = jSONObject.toString(2);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            return jSONObject2;
        }
    }
}
