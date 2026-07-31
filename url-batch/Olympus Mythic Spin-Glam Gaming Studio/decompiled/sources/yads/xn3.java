package yads;

import com.ironsource.C4538a2;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class xn3 {
    public static final wn3 c;
    public static final LinkedHashMap d;
    public static final xn3 e;
    public static final /* synthetic */ xn3[] f;
    public final String b;

    static {
        xn3 xn3Var = new xn3(0, "DEFAULT", "default");
        e = xn3Var;
        xn3[] xn3VarArr = {xn3Var, new xn3(1, "CACHE_ELSE_NETWORK", "cache_else_network"), new xn3(2, "CACHE_ONLY", "cache_only"), new xn3(3, "DISABLED", C4538a2.e)};
        f = xn3VarArr;
        EnumEntries enumEntries = EnumEntriesKt.enumEntries(xn3VarArr);
        c = new wn3();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(enumEntries, 10)), 16));
        for (Object obj : enumEntries) {
            linkedHashMap.put(((xn3) obj).b, obj);
        }
        d = linkedHashMap;
    }

    public xn3(int i, String str, String str2) {
        this.b = str2;
    }

    public static xn3 valueOf(String str) {
        return (xn3) Enum.valueOf(xn3.class, str);
    }

    public static xn3[] values() {
        return (xn3[]) f.clone();
    }
}
