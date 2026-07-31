package io.bidmachine;

import io.bidmachine.internal.C6024t;
import io.bidmachine.internal.O;
import io.bidmachine.internal.w;
import io.bidmachine.models.DataRestrictions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000fR\u0014\u0010\u001b\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000fR\u0014\u0010\u001f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000fR\u0014\u0010!\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u000f¨\u0006\""}, d2 = {"Lio/bidmachine/DataRestrictionsImpl;", "Lio/bidmachine/models/DataRestrictions;", "Lio/bidmachine/internal/w;", "privacyGroupRestrictions", "Lio/bidmachine/internal/A;", "publisherPrivacySettings", "Lio/bidmachine/internal/t;", "platformPrivacySettings", "<init>", "(Lio/bidmachine/internal/w;Lio/bidmachine/internal/A;Lio/bidmachine/internal/t;)V", "Lio/bidmachine/internal/w;", "Lio/bidmachine/internal/A;", "Lio/bidmachine/internal/t;", "", "isUserInGdprScope", "()Z", "isUserHasConsent", "isUserAgeRestricted", "", "getUsPrivacyString", "()Ljava/lang/String;", "usPrivacyString", "isUserInCcpaScope", "isUserHasCcpaConsent", "getHasAdIdsPermission", "hasAdIdsPermission", "getHasNetworkPermission", "hasNetworkPermission", "getHasPreciseLocationPermission", "hasPreciseLocationPermission", "getHasDeviceInfoPermission", "hasDeviceInfoPermission", "getHasDemographicsPermission", "hasDemographicsPermission", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes12.dex */
public final class DataRestrictionsImpl implements DataRestrictions {

    @NotNull
    private final C6024t platformPrivacySettings;

    @NotNull
    private final io.bidmachine.internal.w privacyGroupRestrictions;

    @NotNull
    private final io.bidmachine.internal.A publisherPrivacySettings;

    public DataRestrictionsImpl(@NotNull io.bidmachine.internal.w privacyGroupRestrictions, @NotNull io.bidmachine.internal.A publisherPrivacySettings, @NotNull C6024t platformPrivacySettings) {
        Intrinsics.checkNotNullParameter(privacyGroupRestrictions, "privacyGroupRestrictions");
        Intrinsics.checkNotNullParameter(publisherPrivacySettings, "publisherPrivacySettings");
        Intrinsics.checkNotNullParameter(platformPrivacySettings, "platformPrivacySettings");
        this.privacyGroupRestrictions = privacyGroupRestrictions;
        this.publisherPrivacySettings = publisherPrivacySettings;
        this.platformPrivacySettings = platformPrivacySettings;
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean getHasAdIdsPermission() {
        return this.privacyGroupRestrictions.e() == w.b.PASS;
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean getHasDemographicsPermission() {
        return this.privacyGroupRestrictions.a() == w.b.PASS;
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean getHasDeviceInfoPermission() {
        return this.privacyGroupRestrictions.b() == w.b.PASS;
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean getHasNetworkPermission() {
        return this.privacyGroupRestrictions.c() == w.b.PASS;
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean getHasPreciseLocationPermission() {
        return this.privacyGroupRestrictions.d() == w.b.PASS;
    }

    @Override // io.bidmachine.models.DataRestrictions
    @Nullable
    public String getUsPrivacyString() {
        String a = this.publisherPrivacySettings.a();
        return a == null ? this.platformPrivacySettings.a() : a;
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean isUserAgeRestricted() {
        Boolean c = this.publisherPrivacySettings.c();
        if (c != null) {
            return c.booleanValue();
        }
        return false;
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean isUserHasCcpaConsent() {
        String usPrivacyString = getUsPrivacyString();
        return usPrivacyString != null && usPrivacyString.length() == 4 && usPrivacyString.charAt(0) == '1' && CharsKt.equals(usPrivacyString.charAt(2), 'N', true);
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean isUserHasConsent() {
        Boolean b = this.publisherPrivacySettings.b();
        if (b == null) {
            O d = this.platformPrivacySettings.d();
            b = d != null ? Boolean.valueOf(d.b()) : null;
            if (b == null) {
                return false;
            }
        }
        return b.booleanValue();
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean isUserInCcpaScope() {
        String usPrivacyString = getUsPrivacyString();
        return usPrivacyString != null && usPrivacyString.length() == 4 && usPrivacyString.charAt(0) == '1' && !StringsKt.contains$default((CharSequence) usPrivacyString, (CharSequence) "---", false, 2, (Object) null);
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean isUserInGdprScope() {
        Boolean h = this.publisherPrivacySettings.h();
        if (h == null && (h = this.platformPrivacySettings.h()) == null) {
            return false;
        }
        return h.booleanValue();
    }
}
