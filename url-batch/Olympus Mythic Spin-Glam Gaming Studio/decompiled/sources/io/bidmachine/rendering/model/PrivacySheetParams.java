package io.bidmachine.rendering.model;

import android.graphics.Bitmap;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001:\u0002)*B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJH\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010\rR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010\r¨\u0006+"}, d2 = {"Lio/bidmachine/rendering/model/PrivacySheetParams;", "", "", "title", "subtitle", "", "Lio/bidmachine/rendering/model/PrivacySheetParams$Action;", "actions", "footerTitle", "footerText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lio/bidmachine/rendering/model/PrivacySheetParams;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "getSubtitle", "c", "Ljava/util/List;", "getActions", "d", "getFooterTitle", EidRequestBuilder.REQUEST_FIELD_EMAIL, "getFooterText", "Action", "ActionType", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PrivacySheetParams {

    /* renamed from: a, reason: from kotlin metadata and from toString */
    private final String title;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private final String subtitle;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    private final List actions;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    private final String footerTitle;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    private final String footerText;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u000fR(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010#\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lio/bidmachine/rendering/model/PrivacySheetParams$Action;", "", "Lio/bidmachine/rendering/model/PrivacySheetParams$ActionType;", "type", "", "title", "data", "<init>", "(Lio/bidmachine/rendering/model/PrivacySheetParams$ActionType;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "icon", "(Lio/bidmachine/rendering/model/PrivacySheetParams$ActionType;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "component1", "()Lio/bidmachine/rendering/model/PrivacySheetParams$ActionType;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lio/bidmachine/rendering/model/PrivacySheetParams$ActionType;Ljava/lang/String;Ljava/lang/String;)Lio/bidmachine/rendering/model/PrivacySheetParams$Action;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lio/bidmachine/rendering/model/PrivacySheetParams$ActionType;", "getType", "b", "Ljava/lang/String;", "getTitle", "c", "getData", "<set-?>", "d", "Landroid/graphics/Bitmap;", "getIcon", "()Landroid/graphics/Bitmap;", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: from kotlin metadata and from toString */
        private final ActionType type;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        private final String title;

        /* renamed from: c, reason: from kotlin metadata and from toString */
        private final String data;

        /* renamed from: d, reason: from kotlin metadata */
        private Bitmap icon;

        public Action(@NotNull ActionType type, @NotNull String title, @NotNull String data) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(data, "data");
            this.type = type;
            this.title = title;
            this.data = data;
        }

        public static /* synthetic */ Action copy$default(Action action, ActionType actionType, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                actionType = action.type;
            }
            if ((i & 2) != 0) {
                str = action.title;
            }
            if ((i & 4) != 0) {
                str2 = action.data;
            }
            return action.copy(actionType, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ActionType getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getData() {
            return this.data;
        }

        @NotNull
        public final Action copy(@NotNull ActionType type, @NotNull String title, @NotNull String data) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(data, "data");
            return new Action(type, title, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return this.type == action.type && Intrinsics.areEqual(this.title, action.title) && Intrinsics.areEqual(this.data, action.data);
        }

        @NotNull
        public final String getData() {
            return this.data;
        }

        @Nullable
        public final Bitmap getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final ActionType getType() {
            return this.type;
        }

        public int hashCode() {
            return (((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + this.data.hashCode();
        }

        @NotNull
        public String toString() {
            return "Action(type=" + this.type + ", title=" + this.title + ", data=" + this.data + ')';
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Action(@NotNull ActionType type, @NotNull String title, @NotNull String data, @Nullable Bitmap bitmap) {
            this(type, title, data);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(data, "data");
            this.icon = bitmap;
        }

        public /* synthetic */ Action(ActionType actionType, String str, String str2, Bitmap bitmap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(actionType, str, str2, (i & 8) != 0 ? null : bitmap);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lio/bidmachine/rendering/model/PrivacySheetParams$ActionType;", "", "(Ljava/lang/String;I)V", "REDIRECT", "COPY_TO_CLIPBOARD", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum ActionType {
        REDIRECT,
        COPY_TO_CLIPBOARD
    }

    public PrivacySheetParams(@NotNull String title, @NotNull String subtitle, @NotNull List<Action> actions, @NotNull String footerTitle, @NotNull String footerText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(footerTitle, "footerTitle");
        Intrinsics.checkNotNullParameter(footerText, "footerText");
        this.title = title;
        this.subtitle = subtitle;
        this.actions = actions;
        this.footerTitle = footerTitle;
        this.footerText = footerText;
    }

    public static /* synthetic */ PrivacySheetParams copy$default(PrivacySheetParams privacySheetParams, String str, String str2, List list, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = privacySheetParams.title;
        }
        if ((i & 2) != 0) {
            str2 = privacySheetParams.subtitle;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            list = privacySheetParams.actions;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str3 = privacySheetParams.footerTitle;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = privacySheetParams.footerText;
        }
        return privacySheetParams.copy(str, str5, list2, str6, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<Action> component3() {
        return this.actions;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getFooterTitle() {
        return this.footerTitle;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    @NotNull
    public final PrivacySheetParams copy(@NotNull String title, @NotNull String subtitle, @NotNull List<Action> actions, @NotNull String footerTitle, @NotNull String footerText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(footerTitle, "footerTitle");
        Intrinsics.checkNotNullParameter(footerText, "footerText");
        return new PrivacySheetParams(title, subtitle, actions, footerTitle, footerText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivacySheetParams)) {
            return false;
        }
        PrivacySheetParams privacySheetParams = (PrivacySheetParams) other;
        return Intrinsics.areEqual(this.title, privacySheetParams.title) && Intrinsics.areEqual(this.subtitle, privacySheetParams.subtitle) && Intrinsics.areEqual(this.actions, privacySheetParams.actions) && Intrinsics.areEqual(this.footerTitle, privacySheetParams.footerTitle) && Intrinsics.areEqual(this.footerText, privacySheetParams.footerText);
    }

    @NotNull
    public final List<Action> getActions() {
        return this.actions;
    }

    @NotNull
    public final String getFooterText() {
        return this.footerText;
    }

    @NotNull
    public final String getFooterTitle() {
        return this.footerTitle;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.actions.hashCode()) * 31) + this.footerTitle.hashCode()) * 31) + this.footerText.hashCode();
    }

    @NotNull
    public String toString() {
        return "PrivacySheetParams(title=" + this.title + ", subtitle=" + this.subtitle + ", actions=" + this.actions + ", footerTitle=" + this.footerTitle + ", footerText=" + this.footerText + ')';
    }
}
