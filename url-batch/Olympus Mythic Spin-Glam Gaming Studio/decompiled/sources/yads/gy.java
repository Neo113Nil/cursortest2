package yads;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class gy {
    public static final gy b;
    public static final gy c;
    public static final gy d;
    public static final /* synthetic */ gy[] e;

    static {
        gy gyVar = new gy(0, "FAVICON");
        b = gyVar;
        gy gyVar2 = new gy(1, NativeAdContent.ViewTag.AD_ICON);
        c = gyVar2;
        gy gyVar3 = new gy(2, "THUMB");
        d = gyVar3;
        gy[] gyVarArr = {gyVar, gyVar2, gyVar3};
        e = gyVarArr;
        EnumEntriesKt.enumEntries(gyVarArr);
    }

    public gy(int i, String str) {
    }

    public static gy valueOf(String str) {
        return (gy) Enum.valueOf(gy.class, str);
    }

    public static gy[] values() {
        return (gy[]) e.clone();
    }
}
