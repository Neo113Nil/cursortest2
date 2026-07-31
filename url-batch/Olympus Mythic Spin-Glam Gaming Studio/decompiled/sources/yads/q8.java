package yads;

import android.content.Context;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntriesKt;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q8 {
    public static final p8 c;
    public static final Map d;
    public static final q8 e;
    public static final q8 f;
    public static final q8 g;
    public static final /* synthetic */ q8[] h;
    public final yg0 b = new yg0();

    static {
        q8 q8Var = new q8(0, "BROWSER_CONTROL_PANEL_HEIGHT");
        e = q8Var;
        q8 q8Var2 = new q8(1, "BROWSER_CONTROL_PANEL_BUTTON_PADDING");
        f = q8Var2;
        q8 q8Var3 = new q8(2, "BROWSER_CONTROL_PANEL_TITLE_TEXT_SIZE");
        g = q8Var3;
        q8[] q8VarArr = {q8Var, q8Var2, q8Var3};
        h = q8VarArr;
        EnumEntriesKt.enumEntries(q8VarArr);
        c = new p8();
        d = MapsKt.mutableMapOf(TuplesKt.to(p8.a("values_dimen_%s", q8Var.name()), 48), TuplesKt.to(p8.a("values_dimen_%s_sw600dp", q8Var.name()), 56), TuplesKt.to(p8.a("values_dimen_%s", q8Var2.name()), 15), TuplesKt.to(p8.a("values_dimen_%s_sw600dp", q8Var2.name()), 17), TuplesKt.to(p8.a("values_dimen_%s", q8Var3.name()), 19), TuplesKt.to(p8.a("values_dimen_%s_sw600dp", q8Var3.name()), 23));
    }

    public q8(int i, String str) {
    }

    public static q8 valueOf(String str) {
        return (q8) Enum.valueOf(q8.class, str);
    }

    public static q8[] values() {
        return (q8[]) h.clone();
    }

    public final int a(Context context) {
        try {
            p8 p8Var = c;
            StringBuilder sb = new StringBuilder(name());
            if (RangesKt.coerceAtMost(hl3.d(context), hl3.b(context)) >= 600) {
                sb.append("_sw600dp");
            }
            String sb2 = sb.toString();
            p8Var.getClass();
            Integer num = (Integer) d.get(p8.a("values_dimen_%s", sb2));
            if (num != null) {
                return num.intValue();
            }
        } catch (Exception unused) {
        }
        try {
            p8 p8Var2 = c;
            String name = name();
            p8Var2.getClass();
            Integer num2 = (Integer) d.get(p8.a("values_dimen_%s", name));
            if (num2 != null) {
                return num2.intValue();
            }
            return 0;
        } catch (Exception unused2) {
            return 0;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name();
    }
}
