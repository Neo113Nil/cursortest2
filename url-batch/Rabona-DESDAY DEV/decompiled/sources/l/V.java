package l;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2938a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2940c;
    public final /* synthetic */ Object d;

    public V(TextView textView, Typeface typeface, int i) {
        this.f2940c = textView;
        this.d = typeface;
        this.f2939b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2938a) {
            case 0:
                ((TextView) this.f2940c).setTypeface((Typeface) this.d, this.f2939b);
                break;
            default:
                ((BottomSheetBehavior) this.d).E(this.f2940c, this.f2939b, false);
                break;
        }
    }

    public V(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.d = bottomSheetBehavior;
        this.f2940c = view;
        this.f2939b = i;
    }
}
