package io.intercom.android.sdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigModules.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/models/CloseButtonModel;", "", "backgroundColor", "", "backgroundOpacity", "", ViewProps.FOREGROUND_COLOR, "<init>", "(Ljava/lang/String;FLjava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getBackgroundOpacity", "()F", "getForegroundColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CloseButtonModel {
    public static final int $stable = 0;

    @SerializedName("background_color")
    private final String backgroundColor;

    @SerializedName("background_opacity")
    private final float backgroundOpacity;

    @SerializedName("foreground_color")
    private final String foregroundColor;

    public CloseButtonModel() {
        this(null, 0.0f, null, 7, null);
    }

    public static /* synthetic */ CloseButtonModel copy$default(CloseButtonModel closeButtonModel, String str, float f, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = closeButtonModel.backgroundColor;
        }
        if ((i & 2) != 0) {
            f = closeButtonModel.backgroundOpacity;
        }
        if ((i & 4) != 0) {
            str2 = closeButtonModel.foregroundColor;
        }
        return closeButtonModel.copy(str, f, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final float getBackgroundOpacity() {
        return this.backgroundOpacity;
    }

    /* renamed from: component3, reason: from getter */
    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    public final CloseButtonModel copy(String backgroundColor, float backgroundOpacity, String foregroundColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
        return new CloseButtonModel(backgroundColor, backgroundOpacity, foregroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloseButtonModel)) {
            return false;
        }
        CloseButtonModel closeButtonModel = (CloseButtonModel) other;
        return Intrinsics.areEqual(this.backgroundColor, closeButtonModel.backgroundColor) && Float.compare(this.backgroundOpacity, closeButtonModel.backgroundOpacity) == 0 && Intrinsics.areEqual(this.foregroundColor, closeButtonModel.foregroundColor);
    }

    public int hashCode() {
        return (((this.backgroundColor.hashCode() * 31) + Float.hashCode(this.backgroundOpacity)) * 31) + this.foregroundColor.hashCode();
    }

    public String toString() {
        return "CloseButtonModel(backgroundColor=" + this.backgroundColor + ", backgroundOpacity=" + this.backgroundOpacity + ", foregroundColor=" + this.foregroundColor + ')';
    }

    public CloseButtonModel(String backgroundColor, float f, String foregroundColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
        this.backgroundColor = backgroundColor;
        this.backgroundOpacity = f;
        this.foregroundColor = foregroundColor;
    }

    public /* synthetic */ CloseButtonModel(String str, float f, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "#FFFFFF" : str, (i & 2) != 0 ? 1.0f : f, (i & 4) != 0 ? "#000000" : str2);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final float getBackgroundOpacity() {
        return this.backgroundOpacity;
    }

    public final String getForegroundColor() {
        return this.foregroundColor;
    }
}
