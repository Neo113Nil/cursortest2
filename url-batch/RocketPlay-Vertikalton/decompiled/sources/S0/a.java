package S0;

import a1.AbstractC0067d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.luckycounter.drinkwater.AddWaterActivity;
import com.luckycounter.drinkwater.DashboardActivity;
import com.luckycounter.drinkwater.PyramidActivity;
import com.luckycounter.drinkwater.R;
import com.luckycounter.drinkwater.SettingsActivity;
import com.luckycounter.drinkwater.WaterLogActivity;
import com.luckycounter.drinkwater.ui.HydrationCoreView;
import com.luckycounter.drinkwater.ui.PercentRingView;
import g.AbstractActivityC0129i;
import h1.InterfaceC0173a;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC0173a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0129i f1069b;

    public /* synthetic */ a(AbstractActivityC0129i abstractActivityC0129i, int i) {
        this.f1068a = i;
        this.f1069b = abstractActivityC0129i;
    }

    @Override // h1.InterfaceC0173a
    public final Object c() {
        AbstractActivityC0129i abstractActivityC0129i = this.f1069b;
        switch (this.f1068a) {
            case 0:
                int i = AddWaterActivity.f2466A;
                View inflate = ((AddWaterActivity) abstractActivityC0129i).getLayoutInflater().inflate(R.layout.activity_add_water, (ViewGroup) null, false);
                int i2 = R.id.btnCancel;
                Button button = (Button) AbstractC0067d.h(inflate, R.id.btnCancel);
                if (button != null) {
                    i2 = R.id.btnSave;
                    Button button2 = (Button) AbstractC0067d.h(inflate, R.id.btnSave);
                    if (button2 != null) {
                        i2 = R.id.chip150;
                        Button button3 = (Button) AbstractC0067d.h(inflate, R.id.chip150);
                        if (button3 != null) {
                            i2 = R.id.chip250;
                            Button button4 = (Button) AbstractC0067d.h(inflate, R.id.chip250);
                            if (button4 != null) {
                                i2 = R.id.chip500;
                                Button button5 = (Button) AbstractC0067d.h(inflate, R.id.chip500);
                                if (button5 != null) {
                                    i2 = R.id.editAmount;
                                    EditText editText = (EditText) AbstractC0067d.h(inflate, R.id.editAmount);
                                    if (editText != null) {
                                        return new T0.a((FrameLayout) inflate, button, button2, button3, button4, button5, editText);
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            case 1:
                int i3 = DashboardActivity.f2469A;
                View inflate2 = ((DashboardActivity) abstractActivityC0129i).getLayoutInflater().inflate(R.layout.activity_dashboard, (ViewGroup) null, false);
                int i4 = R.id.btnAdd150;
                Button button6 = (Button) AbstractC0067d.h(inflate2, R.id.btnAdd150);
                if (button6 != null) {
                    i4 = R.id.btnAdd250;
                    Button button7 = (Button) AbstractC0067d.h(inflate2, R.id.btnAdd250);
                    if (button7 != null) {
                        i4 = R.id.btnAdd500;
                        Button button8 = (Button) AbstractC0067d.h(inflate2, R.id.btnAdd500);
                        if (button8 != null) {
                            i4 = R.id.btnCustom;
                            Button button9 = (Button) AbstractC0067d.h(inflate2, R.id.btnCustom);
                            if (button9 != null) {
                                i4 = R.id.btnLog;
                                Button button10 = (Button) AbstractC0067d.h(inflate2, R.id.btnLog);
                                if (button10 != null) {
                                    i4 = R.id.btnPyramid;
                                    Button button11 = (Button) AbstractC0067d.h(inflate2, R.id.btnPyramid);
                                    if (button11 != null) {
                                        i4 = R.id.btnSettings;
                                        Button button12 = (Button) AbstractC0067d.h(inflate2, R.id.btnSettings);
                                        if (button12 != null) {
                                            i4 = R.id.hudRow;
                                            if (((LinearLayout) AbstractC0067d.h(inflate2, R.id.hudRow)) != null) {
                                                i4 = R.id.hydrationCore;
                                                HydrationCoreView hydrationCoreView = (HydrationCoreView) AbstractC0067d.h(inflate2, R.id.hydrationCore);
                                                if (hydrationCoreView != null) {
                                                    i4 = R.id.percentRing;
                                                    PercentRingView percentRingView = (PercentRingView) AbstractC0067d.h(inflate2, R.id.percentRing);
                                                    if (percentRingView != null) {
                                                        i4 = R.id.textGoal;
                                                        TextView textView = (TextView) AbstractC0067d.h(inflate2, R.id.textGoal);
                                                        if (textView != null) {
                                                            i4 = R.id.textStreak;
                                                            TextView textView2 = (TextView) AbstractC0067d.h(inflate2, R.id.textStreak);
                                                            if (textView2 != null) {
                                                                i4 = R.id.textTier;
                                                                TextView textView3 = (TextView) AbstractC0067d.h(inflate2, R.id.textTier);
                                                                if (textView3 != null) {
                                                                    i4 = R.id.textToday;
                                                                    TextView textView4 = (TextView) AbstractC0067d.h(inflate2, R.id.textToday);
                                                                    if (textView4 != null) {
                                                                        return new T0.b((FrameLayout) inflate2, button6, button7, button8, button9, button10, button11, button12, hydrationCoreView, percentRingView, textView, textView2, textView3, textView4);
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
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i4)));
            case 2:
                int i5 = PyramidActivity.f2479A;
                View inflate3 = ((PyramidActivity) abstractActivityC0129i).getLayoutInflater().inflate(R.layout.activity_pyramid, (ViewGroup) null, false);
                LinearLayout linearLayout = (LinearLayout) AbstractC0067d.h(inflate3, R.id.pyramidContainer);
                if (linearLayout != null) {
                    return new T0.d((FrameLayout) inflate3, linearLayout);
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(R.id.pyramidContainer)));
            case 3:
                int i6 = SettingsActivity.f2482A;
                View inflate4 = ((SettingsActivity) abstractActivityC0129i).getLayoutInflater().inflate(R.layout.activity_settings, (ViewGroup) null, false);
                int i7 = R.id.btnResetStreak;
                Button button13 = (Button) AbstractC0067d.h(inflate4, R.id.btnResetStreak);
                if (button13 != null) {
                    i7 = R.id.seekGoal;
                    SeekBar seekBar = (SeekBar) AbstractC0067d.h(inflate4, R.id.seekGoal);
                    if (seekBar != null) {
                        i7 = R.id.textGoalValue;
                        TextView textView5 = (TextView) AbstractC0067d.h(inflate4, R.id.textGoalValue);
                        if (textView5 != null) {
                            i7 = R.id.textMaxGoal;
                            TextView textView6 = (TextView) AbstractC0067d.h(inflate4, R.id.textMaxGoal);
                            if (textView6 != null) {
                                return new T0.e((FrameLayout) inflate4, button13, seekBar, textView5, textView6);
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i7)));
            default:
                int i8 = WaterLogActivity.f2487B;
                View inflate5 = ((WaterLogActivity) abstractActivityC0129i).getLayoutInflater().inflate(R.layout.activity_water_log, (ViewGroup) null, false);
                int i9 = R.id.recyclerLog;
                RecyclerView recyclerView = (RecyclerView) AbstractC0067d.h(inflate5, R.id.recyclerLog);
                if (recyclerView != null) {
                    i9 = R.id.textEmpty;
                    TextView textView7 = (TextView) AbstractC0067d.h(inflate5, R.id.textEmpty);
                    if (textView7 != null) {
                        return new T0.g((FrameLayout) inflate5, recyclerView, textView7);
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate5.getResources().getResourceName(i9)));
        }
    }
}
