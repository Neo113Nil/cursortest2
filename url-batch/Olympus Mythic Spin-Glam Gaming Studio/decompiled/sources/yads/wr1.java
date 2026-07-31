package yads;

import com.my.target.common.DisclaimerAlias;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class wr1 {
    public static final vr1 c;
    public static final LinkedHashMap d;
    public static final wr1 e;
    public static final wr1 f;
    public static final wr1 g;
    public static final wr1 h;
    public static final wr1 i;
    public static final wr1 j;
    public static final wr1 k;
    public static final wr1 l;
    public static final wr1 m;
    public static final wr1 n;
    public static final wr1 o;
    public static final wr1 p;
    public static final wr1 q;
    public static final wr1 r;
    public static final wr1 s;
    public static final wr1 t;
    public static final wr1 u;
    public static final wr1 v;
    public static final wr1 w;
    public static final wr1 x;
    public static final /* synthetic */ wr1[] y;
    public final String b;

    static {
        wr1 wr1Var = new wr1(0, "APPLOVIN", "applovin");
        e = wr1Var;
        wr1 wr1Var2 = new wr1(1, "APPLOVIN_MAX", "applovin_max");
        f = wr1Var2;
        wr1 wr1Var3 = new wr1(2, "APPNEXT", "appnext");
        g = wr1Var3;
        wr1 wr1Var4 = new wr1(3, "BIGOADS", "bigoads");
        h = wr1Var4;
        wr1 wr1Var5 = new wr1(4, "CHARTBOOST", "chartboost");
        i = wr1Var5;
        wr1 wr1Var6 = new wr1(5, "ADMOB", "admob");
        j = wr1Var6;
        wr1 wr1Var7 = new wr1(6, "ADMANAGER", "admanager");
        k = wr1Var7;
        wr1 wr1Var8 = new wr1(7, "DIGITAL_TURBINE", "digitalturbine");
        l = wr1Var8;
        wr1 wr1Var9 = new wr1(8, "INMOBI", "inmobi");
        m = wr1Var9;
        wr1 wr1Var10 = new wr1(9, "IRONSOURCE", "ironsource");
        n = wr1Var10;
        wr1 wr1Var11 = new wr1(10, "MINTEGRAL", "mintegral");
        o = wr1Var11;
        wr1 wr1Var12 = new wr1(11, "MYTARGET", "mytarget");
        p = wr1Var12;
        wr1 wr1Var13 = new wr1(12, "PANGLE", "pangle");
        q = wr1Var13;
        wr1 wr1Var14 = new wr1(13, "PETALADS", "petalads");
        r = wr1Var14;
        wr1 wr1Var15 = new wr1(14, "STARTAPP", "startapp");
        s = wr1Var15;
        wr1 wr1Var16 = new wr1(15, "TAPJOY", "tapjoy");
        t = wr1Var16;
        wr1 wr1Var17 = new wr1(16, "UNITYADS", "unityads");
        u = wr1Var17;
        wr1 wr1Var18 = new wr1(17, "VUNGLE", "vungle");
        v = wr1Var18;
        wr1 wr1Var19 = new wr1(18, "ZMATICOO", "zmaticoo");
        w = wr1Var19;
        wr1 wr1Var20 = new wr1(19, DisclaimerAlias.UNDEFINED, "undefined");
        x = wr1Var20;
        wr1[] wr1VarArr = {wr1Var, wr1Var2, wr1Var3, wr1Var4, wr1Var5, wr1Var6, wr1Var7, wr1Var8, wr1Var9, wr1Var10, wr1Var11, wr1Var12, wr1Var13, wr1Var14, wr1Var15, wr1Var16, wr1Var17, wr1Var18, wr1Var19, wr1Var20};
        y = wr1VarArr;
        EnumEntries enumEntries = EnumEntriesKt.enumEntries(wr1VarArr);
        c = new vr1();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(enumEntries, 10)), 16));
        for (Object obj : enumEntries) {
            linkedHashMap.put(((wr1) obj).b, obj);
        }
        d = linkedHashMap;
    }

    public wr1(int i2, String str, String str2) {
        this.b = str2;
    }

    public static wr1 valueOf(String str) {
        return (wr1) Enum.valueOf(wr1.class, str);
    }

    public static wr1[] values() {
        return (wr1[]) y.clone();
    }
}
