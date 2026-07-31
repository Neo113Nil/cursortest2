package io.intercom.android.sdk.models.carousel;

import java.util.List;

/* loaded from: classes8.dex */
final class AutoValue_ScreenAction extends ScreenAction {
    private final List<String> androidPermissions;
    private final String backgroundColor;
    private final String id;
    private final String textColor;
    private final String title;
    private final String type;
    private final String uri;

    AutoValue_ScreenAction(String str, String str2, String str3, String str4, String str5, String str6, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.id = str;
        if (str2 == null) {
            throw new NullPointerException("Null type");
        }
        this.type = str2;
        if (str3 == null) {
            throw new NullPointerException("Null title");
        }
        this.title = str3;
        if (str4 == null) {
            throw new NullPointerException("Null textColor");
        }
        this.textColor = str4;
        if (str5 == null) {
            throw new NullPointerException("Null backgroundColor");
        }
        this.backgroundColor = str5;
        if (str6 == null) {
            throw new NullPointerException("Null uri");
        }
        this.uri = str6;
        if (list == null) {
            throw new NullPointerException("Null androidPermissions");
        }
        this.androidPermissions = list;
    }

    @Override // io.intercom.android.sdk.models.carousel.ScreenAction
    public String getId() {
        return this.id;
    }

    @Override // io.intercom.android.sdk.models.carousel.ScreenAction
    public String getType() {
        return this.type;
    }

    @Override // io.intercom.android.sdk.models.carousel.ScreenAction
    public String getTitle() {
        return this.title;
    }

    @Override // io.intercom.android.sdk.models.carousel.ScreenAction
    public String getTextColor() {
        return this.textColor;
    }

    @Override // io.intercom.android.sdk.models.carousel.ScreenAction
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // io.intercom.android.sdk.models.carousel.ScreenAction
    public String getUri() {
        return this.uri;
    }

    @Override // io.intercom.android.sdk.models.carousel.ScreenAction
    public List<String> getAndroidPermissions() {
        return this.androidPermissions;
    }

    public String toString() {
        return "ScreenAction{id=" + this.id + ", type=" + this.type + ", title=" + this.title + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", uri=" + this.uri + ", androidPermissions=" + this.androidPermissions + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ScreenAction) {
            ScreenAction screenAction = (ScreenAction) obj;
            if (this.id.equals(screenAction.getId()) && this.type.equals(screenAction.getType()) && this.title.equals(screenAction.getTitle()) && this.textColor.equals(screenAction.getTextColor()) && this.backgroundColor.equals(screenAction.getBackgroundColor()) && this.uri.equals(screenAction.getUri()) && this.androidPermissions.equals(screenAction.getAndroidPermissions())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.type.hashCode()) * 1000003) ^ this.title.hashCode()) * 1000003) ^ this.textColor.hashCode()) * 1000003) ^ this.backgroundColor.hashCode()) * 1000003) ^ this.uri.hashCode()) * 1000003) ^ this.androidPermissions.hashCode();
    }
}
