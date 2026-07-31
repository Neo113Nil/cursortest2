package com.mobilefuse.videoplayer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mobilefuse.sdk.CloseConfigResponse;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.MuteChangedListener;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import com.mobilefuse.sdk.ad.AdSkipOffsetResolver;
import com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import com.mobilefuse.sdk.omid.VastOmidBridge;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import com.mobilefuse.sdk.telemetry.TelemetryLogger;
import com.mobilefuse.sdk.utils.WebViewUtils;
import com.mobilefuse.sdk.video.AdmClickInfo;
import com.mobilefuse.sdk.video.AdmClickInfoProvider;
import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import com.mobilefuse.sdk.video.ClickthroughBehaviourKt;
import com.mobilefuse.videoplayer.VideoDownloader;
import com.mobilefuse.videoplayer.VideoPlayer;
import com.mobilefuse.videoplayer.controller.ExternalFullscreenControlBridge;
import com.mobilefuse.videoplayer.controller.FullscreenChangedListener;
import com.mobilefuse.videoplayer.controller.FullscreenController;
import com.mobilefuse.videoplayer.controller.FullscreenControllerImpl;
import com.mobilefuse.videoplayer.controller.MuteController;
import com.mobilefuse.videoplayer.controller.MuteControllerImpl;
import com.mobilefuse.videoplayer.controller.PlaybackController;
import com.mobilefuse.videoplayer.endcard.EndCardListener;
import com.mobilefuse.videoplayer.endcard.EndCardPresenter;
import com.mobilefuse.videoplayer.endcard.scheduler.BaseEndCardScheduler;
import com.mobilefuse.videoplayer.endcard.scheduler.EndCardScheduler;
import com.mobilefuse.videoplayer.media.MediaPlayerState;
import com.mobilefuse.videoplayer.media.MobileFusePlayer;
import com.mobilefuse.videoplayer.media.ViewType;
import com.mobilefuse.videoplayer.model.AdAutoplay;
import com.mobilefuse.videoplayer.model.VastBaseResource;
import com.mobilefuse.videoplayer.model.VastClickThrough;
import com.mobilefuse.videoplayer.model.VastCompanion;
import com.mobilefuse.videoplayer.model.VastDataModelExtensionsKt;
import com.mobilefuse.videoplayer.model.VastError;
import com.mobilefuse.videoplayer.model.VastIcon;
import com.mobilefuse.videoplayer.model.VastMediaFile;
import com.mobilefuse.videoplayer.model.VastPlayerCapability;
import com.mobilefuse.videoplayer.model.VastTime;
import com.mobilefuse.videoplayer.model.VastTrackingEventType;
import com.mobilefuse.videoplayer.model.VideoSource;
import com.mobilefuse.videoplayer.model.utils.StringEncodingAndFormattingKt;
import com.mobilefuse.videoplayer.network.NetworkUtils;
import com.mobilefuse.videoplayer.utils.MediaUtilsKt;
import com.mobilefuse.videoplayer.view.ViewCloseTrigger;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import com.safedk.android.internal.partials.MobileFuseNetworkBridge;
import com.safedk.android.internal.special.SpecialsBridge;
import com.safedk.android.utils.Logger;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: VideoPlayer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0006\u0097\u0002\u0098\u0002\u0099\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB=\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0014\u0010¼\u0001\u001a\u00030\u0082\u00012\b\u0010½\u0001\u001a\u00030¾\u0001H\u0002J\n\u0010¿\u0001\u001a\u00030\u0082\u0001H\u0002J\n\u0010À\u0001\u001a\u00030\u0082\u0001H\u0002J\u0014\u0010Á\u0001\u001a\u00030\u0082\u00012\b\u0010Â\u0001\u001a\u00030¬\u0001H\u0002J\t\u0010Ã\u0001\u001a\u00020'H\u0002J\u001a\u0010Ä\u0001\u001a\u00030\u0082\u00012\b\u0010Å\u0001\u001a\u00030¬\u0001H\u0000¢\u0006\u0003\bÆ\u0001J\n\u0010Ç\u0001\u001a\u00030\u0082\u0001H\u0002J\u0014\u0010È\u0001\u001a\u00030\u0082\u00012\b\u0010É\u0001\u001a\u00030\u009e\u0001H\u0002J\f\u0010Ê\u0001\u001a\u0005\u0018\u00010Ë\u0001H\u0002J\u001b\u0010Ì\u0001\u001a\u00030\u0082\u00012\u000f\u0010Í\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u0001H\u0003J\b\u0010Î\u0001\u001a\u00030\u0082\u0001J\n\u0010Ï\u0001\u001a\u00030\u0082\u0001H\u0002J\n\u0010Ð\u0001\u001a\u00030\u0082\u0001H\u0002J\u0015\u0010Ñ\u0001\u001a\u00030\u0082\u00012\b\u0010Ò\u0001\u001a\u00030Ó\u0001H\u0096\u0001J\u0007\u0010Ô\u0001\u001a\u00020\u000eJ\n\u0010Õ\u0001\u001a\u0005\u0018\u00010Ö\u0001J\n\u0010×\u0001\u001a\u0005\u0018\u00010Ö\u0001J\n\u0010Ø\u0001\u001a\u00030\u0082\u0001H\u0002J\u0014\u0010Ù\u0001\u001a\u00030\u0082\u00012\b\u0010Ú\u0001\u001a\u00030Û\u0001H\u0002J\u001b\u0010Ü\u0001\u001a\u00030\u0082\u00012\u000f\u0010Í\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u0001H\u0002J\n\u0010Ý\u0001\u001a\u00020\u000eH\u0096\u0001J\u000f\u0010Þ\u0001\u001a\u00020\u000eH\u0000¢\u0006\u0003\bß\u0001J\u0007\u0010à\u0001\u001a\u00020\u000eJ\u001a\u0010á\u0001\u001a\u00030\u0082\u00012\b\u0010â\u0001\u001a\u00030¬\u00012\u0006\u0010i\u001a\u00020jJ\b\u0010ã\u0001\u001a\u00030\u0082\u0001J\b\u0010ä\u0001\u001a\u00030\u0082\u0001J\n\u0010å\u0001\u001a\u00030\u0082\u0001H\u0002J\n\u0010æ\u0001\u001a\u00030\u0082\u0001H\u0014J\n\u0010ç\u0001\u001a\u00030\u0082\u0001H\u0014J\n\u0010è\u0001\u001a\u00030\u0082\u0001H\u0002J7\u0010é\u0001\u001a\u00030\u0082\u00012\u0007\u0010ê\u0001\u001a\u00020\u000e2\u0007\u0010ë\u0001\u001a\u00020\u000b2\u0007\u0010ì\u0001\u001a\u00020\u000b2\u0007\u0010í\u0001\u001a\u00020\u000b2\u0007\u0010î\u0001\u001a\u00020\u000bH\u0014J\u0015\u0010ï\u0001\u001a\u00030\u0082\u00012\t\u0010ð\u0001\u001a\u0004\u0018\u00010=H\u0002J\n\u0010ñ\u0001\u001a\u00030\u0082\u0001H\u0002J!\u0010ò\u0001\u001a\u00030\u0082\u00012\u0007\u0010ó\u0001\u001a\u00020\u000e2\f\b\u0002\u0010ô\u0001\u001a\u0005\u0018\u00010õ\u0001H\u0002J\u000b\u0010ö\u0001\u001a\u00030\u0082\u0001H\u0096\u0001J\u000b\u0010÷\u0001\u001a\u00030\u0082\u0001H\u0096\u0001J\u0014\u0010ø\u0001\u001a\u00030\u0082\u00012\b\u0010ù\u0001\u001a\u00030ú\u0001H\u0002J\n\u0010û\u0001\u001a\u00030\u0082\u0001H\u0002J\u0013\u0010ü\u0001\u001a\u00030\u0082\u00012\u0007\u0010ý\u0001\u001a\u00020GH\u0002J\u001d\u0010þ\u0001\u001a\u00030\u0082\u00012\b\u0010ÿ\u0001\u001a\u00030\u0080\u00022\u0007\u0010\u0081\u0002\u001a\u00020\u000bH\u0014J\b\u0010\u0082\u0002\u001a\u00030\u0082\u0001J\u001e\u0010\u0083\u0002\u001a\u00030\u0082\u00012\n\u0010\u0084\u0002\u001a\u0005\u0018\u00010£\u00012\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001J\n\u0010\u0085\u0002\u001a\u00030\u0082\u0001H\u0002J\n\u0010\u0086\u0002\u001a\u00030\u0082\u0001H\u0002J\b\u0010\u0087\u0002\u001a\u00030\u0082\u0001J\u0014\u0010\u0088\u0002\u001a\u00030\u0082\u00012\b\u0010\u0089\u0002\u001a\u00030\u008a\u0002H\u0002J\u0013\u0010\u008b\u0002\u001a\u00030\u0082\u00012\u0006\u0010X\u001a\u00020\u000eH\u0096\u0001J\u000b\u0010\u008c\u0002\u001a\u00030\u0082\u0001H\u0096\u0001J\u000b\u0010\u008d\u0002\u001a\u00030\u0082\u0001H\u0096\u0001J\u0014\u0010\u008e\u0002\u001a\u00030\u0082\u00012\u0007\u0010\u008f\u0002\u001a\u00020\u000eH\u0096\u0001J\u0014\u0010\u0090\u0002\u001a\u00030\u0082\u00012\n\u0010\u0091\u0002\u001a\u0005\u0018\u00010\u0092\u0002J\u0014\u0010\u0093\u0002\u001a\u00030\u0082\u00012\b\u0010ù\u0001\u001a\u00030ú\u0001H\u0002J\n\u0010\u0094\u0002\u001a\u00030\u0082\u0001H\u0002J\n\u0010\u0095\u0002\u001a\u00030\u0082\u0001H\u0002J\n\u0010\u0096\u0002\u001a\u00030\u0082\u0001H\u0002R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u000103X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u00108\u001a\u000209X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010>\u001a\u0004\u0018\u00010?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010B\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010I\u001a\u0004\u0018\u00010H2\b\u0010\u0014\u001a\u0004\u0018\u00010H@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u001a\u0010L\u001a\u00020MX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0018\u0010R\u001a\u00020\u000eX\u0096\u000f¢\u0006\f\u001a\u0004\bS\u0010#\"\u0004\bT\u0010%R\u001a\u0010U\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010)\"\u0004\bW\u0010+R\u0012\u0010X\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\bY\u0010#R\u0012\u0010Z\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b[\u0010#R\u001a\u0010\\\u001a\u0004\u0018\u00010]X\u0096\u000f¢\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010d\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\be\u0010#R\u0012\u0010f\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\bf\u0010#R\u000e\u0010g\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010i\u001a\u0004\u0018\u00010jX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010k\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u001a\u0010n\u001a\u00020oX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR$\u0010u\u001a\u00020\u000b2\u0006\u0010t\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u001a\u0010z\u001a\u0004\u0018\u00010{X\u0096\u000f¢\u0006\f\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0080\u0001\u001a\f\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010\u0081\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u000f\u0010\u0087\u0001\u001a\u00020CX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0088\u0001\u001a\u00030\u0089\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u008a\u0001\u001a\u00020C2\u0006\u0010\u0014\u001a\u00020C@BX\u0086\u000e¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010ER\"\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0093\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0015\u0010\u0096\u0001\u001a\u00030\u0097\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u009b\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R#\u0010\u009f\u0001\u001a\u00030\u009e\u00012\u0007\u0010\u0014\u001a\u00030\u009e\u0001@BX\u0086\u000e¢\u0006\n\n\u0000\u001a\u0006\b \u0001\u0010¡\u0001R\"\u0010¢\u0001\u001a\u0005\u0018\u00010£\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R\u001d\u0010¨\u0001\u001a\u00020\u000eX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b©\u0001\u0010#\"\u0005\bª\u0001\u0010%R\"\u0010«\u0001\u001a\u0005\u0018\u00010¬\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R\u0019\u0010±\u0001\u001a\f\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010\u0081\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010²\u0001\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010³\u0001\u001a\u00020\u000eX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b´\u0001\u0010#\"\u0005\bµ\u0001\u0010%R\"\u0010¶\u0001\u001a\u0005\u0018\u00010·\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001¨\u0006\u009a\u0002"}, d2 = {"Lcom/mobilefuse/videoplayer/VideoPlayer;", "Landroid/widget/FrameLayout;", "Lcom/mobilefuse/videoplayer/controller/FullscreenController;", "Lcom/mobilefuse/videoplayer/controller/MuteController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "primary", "", "fullscreenController", "Lcom/mobilefuse/videoplayer/controller/FullscreenControllerImpl;", "muteController", "Lcom/mobilefuse/videoplayer/controller/MuteControllerImpl;", "(Landroid/content/Context;Landroid/util/AttributeSet;IZLcom/mobilefuse/videoplayer/controller/FullscreenControllerImpl;Lcom/mobilefuse/videoplayer/controller/MuteControllerImpl;)V", "<set-?>", "Lcom/mobilefuse/videoplayer/model/AdAutoplay;", "adAutoplay", "getAdAutoplay", "()Lcom/mobilefuse/videoplayer/model/AdAutoplay;", "setAdAutoplay$mobilefuse_video_player_release", "(Lcom/mobilefuse/videoplayer/model/AdAutoplay;)V", "admClickInfoProvider", "Lcom/mobilefuse/sdk/video/AdmClickInfoProvider;", "getAdmClickInfoProvider", "()Lcom/mobilefuse/sdk/video/AdmClickInfoProvider;", "setAdmClickInfoProvider", "(Lcom/mobilefuse/sdk/video/AdmClickInfoProvider;)V", "allowClickthroughWithoutTap", "getAllowClickthroughWithoutTap", "()Z", "setAllowClickthroughWithoutTap", "(Z)V", "blockSkipSeconds", "", "getBlockSkipSeconds", "()F", "setBlockSkipSeconds", "(F)V", "clickthroughBehaviour", "Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;", "getClickthroughBehaviour", "()Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;", "setClickthroughBehaviour", "(Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;)V", "closeConfigResponse", "Lcom/mobilefuse/sdk/CloseConfigResponse;", "getCloseConfigResponse", "()Lcom/mobilefuse/sdk/CloseConfigResponse;", "setCloseConfigResponse", "(Lcom/mobilefuse/sdk/CloseConfigResponse;)V", "controller", "Lcom/mobilefuse/videoplayer/VideoPlayerController;", "getController$mobilefuse_video_player_release", "()Lcom/mobilefuse/videoplayer/VideoPlayerController;", "currentMediaFile", "Lcom/mobilefuse/videoplayer/model/VastMediaFile;", "currentMediaFileSizeDp", "Landroid/graphics/Point;", "getCurrentMediaFileSizeDp", "()Landroid/graphics/Point;", "currentPlaybackPositionMillis", "", "getCurrentPlaybackPositionMillis", "()J", "currentVideoSource", "Lcom/mobilefuse/videoplayer/model/VideoSource;", "Lcom/mobilefuse/videoplayer/endcard/EndCardPresenter;", "endCardPresenter", "getEndCardPresenter$mobilefuse_video_player_release", "()Lcom/mobilefuse/videoplayer/endcard/EndCardPresenter;", "endCardScheduler", "Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardScheduler;", "getEndCardScheduler", "()Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardScheduler;", "setEndCardScheduler", "(Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardScheduler;)V", "enterFullscreenOnVideoTap", "getEnterFullscreenOnVideoTap", "setEnterFullscreenOnVideoTap", "forceSkipSeconds", "getForceSkipSeconds", "setForceSkipSeconds", "fullscreen", "getFullscreen", "fullscreenAllowed", "getFullscreenAllowed", "fullscreenChangedListener", "Lcom/mobilefuse/videoplayer/controller/FullscreenChangedListener;", "getFullscreenChangedListener", "()Lcom/mobilefuse/videoplayer/controller/FullscreenChangedListener;", "setFullscreenChangedListener", "(Lcom/mobilefuse/videoplayer/controller/FullscreenChangedListener;)V", "impressionReported", "initialized", "isDestroyed", "isDestroyed$mobilefuse_video_player_release", "isMuteAllowed", "layoutHeight", "layoutWidth", "loadListener", "Lcom/mobilefuse/videoplayer/VideoPlayer$LoadListener;", "mainContainer", "getMainContainer$mobilefuse_video_player_release", "()Landroid/widget/FrameLayout;", "mainContainerParams", "Landroid/view/ViewGroup$LayoutParams;", "getMainContainerParams$mobilefuse_video_player_release", "()Landroid/view/ViewGroup$LayoutParams;", "setMainContainerParams$mobilefuse_video_player_release", "(Landroid/view/ViewGroup$LayoutParams;)V", "value", "maxEndCardsToShow", "getMaxEndCardsToShow", "()I", "setMaxEndCardsToShow", "(I)V", "muteChangedListener", "Lcom/mobilefuse/sdk/MuteChangedListener;", "getMuteChangedListener", "()Lcom/mobilefuse/sdk/MuteChangedListener;", "setMuteChangedListener", "(Lcom/mobilefuse/sdk/MuteChangedListener;)V", "onVideoSkipButtonVisible", "Lkotlin/Function0;", "", "getOnVideoSkipButtonVisible", "()Lkotlin/jvm/functions/Function0;", "setOnVideoSkipButtonVisible", "(Lkotlin/jvm/functions/Function0;)V", "pausedVideoPosition", "playbackController", "Lcom/mobilefuse/videoplayer/controller/PlaybackController;", "playbackDurationMillis", "getPlaybackDurationMillis", "playbackListener", "Lcom/mobilefuse/videoplayer/VideoPlayer$PlaybackListener;", "getPlaybackListener$mobilefuse_video_player_release", "()Lcom/mobilefuse/videoplayer/VideoPlayer$PlaybackListener;", "setPlaybackListener$mobilefuse_video_player_release", "(Lcom/mobilefuse/videoplayer/VideoPlayer$PlaybackListener;)V", "player", "Lcom/mobilefuse/videoplayer/media/MobileFusePlayer;", "getPlayer$mobilefuse_video_player_release", "()Lcom/mobilefuse/videoplayer/media/MobileFusePlayer;", "playerCapabilities", "Lcom/mobilefuse/videoplayer/VideoPlayerCapabilities;", "getPlayerCapabilities", "()Lcom/mobilefuse/videoplayer/VideoPlayerCapabilities;", "playerHandler", "Landroid/os/Handler;", "getPlayerHandler$mobilefuse_video_player_release", "()Landroid/os/Handler;", "Lcom/mobilefuse/videoplayer/VideoPlayer$PlayerState;", "playerState", "getPlayerState", "()Lcom/mobilefuse/videoplayer/VideoPlayer$PlayerState;", "renderingActivity", "Landroid/app/Activity;", "getRenderingActivity$mobilefuse_video_player_release", "()Landroid/app/Activity;", "setRenderingActivity$mobilefuse_video_player_release", "(Landroid/app/Activity;)V", "shouldCacheVideo", "getShouldCacheVideo", "setShouldCacheVideo", "uiAdm", "", "getUiAdm", "()Ljava/lang/String;", "setUiAdm", "(Ljava/lang/String;)V", "videoDownloadCancelAction", h.am, "videoStreamEnabled", "getVideoStreamEnabled", "setVideoStreamEnabled", "webView", "Landroid/webkit/WebView;", "getWebView$mobilefuse_video_player_release", "()Landroid/webkit/WebView;", "setWebView$mobilefuse_video_player_release", "(Landroid/webkit/WebView;)V", "addIcon", "icon", "Lcom/mobilefuse/videoplayer/model/VastIcon;", "addIcons", "addPlayerInstance", "cacheVideo", "currentMediaFileUrl", "calculateSkipOffset", "callJsBridgeCmd", POBConstants.KEY_JS, "callJsBridgeCmd$mobilefuse_video_player_release", "cancelVideoCache", "changePlayerState", "newPlayerState", "createAdmClickInfo", "Lcom/mobilefuse/sdk/video/AdmClickInfo;", "createWebView", "initializationListener", "destroy", "destroyEndCard", "destroyVideoPlayer", "enableExternalFullscreenControl", "bridge", "Lcom/mobilefuse/videoplayer/controller/ExternalFullscreenControlBridge;", "fillsEntireScreen", "getSizeInDp", "", "getSizeInPixels", "handleCriticalAssetFailure", "handleVastBridgeCall", "callUri", "Landroid/net/Uri;", "initializePlayer", "isMuted", "isPlayerVisible", "isPlayerVisible$mobilefuse_video_player_release", "isPlaying", "loadVast", "xml", "onActivityPause", "onActivityResume", "onAdCompleted", "onAttachedToWindow", "onDetachedFromWindow", "onEndCardError", "onLayout", "changed", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "onMediaFileSelected", "mediaFile", "onPrepared", "onVastDataLoaded", "success", "error", "Lcom/mobilefuse/videoplayer/model/VastError;", "onVideoBecameInvisible", "onVideoBecameVisible", "onVideoCompleted", "closeTrigger", "Lcom/mobilefuse/videoplayer/view/ViewCloseTrigger;", "onVideoError", "onVideoFileCached", "videoSource", "onVisibilityChanged", "changedView", "Landroid/view/View;", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "pause", "play", "activity", "removePlayerUi", "reportAdImpression", "resume", "sendTrackingEvent", "eventType", "Lcom/mobilefuse/videoplayer/model/VastTrackingEventType;", "setFullscreen", "setFullscreenAllowed", "setMuteAllowed", "setMuted", "muted", "setOmidBridge", "omidBridge", "Lcom/mobilefuse/sdk/omid/VastOmidBridge;", "showEndCard", "skipVideo", "startVideoTimer", "stopVideoTimer", "LoadListener", "PlaybackListener", "PlayerState", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes9.dex */
public final class VideoPlayer extends FrameLayout implements FullscreenController, MuteController {

    @NotNull
    private AdAutoplay adAutoplay;

    @Nullable
    private AdmClickInfoProvider admClickInfoProvider;
    private boolean allowClickthroughWithoutTap;
    private float blockSkipSeconds;

    @NotNull
    private ClickthroughBehaviour clickthroughBehaviour;

    @Nullable
    private CloseConfigResponse closeConfigResponse;

    @NotNull
    private final VideoPlayerController controller;
    private VastMediaFile currentMediaFile;
    private VideoSource currentVideoSource;

    @Nullable
    private EndCardPresenter endCardPresenter;

    @NotNull
    private EndCardScheduler endCardScheduler;
    private float forceSkipSeconds;
    private final FullscreenControllerImpl fullscreenController;
    private boolean impressionReported;
    private boolean initialized;
    private int layoutHeight;
    private int layoutWidth;
    private LoadListener loadListener;

    @NotNull
    private final FrameLayout mainContainer;

    @NotNull
    private ViewGroup.LayoutParams mainContainerParams;
    private int maxEndCardsToShow;
    private final MuteControllerImpl muteController;

    @Nullable
    private Function0 onVideoSkipButtonVisible;
    private long pausedVideoPosition;
    private final PlaybackController playbackController;
    private long playbackDurationMillis;

    @Nullable
    private PlaybackListener playbackListener;

    @NotNull
    private final MobileFusePlayer player;

    @NotNull
    private final VideoPlayerCapabilities playerCapabilities;

    @NotNull
    private final Handler playerHandler;

    @NotNull
    private PlayerState playerState;

    @Nullable
    private Activity renderingActivity;
    private boolean shouldCacheVideo;

    @Nullable
    private String uiAdm;
    private volatile Function0 videoDownloadCancelAction;
    private boolean videoStarted;
    private boolean videoStreamEnabled;

    @Nullable
    private WebView webView;

    /* compiled from: VideoPlayer.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/mobilefuse/videoplayer/VideoPlayer$LoadListener;", "", "onError", "", "error", "Lcom/mobilefuse/videoplayer/model/VastError;", "onVideoLoaded", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
    public interface LoadListener {
        void onError(@Nullable VastError error);

        void onVideoLoaded();
    }

    /* compiled from: VideoPlayer.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016¨\u0006\u0013"}, d2 = {"Lcom/mobilefuse/videoplayer/VideoPlayer$PlaybackListener;", "", "()V", "onAdCompleted", "", "onAdImpression", "onClicked", "url", "", "onEndCardError", "onVideoCompleted", "onVideoError", "onVideoFirstQuartile", "onVideoMidpoint", "onVideoPaused", "onVideoPlaying", "onVideoSkipped", "onVideoStarted", "onVideoThirdQuartile", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
    public static class PlaybackListener {
        public void onAdCompleted() {
        }

        public void onAdImpression() {
        }

        public void onClicked(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
        }

        public void onEndCardError() {
        }

        public void onVideoCompleted() {
        }

        public void onVideoError() {
        }

        public void onVideoFirstQuartile() {
        }

        public void onVideoMidpoint() {
        }

        public void onVideoPaused() {
        }

        public void onVideoPlaying() {
        }

        public void onVideoSkipped() {
        }

        public void onVideoStarted() {
        }

        public void onVideoThirdQuartile() {
        }
    }

    /* compiled from: VideoPlayer.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/mobilefuse/videoplayer/VideoPlayer$PlayerState;", "", "(Ljava/lang/String;I)V", "IDLE", "VIDEO_LOADING", "VIDEO_CACHED", "INITIALIZING", "PLAYING", "PAUSED", "END_CARD", "ERROR", "DESTROYED", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
    public enum PlayerState {
        IDLE,
        VIDEO_LOADING,
        VIDEO_CACHED,
        INITIALIZING,
        PLAYING,
        PAUSED,
        END_CARD,
        ERROR,
        DESTROYED
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    /* loaded from: classes10.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MediaPlayerState.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[MediaPlayerState.PLAYING.ordinal()] = 1;
            iArr[MediaPlayerState.PAUSED.ordinal()] = 2;
            iArr[MediaPlayerState.ERROR.ordinal()] = 3;
            int[] iArr2 = new int[PlayerState.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[PlayerState.ERROR.ordinal()] = 1;
            iArr2[PlayerState.PLAYING.ordinal()] = 2;
            iArr2[PlayerState.PAUSED.ordinal()] = 3;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.E, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public void enableExternalFullscreenControl(@NotNull ExternalFullscreenControlBridge bridge) {
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        this.fullscreenController.enableExternalFullscreenControl(bridge);
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public boolean getEnterFullscreenOnVideoTap() {
        return this.fullscreenController.getEnterFullscreenOnVideoTap();
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public boolean getFullscreen() {
        return this.fullscreenController.getFullscreen();
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public boolean getFullscreenAllowed() {
        return this.fullscreenController.getFullscreenAllowed();
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    @Nullable
    public FullscreenChangedListener getFullscreenChangedListener() {
        return this.fullscreenController.getFullscreenChangedListener();
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    @Nullable
    public MuteChangedListener getMuteChangedListener() {
        return this.muteController.getMuteChangedListener();
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    /* renamed from: isMuteAllowed */
    public boolean getIsMuteAllowed() {
        return this.muteController.getIsMuteAllowed();
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    public boolean isMuted() {
        return this.muteController.isMuted();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    public void onVideoBecameInvisible() {
        this.muteController.onVideoBecameInvisible();
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    public void onVideoBecameVisible() {
        this.muteController.onVideoBecameVisible();
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public void setEnterFullscreenOnVideoTap(boolean z) {
        this.fullscreenController.setEnterFullscreenOnVideoTap(z);
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public void setFullscreen(boolean fullscreen) {
        this.fullscreenController.setFullscreen(fullscreen);
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public void setFullscreenAllowed() {
        this.fullscreenController.setFullscreenAllowed();
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public void setFullscreenChangedListener(@Nullable FullscreenChangedListener fullscreenChangedListener) {
        this.fullscreenController.setFullscreenChangedListener(fullscreenChangedListener);
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    public void setMuteAllowed() {
        this.muteController.setMuteAllowed();
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    public void setMuteChangedListener(@Nullable MuteChangedListener muteChangedListener) {
        this.muteController.setMuteChangedListener(muteChangedListener);
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    public void setMuted(boolean muted) {
        this.muteController.setMuted(muted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAdCompleted() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.fullscreenController.executeFullscreenExit$mobilefuse_video_player_release();
            PlaybackListener playbackListener = this.playbackListener;
            if (playbackListener != null) {
                playbackListener.onAdCompleted();
            }
        } catch (Throwable th) {
            int i = VideoPlayer$onAdCompleted$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVideoCompleted(ViewCloseTrigger closeTrigger) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (isDestroyed$mobilefuse_video_player_release()) {
                return;
            }
            DebuggingKt.logDebug$default(this, "onVideoCompleted", null, 2, null);
            AdmClickInfoProvider admClickInfoProvider = this.admClickInfoProvider;
            if (admClickInfoProvider != null) {
                admClickInfoProvider.destroyProducer(this.controller.getAdmClickInfo());
            }
            this.admClickInfoProvider = null;
            stopVideoTimer();
            if (closeTrigger == ViewCloseTrigger.AUTO_CLOSE) {
                sendTrackingEvent(VastTrackingEventType.complete);
                PlaybackListener playbackListener = this.playbackListener;
                if (playbackListener != null) {
                    playbackListener.onVideoCompleted();
                }
            }
            showEndCard(closeTrigger);
        } catch (Throwable th) {
            int i = VideoPlayer$onVideoCompleted$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void loadVast(@NotNull final String xml, @NotNull final LoadListener loadListener) {
        Intrinsics.checkNotNullParameter(xml, "xml");
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.loadListener = new LoadListener() { // from class: com.mobilefuse.videoplayer.VideoPlayer$loadVast$$inlined$handleExceptions$lambda$1
                @Override // com.mobilefuse.videoplayer.VideoPlayer.LoadListener
                public void onVideoLoaded() {
                    SchedulersKt.safelyRunOnMainThread$default(null, new Function0() { // from class: com.mobilefuse.videoplayer.VideoPlayer$loadVast$$inlined$handleExceptions$lambda$1.1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo4828invoke() {
                            invoke();
                            return Unit.INSTANCE;
                        }

                        public final void invoke() {
                            loadListener.onVideoLoaded();
                        }
                    }, 1, null);
                }

                @Override // com.mobilefuse.videoplayer.VideoPlayer.LoadListener
                public void onError(@Nullable final VastError error) {
                    SchedulersKt.safelyRunOnMainThread$default(null, new Function0() { // from class: com.mobilefuse.videoplayer.VideoPlayer$loadVast$$inlined$handleExceptions$lambda$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo4828invoke() {
                            invoke();
                            return Unit.INSTANCE;
                        }

                        public final void invoke() {
                            loadListener.onError(error);
                        }
                    }, 1, null);
                }
            };
            SchedulersKt.safelyRunOnBgThread$default(null, new Function0() { // from class: com.mobilefuse.videoplayer.VideoPlayer$loadVast$$inlined$handleExceptions$lambda$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* compiled from: VideoPlayer.kt */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "p1", "", "p2", "Lcom/mobilefuse/videoplayer/model/VastError;", "invoke", "com/mobilefuse/videoplayer/VideoPlayer$loadVast$1$2$1"}, k = 3, mv = {1, 4, 3})
                /* renamed from: com.mobilefuse.videoplayer.VideoPlayer$loadVast$$inlined$handleExceptions$lambda$2$1, reason: invalid class name */
                static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2 {
                    AnonymousClass1(VideoPlayer videoPlayer) {
                        super(2, videoPlayer, VideoPlayer.class, "onVastDataLoaded", "onVastDataLoaded(ZLcom/mobilefuse/videoplayer/model/VastError;)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke(((Boolean) obj).booleanValue(), (VastError) obj2);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z, @Nullable VastError vastError) {
                        ((VideoPlayer) this.receiver).onVastDataLoaded(z, vastError);
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    VideoPlayer.this.getController().loadVastTag(xml, new AnonymousClass1(VideoPlayer.this));
                }
            }, 1, null);
        } catch (Throwable th) {
            int i = VideoPlayer$loadVast$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NotNull View changedView, int visibility) {
        Window window;
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (isDestroyed$mobilefuse_video_player_release()) {
                return;
            }
            if (isPlayerVisible$mobilefuse_video_player_release()) {
                this.player.onBecameVisible();
                this.muteController.onVideoBecameVisible();
            } else {
                Activity activity = this.renderingActivity;
                if (!Intrinsics.areEqual(changedView, (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView())) {
                    this.muteController.onVideoBecameInvisible();
                    this.player.onBecameInvisible();
                }
            }
            super.onVisibilityChanged(changedView, visibility);
        } catch (Throwable th) {
            int i = VideoPlayer$onVisibilityChanged$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final boolean isPlayerVisible$mobilefuse_video_player_release() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            return this.mainContainer.isShown();
        } catch (Throwable th) {
            if (VideoPlayer$isPlayerVisible$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return false;
        }
    }

    /* synthetic */ VideoPlayer(Context context, AttributeSet attributeSet, int i, boolean z, FullscreenControllerImpl fullscreenControllerImpl, MuteControllerImpl muteControllerImpl, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, i, z, (i2 & 16) != 0 ? new FullscreenControllerImpl() : fullscreenControllerImpl, (i2 & 32) != 0 ? new MuteControllerImpl() : muteControllerImpl);
    }

    private VideoPlayer(Context context, AttributeSet attributeSet, int i, boolean z, FullscreenControllerImpl fullscreenControllerImpl, MuteControllerImpl muteControllerImpl) {
        super(context, attributeSet, i);
        this.fullscreenController = fullscreenControllerImpl;
        this.muteController = muteControllerImpl;
        this.playerHandler = new Handler(Looper.getMainLooper());
        this.layoutWidth = -1;
        this.layoutHeight = -1;
        this.player = new MobileFusePlayer(context);
        PlaybackController playbackController = new PlaybackController();
        this.playbackController = playbackController;
        this.mainContainer = new FrameLayout(context);
        this.mainContainerParams = new ViewGroup.LayoutParams(-1, -1);
        this.playbackDurationMillis = -1L;
        this.controller = new VideoPlayerController(context, this);
        this.playerState = PlayerState.IDLE;
        this.playerCapabilities = new VideoPlayerCapabilities();
        this.adAutoplay = AdAutoplay.UNMUTED_AUTOPLAY;
        this.forceSkipSeconds = -1.0f;
        this.blockSkipSeconds = -1.0f;
        this.videoStreamEnabled = true;
        this.shouldCacheVideo = true;
        this.maxEndCardsToShow = 1;
        this.endCardScheduler = new BaseEndCardScheduler();
        this.clickthroughBehaviour = ClickthroughBehaviour.CTA_AND_VIDEO;
        this.admClickInfoProvider = new AdmClickInfoProvider();
        playbackController.initialize(this);
        muteControllerImpl.initialize(this);
        fullscreenControllerImpl.initialize(this);
        addPlayerInstance();
        AdmClickInfoProvider admClickInfoProvider = this.admClickInfoProvider;
        if (admClickInfoProvider != null) {
            admClickInfoProvider.registerProducer(new Function0() { // from class: com.mobilefuse.videoplayer.VideoPlayer.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* renamed from: invoke */
                public final AdmClickInfo mo4828invoke() {
                    return VideoPlayer.this.createAdmClickInfo();
                }
            });
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoPlayer(@NotNull Context context) {
        this(context, null, 0, true, null, null, 48, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoPlayer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, true, null, null, 48, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoPlayer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, true, null, null, 48, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    /* renamed from: getPlayerHandler$mobilefuse_video_player_release, reason: from getter */
    public final Handler getPlayerHandler() {
        return this.playerHandler;
    }

    @Nullable
    /* renamed from: getRenderingActivity$mobilefuse_video_player_release, reason: from getter */
    public final Activity getRenderingActivity() {
        return this.renderingActivity;
    }

    public final void setRenderingActivity$mobilefuse_video_player_release(@Nullable Activity activity) {
        this.renderingActivity = activity;
    }

    @NotNull
    /* renamed from: getPlayer$mobilefuse_video_player_release, reason: from getter */
    public final MobileFusePlayer getPlayer() {
        return this.player;
    }

    @NotNull
    /* renamed from: getMainContainer$mobilefuse_video_player_release, reason: from getter */
    public final FrameLayout getMainContainer() {
        return this.mainContainer;
    }

    @NotNull
    /* renamed from: getMainContainerParams$mobilefuse_video_player_release, reason: from getter */
    public final ViewGroup.LayoutParams getMainContainerParams() {
        return this.mainContainerParams;
    }

    public final void setMainContainerParams$mobilefuse_video_player_release(@NotNull ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "<set-?>");
        this.mainContainerParams = layoutParams;
    }

    public final long getPlaybackDurationMillis() {
        return this.playbackDurationMillis;
    }

    @Nullable
    /* renamed from: getWebView$mobilefuse_video_player_release, reason: from getter */
    public final WebView getWebView() {
        return this.webView;
    }

    public final void setWebView$mobilefuse_video_player_release(@Nullable WebView webView) {
        this.webView = webView;
    }

    @NotNull
    /* renamed from: getController$mobilefuse_video_player_release, reason: from getter */
    public final VideoPlayerController getController() {
        return this.controller;
    }

    @Nullable
    /* renamed from: getPlaybackListener$mobilefuse_video_player_release, reason: from getter */
    public final PlaybackListener getPlaybackListener() {
        return this.playbackListener;
    }

    public final void setPlaybackListener$mobilefuse_video_player_release(@Nullable PlaybackListener playbackListener) {
        this.playbackListener = playbackListener;
    }

    @Nullable
    public final Function0 getOnVideoSkipButtonVisible() {
        return this.onVideoSkipButtonVisible;
    }

    public final void setOnVideoSkipButtonVisible(@Nullable Function0 function0) {
        this.onVideoSkipButtonVisible = function0;
    }

    @NotNull
    public final PlayerState getPlayerState() {
        return this.playerState;
    }

    @NotNull
    public final VideoPlayerCapabilities getPlayerCapabilities() {
        return this.playerCapabilities;
    }

    @NotNull
    public final AdAutoplay getAdAutoplay() {
        return this.adAutoplay;
    }

    public final void setAdAutoplay$mobilefuse_video_player_release(@NotNull AdAutoplay adAutoplay) {
        Intrinsics.checkNotNullParameter(adAutoplay, "<set-?>");
        this.adAutoplay = adAutoplay;
    }

    public final float getForceSkipSeconds() {
        return this.forceSkipSeconds;
    }

    public final void setForceSkipSeconds(float f) {
        this.forceSkipSeconds = f;
    }

    public final float getBlockSkipSeconds() {
        return this.blockSkipSeconds;
    }

    public final void setBlockSkipSeconds(float f) {
        this.blockSkipSeconds = f;
    }

    public final boolean getVideoStreamEnabled() {
        return this.videoStreamEnabled;
    }

    public final void setVideoStreamEnabled(boolean z) {
        this.videoStreamEnabled = z;
    }

    public final boolean getShouldCacheVideo() {
        return this.shouldCacheVideo;
    }

    public final void setShouldCacheVideo(boolean z) {
        this.shouldCacheVideo = z;
    }

    public final int getMaxEndCardsToShow() {
        return this.maxEndCardsToShow;
    }

    public final void setMaxEndCardsToShow(int i) {
        if (this.maxEndCardsToShow < 0) {
            return;
        }
        this.maxEndCardsToShow = i;
    }

    @NotNull
    public final EndCardScheduler getEndCardScheduler() {
        return this.endCardScheduler;
    }

    public final void setEndCardScheduler(@NotNull EndCardScheduler endCardScheduler) {
        Intrinsics.checkNotNullParameter(endCardScheduler, "<set-?>");
        this.endCardScheduler = endCardScheduler;
    }

    @Nullable
    /* renamed from: getEndCardPresenter$mobilefuse_video_player_release, reason: from getter */
    public final EndCardPresenter getEndCardPresenter() {
        return this.endCardPresenter;
    }

    @NotNull
    public final ClickthroughBehaviour getClickthroughBehaviour() {
        return this.clickthroughBehaviour;
    }

    public final void setClickthroughBehaviour(@NotNull ClickthroughBehaviour clickthroughBehaviour) {
        Intrinsics.checkNotNullParameter(clickthroughBehaviour, "<set-?>");
        this.clickthroughBehaviour = clickthroughBehaviour;
    }

    @Nullable
    public final AdmClickInfoProvider getAdmClickInfoProvider() {
        return this.admClickInfoProvider;
    }

    public final void setAdmClickInfoProvider(@Nullable AdmClickInfoProvider admClickInfoProvider) {
        this.admClickInfoProvider = admClickInfoProvider;
    }

    @Nullable
    public final String getUiAdm() {
        return this.uiAdm;
    }

    public final void setUiAdm(@Nullable String str) {
        this.uiAdm = str;
    }

    @Nullable
    public final CloseConfigResponse getCloseConfigResponse() {
        return this.closeConfigResponse;
    }

    public final void setCloseConfigResponse(@Nullable CloseConfigResponse closeConfigResponse) {
        this.closeConfigResponse = closeConfigResponse;
    }

    public final boolean getAllowClickthroughWithoutTap() {
        return this.allowClickthroughWithoutTap;
    }

    public final void setAllowClickthroughWithoutTap(boolean z) {
        this.allowClickthroughWithoutTap = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdmClickInfo createAdmClickInfo() {
        return this.controller.getAdmClickInfo();
    }

    private final void addPlayerInstance() {
        try {
            this.mainContainer.setBackgroundColor((int) 4278190080L);
            addView(this.mainContainer, this.mainContainerParams);
            this.mainContainer.addView(this.player, new ViewGroup.LayoutParams(-1, -1));
            this.player.setPlayerStateChangeListener(new Function1() { // from class: com.mobilefuse.videoplayer.VideoPlayer$addPlayerInstance$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((MediaPlayerState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull MediaPlayerState state) {
                    VideoPlayer.PlayerState playerState;
                    Intrinsics.checkNotNullParameter(state, "state");
                    try {
                        int i = VideoPlayer.WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                        if (i == 1) {
                            playerState = VideoPlayer.PlayerState.PLAYING;
                        } else if (i == 2) {
                            playerState = VideoPlayer.PlayerState.PAUSED;
                        } else {
                            playerState = i != 3 ? null : VideoPlayer.PlayerState.ERROR;
                        }
                        if (playerState != null) {
                            VideoPlayer.this.changePlayerState(playerState);
                        }
                    } catch (Throwable th) {
                        StabilityHelper.logException(VideoPlayer.this, th);
                    }
                }
            });
            this.player.setPlaybackCompletionListener(new Function0() { // from class: com.mobilefuse.videoplayer.VideoPlayer$addPlayerInstance$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    try {
                        VideoPlayer.this.onVideoCompleted(ViewCloseTrigger.AUTO_CLOSE);
                    } catch (Throwable th) {
                        StabilityHelper.logException(VideoPlayer.this, th);
                    }
                }
            });
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public final void setOmidBridge(@Nullable VastOmidBridge omidBridge) {
        this.controller.setOmidBridge(omidBridge);
    }

    static /* synthetic */ void onVastDataLoaded$default(VideoPlayer videoPlayer, boolean z, VastError vastError, int i, Object obj) {
        if ((i & 2) != 0) {
            vastError = null;
        }
        videoPlayer.onVastDataLoaded(z, vastError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVastDataLoaded(boolean success, VastError error) {
        if (isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            if (!success) {
                DebuggingKt.logError$default(this, "VAST xml tag can't be loaded or parsed", null, null, 6, null);
                LoadListener loadListener = this.loadListener;
                if (loadListener != null) {
                    loadListener.onError(error);
                    return;
                }
                return;
            }
            NetworkUtils networkUtils = NetworkUtils.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            if (networkUtils.getNetworkType(context) == null) {
                DebuggingKt.logError$default(this, "Can't proceed with media file loading due to no active network connection.", null, null, 6, null);
                LoadListener loadListener2 = this.loadListener;
                if (loadListener2 != null) {
                    loadListener2.onError(VastError.MEDIAFILE_TIMEOUT);
                    return;
                }
                return;
            }
            VideoCache videoCache = VideoCache.INSTANCE;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            videoCache.initialize(context2);
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            this.controller.selectBestMediaFile(MediaUtilsKt.getScreenSizeAsPixels(context3), new VideoPlayer$onVastDataLoaded$2(this));
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMediaFileSelected(VastMediaFile mediaFile) {
        if (isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            if (mediaFile == null) {
                LoadListener loadListener = this.loadListener;
                if (loadListener != null) {
                    loadListener.onError(VastError.MEDIAFILE_NOT_FOUND);
                    return;
                }
                return;
            }
            this.currentMediaFile = mediaFile;
            String url = mediaFile.getUrl();
            if (url == null) {
                LoadListener loadListener2 = this.loadListener;
                if (loadListener2 != null) {
                    loadListener2.onError(VastError.MEDIAFILE_NOT_FOUND);
                    return;
                }
                return;
            }
            changePlayerState(PlayerState.VIDEO_LOADING);
            if (this.videoStreamEnabled && !StringsKt.isBlank(mediaFile.getUrl())) {
                TelemetryLogger.INSTANCE.reportVideoStreamingEvent("Video file requested for streaming. videoStreamEnabled=" + this.videoStreamEnabled);
                this.currentVideoSource = new VideoSource(mediaFile.getUrl(), mediaFile.getUrl(), this.shouldCacheVideo);
                changePlayerState(PlayerState.VIDEO_CACHED);
                LoadListener loadListener3 = this.loadListener;
                if (loadListener3 != null) {
                    loadListener3.onVideoLoaded();
                }
            }
            if (this.shouldCacheVideo) {
                TelemetryLogger.INSTANCE.reportVideoStreamingEvent("Video file requested for caching: streamingEnabled=" + this.videoStreamEnabled + ", shouldCache=" + this.shouldCacheVideo);
                cacheVideo(url);
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    private final void cacheVideo(String currentMediaFileUrl) {
        VideoDownloader videoDownloader = VideoDownloader.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        videoDownloader.cache(context, currentMediaFileUrl, new VideoDownloader.Listener() { // from class: com.mobilefuse.videoplayer.VideoPlayer$cacheVideo$1
            @Override // com.mobilefuse.videoplayer.VideoDownloader.Listener
            public void onComplete(@NotNull String requestedUrl, @NotNull VideoSource videoSource) {
                Intrinsics.checkNotNullParameter(requestedUrl, "requestedUrl");
                Intrinsics.checkNotNullParameter(videoSource, "videoSource");
                try {
                    VideoPlayer.this.onVideoFileCached(videoSource);
                    TelemetryLogger.INSTANCE.reportVideoStreamingEvent("Video cache process success");
                } catch (Throwable th) {
                    StabilityHelper.logException(this, th);
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoDownloader.Listener
            public void onError(@NotNull VastError error) {
                VideoPlayer.LoadListener loadListener;
                Intrinsics.checkNotNullParameter(error, "error");
                if (VideoPlayer.this.isDestroyed$mobilefuse_video_player_release() || VideoPlayer.this.getVideoStreamEnabled()) {
                    return;
                }
                VideoPlayer.this.getController().sendErrorEvent(error);
                loadListener = VideoPlayer.this.loadListener;
                if (loadListener != null) {
                    loadListener.onError(error);
                }
            }
        }, new Function1() { // from class: com.mobilefuse.videoplayer.VideoPlayer$cacheVideo$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Function0) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Function0 cancelAction) {
                Intrinsics.checkNotNullParameter(cancelAction, "cancelAction");
                VideoPlayer.this.videoDownloadCancelAction = cancelAction;
            }
        });
    }

    private final void cancelVideoCache() {
        SchedulersKt.safelyRunOnBgThread$default(null, new Function0() { // from class: com.mobilefuse.videoplayer.VideoPlayer$cancelVideoCache$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                Function0 function0;
                if (VideoPlayer.this.getVideoStreamEnabled()) {
                    function0 = VideoPlayer.this.videoDownloadCancelAction;
                    if (function0 != null) {
                    }
                    VideoPlayer.this.videoDownloadCancelAction = null;
                }
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVideoFileCached(VideoSource videoSource) {
        if (isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            this.videoDownloadCancelAction = null;
            this.currentVideoSource = videoSource;
            if (this.videoStreamEnabled) {
                return;
            }
            changePlayerState(PlayerState.VIDEO_CACHED);
            LoadListener loadListener = this.loadListener;
            if (loadListener != null) {
                loadListener.onVideoLoaded();
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    private final void initializePlayer(Function0 initializationListener) {
        try {
            if (this.initialized) {
                return;
            }
            this.initialized = true;
            createWebView(initializationListener);
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void createWebView(final Function0 initializationListener) {
        if (isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        final WebView webView = new WebView(getContext());
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "settings");
        settings.setJavaScriptEnabled(true);
        WebSettings settings2 = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings2, "settings");
        settings2.setAllowContentAccess(true);
        WebSettings settings3 = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings3, "settings");
        settings3.setAllowFileAccess(false);
        WebSettings settings4 = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings4, "settings");
        settings4.setAllowFileAccessFromFileURLs(false);
        WebSettings settings5 = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings5, "settings");
        settings5.setAllowUniversalAccessFromFileURLs(false);
        webView.setBackgroundColor(Color.argb(0, 255, 255, 255));
        webView.setLayerType(2, null);
        String str = this.uiAdm;
        final String str2 = "https://sdk-webview.mobilefuse.com/vast/";
        if (str != null) {
            MobileFuseNetworkBridge.webviewLoadDataWithBaseURL(webView, "https://sdk-webview.mobilefuse.com/vast/", str, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
        } else {
            MobileFuseAssetManager mobileFuseAssetManager = MobileFuseAssetManager.INSTANCE;
            Context context = webView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            final Flow<String> specificAssetContentFlow = mobileFuseAssetManager.getSpecificAssetContentFlow("vast_controls.html", context);
            final Schedulers schedulers = Schedulers.MAIN;
            FlowKt.flow(new Function1() { // from class: com.mobilefuse.videoplayer.VideoPlayer$$special$$inlined$runOn$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((FlowCollector<? super String>) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull final FlowCollector<? super String> flow) {
                    Intrinsics.checkNotNullParameter(flow, "$this$flow");
                    Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.videoplayer.VideoPlayer$$special$$inlined$runOn$1.1
                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public void emitError(@NotNull Throwable error) {
                            Intrinsics.checkNotNullParameter(error, "error");
                            FlowCollector.DefaultImpls.emitError(this, error);
                        }

                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public void emitSuccess(T t) {
                            FlowCollector.DefaultImpls.emitSuccess(this, t);
                        }

                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public final void emit(@NotNull final Either<? extends Throwable, ? extends T> value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            final FlowCollector flowCollector = flow;
                            SchedulersKt.runOnScheduler(schedulers, new Function0() { // from class: com.mobilefuse.videoplayer.VideoPlayer$$special$.inlined.runOn.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                    invoke();
                                    return Unit.INSTANCE;
                                }

                                public final void invoke() {
                                    FlowCollector.this.emit(value);
                                }
                            });
                        }
                    });
                }
            }).collect(new FlowCollector() { // from class: com.mobilefuse.videoplayer.VideoPlayer$$special$$inlined$collectResult$1
                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public void emitError(@NotNull Throwable error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    FlowCollector.DefaultImpls.emitError(this, error);
                }

                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public void emitSuccess(T t) {
                    FlowCollector.DefaultImpls.emitSuccess(this, t);
                }

                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    if (result instanceof SuccessResult) {
                        String str3 = (String) ((SuccessResult) result).getValue();
                        if (str3 != null) {
                            MobileFuseNetworkBridge.webviewLoadDataWithBaseURL(webView, str2, str3, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
                        } else {
                            DebuggingKt.logError$default(webView, "Can't render VideoPlayer, getSpecificAssetContentFlow returned null", null, null, 6, null);
                        }
                    }
                }
            });
        }
        webView.setWebViewClient(new WebViewClient() { // from class: com.mobilefuse.videoplayer.VideoPlayer$createWebView$$inlined$apply$lambda$1
            @Override // android.webkit.WebViewClient
            public void onLoadResource(@Nullable WebView view, @NotNull String url) {
                Logger.d("MobileFuse|SafeDK: Execution> Lcom/mobilefuse/videoplayer/VideoPlayer$createWebView$$inlined$apply$lambda$1;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
                CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.E, view, url);
                safedk_VideoPlayer$createWebView$$inlined$apply$lambda$1_onLoadResource_85a90d9f548b1100e7097afc163d10a1(view, url);
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.E, view, url);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.E, view, errorCode, description, failingUrl);
            }

            /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
            @Override // android.webkit.WebViewClient
            @RequiresApi
            @Nullable
            public WebResourceResponse shouldInterceptRequest(@Nullable WebView view, @Nullable WebResourceRequest request) {
                Logger.d("MobileFuse|SafeDK: Execution> Lcom/mobilefuse/videoplayer/VideoPlayer$createWebView$$inlined$apply$lambda$1;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
                return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.E, view, request, safedk_VideoPlayer$createWebView$$inlined$apply$lambda$1_shouldInterceptRequest_238ee8a3379c76e98c758c5307204651(view, request));
            }

            @Override // android.webkit.WebViewClient
            @Deprecated
            @Nullable
            public WebResourceResponse shouldInterceptRequest(@Nullable WebView view, @Nullable String url) {
                Logger.d("MobileFuse|SafeDK: Execution> Lcom/mobilefuse/videoplayer/VideoPlayer$createWebView$$inlined$apply$lambda$1;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.h.E, view, url, safedk_VideoPlayer$createWebView$$inlined$apply$lambda$1_shouldInterceptRequest_ec42305474b207f012a84d233306e5ba(view, url));
            }

            @Override // android.webkit.WebViewClient
            @Deprecated
            public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull String url) {
                Logger.d("MobileFuse|SafeDK: Execution> Lcom/mobilefuse/videoplayer/VideoPlayer$createWebView$$inlined$apply$lambda$1;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
                boolean safedk_VideoPlayer$createWebView$$inlined$apply$lambda$1_shouldOverrideUrlLoading_387ab4b88f0fa35f6f8f6f2016b788b2 = safedk_VideoPlayer$createWebView$$inlined$apply$lambda$1_shouldOverrideUrlLoading_387ab4b88f0fa35f6f8f6f2016b788b2(view, url);
                BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.E, view, url, safedk_VideoPlayer$createWebView$$inlined$apply$lambda$1_shouldOverrideUrlLoading_387ab4b88f0fa35f6f8f6f2016b788b2);
                return safedk_VideoPlayer$createWebView$$inlined$apply$lambda$1_shouldOverrideUrlLoading_387ab4b88f0fa35f6f8f6f2016b788b2;
            }

            @Deprecated
            public boolean safedk_VideoPlayer$createWebView$$inlined$apply$lambda$1_shouldOverrideUrlLoading_387ab4b88f0fa35f6f8f6f2016b788b2(WebView view, String url) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                try {
                    Uri parsed = Uri.parse(url);
                    Intrinsics.checkNotNullExpressionValue(parsed, "parsed");
                    if (Intrinsics.areEqual(parsed.getScheme(), "vast")) {
                        this.handleVastBridgeCall(parsed);
                        return true;
                    }
                    return super.shouldOverrideUrlLoading(view, url);
                } catch (Throwable th) {
                    StabilityHelper.logException(this, th);
                    return true;
                }
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(@NotNull WebView view, @NotNull String url) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                try {
                    initializationListener.mo4828invoke();
                } catch (Throwable th) {
                    StabilityHelper.logException(this, th);
                }
                super.onPageFinished(view, url);
            }

            public void safedk_VideoPlayer$createWebView$$inlined$apply$lambda$1_onLoadResource_85a90d9f548b1100e7097afc163d10a1(WebView p0, String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                try {
                    HttpRequestTracker.logHttpRequest(url);
                } catch (Throwable th) {
                    StabilityHelper.logException(this, th);
                }
                super.onLoadResource(p0, url);
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(@Nullable WebView view, @Nullable RenderProcessGoneDetail detail) {
                Log.w("Video Player", "WebView Render Process has gone.");
                if (view != this.getWebView()) {
                    return true;
                }
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    WebView webView2 = this.getWebView();
                    if (webView2 != null) {
                        ViewParent parent = webView2.getParent();
                        if (!(parent instanceof ViewGroup)) {
                            parent = null;
                        }
                        ViewGroup viewGroup = (ViewGroup) parent;
                        if (viewGroup != null) {
                            viewGroup.removeView(webView2);
                        }
                    }
                    this.getController().sendErrorEvent(VastError.GENERAL_PLAYBACK_FAILURE);
                    this.onVideoError();
                } catch (Throwable th) {
                    int i = VideoPlayer$createWebView$1$3$onRenderProcessGone$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return true;
            }

            @RequiresApi
            @Nullable
            public WebResourceResponse safedk_VideoPlayer$createWebView$$inlined$apply$lambda$1_shouldInterceptRequest_238ee8a3379c76e98c758c5307204651(WebView p0, WebResourceRequest p1) {
                if (p1 == null) {
                    return null;
                }
                try {
                    return WebViewUtils.shouldInterceptRequest(webView.getContext(), p1.getUrl(), new Function0() { // from class: com.mobilefuse.videoplayer.VideoPlayer$createWebView$$inlined$apply$lambda$1.1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo4828invoke() {
                            invoke();
                            return Unit.INSTANCE;
                        }

                        public final void invoke() {
                            this.handleCriticalAssetFailure();
                        }
                    });
                } catch (Throwable th) {
                    StabilityHelper.logException(this, th);
                    return super.shouldInterceptRequest(p0, p1);
                }
            }

            @Deprecated
            @Nullable
            public WebResourceResponse safedk_VideoPlayer$createWebView$$inlined$apply$lambda$1_shouldInterceptRequest_ec42305474b207f012a84d233306e5ba(WebView p0, String p1) {
                try {
                    return WebViewUtils.shouldInterceptRequest(webView.getContext(), Uri.parse(p1), new Function0() { // from class: com.mobilefuse.videoplayer.VideoPlayer$createWebView$$inlined$apply$lambda$1.2
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo4828invoke() {
                            invoke();
                            return Unit.INSTANCE;
                        }

                        public final void invoke() {
                            this.handleCriticalAssetFailure();
                        }
                    });
                } catch (Throwable th) {
                    StabilityHelper.logException(this, th);
                    return super.shouldInterceptRequest(p0, p1);
                }
            }
        });
        Unit unit = Unit.INSTANCE;
        this.webView = webView;
        this.mainContainer.addView(webView, 1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (!isDestroyed$mobilefuse_video_player_release() && changed) {
            try {
                this.layoutWidth = right - left;
                this.layoutHeight = bottom - top;
            } catch (Throwable th) {
                StabilityHelper.logException(this, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void handleVastBridgeCall(Uri callUri) {
        String url;
        PlaybackListener playbackListener;
        if (isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        String host = callUri.getHost();
        DebuggingKt.logDebug$default(this, "Call: " + host, null, 2, null);
        if (host != null) {
            boolean z = true;
            switch (host.hashCode()) {
                case -1416528753:
                    if (host.equals("iconClick")) {
                        String it = callUri.getQueryParameter("payload");
                        if (it != null) {
                            VideoPlayerController videoPlayerController = this.controller;
                            Intrinsics.checkNotNullExpressionValue(it, "it");
                            videoPlayerController.onIconClick(it);
                            break;
                        }
                    }
                    break;
                case -737868098:
                    if (host.equals("iconView")) {
                        String it2 = callUri.getQueryParameter("payload");
                        if (it2 != null) {
                            VideoPlayerController videoPlayerController2 = this.controller;
                            Intrinsics.checkNotNullExpressionValue(it2, "it");
                            videoPlayerController2.onIconView(it2);
                            break;
                        }
                    }
                    break;
                case -356709944:
                    if (host.equals("closeButtonVisible")) {
                        this.playerCapabilities.changeCapability(VastPlayerCapability.SKIP, true);
                        Function0 function0 = this.onVideoSkipButtonVisible;
                        if (function0 != null) {
                            break;
                        }
                    }
                    break;
                case 94750088:
                    if (host.equals("click")) {
                        if (getEnterFullscreenOnVideoTap() && getFullscreenAllowed() && !getFullscreen()) {
                            setFullscreen(true);
                            break;
                        } else {
                            String it3 = callUri.getQueryParameter("source");
                            if (it3 != null) {
                                ClickthroughBehaviour clickthroughBehaviour = this.clickthroughBehaviour;
                                Intrinsics.checkNotNullExpressionValue(it3, "it");
                                z = ClickthroughBehaviourKt.canAcceptSource(clickthroughBehaviour, it3);
                            }
                            if (z) {
                                this.controller.onVideoClickThrough();
                                VastClickThrough clickThrough = this.controller.getClickThrough();
                                if (clickThrough != null && (url = clickThrough.getUrl()) != null && (playbackListener = this.playbackListener) != null) {
                                    playbackListener.onClicked(url);
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 94756344:
                    if (host.equals("close")) {
                        skipVideo();
                        break;
                    }
                    break;
                case 586449341:
                    if (host.equals("setFullscreen")) {
                        setFullscreen(callUri.getBooleanQueryParameter("fullscreen", false));
                        break;
                    }
                    break;
                case 1984790939:
                    if (host.equals("setMute")) {
                        this.muteController.setMuteFromWebView(callUri.getBooleanQueryParameter("muted", false));
                        this.controller.onMuteChanged();
                        MuteChangedListener muteChangedListener = getMuteChangedListener();
                        if (muteChangedListener != null) {
                            muteChangedListener.onMutedChanged(this.muteController.getMuted());
                            break;
                        }
                    }
                    break;
            }
            callJsBridgeCmd$mobilefuse_video_player_release("vast.bridge.nativeCallComplete();");
        }
        Log.w(VastTagName.VAST, "Unimplemented command called: " + host);
        callJsBridgeCmd$mobilefuse_video_player_release("vast.bridge.nativeCallComplete();");
    }

    public final void callJsBridgeCmd$mobilefuse_video_player_release(@NotNull final String js) {
        Intrinsics.checkNotNullParameter(js, "js");
        if (isDestroyed$mobilefuse_video_player_release() || this.webView == null) {
            return;
        }
        this.playerHandler.post(new Runnable() { // from class: com.mobilefuse.videoplayer.VideoPlayer$callJsBridgeCmd$1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    WebView webView = VideoPlayer.this.getWebView();
                    if (webView != null) {
                        webView.evaluateJavascript(js, null);
                    }
                } catch (Throwable th) {
                    StabilityHelper.logException(VideoPlayer.this, th);
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            resume();
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        try {
            pause();
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
        super.onDetachedFromWindow();
    }

    public final void play(@Nullable Activity activity, @NotNull PlaybackListener playbackListener) {
        Intrinsics.checkNotNullParameter(playbackListener, "playbackListener");
        if (isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        cancelVideoCache();
        try {
            this.renderingActivity = activity;
            final VideoSource videoSource = this.currentVideoSource;
            if (videoSource == null) {
                return;
            }
            if (this.playerState != PlayerState.VIDEO_CACHED) {
                DebuggingKt.logError$default(this, "Can't play video because is not cached.", null, null, 6, null);
                return;
            }
            this.playbackListener = playbackListener;
            this.controller.initOmid$mobilefuse_video_player_release();
            this.controller.callOmidLoadedEvent$mobilefuse_video_player_release();
            this.adAutoplay = this.muteController.getMuted() ? AdAutoplay.MUTED_AUTOPLAY : AdAutoplay.UNMUTED_AUTOPLAY;
            changePlayerState(PlayerState.INITIALIZING);
            initializePlayer(new Function0() { // from class: com.mobilefuse.videoplayer.VideoPlayer$play$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    VideoPlayer.this.getPlayer().prepare(videoSource, ViewType.SURFACE_VIEW, new Function0() { // from class: com.mobilefuse.videoplayer.VideoPlayer$play$1.1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo4828invoke() {
                            invoke();
                            return Unit.INSTANCE;
                        }

                        public final void invoke() {
                            if (VideoPlayer.this.isPlayerVisible$mobilefuse_video_player_release()) {
                                VideoPlayer.this.getPlayer().onBecameVisible();
                            }
                            DebuggingKt.logDebug$default(VideoPlayer.this, "on video player prepared", null, 2, null);
                            VideoPlayer.this.onPrepared();
                        }
                    });
                }
            });
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    private final float calculateSkipOffset() {
        VastTime adSkipOffset = this.controller.getAdSkipOffset();
        return AdSkipOffsetResolver.resolveAdSkipOffset(adSkipOffset != null ? Float.valueOf(adSkipOffset.getValueInFloatSeconds()) : null, this.forceSkipSeconds, this.blockSkipSeconds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPrepared() {
        if (isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            DebuggingKt.logDebug$default(this, "vast player ready", null, 2, null);
            if (getEnterFullscreenOnVideoTap()) {
                callJsBridgeCmd$mobilefuse_video_player_release("vast.bridge.setEnterFullscreenOnVideoTap(true);");
            }
            VastTime adDuration = this.controller.getAdDuration();
            if (adDuration != null) {
                callJsBridgeCmd$mobilefuse_video_player_release("vast.bridge.setVideoDuration(" + adDuration.getValueInSeconds() + ");");
            }
            float calculateSkipOffset = calculateSkipOffset();
            if (calculateSkipOffset != -1.0f) {
                callJsBridgeCmd$mobilefuse_video_player_release("vast.bridge.setSkipTime(" + calculateSkipOffset + ");");
            }
            callJsBridgeCmd$mobilefuse_video_player_release("vast.bridge.setCtaText(\"" + StringEncodingAndFormattingKt.encodeUriComponent("Learn More") + "\");");
            if (getIsMuteAllowed()) {
                this.muteController.enableMuteButton$mobilefuse_video_player_release();
            }
            if (getFullscreenAllowed()) {
                this.fullscreenController.enableFullscreenButton$mobilefuse_video_player_release();
            }
            addIcons();
            DebuggingKt.logDebug$default(this, "vast player playing", null, 2, null);
            this.playbackDurationMillis = this.player.getDuration();
            this.player.play();
            startVideoTimer();
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    private final void addIcons() {
        Iterator<VastIcon> it = this.controller.getIcons().iterator();
        while (it.hasNext()) {
            addIcon(it.next());
        }
    }

    private final void addIcon(VastIcon icon) {
        try {
            VastBaseResource resource = icon.getResource();
            if (resource != null && resource.getContent() != null) {
                String str = "IconResourceType." + icon.getResource().getResourceType().name();
                JSONObject jSONObject = new JSONObject();
                Integer width = icon.getWidth();
                if (width != null) {
                    jSONObject.put("width", width.intValue());
                }
                Integer height = icon.getHeight();
                if (height != null) {
                    jSONObject.put("height", height.intValue());
                }
                if (icon.getOffset() != null) {
                    jSONObject.put("offset", r2.getValueInFloatSeconds());
                }
                if (icon.getDuration() != null) {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, r2.getValueInFloatSeconds());
                }
                jSONObject.put("clickPayload", icon.getUid());
                jSONObject.put("viewPayload", icon.getUid());
                jSONObject.put("resource", icon.getResource().getContent());
                callJsBridgeCmd$mobilefuse_video_player_release("vast.bridge.addIcon(" + str + ", " + jSONObject + ");");
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public final boolean fillsEntireScreen() {
        View findViewById;
        if (isDestroyed$mobilefuse_video_player_release()) {
            return false;
        }
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (getFullscreenAllowed()) {
            return getFullscreen();
        }
        View rootView = getRootView();
        return rootView != null && (findViewById = rootView.findViewById(android.R.id.content)) != null && findViewById.getWidth() == this.mainContainer.getWidth() && findViewById.getHeight() == this.mainContainer.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVideoError() {
        DebuggingKt.logDebug$default(this, "onVideoError", null, 2, null);
        PlaybackListener playbackListener = this.playbackListener;
        if (playbackListener != null) {
            playbackListener.onVideoError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEndCardError() {
        DebuggingKt.logDebug$default(this, "onEndCardError", null, 2, null);
        PlaybackListener playbackListener = this.playbackListener;
        if (playbackListener != null) {
            playbackListener.onEndCardError();
        }
    }

    private final void startVideoTimer() {
        if (isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        this.playbackController.startUpdating(new Function2() { // from class: com.mobilefuse.videoplayer.VideoPlayer$startVideoTimer$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Number) obj).longValue(), ((Number) obj2).longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j, long j2) {
                VideoPlayer.this.callJsBridgeCmd$mobilefuse_video_player_release("vast.bridge.setVideoDuration(" + (j2 / 1000.0f) + ");");
                VideoPlayer.this.callJsBridgeCmd$mobilefuse_video_player_release("vast.bridge.setCurrentTime(" + (((float) j) / 1000.0f) + ");");
            }
        });
    }

    private final void stopVideoTimer() {
        this.playbackController.stopUpdating();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changePlayerState(PlayerState newPlayerState) {
        if (isDestroyed$mobilefuse_video_player_release() || this.playerState == newPlayerState) {
            return;
        }
        this.playerState = newPlayerState;
        DebuggingKt.logDebug$default(this, "changePlayerState [newState: " + newPlayerState + ']', null, 2, null);
        try {
            int i = WhenMappings.$EnumSwitchMapping$1[this.playerState.ordinal()];
            if (i == 1) {
                this.controller.sendErrorEvent(VastError.GENERAL_PLAYBACK_FAILURE);
                onVideoError();
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                PlaybackListener playbackListener = this.playbackListener;
                if (playbackListener != null) {
                    playbackListener.onVideoPaused();
                }
                this.controller.sendTrackingEvent(VastTrackingEventType.pause);
                return;
            }
            if (!this.videoStarted) {
                this.videoStarted = true;
                PlaybackListener playbackListener2 = this.playbackListener;
                if (playbackListener2 != null) {
                    playbackListener2.onVideoStarted();
                }
                this.controller.sendTrackingEvent(VastTrackingEventType.start);
                reportAdImpression();
            } else {
                this.controller.sendTrackingEvent(VastTrackingEventType.resume);
            }
            PlaybackListener playbackListener3 = this.playbackListener;
            if (playbackListener3 != null) {
                playbackListener3.onVideoPlaying();
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    private final void reportAdImpression() {
        if (this.impressionReported) {
            return;
        }
        this.impressionReported = true;
        this.controller.sendImpressionEvent$mobilefuse_video_player_release(new Function0() { // from class: com.mobilefuse.videoplayer.VideoPlayer$reportAdImpression$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                VideoPlayer.PlaybackListener playbackListener = VideoPlayer.this.getPlaybackListener();
                if (playbackListener != null) {
                    playbackListener.onAdImpression();
                }
            }
        });
    }

    private final void skipVideo() {
        if (isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            this.controller.onSkipped();
            pause();
            PlaybackListener playbackListener = this.playbackListener;
            if (playbackListener != null) {
                playbackListener.onVideoSkipped();
            }
            onVideoCompleted(ViewCloseTrigger.USER);
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    private final void showEndCard(final ViewCloseTrigger closeTrigger) {
        Either errorResult;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
        } catch (Throwable th) {
            if (VideoPlayer$showEndCard$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        changePlayerState(PlayerState.END_CARD);
        destroyVideoPlayer();
        DebuggingKt.logDebug$default(this, "Show EndCard", null, 2, null);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        List<VastCompanion> selectCompanionAds = this.controller.selectCompanionAds(MediaUtilsKt.getScreenSizeAsPixels(context));
        if (selectCompanionAds.isEmpty()) {
            onAdCompleted();
            return;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        EndCardPresenter endCardPresenter = new EndCardPresenter(this.mainContainer, context2, this.renderingActivity, this.endCardScheduler, selectCompanionAds, getFullscreen(), this.allowClickthroughWithoutTap, this.closeConfigResponse, new EndCardListener() { // from class: com.mobilefuse.videoplayer.VideoPlayer$showEndCard$$inlined$gracefullyHandleException$lambda$1
            @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
            public void onClicked(@NotNull VastCompanion companion, @Nullable VastClickThrough clickThrough) {
                String url;
                VideoPlayer.PlaybackListener playbackListener;
                Intrinsics.checkNotNullParameter(companion, "companion");
                ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    VideoPlayer.this.getController().sendCompanionAdClickTrackingEvent(companion);
                    if (clickThrough != null) {
                        Context context3 = VideoPlayer.this.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        VastDataModelExtensionsKt.openUrl(clickThrough, context3, VideoPlayer.this.getController().getEventTracker(), null);
                    }
                    if (clickThrough == null || (url = clickThrough.getUrl()) == null || (playbackListener = VideoPlayer.this.getPlaybackListener()) == null) {
                        return;
                    }
                    playbackListener.onClicked(url);
                } catch (Throwable th2) {
                    int i = VideoPlayer$showEndCard$1$endCardPresenter$1$onClicked$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
            public void onClosed(@NotNull VastCompanion companion, @NotNull ViewCloseTrigger closeTrigger2) {
                Intrinsics.checkNotNullParameter(companion, "companion");
                Intrinsics.checkNotNullParameter(closeTrigger2, "closeTrigger");
                ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
            }

            @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
            public void onCompleted() {
                ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    VideoPlayer.this.onAdCompleted();
                } catch (Throwable th2) {
                    int i = VideoPlayer$showEndCard$1$endCardPresenter$1$onCompleted$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
            public void onError(@NotNull VastError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    VideoPlayer.this.getController().sendErrorEvent(error);
                    VideoPlayer.this.onEndCardError();
                } catch (Throwable th2) {
                    int i = VideoPlayer$showEndCard$1$endCardPresenter$1$onError$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }

            @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
            public void onTrackingEvent(@NotNull VastCompanion companion, @NotNull VastTrackingEventType eventType) {
                Intrinsics.checkNotNullParameter(companion, "companion");
                Intrinsics.checkNotNullParameter(eventType, "eventType");
                VideoPlayer.this.getController().sendCompanionAdTrackingEvent(companion, eventType);
            }
        });
        this.endCardPresenter = endCardPresenter;
        endCardPresenter.showNextEndCard(closeTrigger, new Function1() { // from class: com.mobilefuse.videoplayer.VideoPlayer$showEndCard$$inlined$gracefullyHandleException$lambda$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (z) {
                    return;
                }
                VideoPlayer.this.getController().sendErrorEvent(VastError.UNABLE_TO_DISPLAY_REQUIRED_COMPANION);
            }
        });
        errorResult = new SuccessResult(Unit.INSTANCE);
        if (!(errorResult instanceof ErrorResult)) {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            ((SuccessResult) errorResult).getValue();
        } else {
            onEndCardError();
        }
    }

    private final void sendTrackingEvent(VastTrackingEventType eventType) {
        this.controller.sendTrackingEvent(eventType);
    }

    public final boolean isPlaying() {
        return this.playerState == PlayerState.PLAYING;
    }

    public final long getCurrentPlaybackPositionMillis() {
        try {
            PlayerState playerState = this.playerState;
            if (playerState == PlayerState.PLAYING || playerState == PlayerState.PAUSED) {
                return this.player.getCurrentPosition();
            }
            return -1L;
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
            return -1L;
        }
    }

    @Nullable
    public final int[] getSizeInPixels() {
        if (this.player.isDestroyed()) {
            return null;
        }
        return new int[]{this.player.getWidth(), this.player.getHeight()};
    }

    @Nullable
    public final int[] getSizeInDp() {
        int[] sizeInPixels = getSizeInPixels();
        if (sizeInPixels == null) {
            return null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        MediaUtilsKt.convertFromPixelsToDp(context, sizeInPixels);
        return sizeInPixels;
    }

    @Nullable
    public final Point getCurrentMediaFileSizeDp() {
        Integer width;
        VastMediaFile vastMediaFile = this.currentMediaFile;
        if (vastMediaFile == null || (width = vastMediaFile.getWidth()) == null) {
            return null;
        }
        int intValue = width.intValue();
        Integer height = vastMediaFile.getHeight();
        if (height != null) {
            return new Point(intValue, height.intValue());
        }
        return null;
    }

    public final boolean isDestroyed$mobilefuse_video_player_release() {
        return this.playerState == PlayerState.DESTROYED;
    }

    public final void destroy() {
        try {
            if (isDestroyed$mobilefuse_video_player_release()) {
                return;
            }
            changePlayerState(PlayerState.DESTROYED);
            destroyVideoPlayer();
            destroyEndCard();
            setFullscreenChangedListener(null);
            this.controller.destroy();
            this.renderingActivity = null;
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    private final void removePlayerUi() {
        try {
            stopVideoTimer();
            WebView webView = this.webView;
            if (webView != null) {
                if (webView.getParent() != null) {
                    ViewParent parent = webView.getParent();
                    if (parent == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                    ((ViewGroup) parent).removeView(this.webView);
                }
                webView.stopLoading();
                webView.destroy();
                this.webView = null;
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    private final void destroyVideoPlayer() {
        try {
            AdmClickInfoProvider admClickInfoProvider = this.admClickInfoProvider;
            if (admClickInfoProvider != null) {
                admClickInfoProvider.destroyProducer(null);
            }
            this.admClickInfoProvider = null;
            setMuteChangedListener(null);
            removePlayerUi();
            this.player.destroy();
            ViewParent parent = this.player.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.player);
            }
            final VideoSource videoSource = this.currentVideoSource;
            if (videoSource != null) {
                SchedulersKt.safelyRunOnBgThread$default(null, new Function0() { // from class: com.mobilefuse.videoplayer.VideoPlayer$destroyVideoPlayer$$inlined$let$lambda$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        VideoCache videoCache = VideoCache.INSTANCE;
                        Context context = this.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        videoCache.deleteCachedFile(context, SpecialsBridge.mobileFuseVideoSourceGetLocalFileCacheKey(VideoSource.this));
                    }
                }, 1, null);
            }
            this.currentVideoSource = null;
            this.currentMediaFile = null;
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    private final void destroyEndCard() {
        try {
            EndCardPresenter endCardPresenter = this.endCardPresenter;
            if (endCardPresenter != null) {
                endCardPresenter.destroy();
            }
            this.endCardPresenter = null;
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public final void resume() {
        try {
            if (this.player.getCanPlay() && Utils.isAttachedToWindow(this)) {
                this.player.play();
                startVideoTimer();
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public final void pause() {
        try {
            if (this.player.getCanPause()) {
                this.player.pause();
                this.pausedVideoPosition = this.player.getCurrentPosition();
                stopVideoTimer();
            }
        } catch (Exception e) {
            StabilityHelper.logException(this, e);
        }
    }

    public final void onActivityResume() {
        resume();
    }

    public final void onActivityPause() {
        pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCriticalAssetFailure() {
        this.playerHandler.post(new Runnable() { // from class: com.mobilefuse.videoplayer.VideoPlayer$handleCriticalAssetFailure$1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (VideoPlayer.this.isDestroyed$mobilefuse_video_player_release()) {
                        return;
                    }
                    DebuggingKt.logError$default(VideoPlayer.this, "asset loading failed - terminating ad to prevent incomplete rendering", null, null, 6, null);
                    VideoPlayer.this.getController().sendErrorEvent(VastError.GENERAL_PLAYBACK_FAILURE);
                    VideoPlayer.this.onVideoError();
                } catch (Throwable th) {
                    StabilityHelper.logException(VideoPlayer.this, th);
                }
            }
        });
    }
}
