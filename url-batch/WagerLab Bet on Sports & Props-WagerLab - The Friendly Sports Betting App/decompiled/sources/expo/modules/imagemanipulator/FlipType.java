package expo.modules.imagemanipulator;

import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageManipulatorArguments.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/imagemanipulator/FlipType;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "VERTICAL", "HORIZONTAL", "expo-image-manipulator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FlipType implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FlipType[] $VALUES;
    private final String value;
    public static final FlipType VERTICAL = new FlipType("VERTICAL", 0, "vertical");
    public static final FlipType HORIZONTAL = new FlipType("HORIZONTAL", 1, "horizontal");

    private static final /* synthetic */ FlipType[] $values() {
        return new FlipType[]{VERTICAL, HORIZONTAL};
    }

    public static EnumEntries<FlipType> getEntries() {
        return $ENTRIES;
    }

    private FlipType(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        FlipType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static FlipType valueOf(String str) {
        return (FlipType) Enum.valueOf(FlipType.class, str);
    }

    public static FlipType[] values() {
        return (FlipType[]) $VALUES.clone();
    }
}
