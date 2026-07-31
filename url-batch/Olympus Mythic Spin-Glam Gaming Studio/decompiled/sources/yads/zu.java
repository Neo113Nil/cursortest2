package yads;

import com.ironsource.X3;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class zu {
    public static final yu c;
    public static final zu d;
    public static final /* synthetic */ zu[] e;
    public final String b;

    static {
        zu zuVar = new zu(0, "BROWSER", "browser");
        zu zuVar2 = new zu(1, "WEBVIEW", X3.i.K);
        d = zuVar2;
        zu[] zuVarArr = {zuVar, zuVar2};
        e = zuVarArr;
        EnumEntriesKt.enumEntries(zuVarArr);
        c = new yu();
    }

    public zu(int i, String str, String str2) {
        this.b = str2;
    }

    public static zu valueOf(String str) {
        return (zu) Enum.valueOf(zu.class, str);
    }

    public static zu[] values() {
        return (zu[]) e.clone();
    }
}
