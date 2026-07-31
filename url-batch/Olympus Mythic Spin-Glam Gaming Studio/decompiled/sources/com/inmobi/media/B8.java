package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class B8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ D8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8(D8 d8, Continuation continuation) {
        super(2, continuation);
        this.b = d8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        B8 b8 = new B8(this.b, continuation);
        b8.a = obj;
        return b8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        B8 b8 = new B8(this.b, (Continuation) obj2);
        b8.a = (AbstractC4295qm) obj;
        return b8.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AbstractC4295qm mediaEvent = (AbstractC4295qm) this.a;
        this.b.a(mediaEvent);
        Hi hi = this.b.b;
        if (hi != null) {
            Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
            if (mediaEvent instanceof C4149l8) {
                HtmlVideoPlayerRequest htmlVideoPlayerRequest = ((C4149l8) mediaEvent).a;
                Map a = hi.a();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("videoUrls", htmlVideoPlayerRequest.getVideoFiles());
                jSONObject.put("autoplay", htmlVideoPlayerRequest.getConfig().getAutoplay());
                jSONObject.put("muted", htmlVideoPlayerRequest.getConfig().getMuted());
                a.put("payload", jSONObject.toString());
                C4425vk c4425vk = C4425vk.a;
                C4425vk.b("VideoLoadStarted", a, EnumC4530zk.a);
            } else if (mediaEvent instanceof C4229o8) {
                C4229o8 c4229o8 = (C4229o8) mediaEvent;
                Map a2 = hi.a();
                Long latency = c4229o8.a.getLatency();
                a2.put("latency", Long.valueOf(latency != null ? latency.longValue() : -1L));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(UnifiedMediationParams.KEY_VIDEO_URL, c4229o8.a.getVideoUrl());
                jSONObject2.put("cacheProgress", c4229o8.b);
                a2.put("payload", jSONObject2.toString());
                C4425vk c4425vk2 = C4425vk.a;
                C4425vk.b("VideoLoadSuccess", a2, EnumC4530zk.a);
            } else if (mediaEvent instanceof Jn) {
                Map a3 = hi.a();
                C4425vk c4425vk3 = C4425vk.a;
                C4425vk.b("VideoStart", a3, EnumC4530zk.a);
            } else if (mediaEvent instanceof Wm) {
                Map a4 = hi.a();
                C4425vk c4425vk4 = C4425vk.a;
                C4425vk.b("VideoFirstQuartile", a4, EnumC4530zk.a);
            } else if (mediaEvent instanceof Hn) {
                Map a5 = hi.a();
                C4425vk c4425vk5 = C4425vk.a;
                C4425vk.b("VideoSecondQuartile", a5, EnumC4530zk.a);
            } else if (mediaEvent instanceof Qn) {
                Map a6 = hi.a();
                C4425vk c4425vk6 = C4425vk.a;
                C4425vk.b("VideoThirdQuartile", a6, EnumC4530zk.a);
            } else if (mediaEvent instanceof C4243om) {
                Map a7 = hi.a();
                C4425vk c4425vk7 = C4425vk.a;
                C4425vk.b("VideoComplete", a7, EnumC4530zk.a);
            } else if (mediaEvent instanceof C4097j8) {
                C4097j8 c4097j8 = (C4097j8) mediaEvent;
                Map a8 = hi.a();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("videoUrls", c4097j8.a.getVideoFiles());
                a8.put("payload", jSONObject3.toString());
                a8.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(c4097j8.b));
                C4425vk c4425vk8 = C4425vk.a;
                C4425vk.b("VideoLoadFailure", a8, EnumC4530zk.a);
            }
        }
        return Unit.INSTANCE;
    }
}
