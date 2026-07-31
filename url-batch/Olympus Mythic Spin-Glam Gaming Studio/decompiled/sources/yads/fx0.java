package yads;

import android.app.Activity;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;

/* loaded from: classes14.dex */
public final class fx0 {
    public fx0(ot3 ot3Var) {
    }

    public final Intent a(Activity activity, long j) {
        Intent intent = new Intent(activity, (Class<?>) AdActivity.class);
        intent.putExtra("window_type", "window_type_fullscreen");
        intent.putExtra("data_identifier", j);
        if (activity == null) {
            intent.addFlags(402653184);
        }
        return intent;
    }
}
