package yads;

import android.view.View;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;

/* loaded from: classes13.dex */
public final class vl2 extends ek3 {
    public final mt1 c;

    public vl2(View view, mt1 mt1Var) {
        super(view);
        this.c = mt1Var;
    }

    @Override // yads.ek3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.ek3
    public final void b(View view, Object obj) {
        String str = (String) obj;
        try {
            ((wl2) view).setRating(RangesKt.coerceAtLeast(Float.parseFloat(str), 0.0f));
        } catch (NumberFormatException e) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
            boolean z = ob1.a;
            this.c.reportError("Could not parse rating value", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.ek3
    public final void a(View view) {
        ((wl2) view).setRating(0.0f);
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }
}
