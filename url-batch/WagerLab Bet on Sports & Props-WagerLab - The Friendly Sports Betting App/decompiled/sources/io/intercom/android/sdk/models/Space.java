package io.intercom.android.sdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Space.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0005H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/models/Space;", "", "type", "Lio/intercom/android/sdk/models/Space$Type;", "label", "", "<init>", "(Lio/intercom/android/sdk/models/Space$Type;Ljava/lang/String;)V", "getType", "()Lio/intercom/android/sdk/models/Space$Type;", "getLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Type", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Space {
    public static final int $stable = 0;

    @SerializedName("label")
    private final String label;

    @SerializedName("type")
    private final Type type;

    /* JADX WARN: Multi-variable type inference failed */
    public Space() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Space copy$default(Space space, Type type, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            type = space.type;
        }
        if ((i & 2) != 0) {
            str = space.label;
        }
        return space.copy(type, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final Space copy(Type type, String label) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new Space(type, label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Space)) {
            return false;
        }
        Space space = (Space) other;
        return this.type == space.type && Intrinsics.areEqual(this.label, space.label);
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.label;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Space(type=" + this.type + ", label=" + this.label + ')';
    }

    public Space(Type type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.label = str;
    }

    public final Type getType() {
        return this.type;
    }

    public /* synthetic */ Space(Type type, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Type.HOME : type, (i & 2) != 0 ? null : str);
    }

    public final String getLabel() {
        return this.label;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Space.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/models/Space$Type;", "", "<init>", "(Ljava/lang/String;I)V", "HOME", "MESSAGES", "HELP", "TICKETS", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @SerializedName("home")
        public static final Type HOME = new Type("HOME", 0);

        @SerializedName("messages")
        public static final Type MESSAGES = new Type("MESSAGES", 1);

        @SerializedName("help")
        public static final Type HELP = new Type("HELP", 2);

        @SerializedName("tickets")
        public static final Type TICKETS = new Type("TICKETS", 3);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{HOME, MESSAGES, HELP, TICKETS};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i) {
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }
}
