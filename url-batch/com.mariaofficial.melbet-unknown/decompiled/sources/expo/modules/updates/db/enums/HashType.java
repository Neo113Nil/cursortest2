package expo.modules.updates.db.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HashType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lexpo/modules/updates/db/enums/HashType;", "", "<init>", "(Ljava/lang/String;I)V", "SHA256", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HashType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HashType[] $VALUES;
    public static final HashType SHA256 = new HashType("SHA256", 0);

    private static final /* synthetic */ HashType[] $values() {
        return new HashType[]{SHA256};
    }

    public static EnumEntries<HashType> getEntries() {
        return $ENTRIES;
    }

    private HashType(String str, int i) {
    }

    static {
        HashType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static HashType valueOf(String str) {
        return (HashType) Enum.valueOf(HashType.class, str);
    }

    public static HashType[] values() {
        return (HashType[]) $VALUES.clone();
    }
}
