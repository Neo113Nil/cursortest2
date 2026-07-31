package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.mbridge.msdk.config.dynamic.baseview.ComponentImageView;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.foundation.tools.i0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class SoundImageView extends ComponentImageView {
    private boolean c;

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = true;
        setSoundStatus(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        boolean z = this.c;
        setSoundStatus(!z);
        HashMap hashMap = new HashMap();
        hashMap.put("soundStatus", !z ? "0" : "1");
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        f.a(this.xmlView, view.getTag(), hashMap);
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentImageView, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    public boolean getStatus() {
        return this.c;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentImageView, android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setSoundStatus(boolean z) {
        this.c = z;
        if (z) {
            setImageResource(i0.a(getContext(), "mbridge_reward_sound_open", "drawable"));
        } else {
            setImageResource(i0.a(getContext(), "mbridge_reward_sound_close", "drawable"));
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentImageView
    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.cusview.SoundImageView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SoundImageView.this.a(view);
            }
        });
    }
}
