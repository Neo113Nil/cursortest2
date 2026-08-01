package t0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.football.transfertrivia.R;
import h0.f;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3777a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatButton f3778b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f3779c;
    public final TextView d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f3780e;

    public c(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.f3777a = constraintLayout;
        this.f3778b = appCompatButton;
        this.f3779c = recyclerView;
        this.d = textView;
        this.f3780e = textView2;
    }

    public static c bind(View view) {
        int i = R.id.btnPlayAgain;
        AppCompatButton appCompatButton = (AppCompatButton) f.d(view, R.id.btnPlayAgain);
        if (appCompatButton != null) {
            i = R.id.overlay;
            if (f.d(view, R.id.overlay) != null) {
                i = R.id.recyclerLeaderboard;
                RecyclerView recyclerView = (RecyclerView) f.d(view, R.id.recyclerLeaderboard);
                if (recyclerView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = R.id.tvFinalScore;
                    TextView textView = (TextView) f.d(view, R.id.tvFinalScore);
                    if (textView != null) {
                        i = R.id.tvLeaderboardTitle;
                        if (((TextView) f.d(view, R.id.tvLeaderboardTitle)) != null) {
                            i = R.id.tvResultTitle;
                            TextView textView2 = (TextView) f.d(view, R.id.tvResultTitle);
                            if (textView2 != null) {
                                return new c(constraintLayout, appCompatButton, recyclerView, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static c inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_result, (ViewGroup) null, false));
    }
}
