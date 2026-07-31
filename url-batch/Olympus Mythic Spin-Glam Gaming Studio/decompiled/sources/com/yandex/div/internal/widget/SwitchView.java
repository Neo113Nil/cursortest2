package com.yandex.div.internal.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.core.view2.drawable.NoOpDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SwitchView.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0010\u0018\u0000 42\u00020\u0001:\u00014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020!H\u0002J \u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\rH\u0002J\b\u0010)\u001a\u00020\rH\u0016J\u0010\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020\rH\u0016J\u001a\u0010,\u001a\u00020!2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0.J\b\u0010/\u001a\u00020!H\u0002J\u0014\u00100\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0005\u001a\u000201H\u0002J\u0014\u00102\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0005\u001a\u000201H\u0002J\u0014\u00103\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0005\u001a\u000201H\u0002J\u0014\u00103\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002R*\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00178@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00178@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b¨\u00065"}, d2 = {"Lcom/yandex/div/internal/widget/SwitchView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "", "colorOn", "getColorOn", "()Ljava/lang/Integer;", "setColorOn", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "", "isChecked", "()Z", "setChecked", "(Z)V", "switch", "Landroidx/appcompat/widget/SwitchCompat;", "thumbTintColors", "", "thumbTintList", "Landroid/content/res/ColorStateList;", "getThumbTintList$div_release$annotations", "()V", "getThumbTintList$div_release", "()Landroid/content/res/ColorStateList;", "trackTintColors", "trackTintList", "getTrackTintList$div_release$annotations", "getTrackTintList$div_release", "changeTints", "", "fillDefaultColors", "forwardClicksToSwitch", "getColorFromTheme", "resId", "typedValue", "Landroid/util/TypedValue;", "outputIsResource", "isEnabled", "setEnabled", "enabled", "setOnCheckedChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "updateTints", "applyAlpha", "", "lightenColor", "setAlpha", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class SwitchView extends FrameLayout {

    @NotNull
    private static final int[] CHECKED;
    private static final int CHECKED_INDEX = 1;

    @NotNull
    private static final int[] DEFAULT;

    @NotNull
    private static final int[] DISABLED;
    private static final int DISABLED_INDEX = 0;

    @NotNull
    private static final int[][] STATES_ARRAY;
    private static final int UNCHECKED_INDEX = 2;

    @Nullable
    private Integer colorOn;

    @NotNull
    private final SwitchCompat switch;

    @NotNull
    private final int[] thumbTintColors;

    @NotNull
    private final int[] trackTintColors;

    @VisibleForTesting
    public static /* synthetic */ void getThumbTintList$div_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTrackTintList$div_release$annotations() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public SwitchView(@NotNull Context context) {
        super(context);
        SwitchCompat switchCompat = new SwitchCompat(context);
        this.switch = switchCompat;
        this.trackTintColors = new int[3];
        this.thumbTintColors = new int[3];
        switchCompat.setShowText(false);
        switchCompat.setBackground(NoOpDrawable.INSTANCE);
        addView(switchCompat, new FrameLayout.LayoutParams(-2, -2, 17));
        setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.internal.widget.SwitchView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SwitchView.this.forwardClicksToSwitch();
            }
        });
        fillDefaultColors();
        updateTints();
    }

    @Nullable
    public final Integer getColorOn() {
        return this.colorOn;
    }

    public final void setColorOn(@Nullable Integer num) {
        this.colorOn = num;
        changeTints();
    }

    public final boolean isChecked() {
        return this.switch.isChecked();
    }

    public final void setChecked(boolean z) {
        this.switch.setChecked(z);
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.switch.isEnabled();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        this.switch.setEnabled(enabled);
    }

    public final void setOnCheckedChangeListener(@NotNull final Function1 listener) {
        this.switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.yandex.div.internal.widget.SwitchView$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SwitchView.setOnCheckedChangeListener$lambda$2(Function1.this, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnCheckedChangeListener$lambda$2(Function1 function1, CompoundButton compoundButton, boolean z) {
        function1.invoke(Boolean.valueOf(z));
    }

    private final void changeTints() {
        Integer num = this.colorOn;
        if (num != null) {
            int intValue = num.intValue();
            this.thumbTintColors[1] = intValue;
            this.trackTintColors[1] = applyAlpha(intValue, 0.3f);
            updateTints();
        }
    }

    private final void updateTints() {
        SwitchCompat switchCompat = this.switch;
        int[][] iArr = STATES_ARRAY;
        switchCompat.setTrackTintList(new ColorStateList(iArr, this.trackTintColors));
        this.switch.setThumbTintList(new ColorStateList(iArr, this.thumbTintColors));
    }

    private final void fillDefaultColors() {
        TypedValue typedValue = new TypedValue();
        int colorFromTheme = getColorFromTheme(R.attr.colorForeground, typedValue, false);
        int colorFromTheme2 = getColorFromTheme(R.attr.colorControlActivated, typedValue, false);
        int colorFromTheme3 = getColorFromTheme(androidx.appcompat.R.attr.colorSwitchThumbNormal, typedValue, true);
        this.trackTintColors[1] = applyAlpha(colorFromTheme2, 0.3f);
        this.trackTintColors[2] = setAlpha(colorFromTheme, 0.3f);
        this.trackTintColors[0] = setAlpha(colorFromTheme, 0.1f);
        int[] iArr = this.thumbTintColors;
        iArr[1] = colorFromTheme2;
        iArr[2] = colorFromTheme3;
        iArr[0] = lightenColor(colorFromTheme3, 0.5f);
    }

    private final int getColorFromTheme(int resId, TypedValue typedValue, boolean outputIsResource) {
        if (getContext().getTheme().resolveAttribute(resId, typedValue, true)) {
            return (!outputIsResource || typedValue.resourceId == 0) ? typedValue.data : ContextCompat.getColor(getContext(), typedValue.resourceId);
        }
        return 0;
    }

    private final int applyAlpha(int i, float f) {
        return setAlpha(i, (int) (Color.alpha(i) * f));
    }

    private final int setAlpha(int i, int i2) {
        return Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    private final int setAlpha(int i, float f) {
        return setAlpha(i, (int) (f * 255));
    }

    private final int lightenColor(int i, float f) {
        return ColorUtils.blendARGB(i, -1, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forwardClicksToSwitch() {
        if (isEnabled()) {
            this.switch.performClick();
        }
    }

    @Nullable
    public final ColorStateList getThumbTintList$div_release() {
        return this.switch.getThumbTintList();
    }

    @Nullable
    public final ColorStateList getTrackTintList$div_release() {
        return this.switch.getTrackTintList();
    }

    static {
        int[] iArr = {-16842910};
        DISABLED = iArr;
        int[] iArr2 = {R.attr.state_checked};
        CHECKED = iArr2;
        int[] iArr3 = new int[0];
        DEFAULT = iArr3;
        STATES_ARRAY = new int[][]{iArr, iArr2, iArr3};
    }
}
