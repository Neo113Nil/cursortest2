package yads;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.util.Comparator;

/* loaded from: classes5.dex */
public final class ht {
    public static final Comparator c = new Comparator() { // from class: yads.ht$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Integer.compare(((ht) obj2).b, ((ht) obj).b);
            return compare;
        }
    };
    public final s20 a;
    public final int b;

    public ht(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        this.a = new s20(spannableStringBuilder, alignment, null, null, f, 0, i, f2, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z, z ? i3 : -16777216, Integer.MIN_VALUE, 0.0f);
        this.b = i4;
    }
}
