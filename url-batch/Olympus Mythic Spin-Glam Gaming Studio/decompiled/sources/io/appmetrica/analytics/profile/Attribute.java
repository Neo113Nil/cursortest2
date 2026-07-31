package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C5255cc;
import io.appmetrica.analytics.impl.C5576on;
import io.appmetrica.analytics.impl.C5678sl;
import io.appmetrica.analytics.impl.D4;
import io.appmetrica.analytics.impl.Dn;
import io.appmetrica.analytics.impl.Mb;
import io.appmetrica.analytics.impl.O8;
import io.appmetrica.analytics.impl.We;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes5.dex */
public final class Attribute {
    @NonNull
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    @NonNull
    public static BooleanAttribute customBoolean(@NonNull String str) {
        return new BooleanAttribute(str, new Mb(), new C5255cc(new D4(100)));
    }

    @NonNull
    public static CounterAttribute customCounter(@NonNull String str) {
        return new CounterAttribute(str, new Mb(), new C5255cc(new D4(100)));
    }

    @NonNull
    public static NumberAttribute customNumber(@NonNull String str) {
        return new NumberAttribute(str, new Mb(), new C5255cc(new D4(100)));
    }

    @NonNull
    public static StringAttribute customString(@NonNull String str) {
        return new StringAttribute(str, new C5576on(200, "String attribute \"" + str + "\"", PublicLogger.getAnonymousInstance()), new Mb(), new C5255cc(new D4(100)));
    }

    @NonNull
    public static FirstPartyDataEmailSha256Attribute emailHash() {
        return new FirstPartyDataEmailSha256Attribute(new C5678sl(new O8()));
    }

    @NonNull
    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    @NonNull
    public static NameAttribute name() {
        return new NameAttribute();
    }

    @NonNull
    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }

    @NonNull
    public static FirstPartyDataPhoneSha256Attribute phoneHash() {
        return new FirstPartyDataPhoneSha256Attribute(new C5678sl(new We()));
    }

    @NonNull
    public static FirstPartyDataTelegramLoginSha256Attribute telegramLoginHash() {
        return new FirstPartyDataTelegramLoginSha256Attribute(new C5678sl(new Dn()));
    }
}
