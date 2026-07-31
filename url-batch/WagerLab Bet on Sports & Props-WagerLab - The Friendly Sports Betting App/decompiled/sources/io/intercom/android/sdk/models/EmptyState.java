package io.intercom.android.sdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.m5.home.data.IconType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmptyState.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/models/EmptyState;", "", "title", "", "text", "action", "Lio/intercom/android/sdk/models/EmptyState$Action;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/EmptyState$Action;)V", "getTitle", "()Ljava/lang/String;", "getText", "getAction", "()Lio/intercom/android/sdk/models/EmptyState$Action;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Action", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EmptyState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final EmptyState NULL = new EmptyState(null, null, null, 7, null);

    @SerializedName("action")
    private final Action action;

    @SerializedName("text")
    private final String text;

    @SerializedName("title")
    private final String title;

    public EmptyState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ EmptyState copy$default(EmptyState emptyState, String str, String str2, Action action, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emptyState.title;
        }
        if ((i & 2) != 0) {
            str2 = emptyState.text;
        }
        if ((i & 4) != 0) {
            action = emptyState.action;
        }
        return emptyState.copy(str, str2, action);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    public final EmptyState copy(String title, String text, Action action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        return new EmptyState(title, text, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyState)) {
            return false;
        }
        EmptyState emptyState = (EmptyState) other;
        return Intrinsics.areEqual(this.title, emptyState.title) && Intrinsics.areEqual(this.text, emptyState.text) && Intrinsics.areEqual(this.action, emptyState.action);
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.text.hashCode()) * 31) + this.action.hashCode();
    }

    public String toString() {
        return "EmptyState(title=" + this.title + ", text=" + this.text + ", action=" + this.action + ')';
    }

    public EmptyState(String title, String text, Action action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.title = title;
        this.text = text;
        this.action = action;
    }

    public /* synthetic */ EmptyState(String str, String str2, Action action, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new Action(null, null, null, 7, null) : action);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getText() {
        return this.text;
    }

    public final Action getAction() {
        return this.action;
    }

    /* compiled from: EmptyState.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0005H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/models/EmptyState$Action;", "", "type", "Lio/intercom/android/sdk/models/ActionType;", "label", "", "icon", "Lio/intercom/android/sdk/m5/home/data/IconType;", "<init>", "(Lio/intercom/android/sdk/models/ActionType;Ljava/lang/String;Lio/intercom/android/sdk/m5/home/data/IconType;)V", "getType", "()Lio/intercom/android/sdk/models/ActionType;", "getLabel", "()Ljava/lang/String;", "getIcon", "()Lio/intercom/android/sdk/m5/home/data/IconType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action {
        public static final int $stable = 0;

        @SerializedName("icon")
        private final IconType icon;

        @SerializedName("label")
        private final String label;

        @SerializedName("type")
        private final ActionType type;

        public Action() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Action copy$default(Action action, ActionType actionType, String str, IconType iconType, int i, Object obj) {
            if ((i & 1) != 0) {
                actionType = action.type;
            }
            if ((i & 2) != 0) {
                str = action.label;
            }
            if ((i & 4) != 0) {
                iconType = action.icon;
            }
            return action.copy(actionType, str, iconType);
        }

        /* renamed from: component1, reason: from getter */
        public final ActionType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component3, reason: from getter */
        public final IconType getIcon() {
            return this.icon;
        }

        public final Action copy(ActionType type, String label, IconType icon) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(label, "label");
            return new Action(type, label, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return this.type == action.type && Intrinsics.areEqual(this.label, action.label) && this.icon == action.icon;
        }

        public int hashCode() {
            int hashCode = ((this.type.hashCode() * 31) + this.label.hashCode()) * 31;
            IconType iconType = this.icon;
            return hashCode + (iconType == null ? 0 : iconType.hashCode());
        }

        public String toString() {
            return "Action(type=" + this.type + ", label=" + this.label + ", icon=" + this.icon + ')';
        }

        public Action(ActionType type, String label, IconType iconType) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(label, "label");
            this.type = type;
            this.label = label;
            this.icon = iconType;
        }

        public final ActionType getType() {
            return this.type;
        }

        public /* synthetic */ Action(ActionType actionType, String str, IconType iconType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ActionType.MESSAGE : actionType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : iconType);
        }

        public final String getLabel() {
            return this.label;
        }

        public final IconType getIcon() {
            return this.icon;
        }
    }

    /* compiled from: EmptyState.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/models/EmptyState$Companion;", "", "<init>", "()V", "NULL", "Lio/intercom/android/sdk/models/EmptyState;", "getNULL", "()Lio/intercom/android/sdk/models/EmptyState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EmptyState getNULL() {
            return EmptyState.NULL;
        }
    }
}
