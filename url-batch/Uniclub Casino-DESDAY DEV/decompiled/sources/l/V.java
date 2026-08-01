package l;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2941a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2943c;
    public final /* synthetic */ Object d;

    public V(TextView textView, Typeface typeface, int i) {
        this.f2943c = textView;
        this.d = typeface;
        this.f2942b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2941a) {
            case 0:
                ((TextView) this.f2943c).setTypeface((Typeface) this.d, this.f2942b);
                break;
            default:
                ((BottomSheetBehavior) this.d).E(this.f2943c, this.f2942b, false);
                break;
        }
    }

    public V(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.d = bottomSheetBehavior;
        this.f2943c = view;
        this.f2942b = i;
    }
}
