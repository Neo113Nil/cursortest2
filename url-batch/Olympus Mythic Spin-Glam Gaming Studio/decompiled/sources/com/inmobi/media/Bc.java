package com.inmobi.media;

import android.view.MotionEvent;
import java.util.Collection;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes11.dex */
public final class Bc {
    public final GestureDetectorOnGestureListenerC4476xi a;
    public final String b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int g;
    public int h;
    public float i;
    public JSONArray j;
    public MotionEvent k;
    public int l;

    public Bc(GestureDetectorOnGestureListenerC4476xi mListener) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.a = mListener;
        this.b = Bc.class.getSimpleName();
        this.l = Integer.MAX_VALUE;
        this.g = -1;
        this.h = -1;
    }

    public final void a(MotionEvent event) {
        float f;
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            String TAG = this.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            event.toString();
            this.g = event.getPointerId(event.getActionIndex());
            this.j = new JSONArray();
            JSONArray jSONArray = new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(N3.c(event.getX())), Integer.valueOf(N3.c(event.getY()))}));
            JSONArray jSONArray2 = this.j;
            if (jSONArray2 != null) {
                jSONArray2.put(jSONArray);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            String TAG2 = this.b;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            event.toString();
            this.g = -1;
            JSONArray jSONArray3 = this.j;
            if (jSONArray3 == null || jSONArray3.length() <= 5) {
                return;
            }
            this.a.a(this);
            this.j = new JSONArray();
            return;
        }
        float f4 = 0.0f;
        if (actionMasked == 2) {
            JSONArray jSONArray4 = this.j;
            int i = this.g;
            if (i == -1 || this.h == -1) {
                if (i == -1 || jSONArray4 == null || jSONArray4.length() <= 0 || jSONArray4.length() >= 50) {
                    return;
                }
                try {
                    int c = N3.c(event.getX());
                    int c2 = N3.c(event.getY());
                    JSONArray jSONArray5 = jSONArray4.getJSONArray(jSONArray4.length() - 1);
                    JSONArray jSONArray6 = new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(c), Integer.valueOf(c2)}));
                    float f5 = jSONArray5.getInt(0) - jSONArray6.getInt(0);
                    float f6 = jSONArray5.getInt(1) - jSONArray6.getInt(1);
                    if (((int) Math.sqrt((f6 * f6) + (f5 * f5))) > 100) {
                        jSONArray4.put(jSONArray6);
                        return;
                    }
                    return;
                } catch (JSONException unused) {
                    return;
                }
            }
            int findPointerIndex = event.findPointerIndex(i);
            int findPointerIndex2 = event.findPointerIndex(this.h);
            if (findPointerIndex >= 0) {
                f2 = event.getX(findPointerIndex);
                f = event.getY(findPointerIndex);
            } else {
                Lazy lazy = AbstractC3861aa.a;
                AbstractC3861aa.a(new Q2(new IllegalArgumentException("Index for mPtrID1=" + this.g + " is " + findPointerIndex + " | Pointer count=" + event.getPointerCount())));
                f = 0.0f;
                f2 = 0.0f;
            }
            if (findPointerIndex2 >= 0) {
                float x = event.getX(findPointerIndex2);
                f4 = event.getY(findPointerIndex2);
                f3 = x;
            } else {
                Lazy lazy2 = AbstractC3861aa.a;
                AbstractC3861aa.a(new Q2(new IllegalArgumentException("Index for mPtrID1=" + this.h + " is " + findPointerIndex2 + " | Pointer count=" + event.getPointerCount())));
                f3 = 0.0f;
            }
            float f7 = this.c;
            float degrees = ((float) Math.toDegrees(((float) Math.atan2(this.d - this.f, f7 - this.e)) - ((float) Math.atan2(f4 - f, f3 - f2)))) % 360;
            if (degrees < -180.0f) {
                degrees += 360.0f;
            }
            if (degrees > 180.0f) {
                degrees -= 360.0f;
            }
            this.i = Math.abs(degrees);
            return;
        }
        if (actionMasked == 3) {
            String TAG3 = this.b;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            event.toString();
            this.g = -1;
            this.h = -1;
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            String TAG4 = this.b;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            event.toString();
            this.h = -1;
            if (this.i > 30.0f) {
                MotionEvent motionEvent = this.k;
                if (motionEvent != null) {
                    this.a.b(this, motionEvent, event);
                }
                this.i = 0.0f;
            }
            float x2 = event.getX() - event.getX(1);
            float y = event.getY() - event.getY(1);
            if (Math.abs(((int) Math.sqrt((y * y) + (x2 * x2))) - this.l) > 500) {
                MotionEvent motionEvent2 = this.k;
                if (motionEvent2 != null) {
                    this.a.a(this, motionEvent2, event);
                }
                this.l = Integer.MAX_VALUE;
                return;
            }
            return;
        }
        String TAG5 = this.b;
        Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
        event.toString();
        this.h = event.getPointerId(event.getActionIndex());
        this.k = MotionEvent.obtain(event);
        int findPointerIndex3 = event.findPointerIndex(this.g);
        int findPointerIndex4 = event.findPointerIndex(this.h);
        if (findPointerIndex3 >= 0) {
            this.e = event.getX(findPointerIndex3);
            this.f = event.getY(findPointerIndex3);
        } else {
            Lazy lazy3 = AbstractC3861aa.a;
            AbstractC3861aa.a(new Q2(new IllegalArgumentException("Index for mPtrID1=" + this.g + " is " + findPointerIndex3 + " | Pointer count=" + event.getPointerCount())));
        }
        if (findPointerIndex4 >= 0) {
            this.c = event.getX(findPointerIndex4);
            this.d = event.getY(findPointerIndex4);
        } else {
            Lazy lazy4 = AbstractC3861aa.a;
            AbstractC3861aa.a(new Q2(new IllegalArgumentException("Index for mPtrID2=" + this.h + " is " + findPointerIndex4 + " | Pointer count=" + event.getPointerCount())));
        }
        float f8 = this.e - this.c;
        float f9 = this.f - this.d;
        this.l = (int) Math.sqrt((f9 * f9) + (f8 * f8));
    }
}
