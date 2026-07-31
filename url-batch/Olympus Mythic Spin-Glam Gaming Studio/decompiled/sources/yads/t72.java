package yads;

import android.content.Context;
import android.util.TypedValue;
import android.view.TextureView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer;
import com.yandex.mobile.ads.R$drawable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* loaded from: classes.dex */
public final class t72 {
    public final q0 a;
    public final ni3 b;
    public final p63 c;

    public t72() {
        q0 q0Var = new q0();
        ni3 ni3Var = new ni3();
        p63 p63Var = new p63();
        this.a = q0Var;
        this.b = ni3Var;
        this.c = p63Var;
    }

    public final q72 a(Context context, ii3 ii3Var, sn3 sn3Var, de3 de3Var, int i) {
        this.c.getClass();
        TextureView textureView = new TextureView(context);
        textureView.setVisibility(8);
        q0 q0Var = this.a;
        bl1 bl1Var = q0Var.b.a;
        ImageView imageView = null;
        dl1 a30Var = (sn3Var.getMuteControl() == null && sn3Var.getVideoProgress() == null) ? (dl1) qs2.a(context, CorePlaybackControlsContainer.class, i, null) : new a30(sn3Var.getMuteControl(), sn3Var.getVideoProgress(), null);
        Button a = q0Var.a.a.a(context);
        a.setTag(el3.a("replay_button"));
        a.setVisibility(8);
        wn2 wn2Var = new wn2(context, a);
        wn2Var.addView(a);
        p52 p52Var = new p52(context, wn2Var, a30Var);
        q0Var.c.getClass();
        dl1 dl1Var = p52Var.b;
        p52Var.a.setVisibility(8);
        CheckBox muteControl = dl1Var != null ? dl1Var.getMuteControl() : null;
        if (muteControl != null) {
            muteControl.setVisibility(8);
        }
        ProgressBar videoProgress = dl1Var != null ? dl1Var.getVideoProgress() : null;
        if (videoProgress != null) {
            videoProgress.setVisibility(8);
        }
        TextView countDownProgress = dl1Var != null ? dl1Var.getCountDownProgress() : null;
        if (countDownProgress != null) {
            countDownProgress.setVisibility(8);
        }
        CheckBox muteControl2 = dl1Var != null ? dl1Var.getMuteControl() : null;
        if (muteControl2 != null) {
            muteControl2.setChecked(Intrinsics.areEqual(ii3Var.d, 0.0d) || ii3Var.d == null);
        }
        p52Var.setVisibility(8);
        ni3 ni3Var = this.b;
        ni3Var.b.getClass();
        if ((de3Var != null ? de3Var.c : null) != null) {
            imageView = new ImageView(context);
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ni3Var.a.getClass();
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminateDrawable(ContextCompat.getDrawable(context, R$drawable.monetization_ads_video_progress_bar_background));
        int roundToInt = MathKt.roundToInt(TypedValue.applyDimension(1, 45.0f, context.getResources().getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(roundToInt, roundToInt);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        progressBar.setVisibility(8);
        progressBar.setTag(el3.a("video_placeholder_spinner"));
        mi3 mi3Var = new mi3(context, progressBar, imageView);
        mi3Var.addView(progressBar);
        if (imageView != null) {
            mi3Var.addView(imageView);
        }
        mi3Var.setBackgroundColor(-16777216);
        mi3Var.setVisibility(8);
        q72 q72Var = new q72(context, mi3Var, textureView, p52Var);
        q72Var.addView(mi3Var);
        q72Var.addView(textureView);
        q72Var.addView(p52Var);
        q72Var.setTag(el3.a("native_video_view"));
        return q72Var;
    }
}
