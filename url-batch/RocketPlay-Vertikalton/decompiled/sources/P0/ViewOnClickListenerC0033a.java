package P0;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.EditText;
import com.luckycounter.drinkwater.R;
import com.luckycounter.drinkwater.SettingsActivity;
import com.luckycounter.drinkwater.TargetCrashActivity;
import com.luckycounter.drinkwater.data.HydrationRepository;
import g.C0122b;

/* renamed from: P0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0033a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f921b;

    public /* synthetic */ ViewOnClickListenerC0033a(int i, Object obj) {
        this.f920a = i;
        this.f921b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [S0.k] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f921b;
        switch (this.f920a) {
            case 0:
                e eVar = (e) obj;
                EditText editText = eVar.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                eVar.q();
                return;
            case 1:
                ((k) obj).u();
                return;
            case 2:
                x xVar = (x) obj;
                EditText editText2 = xVar.f1024f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = xVar.f1024f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    xVar.f1024f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    xVar.f1024f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    xVar.f1024f.setSelection(selectionEnd);
                }
                xVar.q();
                return;
            case 3:
                int i = SettingsActivity.f2482A;
                final SettingsActivity settingsActivity = (SettingsActivity) obj;
                settingsActivity.getClass();
                B1.p pVar = new B1.p(settingsActivity);
                C0122b c0122b = (C0122b) pVar.f223b;
                c0122b.f2634f = c0122b.f2630a.getText(R.string.reset_streak_confirm);
                ?? r2 = new DialogInterface.OnClickListener() { // from class: S0.k
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        SettingsActivity settingsActivity2 = SettingsActivity.this;
                        HydrationRepository hydrationRepository = settingsActivity2.f2484z;
                        if (hydrationRepository == null) {
                            i1.f.h("repository");
                            throw null;
                        }
                        hydrationRepository.resetStreak();
                        settingsActivity2.finish();
                    }
                };
                ContextThemeWrapper contextThemeWrapper = c0122b.f2630a;
                c0122b.f2635g = contextThemeWrapper.getText(R.string.yes);
                c0122b.h = r2;
                c0122b.i = contextThemeWrapper.getText(R.string.no);
                pVar.a().show();
                return;
            case 4:
                int i2 = TargetCrashActivity.f2485z;
                ((TargetCrashActivity) obj).finish();
                return;
            default:
                ((com.google.android.material.datepicker.m) obj).H();
                throw null;
        }
    }
}
