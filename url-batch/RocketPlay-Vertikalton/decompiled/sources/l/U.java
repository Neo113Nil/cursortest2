package l;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class U implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3373a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3374b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3375c;
    public final /* synthetic */ Object d;

    public U(TextView textView, Typeface typeface, int i) {
        this.f3375c = textView;
        this.d = typeface;
        this.f3374b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3373a) {
            case 0:
                ((TextView) this.f3375c).setTypeface((Typeface) this.d, this.f3374b);
                break;
            default:
                ((BottomSheetBehavior) this.d).E(this.f3375c, this.f3374b, false);
                break;
        }
    }

    public U(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.d = bottomSheetBehavior;
        this.f3375c = view;
        this.f3374b = i;
    }
}
