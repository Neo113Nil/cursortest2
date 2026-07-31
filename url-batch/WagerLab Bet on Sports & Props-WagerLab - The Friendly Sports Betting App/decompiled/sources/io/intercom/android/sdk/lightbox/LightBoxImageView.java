package io.intercom.android.sdk.lightbox;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes8.dex */
public class LightBoxImageView extends AppCompatImageView {
    GestureDetector gestureDetector;
    LightBoxListener lightBoxListener;

    public LightBoxImageView(Context context) {
        super(context);
        init();
    }

    public LightBoxImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    void setLightBoxListener(LightBoxListener lightBoxListener) {
        this.lightBoxListener = lightBoxListener;
    }

    private void init() {
        this.gestureDetector = new GestureDetector(getContext(), new GestureListener());
        setOnTouchListener(new View.OnTouchListener() { // from class: io.intercom.android.sdk.lightbox.LightBoxImageView.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return LightBoxImageView.this.gestureDetector.onTouchEvent(motionEvent);
            }
        });
    }

    private class GestureListener extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (LightBoxImageView.this.lightBoxListener != null) {
                LightBoxImageView.this.lightBoxListener.closeLightBox();
            }
            return super.onSingleTapConfirmed(motionEvent);
        }
    }
}
