package io.intercom.android.sdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigModules.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J_\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010'\u001a\u00020(H×\u0001J\t\u0010)\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006*"}, d2 = {"Lio/intercom/android/sdk/models/HeaderContentModel;", "", "logoUrl", "", "logoDarkUrl", "showAvatars", "", "greeting", "Lio/intercom/android/sdk/models/HeaderTextModel;", "intro", "closeButton", "Lio/intercom/android/sdk/models/CloseButtonModel;", "textColorType", "textColorTypeDark", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/HeaderTextModel;Lio/intercom/android/sdk/models/HeaderTextModel;Lio/intercom/android/sdk/models/CloseButtonModel;Ljava/lang/String;Ljava/lang/String;)V", "getLogoUrl", "()Ljava/lang/String;", "getLogoDarkUrl", "getShowAvatars", "()Z", "getGreeting", "()Lio/intercom/android/sdk/models/HeaderTextModel;", "getIntro", "getCloseButton", "()Lio/intercom/android/sdk/models/CloseButtonModel;", "getTextColorType", "getTextColorTypeDark", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HeaderContentModel {
    public static final int $stable = 0;

    @SerializedName("close_button")
    private final CloseButtonModel closeButton;

    @SerializedName("greeting")
    private final HeaderTextModel greeting;

    @SerializedName("introduction")
    private final HeaderTextModel intro;

    @SerializedName("logo_dark_url")
    private final String logoDarkUrl;

    @SerializedName("logo_url")
    private final String logoUrl;

    @SerializedName("show_avatars")
    private final boolean showAvatars;

    @SerializedName("text_color_type")
    private final String textColorType;

    @SerializedName("text_color_type_dark")
    private final String textColorTypeDark;

    public HeaderContentModel() {
        this(null, null, false, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ HeaderContentModel copy$default(HeaderContentModel headerContentModel, String str, String str2, boolean z, HeaderTextModel headerTextModel, HeaderTextModel headerTextModel2, CloseButtonModel closeButtonModel, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = headerContentModel.logoUrl;
        }
        if ((i & 2) != 0) {
            str2 = headerContentModel.logoDarkUrl;
        }
        if ((i & 4) != 0) {
            z = headerContentModel.showAvatars;
        }
        if ((i & 8) != 0) {
            headerTextModel = headerContentModel.greeting;
        }
        if ((i & 16) != 0) {
            headerTextModel2 = headerContentModel.intro;
        }
        if ((i & 32) != 0) {
            closeButtonModel = headerContentModel.closeButton;
        }
        if ((i & 64) != 0) {
            str3 = headerContentModel.textColorType;
        }
        if ((i & 128) != 0) {
            str4 = headerContentModel.textColorTypeDark;
        }
        String str5 = str3;
        String str6 = str4;
        HeaderTextModel headerTextModel3 = headerTextModel2;
        CloseButtonModel closeButtonModel2 = closeButtonModel;
        return headerContentModel.copy(str, str2, z, headerTextModel, headerTextModel3, closeButtonModel2, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLogoDarkUrl() {
        return this.logoDarkUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowAvatars() {
        return this.showAvatars;
    }

    /* renamed from: component4, reason: from getter */
    public final HeaderTextModel getGreeting() {
        return this.greeting;
    }

    /* renamed from: component5, reason: from getter */
    public final HeaderTextModel getIntro() {
        return this.intro;
    }

    /* renamed from: component6, reason: from getter */
    public final CloseButtonModel getCloseButton() {
        return this.closeButton;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTextColorType() {
        return this.textColorType;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTextColorTypeDark() {
        return this.textColorTypeDark;
    }

    public final HeaderContentModel copy(String logoUrl, String logoDarkUrl, boolean showAvatars, HeaderTextModel greeting, HeaderTextModel intro, CloseButtonModel closeButton, String textColorType, String textColorTypeDark) {
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(greeting, "greeting");
        Intrinsics.checkNotNullParameter(intro, "intro");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        return new HeaderContentModel(logoUrl, logoDarkUrl, showAvatars, greeting, intro, closeButton, textColorType, textColorTypeDark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderContentModel)) {
            return false;
        }
        HeaderContentModel headerContentModel = (HeaderContentModel) other;
        return Intrinsics.areEqual(this.logoUrl, headerContentModel.logoUrl) && Intrinsics.areEqual(this.logoDarkUrl, headerContentModel.logoDarkUrl) && this.showAvatars == headerContentModel.showAvatars && Intrinsics.areEqual(this.greeting, headerContentModel.greeting) && Intrinsics.areEqual(this.intro, headerContentModel.intro) && Intrinsics.areEqual(this.closeButton, headerContentModel.closeButton) && Intrinsics.areEqual(this.textColorType, headerContentModel.textColorType) && Intrinsics.areEqual(this.textColorTypeDark, headerContentModel.textColorTypeDark);
    }

    public int hashCode() {
        int hashCode = this.logoUrl.hashCode() * 31;
        String str = this.logoDarkUrl;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.showAvatars)) * 31) + this.greeting.hashCode()) * 31) + this.intro.hashCode()) * 31) + this.closeButton.hashCode()) * 31;
        String str2 = this.textColorType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textColorTypeDark;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "HeaderContentModel(logoUrl=" + this.logoUrl + ", logoDarkUrl=" + this.logoDarkUrl + ", showAvatars=" + this.showAvatars + ", greeting=" + this.greeting + ", intro=" + this.intro + ", closeButton=" + this.closeButton + ", textColorType=" + this.textColorType + ", textColorTypeDark=" + this.textColorTypeDark + ')';
    }

    public HeaderContentModel(String logoUrl, String str, boolean z, HeaderTextModel greeting, HeaderTextModel intro, CloseButtonModel closeButton, String str2, String str3) {
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(greeting, "greeting");
        Intrinsics.checkNotNullParameter(intro, "intro");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        this.logoUrl = logoUrl;
        this.logoDarkUrl = str;
        this.showAvatars = z;
        this.greeting = greeting;
        this.intro = intro;
        this.closeButton = closeButton;
        this.textColorType = str2;
        this.textColorTypeDark = str3;
    }

    public /* synthetic */ HeaderContentModel(String str, String str2, boolean z, HeaderTextModel headerTextModel, HeaderTextModel headerTextModel2, CloseButtonModel closeButtonModel, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? new HeaderTextModel(null, 0.0f, null, null, 15, null) : headerTextModel, (i & 16) != 0 ? new HeaderTextModel(null, 0.0f, null, null, 15, null) : headerTextModel2, (i & 32) != 0 ? new CloseButtonModel(null, 0.0f, null, 7, null) : closeButtonModel, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4);
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final String getLogoDarkUrl() {
        return this.logoDarkUrl;
    }

    public final boolean getShowAvatars() {
        return this.showAvatars;
    }

    public final HeaderTextModel getGreeting() {
        return this.greeting;
    }

    public final HeaderTextModel getIntro() {
        return this.intro;
    }

    public final CloseButtonModel getCloseButton() {
        return this.closeButton;
    }

    public final String getTextColorType() {
        return this.textColorType;
    }

    public final String getTextColorTypeDark() {
        return this.textColorTypeDark;
    }
}
