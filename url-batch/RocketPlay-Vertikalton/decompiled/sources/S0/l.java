package S0;

import android.widget.SeekBar;
import com.luckycounter.drinkwater.R;
import com.luckycounter.drinkwater.SettingsActivity;
import com.luckycounter.drinkwater.data.HydrationRepository;

/* loaded from: classes.dex */
public final class l implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SettingsActivity f1089a;

    public l(SettingsActivity settingsActivity) {
        this.f1089a = settingsActivity;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z2) {
        if (i < 500) {
            i = 500;
        }
        int i2 = SettingsActivity.f2482A;
        SettingsActivity settingsActivity = this.f1089a;
        settingsActivity.t().d.setText(settingsActivity.getString(R.string.goal_label, Integer.valueOf(i)));
        if (z2) {
            HydrationRepository hydrationRepository = settingsActivity.f2484z;
            if (hydrationRepository != null) {
                hydrationRepository.setDailyGoal(i);
            } else {
                i1.f.h("repository");
                throw null;
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
