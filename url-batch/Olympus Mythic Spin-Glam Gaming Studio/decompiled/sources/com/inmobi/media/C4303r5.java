package com.inmobi.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.inmobi.ads.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.r5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4303r5 extends ImageView {
    public final byte a;
    public final InterfaceC4466x9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4303r5(Context context, byte b, InterfaceC4466x9 interfaceC4466x9) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = b;
        this.b = interfaceC4466x9;
        int i = b == 0 ? 15 : (b == 2 || b == 3 || b == 4 || b == 5 || b == 6) ? 30 : 0;
        try {
            Integer a = a(b);
            if (a == null) {
                if (interfaceC4466x9 != null) {
                    ((C4493y9) interfaceC4466x9).b("CustomView", "null drawable id while creating button - " + ((int) b));
                    return;
                }
                return;
            }
            a(a.intValue(), i, i, i, i);
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).c("CustomView", "new customView - " + ((int) b) + " created");
            }
        } catch (Exception e) {
            InterfaceC4466x9 interfaceC4466x92 = this.b;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a("CustomView", "exception while building customView", e);
            }
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
        }
    }

    public static Integer a(byte b) {
        if (b == 0) {
            return Integer.valueOf(R.drawable.im_close_button);
        }
        if (b == 1) {
            return Integer.valueOf(R.drawable.im_close_transparent);
        }
        if (b == 2) {
            return Integer.valueOf(R.drawable.im_close_icon);
        }
        if (b == 3) {
            return Integer.valueOf(R.drawable.im_refresh);
        }
        if (b == 4) {
            return Integer.valueOf(R.drawable.im_back);
        }
        if (b == 5) {
            return Integer.valueOf(R.drawable.im_forward_active);
        }
        if (b == 6) {
            return Integer.valueOf(R.drawable.im_forward_inactive);
        }
        if (b == 9) {
            return Integer.valueOf(R.drawable.im_mute);
        }
        if (b == 10) {
            return Integer.valueOf(R.drawable.im_unmute);
        }
        return null;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.i, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void a(int i, final int i2, final int i3, final int i4, final int i5) {
        F5.a.getClass();
        if (!F5.y()) {
            BuildersKt__Builders_commonKt.launch$default(L9.d, null, null, new C4278q5(this, i, i2, i3, i4, i5, null), 3, null);
        } else {
            Icon.createWithResource(getContext(), i).loadDrawableAsync(getContext(), new Icon.OnDrawableLoadedListener() { // from class: com.inmobi.media.r5$$ExternalSyntheticLambda0
                @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
                public final void onDrawableLoaded(Drawable drawable) {
                    C4303r5.a(C4303r5.this, i2, i3, i4, i5, drawable);
                }
            }, ((ExecutorC4101jc) AbstractC4437w6.e.getValue()).a);
        }
    }

    public static final void a(C4303r5 c4303r5, int i, int i2, int i3, int i4, Drawable drawable) {
        if (drawable == null) {
            InterfaceC4466x9 interfaceC4466x9 = c4303r5.b;
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).b("CustomView", "drawable for " + ((int) c4303r5.a) + " is null");
                return;
            }
            return;
        }
        c4303r5.setImageDrawable(drawable);
        c4303r5.setPadding(i, i2, i3, i4);
    }

    public final void a(final Drawable drawable, final int i, final int i2, final int i3, final int i4) {
        post(new Runnable() { // from class: com.inmobi.media.r5$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4303r5.a(C4303r5.this, drawable, i, i2, i3, i4);
            }
        });
    }

    public static final void a(C4303r5 c4303r5, Drawable drawable, int i, int i2, int i3, int i4) {
        c4303r5.setImageDrawable(drawable);
        c4303r5.setPadding(i, i2, i3, i4);
    }
}
