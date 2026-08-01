package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.ionia.reidopitaco.libya.MainActivity2;
import com.ionia.reidopitaco.libya.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class br extends ey {
    public final /* synthetic */ int d;
    public final /* synthetic */ MainActivity2 e;

    public /* synthetic */ br(MainActivity2 mainActivity2, int i) {
        this.d = i;
        this.e = mainActivity2;
    }

    @Override // defpackage.ey
    public final int a() {
        int i = this.d;
        MainActivity2 mainActivity2 = this.e;
        switch (i) {
            case 0:
                List list = mainActivity2.K;
                if (list != null) {
                    return list.size();
                }
                oo.P("achievements");
                throw null;
            default:
                return mainActivity2.J.size();
        }
    }

    @Override // defpackage.ey
    public final void c(dz dzVar, int i) {
        String string;
        int color;
        int i2 = this.d;
        final MainActivity2 mainActivity2 = this.e;
        switch (i2) {
            case 0:
                ar arVar = (ar) dzVar;
                List list = mainActivity2.K;
                if (list == null) {
                    oo.P("achievements");
                    throw null;
                }
                zq zqVar = (zq) list.get(i);
                po poVar = arVar.u;
                TextView textView = (TextView) poVar.e;
                CardView cardView = (CardView) poVar.c;
                TextView textView2 = (TextView) poVar.d;
                TextView textView3 = (TextView) poVar.f;
                textView.setText(zqVar.e ? zqVar.b : "🔒");
                textView3.setText(mainActivity2.getString(zqVar.c));
                textView2.setText(mainActivity2.getString(zqVar.d));
                if (zqVar.e) {
                    cardView.setCardBackgroundColor(mainActivity2.getColor(R.color.achievementUnlockedBg));
                    cardView.setAlpha(1.0f);
                    textView3.setTextColor(mainActivity2.getColor(R.color.colorTextPrimary));
                    textView2.setTextColor(mainActivity2.getColor(R.color.colorTextSecondary));
                    textView.setAlpha(1.0f);
                    return;
                }
                cardView.setCardBackgroundColor(mainActivity2.getColor(R.color.surface));
                cardView.setAlpha(0.55f);
                textView3.setTextColor(mainActivity2.getColor(R.color.colorTextHint));
                textView2.setTextColor(mainActivity2.getColor(R.color.colorTextHint));
                textView.setAlpha(0.7f);
                return;
            default:
                gr grVar = (gr) dzVar;
                final cr crVar = (cr) mainActivity2.J.get(i);
                String a = oo.a();
                LinkedHashSet linkedHashSet = crVar.e;
                String str = crVar.d;
                boolean contains = linkedHashSet.contains(a);
                ArrayList v = MainActivity2.v();
                int i3 = 0;
                if (!v.isEmpty()) {
                    int size = v.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = v.get(i4);
                        i4++;
                        if (crVar.e.contains((String) obj) && (i3 = i3 + 1) < 0) {
                            va.W();
                            throw null;
                        }
                    }
                }
                final ef efVar = grVar.u;
                TextView textView4 = efVar.a;
                CardView cardView2 = (CardView) efVar.c;
                CheckBox checkBox = (CheckBox) efVar.d;
                textView4.setText(crVar.c);
                ((TextView) efVar.f).setText(crVar.b);
                TextView textView5 = efVar.g;
                int i5 = crVar.f;
                if (i5 > 0) {
                    string = "🔥 " + mainActivity2.getString(R.string.days_streak, Integer.valueOf(i5));
                } else {
                    string = mainActivity2.getString(R.string.no_streak);
                    string.getClass();
                }
                textView5.setText(string);
                ((TextView) efVar.h).setText(mainActivity2.getString(R.string.week_count, Integer.valueOf(i3)));
                try {
                    efVar.e.setBackgroundColor(Color.parseColor(str));
                } catch (Exception unused) {
                }
                try {
                    color = Color.parseColor(str);
                } catch (Exception unused2) {
                    color = mainActivity2.getColor(R.color.colorPrimary);
                }
                checkBox.setButtonTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[]{-16842912}}, new int[]{color, mainActivity2.getColor(R.color.colorDivider)}));
                checkBox.setOnCheckedChangeListener(null);
                checkBox.setChecked(contains);
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: dr
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        compoundButton.getClass();
                        CheckBox checkBox2 = (CheckBox) efVar.d;
                        checkBox2.animate().scaleX(1.25f).scaleY(1.25f).setDuration(100L).withEndAction(new fr(checkBox2, 0)).start();
                        List list2 = MainActivity2.O;
                        String a2 = oo.a();
                        cr crVar2 = crVar;
                        LinkedHashSet linkedHashSet2 = crVar2.e;
                        if (linkedHashSet2.contains(a2)) {
                            linkedHashSet2.remove(a2);
                        } else {
                            linkedHashSet2.add(a2);
                        }
                        MainActivity2.w(crVar2);
                        MainActivity2 mainActivity22 = mainActivity2;
                        mainActivity22.y();
                        mainActivity22.r();
                        mainActivity22.x();
                    }
                });
                cardView2.animate().alpha(contains ? 1.0f : 0.88f).setDuration(200L).start();
                cardView2.setOnLongClickListener(new View.OnLongClickListener() { // from class: er
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        List list2 = MainActivity2.O;
                        final MainActivity2 mainActivity22 = MainActivity2.this;
                        AlertDialog.Builder message = new AlertDialog.Builder(mainActivity22).setTitle(R.string.delete_habit_title).setMessage(R.string.delete_habit_message);
                        final cr crVar2 = crVar;
                        message.setPositiveButton(R.string.delete, new DialogInterface.OnClickListener() { // from class: yq
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i6) {
                                cr crVar3 = crVar2;
                                MainActivity2 mainActivity23 = MainActivity2.this;
                                mainActivity23.J.remove(crVar3);
                                mainActivity23.y();
                                mainActivity23.x();
                            }
                        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show();
                        return true;
                    }
                });
                return;
        }
    }

    @Override // defpackage.ey
    public final dz d(ViewGroup viewGroup) {
        switch (this.d) {
            case 0:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_achievement, viewGroup, false);
                CardView cardView = (CardView) inflate;
                int i = R.id.tvAchievementDesc;
                TextView textView = (TextView) vv.o(inflate, R.id.tvAchievementDesc);
                if (textView != null) {
                    i = R.id.tvAchievementEmoji;
                    TextView textView2 = (TextView) vv.o(inflate, R.id.tvAchievementEmoji);
                    if (textView2 != null) {
                        i = R.id.tvAchievementTitle;
                        TextView textView3 = (TextView) vv.o(inflate, R.id.tvAchievementTitle);
                        if (textView3 != null) {
                            return new ar(new po(cardView, cardView, textView, textView2, textView3));
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            default:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_habit, viewGroup, false);
                CardView cardView2 = (CardView) inflate2;
                int i2 = R.id.checkButton;
                CheckBox checkBox = (CheckBox) vv.o(inflate2, R.id.checkButton);
                if (checkBox != null) {
                    i2 = R.id.colorBar;
                    View o = vv.o(inflate2, R.id.colorBar);
                    if (o != null) {
                        i2 = R.id.tvEmoji;
                        TextView textView4 = (TextView) vv.o(inflate2, R.id.tvEmoji);
                        if (textView4 != null) {
                            i2 = R.id.tvName;
                            TextView textView5 = (TextView) vv.o(inflate2, R.id.tvName);
                            if (textView5 != null) {
                                i2 = R.id.tvStreak;
                                TextView textView6 = (TextView) vv.o(inflate2, R.id.tvStreak);
                                if (textView6 != null) {
                                    i2 = R.id.tvWeekCount;
                                    TextView textView7 = (TextView) vv.o(inflate2, R.id.tvWeekCount);
                                    if (textView7 != null) {
                                        return new gr(new ef(cardView2, cardView2, checkBox, o, textView4, textView5, textView6, textView7));
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
        }
    }
}
