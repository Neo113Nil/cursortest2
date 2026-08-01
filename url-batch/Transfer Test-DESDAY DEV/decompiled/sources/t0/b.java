package t0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.football.transfertrivia.R;
import h0.f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3775a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatButton f3776b;

    public b(ConstraintLayout constraintLayout, AppCompatButton appCompatButton) {
        this.f3775a = constraintLayout;
        this.f3776b = appCompatButton;
    }

    public static b bind(View view) {
        AppCompatButton appCompatButton = (AppCompatButton) f.d(view, R.id.buttonNext);
        if (appCompatButton != null) {
            return new b((ConstraintLayout) view, appCompatButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.buttonNext)));
    }

    public static b inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_main, (ViewGroup) null, false));
    }
}
