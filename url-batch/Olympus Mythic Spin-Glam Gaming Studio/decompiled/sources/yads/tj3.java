package yads;

import android.content.Context;
import java.util.List;
import kotlin.collections.MapsKt;

/* loaded from: classes4.dex */
public final class tj3 {
    public final wh3 a;

    public tj3(Context context) {
        this.a = new wh3(context);
    }

    public final void a(sj3 sj3Var, String str) {
        List list = (List) sj3Var.a().get(str);
        if (list != null) {
            this.a.a(list, MapsKt.emptyMap());
        }
    }
}
