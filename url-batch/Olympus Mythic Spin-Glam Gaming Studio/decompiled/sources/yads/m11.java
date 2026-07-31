package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class m11 {
    public static final l11 c;
    public static final /* synthetic */ m11[] d;
    public final String b;

    static {
        m11[] m11VarArr = {new m11(0, "STATIC_RESOURCE", "StaticResource"), new m11(1, "IFRAME_RESOURCE", "IFrameResource"), new m11(2, "HTML_RESOURCE", "HTMLResource")};
        d = m11VarArr;
        EnumEntriesKt.enumEntries(m11VarArr);
        c = new l11();
    }

    public m11(int i, String str, String str2) {
        this.b = str2;
    }

    public static m11 valueOf(String str) {
        return (m11) Enum.valueOf(m11.class, str);
    }

    public static m11[] values() {
        return (m11[]) d.clone();
    }
}
