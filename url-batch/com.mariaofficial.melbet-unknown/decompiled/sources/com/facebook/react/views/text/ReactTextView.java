package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintContextWrapper;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.internal.SystraceSection;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactCompoundView;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.Overflow;
import com.facebook.react.views.text.internal.span.ReactTagSpan;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import com.facebook.react.views.text.internal.span.TextInlineViewPlaceholderSpan;
import com.facebook.yoga.YogaMeasureMode;

/* loaded from: classes2.dex */
public class ReactTextView extends AppCompatTextView implements ReactCompoundView {
    private static final int DEFAULT_GRAVITY = 8388659;
    private static final ViewGroup.LayoutParams EMPTY_LAYOUT_PARAMS = new ViewGroup.LayoutParams(0, 0);
    private boolean mAdjustsFontSizeToFit;
    private boolean mContainsImages;
    private TextUtils.TruncateAt mEllipsizeLocation;
    private float mFontSize;
    private float mLetterSpacing;
    private int mLinkifyMaskType;
    private float mMinimumFontSize;
    private int mNumberOfLines;
    private Overflow mOverflow;
    private boolean mShouldAdjustSpannableFontSize;
    private Spannable mSpanned;
    private boolean mTextIsSelectable;

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public ReactTextView(Context context) {
        super(context);
        this.mOverflow = Overflow.VISIBLE;
        initView();
    }

    private void initView() {
        this.mNumberOfLines = Integer.MAX_VALUE;
        this.mAdjustsFontSizeToFit = false;
        this.mLinkifyMaskType = 0;
        this.mTextIsSelectable = false;
        this.mShouldAdjustSpannableFontSize = false;
        this.mEllipsizeLocation = TextUtils.TruncateAt.END;
        this.mFontSize = Float.NaN;
        this.mMinimumFontSize = Float.NaN;
        this.mLetterSpacing = 0.0f;
        this.mOverflow = Overflow.VISIBLE;
        this.mSpanned = null;
    }

    void recycleView() {
        initView();
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        BackgroundStyleApplicator.reset(this);
        setBreakStrategy(0);
        setMovementMethod(getDefaultMovementMethod());
        if (Build.VERSION.SDK_INT >= 26) {
            setJustificationMode(0);
        }
        setLayoutParams(EMPTY_LAYOUT_PARAMS);
        super.setText((CharSequence) null);
        applyTextAttributes();
        setGravity(8388659);
        setNumberOfLines(this.mNumberOfLines);
        setAdjustFontSizeToFit(this.mAdjustsFontSizeToFit);
        setLinkifyMask(this.mLinkifyMaskType);
        setTextIsSelectable(this.mTextIsSelectable);
        setIncludeFontPadding(true);
        setEnabled(true);
        setLinkifyMask(0);
        setEllipsizeLocation(this.mEllipsizeLocation);
        setEnabled(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setFocusable(16);
        }
        setHyphenationFrequency(0);
        updateView();
    }

    private static WritableMap inlineViewJson(int i, int i2, int i3, int i4, int i5, int i6) {
        WritableMap createMap = Arguments.createMap();
        if (i == 8) {
            createMap.putString("visibility", "gone");
            createMap.putInt("index", i2);
            return createMap;
        }
        if (i == 0) {
            createMap.putString("visibility", ViewProps.VISIBLE);
            createMap.putInt("index", i2);
            createMap.putDouble(ViewProps.LEFT, PixelUtil.toDIPFromPixel(i3));
            createMap.putDouble(ViewProps.TOP, PixelUtil.toDIPFromPixel(i4));
            createMap.putDouble(ViewProps.RIGHT, PixelUtil.toDIPFromPixel(i5));
            createMap.putDouble(ViewProps.BOTTOM, PixelUtil.toDIPFromPixel(i6));
            return createMap;
        }
        createMap.putString("visibility", EnvironmentCompat.MEDIA_UNKNOWN);
        createMap.putInt("index", i2);
        return createMap;
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        if (context instanceof TintContextWrapper) {
            return (ReactContext) ((TintContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e8, code lost:
    
        if (r5 != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        UIManagerModule uIManagerModule;
        float secondaryHorizontal;
        int lineRight;
        int totalPaddingLeft;
        int id = getId();
        if ((getText() instanceof Spanned) && ViewUtil.getUIManagerType(id) != 2 && !ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            UIManagerModule uIManagerModule2 = (UIManagerModule) Assertions.assertNotNull((UIManagerModule) getReactContext().getNativeModule(UIManagerModule.class));
            Spanned spanned = (Spanned) getText();
            Layout layout = getLayout();
            if (layout != null) {
                TextInlineViewPlaceholderSpan[] textInlineViewPlaceholderSpanArr = (TextInlineViewPlaceholderSpan[]) spanned.getSpans(0, spanned.length(), TextInlineViewPlaceholderSpan.class);
                int i5 = i3 - i;
                int i6 = i4 - i2;
                int length = textInlineViewPlaceholderSpanArr.length;
                int i7 = 0;
                while (i7 < length) {
                    TextInlineViewPlaceholderSpan textInlineViewPlaceholderSpan = textInlineViewPlaceholderSpanArr[i7];
                    View resolveView = uIManagerModule2.resolveView(textInlineViewPlaceholderSpan.getReactTag());
                    int spanStart = spanned.getSpanStart(textInlineViewPlaceholderSpan);
                    int lineForOffset = layout.getLineForOffset(spanStart);
                    if ((layout.getEllipsisCount(lineForOffset) <= 0 || spanStart < layout.getLineStart(lineForOffset) + layout.getEllipsisStart(lineForOffset)) && lineForOffset < this.mNumberOfLines && spanStart < layout.getLineEnd(lineForOffset)) {
                        int width = textInlineViewPlaceholderSpan.getWidth();
                        int height = textInlineViewPlaceholderSpan.getHeight();
                        boolean isRtlCharAt = layout.isRtlCharAt(spanStart);
                        uIManagerModule = uIManagerModule2;
                        boolean z2 = layout.getParagraphDirection(lineForOffset) == -1;
                        if (spanStart == spanned.length() - 1) {
                            float lineWidth = (spanned.length() <= 0 || spanned.charAt(layout.getLineEnd(lineForOffset) + (-1)) != '\n') ? layout.getLineWidth(lineForOffset) : layout.getLineMax(lineForOffset);
                            if (!z2) {
                                lineRight = (int) layout.getLineRight(lineForOffset);
                                lineRight -= width;
                                if (!isRtlCharAt) {
                                }
                                int i8 = lineRight + totalPaddingLeft;
                                int i9 = i + i8;
                                int totalPaddingTop = (getTotalPaddingTop() + layout.getLineBaseline(lineForOffset)) - height;
                                int i10 = i2 + totalPaddingTop;
                                resolveView.setVisibility((i5 > i8 || i6 <= totalPaddingTop) ? 8 : 0);
                                resolveView.layout(i9, i10, width + i9, height + i10);
                            } else {
                                lineRight = i5 - ((int) lineWidth);
                                if (!isRtlCharAt) {
                                    totalPaddingLeft = getTotalPaddingRight();
                                } else {
                                    totalPaddingLeft = getTotalPaddingLeft();
                                }
                                int i82 = lineRight + totalPaddingLeft;
                                int i92 = i + i82;
                                int totalPaddingTop2 = (getTotalPaddingTop() + layout.getLineBaseline(lineForOffset)) - height;
                                int i102 = i2 + totalPaddingTop2;
                                resolveView.setVisibility((i5 > i82 || i6 <= totalPaddingTop2) ? 8 : 0);
                                resolveView.layout(i92, i102, width + i92, height + i102);
                            }
                        } else {
                            if (z2 == isRtlCharAt) {
                                secondaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                            } else {
                                secondaryHorizontal = layout.getSecondaryHorizontal(spanStart);
                            }
                            int i11 = (int) secondaryHorizontal;
                            lineRight = z2 ? i5 - (((int) layout.getLineRight(lineForOffset)) - i11) : i11;
                        }
                        i7++;
                        uIManagerModule2 = uIManagerModule;
                    }
                    uIManagerModule = uIManagerModule2;
                    resolveView.setVisibility(8);
                    i7++;
                    uIManagerModule2 = uIManagerModule;
                }
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        SystraceSection systraceSection = new SystraceSection("ReactTextView.onDraw");
        try {
            Spannable spanned = getSpanned();
            if (this.mAdjustsFontSizeToFit && spanned != null && this.mShouldAdjustSpannableFontSize) {
                this.mShouldAdjustSpannableFontSize = false;
                TextLayoutManager.adjustSpannableFontToFit(spanned, getWidth(), YogaMeasureMode.EXACTLY, getHeight(), YogaMeasureMode.EXACTLY, this.mMinimumFontSize, this.mNumberOfLines, getIncludeFontPadding(), getBreakStrategy(), getHyphenationFrequency(), Layout.Alignment.ALIGN_NORMAL, Build.VERSION.SDK_INT < 26 ? -1 : getJustificationMode(), getPaint());
                setText(spanned);
            }
            if (this.mOverflow != Overflow.VISIBLE) {
                BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
            }
            super.onDraw(canvas);
            systraceSection.close();
        } finally {
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        SystraceSection systraceSection = new SystraceSection("ReactTextView.onMeasure");
        try {
            super.onMeasure(i, i2);
            systraceSection.close();
        } catch (Throwable th) {
            try {
                systraceSection.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void setText(ReactTextUpdate reactTextUpdate) {
        SystraceSection systraceSection = new SystraceSection("ReactTextView.setText(ReactTextUpdate)");
        try {
            this.mContainsImages = reactTextUpdate.getContainsImages();
            if (getLayoutParams() == null) {
                setLayoutParams(EMPTY_LAYOUT_PARAMS);
            }
            Spannable text = reactTextUpdate.getText();
            int i = this.mLinkifyMaskType;
            if (i > 0) {
                Linkify.addLinks(text, i);
                setMovementMethod(LinkMovementMethod.getInstance());
            }
            setText(text);
            float paddingLeft = reactTextUpdate.getPaddingLeft();
            float paddingTop = reactTextUpdate.getPaddingTop();
            float paddingRight = reactTextUpdate.getPaddingRight();
            float paddingBottom = reactTextUpdate.getPaddingBottom();
            if (paddingLeft != -1.0f && paddingTop != -1.0f && paddingRight != -1.0f && paddingBottom != -1.0f) {
                setPadding((int) Math.floor(paddingLeft), (int) Math.floor(paddingTop), (int) Math.floor(paddingRight), (int) Math.floor(paddingBottom));
            }
            int textAlign = reactTextUpdate.getTextAlign();
            if (textAlign != getGravityHorizontal()) {
                setGravityHorizontal(textAlign);
            }
            if (getBreakStrategy() != reactTextUpdate.getTextBreakStrategy()) {
                setBreakStrategy(reactTextUpdate.getTextBreakStrategy());
            }
            if (Build.VERSION.SDK_INT >= 26 && getJustificationMode() != reactTextUpdate.getJustificationMode()) {
                setJustificationMode(reactTextUpdate.getJustificationMode());
            }
            requestLayout();
            systraceSection.close();
        } catch (Throwable th) {
            try {
                systraceSection.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.facebook.react.uimanager.ReactCompoundView
    public int reactTagForTouch(float f, float f2) {
        int i;
        CharSequence text = getText();
        int id = getId();
        int i2 = (int) f;
        int i3 = (int) f2;
        Layout layout = getLayout();
        if (layout != null) {
            int lineForVertical = layout.getLineForVertical(i3);
            int lineLeft = (int) layout.getLineLeft(lineForVertical);
            int lineRight = (int) layout.getLineRight(lineForVertical);
            if ((text instanceof Spanned) && i2 >= lineLeft && i2 <= lineRight) {
                Spanned spanned = (Spanned) text;
                try {
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i2);
                    ReactTagSpan[] reactTagSpanArr = (ReactTagSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ReactTagSpan.class);
                    if (reactTagSpanArr != null) {
                        int length = text.length();
                        for (int i4 = 0; i4 < reactTagSpanArr.length; i4++) {
                            int spanStart = spanned.getSpanStart(reactTagSpanArr[i4]);
                            int spanEnd = spanned.getSpanEnd(reactTagSpanArr[i4]);
                            if (spanEnd >= offsetForHorizontal && (i = spanEnd - spanStart) <= length) {
                                id = reactTagSpanArr[i4].getReactTag();
                                length = i;
                            }
                        }
                        return id;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    FLog.e(ReactConstants.TAG, "Crash in HorizontalMeasurementProvider: " + e.getMessage());
                }
            }
        }
        return id;
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                if (textInlineImageSpan.getDrawable() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                if (textInlineImageSpan.getDrawable() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onDetachedFromWindow();
            }
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onStartTemporaryDetach();
            }
        }
    }

    @Override // android.widget.TextView
    public void setTextIsSelectable(boolean z) {
        this.mTextIsSelectable = z;
        super.setTextIsSelectable(z);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mTextIsSelectable) {
            setTextIsSelectable(false);
            setTextIsSelectable(true);
        } else {
            setTextIsSelectable(false);
        }
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onAttachedToWindow();
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onFinishTemporaryDetach();
            }
        }
    }

    int getGravityHorizontal() {
        return getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
    }

    void setGravityHorizontal(int i) {
        if (i == 0) {
            i = GravityCompat.START;
        }
        setGravity(i | (getGravity() & (-8388616)));
    }

    void setGravityVertical(int i) {
        if (i == 0) {
            i = 48;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        this.mNumberOfLines = i;
        setMaxLines(i);
        this.mShouldAdjustSpannableFontSize = true;
    }

    public void setAdjustFontSizeToFit(boolean z) {
        this.mAdjustsFontSizeToFit = z;
    }

    public void setFontSize(float f) {
        double ceil;
        if (this.mAdjustsFontSizeToFit) {
            ceil = Math.ceil(PixelUtil.toPixelFromSP(f));
        } else {
            ceil = Math.ceil(PixelUtil.toPixelFromDIP(f));
        }
        this.mFontSize = (float) ceil;
        applyTextAttributes();
    }

    public void setMinimumFontSize(float f) {
        this.mMinimumFontSize = f;
        this.mShouldAdjustSpannableFontSize = true;
    }

    @Override // android.widget.TextView
    public void setIncludeFontPadding(boolean z) {
        super.setIncludeFontPadding(z);
        this.mShouldAdjustSpannableFontSize = true;
    }

    @Override // android.widget.TextView
    public void setBreakStrategy(int i) {
        super.setBreakStrategy(i);
        this.mShouldAdjustSpannableFontSize = true;
    }

    @Override // android.widget.TextView
    public void setHyphenationFrequency(int i) {
        super.setHyphenationFrequency(i);
        this.mShouldAdjustSpannableFontSize = true;
    }

    @Override // android.widget.TextView
    public void setLetterSpacing(float f) {
        if (Float.isNaN(f)) {
            return;
        }
        this.mLetterSpacing = PixelUtil.toPixelFromDIP(f) / this.mFontSize;
        applyTextAttributes();
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.mEllipsizeLocation = truncateAt;
    }

    public void updateView() {
        setEllipsize((this.mNumberOfLines == Integer.MAX_VALUE || this.mAdjustsFontSizeToFit) ? null : this.mEllipsizeLocation);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(i));
    }

    public void setBorderWidth(int i, float f) {
        BackgroundStyleApplicator.setBorderWidth(this, LogicalEdge.values()[i], Float.valueOf(PixelUtil.toDIPFromPixel(f)));
    }

    public void setBorderColor(int i, Integer num) {
        BackgroundStyleApplicator.setBorderColor(this, LogicalEdge.values()[i], num);
    }

    public void setBorderRadius(float f) {
        setBorderRadius(f, BorderRadiusProp.BORDER_RADIUS.ordinal());
    }

    public void setBorderRadius(float f, int i) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.values()[i], Float.isNaN(f) ? null : new LengthPercentage(PixelUtil.toDIPFromPixel(f), LengthPercentageType.POINT));
    }

    public void setBorderStyle(String str) {
        BackgroundStyleApplicator.setBorderStyle(this, str == null ? null : BorderStyle.fromString(str));
    }

    public void setSpanned(Spannable spannable) {
        this.mSpanned = spannable;
        this.mShouldAdjustSpannableFontSize = true;
    }

    public Spannable getSpanned() {
        return this.mSpanned;
    }

    public void setLinkifyMask(int i) {
        this.mLinkifyMaskType = i;
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (ViewCompat.hasAccessibilityDelegate(this)) {
            AccessibilityDelegateCompat accessibilityDelegate = ViewCompat.getAccessibilityDelegate(this);
            if (accessibilityDelegate instanceof ExploreByTouchHelper) {
                return ((ExploreByTouchHelper) accessibilityDelegate).dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        AccessibilityDelegateCompat accessibilityDelegate = ViewCompat.getAccessibilityDelegate(this);
        if (accessibilityDelegate != null && (accessibilityDelegate instanceof ReactTextViewAccessibilityDelegate) && getMovementMethod() == null) {
            ((ReactTextViewAccessibilityDelegate) accessibilityDelegate).onFocusChanged(z, i, rect);
        }
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AccessibilityDelegateCompat accessibilityDelegate = ViewCompat.getAccessibilityDelegate(this);
        return (accessibilityDelegate != null && getMovementMethod() == null && (accessibilityDelegate instanceof ReactTextViewAccessibilityDelegate) && ((ReactTextViewAccessibilityDelegate) accessibilityDelegate).dispatchKeyEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    private void applyTextAttributes() {
        if (!Float.isNaN(this.mFontSize)) {
            setTextSize(0, this.mFontSize);
        }
        if (Float.isNaN(this.mLetterSpacing)) {
            return;
        }
        super.setLetterSpacing(this.mLetterSpacing);
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.mOverflow = Overflow.VISIBLE;
        } else {
            Overflow fromString = Overflow.fromString(str);
            if (fromString == null) {
                fromString = Overflow.VISIBLE;
            }
            this.mOverflow = fromString;
        }
        invalidate();
    }
}
