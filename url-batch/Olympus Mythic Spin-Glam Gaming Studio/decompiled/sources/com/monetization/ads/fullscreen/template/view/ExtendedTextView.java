package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.af;
import yads.bj1;
import yads.cj1;
import yads.gg2;
import yads.rz2;
import yads.ve;
import yads.we;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/monetization/ads/fullscreen/template/view/ExtendedTextView;", "Landroid/widget/TextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "Lyads/cj1;", "measureSpecProvider", "Lyads/we;", "appCompatAutoSizeControllerFactory", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILyads/cj1;Lyads/we;)V", "", "setMeasureSpecProvider", "(Lyads/cj1;)V", "autoSizeTextType", "setAutoSizeTextType", "(I)V", "unit", "", "size", "setTextSize", "(IF)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExtendedTextView extends TextView {
    private cj1 a;
    private final ve b;

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(@NotNull Context context) {
        this(context, null, 0, null, null, 30, null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ve veVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT < 27 && (veVar = this.b) != null) {
            veVar.a.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        bj1 a = this.a.a(i, i2);
        super.onMeasure(a.a, a.b);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ve veVar;
        super.onTextChanged(charSequence, i, i2, i3);
        if (Build.VERSION.SDK_INT < 27 && (veVar = this.b) != null) {
            veVar.a.a();
        }
    }

    public final void setAutoSizeTextType(int autoSizeTextType) {
        if (Build.VERSION.SDK_INT >= 27) {
            setAutoSizeTextTypeWithDefaults(autoSizeTextType);
            return;
        }
        ve veVar = this.b;
        if (veVar != null) {
            af afVar = veVar.a;
            ExtendedTextView extendedTextView = afVar.g;
            if (autoSizeTextType == 0) {
                afVar.a = 0;
                afVar.d = -1.0f;
                afVar.c = -1.0f;
                afVar.e = new int[0];
                afVar.b = false;
                return;
            }
            if (autoSizeTextType != 1) {
                throw new IllegalArgumentException(gg2.a(autoSizeTextType, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = afVar.h.getResources().getDisplayMetrics();
            float applyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
            float applyDimension2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
            if (applyDimension <= 0.0f) {
                throw new IllegalArgumentException("Minimum auto-size text size (" + applyDimension + "px) is less or equal to (0px)");
            }
            if (applyDimension2 <= applyDimension) {
                throw new IllegalArgumentException("Maximum auto-size text size (" + applyDimension2 + "px) is less or equal to minimum auto-size text size (" + applyDimension + "px)");
            }
            afVar.a = 1;
            afVar.d = applyDimension;
            afVar.c = 1.0f;
            ExtendedTextView extendedTextView2 = afVar.g;
            int floor = ((int) Math.floor((applyDimension2 - applyDimension) / 1.0f)) + 1;
            int[] iArr = new int[floor];
            for (int i = 0; i < floor; i++) {
                iArr[i] = Math.round((i * afVar.c) + afVar.d);
            }
            if (floor != 0) {
                Arrays.sort(iArr);
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < floor; i2++) {
                    int i3 = iArr[i2];
                    if (i3 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i3)) < 0) {
                        arrayList.add(Integer.valueOf(i3));
                    }
                }
                if (floor != arrayList.size()) {
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i4 = 0; i4 < size; i4++) {
                        iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                    }
                }
            }
            afVar.e = iArr;
            afVar.b = true;
            if (afVar.b) {
                afVar.a();
            }
        }
    }

    public final void setMeasureSpecProvider(@NotNull cj1 measureSpecProvider) {
        this.a = measureSpecProvider;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextSize(int unit, float size) {
        if (Build.VERSION.SDK_INT >= 27) {
            super.setTextSize(unit, size);
            return;
        }
        ve veVar = this.b;
        if (veVar != null) {
            af afVar = veVar.a;
            ExtendedTextView extendedTextView = afVar.g;
            if (afVar.a != 0) {
                return;
            }
            afVar.a(unit, size);
        }
    }

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, null, 28, null);
    }

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, null, 24, null);
    }

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, @NotNull cj1 cj1Var) {
        this(context, attributeSet, i, cj1Var, null, 16, null);
    }

    public /* synthetic */ ExtendedTextView(Context context, AttributeSet attributeSet, int i, cj1 cj1Var, we weVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new rz2() : cj1Var, (i2 & 16) != 0 ? new we() : weVar);
    }

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, @NotNull cj1 cj1Var, @NotNull we weVar) {
        super(context, attributeSet, i);
        this.a = cj1Var;
        weVar.getClass();
        this.b = new ve(this);
    }
}
