package expo.modules.updates;

import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UpdatesModule.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lexpo/modules/updates/UpdatesJSEvent;", "Lexpo/modules/kotlin/types/Enumerable;", "", "eventName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "StateChange", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpdatesJSEvent implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UpdatesJSEvent[] $VALUES;
    public static final UpdatesJSEvent StateChange = new UpdatesJSEvent("StateChange", 0, "Expo.nativeUpdatesStateChangeEvent");
    private final String eventName;

    private static final /* synthetic */ UpdatesJSEvent[] $values() {
        return new UpdatesJSEvent[]{StateChange};
    }

    public static EnumEntries<UpdatesJSEvent> getEntries() {
        return $ENTRIES;
    }

    private UpdatesJSEvent(String str, int i, String str2) {
        this.eventName = str2;
    }

    public final String getEventName() {
        return this.eventName;
    }

    static {
        UpdatesJSEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static UpdatesJSEvent valueOf(String str) {
        return (UpdatesJSEvent) Enum.valueOf(UpdatesJSEvent.class, str);
    }

    public static UpdatesJSEvent[] values() {
        return (UpdatesJSEvent[]) $VALUES.clone();
    }
}
