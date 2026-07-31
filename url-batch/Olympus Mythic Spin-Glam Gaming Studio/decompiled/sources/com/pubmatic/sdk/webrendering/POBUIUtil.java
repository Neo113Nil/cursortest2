package com.pubmatic.sdk.webrendering;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.view.POBOpenStoreButton;
import com.yandex.div.internal.widget.DivLayoutParams;

/* loaded from: classes14.dex */
public class POBUIUtil {
    private static InsetDrawable a(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        Resources resources = context.getResources();
        gradientDrawable.setColor(resources.getColor(R.color.pob_controls_background_color));
        gradientDrawable.setStroke(resources.getDimensionPixelOffset(R.dimen.pob_control_stroke_width), resources.getColor(R.color.pob_controls_stroke_color));
        gradientDrawable.setAlpha(resources.getInteger(R.integer.pob_controls_alpha));
        return new InsetDrawable((Drawable) gradientDrawable, resources.getDimensionPixelOffset(R.dimen.pob_control_padding));
    }

    public static void bringViewsToFront(@NonNull View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.bringToFront();
            }
        }
    }

    @NonNull
    public static ImageButton createAdInfoIconButton(@NonNull Context context, @IdRes int i, @DrawableRes int i2, boolean z, boolean z2) {
        FrameLayout.LayoutParams layoutParams;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.pob_ad_info_icon_margin_fullscreen);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.pob_ad_info_icon_margin);
        ImageButton imageButton = new ImageButton(context);
        imageButton.setId(i);
        Resources resources = context.getResources();
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setBackgroundColor(0);
        imageButton.setImageResource(i2);
        imageButton.setPadding(0, 0, 0, 0);
        if (z) {
            layoutParams = new FrameLayout.LayoutParams(resources.getDimensionPixelOffset(R.dimen.pob_ad_info_icon_width_full_screen), resources.getDimensionPixelOffset(R.dimen.pob_ad_info_icon_height_full_screen));
            layoutParams.leftMargin = dimensionPixelOffset;
            if (z2) {
                layoutParams.bottomMargin = dimensionPixelOffset;
                layoutParams.gravity = 8388691;
            } else {
                layoutParams.topMargin = dimensionPixelOffset;
                layoutParams.gravity = DivLayoutParams.DEFAULT_GRAVITY;
            }
        } else {
            layoutParams = new FrameLayout.LayoutParams(resources.getDimensionPixelOffset(R.dimen.pob_ad_info_icon_width), resources.getDimensionPixelOffset(R.dimen.pob_ad_info_icon_height));
            layoutParams.setMargins(dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2);
            layoutParams.gravity = 8388611;
        }
        imageButton.setLayoutParams(layoutParams);
        return imageButton;
    }

    @NonNull
    public static POBOpenStoreButton createOpenStoreButton(@NonNull Context context) {
        POBOpenStoreButton pOBOpenStoreButton = new POBOpenStoreButton(context);
        Resources resources = context.getResources();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        layoutParams.rightMargin = resources.getDimensionPixelOffset(R.dimen.pob_close_button_right_margin);
        layoutParams.topMargin = resources.getDimensionPixelOffset(R.dimen.pob_close_button_top_margin);
        pOBOpenStoreButton.setLayoutParams(layoutParams);
        return pOBOpenStoreButton;
    }

    @NonNull
    public static ImageButton createSkipButton(@NonNull Context context, @IdRes int i, @DrawableRes int i2) {
        ImageButton imageButton = new ImageButton(context);
        imageButton.setId(i);
        Resources resources = context.getResources();
        imageButton.setBackground(a(context));
        imageButton.setPadding(0, 0, 0, 0);
        imageButton.setImageResource(i2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(resources.getDimensionPixelOffset(R.dimen.pob_control_width), resources.getDimensionPixelOffset(R.dimen.pob_control_height));
        layoutParams.gravity = 8388613;
        layoutParams.rightMargin = resources.getDimensionPixelOffset(R.dimen.pob_close_button_right_margin);
        layoutParams.topMargin = resources.getDimensionPixelOffset(R.dimen.pob_close_button_top_margin);
        imageButton.setLayoutParams(layoutParams);
        return imageButton;
    }

    @NonNull
    public static TextView createSkipDurationTextView(@NonNull Context context, int i) {
        TextView createTextView = createTextView(context, "", context.getResources().getDimensionPixelOffset(R.dimen.pob_text_size), i);
        createTextView.setBackground(a(context));
        createTextView.setPadding(0, 0, 0, 0);
        return createTextView;
    }

    @NonNull
    public static TextView createTextView(@NonNull Context context, @Nullable String str, float f, int i) {
        TextView textView = new TextView(context);
        textView.setAllCaps(false);
        textView.setGravity(17);
        textView.setTextColor(context.getResources().getColor(android.R.color.white));
        textView.setTextSize(0, f);
        textView.setTextAlignment(4);
        textView.setText(str);
        try {
            textView.setTypeface(Typeface.SANS_SERIF, 1);
        } catch (Exception unused) {
            POBLog.warn("POBUIUtil", "SANS_SERIF font not found!", new Object[0]);
        }
        textView.setId(i);
        return textView;
    }

    @Nullable
    public static ImageView createWatermarkView(@NonNull Context context, @NonNull String str) {
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.pob_watermark);
        try {
            byte[] decode = Base64.decode(str, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(decode, 0, decode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
            imageView.setElevation(Float.MAX_VALUE);
            imageView.setBackground(bitmapDrawable);
            imageView.setClickable(false);
            imageView.setFocusable(false);
            return imageView;
        } catch (IllegalArgumentException e) {
            POBLog.error("POBUIUtil", "Invalid Base64 encoded string encountered while creating watermark view", e.getMessage());
            return null;
        }
    }

    @NonNull
    public static FrameLayout.LayoutParams getLayoutParamsForTopRightPosition(@NonNull Context context) {
        Resources resources = context.getResources();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(resources.getDimensionPixelOffset(R.dimen.pob_control_width), resources.getDimensionPixelOffset(R.dimen.pob_control_height));
        layoutParams.gravity = 8388613;
        layoutParams.rightMargin = resources.getDimensionPixelOffset(R.dimen.pob_skip_control_right_margin);
        layoutParams.topMargin = resources.getDimensionPixelOffset(R.dimen.pob_skip_control_top_margin);
        return layoutParams;
    }

    @NonNull
    public static String getLocalizedStringForKey(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", context.getPackageName());
        if (identifier != 0) {
            String string = resources.getString(identifier);
            if (!string.isEmpty()) {
                return string;
            }
        }
        return str2;
    }

    public static void resizeAdInfoIconBtn(@NonNull Context context, @NonNull ImageButton imageButton, boolean z) {
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.pob_ad_info_icon_margin_fullscreen);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.pob_ad_info_icon_margin);
        FrameLayout.LayoutParams layoutParams = imageButton.getLayoutParams() != null ? (FrameLayout.LayoutParams) imageButton.getLayoutParams() : new FrameLayout.LayoutParams(-2, -2);
        imageButton.setPadding(0, 0, 0, 0);
        if (z) {
            layoutParams.height = context.getResources().getDimensionPixelOffset(R.dimen.pob_ad_info_icon_height_full_screen);
            layoutParams.width = context.getResources().getDimensionPixelOffset(R.dimen.pob_ad_info_icon_width_full_screen);
            layoutParams.leftMargin = dimensionPixelOffset;
            layoutParams.bottomMargin = dimensionPixelOffset;
            layoutParams.gravity = 80;
        } else {
            layoutParams.height = context.getResources().getDimensionPixelOffset(R.dimen.pob_ad_info_icon_height);
            layoutParams.width = context.getResources().getDimensionPixelOffset(R.dimen.pob_ad_info_icon_height);
            layoutParams.leftMargin = dimensionPixelOffset2;
            layoutParams.topMargin = dimensionPixelOffset2;
            layoutParams.gravity = 8388611;
        }
        imageButton.setLayoutParams(layoutParams);
    }

    public static void updateSkipBtnColor(@NonNull Context context, @NonNull ImageView imageView, @ColorRes int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        Resources resources = context.getResources();
        gradientDrawable.setColor(resources.getColor(R.color.pob_skip_button_background_color));
        gradientDrawable.setStroke(resources.getDimensionPixelOffset(R.dimen.pob_control_stroke_width), resources.getColor(i));
        imageView.setBackground(new InsetDrawable((Drawable) gradientDrawable, resources.getDimensionPixelOffset(R.dimen.pob_control_padding)));
    }

    public static void updateSkipButtonToCloseButton(@NonNull ImageButton imageButton) {
        imageButton.setImageResource(R.drawable.pob_ic_close_black_24dp);
        imageButton.setId(com.pubmatic.sdk.common.R.id.pob_close_btn);
    }
}
