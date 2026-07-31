package com.yandex.div.internal.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.yandex.div.core.util.SafeAlertDialog;
import com.yandex.div.internal.Assert;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;

/* loaded from: classes14.dex */
public class Views {
    private static final int[] HIT_TEST_ARRAY = new int[2];
    public static final int VIEW_SIDE_BOTTOM = 1;
    public static final int VIEW_SIDE_LEFT = 2;
    public static final int VIEW_SIDE_RIGHT = 4;
    public static final int VIEW_SIDE_TOP = 8;

    public interface ViewProcessor {
        void process(@NonNull View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewSideFlags {
    }

    @NonNull
    public static <T extends View> T findViewAndCast(@NonNull Activity activity, @IdRes int i) {
        T t = (T) activity.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("View with id [" + activity.getResources().getResourceName(i) + "] doesn't exist");
    }

    @NonNull
    public static <T extends View> T findViewAndCast(@NonNull View view, @IdRes int i) {
        T t = (T) view.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("View with id [" + view.getResources().getResourceName(i) + "] doesn't exist");
    }

    @Nullable
    public static <T extends View> T findOptionalViewAndCast(@NonNull View view, @IdRes int i) {
        return (T) view.findViewById(i);
    }

    @NonNull
    public static <VIEW extends View> VIEW inflate(@NonNull ViewGroup viewGroup, @LayoutRes int i) {
        return (VIEW) LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
    }

    @NonNull
    public static <VIEW extends View> VIEW inflate(@NonNull Context context, @NonNull ViewGroup viewGroup, @LayoutRes int i) {
        return (VIEW) LayoutInflater.from(context).inflate(i, viewGroup, false);
    }

    @NonNull
    public static <V extends View> V inflate(@NonNull Context context, @LayoutRes int i) {
        return (V) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
    }

    public static void setTextOrHide(@NonNull TextView textView, @Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
    }

    public static boolean isVisible(@NonNull View view) {
        return view.getVisibility() == 0;
    }

    @MainThread
    public static boolean hitTest(@NonNull View view, float f, float f2) {
        int[] iArr = HIT_TEST_ARRAY;
        view.getLocationInWindow(iArr);
        if (f < iArr[0] || f > r2 + view.getWidth()) {
            return false;
        }
        int i = iArr[1];
        return f2 >= ((float) i) && f2 <= ((float) (i + view.getHeight()));
    }

    public static void setPadding(@NonNull View view, @DimenRes int i, int i2) {
        setPaddingPixelSize(view, view.getResources().getDimensionPixelSize(i), i2);
    }

    public static void setPadding(@NonNull View view, @Px int i, int i2, Void r3) {
        setPaddingPixelSize(view, i, i2);
    }

    public static void traverseViewTree(@NonNull View view, @NonNull ViewProcessor viewProcessor) {
        ArrayDeque arrayDeque = new ArrayDeque();
        viewProcessor.process(view);
        if (view instanceof ViewGroup) {
            arrayDeque.add((ViewGroup) view);
        }
        while (!arrayDeque.isEmpty()) {
            ViewGroup viewGroup = (ViewGroup) arrayDeque.remove();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                viewProcessor.process(childAt);
                if (childAt instanceof ViewGroup) {
                    arrayDeque.add((ViewGroup) childAt);
                }
            }
        }
    }

    private static void setPaddingPixelSize(@NonNull View view, int i, int i2) {
        int paddingLeft = (i2 & 2) != 0 ? i : view.getPaddingLeft();
        int paddingTop = (i2 & 8) != 0 ? i : view.getPaddingTop();
        int paddingRight = (i2 & 4) != 0 ? i : view.getPaddingRight();
        if ((i2 & 1) == 0) {
            i = view.getPaddingBottom();
        }
        view.setPadding(paddingLeft, paddingTop, paddingRight, i);
    }

    public static int getBottomMargin(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return 0;
    }

    public static int getVerticalMargins(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }

    public static int getHeightWithMargins(@NonNull View view) {
        return view.getHeight() + getVerticalMargins(view);
    }

    @NonNull
    public static SafeAlertDialog styleAlertDialog(@NonNull SafeAlertDialog safeAlertDialog, @Nullable Typeface typeface) {
        if (typeface == null) {
            return safeAlertDialog;
        }
        TextView textView = (TextView) safeAlertDialog.findViewById(R.id.message);
        Assert.assertNotNull("AlertDialog message textview not found", textView);
        if (textView != null) {
            textView.setTypeface(typeface);
        }
        return safeAlertDialog;
    }
}
