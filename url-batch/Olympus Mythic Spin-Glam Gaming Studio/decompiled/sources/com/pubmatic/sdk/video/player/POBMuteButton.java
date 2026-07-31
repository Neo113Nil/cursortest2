package com.pubmatic.sdk.video.player;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.annotation.LayoutRes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.pubmatic.sdk.video.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/pubmatic/sdk/video/player/POBMuteButton;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "", "layoutResId", "<init>", "(Landroid/content/Context;I)V", "", "a", "()V", "", "muted", "setMuted", "(Z)V", "isMuted", "()Z", "Lcom/pubmatic/sdk/video/player/POBMuteButton$MuteStateChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnMuteToggleListener", "(Lcom/pubmatic/sdk/video/player/POBMuteButton$MuteStateChangeListener;)V", "Landroid/widget/ImageButton;", "Landroid/widget/ImageButton;", "imageButton", "b", "Lcom/pubmatic/sdk/video/player/POBMuteButton$MuteStateChangeListener;", "MuteStateChangeListener", "video_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes15.dex */
public final class POBMuteButton extends FrameLayout {

    /* renamed from: a, reason: from kotlin metadata */
    private final ImageButton imageButton;

    /* renamed from: b, reason: from kotlin metadata */
    private MuteStateChangeListener listener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/pubmatic/sdk/video/player/POBMuteButton$MuteStateChangeListener;", "", "onMuteStateChange", "", "isMuted", "", "video_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface MuteStateChangeListener {
        void onMuteStateChange(boolean isMuted);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POBMuteButton(@NotNull Context context, @LayoutRes int i) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, i, this);
        View findViewById = findViewById(R.id.pob_mute_btn);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.pob_mute_btn)");
        this.imageButton = (ImageButton) findViewById;
        a();
    }

    private final void a() {
        this.imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.pubmatic.sdk.video.player.POBMuteButton$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                POBMuteButton.a(POBMuteButton.this, view);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.F, this, me);
        return super.dispatchTouchEvent(me);
    }

    public final boolean isMuted() {
        return this.imageButton.isSelected();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setMuted(boolean muted) {
        this.imageButton.setSelected(muted);
        this.imageButton.refreshDrawableState();
    }

    public final void setOnMuteToggleListener(@Nullable MuteStateChangeListener listener) {
        this.listener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(POBMuteButton this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = !this$0.isMuted();
        this$0.setMuted(z);
        MuteStateChangeListener muteStateChangeListener = this$0.listener;
        if (muteStateChangeListener != null) {
            muteStateChangeListener.onMuteStateChange(z);
        }
    }
}
