package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C5602pn;
import io.appmetrica.analytics.impl.C5652rl;
import io.appmetrica.analytics.impl.C5665s8;
import io.appmetrica.analytics.impl.C5691t8;
import io.appmetrica.analytics.impl.InterfaceC5785wo;
import io.appmetrica.analytics.impl.J4;
import io.appmetrica.analytics.impl.L6;
import io.appmetrica.analytics.impl.Oi;
import io.appmetrica.analytics.impl.Pl;
import io.appmetrica.analytics.impl.W2;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes5.dex */
public class BirthDateAttribute {
    private final L6 a = new L6("appmetrica_birth_date", new C5691t8(), new Pl());

    BirthDateAttribute() {
    }

    final UserProfileUpdate a(Calendar calendar, String str, W2 w2) {
        return new UserProfileUpdate(new C5602pn(this.a.c, new SimpleDateFormat(str).format(calendar.getTime()), new C5665s8(), new C5691t8(), w2));
    }

    public UserProfileUpdate<? extends InterfaceC5785wo> withAge(int i) {
        int i2 = Calendar.getInstance(Locale.US).get(1) - i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        return a(gregorianCalendar, "yyyy", new J4(this.a.b));
    }

    public UserProfileUpdate<? extends InterfaceC5785wo> withAgeIfUndefined(int i) {
        int i2 = Calendar.getInstance(Locale.US).get(1) - i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        return a(gregorianCalendar, "yyyy", new C5652rl(this.a.b));
    }

    public UserProfileUpdate<? extends InterfaceC5785wo> withBirthDate(@NonNull Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new J4(this.a.b));
    }

    public UserProfileUpdate<? extends InterfaceC5785wo> withBirthDateIfUndefined(@NonNull Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new C5652rl(this.a.b));
    }

    public UserProfileUpdate<? extends InterfaceC5785wo> withValueReset() {
        return new UserProfileUpdate<>(new Oi(0, this.a.c, new C5691t8(), new Pl()));
    }

    public UserProfileUpdate<? extends InterfaceC5785wo> withBirthDate(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        return a(gregorianCalendar, "yyyy", new J4(this.a.b));
    }

    public UserProfileUpdate<? extends InterfaceC5785wo> withBirthDateIfUndefined(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        return a(gregorianCalendar, "yyyy", new C5652rl(this.a.b));
    }

    public UserProfileUpdate<? extends InterfaceC5785wo> withBirthDate(int i, int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new J4(this.a.b));
    }

    public UserProfileUpdate<? extends InterfaceC5785wo> withBirthDateIfUndefined(int i, int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new C5652rl(this.a.b));
    }

    public UserProfileUpdate<? extends InterfaceC5785wo> withBirthDate(int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, i3);
        return a(gregorianCalendar, "yyyy-MM-dd", new J4(this.a.b));
    }

    public UserProfileUpdate<? extends InterfaceC5785wo> withBirthDateIfUndefined(int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, i3);
        return a(gregorianCalendar, "yyyy-MM-dd", new C5652rl(this.a.b));
    }
}
