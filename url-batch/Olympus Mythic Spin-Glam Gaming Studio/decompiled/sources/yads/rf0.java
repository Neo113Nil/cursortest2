package yads;

import android.content.Context;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;

/* loaded from: classes12.dex */
public final class rf0 {
    public final AppMetricaAdapter a;

    public rf0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = new AppMetricaAdapter(applicationContext != null ? applicationContext : context);
    }
}
