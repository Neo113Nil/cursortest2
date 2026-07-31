package yads;

import com.facebook.share.internal.ShareConstants;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class aw {
    public static final aw b;
    public static final aw c;
    public static final /* synthetic */ aw[] d;

    static {
        aw awVar = new aw(0, "TEXT");
        b = awVar;
        aw awVar2 = new aw(1, ShareConstants.IMAGE_URL);
        c = awVar2;
        aw[] awVarArr = {awVar, awVar2};
        d = awVarArr;
        EnumEntriesKt.enumEntries(awVarArr);
    }

    public aw(int i, String str) {
    }

    public static aw valueOf(String str) {
        return (aw) Enum.valueOf(aw.class, str);
    }

    public static aw[] values() {
        return (aw[]) d.clone();
    }
}
