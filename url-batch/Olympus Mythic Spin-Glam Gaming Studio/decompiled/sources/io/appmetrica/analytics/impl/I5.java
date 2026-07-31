package io.appmetrica.analytics.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class I5 {
    public static final List a = CollectionUtils.createSortedListWithoutRepetitions("id", SDKAnalyticsEvents.PARAMETER_SESSION_ID, "session_type", "number_in_session", "type", "global_number", "time", "event_description");
}
