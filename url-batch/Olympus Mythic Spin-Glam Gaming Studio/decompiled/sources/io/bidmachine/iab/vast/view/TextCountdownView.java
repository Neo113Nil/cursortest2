package io.bidmachine.iab.vast.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.iab.utils.IabElement;
import io.bidmachine.iab.utils.IabElementStyle;

/* loaded from: classes3.dex */
public class TextCountdownView extends IabTextView implements IabElement {
    private String e;

    public TextCountdownView(@NonNull Context context) {
        super(context);
        this.e = "%1.0fs";
    }

    @Override // io.bidmachine.iab.vast.view.IabTextView, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // io.bidmachine.iab.vast.view.IabTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        if (TextUtils.isEmpty(getText())) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setProgress(int i, int i2) {
        setProgress(Math.round((i / i2) * 100.0f));
    }

    public void setRemaining(int i) {
        setText(this.e.replace("%1.0f", String.valueOf(i)));
    }

    @Override // io.bidmachine.iab.vast.view.IabTextView, io.bidmachine.iab.utils.IabElement
    public void setStyle(@NonNull IabElementStyle iabElementStyle) {
        super.setStyle(iabElementStyle);
        String content = iabElementStyle.getContent();
        if (content != null) {
            this.e = content;
        }
    }

    public void setProgress(int i) {
        setText(this.e.replace("%1.0f", String.valueOf(i)));
    }

    public TextCountdownView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = "%1.0fs";
    }
}
