package l;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2916a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2918c;
    public final /* synthetic */ Object d;

    public V(TextView textView, Typeface typeface, int i) {
        this.f2918c = textView;
        this.d = typeface;
        this.f2917b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2916a) {
            case 0:
                ((TextView) this.f2918c).setTypeface((Typeface) this.d, this.f2917b);
                break;
            default:
                ((BottomSheetBehavior) this.d).E(this.f2918c, this.f2917b, false);
                break;
        }
    }

    public V(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.d = bottomSheetBehavior;
        this.f2918c = view;
        this.f2917b = i;
    }
}
