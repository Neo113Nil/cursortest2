package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$string;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes6.dex */
public final class ur1 {
    public final Context a;

    public ur1(Context context) {
        this.a = context;
    }

    public final String a(sr1 sr1Var) {
        int i = sr1Var == null ? -1 : tr1.a[sr1Var.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return this.a.getString(R$string.debug_panel_invalid_mediation_adapter_version);
        }
        throw new NoWhenBranchMatchedException();
    }
}
