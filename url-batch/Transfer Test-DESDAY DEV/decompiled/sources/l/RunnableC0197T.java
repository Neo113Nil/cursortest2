package l;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: l.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0197T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2945a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2947c;
    public final /* synthetic */ Object d;

    public RunnableC0197T(TextView textView, Typeface typeface, int i) {
        this.f2947c = textView;
        this.d = typeface;
        this.f2946b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2945a) {
            case 0:
                ((TextView) this.f2947c).setTypeface((Typeface) this.d, this.f2946b);
                break;
            default:
                ((BottomSheetBehavior) this.d).E(this.f2947c, this.f2946b, false);
                break;
        }
    }

    public RunnableC0197T(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.d = bottomSheetBehavior;
        this.f2947c = view;
        this.f2946b = i;
    }
}
