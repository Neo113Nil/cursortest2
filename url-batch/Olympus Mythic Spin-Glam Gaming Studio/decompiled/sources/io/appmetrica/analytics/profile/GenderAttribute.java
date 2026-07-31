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

/* loaded from: classes.dex */
public class GenderAttribute {
    private final L6 a = new L6("appmetrica_gender", new C5691t8(), new Pl());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");

        private final String a;

        Gender(String str) {
            this.a = str;
        }

        public String getStringValue() {
            return this.a;
        }
    }

    GenderAttribute() {
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5785wo> withValue(@NonNull Gender gender) {
        String str = this.a.c;
        String stringValue = gender.getStringValue();
        C5665s8 c5665s8 = new C5665s8();
        L6 l6 = this.a;
        return new UserProfileUpdate<>(new C5602pn(str, stringValue, c5665s8, l6.a, new J4(l6.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5785wo> withValueIfUndefined(@NonNull Gender gender) {
        String str = this.a.c;
        String stringValue = gender.getStringValue();
        C5665s8 c5665s8 = new C5665s8();
        L6 l6 = this.a;
        return new UserProfileUpdate<>(new C5602pn(str, stringValue, c5665s8, l6.a, new C5652rl(l6.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5785wo> withValueReset() {
        L6 l6 = this.a;
        return new UserProfileUpdate<>(new Oi(0, l6.c, l6.a, l6.b));
    }
}
