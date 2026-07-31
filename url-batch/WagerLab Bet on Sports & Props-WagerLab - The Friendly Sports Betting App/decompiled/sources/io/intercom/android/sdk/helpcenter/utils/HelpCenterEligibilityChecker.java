package io.intercom.android.sdk.helpcenter.utils;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import kotlin.Metadata;

/* compiled from: HelpCenterEligibilityChecker.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/helpcenter/utils/HelpCenterEligibilityChecker;", "", "<init>", "()V", "isEligibleUser", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HelpCenterEligibilityChecker {
    public static final int $stable = 0;
    public static final HelpCenterEligibilityChecker INSTANCE = new HelpCenterEligibilityChecker();

    private HelpCenterEligibilityChecker() {
    }

    public final boolean isEligibleUser() {
        Twig logger = LumberMill.getLogger();
        UserIdentity userIdentity = Injector.get().getUserIdentity();
        if (userIdentity.identityExists() && !userIdentity.isSoftReset()) {
            return true;
        }
        logger.e("The app config has not been retrieved, please call registerUnidentifiedUser() or registerIdentifiedUser(Registration) before calling displayHelpCenter().", new Object[0]);
        return false;
    }
}
