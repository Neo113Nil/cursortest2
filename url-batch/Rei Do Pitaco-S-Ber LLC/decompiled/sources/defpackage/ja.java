package defpackage;

import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ionia.reidopitaco.libya.MainActivity2;
import com.ionia.reidopitaco.libya.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ja implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ja(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        Throwable th = null;
        Object obj = this.g;
        switch (i) {
            case 0:
                na naVar = (na) obj;
                EditText editText = naVar.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (view.hasFocus()) {
                    naVar.i.requestFocus();
                }
                if (text != null) {
                    text.clear();
                }
                naVar.p();
                return;
            case 1:
                ((hg) obj).t();
                return;
            case 2:
                MainActivity2 mainActivity2 = (MainActivity2) obj;
                List list = MainActivity2.O;
                View inflate = mainActivity2.getLayoutInflater().inflate(R.layout.dialog_add_habit, (ViewGroup) null, false);
                int i2 = R.id.btnCancel;
                Button button = (Button) vv.o(inflate, R.id.btnCancel);
                if (button != null) {
                    i2 = R.id.btnSave;
                    Button button2 = (Button) vv.o(inflate, R.id.btnSave);
                    if (button2 != null) {
                        i2 = R.id.colorContainer;
                        LinearLayout linearLayout = (LinearLayout) vv.o(inflate, R.id.colorContainer);
                        if (linearLayout != null) {
                            i2 = R.id.emojiContainer;
                            LinearLayout linearLayout2 = (LinearLayout) vv.o(inflate, R.id.emojiContainer);
                            if (linearLayout2 != null) {
                                i2 = R.id.etHabitName;
                                TextInputEditText textInputEditText = (TextInputEditText) vv.o(inflate, R.id.etHabitName);
                                if (textInputEditText != null) {
                                    i2 = R.id.tilHabitName;
                                    TextInputLayout textInputLayout = (TextInputLayout) vv.o(inflate, R.id.tilHabitName);
                                    if (textInputLayout != null) {
                                        i2 = R.id.tvSelectedEmoji;
                                        TextView textView = (TextView) vv.o(inflate, R.id.tvSelectedEmoji);
                                        if (textView != null) {
                                            ef efVar = new ef((ScrollView) inflate, button, button2, linearLayout, linearLayout2, textInputEditText, textInputLayout, textView);
                                            gz gzVar = new gz(0);
                                            List list2 = MainActivity2.P;
                                            Object obj2 = list2.get(0);
                                            obj2.getClass();
                                            gzVar.g = obj2;
                                            final gz gzVar2 = new gz(0);
                                            Object obj3 = list.get(0);
                                            obj3.getClass();
                                            gzVar2.g = obj3;
                                            int i3 = 0;
                                            for (Object obj4 : list2) {
                                                int i4 = i3 + 1;
                                                if (i3 < 0) {
                                                    Throwable th2 = th;
                                                    va.X();
                                                    throw th2;
                                                }
                                                String str = (String) obj4;
                                                TextView textView2 = new TextView(mainActivity2);
                                                textView2.setText(str);
                                                textView2.setTextSize(26.0f);
                                                textView2.setGravity(17);
                                                mainActivity2.s(48);
                                                Throwable th3 = th;
                                                textView2.setPadding(mainActivity2.s(4), mainActivity2.s(4), mainActivity2.s(4), mainActivity2.s(4));
                                                gz gzVar3 = gzVar;
                                                ef efVar2 = efVar;
                                                MainActivity2 mainActivity22 = mainActivity2;
                                                wq wqVar = new wq(gzVar3, str, efVar2, mainActivity22, i3);
                                                efVar = efVar2;
                                                textView2.setOnClickListener(wqVar);
                                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(mainActivity22.s(52), mainActivity22.s(52));
                                                layoutParams.setMargins(mainActivity22.s(4), 0, mainActivity22.s(4), 0);
                                                linearLayout2.addView(textView2, layoutParams);
                                                list = list;
                                                gzVar = gzVar3;
                                                mainActivity2 = mainActivity22;
                                                i3 = i4;
                                                th = th3;
                                            }
                                            Throwable th4 = th;
                                            final gz gzVar4 = gzVar;
                                            MainActivity2 mainActivity23 = mainActivity2;
                                            int i5 = 0;
                                            for (Object obj5 : list) {
                                                int i6 = i5 + 1;
                                                if (i5 < 0) {
                                                    va.X();
                                                    throw th4;
                                                }
                                                String str2 = (String) obj5;
                                                View view2 = new View(mainActivity23);
                                                int s = mainActivity23.s(44);
                                                view2.setTag(str2);
                                                view2.setClipToOutline(true);
                                                int parseColor = Color.parseColor(str2);
                                                GradientDrawable gradientDrawable = new GradientDrawable();
                                                gradientDrawable.setShape(1);
                                                gradientDrawable.setColor(parseColor);
                                                gradientDrawable.setStroke(0, 0);
                                                view2.setBackground(gradientDrawable);
                                                MainActivity2 mainActivity24 = mainActivity23;
                                                view2.setOnClickListener(new wq(gzVar2, str2, mainActivity24, efVar, i5));
                                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(s, s);
                                                layoutParams2.setMargins(mainActivity24.s(8), 0, mainActivity24.s(8), 0);
                                                linearLayout.addView(view2, layoutParams2);
                                                i5 = i6;
                                                mainActivity23 = mainActivity24;
                                            }
                                            final MainActivity2 mainActivity25 = mainActivity23;
                                            mainActivity25.u(linearLayout2, 0);
                                            mainActivity25.t(linearLayout, 0);
                                            efVar.a.setText((CharSequence) gzVar4.g);
                                            final AlertDialog create = new AlertDialog.Builder(mainActivity25, R.style.DialogStyle).setView((ScrollView) efVar.b).create();
                                            Window window = create.getWindow();
                                            if (window != null) {
                                                window.setBackgroundDrawableResource(android.R.color.transparent);
                                            }
                                            Window window2 = create.getWindow();
                                            if (window2 != null) {
                                                window2.setDimAmount(0.5f);
                                            }
                                            ((Button) efVar.c).setOnClickListener(new ja(3, create));
                                            final ef efVar3 = efVar;
                                            efVar.d.setOnClickListener(new View.OnClickListener() { // from class: xq
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view3) {
                                                    String obj6;
                                                    List list3 = MainActivity2.O;
                                                    ef efVar4 = ef.this;
                                                    TextInputEditText textInputEditText2 = (TextInputEditText) efVar4.g;
                                                    TextInputLayout textInputLayout2 = (TextInputLayout) efVar4.h;
                                                    Editable text2 = textInputEditText2.getText();
                                                    String obj7 = (text2 == null || (obj6 = text2.toString()) == null) ? null : m30.x0(obj6).toString();
                                                    MainActivity2 mainActivity26 = mainActivity25;
                                                    if (obj7 == null || obj7.length() == 0) {
                                                        textInputLayout2.setError(mainActivity26.getString(R.string.error_empty_name));
                                                        return;
                                                    }
                                                    textInputLayout2.setError(null);
                                                    String str3 = (String) gzVar4.g;
                                                    String str4 = (String) gzVar2.g;
                                                    String uuid = UUID.randomUUID().toString();
                                                    uuid.getClass();
                                                    cr crVar = new cr(uuid, obj7, str3, str4, new LinkedHashSet(), 0, 0);
                                                    MainActivity2.w(crVar);
                                                    mainActivity26.J.add(crVar);
                                                    mainActivity26.y();
                                                    mainActivity26.r();
                                                    mainActivity26.x();
                                                    create.dismiss();
                                                    m80 m80Var = mainActivity26.G;
                                                    if (m80Var != null) {
                                                        m80Var.c.animate().scaleX(1.3f).scaleY(1.3f).setDuration(120L).withEndAction(new p1(9, mainActivity26)).start();
                                                    } else {
                                                        oo.P("habitsBinding");
                                                        throw null;
                                                    }
                                                }
                                            });
                                            create.show();
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            case 3:
                List list3 = MainActivity2.O;
                ((AlertDialog) obj).dismiss();
                return;
            case 4:
                ((gs) obj).H();
                throw null;
            default:
                dw dwVar = (dw) obj;
                EditText editText2 = dwVar.f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = dwVar.f;
                boolean z = editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod);
                EditText editText4 = dwVar.f;
                if (z) {
                    editText4.setTransformationMethod(null);
                } else {
                    editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    dwVar.f.setSelection(selectionEnd);
                }
                dwVar.p();
                return;
        }
    }
}
