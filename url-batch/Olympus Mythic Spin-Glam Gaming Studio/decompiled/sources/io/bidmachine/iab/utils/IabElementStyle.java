package io.bidmachine.iab.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Serializable;

/* loaded from: classes11.dex */
public class IabElementStyle implements Serializable {
    private Integer a;
    private Integer b;
    private Boolean c;
    private Boolean d;
    private Integer e;
    private Integer f;
    private String g;
    private Float h;
    private Float i;
    private Integer j;
    private Integer k;
    private Integer l;
    private Integer m;
    private Integer n;
    private Integer o;
    private Integer p;
    private Integer q;
    private String r;
    private Float s;
    private Float t;
    private Float u;
    private Integer v;
    private Float w;

    public IabElementStyle() {
    }

    public void applyAlignment(@NonNull FrameLayout.LayoutParams layoutParams) {
        layoutParams.gravity = positionAsGravity();
    }

    public void applyMargin(@NonNull Context context, @NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        marginLayoutParams.leftMargin = getMarginLeft(context).intValue();
        marginLayoutParams.topMargin = getMarginTop(context).intValue();
        marginLayoutParams.rightMargin = getMarginRight(context).intValue();
        marginLayoutParams.bottomMargin = getMarginBottom(context).intValue();
    }

    public void applyPadding(@NonNull Context context, @NonNull View view) {
        view.setPadding(getPaddingLeft(context).intValue(), getPaddingTop(context).intValue(), getPaddingRight(context).intValue(), getPaddingBottom(context).intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r0 != 17) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void applyRelativeAlignment(@NonNull RelativeLayout.LayoutParams layoutParams) {
        int intValue;
        int intValue2 = getHorizontalPosition().intValue();
        if (intValue2 != 1) {
            if (intValue2 == 3) {
                layoutParams.addRule(9);
            } else if (intValue2 == 5) {
                layoutParams.addRule(11);
            }
            intValue = getVerticalPosition().intValue();
            if (intValue != 16 || intValue == 17) {
                layoutParams.addRule(15);
            } else if (intValue == 48) {
                layoutParams.addRule(10);
                return;
            } else {
                if (intValue != 80) {
                    return;
                }
                layoutParams.addRule(12);
                return;
            }
        }
        layoutParams.addRule(14);
        intValue = getVerticalPosition().intValue();
        if (intValue != 16) {
        }
        layoutParams.addRule(15);
    }

    @NonNull
    public IabElementStyle copyWith(@Nullable IabElementStyle iabElementStyle) {
        IabElementStyle iabElementStyle2 = new IabElementStyle();
        iabElementStyle2.merge(this);
        iabElementStyle2.merge(iabElementStyle);
        return iabElementStyle2;
    }

    @Nullable
    public String getContent() {
        return this.r;
    }

    @NonNull
    public Integer getFillColor() {
        Integer num = this.b;
        return num != null ? num : Integer.valueOf(Assets.BACKGROUND_COLOR);
    }

    @NonNull
    public Float getFontSize(@NonNull Context context) {
        return this.w != null ? Float.valueOf(Utils.dpToPx(context, r0.floatValue())) : Float.valueOf(Utils.dpToPx(context, 16.0f));
    }

    @NonNull
    public Integer getFontStyle() {
        Integer num = this.v;
        if (num != null) {
            return num;
        }
        return 0;
    }

    @NonNull
    public Integer getHeight(@NonNull Context context) {
        Float f = this.u;
        if (f != null) {
            return f.floatValue() == -1.0f ? Integer.valueOf(this.u.intValue()) : this.u.floatValue() == -2.0f ? Integer.valueOf(this.u.intValue()) : Integer.valueOf(Utils.dpToPx(context, this.u.floatValue()));
        }
        return -2;
    }

    @Nullable
    public Float getHideAfter() {
        return this.i;
    }

    @NonNull
    public Integer getHorizontalPosition() {
        Integer num = this.e;
        if (num != null) {
            return num;
        }
        return 3;
    }

    @NonNull
    public Integer getMarginBottom(@NonNull Context context) {
        if (this.q != null) {
            return Integer.valueOf(Utils.dpToPx(context, r0.intValue()));
        }
        return 0;
    }

    @NonNull
    public Integer getMarginLeft(@NonNull Context context) {
        if (this.n != null) {
            return Integer.valueOf(Utils.dpToPx(context, r0.intValue()));
        }
        return 0;
    }

    @NonNull
    public Integer getMarginRight(@NonNull Context context) {
        if (this.p != null) {
            return Integer.valueOf(Utils.dpToPx(context, r0.intValue()));
        }
        return 0;
    }

    @NonNull
    public Integer getMarginTop(@NonNull Context context) {
        if (this.o != null) {
            return Integer.valueOf(Utils.dpToPx(context, r0.intValue()));
        }
        return 0;
    }

    @NonNull
    public Float getOpacity() {
        Float f = this.h;
        return f != null ? f : Float.valueOf(1.0f);
    }

    @NonNull
    public Integer getPaddingBottom(@NonNull Context context) {
        if (this.m != null) {
            return Integer.valueOf(Utils.dpToPx(context, r0.intValue()));
        }
        return 0;
    }

    @NonNull
    public Integer getPaddingLeft(@NonNull Context context) {
        if (this.j != null) {
            return Integer.valueOf(Utils.dpToPx(context, r0.intValue()));
        }
        return 0;
    }

    @NonNull
    public Integer getPaddingRight(@NonNull Context context) {
        if (this.k != null) {
            return Integer.valueOf(Utils.dpToPx(context, r0.intValue()));
        }
        return 0;
    }

    @NonNull
    public Integer getPaddingTop(@NonNull Context context) {
        if (this.l != null) {
            return Integer.valueOf(Utils.dpToPx(context, r0.intValue()));
        }
        return 0;
    }

    @NonNull
    public Integer getStrokeColor() {
        Integer num = this.a;
        return num != null ? num : Integer.valueOf(Assets.MAIN_ASSETS_COLOR);
    }

    @NonNull
    public Float getStrokeWidth(@NonNull Context context) {
        return this.s != null ? Float.valueOf(Utils.dpToPx(context, r0.floatValue())) : Float.valueOf(0.0f);
    }

    @Nullable
    public String getStyle() {
        return this.g;
    }

    @NonNull
    public Integer getVerticalPosition() {
        Integer num = this.f;
        if (num != null) {
            return num;
        }
        return 48;
    }

    @NonNull
    public Integer getWidth(@NonNull Context context) {
        Float f = this.t;
        if (f != null) {
            return f.floatValue() == -1.0f ? Integer.valueOf(this.t.intValue()) : this.t.floatValue() == -2.0f ? Integer.valueOf(this.t.intValue()) : Integer.valueOf(Utils.dpToPx(context, this.t.floatValue()));
        }
        return -2;
    }

    public boolean hasFillColor() {
        return this.b != null;
    }

    public boolean hasStrokeColor() {
        return this.a != null;
    }

    @NonNull
    public Boolean isOutlined() {
        Boolean bool = this.c;
        return bool != null ? bool : Boolean.FALSE;
    }

    @NonNull
    public Boolean isVisible() {
        Boolean bool = this.d;
        return bool != null ? bool : Boolean.TRUE;
    }

    public void merge(@Nullable IabElementStyle iabElementStyle) {
        if (iabElementStyle == null) {
            return;
        }
        Integer num = iabElementStyle.a;
        if (num != null) {
            this.a = num;
        }
        Integer num2 = iabElementStyle.b;
        if (num2 != null) {
            this.b = num2;
        }
        Boolean bool = iabElementStyle.c;
        if (bool != null) {
            this.c = bool;
        }
        Boolean bool2 = iabElementStyle.d;
        if (bool2 != null) {
            this.d = bool2;
        }
        Integer num3 = iabElementStyle.e;
        if (num3 != null) {
            this.e = num3;
        }
        Integer num4 = iabElementStyle.f;
        if (num4 != null) {
            this.f = num4;
        }
        String str = iabElementStyle.g;
        if (str != null) {
            this.g = str;
        }
        Float f = iabElementStyle.h;
        if (f != null) {
            this.h = f;
        }
        Float f2 = iabElementStyle.i;
        if (f2 != null) {
            this.i = f2;
        }
        Integer num5 = iabElementStyle.j;
        if (num5 != null) {
            this.j = num5;
        }
        Integer num6 = iabElementStyle.k;
        if (num6 != null) {
            this.k = num6;
        }
        Integer num7 = iabElementStyle.l;
        if (num7 != null) {
            this.l = num7;
        }
        Integer num8 = iabElementStyle.m;
        if (num8 != null) {
            this.m = num8;
        }
        Integer num9 = iabElementStyle.n;
        if (num9 != null) {
            this.n = num9;
        }
        Integer num10 = iabElementStyle.p;
        if (num10 != null) {
            this.p = num10;
        }
        Integer num11 = iabElementStyle.o;
        if (num11 != null) {
            this.o = num11;
        }
        Integer num12 = iabElementStyle.q;
        if (num12 != null) {
            this.q = num12;
        }
        String str2 = iabElementStyle.r;
        if (str2 != null) {
            this.r = str2;
        }
        Float f3 = iabElementStyle.s;
        if (f3 != null) {
            this.s = f3;
        }
        Float f4 = iabElementStyle.t;
        if (f4 != null) {
            this.t = f4;
        }
        Float f5 = iabElementStyle.u;
        if (f5 != null) {
            this.u = f5;
        }
        Integer num13 = iabElementStyle.v;
        if (num13 != null) {
            this.v = num13;
        }
        Float f6 = iabElementStyle.w;
        if (f6 != null) {
            this.w = f6;
        }
    }

    public int positionAsGravity() {
        return getVerticalPosition().intValue() | getHorizontalPosition().intValue();
    }

    public void setContent(@Nullable String str) {
        this.r = str;
    }

    public void setFillColor(@Nullable Integer num) {
        this.b = num;
    }

    public void setFontSize(@Nullable Float f) {
        this.w = f;
    }

    public void setFontStyle(@Nullable Integer num) {
        this.v = num;
    }

    public void setHeight(@Nullable Number number) {
        this.u = number != null ? Float.valueOf(number.floatValue()) : null;
    }

    public void setHideAfter(@Nullable Float f) {
        this.i = f;
    }

    public void setHorizontalPosition(@Nullable Integer num) {
        this.e = num;
    }

    public void setMargin(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.n = num;
        this.o = num2;
        this.p = num3;
        this.q = num4;
    }

    public void setMarginBottom(@Nullable Integer num) {
        this.q = num;
    }

    public void setMarginLeft(@Nullable Integer num) {
        this.n = num;
    }

    public void setMarginRight(@Nullable Integer num) {
        this.p = num;
    }

    public void setMarginTop(@Nullable Integer num) {
        this.o = num;
    }

    public void setOpacity(@Nullable Float f) {
        this.h = f;
    }

    public void setOutlined(@Nullable Boolean bool) {
        this.c = bool;
    }

    public void setPadding(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.j = num;
        this.l = num2;
        this.k = num3;
        this.m = num4;
    }

    public void setPaddingBottom(@Nullable Integer num) {
        this.m = num;
    }

    public void setPaddingLeft(@Nullable Integer num) {
        this.j = num;
    }

    public void setPaddingRight(@Nullable Integer num) {
        this.k = num;
    }

    public void setPaddingTop(@Nullable Integer num) {
        this.l = num;
    }

    public void setStrokeColor(@Nullable Integer num) {
        this.a = num;
    }

    public void setStrokeWidth(@Nullable Float f) {
        this.s = f;
    }

    public void setStyle(@Nullable String str) {
        this.g = str;
    }

    public void setVerticalPosition(@Nullable Integer num) {
        this.f = num;
    }

    public void setVisible(@Nullable Boolean bool) {
        this.d = bool;
    }

    public void setWidth(@Nullable Number number) {
        this.t = number != null ? Float.valueOf(number.floatValue()) : null;
    }

    public IabElementStyle(@Nullable IabElementStyle iabElementStyle) {
        merge(iabElementStyle);
    }

    public void setMargin(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            setMargin(null, null, null, null);
            return;
        }
        String[] split = str.split(" ");
        if (split.length == 1) {
            int intValue = Utils.convertCssSizeToPx(split[0]).intValue();
            setMargin(Integer.valueOf(intValue), Integer.valueOf(intValue), Integer.valueOf(intValue), Integer.valueOf(intValue));
            return;
        }
        if (split.length == 2) {
            int intValue2 = Utils.convertCssSizeToPx(split[0]).intValue();
            int intValue3 = Utils.convertCssSizeToPx(split[1]).intValue();
            setMargin(Integer.valueOf(intValue3), Integer.valueOf(intValue2), Integer.valueOf(intValue3), Integer.valueOf(intValue2));
        } else {
            if (split.length == 3) {
                int intValue4 = Utils.convertCssSizeToPx(split[0]).intValue();
                int intValue5 = Utils.convertCssSizeToPx(split[1]).intValue();
                setMargin(Integer.valueOf(intValue5), Integer.valueOf(intValue4), Integer.valueOf(intValue5), Integer.valueOf(Utils.convertCssSizeToPx(split[2]).intValue()));
                return;
            }
            if (split.length == 4) {
                setMargin(Integer.valueOf(Utils.convertCssSizeToPx(split[3]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(split[0]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(split[1]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(split[2]).intValue()));
            }
        }
    }

    public void setPadding(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            setPadding(null, null, null, null);
            return;
        }
        String[] split = str.split(" ");
        if (split.length == 1) {
            int intValue = Utils.convertCssSizeToPx(split[0]).intValue();
            setPadding(Integer.valueOf(intValue), Integer.valueOf(intValue), Integer.valueOf(intValue), Integer.valueOf(intValue));
            return;
        }
        if (split.length == 2) {
            int intValue2 = Utils.convertCssSizeToPx(split[0]).intValue();
            int intValue3 = Utils.convertCssSizeToPx(split[1]).intValue();
            setPadding(Integer.valueOf(intValue3), Integer.valueOf(intValue2), Integer.valueOf(intValue3), Integer.valueOf(intValue2));
        } else {
            if (split.length == 3) {
                int intValue4 = Utils.convertCssSizeToPx(split[0]).intValue();
                int intValue5 = Utils.convertCssSizeToPx(split[1]).intValue();
                setPadding(Integer.valueOf(intValue5), Integer.valueOf(intValue4), Integer.valueOf(intValue5), Integer.valueOf(Utils.convertCssSizeToPx(split[2]).intValue()));
                return;
            }
            if (split.length == 4) {
                setPadding(Integer.valueOf(Utils.convertCssSizeToPx(split[3]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(split[0]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(split[1]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(split[2]).intValue()));
            }
        }
    }
}
