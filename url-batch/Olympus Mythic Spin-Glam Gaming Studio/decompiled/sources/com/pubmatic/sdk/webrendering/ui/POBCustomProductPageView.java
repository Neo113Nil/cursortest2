package com.pubmatic.sdk.webrendering.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class POBCustomProductPageView extends FrameLayout {
    private final Button a;
    private final ImageView b;

    public POBCustomProductPageView(@NonNull Context context) {
        super(context);
        View.inflate(context, R.layout.pob_custom_product_layout, this);
        Button button = (Button) findViewById(R.id.pob_install_btn);
        this.a = button;
        this.b = (ImageView) findViewById(R.id.pob_custom_product_close_btn);
        button.setText(POBUIUtil.getLocalizedStringForKey(context, "pob_openwrap_install_button_title", "Install"));
        setOnClickListener(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.F, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void enableAdInfoBtn(@NonNull View.OnClickListener onClickListener) {
        ImageView imageView = (ImageView) findViewById(R.id.pob_ad_info_icon_btn);
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setCloseBtnClickListener(@NonNull View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    public void setInstallButtonClickListener(@Nullable View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
