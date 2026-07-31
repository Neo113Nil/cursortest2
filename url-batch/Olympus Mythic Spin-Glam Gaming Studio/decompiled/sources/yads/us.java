package yads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.R$color;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class us {
    public final Handler a;
    public final ay b;

    public us(Activity activity) {
        Handler handler = new Handler(Looper.getMainLooper());
        ay ayVar = new ay(CollectionsKt.listOf((Object[]) new yd[]{new xk(), new g63(activity.getResources().getColor(R$color.monetization_ads_internal_text_color_white))}));
        this.a = handler;
        this.b = ayVar;
    }
}
