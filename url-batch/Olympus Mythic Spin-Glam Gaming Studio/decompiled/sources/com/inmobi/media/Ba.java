package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoFile;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class Ba extends SuspendLambda implements Function2 {
    public final /* synthetic */ Ha a;
    public final /* synthetic */ HtmlVideoPlayerRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ba(Ha ha, HtmlVideoPlayerRequest htmlVideoPlayerRequest, Continuation continuation) {
        super(2, continuation);
        this.a = ha;
        this.b = htmlVideoPlayerRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Ba(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ba(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job launch$default;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a.a;
        HtmlVideoPlayerRequest obj2 = this.b;
        gestureDetectorOnGestureListenerC4476xi.getClass();
        Intrinsics.checkNotNullParameter(obj2, "requestConfig");
        InterfaceC4466x9 interfaceC4466x9 = gestureDetectorOnGestureListenerC4476xi.i;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).b("HtmlVideoPlayer", "loadVideoPlayer");
        }
        if (gestureDetectorOnGestureListenerC4476xi.getAdConfig().getHybridNative().getIsEnabled()) {
            String maxSupportedPlayerVersion = gestureDetectorOnGestureListenerC4476xi.getAdConfig().getHybridNative().getMaxSupportedPlayerVersion();
            Hi hi = gestureDetectorOnGestureListenerC4476xi.e0;
            try {
                AbstractC4322rn.a(maxSupportedPlayerVersion);
                gestureDetectorOnGestureListenerC4476xi.a1 = true;
                gestureDetectorOnGestureListenerC4476xi.Z0 = new D8(gestureDetectorOnGestureListenerC4476xi, gestureDetectorOnGestureListenerC4476xi.getAdConfig().getHybridNative(), obj2, gestureDetectorOnGestureListenerC4476xi.b1, gestureDetectorOnGestureListenerC4476xi.e0, gestureDetectorOnGestureListenerC4476xi.i);
                EnumC4465x8 enumC4465x8 = EnumC4465x8.i;
                Intrinsics.checkNotNullParameter(obj2, "obj");
                gestureDetectorOnGestureListenerC4476xi.a(enumC4465x8, AbstractC4494ya.a(obj2, HtmlVideoPlayerRequest.class));
                D8 d8 = gestureDetectorOnGestureListenerC4476xi.Z0;
                if (d8 != null) {
                    C4265pi videoLoadListener = new C4265pi(gestureDetectorOnGestureListenerC4476xi);
                    Intrinsics.checkNotNullParameter(videoLoadListener, "videoLoadListener");
                    if (!d8.g.get()) {
                        HtmlVideoPlayerRequest obj3 = d8.a;
                        Intrinsics.checkNotNullParameter(obj3, "obj");
                        String valueOf = String.valueOf(AbstractC4494ya.a(obj3, HtmlVideoPlayerRequest.class));
                        A8[] a8Arr = {A8.a};
                        EnumC4071i8[] enumC4071i8Arr = EnumC4071i8.a;
                        if (d8.a(a8Arr, "createVideoPlayer", valueOf, A8.b)) {
                            InterfaceC4466x9 interfaceC4466x92 = d8.c;
                            if (interfaceC4466x92 != null) {
                                ((C4493y9) interfaceC4466x92).b("HybridVideoPlayerHandler", "load called with video files");
                            }
                            d8.m = videoLoadListener;
                            if (d8.f == null) {
                                d8.f = FlowKt.launchIn(FlowKt.onEach(d8.k.C, new B8(d8, null)), d8.e);
                            }
                            V7 v7 = d8.k;
                            if (!v7.h.get()) {
                                v7.a(new C4149l8(v7.a));
                                if (v7.b() == Jg.a) {
                                    v7.l.set(Jg.b);
                                    v7.s.clear();
                                    v7.s.addAll(v7.a.getVideoFiles());
                                    List list = v7.s;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((HtmlVideoFile) it.next()).getUrl());
                                    }
                                    if (arrayList.isEmpty()) {
                                        v7.a(new C4123k8(Zm.e));
                                    } else {
                                        launch$default = BuildersKt__Builders_commonKt.launch$default(v7.c, null, null, new K7(v7, arrayList, null), 3, null);
                                        v7.v = launch$default;
                                    }
                                } else {
                                    v7.a(new C4123k8(Zm.f));
                                }
                            }
                        }
                    }
                }
                gestureDetectorOnGestureListenerC4476xi.getViewableAd();
            } catch (Ig e) {
                if (hi != null) {
                    hi.a(e.a);
                }
            }
            return Unit.INSTANCE;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMessage", "Hybrid video is not supported on this device.");
        EnumC4071i8[] enumC4071i8Arr2 = EnumC4071i8.a;
        jSONObject.put("jsCommand", "createVideoPlayer");
        gestureDetectorOnGestureListenerC4476xi.a(EnumC4465x8.e, jSONObject);
        InterfaceC4466x9 interfaceC4466x93 = gestureDetectorOnGestureListenerC4476xi.i;
        if (interfaceC4466x93 != null) {
            ((C4493y9) interfaceC4466x93).b("HtmlVideoPlayer", "Cannot play hybrid video");
        }
        return Unit.INSTANCE;
    }
}
