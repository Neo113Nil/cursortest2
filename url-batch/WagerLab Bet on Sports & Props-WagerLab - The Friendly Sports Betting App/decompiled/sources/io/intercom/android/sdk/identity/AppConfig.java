package io.intercom.android.sdk.identity;

import androidx.media3.common.C;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.hermes.intl.Constants;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.models.HomeConfig;
import io.intercom.android.sdk.models.OpenConfig;
import io.intercom.android.sdk.models.Space;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppConfig.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b)\b\u0081\b\u0018\u00002\u00020\u0001B«\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\t\u0012\u0006\u0010!\u001a\u00020\t\u0012\u0006\u0010\"\u001a\u00020\t\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020\t\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020\t¢\u0006\u0004\b-\u0010.J\u000e\u0010Q\u001a\u00020\t2\u0006\u0010R\u001a\u00020\u0003J\u0006\u0010S\u001a\u00020\tJ\u000e\u0010T\u001a\u00020\t2\u0006\u0010U\u001a\u00020VJ\u0010\u0010W\u001a\u0004\u0018\u00010\u00032\u0006\u0010U\u001a\u00020VJ\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\tHÆ\u0003J\t\u0010]\u001a\u00020\tHÆ\u0003J\t\u0010^\u001a\u00020\tHÆ\u0003J\t\u0010_\u001a\u00020\u0005HÆ\u0003J\t\u0010`\u001a\u00020\u000eHÆ\u0003J\t\u0010a\u001a\u00020\u000eHÆ\u0003J\t\u0010b\u001a\u00020\u000eHÆ\u0003J\t\u0010c\u001a\u00020\u000eHÆ\u0003J\t\u0010d\u001a\u00020\tHÆ\u0003J\t\u0010e\u001a\u00020\tHÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\tHÆ\u0003J\t\u0010i\u001a\u00020\tHÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\u000f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aHÆ\u0003J\u000f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aHÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\tHÆ\u0003J\t\u0010p\u001a\u00020\tHÆ\u0003J\t\u0010q\u001a\u00020\tHÆ\u0003J\t\u0010r\u001a\u00020\tHÆ\u0003J\t\u0010s\u001a\u00020\tHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010$HÆ\u0003J\t\u0010u\u001a\u00020&HÆ\u0003J\t\u0010v\u001a\u00020(HÆ\u0003J\t\u0010w\u001a\u00020\tHÆ\u0003J\t\u0010x\u001a\u00020+HÆ\u0003J\t\u0010y\u001a\u00020\tHÆ\u0003Jë\u0002\u0010z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\t2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\tHÇ\u0001J\u0013\u0010{\u001a\u00020\t2\b\u0010|\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010}\u001a\u00020\u0005H×\u0001J\t\u0010~\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u00107R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u00107R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u00107R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u00104R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010:R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b=\u0010:R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u00107R\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u00107R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u00100R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u00100R\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u00107R\u0011\u0010\u0017\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u00107R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u00100R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\b\n\u0000\u001a\u0004\bC\u0010BR\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u00100R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u00100R\u0011\u0010\u001e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u00107R\u0011\u0010\u001f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u00107R\u0011\u0010 \u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u00107R\u0011\u0010!\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u00107R\u0011\u0010\"\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bF\u00107R\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010)\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bM\u00107R\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010,\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bP\u00107¨\u0006\u007f"}, d2 = {"Lio/intercom/android/sdk/identity/AppConfig;", "", "name", "", "primaryColor", "", "secondaryColor", "secondaryColorDark", "isPrimaryColorRenderDarkText", "", "isSecondaryColorRenderDarkText", "isInboundMessages", "rateLimitCount", "rateLimitPeriodMs", "", "userUpdateCacheMaxAgeMs", "newSessionThresholdMs", "softResetTimeoutMs", "isMetricsEnabled", "isAudioEnabled", Constants.LOCALE, "helpCenterLocale", "isReceivedFromServer", "isBackgroundRequestsEnabled", "helpCenterUrl", "helpCenterUrls", "", "features", "launcherLogoUrl", "teamGreeting", "isIdentityVerificationEnabled", "isAccessToTeammateEnabled", "isHelpCenterRequireSearchEnabled", "isPreventMultipleInboundConversationsEnabled", "hasOpenConversations", "configModules", "Lio/intercom/android/sdk/models/ConfigModules;", "realTimeConfig", "Lio/intercom/android/nexus/NexusConfig;", "attachmentSettings", "Lio/intercom/android/sdk/models/AttachmentSettings;", "articleAutoReactionEnabled", "conversationStateSyncSettings", "Lio/intercom/android/sdk/models/ConversationStateSyncSettings;", "askUsersToAllowNotifications", "<init>", "(Ljava/lang/String;IIIZZZIJJJJZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ZZZZZLio/intercom/android/sdk/models/ConfigModules;Lio/intercom/android/nexus/NexusConfig;Lio/intercom/android/sdk/models/AttachmentSettings;ZLio/intercom/android/sdk/models/ConversationStateSyncSettings;Z)V", "getName", "()Ljava/lang/String;", "getPrimaryColor$annotations", "()V", "getPrimaryColor", "()I", "getSecondaryColor", "getSecondaryColorDark", "()Z", "getRateLimitCount", "getRateLimitPeriodMs", "()J", "getUserUpdateCacheMaxAgeMs", "getNewSessionThresholdMs", "getSoftResetTimeoutMs", "getLocale", "getHelpCenterLocale", "getHelpCenterUrl", "getHelpCenterUrls", "()Ljava/util/Set;", "getFeatures", "getLauncherLogoUrl", "getTeamGreeting", "getHasOpenConversations", "getConfigModules", "()Lio/intercom/android/sdk/models/ConfigModules;", "getRealTimeConfig", "()Lio/intercom/android/nexus/NexusConfig;", "getAttachmentSettings", "()Lio/intercom/android/sdk/models/AttachmentSettings;", "getArticleAutoReactionEnabled", "getConversationStateSyncSettings", "()Lio/intercom/android/sdk/models/ConversationStateSyncSettings;", "getAskUsersToAllowNotifications", "hasFeature", "feature", "isBackgroundRequestsDisabled", "isSpaceEnabled", "space", "Lio/intercom/android/sdk/models/Space$Type;", "getSpaceLabelIfExists", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AppConfig {
    public static final int $stable = 8;
    private final boolean articleAutoReactionEnabled;
    private final boolean askUsersToAllowNotifications;
    private final AttachmentSettings attachmentSettings;
    private final ConfigModules configModules;
    private final ConversationStateSyncSettings conversationStateSyncSettings;
    private final Set<String> features;
    private final boolean hasOpenConversations;
    private final String helpCenterLocale;
    private final String helpCenterUrl;
    private final Set<String> helpCenterUrls;
    private final boolean isAccessToTeammateEnabled;
    private final boolean isAudioEnabled;
    private final boolean isBackgroundRequestsEnabled;
    private final boolean isHelpCenterRequireSearchEnabled;
    private final boolean isIdentityVerificationEnabled;
    private final boolean isInboundMessages;
    private final boolean isMetricsEnabled;
    private final boolean isPreventMultipleInboundConversationsEnabled;
    private final boolean isPrimaryColorRenderDarkText;
    private final boolean isReceivedFromServer;
    private final boolean isSecondaryColorRenderDarkText;
    private final String launcherLogoUrl;
    private final String locale;
    private final String name;
    private final long newSessionThresholdMs;
    private final int primaryColor;
    private final int rateLimitCount;
    private final long rateLimitPeriodMs;
    private final NexusConfig realTimeConfig;
    private final int secondaryColor;
    private final int secondaryColorDark;
    private final long softResetTimeoutMs;
    private final String teamGreeting;
    private final long userUpdateCacheMaxAgeMs;

    public static /* synthetic */ AppConfig copy$default(AppConfig appConfig, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, long j, long j2, long j3, long j4, boolean z4, boolean z5, String str2, String str3, boolean z6, boolean z7, String str4, Set set, Set set2, String str5, String str6, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, ConfigModules configModules, NexusConfig nexusConfig, AttachmentSettings attachmentSettings, boolean z13, ConversationStateSyncSettings conversationStateSyncSettings, boolean z14, int i5, int i6, Object obj) {
        boolean z15;
        ConversationStateSyncSettings conversationStateSyncSettings2;
        boolean z16;
        String str7;
        Set set3;
        Set set4;
        String str8;
        String str9;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        ConfigModules configModules2;
        NexusConfig nexusConfig2;
        AttachmentSettings attachmentSettings2;
        boolean z22;
        String str10;
        boolean z23;
        boolean z24;
        int i7;
        long j5;
        long j6;
        long j7;
        long j8;
        boolean z25;
        String str11;
        boolean z26;
        int i8;
        int i9;
        boolean z27;
        boolean z28;
        String str12 = (i5 & 1) != 0 ? appConfig.name : str;
        int i10 = (i5 & 2) != 0 ? appConfig.primaryColor : i;
        int i11 = (i5 & 4) != 0 ? appConfig.secondaryColor : i2;
        int i12 = (i5 & 8) != 0 ? appConfig.secondaryColorDark : i3;
        boolean z29 = (i5 & 16) != 0 ? appConfig.isPrimaryColorRenderDarkText : z;
        boolean z30 = (i5 & 32) != 0 ? appConfig.isSecondaryColorRenderDarkText : z2;
        boolean z31 = (i5 & 64) != 0 ? appConfig.isInboundMessages : z3;
        int i13 = (i5 & 128) != 0 ? appConfig.rateLimitCount : i4;
        long j9 = (i5 & 256) != 0 ? appConfig.rateLimitPeriodMs : j;
        long j10 = (i5 & 512) != 0 ? appConfig.userUpdateCacheMaxAgeMs : j2;
        long j11 = (i5 & 1024) != 0 ? appConfig.newSessionThresholdMs : j3;
        String str13 = str12;
        int i14 = i10;
        long j12 = (i5 & 2048) != 0 ? appConfig.softResetTimeoutMs : j4;
        boolean z32 = (i5 & 4096) != 0 ? appConfig.isMetricsEnabled : z4;
        boolean z33 = (i5 & 8192) != 0 ? appConfig.isAudioEnabled : z5;
        boolean z34 = z32;
        String str14 = (i5 & 16384) != 0 ? appConfig.locale : str2;
        String str15 = (i5 & 32768) != 0 ? appConfig.helpCenterLocale : str3;
        boolean z35 = (i5 & 65536) != 0 ? appConfig.isReceivedFromServer : z6;
        boolean z36 = (i5 & 131072) != 0 ? appConfig.isBackgroundRequestsEnabled : z7;
        String str16 = (i5 & 262144) != 0 ? appConfig.helpCenterUrl : str4;
        Set set5 = (i5 & 524288) != 0 ? appConfig.helpCenterUrls : set;
        Set set6 = (i5 & 1048576) != 0 ? appConfig.features : set2;
        String str17 = (i5 & 2097152) != 0 ? appConfig.launcherLogoUrl : str5;
        String str18 = (i5 & 4194304) != 0 ? appConfig.teamGreeting : str6;
        boolean z37 = (i5 & 8388608) != 0 ? appConfig.isIdentityVerificationEnabled : z8;
        boolean z38 = (i5 & 16777216) != 0 ? appConfig.isAccessToTeammateEnabled : z9;
        boolean z39 = (i5 & 33554432) != 0 ? appConfig.isHelpCenterRequireSearchEnabled : z10;
        boolean z40 = (i5 & 67108864) != 0 ? appConfig.isPreventMultipleInboundConversationsEnabled : z11;
        boolean z41 = (i5 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? appConfig.hasOpenConversations : z12;
        ConfigModules configModules3 = (i5 & 268435456) != 0 ? appConfig.configModules : configModules;
        NexusConfig nexusConfig3 = (i5 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? appConfig.realTimeConfig : nexusConfig;
        AttachmentSettings attachmentSettings3 = (i5 & 1073741824) != 0 ? appConfig.attachmentSettings : attachmentSettings;
        boolean z42 = (i5 & Integer.MIN_VALUE) != 0 ? appConfig.articleAutoReactionEnabled : z13;
        ConversationStateSyncSettings conversationStateSyncSettings3 = (i6 & 1) != 0 ? appConfig.conversationStateSyncSettings : conversationStateSyncSettings;
        if ((i6 & 2) != 0) {
            conversationStateSyncSettings2 = conversationStateSyncSettings3;
            z15 = appConfig.askUsersToAllowNotifications;
            str7 = str16;
            set3 = set5;
            set4 = set6;
            str8 = str17;
            str9 = str18;
            z17 = z37;
            z18 = z38;
            z19 = z39;
            z20 = z40;
            z21 = z41;
            configModules2 = configModules3;
            nexusConfig2 = nexusConfig3;
            attachmentSettings2 = attachmentSettings3;
            z22 = z42;
            str10 = str14;
            z23 = z33;
            i7 = i13;
            j5 = j9;
            j6 = j10;
            j7 = j11;
            j8 = j12;
            z25 = z34;
            str11 = str15;
            z26 = z35;
            z16 = z36;
            i8 = i11;
            i9 = i12;
            z27 = z29;
            z28 = z30;
            z24 = z31;
        } else {
            z15 = z14;
            conversationStateSyncSettings2 = conversationStateSyncSettings3;
            z16 = z36;
            str7 = str16;
            set3 = set5;
            set4 = set6;
            str8 = str17;
            str9 = str18;
            z17 = z37;
            z18 = z38;
            z19 = z39;
            z20 = z40;
            z21 = z41;
            configModules2 = configModules3;
            nexusConfig2 = nexusConfig3;
            attachmentSettings2 = attachmentSettings3;
            z22 = z42;
            str10 = str14;
            z23 = z33;
            z24 = z31;
            i7 = i13;
            j5 = j9;
            j6 = j10;
            j7 = j11;
            j8 = j12;
            z25 = z34;
            str11 = str15;
            z26 = z35;
            i8 = i11;
            i9 = i12;
            z27 = z29;
            z28 = z30;
        }
        return appConfig.copy(str13, i14, i8, i9, z27, z28, z24, i7, j5, j6, j7, j8, z25, z23, str10, str11, z26, z16, str7, set3, set4, str8, str9, z17, z18, z19, z20, z21, configModules2, nexusConfig2, attachmentSettings2, z22, conversationStateSyncSettings2, z15);
    }

    @Deprecated(message = "Use IntercomTheme.colors.action instead")
    public static /* synthetic */ void getPrimaryColor$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final long getUserUpdateCacheMaxAgeMs() {
        return this.userUpdateCacheMaxAgeMs;
    }

    /* renamed from: component11, reason: from getter */
    public final long getNewSessionThresholdMs() {
        return this.newSessionThresholdMs;
    }

    /* renamed from: component12, reason: from getter */
    public final long getSoftResetTimeoutMs() {
        return this.softResetTimeoutMs;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsMetricsEnabled() {
        return this.isMetricsEnabled;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsAudioEnabled() {
        return this.isAudioEnabled;
    }

    /* renamed from: component15, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* renamed from: component16, reason: from getter */
    public final String getHelpCenterLocale() {
        return this.helpCenterLocale;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsReceivedFromServer() {
        return this.isReceivedFromServer;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsBackgroundRequestsEnabled() {
        return this.isBackgroundRequestsEnabled;
    }

    /* renamed from: component19, reason: from getter */
    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    public final Set<String> component20() {
        return this.helpCenterUrls;
    }

    public final Set<String> component21() {
        return this.features;
    }

    /* renamed from: component22, reason: from getter */
    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    /* renamed from: component23, reason: from getter */
    public final String getTeamGreeting() {
        return this.teamGreeting;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getIsIdentityVerificationEnabled() {
        return this.isIdentityVerificationEnabled;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getIsAccessToTeammateEnabled() {
        return this.isAccessToTeammateEnabled;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getIsHelpCenterRequireSearchEnabled() {
        return this.isHelpCenterRequireSearchEnabled;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getIsPreventMultipleInboundConversationsEnabled() {
        return this.isPreventMultipleInboundConversationsEnabled;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getHasOpenConversations() {
        return this.hasOpenConversations;
    }

    /* renamed from: component29, reason: from getter */
    public final ConfigModules getConfigModules() {
        return this.configModules;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSecondaryColor() {
        return this.secondaryColor;
    }

    /* renamed from: component30, reason: from getter */
    public final NexusConfig getRealTimeConfig() {
        return this.realTimeConfig;
    }

    /* renamed from: component31, reason: from getter */
    public final AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    /* renamed from: component32, reason: from getter */
    public final boolean getArticleAutoReactionEnabled() {
        return this.articleAutoReactionEnabled;
    }

    /* renamed from: component33, reason: from getter */
    public final ConversationStateSyncSettings getConversationStateSyncSettings() {
        return this.conversationStateSyncSettings;
    }

    /* renamed from: component34, reason: from getter */
    public final boolean getAskUsersToAllowNotifications() {
        return this.askUsersToAllowNotifications;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSecondaryColorDark() {
        return this.secondaryColorDark;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPrimaryColorRenderDarkText() {
        return this.isPrimaryColorRenderDarkText;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSecondaryColorRenderDarkText() {
        return this.isSecondaryColorRenderDarkText;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsInboundMessages() {
        return this.isInboundMessages;
    }

    /* renamed from: component8, reason: from getter */
    public final int getRateLimitCount() {
        return this.rateLimitCount;
    }

    /* renamed from: component9, reason: from getter */
    public final long getRateLimitPeriodMs() {
        return this.rateLimitPeriodMs;
    }

    public final AppConfig copy(String name, int primaryColor, int secondaryColor, int secondaryColorDark, boolean isPrimaryColorRenderDarkText, boolean isSecondaryColorRenderDarkText, boolean isInboundMessages, int rateLimitCount, long rateLimitPeriodMs, long userUpdateCacheMaxAgeMs, long newSessionThresholdMs, long softResetTimeoutMs, boolean isMetricsEnabled, boolean isAudioEnabled, String locale, String helpCenterLocale, boolean isReceivedFromServer, boolean isBackgroundRequestsEnabled, String helpCenterUrl, Set<String> helpCenterUrls, Set<String> features, String launcherLogoUrl, String teamGreeting, boolean isIdentityVerificationEnabled, boolean isAccessToTeammateEnabled, boolean isHelpCenterRequireSearchEnabled, boolean isPreventMultipleInboundConversationsEnabled, boolean hasOpenConversations, ConfigModules configModules, NexusConfig realTimeConfig, AttachmentSettings attachmentSettings, boolean articleAutoReactionEnabled, ConversationStateSyncSettings conversationStateSyncSettings, boolean askUsersToAllowNotifications) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(helpCenterLocale, "helpCenterLocale");
        Intrinsics.checkNotNullParameter(helpCenterUrl, "helpCenterUrl");
        Intrinsics.checkNotNullParameter(helpCenterUrls, "helpCenterUrls");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(launcherLogoUrl, "launcherLogoUrl");
        Intrinsics.checkNotNullParameter(teamGreeting, "teamGreeting");
        Intrinsics.checkNotNullParameter(realTimeConfig, "realTimeConfig");
        Intrinsics.checkNotNullParameter(attachmentSettings, "attachmentSettings");
        Intrinsics.checkNotNullParameter(conversationStateSyncSettings, "conversationStateSyncSettings");
        return new AppConfig(name, primaryColor, secondaryColor, secondaryColorDark, isPrimaryColorRenderDarkText, isSecondaryColorRenderDarkText, isInboundMessages, rateLimitCount, rateLimitPeriodMs, userUpdateCacheMaxAgeMs, newSessionThresholdMs, softResetTimeoutMs, isMetricsEnabled, isAudioEnabled, locale, helpCenterLocale, isReceivedFromServer, isBackgroundRequestsEnabled, helpCenterUrl, helpCenterUrls, features, launcherLogoUrl, teamGreeting, isIdentityVerificationEnabled, isAccessToTeammateEnabled, isHelpCenterRequireSearchEnabled, isPreventMultipleInboundConversationsEnabled, hasOpenConversations, configModules, realTimeConfig, attachmentSettings, articleAutoReactionEnabled, conversationStateSyncSettings, askUsersToAllowNotifications);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppConfig)) {
            return false;
        }
        AppConfig appConfig = (AppConfig) other;
        return Intrinsics.areEqual(this.name, appConfig.name) && this.primaryColor == appConfig.primaryColor && this.secondaryColor == appConfig.secondaryColor && this.secondaryColorDark == appConfig.secondaryColorDark && this.isPrimaryColorRenderDarkText == appConfig.isPrimaryColorRenderDarkText && this.isSecondaryColorRenderDarkText == appConfig.isSecondaryColorRenderDarkText && this.isInboundMessages == appConfig.isInboundMessages && this.rateLimitCount == appConfig.rateLimitCount && this.rateLimitPeriodMs == appConfig.rateLimitPeriodMs && this.userUpdateCacheMaxAgeMs == appConfig.userUpdateCacheMaxAgeMs && this.newSessionThresholdMs == appConfig.newSessionThresholdMs && this.softResetTimeoutMs == appConfig.softResetTimeoutMs && this.isMetricsEnabled == appConfig.isMetricsEnabled && this.isAudioEnabled == appConfig.isAudioEnabled && Intrinsics.areEqual(this.locale, appConfig.locale) && Intrinsics.areEqual(this.helpCenterLocale, appConfig.helpCenterLocale) && this.isReceivedFromServer == appConfig.isReceivedFromServer && this.isBackgroundRequestsEnabled == appConfig.isBackgroundRequestsEnabled && Intrinsics.areEqual(this.helpCenterUrl, appConfig.helpCenterUrl) && Intrinsics.areEqual(this.helpCenterUrls, appConfig.helpCenterUrls) && Intrinsics.areEqual(this.features, appConfig.features) && Intrinsics.areEqual(this.launcherLogoUrl, appConfig.launcherLogoUrl) && Intrinsics.areEqual(this.teamGreeting, appConfig.teamGreeting) && this.isIdentityVerificationEnabled == appConfig.isIdentityVerificationEnabled && this.isAccessToTeammateEnabled == appConfig.isAccessToTeammateEnabled && this.isHelpCenterRequireSearchEnabled == appConfig.isHelpCenterRequireSearchEnabled && this.isPreventMultipleInboundConversationsEnabled == appConfig.isPreventMultipleInboundConversationsEnabled && this.hasOpenConversations == appConfig.hasOpenConversations && Intrinsics.areEqual(this.configModules, appConfig.configModules) && Intrinsics.areEqual(this.realTimeConfig, appConfig.realTimeConfig) && Intrinsics.areEqual(this.attachmentSettings, appConfig.attachmentSettings) && this.articleAutoReactionEnabled == appConfig.articleAutoReactionEnabled && Intrinsics.areEqual(this.conversationStateSyncSettings, appConfig.conversationStateSyncSettings) && this.askUsersToAllowNotifications == appConfig.askUsersToAllowNotifications;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((this.name.hashCode() * 31) + Integer.hashCode(this.primaryColor)) * 31) + Integer.hashCode(this.secondaryColor)) * 31) + Integer.hashCode(this.secondaryColorDark)) * 31) + Boolean.hashCode(this.isPrimaryColorRenderDarkText)) * 31) + Boolean.hashCode(this.isSecondaryColorRenderDarkText)) * 31) + Boolean.hashCode(this.isInboundMessages)) * 31) + Integer.hashCode(this.rateLimitCount)) * 31) + Long.hashCode(this.rateLimitPeriodMs)) * 31) + Long.hashCode(this.userUpdateCacheMaxAgeMs)) * 31) + Long.hashCode(this.newSessionThresholdMs)) * 31) + Long.hashCode(this.softResetTimeoutMs)) * 31) + Boolean.hashCode(this.isMetricsEnabled)) * 31) + Boolean.hashCode(this.isAudioEnabled)) * 31) + this.locale.hashCode()) * 31) + this.helpCenterLocale.hashCode()) * 31) + Boolean.hashCode(this.isReceivedFromServer)) * 31) + Boolean.hashCode(this.isBackgroundRequestsEnabled)) * 31) + this.helpCenterUrl.hashCode()) * 31) + this.helpCenterUrls.hashCode()) * 31) + this.features.hashCode()) * 31) + this.launcherLogoUrl.hashCode()) * 31) + this.teamGreeting.hashCode()) * 31) + Boolean.hashCode(this.isIdentityVerificationEnabled)) * 31) + Boolean.hashCode(this.isAccessToTeammateEnabled)) * 31) + Boolean.hashCode(this.isHelpCenterRequireSearchEnabled)) * 31) + Boolean.hashCode(this.isPreventMultipleInboundConversationsEnabled)) * 31) + Boolean.hashCode(this.hasOpenConversations)) * 31;
        ConfigModules configModules = this.configModules;
        return ((((((((((hashCode + (configModules == null ? 0 : configModules.hashCode())) * 31) + this.realTimeConfig.hashCode()) * 31) + this.attachmentSettings.hashCode()) * 31) + Boolean.hashCode(this.articleAutoReactionEnabled)) * 31) + this.conversationStateSyncSettings.hashCode()) * 31) + Boolean.hashCode(this.askUsersToAllowNotifications);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppConfig(name=");
        sb.append(this.name).append(", primaryColor=").append(this.primaryColor).append(", secondaryColor=").append(this.secondaryColor).append(", secondaryColorDark=").append(this.secondaryColorDark).append(", isPrimaryColorRenderDarkText=").append(this.isPrimaryColorRenderDarkText).append(", isSecondaryColorRenderDarkText=").append(this.isSecondaryColorRenderDarkText).append(", isInboundMessages=").append(this.isInboundMessages).append(", rateLimitCount=").append(this.rateLimitCount).append(", rateLimitPeriodMs=").append(this.rateLimitPeriodMs).append(", userUpdateCacheMaxAgeMs=").append(this.userUpdateCacheMaxAgeMs).append(", newSessionThresholdMs=").append(this.newSessionThresholdMs).append(", softResetTimeoutMs=");
        sb.append(this.softResetTimeoutMs).append(", isMetricsEnabled=").append(this.isMetricsEnabled).append(", isAudioEnabled=").append(this.isAudioEnabled).append(", locale=").append(this.locale).append(", helpCenterLocale=").append(this.helpCenterLocale).append(", isReceivedFromServer=").append(this.isReceivedFromServer).append(", isBackgroundRequestsEnabled=").append(this.isBackgroundRequestsEnabled).append(", helpCenterUrl=").append(this.helpCenterUrl).append(", helpCenterUrls=").append(this.helpCenterUrls).append(", features=").append(this.features).append(", launcherLogoUrl=").append(this.launcherLogoUrl).append(", teamGreeting=").append(this.teamGreeting);
        sb.append(", isIdentityVerificationEnabled=").append(this.isIdentityVerificationEnabled).append(", isAccessToTeammateEnabled=").append(this.isAccessToTeammateEnabled).append(", isHelpCenterRequireSearchEnabled=").append(this.isHelpCenterRequireSearchEnabled).append(", isPreventMultipleInboundConversationsEnabled=").append(this.isPreventMultipleInboundConversationsEnabled).append(", hasOpenConversations=").append(this.hasOpenConversations).append(", configModules=").append(this.configModules).append(", realTimeConfig=").append(this.realTimeConfig).append(", attachmentSettings=").append(this.attachmentSettings).append(", articleAutoReactionEnabled=").append(this.articleAutoReactionEnabled).append(", conversationStateSyncSettings=").append(this.conversationStateSyncSettings).append(", askUsersToAllowNotifications=").append(this.askUsersToAllowNotifications).append(')');
        return sb.toString();
    }

    public AppConfig(String name, int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, long j, long j2, long j3, long j4, boolean z4, boolean z5, String locale, String helpCenterLocale, boolean z6, boolean z7, String helpCenterUrl, Set<String> helpCenterUrls, Set<String> features, String launcherLogoUrl, String teamGreeting, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, ConfigModules configModules, NexusConfig realTimeConfig, AttachmentSettings attachmentSettings, boolean z13, ConversationStateSyncSettings conversationStateSyncSettings, boolean z14) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(helpCenterLocale, "helpCenterLocale");
        Intrinsics.checkNotNullParameter(helpCenterUrl, "helpCenterUrl");
        Intrinsics.checkNotNullParameter(helpCenterUrls, "helpCenterUrls");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(launcherLogoUrl, "launcherLogoUrl");
        Intrinsics.checkNotNullParameter(teamGreeting, "teamGreeting");
        Intrinsics.checkNotNullParameter(realTimeConfig, "realTimeConfig");
        Intrinsics.checkNotNullParameter(attachmentSettings, "attachmentSettings");
        Intrinsics.checkNotNullParameter(conversationStateSyncSettings, "conversationStateSyncSettings");
        this.name = name;
        this.primaryColor = i;
        this.secondaryColor = i2;
        this.secondaryColorDark = i3;
        this.isPrimaryColorRenderDarkText = z;
        this.isSecondaryColorRenderDarkText = z2;
        this.isInboundMessages = z3;
        this.rateLimitCount = i4;
        this.rateLimitPeriodMs = j;
        this.userUpdateCacheMaxAgeMs = j2;
        this.newSessionThresholdMs = j3;
        this.softResetTimeoutMs = j4;
        this.isMetricsEnabled = z4;
        this.isAudioEnabled = z5;
        this.locale = locale;
        this.helpCenterLocale = helpCenterLocale;
        this.isReceivedFromServer = z6;
        this.isBackgroundRequestsEnabled = z7;
        this.helpCenterUrl = helpCenterUrl;
        this.helpCenterUrls = helpCenterUrls;
        this.features = features;
        this.launcherLogoUrl = launcherLogoUrl;
        this.teamGreeting = teamGreeting;
        this.isIdentityVerificationEnabled = z8;
        this.isAccessToTeammateEnabled = z9;
        this.isHelpCenterRequireSearchEnabled = z10;
        this.isPreventMultipleInboundConversationsEnabled = z11;
        this.hasOpenConversations = z12;
        this.configModules = configModules;
        this.realTimeConfig = realTimeConfig;
        this.attachmentSettings = attachmentSettings;
        this.articleAutoReactionEnabled = z13;
        this.conversationStateSyncSettings = conversationStateSyncSettings;
        this.askUsersToAllowNotifications = z14;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    public final int getSecondaryColor() {
        return this.secondaryColor;
    }

    public final int getSecondaryColorDark() {
        return this.secondaryColorDark;
    }

    public final boolean isPrimaryColorRenderDarkText() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean isSecondaryColorRenderDarkText() {
        return this.isSecondaryColorRenderDarkText;
    }

    public final boolean isInboundMessages() {
        return this.isInboundMessages;
    }

    public final int getRateLimitCount() {
        return this.rateLimitCount;
    }

    public final long getRateLimitPeriodMs() {
        return this.rateLimitPeriodMs;
    }

    public final long getUserUpdateCacheMaxAgeMs() {
        return this.userUpdateCacheMaxAgeMs;
    }

    public final long getNewSessionThresholdMs() {
        return this.newSessionThresholdMs;
    }

    public final long getSoftResetTimeoutMs() {
        return this.softResetTimeoutMs;
    }

    public final boolean isMetricsEnabled() {
        return this.isMetricsEnabled;
    }

    public final boolean isAudioEnabled() {
        return this.isAudioEnabled;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getHelpCenterLocale() {
        return this.helpCenterLocale;
    }

    public final boolean isReceivedFromServer() {
        return this.isReceivedFromServer;
    }

    public final boolean isBackgroundRequestsEnabled() {
        return this.isBackgroundRequestsEnabled;
    }

    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    public final Set<String> getHelpCenterUrls() {
        return this.helpCenterUrls;
    }

    public final Set<String> getFeatures() {
        return this.features;
    }

    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    public final String getTeamGreeting() {
        return this.teamGreeting;
    }

    public final boolean isIdentityVerificationEnabled() {
        return this.isIdentityVerificationEnabled;
    }

    public final boolean isAccessToTeammateEnabled() {
        return this.isAccessToTeammateEnabled;
    }

    public final boolean isHelpCenterRequireSearchEnabled() {
        return this.isHelpCenterRequireSearchEnabled;
    }

    public final boolean isPreventMultipleInboundConversationsEnabled() {
        return this.isPreventMultipleInboundConversationsEnabled;
    }

    public final boolean getHasOpenConversations() {
        return this.hasOpenConversations;
    }

    public final ConfigModules getConfigModules() {
        return this.configModules;
    }

    public final NexusConfig getRealTimeConfig() {
        return this.realTimeConfig;
    }

    public final AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    public final boolean getArticleAutoReactionEnabled() {
        return this.articleAutoReactionEnabled;
    }

    public final ConversationStateSyncSettings getConversationStateSyncSettings() {
        return this.conversationStateSyncSettings;
    }

    public final boolean getAskUsersToAllowNotifications() {
        return this.askUsersToAllowNotifications;
    }

    public final boolean hasFeature(String feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return this.features.contains(feature);
    }

    public final boolean isBackgroundRequestsDisabled() {
        return !this.isBackgroundRequestsEnabled;
    }

    public final boolean isSpaceEnabled(Space.Type space) {
        HomeConfig home;
        OpenConfig openConfig;
        List<Space> spaces;
        Intrinsics.checkNotNullParameter(space, "space");
        ConfigModules configModules = this.configModules;
        if (configModules != null && (home = configModules.getHome()) != null && (openConfig = home.getOpenConfig()) != null && (spaces = openConfig.getSpaces()) != null) {
            List<Space> list = spaces;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Space) it.next()).getType() == space) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String getSpaceLabelIfExists(Space.Type space) {
        HomeConfig home;
        OpenConfig openConfig;
        List<Space> spaces;
        Object obj;
        Intrinsics.checkNotNullParameter(space, "space");
        ConfigModules configModules = this.configModules;
        if (configModules != null && (home = configModules.getHome()) != null && (openConfig = home.getOpenConfig()) != null && (spaces = openConfig.getSpaces()) != null) {
            Iterator<T> it = spaces.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Space) obj).getType() == space) {
                    break;
                }
            }
            Space space2 = (Space) obj;
            if (space2 != null) {
                return space2.getLabel();
            }
        }
        return null;
    }
}
