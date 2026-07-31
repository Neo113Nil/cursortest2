package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;

/* loaded from: classes5.dex */
public final class gq {
    public gq(ot3 ot3Var) {
    }

    public final Intent a(Context context, String str, long j) {
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        intent.putExtra("window_type", "window_type_browser");
        intent.putExtra("extra_browser_url", str);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        intent.putExtra("data_identifier", j);
        return intent;
    }
}
