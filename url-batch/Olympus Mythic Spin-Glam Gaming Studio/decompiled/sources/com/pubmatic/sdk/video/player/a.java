package com.pubmatic.sdk.video.player;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.R;
import com.pubmatic.sdk.webrendering.POBUIUtil;

/* loaded from: classes13.dex */
abstract class a {

    /* renamed from: com.pubmatic.sdk.video.player.a$a, reason: collision with other inner class name */
    class RunnableC1691a implements Runnable {
        final /* synthetic */ View a;

        RunnableC1691a(View view) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.setVisibility(4);
        }
    }

    public static FrameLayout.LayoutParams a(Context context, int i, int i2, ImageButton imageButton, boolean z) {
        int a = a(context, imageButton, z);
        int b = b(context, imageButton, z);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.pob_industry_icon_min_height);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.pob_industry_icon_max_height);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.pob_industry_icon_min_width);
        int dimensionPixelOffset4 = context.getResources().getDimensionPixelOffset(R.dimen.pob_industry_icon_max_width);
        int convertDpToPixel = POBUtils.convertDpToPixel(i2);
        int convertDpToPixel2 = POBUtils.convertDpToPixel(i);
        int min = Math.min(dimensionPixelOffset2, Math.max(dimensionPixelOffset, convertDpToPixel));
        int min2 = Math.min(dimensionPixelOffset4, Math.max(dimensionPixelOffset3, convertDpToPixel2));
        POBLog.debug("POBVastPlayerUIUtil", "Rendered industry icon with size : %dx%d", Integer.valueOf(min2), Integer.valueOf(min));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(min2, min);
        layoutParams.leftMargin = a;
        layoutParams.topMargin = b;
        return layoutParams;
    }

    private static int b(Context context, ImageButton imageButton, boolean z) {
        return imageButton != null ? context.getResources().getDimensionPixelOffset(R.dimen.pob_industry_icon_top_margin) + (z ? context.getResources().getDimensionPixelOffset(com.pubmatic.sdk.webrendering.R.dimen.pob_ad_info_icon_margin_fullscreen) : context.getResources().getDimensionPixelOffset(com.pubmatic.sdk.webrendering.R.dimen.pob_ad_info_icon_margin)) : context.getResources().getDimensionPixelOffset(R.dimen.pob_mute_button_bottom_margin);
    }

    static void b(View view, int i) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            view.animate().alpha(1.0f).setDuration(i);
        }
    }

    private static int a(Context context, ImageButton imageButton, boolean z) {
        int dimensionPixelOffset;
        if (z) {
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.pubmatic.sdk.webrendering.R.dimen.pob_ad_info_icon_margin_fullscreen);
        } else {
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.pubmatic.sdk.webrendering.R.dimen.pob_ad_info_icon_margin);
        }
        if (imageButton != null) {
            return context.getResources().getDimensionPixelOffset(R.dimen.pob_mute_button_left_margin) + dimensionPixelOffset + imageButton.getLayoutParams().width;
        }
        return context.getResources().getDimensionPixelOffset(R.dimen.pob_mute_button_left_margin);
    }

    static TextView a(Context context, int i, String str, int i2) {
        Resources resources = context.getResources();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, resources.getDimensionPixelOffset(com.pubmatic.sdk.webrendering.R.dimen.pob_control_height));
        layoutParams.gravity = 8388693;
        layoutParams.bottomMargin = resources.getDimensionPixelOffset(R.dimen.pob_learn_more_bottom_margin);
        layoutParams.rightMargin = resources.getDimensionPixelOffset(R.dimen.pob_learn_more_right_margin);
        TextView createTextView = POBUIUtil.createTextView(context, str, resources.getDimensionPixelOffset(com.pubmatic.sdk.webrendering.R.dimen.pob_text_size), i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(resources.getDimensionPixelOffset(R.dimen.pob_learn_more_radius));
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(resources.getDimensionPixelOffset(com.pubmatic.sdk.webrendering.R.dimen.pob_control_stroke_width), resources.getColor(com.pubmatic.sdk.webrendering.R.color.pob_controls_stroke_color));
        gradientDrawable.setAlpha(resources.getInteger(com.pubmatic.sdk.webrendering.R.integer.pob_controls_alpha));
        createTextView.setBackground(gradientDrawable);
        int i3 = layoutParams.rightMargin;
        createTextView.setPadding(i3, 0, i3, 0);
        createTextView.setMaxWidth(resources.getDimensionPixelOffset(R.dimen.pob_learn_more_width_max));
        createTextView.setMaxLines(1);
        createTextView.setEllipsize(TextUtils.TruncateAt.END);
        createTextView.setLayoutParams(layoutParams);
        return createTextView;
    }

    static void a(View view, int i) {
        if (view.getVisibility() == 0) {
            long j = i;
            view.animate().alpha(0.0f).setDuration(j);
            new Handler().postDelayed(new RunnableC1691a(view), j);
        }
    }
}
