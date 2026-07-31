package com.pubmatic.sdk.common.log;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bJ\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/pubmatic/sdk/common/log/POBLogConstants;", "", "()V", "AD_LOAD_THRESHOLD_MSG", "", "CRASHANALYTICS_ENABLED", "CRASHANALYTICS_NOT_INITIALISED", "INFO_MSG_BID_EVENT_PROCEED_ON_ERROR", "INFO_MSG_BID_EVENT_PROCEED_TO_LOAD", "MSG_AD_ALREADY_SHOWN_ERROR", "MSG_AD_EXPIRED_ERROR", "MSG_AD_EXPIRED_PROCEEDING_IGNORING_OPENWRAP_BID", "MSG_AD_LOADED_ERROR", "MSG_AD_LOADING_ERROR", "MSG_AD_NOT_READY_ERROR", "MSG_AD_OBJECT_INVALID", "MSG_AD_SHOWING", "MSG_AD_SHOW_ERROR", "MSG_APP_OPEN_AD_VIDEO_EVENT", "MSG_BID_EVENT_SHARING_BIDS", "MSG_BID_NOT_RECEIVED_WARNING", "MSG_CONTAINER_VIEW_ERROOR", "MSG_CTA_OVERLAY_CLICKED", "MSG_CTA_OVERLAY_DISMISSED", "MSG_CTA_OVERLAY_FAILED", "MSG_CTA_OVERLAY_PRESENTED", "MSG_DEBUG_BIDS_FAILED", "MSG_DEBUG_BIDS_FETCHED", "MSG_FAILED_BID_EVENT", "MSG_FAILED_TO_CREATE_MRAID_RENDERER", "MSG_FAILED_TO_GET_APPLICATION_INSTANCE", "MSG_FAILED_TO_LOAD", "MSG_FAILED_TO_SHOW", "MSG_FMT_BID_EVENT_ERROR", "MSG_FMT_REWARDED_AD_CREATED", "MSG_FMT_REWARDED_AD_EXISTS", "MSG_INTERNAL_NATIVE_ERROR", "MSG_INVALID_BIDDING_HOST", "MSG_INVALID_BIDID", "MSG_INVALID_GPP_SID", "MSG_INVALID_HANDLER_ID", "MSG_INVALID_INPUT_PARAMS", "MSG_INVALID_REWARD_RECEIVED", "MSG_INVALID_REWARD_SELECTED", "MSG_MISSING_BID_RESPONSE", "MSG_MISSING_INPUT_PARAMS", "MSG_NATIVE_AD_PROCEED_WARNING", "MSG_NBR_ERROR_MESSAGE", "MSG_NO_ADS_AVAILABLE", "MSG_NO_ADS_AVAILABLE_FOR_REQUEST", "MSG_NO_ADS_AVAILABLE_FROM_BIDDER_ERROR", "MSG_PROCEEDING_WITH_BID", "MSG_RENDERERABLE_CONTENTS_NOT_AVAILABLE", "MSG_RENDERING_FAILED_ERROR", "MSG_RENDERING_ON_START", "MSG_REQUESTING_LOAD", "MSG_RETURNED_FROM_EXTERNAL_BROWSER", "MSG_REWARDED_AD_SHOW_ERROR", "MSG_SCHEDULE_LOAD_AD_DELAY", "MSG_SENDING_DEFAULT_REWARD", "MSG_SHOW_REWARDED_AD", "MSG_UNKNOWN_BIDDING_HOST", "MSG_WATERMARK_PASSED_ERROR", "OMID_JS_SCRIPT_FAILURE", "PROFILE_CONFIG_FAILED_STATUS", "PROFILE_CONFIG_FETCH_FAILED", "PROFILE_CONFIG_FETCH_SUCCESSFUL", "PROFILE_INFO_ALREADY_AVAILABLE", "READ_FROM_ASSET", "REWARDED_AD_SHOW_ERROR", "SDK_INITIALIZATION_FAILED", "SDK_INITIALIZATION_SUCCESS", "SESSION_HANDLER_INITIALIZATION_FAILED", "SESSION_HANDLER_INITIALIZATION_SUCCESSFUL", "SKIPPING_LOAD_AD_MESSAGE", "USER_AGENT_FETCH_SUCCESSFUL", "WARN_MSG_BID_EVENT_INVALID_STATE", "WARN_MSG_BID_EVENT_NOT_IMPLEMENTED", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class POBLogConstants {

    @NotNull
    public static final String AD_LOAD_THRESHOLD_MSG = "You can only request a maximum of %s native ads at a time.";

    @NotNull
    public static final String CRASHANALYTICS_ENABLED = "CrashAnalytics Enabled : ";

    @NotNull
    public static final String CRASHANALYTICS_NOT_INITIALISED = "CrashAnalytics is not initialized : ";

    @NotNull
    public static final String INFO_MSG_BID_EVENT_PROCEED_ON_ERROR = "Bid lost client side auction. Hence proceeding with error.";

    @NotNull
    public static final String INFO_MSG_BID_EVENT_PROCEED_TO_LOAD = "Bid won client side auction. Hence proceeding to load.";

    @NotNull
    public static final POBLogConstants INSTANCE = new POBLogConstants();

    @NotNull
    public static final String MSG_AD_ALREADY_SHOWN_ERROR = "Ad is already shown.";

    @NotNull
    public static final String MSG_AD_EXPIRED_ERROR = "Ad has expired.";

    @NotNull
    public static final String MSG_AD_EXPIRED_PROCEEDING_IGNORING_OPENWRAP_BID = "Bid expired! Invoking ad server call by ignoring OpenWrap Bid.";

    @NotNull
    public static final String MSG_AD_LOADED_ERROR = "Can't make new request. Please show already loaded ad before requesting a new one.";

    @NotNull
    public static final String MSG_AD_LOADING_ERROR = "Can't make new request. Ad is loading.";

    @NotNull
    public static final String MSG_AD_NOT_READY_ERROR = "Can't show ad. Ad is not ready.";

    @NotNull
    public static final String MSG_AD_OBJECT_INVALID = "Please check if you have provided valid details while constructing an Ad object";

    @NotNull
    public static final String MSG_AD_SHOWING = "Can't make new request while Ad is showing";

    @NotNull
    public static final String MSG_AD_SHOW_ERROR = "Failed to show %s ad with error: ";

    @NotNull
    public static final String MSG_APP_OPEN_AD_VIDEO_EVENT = "App Open Ad video event: ";

    @NotNull
    public static final String MSG_BID_EVENT_SHARING_BIDS = "Sharing bids through bid event delegate.";

    @NotNull
    public static final String MSG_BID_NOT_RECEIVED_WARNING = "Attempting to proceed before receiving bid";

    @NotNull
    public static final String MSG_CONTAINER_VIEW_ERROOR = "Failed to create renderer container view.";

    @NotNull
    public static final String MSG_CTA_OVERLAY_CLICKED = "CTAOverlay clicked.";

    @NotNull
    public static final String MSG_CTA_OVERLAY_DISMISSED = "CTAOverlay dismissed.";

    @NotNull
    public static final String MSG_CTA_OVERLAY_FAILED = "CTAOverlay failed to present with error: %s";

    @NotNull
    public static final String MSG_CTA_OVERLAY_PRESENTED = "CTAOverlay presented successfully.";

    @NotNull
    public static final String MSG_DEBUG_BIDS_FAILED = "onBidsFailed : errorMessage= %s";

    @NotNull
    public static final String MSG_DEBUG_BIDS_FETCHED = "onBidsFetched : ImpressionId=%s, BidPrice=%s";

    @NotNull
    public static final String MSG_FAILED_BID_EVENT = "Unable to proceed with request bid as event is null.";

    @NotNull
    public static final String MSG_FAILED_TO_CREATE_MRAID_RENDERER = "Failed to create MRAID Renderer.";

    @NotNull
    public static final String MSG_FAILED_TO_GET_APPLICATION_INSTANCE = "Failed to get application instance";

    @NotNull
    public static final String MSG_FAILED_TO_LOAD = "Failed to receive ad with error - ";

    @NotNull
    public static final String MSG_FAILED_TO_SHOW = "Failed to show ad with error - ";

    @NotNull
    public static final String MSG_FMT_BID_EVENT_ERROR = "Notifying error through bid event delegate - %s";

    @NotNull
    public static final String MSG_FMT_REWARDED_AD_CREATED = "Creating new rewarded ad - %s";

    @NotNull
    public static final String MSG_FMT_REWARDED_AD_EXISTS = "Returning existing rewarded ad - %s";

    @NotNull
    public static final String MSG_INTERNAL_NATIVE_ERROR = "Internal error occurred while loading Native Ad";

    @NotNull
    public static final String MSG_INVALID_BIDDING_HOST = "Bidding host cannot be null";

    @NotNull
    public static final String MSG_INVALID_BIDID = "bidId is invalid in onOpenWrapPartnerWin(), rendering the client-side winning bid";

    @NotNull
    public static final String MSG_INVALID_GPP_SID = "Invalid GPP_SID value is passed: %s";

    @NotNull
    public static final String MSG_INVALID_HANDLER_ID = "Invalid handler identifier";

    @NotNull
    public static final String MSG_INVALID_INPUT_PARAMS = "One or more invalid mandatory parameters found. Please verify Publisher id = %s, Profile id = %d, ad unit id = %s, Event handler = %s";

    @NotNull
    public static final String MSG_INVALID_REWARD_RECEIVED = "Received invalid reward values";

    @NotNull
    public static final String MSG_INVALID_REWARD_SELECTED = "Can't show ad, selected reward is invalid.";

    @NotNull
    public static final String MSG_MISSING_BID_RESPONSE = "Invalid Bid Response.";

    @NotNull
    public static final String MSG_MISSING_INPUT_PARAMS = "Missing ad request parameters. Please check input parameters.";

    @NotNull
    public static final String MSG_NATIVE_AD_PROCEED_WARNING = "Attempting to proceed while it is already in loading OR the process has already been completed.";

    @NotNull
    public static final String MSG_NBR_ERROR_MESSAGE = "No ads available, reason(NBR): ";

    @NotNull
    public static final String MSG_NO_ADS_AVAILABLE = "No ads available";

    @NotNull
    public static final String MSG_NO_ADS_AVAILABLE_FOR_REQUEST = "No ads available";

    @NotNull
    public static final String MSG_NO_ADS_AVAILABLE_FROM_BIDDER_ERROR = "No Ads available from any bidder";

    @NotNull
    public static final String MSG_PROCEEDING_WITH_BID = "Proceeding with bid.";

    @NotNull
    public static final String MSG_RENDERERABLE_CONTENTS_NOT_AVAILABLE = "Renderable contents not available.";

    @NotNull
    public static final String MSG_RENDERING_FAILED_ERROR = "Rendering failed for descriptor: ";

    @NotNull
    public static final String MSG_RENDERING_ON_START = "Rendering onStart";

    @NotNull
    public static final String MSG_REQUESTING_LOAD = "Requesting new bid from state - %s.";

    @NotNull
    public static final String MSG_RETURNED_FROM_EXTERNAL_BROWSER = "Returned from external browser";

    @NotNull
    public static final String MSG_REWARDED_AD_SHOW_ERROR = "Can not show rewarded ad for descriptor: ";

    @NotNull
    public static final String MSG_SCHEDULE_LOAD_AD_DELAY = "scheduleDelay until init completed.";

    @NotNull
    public static final String MSG_SENDING_DEFAULT_REWARD = "No reward received. Hence, creating new reward object with default values.";

    @NotNull
    public static final String MSG_SHOW_REWARDED_AD = "Show rewarded ad";

    @NotNull
    public static final String MSG_UNKNOWN_BIDDING_HOST = "Unknown bidding host";

    @NotNull
    public static final String MSG_WATERMARK_PASSED_ERROR = "Passed watermark image is not of type string.";

    @NotNull
    public static final String OMID_JS_SCRIPT_FAILURE = "Failed to fetch OMID JS script.";

    @NotNull
    public static final String PROFILE_CONFIG_FAILED_STATUS = "Profile config request status code: %s for %s";

    @NotNull
    public static final String PROFILE_CONFIG_FETCH_FAILED = "No remote configurations are detected for profile %s. OpenWrap SDK will use default configurations.";

    @NotNull
    public static final String PROFILE_CONFIG_FETCH_SUCCESSFUL = "Received profile config for profile %s, response - %s";

    @NotNull
    public static final String PROFILE_INFO_ALREADY_AVAILABLE = "ProfileInfo already available for profileId: %s";

    @NotNull
    public static final String READ_FROM_ASSET = "Successfully read file %s from bundle";

    @NotNull
    public static final String REWARDED_AD_SHOW_ERROR = "Failed to show interstitial ad with error: ";

    @NotNull
    public static final String SDK_INITIALIZATION_FAILED = "OpenWrap SDK initialization failed with error : ";

    @NotNull
    public static final String SDK_INITIALIZATION_SUCCESS = "OpenWrap SDK initialization successful";

    @NotNull
    public static final String SESSION_HANDLER_INITIALIZATION_FAILED = "Session handler initialization failed";

    @NotNull
    public static final String SESSION_HANDLER_INITIALIZATION_SUCCESSFUL = "Session handler initialized successfully";

    @NotNull
    public static final String SKIPPING_LOAD_AD_MESSAGE = "Skipping loadAd() as ad is already in %s state";

    @NotNull
    public static final String USER_AGENT_FETCH_SUCCESSFUL = "User agent fetched successfully : ";

    @NotNull
    public static final String WARN_MSG_BID_EVENT_INVALID_STATE = "Can not proceed before calling loadAd() or already in the process of proceed.";

    @NotNull
    public static final String WARN_MSG_BID_EVENT_NOT_IMPLEMENTED = "'POBBidEventListener' not implemented";

    private POBLogConstants() {
    }
}
