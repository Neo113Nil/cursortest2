package yads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.monetization.ads.fullscreen.template.view.ExtendedTextView;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class af {
    public static final RectF j = new RectF();
    public static final ConcurrentHashMap k = new ConcurrentHashMap();
    public static final ConcurrentHashMap l = new ConcurrentHashMap();
    public int a = 0;
    public boolean b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public int[] e = new int[0];
    public TextPaint f;
    public final ExtendedTextView g;
    public final Context h;
    public final ze i;

    public af(ExtendedTextView extendedTextView) {
        this.g = extendedTextView;
        this.h = extendedTextView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.i = new ye();
        } else {
            this.i = new xe();
        }
    }

    public static Method b(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = k;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public final void a(int i, float f) {
        Context context = this.h;
        float applyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.g.getPaint().getTextSize()) {
            this.g.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.g.isInLayout();
            if (this.g.getLayout() != null) {
                this.b = false;
                try {
                    Method b = b("nullLayouts");
                    if (b != null) {
                        b.invoke(this.g, null);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (isInLayout) {
                    this.g.forceLayout();
                } else {
                    this.g.requestLayout();
                }
                this.g.invalidate();
            }
        }
    }

    public final int a(RectF rectF) {
        CharSequence transformation;
        int length = this.e.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                int i5 = this.e[i4];
                CharSequence text = this.g.getText();
                TransformationMethod transformationMethod = this.g.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.g)) != null) {
                    text = transformation;
                }
                int maxLines = this.g.getMaxLines();
                TextPaint textPaint = this.f;
                if (textPaint == null) {
                    this.f = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f.set(this.g.getPaint());
                this.f.setTextSize(i5);
                Layout.Alignment alignment = (Layout.Alignment) a(this.g, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f, Math.round(rectF.right));
                obtain.setAlignment(alignment).setLineSpacing(this.g.getLineSpacingExtra(), this.g.getLineSpacingMultiplier()).setIncludePad(this.g.getIncludeFontPadding()).setBreakStrategy(this.g.getBreakStrategy()).setHyphenationFrequency(this.g.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                try {
                    this.i.a(obtain, this.g);
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
                StaticLayout build = obtain.build();
                if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && build.getHeight() <= rectF.bottom) {
                    int i6 = i4 + 1;
                    i3 = i2;
                    i2 = i6;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.e[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public static Object a(TextView textView, String str, Object obj) {
        try {
            return b(str).invoke(textView, null);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj;
        }
    }

    public final void a() {
        ExtendedTextView extendedTextView = this.g;
        if (this.a != 0) {
            if (this.b) {
                if (extendedTextView.getMeasuredHeight() <= 0 || this.g.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.i.a(this.g) ? 1048576 : (this.g.getMeasuredWidth() - this.g.getTotalPaddingLeft()) - this.g.getTotalPaddingRight();
                int height = (this.g.getHeight() - this.g.getCompoundPaddingBottom()) - this.g.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = j;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float a = a(rectF);
                        if (a != this.g.getTextSize()) {
                            a(0, a);
                        }
                    } finally {
                    }
                }
            }
            this.b = true;
        }
    }
}
