package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SwipeToDismiss.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material/DismissDirection;", "", "<init>", "(Ljava/lang/String;I)V", "StartToEnd", "EndToStart", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DismissDirection {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DismissDirection[] $VALUES;
    public static final DismissDirection StartToEnd = new DismissDirection("StartToEnd", 0);
    public static final DismissDirection EndToStart = new DismissDirection("EndToStart", 1);

    private static final /* synthetic */ DismissDirection[] $values() {
        return new DismissDirection[]{StartToEnd, EndToStart};
    }

    public static EnumEntries<DismissDirection> getEntries() {
        return $ENTRIES;
    }

    private DismissDirection(String str, int i) {
    }

    static {
        DismissDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static DismissDirection valueOf(String str) {
        return (DismissDirection) Enum.valueOf(DismissDirection.class, str);
    }

    public static DismissDirection[] values() {
        return (DismissDirection[]) $VALUES.clone();
    }
}
