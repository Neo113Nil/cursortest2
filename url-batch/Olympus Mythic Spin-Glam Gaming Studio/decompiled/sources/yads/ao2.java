package yads;

import android.content.Context;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.R$drawable;

/* loaded from: classes3.dex */
public final class ao2 {
    public final Button a(Context context) {
        Button button = new Button(context);
        button.setBackground(ContextCompat.getDrawable(context, R$drawable.monetization_ads_video_ic_replay));
        int a = yg0.a(context, 90.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        layoutParams.gravity = 17;
        button.setLayoutParams(layoutParams);
        return button;
    }
}
