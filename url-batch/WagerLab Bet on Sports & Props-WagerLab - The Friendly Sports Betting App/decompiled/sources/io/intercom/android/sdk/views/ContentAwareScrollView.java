package io.intercom.android.sdk.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* loaded from: classes8.dex */
public class ContentAwareScrollView extends ScrollView {
    private Listener listener;

    public interface Listener {
        void onBottomReached();

        void onScrollChanged(int i);
    }

    public ContentAwareScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ContentAwareScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ContentAwareScrollView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        notifyListenerIfAtBottom();
        notifyListenerScrollChanged(i2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        notifyListenerIfAtBottom();
    }

    protected void notifyListenerScrollChanged(int i) {
        Listener listener = this.listener;
        if (listener != null) {
            listener.onScrollChanged(i);
        }
    }

    public boolean isAtBottom() {
        int bottom = getChildAt(0).getBottom();
        return bottom != 0 && getBottom() + getScrollY() >= bottom;
    }

    public Listener getListener() {
        return this.listener;
    }

    public void setListener(Listener listener) {
        this.listener = listener;
        notifyListenerIfAtBottom();
    }

    protected void notifyListenerIfAtBottom() {
        if (this.listener == null || !isAtBottom()) {
            return;
        }
        this.listener.onBottomReached();
    }
}
