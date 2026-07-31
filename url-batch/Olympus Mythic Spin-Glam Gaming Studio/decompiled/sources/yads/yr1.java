package yads;

import com.ironsource.O6;
import java.util.LinkedHashMap;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class yr1 {
    public static io2 a(er1 er1Var) {
        io2 io2Var = new io2(new LinkedHashMap(), 2);
        String str = er1Var.b;
        io2Var.b(str, O6.G1);
        io2Var.b(er1Var.c, "adapter_parameters");
        CharSequence charSequence = (CharSequence) er1Var.c.get("bidding_data");
        boolean z = false;
        io2Var.b(Boolean.valueOf(!(charSequence == null || StringsKt.isBlank(charSequence))), "mediation_bidder");
        if (StringsKt.contains((CharSequence) str, (CharSequence) "LevelPlay", true)) {
            try {
                Class.forName("com.yandex.ads.mobile.ads.mediation.extras.BuildConfig");
                z = true;
            } catch (ClassNotFoundException unused) {
            }
            io2Var.b(Boolean.valueOf(z), "has_extras");
        }
        return io2Var;
    }
}
