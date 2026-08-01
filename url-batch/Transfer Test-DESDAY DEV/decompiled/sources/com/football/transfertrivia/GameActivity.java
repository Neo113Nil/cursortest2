package com.football.transfertrivia;

import A.a;
import V0.f;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.J;
import com.football.transfertrivia.GameActivity;
import com.football.transfertrivia.R;
import com.football.transfertrivia.db.AppDatabase;
import com.football.transfertrivia.db.GameSessionEntity;
import java.util.Iterator;
import java.util.List;
import o1.AbstractC0302t;
import o1.AbstractC0308z;
import s0.b;
import s0.d;
import s0.i;
import s0.j;
import t0.C0336a;

/* loaded from: classes.dex */
public final class GameActivity extends AppCompatActivity {

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ int f1737I = 0;

    /* renamed from: A, reason: collision with root package name */
    public AppDatabase f1738A;

    /* renamed from: B, reason: collision with root package name */
    public GameSessionEntity f1739B;

    /* renamed from: C, reason: collision with root package name */
    public CountDownTimer f1740C;

    /* renamed from: D, reason: collision with root package name */
    public int f1741D;

    /* renamed from: E, reason: collision with root package name */
    public int f1742E;
    public int F = 3;

    /* renamed from: G, reason: collision with root package name */
    public long f1743G = 15000;

    /* renamed from: H, reason: collision with root package name */
    public final List f1744H = f.a0(new b("80 млн €", "Leicester", "Manchester United", "Harry Maguire", f.a0("Harry Maguire", "Aaron Wan-Bissaka", "Victor Lindelof", "Eric Bailly")), new b("105 млн €", "Juventus", "Manchester United", "Paul Pogba", f.a0("Paul Pogba", "Bruno Fernandes", "Fred", "Nemanja Matic")), new b("222 млн €", "Barcelona", "Paris Saint-Germain", "Neymar", f.a0("Neymar", "Kylian Mbappe", "Lionel Messi", "Edinson Cavani")), new b("180 млн €", "Monaco", "Paris Saint-Germain", "Kylian Mbappe", f.a0("Kylian Mbappe", "Neymar", "Angel Di Maria", "Julian Draxler")), new b("100 млн €", "Tottenham", "Real Madrid", "Gareth Bale", f.a0("Gareth Bale", "Luka Modric", "Cristiano Ronaldo", "Toby Alderweireld")), new b("94 млн €", "Ajax", "Juventus", "Matthijs de Ligt", f.a0("Matthijs de Ligt", "Frenkie de Jong", "Donny van de Beek", "Dusan Tadic")), new b("145 млн €", "Chelsea", "Real Madrid", "Eden Hazard", f.a0("Eden Hazard", "Cristiano Ronaldo", "Gareth Bale", "Luka Jovic")), new b("120 млн €", "Atletico Madrid", "Barcelona", "Antoine Griezmann", f.a0("Antoine Griezmann", "Luis Suarez", "Ousmane Dembele", "Philippe Coutinho")), new b("105 млн €", "Everton", "Manchester United", "Romelu Lukaku", f.a0("Romelu Lukaku", "Marcus Rashford", "Anthony Martial", "Odion Ighalo")), new b("145 млн €", "Liverpool", "Barcelona", "Philippe Coutinho", f.a0("Philippe Coutinho", "Luis Suarez", "Ousmane Dembele", "Nelson Semedo")), new b("135 млн €", "Borussia Dortmund", "Barcelona", "Ousmane Dembele", f.a0("Ousmane Dembele", "Philippe Coutinho", "Nelson Semedo", "Jordi Alba")), new b("126 млн €", "Benfica", "Atletico Madrid", "Joao Felix", f.a0("Joao Felix", "Antoine Griezmann", "Diego Costa", "Alvaro Morata")), new b("107 млн €", "Benfica", "Chelsea", "Enzo Fernandez", f.a0("Enzo Fernandez", "Mason Mount", "Kai Havertz", "Christian Pulisic")), new b("116 млн €", "West Ham", "Arsenal", "Declan Rice", f.a0("Declan Rice", "Thomas Partey", "Granit Xhaka", "Martin Odegaard")), new b("100 млн €", "Aston Villa", "Manchester City", "Jack Grealish", f.a0("Jack Grealish", "Phil Foden", "Kevin De Bruyne", "Riyad Mahrez")), new b("95 млн €", "Inter Milan", "Chelsea", "Romelu Lukaku", f.a0("Romelu Lukaku", "Lautaro Martinez", "Timo Werner", "Christian Pulisic")), new b("85 млн €", "Sporting CP", "Manchester United", "Bruno Fernandes", f.a0("Bruno Fernandes", "Fred", "Nemanja Matic", "Donny van de Beek")), new b("75 млн €", "RB Leipzig", "Chelsea", "Timo Werner", f.a0("Timo Werner", "Kai Havertz", "Christian Pulisic", "Hakim Ziyech")), new b("70 млн €", "Bayern Munich", "Barcelona", "Robert Lewandowski", f.a0("Robert Lewandowski", "Thomas Muller", "Serge Gnabry", "Leroy Sane")), new b("60 млн €", "Real Sociedad", "Manchester City", "Aymeric Laporte", f.a0("Aymeric Laporte", "John Stones", "Ruben Dias", "Nathan Ake")), new b("55 млн €", "Southampton", "Liverpool", "Virgil van Dijk", f.a0("Virgil van Dijk", "Joe Gomez", "Joel Matip", "Dejan Lovren")), new b("50 млн €", "AS Roma", "Liverpool", "Mohamed Salah", f.a0("Mohamed Salah", "Sadio Mane", "Roberto Firmino", "Diogo Jota")), new b("48 млн €", "RB Leipzig", "Liverpool", "Ibrahima Konate", f.a0("Ibrahima Konate", "Dayot Upamecano", "Joel Matip", "Joe Gomez")), new b("42 млн €", "Wolves", "Liverpool", "Diogo Jota", f.a0("Diogo Jota", "Darwin Nunez", "Luis Diaz", "Cody Gakpo")), new b("40 млн €", "Brighton", "Chelsea", "Marc Cucurella", f.a0("Marc Cucurella", "Levi Colwill", "Malo Gusto", "Ben Chilwell")));

    /* renamed from: z, reason: collision with root package name */
    public C0336a f1745z;

    public final void n() {
        int i = this.f1741D;
        if (i >= 10 || this.F <= 0) {
            CountDownTimer countDownTimer = this.f1740C;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            AbstractC0302t.i(J.e(this), AbstractC0308z.f3346b, new d(this, null));
            return;
        }
        b bVar = (b) this.f1744H.get(i);
        C0336a c0336a = this.f1745z;
        if (c0336a == null) {
            g1.f.g("binding");
            throw null;
        }
        c0336a.h.setText(getString(R.string.question_format, Integer.valueOf(this.f1741D + 1)));
        C0336a c0336a2 = this.f1745z;
        if (c0336a2 == null) {
            g1.f.g("binding");
            throw null;
        }
        c0336a2.f3772g.setText(getString(R.string.lives_format, Integer.valueOf(this.F)));
        C0336a c0336a3 = this.f1745z;
        if (c0336a3 == null) {
            g1.f.g("binding");
            throw null;
        }
        c0336a3.i.setText(getString(R.string.score_format, Integer.valueOf(this.f1742E)));
        C0336a c0336a4 = this.f1745z;
        if (c0336a4 == null) {
            g1.f.g("binding");
            throw null;
        }
        c0336a4.f3774k.setText(bVar.f3644a);
        C0336a c0336a5 = this.f1745z;
        if (c0336a5 == null) {
            g1.f.g("binding");
            throw null;
        }
        c0336a5.f3771f.setText(getString(R.string.transfer_format, bVar.f3645b, bVar.f3646c));
        C0336a c0336a6 = this.f1745z;
        if (c0336a6 == null) {
            g1.f.g("binding");
            throw null;
        }
        List a02 = f.a0(c0336a6.f3768b, c0336a6.f3769c, c0336a6.d, c0336a6.f3770e);
        Iterator it = a02.iterator();
        while (it.hasNext()) {
            ((AppCompatButton) it.next()).setBackground(a.b(this, R.drawable.bg_button_gradient));
        }
        int i2 = 0;
        for (Object obj : bVar.f3647e) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                f.b0();
                throw null;
            }
            ((AppCompatButton) a02.get(i2)).setText((String) obj);
            ((AppCompatButton) a02.get(i2)).setEnabled(true);
            i2 = i3;
        }
        CountDownTimer countDownTimer2 = this.f1740C;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
        this.f1740C = new j(this).start();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0336a inflate = C0336a.inflate(getLayoutInflater());
        this.f1745z = inflate;
        if (inflate == null) {
            g1.f.g("binding");
            throw null;
        }
        setContentView(inflate.f3767a);
        C0336a c0336a = this.f1745z;
        if (c0336a == null) {
            g1.f.g("binding");
            throw null;
        }
        final int i = 0;
        for (Object obj : f.a0(c0336a.f3768b, c0336a.f3769c, c0336a.d, c0336a.f3770e)) {
            int i2 = i + 1;
            if (i < 0) {
                f.b0();
                throw null;
            }
            final AppCompatButton appCompatButton = (AppCompatButton) obj;
            appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: s0.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = GameActivity.f1737I;
                    AppCompatButton appCompatButton2 = appCompatButton;
                    g1.f.b(appCompatButton2);
                    GameActivity gameActivity = GameActivity.this;
                    CountDownTimer countDownTimer = gameActivity.f1740C;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    b bVar = (b) gameActivity.f1744H.get(gameActivity.f1741D);
                    String str = bVar.d;
                    List list = bVar.f3647e;
                    String str2 = (String) list.get(i);
                    C0336a c0336a2 = gameActivity.f1745z;
                    if (c0336a2 == null) {
                        g1.f.g("binding");
                        throw null;
                    }
                    List a02 = V0.f.a0(c0336a2.f3768b, c0336a2.f3769c, c0336a2.d, c0336a2.f3770e);
                    Iterator it = a02.iterator();
                    while (it.hasNext()) {
                        ((AppCompatButton) it.next()).setEnabled(false);
                    }
                    if (g1.f.a(str2, str)) {
                        appCompatButton2.setBackgroundColor(A.b.a(gameActivity, R.color.correct_green));
                        gameActivity.f1742E = ((int) ((gameActivity.f1743G / 15000.0d) * 50)) + 100 + gameActivity.f1742E;
                    } else {
                        appCompatButton2.setBackgroundColor(A.b.a(gameActivity, R.color.wrong_red));
                        ((AppCompatButton) a02.get(list.indexOf(str))).setBackgroundColor(A.b.a(gameActivity, R.color.correct_green));
                        gameActivity.F--;
                    }
                    AbstractC0302t.i(J.e(gameActivity), AbstractC0308z.f3346b, new e(gameActivity, null));
                    AbstractC0302t.i(J.e(gameActivity), s1.m.f3714a, new f(gameActivity, null));
                }
            });
            i = i2;
        }
        this.f1742E = 0;
        this.F = 3;
        this.f1741D = 0;
        this.f1743G = 15000L;
        n();
        AbstractC0302t.i(J.e(this), AbstractC0308z.f3346b, new i(this, null));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f1740C;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}
