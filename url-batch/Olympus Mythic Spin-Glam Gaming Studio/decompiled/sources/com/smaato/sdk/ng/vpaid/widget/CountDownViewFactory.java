package com.smaato.sdk.ng.vpaid.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.smaato.sdk.ng.CountdownStyle;
import com.smaato.sdk.ng.utils.ViewUtils;
import com.yandex.div.internal.widget.DivLayoutParams;

/* loaded from: classes5.dex */
public class CountDownViewFactory {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountdownStyle.values().length];
            a = iArr;
            try {
                iArr[CountdownStyle.PIE_CHART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CountdownStyle.TIMER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[CountdownStyle.PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private ViewGroup.LayoutParams a(Context context, ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) ViewUtils.convertDpToPixel(40.0f, context), (int) ViewUtils.convertDpToPixel(40.0f, context));
            int convertDpToPixel = (int) ViewUtils.convertDpToPixel(5.0f, context);
            layoutParams.setMargins(convertDpToPixel, convertDpToPixel, convertDpToPixel, convertDpToPixel);
            layoutParams.addRule(10);
            layoutParams.addRule(20);
            return layoutParams;
        }
        if (!(viewGroup instanceof FrameLayout)) {
            return new ViewGroup.LayoutParams((int) ViewUtils.convertDpToPixel(40.0f, context), (int) ViewUtils.convertDpToPixel(40.0f, context));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) ViewUtils.convertDpToPixel(40.0f, context), (int) ViewUtils.convertDpToPixel(40.0f, context));
        int convertDpToPixel2 = (int) ViewUtils.convertDpToPixel(5.0f, context);
        layoutParams2.setMargins(convertDpToPixel2, convertDpToPixel2, convertDpToPixel2, convertDpToPixel2);
        layoutParams2.gravity = DivLayoutParams.DEFAULT_GRAVITY;
        return layoutParams2;
    }

    private ViewGroup.LayoutParams b(Context context, ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 0, (int) ViewUtils.convertDpToPixel(40.0f, context));
            layoutParams.addRule(12);
            layoutParams.addRule(20);
            return layoutParams;
        }
        if (!(viewGroup instanceof FrameLayout)) {
            return new ViewGroup.LayoutParams(-2, -2);
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388691;
        layoutParams2.setMargins(0, 0, 0, (int) ViewUtils.convertDpToPixel(40.0f, context));
        return layoutParams2;
    }

    private ViewGroup.LayoutParams c(Context context, ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, (int) ViewUtils.convertDpToPixel(35.0f, context));
            layoutParams.addRule(10);
            layoutParams.addRule(20);
            return layoutParams;
        }
        if (!(viewGroup instanceof FrameLayout)) {
            return new RelativeLayout.LayoutParams(-2, (int) ViewUtils.convertDpToPixel(35.0f, context));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, (int) ViewUtils.convertDpToPixel(35.0f, context));
        layoutParams2.gravity = DivLayoutParams.DEFAULT_GRAVITY;
        return layoutParams2;
    }

    public CountDownView createCountdownView(Context context, CountdownStyle countdownStyle, ViewGroup viewGroup) {
        int i = a.a[countdownStyle.ordinal()];
        if (i == 1) {
            PieChartCountdownView pieChartCountdownView = new PieChartCountdownView(context);
            pieChartCountdownView.setLayoutParams(a(context, viewGroup));
            return pieChartCountdownView;
        }
        if (i == 2) {
            TimerCountDownView timerCountDownView = new TimerCountDownView(context);
            timerCountDownView.setLayoutParams(c(context, viewGroup));
            return timerCountDownView;
        }
        if (i != 3) {
            return new PieChartCountdownView(context);
        }
        ProgressCountDownView progressCountDownView = new ProgressCountDownView(context);
        progressCountDownView.setLayoutParams(b(context, viewGroup));
        return progressCountDownView;
    }
}
