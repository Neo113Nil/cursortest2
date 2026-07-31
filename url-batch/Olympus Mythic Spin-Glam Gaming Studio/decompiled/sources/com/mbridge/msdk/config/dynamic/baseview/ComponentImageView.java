package com.mbridge.msdk.config.dynamic.baseview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.inter.a;
import com.mbridge.msdk.config.dynamic.utils.d;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.config.dynamic.utils.image.b;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.Map;

/* loaded from: classes5.dex */
public class ComponentImageView extends ImageView implements a {
    private String a;
    private int b;
    public XMLView xmlView;

    public ComponentImageView(Context context, AttributeSet attributeSet) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        f.a(this.xmlView, view.getTag(), null);
    }

    private void setEffectImage(Bitmap bitmap) {
        for (String str : this.a.split("\\|")) {
            if (str.equals("blur")) {
                b.a(this, bitmap);
            } else if (str.contains("corner")) {
                b.a(this, bitmap, this.b, str);
            } else if (str.equals("circle")) {
                b.b(this, bitmap);
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.xmlView = d.a(this);
        } catch (Exception e) {
            q0.b("MBImageView", "onAttachedToWindow异常: " + e.getMessage());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setBitmap(Bitmap bitmap) {
        if (TextUtils.isEmpty(this.a)) {
            setImageBitmap(bitmap);
        } else {
            setEffectImage(bitmap);
        }
    }

    public void setImages(Bitmap... bitmapArr) {
        b.a(this, bitmapArr);
    }

    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.ComponentImageView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComponentImageView.this.a(view);
            }
        });
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String valueOf = String.valueOf(map.get("data"));
            String valueOf2 = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(valueOf2) && valueOf2.equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("effect");
            if (obj instanceof String) {
                this.a = obj.toString();
            }
            Object obj2 = map.get("radius");
            if (obj2 instanceof String) {
                this.b = Integer.parseInt(obj2.toString());
            }
            if (TextUtils.isEmpty(valueOf)) {
                return;
            }
            if (valueOf.startsWith("http")) {
                b.a(valueOf, this);
                return;
            }
            BitmapDrawable n = v0.n(valueOf);
            if (n != null) {
                setBackground(n);
            }
        } catch (Exception e) {
            q0.b("MBImageView", "setXmlData异常: " + e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        try {
            if (obj instanceof String) {
                b.a((String) obj, this);
            }
        } catch (Exception e) {
            q0.b("MBImageView", "updateBindData异常: " + e.getMessage());
        }
    }
}
