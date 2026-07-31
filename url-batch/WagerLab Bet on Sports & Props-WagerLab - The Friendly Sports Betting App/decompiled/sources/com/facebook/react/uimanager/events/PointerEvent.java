package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.util.Pools;
import com.facebook.appevents.internal.Constants;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.TouchTargetHelper;
import com.facebook.react.uimanager.events.Event;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PointerEvent.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002-.B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0017J\b\u0010\"\u001a\u00020\u0010H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0018\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0013H\u0002J\u0010\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0013H\u0002J\u0010\u0010)\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002J\b\u0010*\u001a\u00020\tH\u0016J\u0010\u0010+\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020,H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lcom/facebook/react/uimanager/events/PointerEvent;", "Lcom/facebook/react/uimanager/events/Event;", "<init>", "()V", "motionEvent", "Landroid/view/MotionEvent;", Constants.EVENT_NAME_EVENT_KEY, "", "coalescingKey", "", "pointersEventData", "", "Lcom/facebook/react/bridge/WritableMap;", "eventState", "Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;", "init", "", "eventName", "targetTag", "", "motionEventToCopy", "getEventName", "isClickEvent", "", "()Z", "dispatch", "rctEventEmitter", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "eventAnimationDriverMatchSpec", "Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;", "getEventAnimationDriverMatchSpec", "()Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;", "eventAnimationDriverMatchSpec$delegate", "Lkotlin/Lazy;", "onDispose", "createW3CPointerEvents", "addModifierKeyData", "pointerEvent", "modifierKeyMask", "createW3CPointerEvent", FirebaseAnalytics.Param.INDEX, "createPointersEventData", "getCoalescingKey", "dispatchModern", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "PointerEventState", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PointerEvent extends Event<PointerEvent> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Pools.SynchronizedPool<PointerEvent> EVENTS_POOL;
    private static final int POINTER_EVENTS_POOL_SIZE = 6;
    private static final String TAG;
    private static final short UNSET_COALESCING_KEY = -1;
    private String _eventName;
    private short coalescingKey;

    /* renamed from: eventAnimationDriverMatchSpec$delegate, reason: from kotlin metadata */
    private final Lazy eventAnimationDriverMatchSpec;
    private PointerEventState eventState;
    private MotionEvent motionEvent;
    private List<? extends WritableMap> pointersEventData;

    public /* synthetic */ PointerEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final PointerEvent obtain(String str, int i, PointerEventState pointerEventState, MotionEvent motionEvent) {
        return INSTANCE.obtain(str, i, pointerEventState, motionEvent);
    }

    @JvmStatic
    public static final PointerEvent obtain(String str, int i, PointerEventState pointerEventState, MotionEvent motionEvent, short s) {
        return INSTANCE.obtain(str, i, pointerEventState, motionEvent, s);
    }

    private PointerEvent() {
        this.coalescingKey = (short) -1;
        this.eventAnimationDriverMatchSpec = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.facebook.react.uimanager.events.PointerEvent$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Event.EventAnimationDriverMatchSpec eventAnimationDriverMatchSpec_delegate$lambda$1;
                eventAnimationDriverMatchSpec_delegate$lambda$1 = PointerEvent.eventAnimationDriverMatchSpec_delegate$lambda$1(PointerEvent.this);
                return eventAnimationDriverMatchSpec_delegate$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(String eventName, int targetTag, PointerEventState eventState, MotionEvent motionEventToCopy, short coalescingKey) {
        super.init(eventState.getSurfaceId(), targetTag, motionEventToCopy.getEventTime());
        this._eventName = eventName;
        this.motionEvent = MotionEvent.obtain(motionEventToCopy);
        this.coalescingKey = coalescingKey;
        this.eventState = eventState;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        String str = this._eventName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Constants.EVENT_NAME_EVENT_KEY);
        return null;
    }

    private final boolean isClickEvent() {
        String str = this._eventName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Constants.EVENT_NAME_EVENT_KEY);
            str = null;
        }
        return Intrinsics.areEqual(str, PointerEventHelper.CLICK);
    }

    @Override // com.facebook.react.uimanager.events.Event
    @Deprecated(message = "Prefer to override getEventData instead")
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        if (this.motionEvent == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvent has been recycled"));
            return;
        }
        if (this.pointersEventData == null) {
            this.pointersEventData = createPointersEventData();
        }
        List<? extends WritableMap> list = this.pointersEventData;
        if (list == null) {
            return;
        }
        boolean z = list.size() > 1;
        for (WritableMap writableMap : list) {
            if (z) {
                writableMap = writableMap.copy();
            }
            int viewTag = getViewTag();
            String str = this._eventName;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Constants.EVENT_NAME_EVENT_KEY);
                str = null;
            }
            rctEventEmitter.receiveEvent(viewTag, str, writableMap);
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public Event.EventAnimationDriverMatchSpec getEventAnimationDriverMatchSpec() {
        return (Event.EventAnimationDriverMatchSpec) this.eventAnimationDriverMatchSpec.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event.EventAnimationDriverMatchSpec eventAnimationDriverMatchSpec_delegate$lambda$1(final PointerEvent pointerEvent) {
        return new Event.EventAnimationDriverMatchSpec() { // from class: com.facebook.react.uimanager.events.PointerEvent$$ExternalSyntheticLambda0
            @Override // com.facebook.react.uimanager.events.Event.EventAnimationDriverMatchSpec
            public final boolean match(int i, String str) {
                boolean eventAnimationDriverMatchSpec_delegate$lambda$1$lambda$0;
                eventAnimationDriverMatchSpec_delegate$lambda$1$lambda$0 = PointerEvent.eventAnimationDriverMatchSpec_delegate$lambda$1$lambda$0(PointerEvent.this, i, str);
                return eventAnimationDriverMatchSpec_delegate$lambda$1$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean eventAnimationDriverMatchSpec_delegate$lambda$1$lambda$0(PointerEvent pointerEvent, int i, String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        String str = pointerEvent._eventName;
        PointerEventState pointerEventState = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Constants.EVENT_NAME_EVENT_KEY);
            str = null;
        }
        if (!Intrinsics.areEqual(eventName, str)) {
            return false;
        }
        if (!PointerEventHelper.isBubblingEvent(eventName)) {
            return pointerEvent.getViewTag() == i;
        }
        PointerEventState pointerEventState2 = pointerEvent.eventState;
        if (pointerEventState2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventState");
        } else {
            pointerEventState = pointerEventState2;
        }
        Iterator<TouchTargetHelper.ViewTarget> it = pointerEventState.getHitPathForActivePointer().iterator();
        while (it.hasNext()) {
            if (it.next().getViewId() == i) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.pointersEventData = null;
        MotionEvent motionEvent = this.motionEvent;
        this.motionEvent = null;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        try {
            EVENTS_POOL.release(this);
        } catch (IllegalStateException e) {
            ReactSoftExceptionLogger.logSoftException(TAG, e);
        }
    }

    private final List<WritableMap> createW3CPointerEvents() {
        ArrayList arrayList = new ArrayList();
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            arrayList.add(createW3CPointerEvent(i));
        }
        return arrayList;
    }

    private final void addModifierKeyData(WritableMap pointerEvent, int modifierKeyMask) {
        pointerEvent.putBoolean("ctrlKey", (modifierKeyMask & 4096) != 0);
        pointerEvent.putBoolean("shiftKey", (modifierKeyMask & 1) != 0);
        pointerEvent.putBoolean("altKey", (modifierKeyMask & 2) != 0);
        pointerEvent.putBoolean("metaKey", (modifierKeyMask & 65536) != 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r5 == r7.getPrimaryPointerId()) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final WritableMap createW3CPointerEvent(int index) {
        boolean z;
        PointerEventState pointerEventState;
        float[] fArr;
        String str;
        double pressure;
        WritableMap createMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(createMap, "createMap(...)");
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        int pointerId = motionEvent.getPointerId(index);
        createMap.putDouble("pointerId", pointerId);
        String w3CPointerType = PointerEventHelper.getW3CPointerType(motionEvent.getToolType(index));
        createMap.putString("pointerType", w3CPointerType);
        if (!isClickEvent()) {
            PointerEventState pointerEventState2 = this.eventState;
            if (pointerEventState2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventState");
                pointerEventState2 = null;
            }
            if (!pointerEventState2.supportsHover(pointerId)) {
                PointerEventState pointerEventState3 = this.eventState;
                if (pointerEventState3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventState");
                    pointerEventState3 = null;
                }
            }
            z = true;
            createMap.putBoolean("isPrimary", z);
            pointerEventState = this.eventState;
            if (pointerEventState == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventState");
                pointerEventState = null;
            }
            fArr = pointerEventState.getEventCoordinatesByPointerId().get(Integer.valueOf(pointerId));
            if (fArr != null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            float[] fArr2 = fArr;
            double dIPFromPixel = PixelUtil.toDIPFromPixel(fArr2[0]);
            double dIPFromPixel2 = PixelUtil.toDIPFromPixel(fArr2[1]);
            createMap.putDouble("clientX", dIPFromPixel);
            createMap.putDouble("clientY", dIPFromPixel2);
            PointerEventState pointerEventState4 = this.eventState;
            if (pointerEventState4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventState");
                pointerEventState4 = null;
            }
            float[] fArr3 = pointerEventState4.getScreenCoordinatesByPointerId().get(Integer.valueOf(pointerId));
            if (fArr3 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            float[] fArr4 = fArr3;
            double dIPFromPixel3 = PixelUtil.toDIPFromPixel(fArr4[0]);
            double dIPFromPixel4 = PixelUtil.toDIPFromPixel(fArr4[1]);
            createMap.putDouble("screenX", dIPFromPixel3);
            createMap.putDouble("screenY", dIPFromPixel4);
            createMap.putDouble("x", dIPFromPixel);
            createMap.putDouble("y", dIPFromPixel2);
            createMap.putDouble("pageX", dIPFromPixel);
            createMap.putDouble("pageY", dIPFromPixel2);
            PointerEventState pointerEventState5 = this.eventState;
            if (pointerEventState5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventState");
                pointerEventState5 = null;
            }
            float[] fArr5 = pointerEventState5.getOffsetByPointerId().get(Integer.valueOf(pointerId));
            if (fArr5 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            float[] fArr6 = fArr5;
            createMap.putDouble("offsetX", PixelUtil.toDIPFromPixel(fArr6[0]));
            createMap.putDouble("offsetY", PixelUtil.toDIPFromPixel(fArr6[1]));
            createMap.putInt(TypedValues.AttributesType.S_TARGET, getViewTag());
            createMap.putDouble("timestamp", getTimestampMs());
            createMap.putInt("detail", 0);
            createMap.putDouble("tiltX", 0.0d);
            createMap.putDouble("tiltY", 0.0d);
            createMap.putInt("twist", 0);
            if (Intrinsics.areEqual(w3CPointerType, PointerEventHelper.POINTER_TYPE_MOUSE) || isClickEvent()) {
                createMap.putDouble("width", 1.0d);
                createMap.putDouble("height", 1.0d);
            } else {
                double dIPFromPixel5 = PixelUtil.toDIPFromPixel(motionEvent.getTouchMajor(index));
                createMap.putDouble("width", dIPFromPixel5);
                createMap.putDouble("height", dIPFromPixel5);
            }
            int buttonState = motionEvent.getButtonState();
            PointerEventState pointerEventState6 = this.eventState;
            if (pointerEventState6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventState");
                pointerEventState6 = null;
            }
            createMap.putInt("button", PointerEventHelper.getButtonChange(w3CPointerType, pointerEventState6.getLastButtonState(), buttonState));
            String str2 = this._eventName;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Constants.EVENT_NAME_EVENT_KEY);
                str2 = null;
            }
            createMap.putInt("buttons", PointerEventHelper.getButtons(str2, w3CPointerType, buttonState));
            if (isClickEvent()) {
                pressure = 0.0d;
            } else {
                int i = createMap.getInt("buttons");
                String str3 = this._eventName;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Constants.EVENT_NAME_EVENT_KEY);
                    str = null;
                } else {
                    str = str3;
                }
                pressure = PointerEventHelper.getPressure(i, str);
            }
            createMap.putDouble("pressure", pressure);
            createMap.putDouble("tangentialPressure", 0.0d);
            addModifierKeyData(createMap, motionEvent.getMetaState());
            return createMap;
        }
        z = false;
        createMap.putBoolean("isPrimary", z);
        pointerEventState = this.eventState;
        if (pointerEventState == null) {
        }
        fArr = pointerEventState.getEventCoordinatesByPointerId().get(Integer.valueOf(pointerId));
        if (fArr != null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0079, code lost:
    
        return kotlin.collections.CollectionsKt.listOf(createW3CPointerEvent(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_CANCEL) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        return createW3CPointerEvents();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.CLICK) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_UP) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_OVER) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_MOVE) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_DOWN) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_LEAVE) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_ENTER) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_OUT) == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<WritableMap> createPointersEventData() {
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        int actionIndex = motionEvent.getActionIndex();
        String str = this._eventName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Constants.EVENT_NAME_EVENT_KEY);
            str = null;
        }
        switch (str.hashCode()) {
            case -1786514288:
                break;
            case -1780335505:
                break;
            case -1304584214:
                break;
            case -1304316135:
                break;
            case -1304250340:
                break;
            case -1065042973:
                break;
            case -992108237:
                break;
            case 383186882:
                break;
            case 1343400710:
                break;
            default:
                return null;
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.coalescingKey;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatchModern(RCTModernEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        if (this.motionEvent == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvent has been recycled"));
            return;
        }
        if (this.pointersEventData == null) {
            this.pointersEventData = createPointersEventData();
        }
        List<? extends WritableMap> list = this.pointersEventData;
        if (list == null) {
            return;
        }
        if (list == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        boolean z = list.size() > 1;
        for (WritableMap writableMap : list) {
            if (z) {
                writableMap = writableMap.copy();
            }
            WritableMap writableMap2 = writableMap;
            int surfaceId = getSurfaceId();
            int viewTag = getViewTag();
            String str = this._eventName;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Constants.EVENT_NAME_EVENT_KEY);
                str = null;
            }
            short s = this.coalescingKey;
            boolean z2 = s != -1;
            String str3 = this._eventName;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Constants.EVENT_NAME_EVENT_KEY);
            } else {
                str2 = str3;
            }
            rctEventEmitter.receiveEvent(surfaceId, viewTag, str, z2, s, writableMap2, PointerEventHelper.getEventCategory(str2));
        }
    }

    /* compiled from: PointerEvent.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u001e\u001a\u00020\u0003J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R#\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;", "", "primaryPointerId", "", "activePointerId", "lastButtonState", "surfaceId", "offsetByPointerId", "", "", "hitPathByPointerId", "", "Lcom/facebook/react/uimanager/TouchTargetHelper$ViewTarget;", "eventCoordinatesByPointerId", "screenCoordinatesByPointerId", "hoveringPointerIds", "", "<init>", "(IIIILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)V", "getPrimaryPointerId", "()I", "getActivePointerId", "getLastButtonState", "getOffsetByPointerId", "()Ljava/util/Map;", "getHitPathByPointerId", "getEventCoordinatesByPointerId", "getScreenCoordinatesByPointerId", "getHoveringPointerIds", "()Ljava/util/Set;", "getSurfaceId", "supportsHover", "", "pointerId", "hitPathForActivePointer", "getHitPathForActivePointer", "()Ljava/util/List;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PointerEventState {
        private final int activePointerId;
        private final Map<Integer, float[]> eventCoordinatesByPointerId;
        private final Map<Integer, List<TouchTargetHelper.ViewTarget>> hitPathByPointerId;
        private final Set<Integer> hoveringPointerIds;
        private final int lastButtonState;
        private final Map<Integer, float[]> offsetByPointerId;
        private final int primaryPointerId;
        private final Map<Integer, float[]> screenCoordinatesByPointerId;
        private final int surfaceId;

        /* JADX WARN: Multi-variable type inference failed */
        public PointerEventState(int i, int i2, int i3, int i4, Map<Integer, float[]> offsetByPointerId, Map<Integer, ? extends List<TouchTargetHelper.ViewTarget>> hitPathByPointerId, Map<Integer, float[]> eventCoordinatesByPointerId, Map<Integer, float[]> screenCoordinatesByPointerId, Set<Integer> hoveringPointerIds) {
            Intrinsics.checkNotNullParameter(offsetByPointerId, "offsetByPointerId");
            Intrinsics.checkNotNullParameter(hitPathByPointerId, "hitPathByPointerId");
            Intrinsics.checkNotNullParameter(eventCoordinatesByPointerId, "eventCoordinatesByPointerId");
            Intrinsics.checkNotNullParameter(screenCoordinatesByPointerId, "screenCoordinatesByPointerId");
            Intrinsics.checkNotNullParameter(hoveringPointerIds, "hoveringPointerIds");
            this.primaryPointerId = i;
            this.activePointerId = i2;
            this.lastButtonState = i3;
            this.surfaceId = i4;
            this.offsetByPointerId = offsetByPointerId;
            this.hitPathByPointerId = hitPathByPointerId;
            this.eventCoordinatesByPointerId = eventCoordinatesByPointerId;
            this.screenCoordinatesByPointerId = screenCoordinatesByPointerId;
            this.hoveringPointerIds = new HashSet(hoveringPointerIds);
        }

        public final int getPrimaryPointerId() {
            return this.primaryPointerId;
        }

        public final int getActivePointerId() {
            return this.activePointerId;
        }

        public final int getLastButtonState() {
            return this.lastButtonState;
        }

        public final Map<Integer, float[]> getOffsetByPointerId() {
            return this.offsetByPointerId;
        }

        public final Map<Integer, List<TouchTargetHelper.ViewTarget>> getHitPathByPointerId() {
            return this.hitPathByPointerId;
        }

        public final Map<Integer, float[]> getEventCoordinatesByPointerId() {
            return this.eventCoordinatesByPointerId;
        }

        public final Map<Integer, float[]> getScreenCoordinatesByPointerId() {
            return this.screenCoordinatesByPointerId;
        }

        public final Set<Integer> getHoveringPointerIds() {
            return this.hoveringPointerIds;
        }

        public final int getSurfaceId() {
            return this.surfaceId;
        }

        public final boolean supportsHover(int pointerId) {
            return this.hoveringPointerIds.contains(Integer.valueOf(pointerId));
        }

        public final List<TouchTargetHelper.ViewTarget> getHitPathForActivePointer() {
            List<TouchTargetHelper.ViewTarget> list = this.hitPathByPointerId.get(Integer.valueOf(this.activePointerId));
            if (list != null) {
                return list;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    /* compiled from: PointerEvent.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J2\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/uimanager/events/PointerEvent$Companion;", "", "<init>", "()V", "TAG", "", "POINTER_EVENTS_POOL_SIZE", "", "EVENTS_POOL", "Landroidx/core/util/Pools$SynchronizedPool;", "Lcom/facebook/react/uimanager/events/PointerEvent;", "UNSET_COALESCING_KEY", "", "obtain", "eventName", "targetTag", "eventState", "Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;", "motionEventToCopy", "Landroid/view/MotionEvent;", "coalescingKey", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PointerEvent obtain(String eventName, int targetTag, PointerEventState eventState, MotionEvent motionEventToCopy) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(eventState, "eventState");
            PointerEvent pointerEvent = (PointerEvent) PointerEvent.EVENTS_POOL.acquire();
            if (pointerEvent == null) {
                pointerEvent = new PointerEvent(null);
            }
            PointerEvent pointerEvent2 = pointerEvent;
            Object assertNotNull = Assertions.assertNotNull(motionEventToCopy);
            Intrinsics.checkNotNullExpressionValue(assertNotNull, "assertNotNull(...)");
            pointerEvent2.init(eventName, targetTag, eventState, (MotionEvent) assertNotNull, (short) 0);
            return pointerEvent2;
        }

        @JvmStatic
        public final PointerEvent obtain(String eventName, int targetTag, PointerEventState eventState, MotionEvent motionEventToCopy, short coalescingKey) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(eventState, "eventState");
            PointerEvent pointerEvent = (PointerEvent) PointerEvent.EVENTS_POOL.acquire();
            if (pointerEvent == null) {
                pointerEvent = new PointerEvent(null);
            }
            PointerEvent pointerEvent2 = pointerEvent;
            Object assertNotNull = Assertions.assertNotNull(motionEventToCopy);
            Intrinsics.checkNotNullExpressionValue(assertNotNull, "assertNotNull(...)");
            pointerEvent2.init(eventName, targetTag, eventState, (MotionEvent) assertNotNull, coalescingKey);
            return pointerEvent2;
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("PointerEvent", "getSimpleName(...)");
        TAG = "PointerEvent";
        EVENTS_POOL = new Pools.SynchronizedPool<>(6);
    }
}
