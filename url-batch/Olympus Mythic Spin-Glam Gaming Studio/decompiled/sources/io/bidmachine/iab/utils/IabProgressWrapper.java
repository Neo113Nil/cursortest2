package io.bidmachine.iab.utils;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import io.bidmachine.iab.vast.view.CircleCountdownView;
import io.bidmachine.iab.vast.view.LinearCountdownView;
import io.bidmachine.iab.vast.view.TextCountdownView;

/* loaded from: classes5.dex */
public class IabProgressWrapper extends IabElementWrapper<View> {
    public IabProgressWrapper(@Nullable View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // io.bidmachine.iab.utils.IabElementWrapper
    View b(Context context, IabElementStyle iabElementStyle) {
        return ("text".equals(iabElementStyle.getStyle()) || "text-reverse".equals(iabElementStyle.getStyle())) ? new TextCountdownView(context) : ("circular".equals(iabElementStyle.getStyle()) || "circular-reverse".equals(iabElementStyle.getStyle())) ? new CircleCountdownView(context) : new LinearCountdownView(context);
    }

    @Override // io.bidmachine.iab.utils.IabElementWrapper
    protected IabElementStyle c(Context context, IabElementStyle iabElementStyle) {
        if (iabElementStyle != null) {
            if ("text".equals(iabElementStyle.getStyle()) || "text-reverse".equals(iabElementStyle.getStyle())) {
                return Assets.DEF_TEXT_PROGRESS_STYLE;
            }
            if ("circular".equals(iabElementStyle.getStyle()) || "circular-reverse".equals(iabElementStyle.getStyle())) {
                return Assets.DEF_COUNT_DOWN_PROGRESS_STYLE;
            }
        }
        return Assets.DEF_LINEAR_PROGRESS_STYLE;
    }

    public void changePercentage(float f, int i, int i2) {
        IabElementStyle iabElementStyle = this.c;
        if (iabElementStyle == null) {
            return;
        }
        boolean z = iabElementStyle.getStyle() != null && this.c.getStyle().endsWith("reverse");
        View view = this.b;
        if (view instanceof TextCountdownView) {
            TextCountdownView textCountdownView = (TextCountdownView) view;
            if (i2 == 0) {
                textCountdownView.setText("");
                return;
            }
            if (z) {
                i = i2 - i;
            }
            textCountdownView.setRemaining(Math.max(1, i));
            return;
        }
        if (view instanceof CircleCountdownView) {
            CircleCountdownView circleCountdownView = (CircleCountdownView) view;
            if (z) {
                circleCountdownView.changePercentage(f, i2 != 0 ? Math.max(1, i2 - i) : 0);
                return;
            } else {
                circleCountdownView.changePercentage(100.0f - f, i);
                return;
            }
        }
        if (view instanceof LinearCountdownView) {
            LinearCountdownView linearCountdownView = (LinearCountdownView) view;
            if (z) {
                f = 100.0f - f;
            }
            linearCountdownView.changePercentage(f);
        }
    }
}
