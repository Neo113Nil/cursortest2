package com.pubmatic.sdk.nativead.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.pubmatic.sdk.nativead.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes6.dex */
public class POBNativeTemplateView extends RelativeLayout {
    private ImageView a;
    private ImageView b;
    private ImageView c;
    private TextView d;
    private TextView e;
    private Button f;

    @Nullable
    protected FrameLayout mediaViewContainer;

    protected POBNativeTemplateView(@NonNull Context context, @LayoutRes int i) {
        super(context);
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.mediaViewContainer = null;
        View.inflate(context, i, this);
        this.a = (ImageView) findViewById(R.id.pob_ad_icon);
        this.b = (ImageView) findViewById(R.id.pob_privacy_icon);
        this.d = (TextView) findViewById(R.id.pob_title);
        this.e = (TextView) findViewById(R.id.pob_description);
        this.f = (Button) findViewById(R.id.pob_cta_text);
        this.c = (ImageView) findViewById(R.id.pob_ad_info_icon_btn);
        this.mediaViewContainer = (FrameLayout) findViewById(R.id.pob_media_view);
    }

    private void setAdClickListeners(@NonNull View.OnClickListener onClickListener) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
        Button button = this.f;
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
        TextView textView2 = this.e;
        if (textView2 != null) {
            textView2.setOnClickListener(onClickListener);
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
        ImageView imageView2 = this.c;
        if (imageView2 != null) {
            imageView2.setOnClickListener(onClickListener);
        }
        FrameLayout frameLayout = this.mediaViewContainer;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.F, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public ImageView getAdIcon() {
        return this.a;
    }

    @Nullable
    public ImageView getAdInfoIcon() {
        return this.c;
    }

    @Nullable
    public Button getCta() {
        return this.f;
    }

    @Nullable
    public TextView getDescription() {
        return this.e;
    }

    @Nullable
    public FrameLayout getMediaView() {
        return this.mediaViewContainer;
    }

    @Nullable
    public ImageView getPrivacyIcon() {
        return this.b;
    }

    @Nullable
    public TextView getTitle() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextView textView = this.d;
        if (textView != null) {
            textView.setTag(1);
        }
        TextView textView2 = this.e;
        if (textView2 != null) {
            textView2.setTag(3);
        }
        Button button = this.f;
        if (button != null) {
            button.setTag(4);
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setTag("privacy_icon");
        }
        ImageView imageView2 = this.c;
        if (imageView2 != null) {
            imageView2.setTag(POBNativeConstants.POB_NATIVE_ID_AD_INFO);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setAdIcon(@Nullable ImageView imageView) {
        this.a = imageView;
    }

    public void setAdInfoIcon(@Nullable ImageView imageView) {
        this.c = imageView;
    }

    public void setCta(@Nullable Button button) {
        this.f = button;
    }

    public void setDescription(@Nullable TextView textView) {
        this.e = textView;
    }

    public void setMediaView(@Nullable FrameLayout frameLayout) {
        this.mediaViewContainer = frameLayout;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener != null) {
            setAdClickListeners(onClickListener);
        }
    }

    public void setPrivacyIcon(@Nullable ImageView imageView) {
        this.b = imageView;
    }

    public void setTitle(@Nullable TextView textView) {
        this.d = textView;
    }

    public POBNativeTemplateView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.mediaViewContainer = null;
    }

    public POBNativeTemplateView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.mediaViewContainer = null;
    }

    @RequiresApi
    public POBNativeTemplateView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.mediaViewContainer = null;
    }
}
