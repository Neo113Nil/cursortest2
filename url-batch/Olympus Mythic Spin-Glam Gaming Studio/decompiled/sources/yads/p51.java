package yads;

import android.content.Context;
import java.io.File;

/* loaded from: classes3.dex */
public final class p51 {
    public final Context a;

    public p51(Context context) {
        this.a = context;
    }

    public final File a() {
        File file = new File(this.a.getCacheDir(), "debug_panel");
        file.mkdir();
        return new File(file, "monetization_ads_debug_panel_report.txt");
    }
}
