package yads;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class ft {
    public final ArrayList a;
    public final ArrayList b;
    public final StringBuilder c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public ft(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.c = sb;
        this.g = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
        this.h = i2;
    }

    public final void a() {
        int length = this.c.length();
        if (length > 0) {
            this.c.delete(length - 1, length);
            for (int size = this.a.size() - 1; size >= 0; size--) {
                et etVar = (et) this.a.get(size);
                int i = etVar.c;
                if (i != length) {
                    return;
                }
                etVar.c = i - 1;
            }
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
        int length = spannableStringBuilder.length();
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (i5 < this.a.size()) {
            et etVar = (et) this.a.get(i5);
            boolean z2 = etVar.b;
            int i7 = etVar.a;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i4 = gt.A[i7];
                }
                z = z3;
            }
            int i8 = etVar.c;
            i5++;
            if (i8 != (i5 < this.a.size() ? ((et) this.a.get(i5)).c : length)) {
                if (i != -1 && !z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                    i = -1;
                } else if (i == -1 && z2) {
                    i = i8;
                }
                if (i2 != -1 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i2, i8, 33);
                    i2 = -1;
                } else if (i2 == -1 && z) {
                    i2 = i8;
                }
                if (i4 != i3) {
                    if (i3 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                    }
                    i6 = i8;
                    i3 = i4;
                }
            }
        }
        if (i != -1 && i != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
        }
        if (i2 != -1 && i2 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
        }
        if (i6 != length && i3 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final s20 a(int i) {
        int i2;
        float f;
        int i3 = this.e + this.f;
        int i4 = 32 - i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i5 = 0; i5 < this.b.size(); i5++) {
            CharSequence charSequence = (CharSequence) this.b.get(i5);
            int i6 = sb3.a;
            if (charSequence.length() > i4) {
                charSequence = charSequence.subSequence(0, i4);
            }
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append('\n');
        }
        SpannableString b = b();
        int i7 = sb3.a;
        int length = b.length();
        CharSequence charSequence2 = b;
        if (length > i4) {
            charSequence2 = b.subSequence(0, i4);
        }
        spannableStringBuilder.append(charSequence2);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i4 - spannableStringBuilder.length();
        int i8 = i3 - length2;
        if (i != Integer.MIN_VALUE) {
            i2 = i;
        } else if (this.g != 2 || (Math.abs(i8) >= 3 && length2 >= 0)) {
            i2 = (this.g != 2 || i8 <= 0) ? 0 : 2;
        } else {
            i2 = 1;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = 32 - length2;
            }
            f = ((i3 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        float f2 = f;
        int i9 = this.d;
        if (i9 > 7) {
            i9 -= 17;
        } else if (this.g == 1) {
            i9 -= this.h - 1;
        }
        return new s20(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i9, 1, Integer.MIN_VALUE, f2, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }
}
