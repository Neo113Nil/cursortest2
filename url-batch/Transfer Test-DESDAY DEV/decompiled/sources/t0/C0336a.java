package t0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.football.transfertrivia.R;
import h0.f;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0336a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3767a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatButton f3768b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatButton f3769c;
    public final AppCompatButton d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatButton f3770e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f3771f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f3772g;
    public final TextView h;
    public final TextView i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f3773j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f3774k;

    public C0336a(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatButton appCompatButton3, AppCompatButton appCompatButton4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f3767a = constraintLayout;
        this.f3768b = appCompatButton;
        this.f3769c = appCompatButton2;
        this.d = appCompatButton3;
        this.f3770e = appCompatButton4;
        this.f3771f = textView;
        this.f3772g = textView2;
        this.h = textView3;
        this.i = textView4;
        this.f3773j = textView5;
        this.f3774k = textView6;
    }

    public static C0336a bind(View view) {
        int i = R.id.btnAnswer1;
        AppCompatButton appCompatButton = (AppCompatButton) f.d(view, R.id.btnAnswer1);
        if (appCompatButton != null) {
            i = R.id.btnAnswer2;
            AppCompatButton appCompatButton2 = (AppCompatButton) f.d(view, R.id.btnAnswer2);
            if (appCompatButton2 != null) {
                i = R.id.btnAnswer3;
                AppCompatButton appCompatButton3 = (AppCompatButton) f.d(view, R.id.btnAnswer3);
                if (appCompatButton3 != null) {
                    i = R.id.btnAnswer4;
                    AppCompatButton appCompatButton4 = (AppCompatButton) f.d(view, R.id.btnAnswer4);
                    if (appCompatButton4 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = R.id.overlay;
                        if (f.d(view, R.id.overlay) != null) {
                            i = R.id.tvClubs;
                            TextView textView = (TextView) f.d(view, R.id.tvClubs);
                            if (textView != null) {
                                i = R.id.tvLives;
                                TextView textView2 = (TextView) f.d(view, R.id.tvLives);
                                if (textView2 != null) {
                                    i = R.id.tvQuestionNumber;
                                    TextView textView3 = (TextView) f.d(view, R.id.tvQuestionNumber);
                                    if (textView3 != null) {
                                        i = R.id.tvScore;
                                        TextView textView4 = (TextView) f.d(view, R.id.tvScore);
                                        if (textView4 != null) {
                                            i = R.id.tvTimer;
                                            TextView textView5 = (TextView) f.d(view, R.id.tvTimer);
                                            if (textView5 != null) {
                                                i = R.id.tvTitle;
                                                if (((TextView) f.d(view, R.id.tvTitle)) != null) {
                                                    i = R.id.tvTransferAmount;
                                                    TextView textView6 = (TextView) f.d(view, R.id.tvTransferAmount);
                                                    if (textView6 != null) {
                                                        return new C0336a(constraintLayout, appCompatButton, appCompatButton2, appCompatButton3, appCompatButton4, textView, textView2, textView3, textView4, textView5, textView6);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static C0336a inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_game, (ViewGroup) null, false));
    }
}
